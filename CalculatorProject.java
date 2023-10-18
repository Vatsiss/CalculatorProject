package JAVA;

import java.util.Scanner;

public class CalculatorProject{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int number1;
    int number2;
    String opperator;
    char answer;   
    System.out.println("Welcome to the calculator");

    do{
        System.out.println("Give me the first number: ");
        number1= input.nextInt();
        System.out.println("Give me the second number: ");
        number2= input.nextInt();
        System.out.println("Choose one mathematical opperation");
        opperator = input.next();
        if(opperator.equals("+")){
                System.out.println(number1 + number2);
            }
            else if(opperator.equals("-")){
                System.out.println(number1 - number2);
            }
            else if(opperator.equals("*")){
                System.out.println(number1 * number2);
            }
            else if(opperator.equals("/")){
                System.out.println(number1 / number2);
            }
            else{ 
                input.close();
                System.out.println("Invalid input");
                
            }
            System.out.println("Do you want to continue? (y/n)");
            answer= input.next().charAt(0);

         }while( answer == 'y' );
            
        
    }

}