package hr0610;

public class Class1 {
    public static void main(String[] args) {
        String[] studentnames = {"학생1", "학생2", "학생3"};
        int[] studentages = {15, 16, 17};
        int[] studentgrades = {50, 60, 70};


        for (int i =0; i<studentnames.length ; i++){
            System.out.println("이름: "+studentnames[i]+" 나이: "+studentages[i]+" 점수: "+studentgrades[i]);
        }

    }
}
