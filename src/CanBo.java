import java.util.Scanner;
public class CanBo {
    Scanner sc = new Scanner(System.in);

    private String name;
    private int age;
    private String gender;
    private String address;

    public CanBo(){
        super();
    }

    public CanBo(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void nhap(){
        System.out.print("Nhập tên cán bộ: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi cán bộ: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giới tính cán bộ: ");
        gender = sc.nextLine();
        System.out.print("Nhập địa chỉ cán bộ: ");
        address = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Họ tên: " + getName() +
                ", tuổi: " + getAge() + ", giới tính: " + getGender() +
                ", địa chỉ: " + getAddress();
    }
}
