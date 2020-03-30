import example1.PingPong;
import example2.Student;
import example2.StudentProperty;
import example3.SetOfPowers;
import example4.StringChar;


public class Run {
    public static void main(String[] args) {
//ping-pong
        PingPong pingPong = new PingPong();
//        for (int i = 0; i <= 10; i++) {
            pingPong.returnValue();
//        }


////get json property
        StudentProperty studentProperty = new StudentProperty();
        Student student = studentProperty.deserializeJSON();
        System.out.println(student.getFn());
        System.out.println(student.getGrades().getMath());


//set of powers
        SetOfPowers s = new SetOfPowers();
        s.returnPowers(100, 100);


//string
        StringChar stringChar = new StringChar();
        stringChar.returnSecondChar();
    }
}
