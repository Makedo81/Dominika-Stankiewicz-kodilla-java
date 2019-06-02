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
        public void testSearchingCompanyData() {
            //Given
            Company softwareMachine = new Company("Software Machine");
            Company dataMaesters = new Company("Data Maesters");
            Company greyMatter = new Company("Grey Matter");

            companyDao.save(softwareMachine);
            int softwareMachineId = softwareMachine.getId();
            companyDao.save(dataMaesters);
            int dataMaestersId = dataMaesters.getId();
            companyDao.save(greyMatter);
            int greyMatterId = greyMatter.getId();

            //When
            List<Company> result1 = searchService.searchCompanyData("da");
            List<Company> result2 = companyDao.retrieveNameByAnyChar("da");
            List<Company> result3 = searchService.searchCompanyData("t");
            List<Company> result4 = searchService.searchCompanyData("ds");

            //Then
            Assert.assertEquals(1, result1.size());
            Assert.assertEquals(1, result2.size());
            Assert.assertEquals("Data Maesters",result1.get(0).getName());
            Assert.assertEquals(3, result3.size());
            Assert.assertEquals(0, result4.size());

            //CleanUp
            try {
                companyDao.delete(softwareMachineId);
                companyDao.delete(dataMaestersId);
                companyDao.delete(greyMatterId);
            } catch (Exception e) {
                //do nothing
            }
        }
    @Test
    public void testSearchingEmployeeData() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee annaSmith = new Employee("Anna", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee adamMohn = new Employee("Adam", "Mohn");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(annaSmith);
        dataMaesters.getEmployees().add(annaSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(adamMohn);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        annaSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);
        adamMohn.getCompanies().add(dataMaesters);

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //When
        List<Employee> result1 = searchService.searchEmployeeData("ko");
        List<Employee> result2 = searchService.searchEmployeeData("s");
        List<Employee> result3 = searchService.searchEmployeeData("hn");
        List<Employee> result4 = searchService.searchEmployeeData("koss");

        //Then
        Assert.assertEquals(1, result1.size());
        Assert.assertEquals(4, result2.size());
        Assert.assertEquals(2, result3.size());
        Assert.assertEquals(0, result4.size());
        Assert.assertEquals("Linda",result1.get(0).getFirstname());

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

