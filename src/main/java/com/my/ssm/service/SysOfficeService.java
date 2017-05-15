
import com.my.ssm.entity.SysOffice;

import java.util.List;

/**
 * Created by ${wb} on 2017/4/26.
 */
public interface SysOfficeService {
    //获取所有单位
    List<SysOffice> getOffice();
    //根据myBatis-plus的BaseMApper获取
    List<SysOffice> getOfficeByBaseMapper();
    //根据名称获取单位
    SysOffice selectOfficeByName(String name);
}
