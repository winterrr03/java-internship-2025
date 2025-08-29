## 1. Hướng đối tượng là gì?

**Lập trình hướng đối tượng (OOP - Object Oriented Programming)** là một phương pháp lập trình trong đó chương trình được tổ chức xung quanh **đối tượng (object)**. Mỗi đối tượng chứa **thuộc tính (dữ liệu)** và **phương thức (hành vi)**.

### Ví dụ

```java
// Class đại diện cho một chiếc xe
class Car {
    // Thuộc tính
    private String brand;
    private int year;
    
    // Constructor
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    
    // Phương thức
    public void drive() {
        System.out.println(brand + " (" + year + ") is driving...");
    }
}

public class Main {
    public static void main(String[] args) {        
        Car car = new Car("Toyota", 2022);
        car.drive();
    }
}
