## 17. Tìm hiểu và giải thích SOLID Principles

**SOLID** là tập hợp 5 nguyên tắc thiết kế hướng đối tượng (OOP), giúp mã nguồn dễ bảo trì, dễ mở rộng, và hạn chế lỗi khi hệ thống phát triển. Các nguyên tắc bao gồm:

- **S** — Single Responsibility Principle (SRP)
- **O** — Open/Closed Principle (OCP)
- **L** — Liskov Substitution Principle (LSP)
- **I** — Interface Segregation Principle (ISP)
- **D** — Dependency Inversion Principle (DIP)

### 1. Single Responsibility Principle (SRP)
**Định nghĩa:**  
Một lớp chỉ nên có **một lý do để thay đổi**, tức là chỉ đảm nhận **một trách nhiệm duy nhất**.

**Mục đích:**
- Giảm sự phụ thuộc giữa các chức năng khác nhau.
- Dễ bảo trì: thay đổi một chức năng không ảnh hưởng phần khác.

**Ví dụ vi phạm SRP:**

```java
class Report {
    void generateReport() { /* logic sinh báo cáo */ }
    void saveToFile(String fileName) { /* logic lưu file */ }
}
```

**Ví dụ đúng theo SRP:**

```java
class Report {
    void generateReport() { /* logic sinh báo cáo */ }
}

class ReportPersistence {
    void saveToFile(Report report, String fileName) { /* logic lưu file */ }
}
```

### 2. Open/Closed Principle (OCP)
**Định nghĩa:**
Một thực thể phần mềm (lớp, module, hàm,...) nên **mở để mở rộng, nhưng đóng để sửa đổi**.

**Mục đích:**
- Thêm tính năng mới mà không cần sửa code cũ.
- Bảo vệ code đang ổn định khỏi rủi ro phát sinh khi sửa đổi.

**Ví dụ vi phạm OCP:**

```java
class AreaCalculator {
    double calculate(Object shape) {
        if (shape instanceof Circle c) {
            return Math.PI * c.radius * c.radius;
        } else if (shape instanceof Rectangle r) {
            return r.width * r.height;
        }

        return 0;
    }
}
```

**Ví dụ đúng theo OCP:**

```java
interface Shape {
    double area();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    double width, height;

    Rectangle(double w, double h) {
        this.width = w; this.height = h;
    }

    public double area() {
        return width * height;
    }
}

class AreaCalculator {
    double calculate(Shape shape) {
        return shape.area();
    }
}
```

### 3. Liskov Substitution Principle (LSP)
**Định nghĩa:**
Các đối tượng của lớp con có thể thay thế được đối tượng của lớp cha mà không làm thay đổi tính đúng đắn của chương trình.

**Mục đích:**
- Giữ cho hệ thống ổn định khi áp dụng kế thừa.
- Đảm bảo tính đa hình (polymorphism) hoạt động đúng.

**Ví dụ vi phạm LSP:**

```java
class Bird {
    void fly() {
        System.out.println("Flying");
    }
}

class Ostrich extends Bird {
    @Override
    void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly!");
    }
}
```

**Ví dụ đúng theo LSP:**

```java
interface Bird {}

interface FlyableBird extends Bird {
    void fly();
}

class Sparrow implements FlyableBird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Ostrich implements Bird {
    // Không có fly, vì đà điểu không bay
}
```

### 4. Interface Segregation Principle (ISP)
**Định nghĩa:**
Không nên ép client phụ thuộc vào interface chứa **nhiều phương thức mà nó không dùng**. Thay vào đó, nên tách thành nhiều interface nhỏ, chuyên biệt.

**Mục đích:**
- Tránh “fat interface” (interface phình to).
- Tăng tính linh hoạt, dễ bảo trì.

**Ví dụ vi phạm ISP:**

```java
interface Worker {
    void work();

    void eat();
}

class Robot implements Worker {
    public void work() {
        System.out.println("Working");
    }

    public void eat() {
        throw new UnsupportedOperationException();
    }
}
```

**Ví dụ đúng theo ISP:**

```java
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {
    public void work() {
        System.out.println("Working");
    }

    public void eat() {
        System.out.println("Eating");
    }
}

class Robot implements Workable {
    public void work() {
        System.out.println("Working");
    }
}
```

### 5. Dependency Inversion Principle (DIP)
**Định nghĩa:**
- Các module cấp cao không nên phụ thuộc vào các module cấp thấp. Cả 2 nên phụ thuộc vào abstraction.
- Interface (abstraction) không nên phụ thuộc vào chi tiết, mà ngược lại. (Các class giao tiếp với nhau thông qua interface, không phải thông qua implementation).

**Mục đích:**
- Giảm sự phụ thuộc cứng (tight coupling).
- Dễ mở rộng và thay thế.

**Ví dụ vi phạm DIP:**

```java
class MySQLDatabase {
    void connect() {
        System.out.println("Connect MySQL");
    }
}

class UserService {
    private MySQLDatabase db = new MySQLDatabase();

    void process() {
        db.connect();
    }
}
```

**Ví dụ đúng theo DIP:**

```java
interface Database {
    void connect();
}

class MySQLDatabase implements Database {
    public void connect() {
        System.out.println("Connect MySQL");
    }
}

class MongoDatabase implements Database {
    public void connect() {
        System.out.println("Connect MongoDB");
    }
}

class UserService {
    private final Database db;

    UserService(Database db) {
        this.db = db;
    }

    void process() {
        db.connect();
    }
}
```
