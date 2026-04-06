package chap_07;

public class class_basic {
    String model_name;
    String resolution;
    int price;
    String color;

    int serial_name;
    static int counter = 0;

    // 클래스 변수
    static boolean canautoreport = false;

    class_basic(){
        System.out.println("기본 생성자 모음");
        this.serial_name = ++counter;
    }

    class_basic(String model_name, String resolution, int price, String color){
        this();
        
        System.out.println("사용자 정의 생성자 호출");
        this.model_name = model_name;
        this.resolution = resolution;
        this.color = color;
        this.price = price;
    }
    
    void append_model_name(String model_name) {
        this.model_name += model_name;
    }
}
