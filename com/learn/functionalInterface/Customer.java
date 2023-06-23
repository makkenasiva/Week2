package com.learn.functionalInterface;

public class Customer {
    private String firstName;
    private String gender;
    private Integer noOfWorkExperience;
    private String workLocationEligibility;
    private Integer noOfYearsWorkExperienceEligibility;
    private String  genderEligibility;

    public String getWorkLocationEligibility() {
        return workLocationEligibility;
    }

    public void setWorkLocationEligibility(String workLocationEligibility) {
        this.workLocationEligibility = workLocationEligibility;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getNoOfWorkExperience() {
        return noOfWorkExperience;
    }

    public void setNoOfWorkExperience(Integer noOfWorkExperience) {
        this.noOfWorkExperience = noOfWorkExperience;
    }

    public Integer getNoOfYearsWorkExperienceEligibility() {
        return noOfYearsWorkExperienceEligibility;
    }

    public void setNoOfYearsWorkExperienceEligibility(Integer noOfYearsWorkExperienceEligibility) {
        this.noOfYearsWorkExperienceEligibility = noOfYearsWorkExperienceEligibility;
    }

    public String getGenderEligibility() {
        return genderEligibility;
    }

    public void setGenderEligibility(String genderEligibility) {
        this.genderEligibility = genderEligibility;
    }



    public Customer(String firstname, String gender, Integer noOfWorkExperience,String workLocationEligibility,
                    Integer noOfYearsWorkExperienceEligibility, String  genderEligibility) {
        this.firstName = firstname;
        this.gender = gender;
        this.noOfWorkExperience = noOfWorkExperience;
        this.workLocationEligibility=workLocationEligibility;
        this.noOfYearsWorkExperienceEligibility = noOfYearsWorkExperienceEligibility;
        this.genderEligibility = genderEligibility;

    }


    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", noOfWorkExperience=" + noOfWorkExperience +
                ", workLocationEligibility='" + workLocationEligibility + '\'' +
                ", noOfYearsWorkExperienceEligibility=" + noOfYearsWorkExperienceEligibility +
                ", genderEligibility='" + genderEligibility + '\'' +
                '}';
    }

    }

