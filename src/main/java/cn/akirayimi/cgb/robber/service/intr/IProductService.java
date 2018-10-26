package cn.akirayimi.cgb.robber.service.intr;

import cn.akirayimi.cgb.robber.entity.Role;
import cn.akirayimi.cgb.robber.service.filter.RoleFilter;

import java.util.List;

public interface IProductService {
    public List<Role> obtainRole(RoleFilter... filter);

}
