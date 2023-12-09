package LLD4Example2BuilderDesign;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        // approach 1
//        Student s = new Student();
//        s.setAddress("abcd");
//
//        // approach 2
//        Student s1 = new Student("rahul", "ranjan", "abcd", "b4", "something");
//
//        HashMap<String, Object> h = new HashMap<>();
//        h.put("fname", "nama");
//
//        try {
//            Student s3 = new Student(h);
//        } catch (Exception e) {
//            System.out.println("Exception creating object");
//        }

        // approach 3
        NewStudent newStudent =  NewStudent.getBuilder()
                .setName("rahul")
                .setAge(27)
                .setBatch("b4")
                .setPsp(30)
                .build();
    }
}
