## 18. Tìm hiểu, giải thích Design Pattern là gì và giải thích mục đích/ý nghĩa của vài pattern (tuỳ chọn)

### 1. Giải thích Design Pattern
**Design Pattern (mẫu thiết kế)** là những giải pháp đã được kiểm chứng và tái sử dụng để giải quyết các vấn đề thường gặp trong thiết kế phần mềm hướng đối tượng. Nó không phải là code cụ thể, mà là **khuôn mẫu thiết kế** có thể áp dụng trong nhiều tình huống khác nhau.

**Đặc điểm:**
- Tái sử dụng được (reusable).
- Giúp code dễ đọc, dễ bảo trì.
- Tăng tính linh hoạt, giảm sự phụ thuộc (coupling).

Design Pattern thường chia thành 3 nhóm lớn:
- **Creational Patterns** (mẫu khởi tạo): Quản lý cách tạo đối tượng.
- **Structural Patterns** (mẫu cấu trúc): Tổ chức, kết hợp các lớp/đối tượng.
- **Behavioral Patterns** (mẫu hành vi): Tổ chức giao tiếp, phân công trách nhiệm giữa các đối tượng.

### 2. Một số Design Pattern
#### 2.1. Singleton Pattern
**Mục đích:**  
Đảm bảo một lớp chỉ có **một thể hiện duy nhất** trong suốt chương trình và cung cấp cách truy cập toàn cục đến thể hiện đó.

**Ví dụ:**

```java
class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
```

#### 2.2. Factory Method Pattern
**Mục đích:**  
Cung cấp một interface để tạo đối tượng, nhưng cho phép các lớp con quyết định lớp nào sẽ được khởi tạo.

**Ví dụ:**

```java
abstract class Vehicle {
    public abstract void printVehicle();
}

class TwoWheeler extends Vehicle {
    public void printVehicle() {
        System.out.println("I am two wheeler");
    }
}

class FourWheeler extends Vehicle {
    public void printVehicle() {
        System.out.println("I am four wheeler");
    }
}

interface VehicleFactory {
    Vehicle createVehicle();
}

class TwoWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}

class FourWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}

class Client {
    private Vehicle pVehicle;

    public Client(VehicleFactory factory) {
        pVehicle = factory.createVehicle();
    }

    public Vehicle getVehicle() {
        return pVehicle;
    }
}

public class Main {
    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        Client twoWheelerClient = new Client(twoWheelerFactory);
        Vehicle twoWheeler = twoWheelerClient.getVehicle();
        twoWheeler.printVehicle();

        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        Client fourWheelerClient = new Client(fourWheelerFactory);
        Vehicle fourWheeler = fourWheelerClient.getVehicle();
        fourWheeler.printVehicle();
    }
}
```

#### 2.3. Strategy Pattern
**Mục đích:**  
Định nghĩa nhiều thuật toán cho một tác vụ, và cho phép lựa chọn thuật toán cần dùng tại runtime mà không sửa code gốc.

**Ví dụ:**

```java
class SortingContext {
    private SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort() {
        sortingStrategy.sort();
    }
}

interface SortingStrategy {
    void sort();
}

class BubbleSortStrategy implements SortingStrategy {
    @Override
    public void sort() {
        System.out.println("Sorting using Bubble Sort");
    }
}

class MergeSortStrategy implements SortingStrategy {
    @Override
    public void sort() {
        System.out.println("Sorting using Merge Sort");
    }
}

class QuickSortStrategy implements SortingStrategy {
    @Override
    public void sort() {
        System.out.println("Sorting using Quick Sort");
    }
}

public class Main {
    public static void main(String[] args) {

        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
        sortingContext.performSort();

        sortingContext.setSortingStrategy(new MergeSortStrategy());
        sortingContext.performSort();

        sortingContext.setSortingStrategy(new QuickSortStrategy());
        sortingContext.performSort();
    }
}
```