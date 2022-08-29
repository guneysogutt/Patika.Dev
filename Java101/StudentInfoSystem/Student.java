package Java101OOP;

public class Student {
    String name;
    String studentNo;
    int classGrade;
    Course math;
    Course physics;
    Course biology;
    Course chemistry;
    double average;
    boolean isPass;

    Student(String name,int classGrade,String studentNo,Course math, Course physics, Course biology, Course chemistry){
        this.name = name;
        this.studentNo = studentNo;
        this.classGrade = classGrade;
        this.math = math;
        this.physics = physics;
        this.biology = biology;
        this.chemistry = chemistry;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkQuizNote(int math, int phy, int bio, int che){
        if (math >= 0 && math <= 100)
            this.math.quiz = math;

        if (phy >= 0 && phy <= 100)
            this.physics.quiz = phy;

        if (che >= 0 && che <= 100)
            this.chemistry.quiz = che;

        if (bio >= 0 && bio <= 100)
            this.biology.quiz = bio;
    }

    public void addBulkExamNote(int math, int phy, int bio, int che){
        if (math >= 0 && math <= 100)
            this.math.note = math;

        if (phy >= 0 && phy <= 100)
            this.physics.note = phy;

        if (che >= 0 && che <= 100)
            this.chemistry.note = che;

        if (bio >= 0 && bio <= 100)
            this.biology.note = bio;
    }

    public void isPass() {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0 || this.biology.note == 0)
            System.out.println("The exam notes were not entered perfectly!");

        else if (this.math.quiz == 0 || this.physics.quiz == 0 || this.chemistry.quiz == 0 || this.biology.quiz == 0)
            System.out.println("The quiz notes were not entered perfectly!");

        else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average : " + this.average);
            if (this.isPass)
                System.out.println("Passed. ");
            else
                System.out.println("Not passed.");
        }
    }

    public void calcAverage() {
        double examAv = ((this.physics.note + this.chemistry.note + this.math.note + this.biology.note) / 4) * 0.8;
        double quizAv = ((this.physics.quiz + this.chemistry.quiz + this.math.quiz + this.biology.quiz) / 4) * 0.2;
        this.average = examAv + quizAv;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math exam grade : " + this.math.note);
        System.out.println("Math quiz grade : " + this.math.quiz);
        System.out.println("Physics exam grade : " + this.physics.note);
        System.out.println("Physics quiz grade : " + this.physics.quiz);
        System.out.println("Chemistry exam grade : " + this.chemistry.note);
        System.out.println("Chemistry quiz grade : " + this.chemistry.quiz);
        System.out.println("Biology exam grade : " + this.biology.note);
        System.out.println("Biology quiz grade : " + this.biology.quiz);
    }
}
