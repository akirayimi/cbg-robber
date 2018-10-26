package cn.akirayimi.cgb.robber.service.impl;

import cn.akirayimi.cgb.robber.config.CbgUrlConst;
import cn.akirayimi.cgb.robber.config.CookieKey;
import cn.akirayimi.cgb.robber.entity.Role;
import cn.akirayimi.cgb.robber.service.RestTemplateWithCookies;
import cn.akirayimi.cgb.robber.service.intr.IEpayObtainService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.HttpCookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static cn.akirayimi.cgb.robber.config.CookieKey.*;

@Service
public class EpayObtainService implements IEpayObtainService {

    @Autowired
    private RestTemplateWithCookies restTemplate;

    @Autowired
    private ObjectMapper objectMapper;


    private final static Map<String, String> cookies = new HashMap<>();
    static {
        cookies.put(P_INFO, "akirayimi@163.com|1540518324|1|cbg|10&15|sic&1540507841&cbg#sic&510100#10#0#0|&0|godlike_app&cbg|akirayimi@163.com");
        cookies.put(S_INFO, "1540518324|0|3&100##|akirayimi");
        cookies.put(SID, "CCvOL0yiEOHiRssExWq2e2HGJhikVdo8Ww0q8XIQ");
    }

    private void addCookie(RestTemplateWithCookies restTemplate){
        HttpCookie pInfo = new HttpCookie(P_INFO, cookies.get(P_INFO));
        HttpCookie sInfo = new HttpCookie(S_INFO, cookies.get(S_INFO));
        HttpCookie sid = new HttpCookie(SID, cookies.get(SID));

        restTemplate.getCoookies().add(pInfo);
        restTemplate.getCoookies().add(sInfo);
        restTemplate.getCoookies().add(sid);
    }

    @Override
    public String obtaninOrderToEpay(Role role) {
        role = new Role();
        role.setGameOrdersn("01810091701716-157-HYJASWI9G716");
        role.setServerid(157);

        Map<String, Object> param = new HashMap<>();
        param.put("ordersn", role.getGameOrdersn());
        param.put("serverid", role.getServerid());
        ObjectNode result = restTemplate.postForObject(CbgUrlConst.ORDER_TO_EPAY, null, ObjectNode.class, param);
        if (1 != result.get("status").asInt()){
            throw new RuntimeException("获取orderToEpay失败");
        }


        return null;
    }
}
