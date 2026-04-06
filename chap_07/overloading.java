package chap_07;

public class overloading {
    public static int get_power(int num){
        int result = num * num;
        return result;
    }

    public static int get_power(String strnum){
        int num = Integer.parseInt(strnum);
        int result = num * num;
        return result;
    }
    public static int get_power(int num, int exp){
        int result = 1;
        for (int i =0; i < exp; i++){
            result *= num;
        }
        return result;
    }
    public static void main(String[] args) {
        // 같은 이름의 메소드를 여러번 선언
        // 전달값의 타입이 다르거나
        // 전달값의 개수가 다르거나
        System.out.println(get_power(3));
        System.out.println(get_power("4"));
        System.out.println(get_power(3, 3));

    }
}
