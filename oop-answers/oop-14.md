## 14. Từ khoá super có tác dụng gì, khi nào thì ta bắt buộc phải dùng nó

### Tác dụng
- **Truy cập thuộc tính hoặc phương thức của lớp cha** khi bị lớp con ghi đè (override).
- **Gọi constructor của lớp cha** từ lớp con.
- Giúp phân biệt giữa thành phần ở **lớp cha** và **lớp con** khi bị trùng tên.

### Khi nào bắt buộc dùng
- Khi **constructor của lớp cha không có constructor mặc định (không tham số)** thì lớp con **bắt buộc** phải gọi `super(...)` để khởi tạo cha.
- Khi cần **gọi rõ ràng** phương thức hoặc biến ở lớp cha mà bị lớp con ghi đè hoặc che khuất (hidden).

### Ví dụ

```java
class Parent {
    String name;

    Parent(String name) {
        this.name = name;
    }

    void sayHello() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    String name;

    Child(String childName, String parentName) {
        super(parentName);
        this.name = childName;
    }

    @Override
    void sayHello() {
        super.sayHello(); // gọi phương thức lớp cha
        System.out.println("Hello from Child");
    }

    void printNames() {
        System.out.println("Child name: " + this.name);
        System.out.println("Parent name: " + super.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child("Alice", "Bob");
        c.sayHello();
        c.printNames();
    }
}
```
