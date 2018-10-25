package cn.akirayimi.cgb.robber.repo;

import cn.akirayimi.cgb.robber.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RoleRepo extends JpaRepository<Role, Long>, JpaSpecificationExecutor<Role> {
}
