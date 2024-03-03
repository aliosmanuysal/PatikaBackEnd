static void main(String[] args) {
    // Örnek Kullanım
    Employee employee = new Employee("Ahmet Yılmaz", 1200, 45, 2010);
    System.out.println("Vergi: " + employee.tax());
    System.out.println("Bonus: " + employee.bonus());

    System.out.println("Maaş Artışı Öncesi: " + employee);
    employee.raiseSalary();
    System.out.println("Maaş Artışı Sonrası: " + employee);
}