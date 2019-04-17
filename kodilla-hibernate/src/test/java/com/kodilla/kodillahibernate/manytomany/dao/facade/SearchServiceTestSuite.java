package com.kodilla.kodillahibernate.manytomany.dao.facade;

import com.kodilla.kodillahibernate.manytomany.Company;
import com.kodilla.kodillahibernate.manytomany.CompanyDao;
import com.kodilla.kodillahibernate.manytomany.Employee;
import com.kodilla.kodillahibernate.manytomany.facade.SearchService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchServiceTestSuite {

    @Autowired
    SearchService searchService;
    @Autowired
    CompanyDao companyDao;


        @Test
        public void testSearchingRetrieveByAnyChar() {
            //Given
            Employee johnSmith = new Employee("John", "Smith");
            Employee annaSmith = new Employee("Anna", "Smith");
            Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
            Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

            Company softwareMachine = new Company("Software Machine");
            Company dataMaesters = new Company("Data Maesters");
            Company greyMatter = new Company("Grey Matter");

            softwareMachine.getEmployees().add(johnSmith);
            dataMaesters.getEmployees().add(annaSmith);
            dataMaesters.getEmployees().add(stephanieClarckson);
            dataMaesters.getEmployees().add(lindaKovalsky);
            greyMatter.getEmployees().add(johnSmith);
            greyMatter.getEmployees().add(lindaKovalsky);

            johnSmith.getCompanies().add(softwareMachine);
            johnSmith.getCompanies().add(greyMatter);
            annaSmith.getCompanies().add(greyMatter);
            stephanieClarckson.getCompanies().add(dataMaesters);
            lindaKovalsky.getCompanies().add(dataMaesters);
            lindaKovalsky.getCompanies().add(greyMatter);

            //When
            companyDao.save(softwareMachine);
            int softwareMachineId = softwareMachine.getId();
            companyDao.save(dataMaesters);
            int dataMaestersId = dataMaesters.getId();
            companyDao.save(greyMatter);
            int greyMatterId = greyMatter.getId();

            //When
            List<Company> resultCompany = searchService.searchCompanyData();
            List<Employee> resultEmployee = searchService.searchEmployeeData();

            //Then
            Assert.assertEquals(3, resultCompany.size());
            Assert.assertEquals(4, resultEmployee.size());

            //CleanUp
            try {
                companyDao.delete(softwareMachineId);
                companyDao.delete(dataMaestersId);
                companyDao.delete(greyMatterId);
            } catch (Exception e) {
                //do nothing
            }
        }



}
