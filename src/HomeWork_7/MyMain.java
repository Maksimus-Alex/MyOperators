package HomeWork_7;

import HomeWork_7.phone.Phone;

public class MyMain {

    public static void main(String[] args) {
        getIformationsPhone();
    }
    public static void getIformationsPhone(){
        Phone phone = new Phone(80295853262L, "Sumsung", 209 );
        System.out.println(phone.getIformationPhone());

        System.out.println("**************");

        Phone iphone = new Phone(375442256892L, "IPHON11", 255);
        System.out.println(iphone.getIformationPhone());


    }
}
