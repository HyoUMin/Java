package chap_07.camera;

public class inheritance {
    public static void main(String[] args){
            // 상속
        camera camera = new camera();
        factory_cam factory_cam = new factory_cam();
        speed_cam speed_cam = new speed_cam();

        System.out.println(camera.name);
        System.out.println(factory_cam.name);
        System.out.println(speed_cam.name);

        camera.take_picture();
        factory_cam.record_video();
        speed_cam.take_picture();
        factory_cam.detect_fire();
        speed_cam.recognize_license_plate();
        speed_cam.check_speed();
    }
}
 
        