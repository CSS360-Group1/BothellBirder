package bothellbirder;


/**
 *
 * @author Dimitar Dimitrov
 */
public class Bird {
    private String m_color;
    private String m_name;
    private String m_weight;
    
    
    public Bird() {
        m_name = "";
    }
    
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
    
    public String getWeight() {
        return m_weight;
    }
    
    public void setWeight(String weight) {
        m_weight = weight;
    }
    
    @Override
        public String toString() {
        return "Name: " + m_name + ", Color: " + m_color + ", Weight: " + m_weight + "\n";
    } 
}
