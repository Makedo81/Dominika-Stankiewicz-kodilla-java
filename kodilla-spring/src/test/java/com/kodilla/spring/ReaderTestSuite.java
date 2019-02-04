package com.kodilla.spring;

import com.kodilla.spring.reader.Reader;
import com.kodilla.spring.reader.ReaderConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ReaderTestSuite {

    @Test
    public void testRead() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
    }
}
