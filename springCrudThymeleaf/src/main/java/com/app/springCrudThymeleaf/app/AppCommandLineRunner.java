//package com.app.springCrudThymeleaf.app;
//
//import com.app.springCrudThymeleaf.app.dao.UserRepository;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component @Slf4j
//public class AppCommandLineRunner implements CommandLineRunner {
//
//    private UserRepository userRepository;
//
//    @Autowired
//    public AppCommandLineRunner(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//
//    @Override
//    public void run(String... args) throws Exception {
//        userRepository.save(new User("person", "person@gmail.com"));
//        User u = userRepository.findByName("person");
//
//        log.info(String.valueOf(u));
//    }
//}
