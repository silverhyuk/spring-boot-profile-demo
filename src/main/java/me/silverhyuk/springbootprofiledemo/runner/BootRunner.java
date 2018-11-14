package me.silverhyuk.springbootprofiledemo.runner;

import me.silverhyuk.springbootprofiledemo.Person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class BootRunner implements ApplicationRunner {
    @Autowired
    private Person person;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=============================");
        System.out.println("firstName : " + person.getFirstName());
        System.out.println("lastName : " + person.getLastName());
        System.out.println("age : " + person.getAge());
        System.out.println("=============================");

    }
}
