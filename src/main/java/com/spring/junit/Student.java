package com.spring.junit;

public class Student {

    private static String name = "Eslam";
    private static String age = "21";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Student.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        Student.age = age;
    }

    public String findById(int id){
        if(id == 5){
            return "Eslam";
        } else if(id == 6){
            return "Ahmed";
        } else {
            return null;
        }
    }
    public void getException(){
        throw new SpecialException();
    }
}
