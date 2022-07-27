package com.yuge.jpa.jpainterceptor.datarule;

import org.hibernate.EmptyInterceptor;

/**
 * @author: zhangbw
 * @date: 2022-07-26
 **/
public class OwnInterceptor extends EmptyInterceptor {

    @Override
    public String onPrepareStatement(String sql) {
        return super.onPrepareStatement(sql);
    }

}
