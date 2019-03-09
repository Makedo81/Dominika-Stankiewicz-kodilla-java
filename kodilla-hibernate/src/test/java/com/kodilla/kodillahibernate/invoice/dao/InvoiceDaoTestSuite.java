package com.kodilla.kodillahibernate.invoice.dao;

import com.kodilla.kodillahibernate.invoice.Invoice;
import com.kodilla.kodillahibernate.invoice.Item;
import com.kodilla.kodillahibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Autowired
    ProductDao productDao;

    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Product product1 = new Product("Laptop");
        Product product2 = new Product("Phone");

        Item item1 = new Item (new BigDecimal(100),1,new BigDecimal(100));
        Item item2 = new Item (new BigDecimal(200),11,new BigDecimal(400));
        item1.setProduct(product1);
        item2.setProduct(product2);


        List<Item> items = new ArrayList<>();
        Invoice invoice = new Invoice("1.0");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.setItems(items);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        productDao.save(product1);
        int product1Id = product1.getId();

        productDao.save(product2);
        int product2Id = product2.getId();
        itemDao.save(item1);
        itemDao.save(item2);


        //Then
        Assert.assertEquals(1,invoiceId);
        //Assert.assertNotEquals(0,invoiceId);

        //CleanUp
        invoiceDao.delete(invoiceId);
        productDao.delete(product1Id);
        productDao.delete(product2Id);

    }
}
