package com.example5.app.spring.context;

import com.example5.app.spring.repository.FileRepository;
import com.example5.app.spring.repository.GmailRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Semaphore;

@Configuration
@ComponentScan(basePackages = {"com.example5.app.spring"})
public class PhoneBookApplicationContext {
//    private Semaphore semaphore = new Semaphore(1); //  불러올개수?


    @Bean
    FileRepository getFileRepository(){
        FileRepository repository = new FileRepository("phone_books.bin"); //
//        semaphore.acquire();
        // thread() run()  하면 동기화 문제 해결
        // or  synchronized method();???????///
        //

//        semaphore.release();


        return repository;
    }


    @Bean
    GmailRepository getGmailRepository(){
        GmailRepository repository = new GmailRepository(); //
        return repository;
    }
}
