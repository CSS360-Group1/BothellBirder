package bothellbirder;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.File;
import javax.swing.JOptionPane;

/**
 * @author Dimitar Dimitrov
 */
public class Search {
    
    private String m_SearchStr;
    private String m_OutputStr;
    
    public Search(String str) {
        m_SearchStr = str;
        m_OutputStr = "";
    }
    
    public void parse() {
        boolean birdFound = false;
        try {
            JsonFactory f = new JsonFactory();
            JsonParser jp = f.createJsonParser(new File("src/bothellbirder/birds.json"));    
            jp.nextToken(); // returns the Start Object
             
            while(jp.nextToken() != JsonToken.END_ARRAY) {     
                 String fieldName = jp.getCurrentName();
             
                //if we are at the name field, print the Value
                if("name".equals(fieldName)) {
                   jp.nextToken(); // move to value

                   //if we've found the bird stop searching.
                   if(jp.getText().equalsIgnoreCase(m_SearchStr)) {
                        m_OutputStr += "Name:  " + jp.getText() + "\n"; 
                        birdFound = true;
                        break;
                   }
                }
            }
            // Later we'll develope our own Exception class to handle all errors.
            if(!birdFound)
               JOptionPane.showMessageDialog(null, "Wrong input!",
                                         "Input Error", JOptionPane.ERROR_MESSAGE);
                
           jp.close(); // close the parser stream
        }
        catch(Exception e) {
            System.err.print(e);
        }        
    }
    
    public String toString() {
        parse();
        return m_OutputStr;
    }  
    
    public String getSearch(){
        return m_SearchStr;
    }
}
