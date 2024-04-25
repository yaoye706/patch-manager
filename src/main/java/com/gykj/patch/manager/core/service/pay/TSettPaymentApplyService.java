package com.gykj.patch.manager.core.service.pay;

import com.gykj.patch.manager.core.dao.base.entity.TBaseCounterPartyInfo;
import com.gykj.patch.manager.core.dao.pay.TSettPaymentApplyMapper;
import com.mybatisflex.core.service.IService;
import com.gykj.patch.manager.core.dao.pay.entity.TSettPaymentApply;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 付款申请表 服务层。
 *
 * @author yaoye
 * @since 2024-04-12
 */
@Service
public class TSettPaymentApplyService extends ServiceImpl<TSettPaymentApplyMapper,TSettPaymentApply> {


    public void insert(TSettPaymentApply tBaseCounterPartyInfo){
        this.getMapper().insert(tBaseCounterPartyInfo);
    }
}
