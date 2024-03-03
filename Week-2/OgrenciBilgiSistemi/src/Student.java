class Student {
    String name;
    String stuNo;
    Course course1;
    Course course2;
    Course course3;
    double average;
    boolean isPass;

    // Student sınıfının yapıcı metodu

    public Student(String name, String stuNo) {
        this.name = name;
        this.stuNo = stuNo;
        this.average = 0;
        this.isPass = false;
    }

    // Öğrencinin notlarını ekleyen metot
    public void addBulkExamNote(double note1, double note2, double note3) {
        this.course1.note = note1;
        this.course2.note = note2;
        this.course3.note = note3;
    }

    // Öğrencinin geçip geçmediğini kontrol eden metot
    public boolean isPass() {
        return this.isPass;
    }

    // Ortalamayı hesaplayan metot
    public void calcAverage() {
        if (this.course1 != null && this.course2 != null && this.course3 != null) {
            double oralEffect1 = this.course1.note * this.course1.oralPercentage;
            double oralEffect2 = this.course2.note * this.course2.oralPercentage;
            double oralEffect3 = this.course3.note * this.course3.oralPercentage;

            this.average = (oralEffect1 + (this.course1.note - oralEffect1) +
                    oralEffect2 + (this.course2.note - oralEffect2) +
                    oralEffect3 + (this.course3.note - oralEffect3)) / 3;

            if (this.average >= 50) {
                this.isPass = true;
            }
        }
    }

    // Notları ekrana yazdıran metot
    public void printNote() {
        if (this.course1 != null && this.course2 != null && this.course3 != null) {
            System.out.println("Student: " + this.name);
            System.out.println(this.course1.name + " Oral Note: " + this.course1.note);
            System.out.println(this.course2.name + " Oral Note: " + this.course2.note);
            System.out.println(this.course3.name + " Oral Note: " + this.course3.note);
            System.out.println("Average: " + this.average);
            System.out.println("Pass: " + this.isPass);
        } else {
            System.out.println("Courses not assigned yet.");
        }
    }
}