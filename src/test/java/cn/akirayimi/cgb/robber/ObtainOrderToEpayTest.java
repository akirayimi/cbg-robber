package cn.akirayimi.cgb.robber;

import cn.akirayimi.cgb.robber.entity.Role;
import cn.akirayimi.cgb.robber.service.intr.IEpayObtainService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ObtainOrderToEpayTest {

    @Autowired
    IEpayObtainService epayObtainService;

    @Test
    public void test(){
        epayObtainService.obtaninOrderToEpay(new Role());
    }
}
