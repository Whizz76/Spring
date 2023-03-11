package spring.firstPrgm.ConfigFiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.Arrays;

public class ContextSpringFile {
    public static void main(String[] args){
        try(var springContext=new AnnotationConfigApplicationContext(ConfigSpringPrgm.class)){
            System.out.println(springContext.getBean("name"));
            System.out.println(springContext.getBean("person"));
            System.out.println(springContext.getBean("location"));
            System.out.println(springContext.getBean("person2"));
            System.out.println(springContext.getBean("person3"));
            System.out.println(springContext.getBean("person4"));
            System.out.println(springContext.getBean(Address.class));
            System.out.println(springContext.getBean(Person.class));
            Arrays.stream(springContext.getBeanDefinitionNames()).forEach(System.out::println);
        }


    }
}
