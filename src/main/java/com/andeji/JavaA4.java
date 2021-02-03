package com.andeji;

import com.sun.security.ntlm.Client;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Properties;

public class JavaA4 {

    public void a4() throws IOException {
        Properties props= new Properties();
        FileInputStream input = new FileInputStream(new File("src/main/java/com/andeji/resource.properties"));
        props.load(new InputStreamReader(input, Charset.forName("UTF-8")));
        System.out.println(props);
//        prop.store(new FileOutputStream("resource.properties"), "store");
//        System.out.println(prop);
//        System.out.println(reader.getEncoding());
    }
}
