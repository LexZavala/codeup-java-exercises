package KitchenApp;
//    Abstract class is a super class, but it cannot be directly instantiated.

public class ApplianceTest {

    public static void main(String[] args) {
//        Appliance app1 = new Appliance();

        Refrigerator app1 = new Refrigerator("two door", "LG", true);

        System.out.println(app1.brandName);
        System.out.println(app1.type);
        System.out.println(app1.isHasIce());
        app1.sayHello();
        app1.keepFresh();

        //   You cannot reference hasIce on the above due to hasIce not being available in appliance

//        Refrigerator app2 = new Refrigerator("two door", "LG", true);

//        System.out.println(app2.brandName);
//        System.out.println(app2.type);
//        System.out.println(app2.isHasIce());


    }
}
