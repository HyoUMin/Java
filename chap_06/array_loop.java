package chap_06;

public class array_loop {
    public static void main(String[] args) {
        String coffees[] = new String[]{"아메리카노", "에스프레소", "카페라떼", "아인슈페너"};
        for (int i = 0; i < 4; i++){
            System.out.println(coffees[i]);
        }
        System.out.println();

        // 배열길이 파악하기
        System.out.println(coffees.length);
        System.out.println();


         for (int i = 0; i < coffees.length; i++){
            System.out.println(coffees[i]);
        }

        System.out.println();
         for (String coffee : coffees){
            System.out.println(coffee);
        }
    }
    
}
