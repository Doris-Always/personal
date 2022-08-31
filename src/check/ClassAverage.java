package check;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int total = 0;
//        int gradeCounter = 1;
//
//        while (gradeCounter<=10){
//            System.out.println("Enter students grade: ");
//            int grade = input.nextInt();
//            total = grade + total;
//            gradeCounter = gradeCounter + 1;
//        }
//
//        int average = total / 10;
//
//        System.out.printf("Total is %d%n", total);
//        System.out.printf("Average grade is %d%n",average);
//          a program that checks number of passes to determine bonus for an instructor.
//        int passes = 0;
//        int failure = 0;
//        int studentCounter = 1;
//
//        while (studentCounter <= 10){
//
//            System.out.print("Enter students result(1 if pass & 2 if failed): ");
//            int result = input.nextInt();
//
//            if (result == 1){
//                passes = passes + 1;
//            } else if (result ==2) {
//                failure = failure + 1;
//
//            }
//
//            studentCounter = studentCounter + 1;
//        }
//
//        System.out.printf("passed: %d%n Failed: %d%n",passes,failure);
//
//        if(passes > 8){
//            System.out.println("bonus to the instructor! ");
//        }
//
//
//

        int c = 5;
//        System.out.printf("c before postincrement %d%n" , c);
//        System.out.printf("c  postincrementing %d%n" , c++);
//        System.out.printf("c after postincrement %d%n" , c);

        System.out.printf("c before preincrement %d%n" , c);
        System.out.printf("c  preincrementing %d%n" , ++c);
        System.out.printf("c after preincrement %d%n" , c);
    }

}
