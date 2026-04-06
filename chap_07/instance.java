package chap_07;

public class instance {
    public static void main(String[] args) {
        class_basic b1 = new class_basic();
        b1.model_name = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";
        
        System.out.println(b1.model_name);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);
        System.out.println(class_basic.canautoreport);
    }
    
}
