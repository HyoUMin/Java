package chap_07;

public class camera{ // 부모 클래스로 사용할거임.
    public String name;

    public camera() {
        this.name = "카메라";
    }

    public void take_picture() {
        // 사진 촬영
        System.out.println("사진을 촬영합니다.");
    }
    public void record_video() {
        // 동영상 녹화
        System.out.println("동영상을 녹화합니다.");
    }
}
