## 20. Bạn hiểu gì về DI và IOC

## 1. IoC (Inversion of Control)
- **Định nghĩa:** IoC là nguyên tắc trong đó **thay vì code tự mình tạo ra và quản lý dependencies**, quyền kiểm soát này được "đảo ngược" và do một framework/container bên ngoài đảm nhận.
- **Ý nghĩa:** Giúp tách biệt phần cấu hình/khởi tạo đối tượng với phần logic nghiệp vụ.
- **Ví dụ:** Trong Spring, thay vì bạn `new` một `UserService` trong `UserController`, framework sẽ tự inject đối tượng phù hợp.

## 2. DI (Dependency Injection)
- **Định nghĩa:** Là cách cụ thể để thực hiện IoC, nghĩa là dependencies (các đối tượng mà một class cần) sẽ được **cung cấp từ bên ngoài** thay vì tự tạo trong class đó.
- **Các kiểu DI:**
    - **Constructor Injection** (truyền qua constructor)
    - **Setter Injection** (truyền qua setter)
    - **Field Injection** (dùng annotation như `@Autowired` trong Spring)

**Ví dụ dùng Constructor Injection:**
```java
class UserService {
    public void register() {
        System.out.println("User registered!");
    }
}

class UserController {
    private UserService userService;

    // Dependency được inject qua constructor
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void handleRequest() {
        userService.register();
    }
}

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();
        UserController controller = new UserController(service);
        controller.handleRequest();
    }
}
```