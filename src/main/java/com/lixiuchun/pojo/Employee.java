package com.lixiuchun.pojo;

//        `id` int(11) NOT NULL AUTO_INCREMENT,
//        `lastName` varchar(100) DEFAULT NULL,
//        `email` varchar(100) DEFAULT NULL,
//        `salary` double(11,2) DEFAULT NULL,
//        `dept_id` int(11) DEFAULT NULL,
//

public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Double salary;
    private Integer dept_id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLast_name() {
        return lastName;
    }

    public void setLast_name(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", dept_id=" + dept_id +
                '}';
    }
}
