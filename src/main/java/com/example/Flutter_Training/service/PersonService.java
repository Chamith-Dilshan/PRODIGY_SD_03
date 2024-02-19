package com.example.Flutter_Training.service;
import com.example.Flutter_Training.model.Person;
import com.example.Flutter_Training.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PersonService {
    @Autowired
    private PersonRepo personRepo;

    public List<Person> getAllPerson(){
        return personRepo.findAll();
    }
    public Person getPersonById(long personId){
        return personRepo.findById(personId).orElse(null);
    }
    public Person createPerson(Person person){
        person.setPersonId(UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE);
        return personRepo.save(person);
    }
    public Person updatePerson(long personId, Person person){
        if(personRepo.existsById(personId)){
            person.setPersonId(personId);
            return personRepo.save(person);
        }
        return null;
    }
    public void deletePerson(Long personId){
        personRepo.deleteById(personId);
    }
}