package com.andeji;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.beans.PropertyEditor;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws IOException {

//        Logger logger1 = (Logger) LogManager.getLogger(Main.class);
//
//        logger1.debug("This will be printed on debug");
//        logger1.info("This will be printed on info");
//        logger1.warn("This will be printed on warn");
//        logger1.error("This will be printed on error");
//        logger1.fatal("This will be printed on fatal");
//
//        Logger logger2 = (Logger) LogManager.getLogger(Log2.class);
//        logger2.debug("debug");
        JavaA4 a4 = new JavaA4();
        a4.a4();

    }


}
