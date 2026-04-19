package chap_07;

public class speed_cam extends camera{ // 자식클래스로 사용할거임
    public String name;

    public speed_cam () { 
        this.name = "과속단속 카메라";
    }
    // 상속받았기 떄문에 필요없는 코드임.
    // public void take_picture() {
    //     // 사진 촬영
    //     System.out.println("사진을 촬영합니다.");
    // }

    // public void record_video() {
    //     // 동영상 녹화
    //     System.out.println("동영상을 녹화합니다.");
    // }

    public void check_speed() {
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }

    public void recognize_license_plate() {
        System.out.println("차량 번호를 인식합니다.");
    }
}
