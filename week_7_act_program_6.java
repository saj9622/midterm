// OOP- LAB ACTIVITY – MIDTERM
// Program : 6
// A University wishes to keep information on its students. The proposed Student class has the following
// instance variables:
// studentNo: String
// studentName: String
// dateOfBirth: Date
// tariffPoints: Integer
// Tariff Points represents the entry qualification achieved by a student, which is a number between 20 and
// 280.
// A class variable is also required, called noOfStudents, which will be incremented each time a Student
// instance is created.
// Using an object oriented programming language that you are familiar with, write code to perform the
// following, where appropriate include suitable integrity checks:
// a) Show the declaration of the Student class, including any setter and getter methods.
// b) Declare two constructors as follows; both constructors should increment the class variable
// appropriately:
// • The first is a default constructor that has no parameters and sets the instance variables to
// either "not known" for the strings, 20 for the integer and 1st January 1995 for the date (assume
// there is a Date constructor that accepts dates in a string format).
// • The second takes 4 parameters, one for each of the instance variables.
// c)Show how both constructors could be used to instantiate an object.

// OOPR211
// ZAPANTA, JOHN LLOYD B.
// BSCS 2-Y1-1

class Student {
    public static int noOfStudents = 0;

    private String studentNo;
    private String studentName;
    private String dateOfBirth;
    private int tariffPoints;

    public Student() {
        this.studentNo = "not known";
        this.studentName = "not known";
        this.dateOfBirth = "1st January 1995";
        this.tariffPoints = 20;
        
    }

    public Student(String studentNo, String studentName, String dateOfBirth, int tariffPoints) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.dateOfBirth = dateOfBirth;
        
        if (tariffPoints >= 20 && tariffPoints <= 280) {
            this.tariffPoints = tariffPoints;
        } else {
            this.tariffPoints = 20;
        }
        
        noOfStudents++;
    }

    public String getStudentNo() { return studentNo; }
    public void setStudentNo(String studentNo) { this.studentNo = studentNo; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public String getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public int getTariffPoints() { return tariffPoints; }
    public void setTariffPoints(int tariffPoints) {

        if (tariffPoints >= 20 && tariffPoints <= 280) {
            this.tariffPoints = tariffPoints;
        }
    }
}

public class week_7_act_program_6 {
    public static void main(String[] args) {
        
        Student student1 = new Student();
        
        Student student2 = new Student("STU992", "Alice Smith", "15/05/2004", 240);
        
        System.out.println("Student 1 Name: " + student1.getStudentName());
        System.out.println("Student 2 Name: " + student2.getStudentName());
        System.out.println("Total Students: " + Student.noOfStudents);
    }
}
