package entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private Integer hours;
    private Double valuePerHour;

    private List<Employee> list = new ArrayList<>();


    public Employee(){
    }

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public Double payment() {
        return hours * valuePerHour;
    }

}
