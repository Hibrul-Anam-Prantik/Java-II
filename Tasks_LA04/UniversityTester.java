package Tasks_LA04;
// Design 



public class UniversityTester 
{
    public static void main(String[] args)
  {
    University uni1 = new University();
    University uni2 = new University();
    System.out.println(uni1);
    System.out.println(uni1);
    System.out.println(uni1.name);
    System.out.println(uni2.name); 
    // as we print, see can see that the locations are not same
    uni1.name = "Imperial College London";
    uni1.country = "England";
    uni2.name = "Brac University";
    uni2.country = "Bangladesh";
    System.out.println(uni1.name);
    System.out.println(uni1.country);
    System.out.println(uni2.name);
    System.out.println(uni2.country);
    System.out.println("Same Names: " + uni1.name.equals(uni2.name));  // falase;
    System.out.println("Same Countries: " + uni1.country.equals(uni2.country));  // false
    // as we run and see the output; the instance variables of both objects have changed, and  the instance variables of both objects are not of the same value
  }    
}
