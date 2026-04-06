package chap_03;

public class string1 {
    public static void main(String[] args) {
        String s = "I like python and java and C.";
        System.out.println(s);
        System.out.println();

        // 문자열 길이 확인하기
        System.out.println(s.length());
        System.out.println();

        // 대소문자 변경하기
        System.out.println(s.toUpperCase()); // 대문자로
        System.out.println(s.toLowerCase()); // 소문자로
        System.out.println();

        // 해당하는 것이 포함되는지 확인 
        System.out.println(s.contains("C++")); 
        System.out.println();

        // 해당하는 것이 시작되는 위치 확인
        System.out.println(s.indexOf("java")); // 처음 일치하는 위치 정보
        System.out.println(s.indexOf("C++"));  // 포함되지 않으면 -1
        System.out.println(s.lastIndexOf("and")); // 마지막 일치하는 위치정보
        System.out.println();

        System.out.println(s.startsWith("I")); // 이 문자열로 시작하는지 확인
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나는지 확인
    }
}
