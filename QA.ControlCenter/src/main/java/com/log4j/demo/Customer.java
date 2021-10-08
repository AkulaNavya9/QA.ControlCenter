package com.log4j.demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import lombok.extern.log4j.Log4j2;
public class Customer {
    static Logger logger = Logger.getLogger(Customer.class);
    public static void main(String[] args) { 
    	
    	DOMConfigurator.configure(Log4j2.xml);
    logger.error("This is ERROR message");
        logger.warn("This is WARNING message"); 
    logger.fatal("This is FATAL message");
        logger.debug("This is DEBUG message");
        logger.info("This is INFO message");
        System.out.println("Final Output");
    }
}
