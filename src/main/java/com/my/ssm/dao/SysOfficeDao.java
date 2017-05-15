package com.my.ssm.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.my.ssm.entity.SysOffice;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by ${wb} on 2017/4/26.
 */
@Component
public interface SysOfficeDao  extends BaseMapper<SysOffice>{
    List<SysOffice> selectOffice();
    //根据名称查询单位
    SysOffice selectOfficeByName(@Param(value = "name")String name);
}
