package com.gykj.patch.manager.core.service.base;

import com.gykj.patch.manager.core.dao.base.TBaseCounterPartyAcctMapper;
import com.gykj.patch.manager.core.dao.base.entity.TBaseCounterPartyAcct;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


/**
 * 客商账户信息表 服务层。
 *
 * @author yaoye
 * @since 2024-04-15
 */

@Service
public class TBaseCounterPartyAcctService extends ServiceImpl<TBaseCounterPartyAcctMapper, TBaseCounterPartyAcct> {
    /**
     * 新增
     * @param tBaseCounterPartyAcct
     */
    public void insert(TBaseCounterPartyAcct tBaseCounterPartyAcct){
        this.getMapper().insert(tBaseCounterPartyAcct);
    }

}
