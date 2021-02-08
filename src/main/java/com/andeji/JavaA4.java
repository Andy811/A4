package com.andeji;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.io.*;
import java.util.Properties;

public class JavaA4 {

    public JavaA4() throws IOException {
    }

    public void a4(String propertiesName, String fileName) throws IOException {
        Logger logger = (Logger) LogManager.getLogger(JavaA4.class);
        Properties props = new Properties();

        FileInputStream input = new FileInputStream(new File(propertiesName));
        //"src/main/java/com/andeji/resource.properties"
        props.load(new InputStreamReader(input, "UTF-8"));
        //props.list(System.out);


        logger.info(props);
        props.list(System.out);

        File file = new File(fileName);//hello.txt
        file.createNewFile();
        // writeProperties(props);
        FileWriter writer = new FileWriter(file);

        for (Object key : props.keySet()) {
            System.out.println("[" + key + "," + props.get(key) + "]");
            writer.write("[" + key + "," + props.get(key) + "]\n");
        }
        writer.flush();
        writer.close();

    }



}
