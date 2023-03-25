package VTI.Lession1;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        System.out.println(" Cách Khởi tạo giá trị cho 1 đối tượng");//tạo ra 1 giá trị cho đối tượng
        //cú pháp:kiểu dự liễu xong đến tên dữ liệu đó
        Acount acount1 = new Acount();
        //Để đưa ra dữ liệu
        //gọi tiên biến ra trước gọi ta phần tử trong biến xong gán giá trị của nó
        acount1.acountId =1;
        acount1.departmentId =1;
        acount1.email = "abc1@gmail.com";
        acount1.username = "Username 1";
        acount1.fullName = "Nguyễn Văn A";
        acount1.positionId = 1;
        acount1.createDate = new Date();

        Acount acount2 = new Acount();
        //Để đưa ra dữ liệu
        //gọi tiên biến ra trước gọi ta phần tử trong biến xong gán giá trị của nó
        acount2.acountId =2;
        acount2.departmentId =2;
        acount2.email = "abc2@gmail.com";
        acount2.username = "Username 1";
        acount2.fullName = "Nguyễn Văn B";
        acount2.positionId = 2;
        acount2.createDate = new Date();
        System.out.println(acount1.email);



    }
}
