package com.learn.functionalInterface;

public class Employee {

        private String firstname;
        private Integer salary;
        private Integer yearsOfExperience;
        private Integer rank;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
    public Employee(String firstname,Integer salary,Integer yearsOfExperience,Integer rank){
        this.firstname=firstname;
        this.salary=salary;
        this.yearsOfExperience=yearsOfExperience;
        this.rank=rank;
    }

    public Employee(){

    }
    public String toString(){
        return "Employee{" +
                "firstname='"+firstname+'\''+
                ",salary="+salary+
                ",yearsofexperience="+yearsOfExperience+
                ",rank="+rank+
                '}';

    }




    }

