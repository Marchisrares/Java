package studentdatabaseapp;

import java.util.Scanner;

public class StudentDataBaseApp {

    public static void main(String[] args){
        // ask how many students we want to add
        System.out.print("Enter number of new student to enroll: ");
        Scanner scan = new Scanner(System.in);
        int numOfStudents = scan.nextInt();
        Student[] students = new Student[numOfStudents];

        // create n number of new students
        for(int n=0;n<numOfStudents;n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }
        for(int n=0;n<numOfStudents;n++){
            System.out.println(students[n].toString());
        }
    }
}
