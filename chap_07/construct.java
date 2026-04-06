package chap_07;

public class construct {
    public static void main(String[] args) {
        class_basic b1 = new class_basic("하양이", "UHD", 300000, "화이트");
        System.out.println(b1.model_name);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);

    }
    
}
