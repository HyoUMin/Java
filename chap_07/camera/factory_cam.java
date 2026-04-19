package chap_07.camera;

public class factory_cam extends camera{// 자식 클래스로 사용할거임
    public String name;

    public factory_cam() { 
        this.name = "공장 카메라";
    }
    // 상속받아서 없어도 되는 코드 부분들
    // public void take_picture() {
    //     // 사진 촬영
    //     System.out.println("사진을 촬영합니다.");
    // }

    // public void record_video() {
    //     // 동영상 녹화
    //     System.out.println("동영상을 녹화합니다.");
    // }

    public void detect_fire() {
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }
}
