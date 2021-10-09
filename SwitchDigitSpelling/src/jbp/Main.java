package jbp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int digit;

        System.out.print("Please enter a single digit : ");
        digit=input.nextInt();

       switch (digit){
            case 0:
                System.out.println("Your Enter Value is: Zero");
                break;
            case 1:
                System.out.println("Your Enter Value is: One");
                break;
            case 2:
                System.out.println("Your Enter Value is: Two");
                break;

            case 3:
                System.out.println("Your Enter Value is: Three");
                break;
            case 4:
                System.out.println("Your Enter Value is: Four");
                break;
            case 5:
                System.out.println("Your Enter Value is: Five");
                break;
            case 6:
                System.out.println("Your Enter Value is: Six");
                break;
            case 7:
                System.out.println("Your Enter Value is: Seven");
                break;
            case 8:
                System.out.println("Your Enter Value is: Eight");
                break;
            case 9:
                System.out.println("Your Enter Value is: Nine");
                break;
            default:
                System.out.println("Not a Single Digit");
        }
      /* for(int i=1; i<=digit; i=i+2){
            if(i==7){
                continue;
            }
            if(i>10){
                break;
            }
            System.out.println(i);
        }*/


	// write your code here
    }
}
