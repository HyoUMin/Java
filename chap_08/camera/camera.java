package chap_08.camera;

public abstract class camera { // 추상클래스 선언
    public void take_picture(){
        System.out.println("사진을 촬영합니다.");
    }

    public void record_video(){
        System.out.println("동영상을 녹화합니다.");
    }


    public abstract void show_main_feature(); // 추상 메소드
}
