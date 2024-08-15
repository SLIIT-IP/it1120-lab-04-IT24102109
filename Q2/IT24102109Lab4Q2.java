import java.util.Scanner;

public class IT24102109Lab4Q2{
     public static void main(String[] args){

               int exam_check, lab_check, exampercent_check, labpercent_check;
               double exam_markpart, lab_markpart, exam_mark, lab_mark, total;

               Scanner sc = new Scanner(System.in);

               System.out.print("Please enter exam marks (out of 100): ");
               exam_check = sc.nextInt();

               if (exam_check >100 || exam_check <0){
                 System.out.println("Invalid input for exam marks. Terminating program");
               }
               else{ 
                      
                      System.out.print("Please enter lab submission marks (out of 100): ");
                      lab_check = sc.nextInt(); 

                      if (lab_check > 100 || lab_check < 0){
                               System.out.println("Invalid input for lab marks. Terminating program"); 
                      }
                      else{

                              System.out.print("Please enter the percentage given for the exam: ");
                              exampercent_check = sc.nextInt();

                              System.out.print("Please enter the percentage given for the lab submission: ");
                              labpercent_check = sc.nextInt();

                              if ( labpercent_check + exampercent_check != 100){ 
                                         System.out.println("The percentages must add up to 100. Terminating program.");
                              }
                              else{
                              
                                          exam_mark = (double)exam_check;
                                          lab_mark = (double)lab_check;

                                          exam_markpart = (exam_mark/100)*50;
                                          lab_markpart = (lab_mark/100)*50;

                                          total = exam_markpart + lab_markpart;

                                          System.out.println(" ");
                                          System.out.println("Final exam mark is: " + total);
                              }
                     
                      }

               }

     }

}
   


