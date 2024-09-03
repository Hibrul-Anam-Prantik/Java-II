package Task_LA_06;

// TASK 04
public class ChickenBurger 
{
     public String bun = "Sesame";
     public int price = 200;
     public String sauceOption = "Less";
     public String spiceLevel = "Not Set";

     public String serveBurger() {
          if (spiceLevel.equals("Not Set")) {
               return "Cannot serve now. Customize Spice Level first.";
          } else {
               System.out.println("The burger is being served:-");
               System.out.println("Bun Type: " + bun);
               System.out.println("Price: " + price);
               System.out.println("Sauce Option: " + sauceOption);
               return "Spice Level: " + spiceLevel;
          }
     }

     public void customizeSpiceLevel(String spiceLevel) {
          if (spiceLevel.equals("Extreme Jhaal")) {
               System.out.println("This spice level is unavailable.");
          } else {
               this.spiceLevel = spiceLevel;
               System.out.println("Spice level set to " + spiceLevel + ".");
          }
     }
}