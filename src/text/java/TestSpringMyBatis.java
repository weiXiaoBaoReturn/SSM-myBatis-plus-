import com.my.ssm.entity.SysOffice;
import com.my.ssm.service.SysOfficeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by ${wb} on 2017/4/26.
 */

public class TestSpringMyBatis {
    @Test
    public  void testMyBatis(){
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        SysOfficeService sysOfficeService = (SysOfficeService) applicationContext.getBean("sysOffice");
        List<SysOffice> offices = sysOfficeService.getOffice();
        for(SysOffice office:offices){
            System.out.println("单位名称："+office.getName());
        }
    }
}
