package LLD4Example2BuilderDesign;

import java.util.HashMap;
import java.util.Objects;

public class Student {
    String fName;
    String lName;
    String address;
    String batch;
    String something;

    public void setAddress(String address) {
        this.address = address;
    }
    Student(){}
    // overload the attributes
    Student(String fName, String lName, String address, String batch, String something) {}

    Student(HashMap<String, Object> h) {
        String fname = (String) h.get("fName");
        String lname = (String) h.get("lName");
        String address = (String) h.get("address");

        // validation logic
        if(fname.startsWith("A")) {
            throw new IllegalArgumentException("Name starts with A is not acceptable");
        }

        this.fName = fname;
        this.lName = lname;
        this.address = address;
    }
}
