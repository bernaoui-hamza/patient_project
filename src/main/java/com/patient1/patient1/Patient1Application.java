package com.patient1.patient1;

import com.patient1.patient1.entities.Patient;
import com.patient1.patient1.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Patient1Application {

    public static void main(String[] args) {

        SpringApplication.run(Patient1Application.class, args);
    }
    //@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(
                    new Patient(null,"hassan",new Date(),false,111));
            patientRepository.save(
                    new Patient(null,"ali",new Date(),true,654));
            patientRepository.save(
                    new Patient(null,"hamza",new Date(),false,109));
            patientRepository.save(
                    new Patient(null,"yassine",new Date(),true,999));
            patientRepository.save(
                    new Patient(null,"abdo",new Date(),false,107));
            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });
        };
    }

}
