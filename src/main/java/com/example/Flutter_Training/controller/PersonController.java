package com.example.Flutter_Training.controller;
import com.example.Flutter_Training.model.Person;
import com.example.Flutter_Training.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/")
    public List<Person> getAllPerson(){
        return personService.getAllPerson();
    }
    @GetMapping("/{personId}")
    public Person getPersonById(@PathVariable Long personId){
        return  personService.getPersonById(personId);
    }
    @PostMapping("/")
    public Person createPerson(@RequestBody Person person){
        return personService.createPerson(person);
    }
    @PutMapping("/{personId}")
    public Person updatePerson(@PathVariable Long personId, @RequestBody Person person){
        return personService.updatePerson(personId,person);
    }
    @DeleteMapping("/{personId}")
    public void deletePerson(@PathVariable Long personId){
        personService.deletePerson(personId);
    }
}