package bothellbirder;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.File;
import java.util.ArrayList;

/**
 * @author Dimitar Dimitrov
 */
public class Search {
    
    private String m_SearchStr;
    private ArrayList<Bird> m_birds = new ArrayList<Bird>();
    private String m_criteria;
    
    public Search(String str, String criteria) {
        m_SearchStr = str;
        m_criteria = criteria;
    }
    
    public void parse() {
        boolean addBird = false;
      
        try {
            JsonFactory f = new JsonFactory();
            JsonParser jp = f.createJsonParser(new File("birds.json"));    
            jp.nextToken(); // returns the Start Object
            while(jp.nextToken() != JsonToken.END_ARRAY || jp.nextTextValue().equals("]")) {  
                Bird bird = new Bird();
               
                 while(!jp.getText().equals("name"))
                     jp.nextToken();
                 
                //if we are at the name field, get the value
                if("name".equals(jp.getCurrentName())) {
                   jp.nextToken();
                   bird.setName(jp.getText());
                }
                
                jp.nextToken(); // move to the next field NOT value
                
                if("color".equals(jp.getCurrentName())) {
                   jp.nextToken(); // move to value
                   bird.setColor(jp.getText()); 
                }
                
                jp.nextToken();
                
                if("weight".equals(jp.getCurrentName())) {
                   jp.nextToken(); // move to value
                   bird.setWeight(jp.getText()); 
                }
                
                jp.nextToken();
                
                if("info".equals(jp.getCurrentName())) {
                   jp.nextToken(); // move to value
                   bird.setInfo(jp.getText()); 
                }
                
                switch(m_criteria) {
                    case "name" :
                        if(bird.getName().equalsIgnoreCase(m_SearchStr))
                            addBird = true;
                        break;
                    case "color" :
                        if(bird.getColor().equalsIgnoreCase(m_SearchStr))
                            addBird = true;
                        break;
                    case "weight" :
                        if(bird.getWeight().equalsIgnoreCase(m_SearchStr))
                            addBird = true;
                        break;
                    default: // when this bird don't match the criteria break out of the switch
                        break;
                }
                
               if(addBird) { // add the matching bird
                  m_birds.add(bird);
                  addBird = false;
               } 
            }   
           jp.close(); // close the parser stream
        }
        catch(Exception e) {
          System.err.print(" Error: " + e);
        }        
    }    
    
    public ArrayList<Bird> readData() { 
        parse();
        return m_birds;
    }
}
