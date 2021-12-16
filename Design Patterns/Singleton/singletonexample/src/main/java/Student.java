/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arosha
 */
public class Student {
    public static Student obj;
    public int sid;
    public String sname;
    public double cgpa;
    
    private Student(){
        System.out.println("Instance Created");
    }
    
    public static Student getInstance(){
        if(obj == null){
            synchronized (Student.class) {
                if(obj == null){
                    obj = new Student();
                }
            }
        }
        return obj;
    }
    
    public void setStudentDetails(int sid, String sname, double cgpa){
        this.sid = sid;
        this.sname = sname;
        this.cgpa = cgpa;
    }
    
    public void getStudentCGPA(){
        System.out.println("Student ID: "+ sid);
        System.out.println("Student Name: "+ sname);
        System.out.println("Student CGPA: "+ cgpa);
    }
}
