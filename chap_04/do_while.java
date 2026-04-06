package chap_04;

public class do_while {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;
        int height = 25;

        do {
            System.out.println("달리기를 계속합니다.");
            System.out.println();
            System.out.println("현재 이동 거리" + " " +  move);
            move += 1;
        }
        while(move + height < distance); {
            System.out.println(("도착했습니다."));
        }
    }
}
