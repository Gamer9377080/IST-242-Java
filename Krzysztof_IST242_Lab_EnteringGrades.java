import java.util.Scanner;
public class Krzysztof_IST242_Lab_EnteringGrades {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double grade, gradeavg, gradetotal =0;
        int origValue = 1, count = 0, minGrade =100, maxGrade = 0;
        while (origValue != 0){
            System.out.print("Enter your test score from 0-100 (enter \"-1\" to finish entering grades): ");
            grade = scn.nextDouble();
            origValue = (int)grade;
            if(origValue == -1){
                gradeavg = gradetotal / count;
                System.out.println("The number of grades entered is: " + count);
                System.out.println("The average of your grades is: " + gradeavg);
                System.out.println("The minimum grade is: " + minGrade);
                System.out.println("The maximum grade is: " + maxGrade);
                break;
            }
            if ((0>(int)grade) || ((int)grade>100)){
                System.out.println("Your grade is not in the range of 0-100 please enter it again: ");
                grade = scn.nextDouble();
            }
            if((grade<minGrade) && (grade>=0)){
                minGrade = (int)grade;
            }
            if((grade>maxGrade) && (grade<=100)){
                maxGrade = (int)grade;
            }
            gradetotal += grade;
            count++;
        
        }
    }
}