package com.example.demo.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Model.Person;

public interface PersonDao extends MongoRepository<Person, Integer> {

}



