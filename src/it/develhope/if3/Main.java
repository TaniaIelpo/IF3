package it.develhope.if3;

import it.develhope.if3.entities.Student;

/**
 * @author Tania Ielpo
 */

public class Main {
    public static void main(String[] args) {
        Student student= new Student("Tania", 34);
        System.out.println(student.guessInAge());
    }
}
