package com.kodilla.kodillahibernate.manytomany.dao;
//
//import com.kodilla.kodillahibernate.manytomany.Company;
//import com.kodilla.kodillahibernate.manytomany.CompanyDao;
//import com.kodilla.kodillahibernate.manytomany.Employee;
//import com.kodilla.kodillahibernate.manytomany.EmployeeDao;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class CompanyDaoTestSuite {
//    @Autowired
//    CompanyDao companyDao;
//    @Autowired
//    EmployeeDao employeeDao;
//
//    @Test
//    public void retrieveByChar() {
//        //Given
//        Company softwareMachine = new Company("Software Machine");
//        Company dataMaesters = new Company("Data Maesters");
//        Company greyMatter = new Company("Grey Matter");
//
//        companyDao.save(softwareMachine);
//        int softwareMachineId = softwareMachine.getId();
//        companyDao.save(dataMaesters);
//        int dataMaestersId = dataMaesters.getId();
//        companyDao.save(greyMatter);
//        int greyMatterId = greyMatter.getId();
//
//        //When
//        List<Company> result = companyDao.retrieveByChar();
//
//        //Then
//        Assert.assertEquals(1, result.size());
//
//        //CleanUp
//        try {
//            companyDao.delete(softwareMachineId);
//            companyDao.delete(dataMaestersId);
//            companyDao.delete(greyMatterId);
//        } catch (Exception e) {
//            //do nothing
//        }
//    }
//
//    @Test
//    public void testRetrieveByLastname() {
//        //Given
//        Employee johnSmith = new Employee("John", "Smith");
//        Employee annaSmith = new Employee("Anna", "Smith");
//        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
//        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
//
//        Company softwareMachine = new Company("Software Machine");
//        Company dataMaesters = new Company("Data Maesters");
//        Company greyMatter = new Company("Grey Matter");
//
//        softwareMachine.getEmployees().add(johnSmith);
//        dataMaesters.getEmployees().add(annaSmith);
//        dataMaesters.getEmployees().add(stephanieClarckson);
//        dataMaesters.getEmployees().add(lindaKovalsky);
//        greyMatter.getEmployees().add(johnSmith);
//        greyMatter.getEmployees().add(lindaKovalsky);
//
//        johnSmith.getCompanies().add(softwareMachine);
//        johnSmith.getCompanies().add(greyMatter);
//        annaSmith.getCompanies().add(greyMatter);
//        stephanieClarckson.getCompanies().add(dataMaesters);
//        lindaKovalsky.getCompanies().add(dataMaesters);
//        lindaKovalsky.getCompanies().add(greyMatter);
//
//        //When
//        companyDao.save(softwareMachine);
//        int softwareMachineId = softwareMachine.getId();
//        companyDao.save(dataMaesters);
//        int dataMaestersId = dataMaesters.getId();
//        companyDao.save(greyMatter);
//        int greyMatterId = greyMatter.getId();
//
//        //When
//        List<Employee> result = employeeDao.retrieveByLastname("Smith");
//
//        //Then
//        Assert.assertEquals(2, result.size());
//
//        //CleanUp
//        try {
//            companyDao.delete(softwareMachineId);
//            companyDao.delete(dataMaestersId);
//            companyDao.delete(greyMatterId);
//        } catch (Exception e) {
//            //do nothing
//        }
//    }
//
//    @Test
//    public void testSaveManyToMany() {
//        //Given
//        Employee johnSmith = new Employee("John", "Smith");
//        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
//        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
//
//        Company softwareMachine = new Company("Software Machine");
//        Company dataMaesters = new Company("Data Maesters");
//        Company greyMatter = new Company("Grey Matter");
//
//        softwareMachine.getEmployees().add(johnSmith);
//        dataMaesters.getEmployees().add(stephanieClarckson);
//        dataMaesters.getEmployees().add(lindaKovalsky);
//        greyMatter.getEmployees().add(johnSmith);
//        greyMatter.getEmployees().add(lindaKovalsky);
//
//        johnSmith.getCompanies().add(softwareMachine);
//        johnSmith.getCompanies().add(greyMatter);
//        stephanieClarckson.getCompanies().add(dataMaesters);
//        lindaKovalsky.getCompanies().add(dataMaesters);
//        lindaKovalsky.getCompanies().add(greyMatter);
//
//        //When
//        companyDao.save(softwareMachine);
//        int softwareMachineId = softwareMachine.getId();
//        companyDao.save(dataMaesters);
//        int dataMaestersId = dataMaesters.getId();
//        companyDao.save(greyMatter);
//        int greyMatterId = greyMatter.getId();
//
//        //Then
//        Assert.assertNotEquals(0, softwareMachineId);
//        Assert.assertNotEquals(0, dataMaestersId);
//        Assert.assertNotEquals(0, greyMatterId);
//
//        //CleanUp
//        try {
//            companyDao.delete(softwareMachineId);
//            companyDao.delete(dataMaestersId);
//            companyDao.delete(greyMatterId);
//        } catch (Exception e) {
//            //do nothing
//        }
//    }
//}

