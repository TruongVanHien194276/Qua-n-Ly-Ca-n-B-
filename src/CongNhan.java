import java.util.Scanner;
public class CongNhan extends CanBo {
    Scanner sc = new Scanner(System.in);
    private int level;

    public CongNhan(){
        super();
    }

    public CongNhan(int level){
        super();
        this.level = level;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhập bậc công nhân: ");
        level = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + ", bậc công nhân: " + getLevel();
    }
}
