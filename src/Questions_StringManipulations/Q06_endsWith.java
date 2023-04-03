package Questions_StringManipulations;

public class Q06_endsWith {
    public static void main(String[] args) {
        String str="Java guzeldir";
        System.out.println(str.endsWith("r"));
        System.out.println(str.endsWith("guzeldir"));
        System.out.println(str.endsWith(""));
        System.out.println(str.endsWith("Java guzeldir"));
        //hepsi true
        System.out.println(str.endsWith(str.substring(str.length()-1)));
    }
}
