package cn.akirayimi.cgb.robber.service.impl;

import cn.akirayimi.cgb.robber.config.CbgUrlConst;
import cn.akirayimi.cgb.robber.service.filter.RoleFilter;
import cn.akirayimi.cgb.robber.service.intr.IProductService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ObjectMapper objectMapper;
    @Override
    public void obtainRole(List<RoleFilter> filter) {
        ObjectNode result = restTemplate.getForObject(CbgUrlConst.ROLE_SEARCH_URL, ObjectNode.class);
        int code = result.get("status").asInt();
        if (1 != code){
            throw new RuntimeException("");
        }
//        result.get("result").
//        System.out.println(result);
    }
}
