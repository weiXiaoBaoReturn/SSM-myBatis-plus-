package com.my.ssm.impl;

import com.my.ssm.dao.SysOfficeDao;
import com.my.ssm.entity.SysOffice;
import com.my.ssm.service.SysOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ${wb} on 2017/4/26.
 */
@Service("sysOffice")
public class SysOfficeImpl implements SysOfficeService {
    @Resource
    private SysOfficeDao sysOfficeDao;
    
    @Override
    public List<SysOffice> getOffice() {
        return sysOfficeDao.selectOffice();
    }
     @Override
    public List<SysOffice> getOfficeByBaseMapper() {
        return sysOfficeDao.selectList(
                new EntityWrapper<SysOffice>().eq("name", "北京"));
    }
    @Override
    public SysOffice selectOfficeByName(String name) {
        return sysOfficeDao.selectOfficeByName(name);
    }
}
