package Task_LA_06;

// TASK 03
public class LightController 
{
     public String status = "OFF";
     public int lvl;
     
     public void showLightStatus() {
          System.out.println("Light status: " + status);
          System.out.println("Brightness Level: " + lvl);
     }
     
     public void adjustBrightness(int lvl) {
          if (status.equals("OFF")) {
               System.out.println("Please turn on the light first!");
          } else if((this.lvl + lvl) >= 0 && (this.lvl + lvl) <= 10) {
               this.lvl += lvl;
               System.out.println("Brightness adjusted.");
          } else {
               System.out.println("Brightness out of range. Set between 0 to 10.");
          }
     }
     
     public void switchLight() {
          if(status.equals("OFF")) {
               status = "ON";
               lvl = 1;
               System.out.println("Lights are now ON.");
          } else {
               status = "OFF";
               lvl = 0;
               System.out.println("Lights are now OFF.");
          }
     }
     
     public String resetSettings() {
          lvl = 1;
          return "Light settings have been reset.";
     }
}