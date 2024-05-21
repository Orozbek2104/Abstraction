import java.time.LocalDate;
import java.util.SplittableRandom;

public class Student {
     private String name;
     private String surName;
     private String gender;
     private LocalDate dateOfStart;
     private EDUCATIONCENTER educationcenter;

     public Student (String name, String surName, String gender, LocalDate dateOfStart, EDUCATIONCENTER educationcenter){
         this.name = name;
         this.surName = surName;
         this.gender = gender;
         this.dateOfStart = dateOfStart;
         this.educationcenter = educationcenter;
     }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String surName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String gender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate dateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public EDUCATIONCENTER educationcenter() {
        return educationcenter;
    }

    public void setEducationcenter(EDUCATIONCENTER educationcenter) {
        this.educationcenter = educationcenter;
    }


    @Override
    public String toString() {
        return "Student:    " +
                "       name:  " + name + '\n' +
                "       surName:  " + surName + '\n' +
                "       gender: " + gender + '\n' +
                "       dateOfStart: " + dateOfStart +
                "       educationcenter: " + educationcenter +
                '}';
    }
}
