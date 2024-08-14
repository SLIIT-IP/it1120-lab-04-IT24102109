import java.util.Scanner;

public class IT24102109Lab4Q1{

       public static void main(String[] args){

             int number;
             String message;
              
             Scanner sc = new Scanner(System.in);
            

             System.out.print(" Enter a number: ");
             number = sc.nextInt();

             if(number>0){
                  message = "Positive";
                  System.out.println("The number is: " + message);
             }
             else if(number==0){
                  message = "0";
                  System.out.println("The number is: " + message);
             }
             else if(number<0){
                  message = "Negative";
                  System.out.println("The number is: " + message);
             }
                         

       }

} 