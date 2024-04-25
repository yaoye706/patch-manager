package com.gykj.patch.manager.core.service.lofc.impl;

import com.gykj.patch.manager.core.dao.lofc.TLofcOpenParentLocMapper;
import com.gykj.patch.manager.core.dao.lofc.entity.TLofcOpenParentLoc;
import com.gykj.patch.manager.core.service.lofc.TLofcOpenParentLocService;
import com.mybatisflex.spring.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;

/**
 * 开证登记,开立子证,背对背时,记录关联的母证信息 服务层实现。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Service
public class TLofcOpenParentLocServiceImpl extends ServiceImpl<TLofcOpenParentLocMapper, TLofcOpenParentLoc> implements TLofcOpenParentLocService {

}
