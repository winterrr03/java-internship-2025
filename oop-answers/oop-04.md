## Câu 4: Abstract class là gì?

**Abstract class** trong Java là một lớp được khai báo với từ khóa `abstract`. Nó không thể tạo đối tượng trực tiếp thông thường mà chỉ được dùng làm lớp cha cho các lớp con kế thừa. 

Abstract class có thể chứa:
- **Phương thức trừu tượng (abstract method):** chỉ khai báo, không có phần thân. Các lớp con bắt buộc phải cài đặt lại.
- **Phương thức bình thường:** có sẵn phần thân, lớp con có thể dùng lại hoặc ghi đè.
- **Thuộc tính và constructor** như các lớp thông thường.

Thông thường, abstract class không thể được khởi tạo bằng `new`. Tuy nhiên, Java hỗ trợ một ngoại lệ: có thể dùng **anonymous class** để tạo một đối tượng từ abstract class bằng cách định nghĩa ngay phần cài đặt cho các phương thức trừu tượng tại chỗ.

### Ví dụ

```java
// Abstract class
abstract class Animal {
    // Phương thức trừu tượng
    public abstract void makeSound();

    public void eat() {
        System.out.println("This animal is eating.");
    }
}

// Lớp con kế thừa và triển khai phương thức trừu tượng
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        // ❌ Sai: không thể khởi tạo trực tiếp
        // Animal a = new Animal();

        // ✅ Cách 1: tạo đối tượng từ lớp con cụ thể
        Dog dog = new Dog();
        dog.eat();       // dùng từ lớp cha
        dog.makeSound(); // override từ lớp con

        // ✅ Cách 2: tạo đối tượng qua anonymous class
        Animal cat = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Meow Meow!");
            }
        };
        cat.eat();
        cat.makeSound();
    }
}
