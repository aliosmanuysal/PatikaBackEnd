class Course {
    String name;
    String code;
    String prefix;
    double oralPercentage;
    Teacher teacher;
    double note;

    // Course sınıfının yapıcı metodu
    public Course(String name, String code, String prefix, double oralPercentage) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.oralPercentage = oralPercentage / 100.0; // Yüzdelik oranını 0-1 aralığına çeviriyoruz.
        this.note = 0;
    }

    // Öğretmen atama metodu
    public boolean addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            return true;
        }
        return false;
    }

    // Öğretmeni ekrana yazdırma metodu
    public void printTeacher() {
        if (this.teacher != null) {
            System.out.println("Teacher: " + this.teacher.name);
        } else {
            System.out.println("No teacher assigned yet.");
        }
    }
}