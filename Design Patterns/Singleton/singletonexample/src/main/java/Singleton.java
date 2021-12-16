/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arosha
 */
public class Singleton {
    public static void main(String args[]){
        Student student = Student.getInstance();
        Student student1 = Student.getInstance();
        student.setStudentDetails(1, "Arosha", 2.7);
        student1.getStudentCGPA();
    }
}
