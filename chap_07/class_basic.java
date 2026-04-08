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

    // Getter  & Setter
    String get_moduel_name(){
        return model_name;
    }
    void set_model_name(String model_name){
        this.model_name = model_name;
    }

    String get_resolution(){
        if (resolution == null || resolution.isEmpty()){ // isEmpty() "" 빈문자열일 경우 True
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    void set_resolution(String resolution){
        this.resolution = resolution;
    }

    int get_price(){
        return price;
    }

    void set_price(int price){
        if (price < 100000){
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    String get_color(){
        return color;
    }

    void set_color(String color){
        this.color = color;
    }
}
