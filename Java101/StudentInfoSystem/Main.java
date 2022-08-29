package Java101OOP;

public class Main {
    public static void main(String[] args) {
        Course math = new Course("Math", "MAT101", "MAT");
        Course physics = new Course("Physics", "PHY101", "PHY");
        Course chemistry = new Course("Chemistry", "CHE101", "CHE");
        Course biology = new Course("Biology", "BIO101", "BIO");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayse", "90550000001", "PHY");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "CHE");
        Teacher t4 = new Teacher("Ahmet Mehmet", "90550000003", "BIO");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);
        biology.addTeacher(t4);

        Student s1 = new Student("Inek Saban", 4, "140144015", math, physics, biology,chemistry);
        s1.addBulkExamNote(50,20,40,60);
        s1.addBulkQuizNote(100,100,90,50);
        s1.isPass();

        Student s2 = new Student("Guduk Necmi", 4, "2211133", math, physics, biology,chemistry);
        s2.addBulkExamNote(100,50,40,55);
        s2.addBulkQuizNote(80,90,100,70);
        s2.isPass();

        Student s3 = new Student("Hayta Ismail", 4, "221121312", math, physics, biology,chemistry);
        s3.addBulkExamNote(50,20,40,70);
        s3.addBulkQuizNote(70,60,50,80);
        s3.isPass();
    }
}
