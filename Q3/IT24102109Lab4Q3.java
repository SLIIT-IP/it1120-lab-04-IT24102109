import java.util.Scanner;

public class IT24102109Lab4Q3{

          public static void main(String[] args){

             int number;
             String message;
    
             Scanner sc = new Scanner(System.in);

             System.out.print("Enter a number: ");
             number = sc.nextInt();

             if (number==0){
                  message = "0";
                  System.out.println("The number is: " + message);

             }
             else{
                  
                  message = (number > 0 )? "Positive":"Negative";
                  System.out.println("The number is: " + message);

             }

          }

}