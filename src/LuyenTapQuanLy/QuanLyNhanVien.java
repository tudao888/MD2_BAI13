package LuyenTapQuanLy;

import java.util.*;

public class QuanLyNhanVien {
    static Scanner scanner = new Scanner(System.in);
    List<NhanVien> nhanVienList = new ArrayList<>();


    public void add(NhanVien nhanVien) {
        String name; int age; double salary; int dateOfBirth; String gender;
        System.out.println("Nhập vào tên nhân viên: ");
        name = scanner.nextLine();
        System.out.println("Nhập vào tuổi nhân viên: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào lương nhân viên: ");
        salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào ngày sinh: ");
        dateOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính của nhân viên: ");
        gender = scanner.nextLine();
        NhanVien nhanVienNew = new NhanVien(name, age, salary, dateOfBirth, gender);
        nhanVienList.add(nhanVienNew);
    }

    public int findIndexByName(String name) {
        for (int i = 0; i < nhanVienList.size(); i++) {
            if (name.equals(nhanVienList.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }
    public void Edit(String nameEdit) {
        int index = findIndexByName(nameEdit);
        System.out.println("Nhập vào tên muốn sửa: ");
        nameEdit = scanner.nextLine();
        taoNhanVien();

    }

    public NhanVien taoNhanVien() {
        String name; int age; double salary; int dateOfBirth; String gender;
        System.out.println("Nhập vào tên nhân viên: ");
        name = scanner.nextLine();
        System.out.println("Nhập vào tuổi nhân viên: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào lương nhân viên: ");
        salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào ngày sinh: ");
        dateOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính của nhân viên: ");
        gender = scanner.nextLine();
        NhanVien nhanVienNew = new NhanVien(name, age, salary, dateOfBirth, gender);
        return nhanVienNew;
    }

    public void Delete(String name) {
        int index = findIndexByName(name);
        nhanVienList.remove(nhanVienList.get(index));
    }
}
