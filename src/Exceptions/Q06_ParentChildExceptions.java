package Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q06_ParentChildExceptions {
    public static void main(String[] args) {
        String dosyaYolu="C:\\Users\\semiz\\OneDrive\\Bureau\\TESTER QA\\JAVA\\JAVA_SELF_PRACTICE\\src\\GrupCalismasi\\text.txt";
        FileInputStream fis=null;
        try {
            fis=new FileInputStream(dosyaYolu);
            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }

    }

