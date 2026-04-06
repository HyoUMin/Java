package chap_01;

import java.util.stream.IntStream.IntMapMultiConsumer;

public class type_casting {
    public static void main(String[] args) {
        int score = 93;
        System.out.println(score);
        System.out.println((float)score);
        System.out.println();
        
        // 정수형을 문자열로 캐스팅
        String s1 = String.valueOf(93);
        System.out.println(s1);
        System.out.println(s1.getClass().getName());
        System.out.println();
        
        // 정수형을 문자열로 캐스팅
        s1 = Integer.toString(93);
        System.out.println(s1);
        System.out.println(s1.getClass().getName());
        System.out.println();
        
        // 실수형을 문자열로 캐스팅
        String s2 = String.valueOf(98.8);
        System.out.println(s2);
        System.out.println(s2.getClass().getName());
        System.out.println();

        // 문자열을 정수형으로 캐스팅
        int i = Integer.parseInt("93");
        System.out.println(i);
        System.out.println(((Object)i).getClass().getSimpleName());
        System.out.println();

        // 문자열을 실수형으로 캐스팅
        double d = Double.parseDouble("98.8");
        System.out.println(d);
        System.out.println(((Object)d).getClass().getSimpleName());
        System.out.println();
        
    }
}
