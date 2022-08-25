import com.warehouse.pojo.Dept;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DeptVo extends Dept {

    private Integer page = 1; //当前页码的大小

    private Integer limit = 10; //每页的大小


}