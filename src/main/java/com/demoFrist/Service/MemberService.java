package com.demoFrist.Service;

import com.demoFrist.domain.Member;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: SSMIntegration
 * @Package: com.demoFrist.Service
 * @ClassName: MemberService
 * @Author: Lenovo
 * @Description: ${description}
 * @Date: 2019/3/5 21:51
 * @Version: 1.0
 */
@Service
public interface MemberService {
     Member login(String username, String password) throws Exception;
}
