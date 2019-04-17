package com.kodilla.kodillahibernate.manytomany.facade;

import com.kodilla.kodillahibernate.manytomany.Company;
import com.kodilla.kodillahibernate.manytomany.CompanyDao;
import com.kodilla.kodillahibernate.manytomany.Employee;
import com.kodilla.kodillahibernate.manytomany.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SearchService {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchService.class);

    public List<Company> searchCompanyData() {
        List<Company> resultCompany = companyDao.retrieveByChar();
        for (Company company : resultCompany) {
            LOGGER.info("Searching result." + "" + "Found : " + company.getName());
            if (resultCompany.size() == 0) {
                LOGGER.info("No criteria matching has been found");
            }
        }
        return resultCompany;
    }

    public List<Employee> searchEmployeeData() {
        List<Employee> resultEmployee = employeeDao.retrieveByLastname();
        for (Employee employee : resultEmployee) {
            LOGGER.info("Searching result." + "" + "Found : " + employee.getLastname());
            if (resultEmployee.size() == 0) {
                LOGGER.info("No criteria matching has been found");
            }
        }
        return resultEmployee;
    }

}