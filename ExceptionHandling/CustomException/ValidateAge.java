package ExceptionHandling.CustomException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidateAge
{
    public static void ageValidity(int age) throws AgeLessThanZeroException
    {
        if(age < 0) {
            throw new AgeLessThanZeroException();
        }
    }

    public static void main(String[] args) throws AgeLessThanZeroException, InputMismatchException
    {
        Scanner sc = new Scanner(System.in);
        try {
            int age = sc.nextInt();
            ageValidity(age);
            System.out.println("The input age- " + age + " is Valid.");
        } catch(AgeLessThanZeroException e1) {
            System.out.println("Age can't be negative! STUPID!");
        } catch(InputMismatchException e2) {
            System.out.println("Please enter an integer! OMG!");
        }
        sc.close();
    }
}
