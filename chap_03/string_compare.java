package chap_03;

public class string_compare {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";

         // 대소문자 구분
        System.out.println(s1.equals("Java"));

        // 대소문자 구분 없이 문자열 내용 같은지 여부 체크
        System.out.println(s2.equalsIgnoreCase("python")); 
        System.out.println();

        
        // 문자열 비교 심화
        // 1. 어느 메모리 상에 저장되어 있는 1234를 s1, s2가 참조(같은 1234임)
        s1 = "1234"; 
        s2 = "1234";
        System.out.println(s1.equals(s2)); // 내용이 같은지 비교
        System.out.println(s1 == s2); // 참조하고 있는 것이 같은지 비교
        System.out.println();

        // 2. 어느 메모리 상에 1234가 2개 저장되어 있어서 s1, s2 각각 다른 1234를 참조
        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2); // 서로 다른 곳에 저장된 1234를 참조하므로 False
    }
}
