package spring.firstPrgm.ConfigFiles;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age, Address address){ };
record Address(String firstLine,String city){ };
@Configuration // Using the @Config anotation we specify that bean methods are defined here. Methods that create beans(objects handled by spring)
public class ConfigSpringPrgm {

    @Bean // To bean method we need a config class
    public String name(){
        return "Hello Spring";
    }

    @Bean
    public int age(){
        return 20;
    }


    @Bean
    @Primary
    public Person person(){
        return new Person("Neha",21,new Address("GSC","Varanasi"));
    }

    @Bean(name = "Residence")
    @Primary // Indicates that when we have beans of same type this bean will be given priority
    public Address address2(){
        return new Address("Powai","Mumbai");
    }


    @Bean(name = "location")
    @Qualifier("addressTo") // Using qualifier does the same
    public Address address(){
        return new Address("IIT BHU GIRLS HOSTEL","Varanasi");
    }


    @Bean // using the pre-defined beans to generate a new bean
    public Person person2(){
        return new Person(name(),age(),address2());
    }


    @Bean // using the pre-defined beans to generate a new bean(alternative approach) need to take care of the bean name
    public Person person3(String name,int age,Address location){
        return new Person(name,age,location);
    }


    @Bean // using the pre-defined beans to generate a new bean(alternative approach) need to take care of the bean name
    public Person person4(String name,int age, @Qualifier("addressTo") Address address){
        return new Person(name,age,address);
    }


}
