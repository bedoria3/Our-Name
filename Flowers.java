public class Flowers {
  private String name;
  private String family;
  private String healingProperties;
  private String botanicalName;

  
// Getter
  public String getName() {
    return name;
  }
  
  public String getFamily() {
    return family;
  }
  
  public String getHealingProperties() {
    return healingProperties;
  }
  public String getBotanicalName() {
    return botanicalName;
  }
  
  // Setter
  public void setName(String aa) {
    this.name = aa;
  }
  public void setFamily(String bb) {
    this.family = bb;
  }
  public void setHealingProperties(String cc) {
    this.healingProperties = cc;
  }
  public void setBotanicalName(String dd) {
    this.botanicalName = dd;
  }
  
// Overloading
    
     // field and method of the parent class
String mainGroup;
  public void roots() {
    System.out.println("Monocot have fibrous root system.");
  }
  
    public void leaf(String s) {
        System.out.println("Monocot have " + s);
    }
}