package Java101OOP;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int quiz;

    public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.quiz = 0;
    }

    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.dept))
            this.courseTeacher = t;
        else
            System.out.println(t.name + " can't be the lecture of this course!");
    }

    public void printTeacher(){
        if(courseTeacher != null)
            System.out.println(this.name + " course's lecturer is : " + courseTeacher.name);
        else
            System.out.println("There is no assigned teacher for this course!");
    }
}
