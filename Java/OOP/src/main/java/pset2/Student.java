package pset2;

public class Student {
    String name;
    String lastName;
    String email;
    double gpa;
    String degree;

    public Student(String name, String lastName, String email, double gpa, String degree) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.gpa = gpa;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public double getGpa() {
        return gpa;
    }

    public String getDegree() {
        return degree;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gpa=" + gpa +
                ", degree='" + degree + '\'' +
                '}';
    }
}
