package oop;

public class MusicPlayer {
    int volume = 0;
    boolean isOn =false;

    void on(){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
     void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
     void volumeUp(){
        volume++;
        System.out.println("현재 볼륨: "+volume);
    }
     void volumeDown(){
        volume--;
        System.out.println("현재 볼륨: "+volume);
    }
     void showStatus(){
        System.out.print("현재 음악 플레이어 상태: ");
        if(isOn){
            System.out.println("ON, 볼륨: "+volume);
        }
        else{
            System.out.println("OFF");
        }
    }
}
