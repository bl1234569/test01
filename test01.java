import com.warehouse.pojo.Dept;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DeptVo extends Dept {

    //分子写的代码

    private Integer limit = 10; //每页的大小


}