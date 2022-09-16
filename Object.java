
public class Object{
  public static void main(String[] args) {
    Flowers myObj = new Flowers();
    myObj.setName("Jasmine");
    myObj.setFamily("Jasminum");
    myObj.setHealingProperties("Natural Relaxation");
    myObj.setBotanicalName("Oleaceae");
    
    System.out.println("We choose "+ myObj.getName() +" flower.");
    System.out.println("Jasmine belongs to "+ myObj.getFamily()+"family.");
    System.out.println("Its healing properties is to give "+ myObj.getHealingProperties()+".");
    System.out.println("And lastly, its botanical name is "+ myObj.getBotanicalName()+".");


//object of the subclass Lily
    Lily angiosperms = new Lily();
// access field of superclass
    angiosperms.mainGroup = "Monocot.";
    angiosperms.display();

// call method of superclass
// using object of subclass
    angiosperms.roots();
// Overloading
    myObj.leaf("parallel veins.");    
   }
}
  


           
