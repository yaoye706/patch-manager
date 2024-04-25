package com.gykj.patch.manager.core.service.base;

import com.gykj.patch.manager.core.dao.base.TBaseCounterPartyMapper;
import com.gykj.patch.manager.core.dao.base.entity.TBaseCounterParty;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


/**
 * 客商信息表 服务层。
 *
 * @author yaoye
 * @since 2024-04-15
 */
@Service
public class TBaseCounterPartyService extends ServiceImpl<TBaseCounterPartyMapper, TBaseCounterParty> {


    public void insert(TBaseCounterParty tBaseCounterParty){
        this.getMapper().insert(tBaseCounterParty);
    }





}
