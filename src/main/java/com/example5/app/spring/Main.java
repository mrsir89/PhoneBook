package com.example5.app.spring;

import com.example5.app.spring.context.PhoneBookApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args ){
        ApplicationContext context = new AnnotationConfigApplicationContext(PhoneBookApplicationContext.class);
        System.out.println("수진아 안녕");

    }
}
