package com.gykj.patch.manager.core.service.base;

import com.gykj.patch.manager.core.dao.base.TBaseCounterPartyTargetMapper;
import com.gykj.patch.manager.core.dao.base.entity.TBaseCounterPartyAcct;
import com.gykj.patch.manager.core.dao.base.entity.TBaseCounterPartyTarget;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


/**
 * 客商特殊信息指标 服务层。
 *
 * @author yaoye
 * @since 2024-04-16
 */
@Service
public class TBaseCounterPartyTargetService extends ServiceImpl<TBaseCounterPartyTargetMapper,TBaseCounterPartyTarget> {


    public void insert(TBaseCounterPartyTarget tBaseCounterPartyTarget){
        this.getMapper().insert(tBaseCounterPartyTarget);
    }

}
