## 19. Giải thích khối lệnh try-catch và try-catch-resource

### 1. Khối lệnh try-catch
- Dùng để xử lý ngoại lệ (exception) trong Java.
- Khi đoạn code trong `try` xảy ra lỗi, chương trình không bị dừng đột ngột mà nhảy sang `catch` để xử lý.
- Có thể có nhiều `catch` để bắt nhiều loại ngoại lệ khác nhau.

**Ví dụ:**

```java
public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Running");
    }
}
```

### 2. Khối lệnh try-with-resources (Java 7+)
- Dùng khi làm việc với resource (nguồn tài nguyên) như: file, stream, socket, kết nối database.
- Ưu điểm: tự động đóng tài nguyên sau khi khối try kết thúc, mà không cần gọi close() trong finally.
- Điều kiện: lớp tài nguyên phải implement AutoCloseable hoặc Closeable.

**Ví dụ:**

```java
public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
```
