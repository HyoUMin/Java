package chap_08;

import chap_08.camera.factory_cam; // chap_08로 수정
import chap_08.camera.speed_cam;   // chap_08로 수정

public class abstraction {
    public static void main(String[] args) {
        factory_cam factory_cam = new factory_cam();
        factory_cam.show_main_feature();

        speed_cam speed_cam = new speed_cam();
        speed_cam.show_main_feature();
    }
}
