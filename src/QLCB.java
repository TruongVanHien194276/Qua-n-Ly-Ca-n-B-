import java.util.*;
import java.util.stream.Collectors;

public class QLCB {
    private List<CanBo> officers;

    public QLCB(){
        this.officers = new ArrayList<>();
    }

    public void themCanBo(CanBo cb){
        this.officers.add(cb);
    }

    public List<CanBo> timKiemCanBo(String name){
        return this.officers.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }

    public void hienThi(){
        this.officers.forEach(o -> System.out.println(o.toString()));
    }
}
