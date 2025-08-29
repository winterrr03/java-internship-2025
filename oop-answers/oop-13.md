## 13. Từ khoá instanceof dùng để làm gì?

`instanceof` trong Java là một **toán tử** dùng để kiểm tra xem một đối tượng có phải là **instance** (đối tượng) của một class, subclass hoặc interface cụ thể hay không.

### Cú pháp
```java
object instanceof ClassName
```
- Trả về true nếu object là một instance của ClassName (hoặc subclass/implement interface của nó).
- Trả về false nếu không phải hoặc nếu object là null.

### Ví dụ
```java
class Animal {}
class Dog extends Animal {}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();

        System.out.println(a instanceof Dog);     // true
        System.out.println(a instanceof Animal);  // true
        System.out.println(a instanceof Object);  // true
        System.out.println(a instanceof String);  // false
    }
}
```