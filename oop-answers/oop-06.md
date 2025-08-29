# 6. So sánh sự khác biệt giữa Class, Abstract class và Interface

| Đặc điểm                 | Class                                         | Abstract class                                              | Interface                                                    |
|--------------------------|-----------------------------------------------|-------------------------------------------------------------|--------------------------------------------------------------|
| Khởi tạo đối tượng       | Có thể khởi tạo trực tiếp bằng `new`          | Không thể khởi tạo trực tiếp (trừ khi dùng anonymous class) | Không thể khởi tạo trực tiếp (trừ khi dùng anonymous class)  |
| Phương thức              | Chỉ có phương thức cụ thể (có thân)           | Có thể có cả phương thức trừu tượng và phương thức cụ thể   | Chứa abstract method (Java 8+ thêm default và static method) |
| Thuộc tính (biến)        | Có thuộc tính instance và static              | Có thuộc tính instance, static                              | Chỉ có hằng số (`public static final`)                       |
| Kế thừa                  | Kế thừa được từ một class hoặc abstract class | Chỉ kế thừa được từ một abstract class hoặc class           | Một lớp có thể triển khai nhiều interface                    |
| Constructor              | Có                                            | Có                                                          | Không có                                                     |
