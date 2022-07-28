package com.yuge.jpa.jpainterceptor.config;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ReflectiveMethodInvocation;

/**
 * RepositoryMethodInterceptor
 *
 * @author yuge
 * @since 2022-07-28
 */
@Slf4j
public class RepositoryMethodInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        log.info("ininin================");
        log.info("method:" + invocation.getMethod());
        log.info("class:" + invocation.getMethod().getClass());
        log.info("DeclaringClass:" + invocation.getMethod().getDeclaringClass());
        log.info("method:" + invocation.getMethod().getName());
        Object aThis = invocation.getThis();
        Class<? extends MethodInvocation> aClass = invocation.getClass();
        RepositoryMethodContext.setRepositoryMethodName(
                String.format("%s.%s", invocation.getMethod().getDeclaringClass().getName(), invocation.getMethod().getName()));
        return invocation.proceed();
    }
}
