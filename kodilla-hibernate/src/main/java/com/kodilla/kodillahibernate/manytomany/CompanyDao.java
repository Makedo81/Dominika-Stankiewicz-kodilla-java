package com.kodilla.kodillahibernate.manytomany;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company,Integer> {

    @Query(nativeQuery = true)
    List<Company> retrieveByChar();
}
