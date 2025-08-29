## Từ khoá final có tác dụng gì khi áp dụng nó lên: biến, field, parameter của hàm, method và class

Từ khóa **`final`** được sử dụng để ngăn chặn sự thay đổi: giá trị của biến không thể đổi, phương thức không thể bị ghi đè, và lớp không thể bị kế thừa, tùy theo nơi áp dụng.

### 1. Biến
- **Ý nghĩa:** giá trị không thể thay đổi sau khi được gán lần đầu.
```java
public class Main {
    public static void main(String[] args) {
        final int x = 10;
        // x = 20; // Lỗi: không thể gán lại
        System.out.println(x); // Output: 10
    }
}
```

### 2. Field (thuộc tính của class)
- **Ý nghĩa:** giá trị của field không thể thay đổi sau khi được khởi tạo.
```java
class Example {
    final int value; // Giá trị chỉ được gán một lần

    // Gán giá trị cho final field trong constructor
    Example(int v) {
        this.value = v;
    }

    void updateValue(int v) {
        // this.value = v; // Lỗi: final field không thể gán lại
    }
}
```

### 3. Parameter của hàm
- **Ý nghĩa:** tham số không thể bị gán lại trong hàm.
```java
public void printValue(final int value) {
    // value = 10; // Lỗi: không thể gán lại
    System.out.println(value);
}
```

### 4. Method
- **Ý nghĩa:** phương thức không thể bị ghi đè trong subclass.
```java
class Parent {
    final void display() {
        System.out.println("Cannot override this method");
    }
}

class Child extends Parent {
    // @Override
    // void display() {} // Lỗi: không thể override final method
}
```

### 5. Class
- **Ý nghĩa:** lớp không thể bị kế thừa.
```java
final class Utility {
    static void printHello() {
        System.out.println("Hello");
    }
}

// class MyUtil extends Utility {} // Lỗi: không thể kế thừa final class
```