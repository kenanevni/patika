package Loops.StudentInfoSystem;

public class Main {
    public static void main(String[] args) {
        Course math = new Course("MATHEMATICS", "MATH101", "MATH");
        Course phhsic = new Course("PHYSIC", "PHYS101", "PHYSCS");
        Course chem = new Course("CHEMISTRY", "CHEM101", "CHEM");
        Course hist = new Course("HISTORY", "HIST101", "HIST");
        Course art = new Course("ART", "ART101", "ART");

        Teacher t1 = new Teacher("Adam", "3324362512", "MATH");
        Teacher t2 = new Teacher("John", "1253645896", "HIST");
        Teacher t3 = new Teacher("Conan", "3654789652", "PHYSCS");
        Teacher t4 = new Teacher("Dale", "36654989652", "CHEM");
        Teacher t5 = new Teacher("Sandy", "965412365", "ART");

        math.addTeacher(t1);
        phhsic.addTeacher(t1);
        phhsic.addTeacher(t3);
        chem.addTeacher(t4);
        hist.addTeacher(t2);
        art.addTeacher(t5);

        Student s1 = new Student("Student1", "4", 140144015, math,phhsic,chem,hist,art);
        s1.addBulkExamNotes(50,20,40,90,100,23,25,69,89,78);
        s1.printNote();
        s1.isPass();
        s1.isCheckPass();

        Student s2 = new Student("Student2", "5", 2211133, math,phhsic,chem,hist,art);
        s2.addBulkExamNotes(100,50,40,55,66,36,96,78,25,14);
        s2.printNote();
        s2.isPass();
        s2.isCheckPass();

        Student s3 = new Student("Student3", "66", 221121312, math,phhsic,chem,hist,art);
        s3.addBulkExamNotes(50,20,40,66,77,25,14,36,89,100);
        s3.printNote();
        s3.isPass();
        s3.isCheckPass();


    }
}
