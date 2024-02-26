package studentorder.validator;

import studentorder.domain.AnswerWedding;
import studentorder.domain.StudentOrder;

public class WeddingValidator {

    public AnswerWedding checkWedding(StudentOrder so){
        System.out.println("Wedding is running");
        return new AnswerWedding();
    }
}
