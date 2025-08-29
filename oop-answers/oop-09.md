## 9. Annotation là gì, giải thích ý nghĩa của @Override, @Deprecated

### Annotation
Là siêu dữ liệu (metadata) gắn vào code, cung cấp thông tin bổ sung cho compiler hoặc runtime mà **không ảnh hưởng trực tiếp** đến logic chương trình. Annotation thường được sử dụng để:
- Hỗ trợ compiler kiểm tra lỗi
- Hỗ trợ công cụ phát triển (IDE, framework)
- Thực hiện xử lý tại runtime

### Ý nghĩa của @Override
Đánh dấu một phương thức trong lớp con **ghi đè (override)** phương thức của lớp cha. Compiler sẽ kiểm tra nếu phương thức không ghi đè đúng (sai tên hoặc sai tham số) và báo lỗi, giúp tránh các lỗi tiềm ẩn.

```java
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    @Override
    void start() { // Ghi đè phương thức start() của Vehicle
        System.out.println("Car is starting with key");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car();

        v.start();
    }
}
```

### Ý nghĩa của @Deprecated
Đánh dấu một phương thức, lớp hoặc trường lỗi thời và không nên sử dụng. Khi code sử dụng phần tử này, compiler sẽ cảnh báo để người dùng biết nên tìm giải pháp thay thế.

```java
class LegacyPrinter {
    @Deprecated
    void printOld() {
        System.out.println("Old printing method");
    }

    void printNew() {
        System.out.println("New printing method");
    }
}

public class Main {
    public static void main(String[] args) {
        LegacyPrinter printer = new LegacyPrinter();
        printer.printOld(); // Compiler cảnh báo: method deprecated
        printer.printNew();
    }
}
```