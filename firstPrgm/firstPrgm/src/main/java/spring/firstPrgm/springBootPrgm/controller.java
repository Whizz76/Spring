package spring.firstPrgm.springBootPrgm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {
    @Autowired
    private Website website;
    @GetMapping("/users")
    public List<User> display(){
        return List.of(new User("Neha",20,"neha@gmail.com"),new User("Riya",22,"riya@gmail.com"));
    }
    @GetMapping("/website")
    public Website pr(){
        return website;
    }
}
