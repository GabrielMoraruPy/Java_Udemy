public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Porche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("Black");
//        car.model = "Carrera";
//        car.color = "Red";

        System.out.println("Make = " +car.getMake());
        System.out.println("Model = " + car.getModel());
        System.out.println("Color = " + car.getColor());
        System.out.println("Number of doors = " + car.getDoors());

        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("Black");

        targa.describeCar();
    }
}