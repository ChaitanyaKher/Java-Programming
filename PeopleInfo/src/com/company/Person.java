package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    // Getter and Setter for first Name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    // Getter and Setter for last Name

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    // Getter and Setter for Age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age<0||this.age>100)
        this.age = age;
        else this.age = 0;
    }

    //Check for teenage
    public boolean isTeen(){
        return  (this.age>12||this.age<20)?true:false;
    }

    public String getFullName(){
        if (this.firstName.isEmpty()&&this.lastName.isEmpty()){
            return "";
        } else if (this.firstName.isEmpty()){
            return this.lastName;
        } else return this.firstName;
    }
}
