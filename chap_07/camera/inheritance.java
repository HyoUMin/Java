package chap_07.camera;

public class inheritance {
    public static void main(String[] args){ // 상속
        // 객체 생성 기본방식
        // camera camera = new camera();
        // factory_cam factory_cam = new factory_cam();
        // speed_cam speed_cam = new speed_cam();

        // 부모클래스로 자식클래스 생성가능함. - > 다형성
        camera camera = new camera();
        camera factory_cam = new factory_cam();
        camera speed_cam = new speed_cam();
        System.out.println(camera.name);
        System.out.println(factory_cam.name);
        System.out.println(speed_cam.name);
        System.out.println();

        camera.take_picture();
        factory_cam.record_video();
        speed_cam.take_picture();
        System.out.println();

        // 부모클래스로 객체 생성했기 때문에 자식클래스에 있는 객체는 사용불가함.
        // factory_cam.detect_fire();
        // speed_cam.recognize_license_plate();
        // speed_cam.check_speed();

        System.out.println();

        if (camera instanceof camera){
            System.out.println("카메라입니다.");
        }
        // 형변환해줘야 자식클래스 객체 사용가능함.
        if (factory_cam instanceof factory_cam){
            ((factory_cam)factory_cam).detect_fire(); 
        }

    }
}
 
        