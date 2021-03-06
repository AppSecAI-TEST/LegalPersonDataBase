package com.icinfo.frk.common.utils;

import com.icinfo.framework.tools.utils.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 集合工具类
 * Created by yushunwei on 2017-07-14.
 */
public class CollectionUtils extends org.apache.commons.collections.CollectionUtils {

    /**
     * 根据属性去重集合
     *
     * @param list  原始列表
     * @param field 去重属性
     * @param <T>   泛型
     * @return 去重后集合
     * @throws Exception 异常
     */
    public static <T> List<T> unique(List<T> list, String field) throws Exception {
        if(list == null || list.isEmpty() || list.size() < 2){
            return list;
        }
        Map<String, String> map = new HashMap<>();
        List<T> result = new ArrayList<>();
        for (T t : list) {
            String value = BeanUtils.getProperty(t, field);
            if (StringUtils.isBlank(value) || map.containsKey(value)) {
                continue;
            } else {
                result.add(t);
                map.put(value, "1");
            }
        }
        return result;
    }
}
