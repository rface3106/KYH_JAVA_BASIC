package hr0627;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(50);

        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeDown();
        speaker.volumeDown();
        speaker.volumeDown();
        speaker.volumeDown();
        speaker.showVolume();
    }  
}
