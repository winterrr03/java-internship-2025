## 5. Interface là gì?

**Interface** trong Java được dùng để định nghĩa một tập hợp các phương thức trừu tượng (chỉ khai báo mà không có phần thân). Một lớp có thể triển khai (implement) nhiều interface cùng lúc.

Từ Java 8 trở đi, interface có thể chứa:
- **Phương thức trừu tượng** (abstract method): lớp triển khai bắt buộc phải định nghĩa.
- **Phương thức mặc định** (default method): có sẵn phần thân, lớp triển khai có thể dùng ngay hoặc ghi đè.
- **Phương thức tĩnh** (static method).
- **Hằng số** (public static final).

### Ví dụ

```java
// Định nghĩa một interface
interface Animal {
    void makeSound(); // phương thức trừu tượng
    void eat();       // phương thức trừu tượng
}

// Lớp triển khai interface
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }
}

// Một lớp khác cũng có thể triển khai cùng interface
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
