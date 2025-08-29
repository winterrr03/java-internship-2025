## 10. Anonymous class là gì, lúc nào thì ta nên dùng anonymous class

### Anonymous class
**Anonymous class** (lớp ẩn danh) là một lớp **không có tên** được khai báo và **khởi tạo trực tiếp** trong một biểu thức. Nó thường **mở rộng một lớp (extends)** hoặc **triển khai một interface (implements)** ngay tại chỗ, và thường dùng khi chỉ cần tạo **một object duy nhất**.

### Khi nào nên dùng
- Khi muốn **tạo object duy nhất** mà không cần định nghĩa một lớp riêng biệt.
- Khi muốn **ghi đè nhanh phương thức của một lớp hoặc interface** cho mục đích cụ thể.
- Thường dùng trong **callback, listener, hoặc Runnable/Thread**.

### Ví dụ 1: Anonymous class triển khai interface
```java
interface Greeting {
    void sayHello();
}

public class Main {
    public static void main(String[] args) {
        Greeting g = new Greeting() { // anonymous class
            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous class!");
            }
        };

        g.sayHello();
    }
}
```

### Ví dụ 2: Anonymous class mở rộng abstract class
```java
abstract class Vehicle {
    abstract void start();
    void info() { 
        System.out.println("This is a vehicle"); 
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle() { // anonymous class
            @Override
            void start() {
                System.out.println("Anonymous vehicle starting quickly!");
            }
        };

        v.start();  
        v.info();
    }
}
```