package com.xtj.text;

import org.springframework.cache.Cache;

import java.util.*;

public class CacheManager {

    private static HashMap cacheMap = new HashMap();

    private CacheManager() {
        super();
    }

    /*查找是否存在Key值*/
    public static boolean FindCache(String Key) {
        try {
            return cacheMap.containsKey(Key);
        } catch (Exception ex) {
            return false;
        }
    }

    /*Key获取缓冲对象*/
    public static Cache getCache(String Key) {
        try {
            return (Cache) cacheMap.get(Key);
        } catch (Exception ex) {
            return null;
        }
    }

    public synchronized static boolean setCache(Object obj, String key) {
        try {
            if (FindCache(key)) {

                Cache cache = getCache(key);
                return false;
                //   cache.get()
            } else {
                return false;
            }
        } catch (Exception ex) {
            return false;
        }
    }

}
