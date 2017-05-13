package com.my.ssm.dao;

import com.my.ssm.entity.SysOffice;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by ${wb} on 2017/4/26.
 */
@Component
public interface SysOfficeDao {
    public List<SysOffice> selectOffice();
}
