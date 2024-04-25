package com.gykj.patch.manager.core.service.base;

import com.gykj.patch.manager.core.dao.base.TBaseCounterPartySetMapper;
import com.gykj.patch.manager.core.dao.base.entity.TBaseCounterParty;
import com.gykj.patch.manager.core.dao.base.entity.TBaseCounterPartySet;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


/**
 * 客商指标设置 服务层。
 *
 * @author yaoye
 * @since 2024-04-16
 */
@Service
public class TBaseCounterPartySetService extends ServiceImpl<TBaseCounterPartySetMapper,TBaseCounterPartySet> {



    public void insert(TBaseCounterPartySet tBaseCounterPartySet){
        this.getMapper().insert(tBaseCounterPartySet);
    }

}
