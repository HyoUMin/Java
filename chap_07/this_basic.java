package chap_07;

public class this_basic{
    public static void main(String[] args) {
        class_basic b1 = new class_basic();
        b1.model_name = "까망이";
        b1.append_model_name("최신형");
        System.out.println(b1.model_name);
        System.out.println(b1.serial_name);
        
    }   
}
