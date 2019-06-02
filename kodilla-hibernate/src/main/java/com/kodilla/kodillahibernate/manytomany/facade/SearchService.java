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
import static java.util.stream.Collectors.toList;

@Service
public class SearchService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchService.class);
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    public List<Company> searchCompanyData(String key) {
        List<Company> resultCompany = companyDao.retrieveNameByAnyChar(key);
        resultCompany.stream()
                .filter(c -> c.getName().contains(key))
                .collect(toList());
            if (resultCompany.size() == 0) {
                LOGGER.info("No criteria matching has been found");
            }
        for (Company company : resultCompany) {
            LOGGER.info("Searching result..." + "" + "Found company : " + company.getName());
        }
        return resultCompany;
    }

    public List<Employee> searchEmployeeData(String key) {

        List<Employee> resultEmployee = employeeDao.retrieveEmployeeByAnyChar(key);
        resultEmployee.stream()
                .filter(e -> e.getFirstname().contains(key)||e.getLastname().contains(key))
                .collect(toList());
        if (resultEmployee.size() == 0) {
            LOGGER.info("No criteria matching has been found");
        }
        for (Employee employee : resultEmployee) { LOGGER.info("Searching result..." + "" + "Found employee: " + employee.getFirstname() + "" + employee.getLastname());
        }
        return resultEmployee;
    }
}