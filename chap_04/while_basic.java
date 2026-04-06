package chap_04;

public class while_basic {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;
        while(move < distance){
            System.out.println("달리기를 계속합니다.");
            System.out.println();
            System.out.println("현재 이동 거리" + " " +  move);
            move += 1;
        }
        System.out.println(("도착했습니다."));

    }
    
}
