package com.kodilla.kodillahibernate.tasklist.dao;

import com.kodilla.kodillahibernate.task.TaskFinancialDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface TaskFinancialDetailsDao extends CrudRepository <TaskFinancialDetails,Integer> {
    List<TaskFinancialDetails> findByPaid(boolean paid);
}
