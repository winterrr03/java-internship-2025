## 15. Từ khoá this có tác dụng gì, khi nào thì ta bắt buộc phải dùng nó

### Tác dụng
- **Tham chiếu đến chính đối tượng hiện tại** (object đang gọi).
- Dùng để:
    - Phân biệt biến **instance** với tham số **cùng tên** trong constructor hoặc method.
    - Gọi **constructor khác** trong cùng một lớp (`this(...)`).
    - Truyền tham chiếu của object hiện tại cho method khác hoặc đối tượng khác.

### Khi nào bắt buộc dùng
- Khi biến instance bị **che khuất (shadowed)** bởi biến cục bộ hoặc tham số thì cần `this` để phân biệt.
- Khi muốn gọi **constructor khác** trong cùng lớp thì bắt buộc dùng `this(...)` và phải đặt ở dòng đầu tiên trong constructor.

### Ví dụ

```java
class Person {
    String name;
    int age;

    // Dùng this để phân biệt với tham số trùng tên
    Person(String name, int age) {
        this.name = name;  // this.name = biến instance
        this.age = age;    // age = tham số
    }

    // Gọi constructor khác bằng this(...)
    Person(String name) {
        this(name, 18); // mặc định age = 18
    }

    void printInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    void greet(Person other) {
        System.out.println(this.name + " says hi to " + other.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 22);
        Person p2 = new Person("Bob");

        p1.printInfo();  // Name: Alice, Age: 22
        p2.printInfo();  // Name: Bob, Age: 18
        p1.greet(p2);    // Alice says hi to Bob
    }
}
```
