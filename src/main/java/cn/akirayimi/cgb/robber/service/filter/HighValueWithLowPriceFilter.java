package cn.akirayimi.cgb.robber.service.filter;

import cn.akirayimi.cgb.robber.entity.Role;

/**
 * 便宜的厉害号
 */
public class HighValueWithLowPriceFilter implements RoleFilter{
    @Override
    public boolean filter(Role role) {
        return false;
    }
}
