package chap_04;

public class for_basic {
    public static void main(String[] args) {
        // 0부터 9까지
        for (int i = 0; i < 10 ; i++) {
            System.out.println("안녕" +" " + i);
        }
        System.out.println();

        // 짝수만 출력
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i); // println 은 줄바꿈해줌
        }
        System.out.println();
        
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }
        System.out.println();

        // 거꾸로 읽기
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();

        // 거꾸로 읽기
        for (int i = 10; i > 0; i -= 2) {
            System.out.println(i);
        }

    }
}
