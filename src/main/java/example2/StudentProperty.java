package example2;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class StudentProperty {
String json = "{\"sn\":\"Smith\", \"fn\":\"Ana\", \"grades\":{\"math\":\"10\", \"history\":\"9\"}}" ;


public Student deserializeJSON(){
    Student student = new Student();
    try {
         student = new ObjectMapper().readValue(json, Student.class);

    }catch (IOException e){
        e.getStackTrace();
    }
    return student;
}

}
