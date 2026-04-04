package chap_01;

public class variables {
    public static void main(String[] args) {
        String name = "효유민";
        int hour = 4;
        System.out.println(name + "님, " + hour + "시에 배송 예정입니다.");
        System.out.println(name + "님, 배송완료되었습니다.");

        System.out.println();
        
        double score = 90.4;
        char grade = 'A';

        System.out.println(name + "님의 점수는 " + score + "점입니다.");
        System.out.println("등급은 " + grade + "입니다");


        double d = 3.14123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

        long l = 1_000_000_000_000L;
        System.out.println(l);

        // int, float, double, long, char, boolean

    }
}
