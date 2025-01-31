package com.example.sa_g7_tw2_spring.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;

public class MD5 {
    public static String encoding(String pw) {
        String str = pw;
        String encoded;
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes("UTF-8"));
            byte[] bytes = messageDigest.digest();

            ByteStorage storage = new ByteStorage(bytes);

            StringBuffer sb = new StringBuffer(bytes.length * 2);

            for (Byte b : storage) {
                sb.append(hexDigits[(b >> 4) & 0x0f]);
                sb.append(hexDigits[b & 0x0f]);
            }

            //ByteIterator iterator = new ByteIterator(storage.getBytes());

//            while(iterator.hasNext()){
//                Byte b = iterator.next();
//                sb.append(hexDigits[(b >> 4) & 0x0f]);
//                sb.append(hexDigits[b & 0x0f]);
//            }

            //ShapeIterator iterator = new ShapeIterator(bytes);
//            for (Byte b : bytes) {
//                sb.append(hexDigits[(b >> 4) & 0x0f]);
//                sb.append(hexDigits[b & 0x0f]);
//            }

            encoded=sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        return encoded;
    }
}
