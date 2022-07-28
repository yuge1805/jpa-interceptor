package com.yuge.jpa.jpainterceptor.datarule;

import com.yuge.jpa.jpainterceptor.config.RepositoryMethodContext;
import lombok.extern.slf4j.Slf4j;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import org.aopalliance.intercept.MethodInvocation;
import org.hibernate.EmptyInterceptor;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.ReflectiveMethodInvocation;
import org.springframework.aop.interceptor.ExposeInvocationInterceptor;
import org.springframework.core.DecoratingProxy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: zhangbw
 * @date: 2022-07-26
 **/
@Slf4j
public class OwnInterceptor extends EmptyInterceptor {

    public OwnInterceptor() {
      log.info("11111");
    }

    @Override
    public String onPrepareStatement(String sql) {
        String method = getRepositoryMethod();
        log.info("method:" + method);
        try {
            Statement statement = CCJSqlParserUtil.parse(sql);
            //
        } catch (JSQLParserException e) {
            e.printStackTrace();
        }
        return sql;
    }

    private String getRepositoryMethod() {
        MethodInvocation methodInvocation = ExposeInvocationInterceptor.currentInvocation();
        String className = methodInvocation.getMethod().getDeclaringClass().getName();
        String methodName = methodInvocation.getMethod().getName();
        if (!methodInvocation.getMethod().getDeclaringClass().equals(JpaRepository.class)) {
            return String.format("%s.%s", className, methodName);
        }
        if (methodInvocation instanceof ReflectiveMethodInvocation) {
            Object proxy = ((ReflectiveMethodInvocation) methodInvocation).getProxy();
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(proxy);
            try {
                Method getProxiedInterfaces = Advised.class.getDeclaredMethod("getProxiedInterfaces");
                Object invoke = invocationHandler.invoke(null, getProxiedInterfaces, null);
                Class<?>[] classes = (Class<?>[]) invoke;
                if (classes.length > 0 ) {
                    className = classes[0].getName();
                }
            } catch (Throwable e) {
                log.error("getRepositoryMethod error!", e);
            }
        }
        return String.format("%s.%s", className, methodName);

    }

}
