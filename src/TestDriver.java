public class TestDriver {
    public static void run(){
        testPerson();
        testShop();
        testCar();
    }
    public static void testPerson(){
        Person p = new Person("Alex");

        System.out.println("The person is " + p.getName());
        p.setAge(50);
        System.out.println("The age is " + p.getAge());
    }
    public static void testCar(){
        Car c = new Car("Volvo");
        System.out.println("The manufacturer is " + c.getManufacturer());

        Car c2 = new Car("BMW");
        System.out.println("The manufacturer is " + c2.getManufacturer());
    }
    public static void testShop(){
        Shop s = new Shop("Centra");
        System.out.println("The shop is "+ s.getName());
    }

}
