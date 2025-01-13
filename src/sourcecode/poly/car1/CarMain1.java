package sourcecode.poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        // 차량 선택(K3)
        K3Car K3Car = new K3Car();
        driver.setCar(K3Car);
        driver.drive();

        // 차량 변경(K3 -> model3)
        Model3Car Model3Car = new Model3Car();
        driver.setCar(Model3Car);
        driver.drive();

        // 차량 변경(model3 -> newCar)
        NewCar NewCar = new NewCar();
        driver.setCar(NewCar);
        driver.drive();
    }

}
