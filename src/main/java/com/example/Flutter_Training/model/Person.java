package com.example.Flutter_Training.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long personId;
    private String personNumber;
    private String personName;
    private String personEmail;

    public long getPersonId() {
        return personId;
    }
    public void setPersonId(long personId){
        this.personId = personId;
    }

    public String getPersonNumber() {
        return personNumber;
    }
    public void setPersonNumber(String personNumber){
        this.personNumber = personNumber;
    }
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
    public String getPersonEmail(){
        return personEmail;
    }
    public void setPersonEmail(String personEmail){
        this.personEmail = personEmail;
    }
}
