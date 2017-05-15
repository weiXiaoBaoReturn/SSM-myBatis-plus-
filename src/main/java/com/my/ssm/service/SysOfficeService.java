import com.my.ssm.entity.SysOffice;

import java.util.List;

/**
 * Created by ${wb} on 2017/4/26.
 */
public interface SysOfficeService {
    List<SysOffice> getOffice();
    List<SysOffice> getOfficeByBaseMapper();
    SysOffice selectOfficeByName(String name);
}
