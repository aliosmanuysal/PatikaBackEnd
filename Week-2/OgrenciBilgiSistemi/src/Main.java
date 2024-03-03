/*
Öğrenci Bilgi Sistemi
Author: Ali Osman UYSAL
2024
 */

public class Main {
    public static void main(String[] args) {

        // Dersler oluşturuluyor
        Course physics = new Course("Physics", "PH101", "PHY", 20);  // Fizik dersine ait oral notun etkisi %20
        Course math = new Course("Mathematics", "MATH101", "MAT", 15);  // Matematik dersine ait oral notun etkisi %15
        Course chemistry = new Course("Chemistry", "CHEM101", "CHE", 25);  // Kimya dersine ait oral notun etkisi %25

        // Öğretmenler oluşturuluyor
        Teacher teacher1 = new Teacher("John Doe", "12345", "PHY");
        Teacher teacher2 = new Teacher("Jane Smith", "67890", "MAT");
        Teacher teacher3 = new Teacher("Bob Johnson", "54321", "CHE");

        // Öğrenciler oluşturuluyor
        Student student1 = new Student("Alice", "S12345");
        Student student2 = new Student("Bob", "S67890");
        Student student3 = new Student("Charlie", "S54321");

        // Derslere öğretmen atanıyor
        physics.addTeacher(teacher1);
        math.addTeacher(teacher2);
        chemistry.addTeacher(teacher3);

        // Öğrencilere dersler atanıyor
        student1.course1 = physics;
        student1.course2 = math;
        student1.course3 = chemistry;

        student2.course1 = physics;
        student2.course2 = math;
        student2.course3 = chemistry;

        student3.course1 = physics;
        student3.course2 = math;
        student3.course3 = chemistry;

        // Öğrencilere notlar ekleniyor
        student1.addBulkExamNote(90, 80, 70);
        student2.addBulkExamNote(75, 85, 95);
        student3.addBulkExamNote(60, 70, 80);

        // Ortalamalar hesaplanıyor
        student1.calcAverage();
        student2.calcAverage();
        student3.calcAverage();

        // Notlar ekrana yazdırılıyor
        student1.printNote();
        student2.printNote();
        student3.printNote();
    }
}