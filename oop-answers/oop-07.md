## 7. Liệt kê những điểm mà class làm được mà abstract class và inteface không làm được. Tương tự cho abstract class và interface

### Class làm được
- **Khởi tạo trực tiếp bằng `new`** để tạo object cụ thể. (Abstract class và Interface chỉ khởi tạo gián tiếp qua subclass hoặc anonymous class)

### Abstract class
- Abstract class có thể chứa **cả phương thức trừu tượng và phương thức đã triển khai**, trong khi Interface trước Java 8 chỉ có trừu tượng (Java 8+ có default/static method) và Class thường không thể có phương thức trừu tượng.
- Có **constructor nhưng không thể khởi tạo trực tiếp**. (Class có constructor nhưng luôn khởi tạo trực tiếp; Interface thì không có constructor)

### Interface
- Một lớp có thể **implements nhiều interface** cùng lúc (**đa kế thừa hành vi**). (Class và Abstract class chỉ được kế thừa đơn – extends một class duy nhất)
- Tất cả biến mặc định là **`public static final` (hằng số)**. (Class và Abstract class có instance/static variables, không bắt buộc là hằng số)  
