package HomeWork_7;

import HomeWork_7.phone.Phone;

import java.util.SortedMap;

public class MyMain {

    public static void main(String[] args) {
        getIformationsPhone();
    }
    public static void getIformationsPhone(){


        Phone phone = new Phone(80295853262L, "Sumsung", 209 );
        System.out.println(phone.getIformationPhone() +"\n");


        Phone iphone = new Phone(375442256892L, "IPHON11", 255);
        System.out.println(iphone.getIformationPhone()+ "\n");


        Phone xiaomi = new Phone(80335297846L,"Xiaomi",200);
        System.out.println(xiaomi.getIformationPhone()+ "\n");

        phone.receiveCall("Maksim");
        System.out.println("Number: " + phone.getNumber() + "\n");

        iphone.receiveCall("Alena");
        System.out.println("Number: " + iphone.getNumber()+ "\n");

        xiaomi.receiveCall("Vlada");
        System.out.println("Number: " + xiaomi.getNumber()+ "\n");
        System.out.println("**************************");

        // receive Call и getNumber для каждого из обьектов
        // теперь перегруженный метод receiveCall
        phone.receiveCall("Max",80295852356L);
        System.out.println(phone + "\n");
        iphone.receiveCall("Alena",823345896523L);
        System.out.println(iphone+ "\n");
        xiaomi.receiveCall("Dad",80337598246L);
        System.out.println(xiaomi+ "\n");

        System.out.println("************");

        phone.sendMassage("80295852356 ");
        iphone.sendMassage("823345896523");
        xiaomi.sendMassage("80337598246");
    }
    // Просто шпаргалка что все работает при вызове констуркторов
    //Phone phone1 = new Phone();
//        System.out.println(phone1.getIformationPhone()+"\n");
//
//        Phone iphone1 = new Phone();
//        System.out.println(iphone1.getIformationPhone()+ "\n");
//
//        Phone xiaomi1 = new Phone();
//        System.out.println(xiaomi1.getIformationPhone()+ "\n");
//
//
//        System.out.println("**********************************************************");
//
//        Phone phone2 = new Phone(80295853262L, "Sumsung");
//        System.out.println(phone2.getIformationPhone()+"\n");
//
//        Phone iphone2 = new Phone(375442256892L, "IPHON11");
//        System.out.println(iphone2.getIformationPhone()+ "\n");
//
//        Phone xiaomi2 = new Phone(80335297846L,"Xiaomi");
//        System.out.println(xiaomi2.getIformationPhone()+ "\n");
//
//        System.out.println("**********************************************************");
}
