package spring.firstPrgm.enterpriseAppl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
// Used for sending response to the user in the right format
public class Controller {

    @Autowired // business is now a dependency of controller we need to use autowired
            // without it got an error this.businessService=null;
    BusinessService businessService;
    @GetMapping("/sum")
    public int display(){
        return businessService.sum();
    }
}

@Component // declared businessService a component to be managed by spring
// Used for business Logic
class BusinessService{
    @Autowired
    DataService dataService;
    public int sum(){

        List<Integer> data=dataService.data();
        return data.stream().reduce(Integer::sum).get();
    }

}

@Component
// Used for accessing data from dataBase
class DataService{
    public List<Integer> data(){
        return List.of(11,90,34,89);
    }

}
