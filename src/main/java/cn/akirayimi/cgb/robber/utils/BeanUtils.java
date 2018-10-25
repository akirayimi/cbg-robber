package cn.akirayimi.cgb.robber.utils;

import com.google.common.base.CaseFormat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class BeanUtils {
    private final static Logger logger = LogManager.getLogger(BeanUtils.class);


    public static void populate(final Object bean, final Map<String, ?> properties){
        populate(bean, properties, false);
    }

    public static void populate(final Object bean, final Map<String, ?> properties, boolean underToCamel){
        Map<String, ?> result = properties;
        if (underToCamel){
            result = renameKey(properties);
        }
        try {
            org.apache.commons.beanutils.BeanUtils.populate(bean, result);
        } catch (IllegalAccessException | InvocationTargetException e){
            logger.error("cast map to bean error!", e);
            e.printStackTrace();
        }
    }

    private static Map<String, ?> renameKey(Map<String, ?> map){
        return map.entrySet().stream().collect(HashMap::new, (m, v)->m.put(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, v.getKey()), v.getValue()), HashMap::putAll);
    }

}
