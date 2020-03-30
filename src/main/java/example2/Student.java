package example2;

import lombok.Data;
import lombok.Getter;

@Getter @Data
public class Student {
    String sn;
    String fn;
    Grades grades;
}