package com.demoFrist.Service.impl;

import com.demoFrist.Dao.MemberDao;
import com.demoFrist.Service.MemberService;
import com.demoFrist.domain.Member;
import com.github.pagehelper.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: SSMIntegration
 * @Package: com.demoFrist.Service.impl
 * @ClassName: MemberServiceImpl
 * @Author: Lenovo
 * @Description: ${description}
 * @Date: 2019/3/5 21:52
 * @Version: 1.0
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberDao memberDao;

    @Override
    public Member login(String name, String passsword) throws Exception {
        System.out.println(name + passsword);
        if(StringUtil.isEmpty(name)){
            System.out.println("用戶名不能為空");
            return null;
        }
        if(StringUtil.isEmpty(passsword)){
            System.out.println("密碼不能為空");
            return null;
        }

        Member member = memberDao.LoginUser(name, passsword);
        return member;
    }
}
