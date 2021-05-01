package oopsConcept;

public class MobileDetails {
    public static void main (String [] args) {
        MobilePhone Details1 =  new MobilePhone();
        Details1.mobileName = " One Plus 9";
        Details1.Colour = "Red";
        Details1.simFree = false;
        Details1.operatingSystem = "Android";
        Details1.displayInchSize = 6.7;
        Details1.capacityRam = 256;

        MobilePhone Details2 =  new MobilePhone();
        Details2.mobileName = "I phone 10 ";
        Details2.Colour = "Black";
        Details2.simFree = true;
        Details2.operatingSystem = "Apple";
        Details2.displayInchSize = 8.8;
        Details2.capacityRam = 512;

        System.out.println(Details1.simFree);
    }
}
