package hr0629.b;

import hr0629.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

     /*   data.defaultField = 2;
        data.defaultMethod();*/

        data.innerAccess();
    }
}
