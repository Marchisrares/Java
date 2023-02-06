package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance=0;
    // we make the cost of Course static because it's something that will be the same for every new student
    private static int costOfCourse = 600;
    private static int id = 1000;
    // Constructor: prompt user to enter name and year
    public Student(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter students first name: ");
        this.firstName = scan.nextLine();

        System.out.print("Enter students last name: ");
        this.lastName = scan.nextLine();

        System.out.print("1 - Freshmen\n2 - for Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = scan.nextInt();

        setStudentID();

    }
    // Generate an ID
    private void setStudentID(){
        // Grade level + ID
        id++;
        this.studentID =  gradeYear + ""+ id;
    }
    //Enroll in courses
    public void enroll(){
        // Get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner scan = new Scanner(System.in);
            String course = scan.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else{
                break;
                }
        }while (1 != 0);
    }
    // view balance
    public void viewBalance(){
        System.out.println("Your balance is: "+tuitionBalance);
    }
    // Pay Tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your Payment: ");
        Scanner scan = new Scanner(System.in);
        int payment = scan.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of: "+payment);
        viewBalance();
    }
    //Show status
    public String toString(){
        return "Name: "+firstName + " "+lastName +
                "\nGrade level: "+gradeYear+
                "\nStudent ID: "+studentID+
                "\nCourses Enrolled:"+courses+
                "\nBalance: "+tuitionBalance;
    }
}
