import java.util.Scanner;
public class NhanVien extends CanBo {
    Scanner sc = new Scanner(System.in);
    private String task;

    public NhanVien(){
        super();
    }

    public NhanVien(String task){
        super();
        this.task = task;
    }

    public String getTask() {
        return this.task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhập công việc nhân viên: ");
        task = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", công việc nhân viên: " + getTask();
    }

}
