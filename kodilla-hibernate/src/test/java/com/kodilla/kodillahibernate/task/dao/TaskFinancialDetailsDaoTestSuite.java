package com.kodilla.kodillahibernate.task.dao;
//
//import com.kodilla.kodillahibernate.task.Task;
//import com.kodilla.kodillahibernate.task.TaskFinancialDetails;
//import com.kodilla.kodillahibernate.tasklist.dao.TaskFinancialDetailsDao;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.math.BigDecimal;
//import java.util.List;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class TaskFinancialDetailsDaoTestSuite {
//
//    @Autowired
//    TaskFinancialDetailsDao taskFinancialDetailsDao;
//
//    @Test
//    public void testFindByPaid(){
//        //Given
//        TaskFinancialDetails taskFinancialDetails = new TaskFinancialDetails(new BigDecimal(11),false);
//        taskFinancialDetailsDao.save(taskFinancialDetails);
//        int id = taskFinancialDetails.getId();
//        //When
//        List<TaskFinancialDetails> result = taskFinancialDetailsDao.findByPaid(false);
//        //Then
//        Assert.assertEquals(1,result.size());
//        //CleanUp
//        //taskFinancialDetailsDao.delete(id);
//    }
//
//}
