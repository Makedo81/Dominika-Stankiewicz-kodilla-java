package com.kodilla.kodillahibernate.manytomany;

import com.sun.istack.internal.NotNull;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery
        (name = "Company.retrieveByChar",
                query = "Select * From COMPANIES where COMPANY_NAME like '%ma%'",
                resultClass = Company.class
        )
@NamedQuery
        (name = "Company.retrieveNameByAnyChar",
                query = "FROM Company WHERE name LIKE concat ('%',:ANYCHAR,'%') "
        )
@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}


