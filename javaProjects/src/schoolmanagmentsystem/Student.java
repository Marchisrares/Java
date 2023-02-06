package schoolmanagmentsystem;

/*this class is responsible for keeping track of students
feeds, names,ids, grade, fees paid*/


public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    //Constructor
    public  Student(int id,String name,int grade){
        this.feesTotal =30000;
        this.feesPaid=0;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

    //not going to alter student's name or id.
    public void setGrade(int grade){
        this.grade = grade;
    }


    /**
     * keep adding the fees to feesPaid field.
     * Add the fees to the fees paid.
     * the school is going to receive the funds.
     * @param fees the fees that the student pays
     */
    public void payFees(int fees){
        feesPaid +=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    //Returning everything with get
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int  getGrade(){
        return grade;
    }
    public int  getFeesPaid(){
        return feesPaid;
    }

    public int getFeesTotal(){
        return feesTotal;
    }

    public int getRainingFees(){
       return feesTotal-feesPaid;
    }
}
