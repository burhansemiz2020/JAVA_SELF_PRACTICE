package Questions_StringManipulations;

public class Q05_startsWith {
    public static void main(String[] args) {
        String str="Java harika";
        System.out.println(str.startsWith("Java"));
        System.out.println(str.startsWith("Ja"));
        System.out.println(str.startsWith(str));//cumlenin tamami
    }
}
