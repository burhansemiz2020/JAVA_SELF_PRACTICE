package Questions_StringManipulations;

public class Q08_IndexOf {
    public static void main(String[] args) {
        String str="Java cok ama cok guzel";
        System.out.println(str.indexOf("c"));//ou est l'index de c??==5
        System.out.println(str.indexOf("cok"));
        /*
        Java prend le mot "cok" comme un character
        donc il compte l'index de cok avec "c"
        car le mot commence avec c
         */
        System.out.println(str.indexOf("cok", 6));//13
        /*
        Dans ce cas java cherche str cok apres
        l'index de sixieme donc l'index de cok est 13
         */
        //Cependant
        System.out.println(str.indexOf("cok", 5));//5
        /*
        ici apres 5eme index il commence compter
        et alors l'index de cok a ete change
         */
        System.out.println(str.indexOf("java"));
        /*
        dans le phrase n'y a pas de le mot ou chr java
        il ya Java. donc avec le method indexOf dans ce cas
        le resultat dans le consol est egale -1
        Quand tu vois -1 sur le consol cest a dire
        n'y a pas de chr
         */
    }
}
