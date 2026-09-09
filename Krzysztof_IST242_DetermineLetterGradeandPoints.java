import java.util.Scanner;
public class Krzysztof_IST242_DetermineLetterGradeandPoints {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double grade, gradepoint;
        int origValue = 1;
        while (origValue != 0){
            System.out.print("Enter your grade from 0-100 (enter \"0\" to exit): ");
            grade = scn.nextDouble();
            origValue = (int)grade;
            if(origValue == 0){
                break;
            }
            if ((0<=grade) && (grade<=100)){
                System.err.println("Your grade is not in the range of 0-100 please enter it again: ");
                grade = scn.nextDouble();
            }
            if(grade>=93){
                //A
                gradepoint = 3*4;
                System.out.println("Your inital gade: ("+ grade + ") the letter Grade you got was: (A) and the grade points earned is: ("+gradepoint +")" );
            }else if((grade<93)&&(grade>=90)){
                //A-
                gradepoint = 3*3.67;
                System.out.println("Your inital gade: ("+ grade + ") the letter Grade you got was: (A-) and the grade points earned is: ("+gradepoint +")" );
            }else if((grade<90)&&(grade>=87)){
                //B+
                gradepoint = 3*3.33;
                System.out.println("Your inital gade: ("+ grade + ") the letter Grade you got was: (B+) and the grade points earned is: ("+gradepoint +")" );
            }else if((grade<87)&&(grade>=84)){
                //B
                gradepoint = 3*3;
                System.out.println("Your inital gade: ("+ grade + ") the letter Grade you got was: (B) and the grade points earned is: ("+gradepoint +")" );
            }else if((grade<84)&&(grade>=80)){
                //B-
                gradepoint = 3*2.67;
                System.out.println("Your inital gade: ("+ grade + ") the letter Grade you got was: (B-) and the grade points earned is: ("+gradepoint +")" );
            }else if((grade<80)&&(grade>=77)){
                //c+
                gradepoint = 3*2.33;
                System.out.println("Your inital gade: ("+ grade + ") the letter Grade you got was: (C+) and the grade points earned is: ("+gradepoint +")" );
            }else if((grade<77)&&(grade>=70)){
                //C
                gradepoint = 3*2;
                System.out.println("Your inital gade: ("+ grade + ") the letter Grade you got was: (C) and the grade points earned is: ("+gradepoint +")" );
            }else if((grade<70)&&(grade>=60)){
                //C-
                gradepoint = 3*1;
                System.out.println("Your inital gade: ("+ grade + ") the letter Grade you got was: (C-) and the grade points earned is: ("+gradepoint +")" );
            }
            
        }
    }
}
