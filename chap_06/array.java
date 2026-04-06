package chap_06;

public class array {
    public static void main(String[] args) {
        /* String coffees[] = new String[4];
        // String[] coffees = new String[4]; 배열 선언 다른 형태
        
        coffees[0] = "아메리카노";
        coffees[1] = "에스프레소";
        coffees[2] = "카페라떼";
        coffees[3] = "아인슈페너";
        */

        String coffees[] = new String[]{"아메리카노", "에스프레소", "카페라떼", "아인슈페너"};
        System.out.println();
        System.out.println(coffees[0] + " 한 잔");

        // 배열 값 수정하기
        coffees[2] = "카페모카";
        System.out.println(coffees[2]);

    }
    
}
