package SwitchIntro;

import java.util.*;

public class SwitchIntro {

    public static void main(String[] args) {
       
        String inputLetterGradeAsString="";
        char letterGrade;
        Scanner console = new Scanner(System.in);
        System.out.println("What is your letter grade?");
        inputLetterGradeAsString=console.next();
        letterGrade=inputLetterGradeAsString.charAt(0);
        switch(letterGrade){
            case 'a':
            case 'A':
                System.out.println("Excellent");
                break;
            case 'b':
            case 'B':
                System.out.println("Very Good");
                break;
            case 'c':
            case 'C':
                System.out.println("Acceptable");
                break;
            case 'd':
            case 'D':
                System.out.println("Needs Improvement");
                break;
            default:
                System.out.println("No Credit");
        }//end switch
       
        System.out.println("What is your numerical grade");
        int numGrade=console.nextInt();
        switch(numGrade/10){
            case 9:
                System.out.println("Excellent");
                break;
            case 8:
                System.out.println("Very Good");
                break;
            case 7:
                System.out.println("Acceptable");
                break;
            case 6:
                System.out.println("Needs Improvement");
                break;
            default:
                System.out.println("No Credit");
               
        }
    }//end main
}//end class

/*
run:
What is your letter grade?
c
Acceptable
What is your numerical grade
77
Acceptable
BUILD SUCCESSFUL (total time: 4 seconds)
*/
