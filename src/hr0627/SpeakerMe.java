package hr0627;

public class SpeakerMe {
    int volume;
    boolean isOn;

    SpeakerMe(int volume){
        this.volume = volume;
        this.isOn = isOn;
    }

   void volumeUp(){
        if (volume<100){
            this.volume=volume++;
        }
        else {
            System.out.println("최대 볼륨입니다");
        }
    }

    void volumeDown(){
        this.volume=volume--;
    }

    void status(){
        if(isOn==true){
            System.out.println("ON");
        }
        else {
            System.out.println("OFF");
        }
    }
}
