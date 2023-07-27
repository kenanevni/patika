package Loops.StudentInfoSystem;

public class Course {
    String name;
    String code;
    String prefix;
    int writtenExamNote;
    int oralExamNote;
    double note;
    Teacher courseTeacher;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.writtenExamNote = 0;
        this.oralExamNote = 0;
        this.note = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equalsIgnoreCase(t.branch)) {
            this.courseTeacher = t;
            System.out.println(t.name + " Succesfully added to " + this.name);
        } else {
            System.err.println(t.name + " is not eligible for " + this.name);
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(courseTeacher.name + " is the teacher of the " + this.name);
        } else System.err.println(this.name + " has not any teacher");
    }
}
