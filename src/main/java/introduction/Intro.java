package introduction;

public class Intro {
    static interface StringTransformer {
        String transform(String input);
    }
    public static void main(String[] args) {
        System.out.println("Hei");
    }

    public static String toUpperCase(String s){
        return transformString(s, String::toUpperCase);
    }

    static String transformString(String input, StringTransformer transformer){
        return transformer.transform(input);
    }
}
