package schoolmanagmentsystem;

/**
 * This class is responsible for keeping the track of teacher's id name and salary.
 *
 */

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;
    /**
     * Creates a new Teacher object.
     * @param id for the teacher.
     * @param name of the teacher.
     * @param salary of the teacher.
     */
    public Teacher(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned = 0;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    /**
     * set the salary.
     * @param salary
     */
    public void setSalary(int salary){

        this.salary=salary;
    }

    /**
     * adds to the salary earned
     * removes from the total money earned by the school.
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }


}

