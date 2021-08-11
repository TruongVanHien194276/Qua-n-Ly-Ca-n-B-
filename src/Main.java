import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        System.out.print("Nhập số lượng cán bộ: ");
        int n = sc.nextInt();

        CanBo[] members = new CanBo[n];
        System.out.println("Nhập thông tin cho cán bộ: ");
        for (int i = 0; i < n; i++){
            System.out.println("Nhập thông tin cán bộ thứ " + (i+1) + ":");
            System.out.print("Chọn loại cán bộ: (1 - Công Nhân; 2 - Kĩ Sư; 3 - Nhân Viên): ");
            int luachon = sc.nextInt();

            if (luachon == 1){
                members[i] = new CongNhan();
            }
            if (luachon == 2){
                members[i] = new KiSu();
            }
            if (luachon == 3){
                members[i] = new NhanVien();
            }

            members[i].nhap();
        }

        System.out.println("Thông tin của các cán bộ: ");
        for (int i = 0; i < n; i++) {
            System.out.println(members[i].toString());
        }

        sc.close();
    }
 */
        QLCB quanly = new QLCB();
        while (true) {
            System.out.println("Chọn chức năng: ");
            System.out.println("1: Thêm mới cán bộ");
            System.out.println("2: Tìm kiếm theo họ tên");
            System.out.println("3: Hiển thị thông tin về danh sách cán bộ");
            System.out.println("4: Thoát khỏi chương trình");

            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    System.out.print("Chọn loại cán bộ: (A - Công Nhân; B - Kĩ Sư; C - Nhân Viên): ");
                    String luachon = sc.nextLine();
                    switch (luachon) {
                        case "A":
                            CanBo congnhan = new CongNhan();
                            congnhan.nhap();
                            quanly.themCanBo(congnhan);
                            System.out.println(congnhan.toString());
                            break;
                        case "B":
                            CanBo kisu = new KiSu();
                            kisu.nhap();
                            quanly.themCanBo(kisu);
                            System.out.println(kisu.toString());
                            break;
                        case "C":
                            CanBo nhanvien = new NhanVien();
                            nhanvien.nhap();
                            quanly.themCanBo(nhanvien);
                            System.out.println(nhanvien.toString());
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ");
                            break;
                    }
                    break;
                case "2":
                    System.out.print("Nhập họ tên để tìm kiếm: ");
                    String hoten = sc.nextLine();
                    quanly.timKiemCanBo(hoten).forEach(canBo -> {
                        System.out.println(canBo.toString());
                    });
                    break;
                case "3":
                    quanly.hienThi();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Chức năng không hợp lệ");
                    continue;
            }
        }
    }
}

