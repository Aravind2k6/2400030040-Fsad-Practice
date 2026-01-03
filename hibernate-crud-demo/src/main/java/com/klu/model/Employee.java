package com.klu.model;
import javax.persistence.*;
@Entity
@Table(name="emp")
public class Employee {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int empid;
  private String deptname;
  private double salary;
  @ManyToOne
  @JoinColumn(name="deptid")
  private Department department;
  
  public void setEmpId(int empid) {
    this.empid=empid;
  }
  public int getEmpId() {
    return empid;
  }public void setDepName(String deptname) {
    this.deptname=deptname;
  }
  public String getDeptName() {
    return deptname;
  }
  public void setSalary(double salary) {
    this.salary=salary;
  }
  public double getSalary() {
    return salary;
  }
}