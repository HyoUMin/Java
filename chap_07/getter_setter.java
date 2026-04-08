package chap_07;

public class getter_setter {
    public static void main(String[] args) {
        class_basic b1 = new class_basic();
        b1.model_name = "검둥이";
        b1.price = 20000;
        b1.color = "black";

        // 할인 행사
        b1.price = -5000;
        System.out.println("가격: " + b1.price + "원");

        // 고객 문의
        System.out.println("해상도: " + b1.resolution);
        System.out.println();

        class_basic b2 = new class_basic();
        b2.set_model_name("흰둥이");
        b2.set_price(-5000);
        b2.set_color("white");


        System.out.println("가격: " + b2.get_price() + "원");
        System.out.println("해상도: " + b2.get_resolution());
        
    }
    
}
