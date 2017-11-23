package io.z77z.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import io.z77z.dao.SysPermissionInitMapper;
import io.z77z.entity.SysPermissionInit;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author z77z
 * @since 2017-02-16
 */
@Service
public class SysPermissionInitService extends ServiceImpl<SysPermissionInitMapper, SysPermissionInit>{
	
	public List<SysPermissionInit> selectAll() {
		return baseMapper.selectAll();
	}
}
