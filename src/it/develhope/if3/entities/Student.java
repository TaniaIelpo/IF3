package it.develhope.if3.entities;

import java.util.Random;

/**
 * This class represents a Student
 *
 * @author Tania Ielpo
 */

public class Student {

    private String name;
    private int age;

    public Student(String studentName, int studentAge){
        this.name=studentName;
        this.age=studentAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Generates a Random number in the range 0-35
     *Compare the number generated with the student's age
     * @return a string that specifies the result of the comparison
     */

    public String guessInAge(){
        int ageRandom= new Random().nextInt(0,35);
        System.out.println("I generate the random number "+ageRandom+" for student "+this.name);
        if (ageRandom<this.age){
            return "The random number generated is less than the student's age";
        }
        else if(ageRandom>this.age){
            return "The random number generated is greater than the student's age";
        }
        else{
            return "The random number generated equals the student's age";
        }
    }
}
