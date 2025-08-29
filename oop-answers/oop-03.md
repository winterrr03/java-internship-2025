## Câu 3: Kế thừa là gì?

**Kế thừa (Inheritance)** là một trong bốn tính chất quan trọng của lập trình hướng đối tượng (OOP). Nó cho phép một lớp (lớp con) sử dụng lại các thuộc tính và phương thức đã được định nghĩa trong một lớp khác (lớp cha). Ngoài ra, lớp con có thể bổ sung thêm thuộc tính và phương thức mới, hoặc ghi đè (override) các hành vi sẵn có để thay đổi cách hoạt động. Nhờ cơ chế này, chương trình tránh được trùng lặp mã, dễ mở rộng chức năng và có cấu trúc rõ ràng hơn.

### Ví dụ

```java
// Lớp cha
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Lớp con kế thừa Animal
class Dog extends Animal {
    private String breed; // mở rộng thuộc tính

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(getName() + " (" + breed + ") is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.eat();  // kế thừa từ Animal
        dog.bark(); // phương thức riêng của Dog
    }
}
```
