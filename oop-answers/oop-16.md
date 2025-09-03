## 16. Từ khoá static dùng để làm gì, tại sao từ một static method, ta không thể truy cập được đến non-static method

### `static` dùng để làm gì?
Trong Java, từ khóa `static` được dùng để khai báo **các thành viên thuộc về lớp (class)** thay vì thuộc về từng đối tượng (instance).

Cụ thể:
- **Static variable (biến tĩnh):** chỉ có một bản duy nhất cho cả lớp, mọi đối tượng cùng chia sẻ.
- **Static method (phương thức tĩnh):** có thể gọi trực tiếp qua tên lớp, không cần tạo đối tượng.
- **Static block:** khối lệnh đặc biệt, chạy **một lần duy nhất** khi lớp được nạp vào JVM.
- **Static nested class:** lớp lồng bên trong có thể tồn tại mà không cần đối tượng của lớp ngoài.

### Ví dụ:

```java
class MathUtils {
    static final double PI = 3.14159;   // biến static

    static int square(int x) {          // phương thức static
        return x * x;
    }
}

public class Main {
    public static void main(String[] args) {
        // Truy cập trực tiếp qua tên lớp
        System.out.println(MathUtils.PI);
        System.out.println(MathUtils.square(5));
    }
}
```

### Tại sao static method không thể truy cập non-static method?

Phương thức non-static thuộc về từng đối tượng cụ thể, nên khi gọi nó cần có một đối tượng để xác định dữ liệu sẽ dùng. Ngược lại, phương thức static gắn với lớp, có thể chạy mà không cần tạo đối tượng. Vì vậy trong static method không có đối tượng nào tồn tại, nên không thể gọi trực tiếp thành viên non-static.

### Ví dụ:

```java
class Person {

    void sayHello() { // non-static
        System.out.println("Hello");
    }

    static void greet() { // static
        // sayHello(); // Lỗi: không có đối tượng cụ thể để gọi
        System.out.println("Hi from static!");
    }
}
```
