## 2. Class là gì, Object là gì, giải thích mối quan hệ giữa chúng

- **Lớp (class):** là một bản thiết kế hoặc khuôn mẫu để tạo ra các đối tượng, dùng để mô tả các thuộc tính (dữ liệu) và hành vi (phương thức) của một nhóm đối tượng.

- **Đối tượng (object):** là một thể hiện (instance) cụ thể của class. Mỗi object có dữ liệu riêng của nó và có thể gọi các phương thức đã được định nghĩa trong class.

- **Mối quan hệ:** Class giống như bản vẽ thiết kế, còn object là ngôi nhà thật được xây từ bản vẽ đó. Từ một class có thể tạo ra nhiều object khác nhau, chúng cùng chung cấu trúc nhưng có thể mang dữ liệu khác nhau.

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
        // Tạo object car1 từ class Car
        Car car1 = new Car("Toyota", 2022);
        car1.drive();
      
        // Tạo object car2 từ class Car
        Car car2 = new Car("Honda", 2023);
        car2.drive();
        
        // Gọi phương thức drive() cho từng object
        car1.drive(); 
        car2.drive();
    }
}
