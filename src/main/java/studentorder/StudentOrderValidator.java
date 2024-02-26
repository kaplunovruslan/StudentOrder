package studentorder;

import studentorder.mail.MailSender;
import studentorder.validator.ChildrenValidator;
import studentorder.validator.StudentValidator;
import studentorder.validator.WeddingValidator;
import studentorder.validator.CityRegisterValidator;
import studentorder.domain.*;

public class StudentOrderValidator {

    private CityRegisterValidator cityRegisterValidator;
    private ChildrenValidator childrenValidator;
    private StudentValidator studentValidator;
    private WeddingValidator weddingValidator;
    private MailSender mailSender;

    public StudentOrderValidator() {
        cityRegisterValidator = new CityRegisterValidator();
        childrenValidator = new ChildrenValidator();
        studentValidator = new StudentValidator();
        weddingValidator = new WeddingValidator();
        mailSender = new MailSender();
    }


    public static void main(String[] args) {
        StudentOrderValidator sov = new StudentOrderValidator();
        sov.checkAll();
    }

    public void checkAll() {
        while (true) {
            StudentOrder so = readStudentOrder();
            if (so == null) {
                break;
            }
            AnswerCityRegister cityAnswer = checkCityRegister(so);
            if (!cityAnswer.success) {
                //continue;
                break;
            }
            AnswerWedding wedAns = checkWedding(so);
            AnswerChildren childAns = checkChildren(so);
            AnswerStudent studAns = checkStudent(so);

            sendMail(so);
        }
    }

    public StudentOrder readStudentOrder() {
        SaveStudentOrder.buildStudentOrder();
        StudentOrder so = new StudentOrder();
        return so;
    }
    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        return cityRegisterValidator.checkCityRegister(so);
    }
    public AnswerWedding checkWedding(StudentOrder so) {
        return weddingValidator.checkWedding(so);
    }
    public AnswerChildren checkChildren(StudentOrder so) {
        return childrenValidator.checkChildren(so);
    }
    public AnswerStudent checkStudent(StudentOrder so) {
        return studentValidator.checkStudent(so);
    }
    public void sendMail(StudentOrder so) {
        mailSender.sendMail(so);
    }
}

