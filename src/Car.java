public class Car {

    private String manufacturer;

    public Car(String _manufacturer){
        manufacturer = _manufacturer;
        System.out.println("Car is created");
    }
    public String getManufacturer(){
        return manufacturer;
    }
}
