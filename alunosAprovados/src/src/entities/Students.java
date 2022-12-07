package entities;

public class Students {
    private String name;
    private double grades1;
    private double grades2;

    public Students(String name, double grade1, double grades2) {
        this.name = name;
        this.grades1 = grade1;
        this.grades2 = grades2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrades1() {
        return grades1;
    }

    public void setGrades1(double grades1) {
        this.grades1 = grades1;
    }

    public double getGrades2() {
        return grades2;
    }

    public void setGrades2(double grades2) {
        this.grades2 = grades2;
    }
}
