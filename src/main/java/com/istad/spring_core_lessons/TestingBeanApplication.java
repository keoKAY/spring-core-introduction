package com.istad.spring_core_lessons;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootApplication
public class TestingBeanApplication {
    public static void main(String[] args) {

        // Spring Context
        // manage the object

        try(AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(TestingBeanApplication.class)){

            String[] beanNames = context.getBeanDefinitionNames();
            for(String beanName : beanNames){
                System.out.println("---------------------");
                System.out.println("Bean Name : "+beanName);
                System.out.println("----------------------");
            }


        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
