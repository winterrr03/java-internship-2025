## 11. Generic là gì, sử dụng generic có tác dụng gì

### Generic
**Generic** là cơ chế trong Java cho phép **khai báo class, interface hoặc method** làm việc với nhiều **kiểu dữ liệu khác nhau** mà vẫn đảm bảo **an toàn kiểu dữ liệu (type-safety)** tại compile-time.

### Tác dụng của Generic
- **Tái sử dụng code:** cùng một class hoặc method có thể sử dụng cho nhiều kiểu dữ liệu khác nhau.
- **An toàn kiểu dữ liệu:** compiler kiểm tra loại dữ liệu, giảm lỗi `ClassCastException`.
- **Code rõ ràng:** không cần ép kiểu khi lấy dữ liệu từ collection.

### Wildcard (`?`)
Wildcard cho phép **tham chiếu tới một generic type không xác định**, hữu ích khi viết method tổng quát:
- `<?>` : bất kỳ kiểu nào.
- `<? extends T>` : kiểu T hoặc subclass của T.
- `<? super T>` : kiểu T hoặc superclass của T.

### Ví dụ 1: Generic class
```java
class Box<T> {
    private T content;

    void set(T content) { 
        this.content = content; 
    }
    
    T get() { 
        return content; 
    }
}

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println(stringBox.get()); // Output: Hello

        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println(intBox.get()); // Output: 123
    }
}
```

### Ví dụ 2: Generic method
```java
public class Utils {
    public static <T> void printArray(T[] arr) {
        for (T elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        String[] words = {"Java", "Generic"};

        printArray(numbers); // Output: 1 2 3
        printArray(words);   // Output: Java Generic
    }
}
```

### Ví dụ 3: Wildcard với method
```java
import java.util.List;

public class Main {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3);
        List<String> words = List.of("Java", "Generic");

        printList(numbers); // Output: 1 2 3
        printList(words);   // Output: Java Generic
    }
}
```