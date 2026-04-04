package chap_01;

public class type_casting {
    public static void main(String[] args) {
        int score = 93;
        System.out.println(score);
        System.out.println((float)score);
        System.out.println();
        
        String s1 = String.valueOf(93);
        System.out.println(s1);

        s1 = Integer.toString(93);
        System.out.println(s1);
    }
}
