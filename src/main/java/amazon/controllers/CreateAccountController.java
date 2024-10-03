package amazon.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import amazon.models.CreateAccount;

@RestController
@RequestMapping(value ="/amazon/api")
public class CreateAccountController {

    CreateAccount ca=new CreateAccount();


    @RequestMapping(value ="/add", method = RequestMethod.POST)
    String addAccount(){

        ca.setYourName("Roop");
        ca.setMobileNumber(8957403015L);
        ca.setPassword("@1Roopkumar");
        return "Account Details have been added";
    }

    
    @RequestMapping(value ="/show-one", method = RequestMethod.GET)
    String showAccountOne(){
        // System.out.println("Hello Show one");
      String r=  ca.getYourName()+"  "+ ca.getMobileNumber()+"  "+ca.getPassword();
       

        return "<h3>"+r+"</h3>";
    }
    @RequestMapping(value ="/show-all", method = RequestMethod.GET)
    String showAccountAll(){
        // System.out.println("Hello Show all");
        return "All Account Details have been displayed";
    }
    @RequestMapping(value ="/edit-one", method = RequestMethod.PUT)
    String editAccountOne(){
        return "Account has been edited";
    }
    @RequestMapping(value ="/edit-all", method = RequestMethod.PUT)
    String editAccountAll(){
        return "Account has been edited";
    }
    
    @RequestMapping(value ="/delete-one", method = RequestMethod.DELETE)
    String deleteAccountOne(){
        return "All account have been edited";
    }
    @RequestMapping(value ="/delete-all", method = RequestMethod.DELETE)
    String deleteAccountAll(){
        return "All accounts have been deleted";
    }

    // String addAccountAll(){
    //     return null;
    // }

}
