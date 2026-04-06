package chap_06;

public class multi_array {
    // 3 x 5 크기의 2차원 배열
    public static void main(String[] args) {
        String seats[][] = new String[][]{
            {"A1", "A2", "A3", "A4", "A5"},
            {"B1", "B2", "B3", "B4", "B5"},
            {"C1", "C2", "C3", "C4", "C5"}
        };

        //  B2에 접근하기
        System.out.println(seats[1][1]);
    }
}
