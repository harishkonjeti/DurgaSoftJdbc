package org.core.java.collections;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationExample {
    public static void main(String[] args) throws JsonProcessingException {
        Person person = new Person("1", "Virat", "34");
        ObjectMapper mapper = new ObjectMapper();
        String stringVal = mapper.writeValueAsString(person);
        System.out.println(stringVal);
        Person personObject = mapper.readValue(stringVal, Person.class);
        System.out.println(personObject);
    }
}
