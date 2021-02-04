package com.andeji;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class JavaA3 {

    public void a3() {
        Logger logger1 = (Logger) LogManager.getLogger(Main.class);

        logger1.debug("This will be printed on debug");
        logger1.info("This will be printed on info");
        logger1.warn("This will be printed on warn");
        logger1.error("This will be printed on error");
        logger1.fatal("This will be printed on fatal");

        Logger logger2 = (Logger) LogManager.getLogger(JavaA3Log2.class);
        logger2.debug("debug");
    }
}
