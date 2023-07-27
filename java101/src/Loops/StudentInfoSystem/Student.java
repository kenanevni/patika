package Loops.StudentInfoSystem;

public class Student {
    String name, studentNo;
    int classes;
    Course math, physic, chem, hist, art;
    double average;
    boolean isPass;
    boolean isInRange;

    Student(String name, String studentNo, int classes, Course math, Course physic, Course chem, Course hist, Course art) {

        this.name = name;
        this.classes = classes;
        this.studentNo = studentNo;
        this.math = math;
        this.physic = physic;
        this.chem = chem;
        this.hist = hist;
        this.art = art;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkExamNotes(int mathWrittenNote, int mathOral, int physicNoteWritten,int physicOral ,
                                 int chemWrittenNote,
                                 int chemOral, int histWrittenNote,int histOral,
                                 int artWrittenNote,int artOral) {

        if ((mathWrittenNote >= 0 && mathWrittenNote <= 100) && (mathOral >= 0 && mathOral <= 100)) {
            this.math.writtenExamNote = mathWrittenNote;
            this.math.oralExamNote = mathOral;
            this.math.note =mathWrittenNote*0.8+mathOral*0.2;

        }

       if ((physicNoteWritten >= 0 && physicNoteWritten <= 100) && (physicOral >= 0 && physicOral <= 100)) {
            this.physic.writtenExamNote = physicNoteWritten;
           this.physic.oralExamNote = physicOral;
           this.physic.note =physicNoteWritten*0.8+physicOral*0.2;

       }
        if ((chemWrittenNote >= 0 && chemWrittenNote <= 100)&& (chemOral >= 0 && chemOral <= 100)) {
            this.chem.writtenExamNote = chemWrittenNote;
            this.chem.oralExamNote = chemOral;
            this.chem.note=chemWrittenNote*0.8+chemOral*0.2;

        }

        if ((histWrittenNote >= 0 && histWrittenNote <= 100)&& (histOral >= 0 && histOral <= 100)) {
            this.hist.writtenExamNote = histWrittenNote;
            this.hist.oralExamNote = histOral;
            this.hist.note=histWrittenNote*0.8+histOral*0.2;
        }
        if ((artWrittenNote >= 0 && artWrittenNote <= 100)&& (artOral >= 0 && artOral <= 100)) {
            this.art.writtenExamNote = artWrittenNote;
            this.art.oralExamNote = artOral;
            this.art.note=artWrittenNote*0.8+artOral*0.2;
        }
    }

    public void isPass() {
        if (this.math.writtenExamNote == 0 || this.physic.writtenExamNote == 0 || this.chem.writtenExamNote == 0 || this.hist.writtenExamNote == 0 || this.art.writtenExamNote == 0 ||
        this.math.oralExamNote == 0 || this.physic.oralExamNote == 0 || this.chem.oralExamNote == 0 || this.hist.oralExamNote == 0 || this.art.oralExamNote == 0 ) {
            System.out.println("not all grades entered");
        } else {
            this.isPass = isCheckPass();

        }
    }
    public double calcAverage() {
        this.average = (this.math.note + this.physic.note + this.chem.note + this.hist.note +this.art.note)/ 5.00;
        return this.average;
    }
    public boolean isCheckPass() {
        if (calcAverage() > 55) {
            System.out.println("Congrat ");
        } else System.err.println("Sorry man try next year");

        return this.average > 55;

    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math Grade : " + "writtenExamNote " +this.math.writtenExamNote+ "  oralExamNote "+ this.math.oralExamNote + " Result "+ this.math.note);
        System.out.println("Physic Grade : " + "writtenExamNote " +this.physic.writtenExamNote+ "  oralExamNote "+ this.physic.oralExamNote + " Result "+ this.physic.note);
        System.out.println("Chemistry Grade : " + "writtenExamNote " +this.chem.writtenExamNote+ "  oralExamNote "+ this.chem.oralExamNote + " Result "+ this.chem.note);
        System.out.println("History Grade : " + "writtenExamNote " +this.hist.writtenExamNote+ "  oralExamNote "+ this.hist.oralExamNote + " Result "+ this.hist.note);
        System.out.println("Art Grade : " + "writtenExamNote " +this.art.writtenExamNote+ "  oralExamNote "+ this.art.oralExamNote + " Result "+ this.art.note);

    }
}

