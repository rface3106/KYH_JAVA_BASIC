package hr0702;

public class DataMain {
    public static void main(String[] args) {
        Data data = new Data();
        System.out.println("1="+data);
        data=null;
        System.out.println("2="+data);
        data=new Data();
        System.out.println("3="+data);


    }
}
