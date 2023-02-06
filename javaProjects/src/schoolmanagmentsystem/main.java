package schoolmanagmentsystem;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher ramon = new Teacher(2,"Ramon",700);
        Teacher rares = new Teacher(3,"Rares",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(ramon);
        teacherList.add(rares);

        Student mark = new Student(1,"Mark",4);
        Student marchis = new Student(2,"Marchis",5);
        Student rabibi = new Student(3,"Rabibi",6);

        List<Student> studentList = new ArrayList<>();
        studentList.add(mark);
        studentList.add(marchis);
        studentList.add(rabibi);

        School ghs = new School(teacherList,studentList);

        mark.payFees(5000);
        marchis.payFees(6000);
        System.out.println("ghs has earned $"+ghs.getTotalMoneyEarned());

        System.out.println("making school pay salary");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("ghs has spent for salary to"+lizzy.getName()+" and now has "+ghs.getTotalMoneyEarned());
    }
}
