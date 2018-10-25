package cn.akirayimi.cgb.robber.service.impl;

import cn.akirayimi.cgb.robber.config.CbgUrlConst;
import cn.akirayimi.cgb.robber.entity.OtherInfo;
import cn.akirayimi.cgb.robber.entity.Role;
import cn.akirayimi.cgb.robber.repo.RoleRepo;
import cn.akirayimi.cgb.robber.service.filter.RoleFilter;
import cn.akirayimi.cgb.robber.service.intr.IProductService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Service
public class ProductService implements IProductService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private RoleRepo roleRepo;
    @Override
    public void obtainRole(RoleFilter... filters) {
        ObjectNode result = restTemplate.getForObject(CbgUrlConst.ROLE_SEARCH_URL, ObjectNode.class);
        int code = result.get("status").asInt();
        if (1 != code){
            throw new RuntimeException("获取角色列表失败");
        }
        Iterator<JsonNode> nodes = result.get("result").elements();
        while (nodes.hasNext()){
            JsonNode node = nodes.next();

            Role role = objectMapper.convertValue(node, Role.class);
            OtherInfo otherInfo = objectMapper.convertValue(node.get("other_info"), OtherInfo.class);
            role.setCreateTime(LocalDateTime.now());
            BeanUtils.copyProperties(otherInfo, role);
            roleRepo.save(role);
        }
    }
}