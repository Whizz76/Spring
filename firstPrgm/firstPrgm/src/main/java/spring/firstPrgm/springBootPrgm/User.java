package spring.firstPrgm.springBootPrgm;

import org.springframework.stereotype.Component;

public class User {
    private String name;
    private int age;
    private String email;
    public User(String name, int age, String email){
        //super();
        this.name=name;
        this.age=age;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return "{ "+name+" , "+ String.valueOf(age) +" , "+email+" } ";
    }
}
