package bothellbirder;


/**
 *
 * @author Dimitar Dimitrov
 */
public class Bird {
    private String m_color;
    private String m_name;
    
    public String getName() {
        
        return m_name;
    }
    
    public void setName(String name) {
        m_name = name;
    }
    
    public String getColor() {
        
        return m_color;
    }
    
    public void setColor(String color) {
        m_color = color;
    }
    
    
    
//    public Bird() {
//        m_name = "";
//    }
//    
//    public Bird(String name) {
//        m_name = name;
//    }
//    
//    public String toString() {
//        return "Name: " + m_name;
//    }
}
