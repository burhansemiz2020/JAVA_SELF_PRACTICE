package Questions_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Q19_Arrays_ArrayListW3_Q14_CommonElementsStr {
    public static void main(String[] args) {
        /*
        Write a Java program to find the common elements between two arrays (string values).
        "Python", "JAVA", "PHP", "C#", "C++", "SQL"
        "MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"
         */
        String[] list1={"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] list2={"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        // we have to change the lists to the ArrayList:
        ArrayList<String> serie1=new ArrayList<>(Arrays.asList(list1));
        ArrayList<String> serie2=new ArrayList<>(Arrays.asList(list2));
        //find the common element
        serie1.retainAll(serie2);
        //Print the common element
        System.out.println("Common elements: " +serie1);


    }
}
