package com.gykj.patch.manager.core.service.base;


import com.gykj.patch.manager.core.dao.base.TBaseCounterPartyInfoMapper;
import com.gykj.patch.manager.core.dao.base.entity.TBaseCounterPartyAcct;
import com.gykj.patch.manager.core.dao.base.entity.TBaseCounterPartyInfo;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 客商特殊信息详情 映射层。
 *
 * @author yaoye
 * @since 2024-04-16
 */
@Service
public class TBaseCounterPartyInfoService extends ServiceImpl<TBaseCounterPartyInfoMapper, TBaseCounterPartyInfo> {


    public void insert(TBaseCounterPartyInfo tBaseCounterPartyInfo){
        this.getMapper().insert(tBaseCounterPartyInfo);
    }

}
