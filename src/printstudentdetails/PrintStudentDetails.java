package printstudentdetails;

/*
1. store and print student details.
2. view class - user interaction
 */


public class PrintStudentDetails {

    public static void main(String[] args) {
        // store data of 3 students
        // need an array

        Student[] list = new Student[3];
        Student s1 = new Student(); // object s1 created
        Student s2 = new Student();
        Student s3 = new Student();


        s1.setId(23);
        s1.setName("Ramneek");

        s2.setId(24);
        s2.setName("Tanishq");

        s3.setId(25);
        s3.setName("Divyansh");

        // store object in array.

        list[0] = s1;
        list[1] = s2;
        list[2] = s3;

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getName() + " " + list[i].getId());
        }
    }


}
