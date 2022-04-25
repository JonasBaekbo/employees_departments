package com.example.demo.models;

public class Employee {
    private int emp_id;
    private String emp_name;
    private String emp_job;
    private int emp_manager;
    private String emp_hiredate;
    private int emp_salary;
    private int emp_commission;
    private int emp_departmentno;

    public Employee(int emp_id, String emp_name, String emp_job, int emp_manager, String emp_hiredate, int emp_salary, int emp_commission, int emp_departmentno) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_job = emp_job;
        this.emp_manager = emp_manager;
        this.emp_hiredate = emp_hiredate;
        this.emp_salary = emp_salary;
        this.emp_commission = emp_commission;
        this.emp_departmentno = emp_departmentno;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_job() {
        return emp_job;
    }

    public void setEmp_job(String emp_job) {
        this.emp_job = emp_job;
    }

    public int getEmp_manager() {
        return emp_manager;
    }

    public void setEmp_manager(int emp_manager) {
        this.emp_manager = emp_manager;
    }

    public String getEmp_hiredate() {
        return emp_hiredate;
    }

    public void setEmp_hiredate(String emp_hiredate) {
        this.emp_hiredate = emp_hiredate;
    }

    public int getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(int emp_salary) {
        this.emp_salary = emp_salary;
    }

    public int getEmp_commission() {
        return emp_commission;
    }

    public void setEmp_commission(int emp_commission) {
        this.emp_commission = emp_commission;
    }

    public int getEmp_departmentno() {
        return emp_departmentno;
    }

    public void setEmp_departmentno(int emp_departmentno) {
        this.emp_departmentno = emp_departmentno;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_job='" + emp_job + '\'' +
                ", emp_manager='" + emp_manager + '\'' +
                ", emp_hiredate='" + emp_hiredate + '\'' +
                ", emp_salary=" + emp_salary +
                ", emp_commission=" + emp_commission +
                ", emp_departmentno=" + emp_departmentno +
                '}';
    }
}
