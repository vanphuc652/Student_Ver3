package Student;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person {
    private String department;
    private String teachingSubject;

    public Teacher(String id, String fullName, Date dateOfBirth, String department, String teachingSubject) {
        super(id, fullName, dateOfBirth);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    public void addTeacher() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        setId(id);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        setFullName(name);
        System.out.print("Enter Department: ");
        String department = sc.nextLine();
        setDepartment(department);
        System.out.print("Enter Teaching Subject: ");
        String teachingSubject = sc.nextLine();
        setTeachingSubject(teachingSubject);
        System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
        String dobString = sc.nextLine();
        setDateOfBirth(parseDate(dobString));
    }

    public void updateTeacher() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Update Name: ");
        String name = sc.nextLine();
        setFullName(name);
        System.out.print("Update Department: ");
        String department = sc.nextLine();
        setDepartment(department);
        System.out.print("Update Teaching Subject: ");
        String teachingSubject = sc.nextLine();
        setTeachingSubject(teachingSubject);
        System.out.print("Update Date of Birth (dd/MM/yyyy): ");
        String dobString = sc.nextLine();
        setDateOfBirth(parseDate(dobString));
        System.out.println("Teacher updated successfully.");
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Teacher Information:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getFullName());
        System.out.println("Department: " + getDepartment());
        System.out.println("Teaching Subject: " + getTeachingSubject());
        System.out.println("Date of Birth: " + sdf.format(getDateOfBirth()));
    }

    private Date parseDate(String dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return sdf.parse(dateString);
        } catch (Exception e) {
            System.out.println("Wrong format. Using current date.");
            return new Date();
        }
    }
}