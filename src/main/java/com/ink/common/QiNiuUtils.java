package com.ink.common;

import com.qiniu.util.Auth;

/**
 * Created by chenyueling on 2015/7/20.
 */
public class QiNiuUtils {


    /**
     'ACCESS_KEY': 'fGXfydOqVt0WaKVi4fqwvyFH0LgFMtFHVyYPVmjL',
     'SECRET_KEY': 'ZdbShjRVevNRUvH2yVUuAmCh369vGhebcbHWeOOy'
     */
    private static final String AK = "fGXfydOqVt0WaKVi4fqwvyFH0LgFMtFHVyYPVmjL";
    private static final String SK = "ZdbShjRVevNRUvH2yVUuAmCh369vGhebcbHWeOOy";
    private static final String bucket = "chenyueling";
    private static final Auth auth = Auth.create(AK, SK);


    public static String getUploadToken(){
        return auth.uploadToken(bucket);
    }


    public static void main(String[] args) {
        System.out.println(getUploadToken());
    }
}
