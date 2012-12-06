package bothellbirder;


/**
 *
 * @author Dimitar Dimitrov
 */
public class Bird {
    private String m_color;
    private String m_name;
    private String m_weight;
    private String m_info;
       
    public Bird() {
        m_name = "";
        m_color = "";
        m_weight = "";
        m_info = "";
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
    
    public String getInfo() {
        return m_info;
    }
    
    public void setInfo(String info) {
        m_info = info;
    }
    
    @Override
        public String toString() {
        return "Name: " + m_name + "\nColor: " + m_color +
                "\nWeight: " + m_weight + "grams" + "\nInfo: " + m_info;
    } 
}
