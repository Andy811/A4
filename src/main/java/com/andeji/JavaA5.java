package com.andeji;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class JavaA5 {


    String algorithm[] = {"MD2", "MD5", "SHA-1", "SHA-256", "SHA-384", "SHA-512"};

    public String stringHash(String input, int algorithmNum, String salt) {
        try {
            // 拿到一個轉換器
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm[algorithmNum]);
            // 輸入的字串轉換成位元組陣列

            messageDigest.update(salt.getBytes());
            messageDigest.update(input.getBytes());
            byte[] inputByteArray = messageDigest.digest();
            // inputByteArray是輸入字串轉換得到的位元組陣列


            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < inputByteArray.length; i++) {
                sb.append(Integer.toString((inputByteArray[i] & 0xff) + 0x100, 16).substring(1));
            }
//            System.out.println(Integer.toString((inputByteArray[0] & 0xff) +  0x100, 16).substring(1));
            String generatedPassword = sb.toString();


            return generatedPassword;
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }


    public String getSalt() throws NoSuchAlgorithmException {
//Always use a SecureRandom generator
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
//Create array for salt
        byte[] salt = new byte[16];
//Get a random salt
        sr.nextBytes(salt);
//return salt
        return salt.toString();
    }

//    public String fileMD5(String inputFile) throws IOException {
//
//        // 緩衝區大小（這個可以抽出一個引數）
//
//        int bufferSize = 256 * 1024;
//
//
//        FileInputStream fileInputStream = null;
//
//        DigestInputStream digestInputStream = null;
//
//
//        try {
//
//            // 拿到一個MD5轉換器（同樣，這裡可以換成SHA1）
//            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
//            // 使用DigestInputStream
//            fileInputStream = new FileInputStream(inputFile);
//            digestInputStream = new DigestInputStream(fileInputStream, messageDigest);
//            // read的過程中進行MD5處理，直到讀完檔案
//            byte[] buffer = new byte[bufferSize];
//            while (digestInputStream.read(buffer) > 0) ;
//            // 獲取最終的MessageDigest
//            messageDigest = digestInputStream.getMessageDigest();
//            // 拿到結果，也是位元組陣列，包含16個元素
//            byte[] resultByteArray = messageDigest.digest();
//            // 同樣，把位元組陣列轉換成字串
//            return byteArrayToHex(resultByteArray);
//        } catch (NoSuchAlgorithmException e) {
//            return null;
//        } finally {
//            try {
//                digestInputStream.close();
//            } catch (Exception e) {
//            }
//            try {
//                fileInputStream.close();
//            } catch (Exception e) {
//            }
//        }
//    }

//    public static String calculateMessageDigest(String algorithm,byte[] buffer){
//
//        MessageDigest messageDigest;
//        try {
//            messageDigest = MessageDigest.getInstance(algorithm);
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//            return "";
//        }
//
//        messageDigest.update(buffer);
//
//        byte[] md5Digest = messageDigest.digest();
//
//        StringBuilder sb = new StringBuilder();
//        for (byte b:md5Digest){
//            sb.append(String.format("%02x",b));
//        }
//        return sb.toString();
//    }
//
//    public static String getMessageDigest(String algorithm,byte[] data){
//        if(algorithm.equalsIgnoreCase("MD2")){return calculateMessageDigest("MD2",data);}
//        if(algorithm.equalsIgnoreCase("MD5")){return calculateMessageDigest("MD5",data);}
//        if(algorithm.equalsIgnoreCase("SHA-1")){return calculateMessageDigest("SHA-1",data);}
//        if(algorithm.equalsIgnoreCase("SHA-256")){return calculateMessageDigest("SHA-256",data);}
//        if(algorithm.equalsIgnoreCase("SHA-384")){return calculateMessageDigest("SHA-384",data);}
//        if(algorithm.equalsIgnoreCase("SHA-512")){return calculateMessageDigest("SHA-512",data);}
//
//        return "";
//    }
}
