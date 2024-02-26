package studentorder.validator;

import studentorder.domain.AnswerCityRegister;
import studentorder.domain.StudentOrder;

public class CityRegisterValidator {

    String hostName;
    int port;
    String login;
    String password;

     public AnswerCityRegister checkCityRegister(StudentOrder so){
        System.out.println("CityRegister is running " + hostName + ", "
                + login + ", " + password);
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return ans;
    }
}
