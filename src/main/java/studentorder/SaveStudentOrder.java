package studentorder;

import studentorder.domain.other.Adult;
import studentorder.domain.StudentOrder;

/**
 * Hello world!
 *
 */
public class SaveStudentOrder {
    public static void main( String[] args ) {
        buildStudentOrder();

//        StudentOrder so = new StudentOrder();
//        long ans = saveStudentOrder(so);
//        System.out.println(ans);

    }
    static long saveStudentOrder(StudentOrder studentOrder){
        long answer = 199;
        System.out.println("SaveStudentOrder");
        return answer;
    }
    public static StudentOrder buildStudentOrder(){
        StudentOrder so = new StudentOrder();

        Adult husband = new Adult();

//        husband.setGivenName("Андрей");
//        husband.setSurName("Петров");
//        husband.setPassportNumber("123456");
//        so.setHusband(husband);

//        String ans = husband.getPersonString();
//        System.out.println(ans);

        return so;
    }
}
