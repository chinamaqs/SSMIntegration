package com.demoFrist.Dao;

import com.demoFrist.domain.Member;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ProjectName: SSMIntegration
 * @Package: com.demoFrist.Dao
 * @ClassName: MemberDao
 * @Author: Lenovo
 * @Description: ${description}
 * @Date: 2019/3/5 21:45
 * @Version: 1.0
 */
public interface MemberDao {

    //通过名称查询
    Member LoginUser(@Param("username")String username,@Param("password")String password);
}
