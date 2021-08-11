import java.util.Scanner;
public class KiSu extends CanBo {
    Scanner sc = new Scanner(System.in);
    private String branch;

    public KiSu(){
        super();
    }

    public KiSu(String branch){
        super();
        this.branch = branch;
    }

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhập ngành kĩ sư: ");
        branch = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", ngành kĩ sư: " + getBranch();
    }

}
