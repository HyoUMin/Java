package chap_04;

public class switch_case {
    public static void main(String[] args) {
        int ranking = 3;
        switch (ranking){
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            // case 3, 4 통합
            case 3:
            case 4:
                System.out.println("C");
                break;
        }

    }
}
