## 8. Một số ngôn ngữ như C++ hỗ trợ đa thừa kế nhưng Java thì không. Theo bạn, lý do là tại sao?

Trong Java, không hỗ trợ đa kế thừa class để tránh vấn đề “diamond problem” – khi một lớp con kế thừa từ hai lớp cha có cùng phương thức hoặc biến, gây mâu thuẫn và khó xác định hành vi. Thay vào đó, Java cho phép đa kế thừa hành vi qua interface, vừa tránh mâu thuẫn vừa vẫn hỗ trợ polymorphism.