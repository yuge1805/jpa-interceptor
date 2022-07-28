package com.yuge.jpa.jpainterceptor.config;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.data.repository.core.RepositoryInformation;
import org.springframework.data.repository.core.support.RepositoryProxyPostProcessor;

/**
 * OwnRepositoryProxyPostProcessor
 *
 * @author yuge
 * @since 2022-07-28
 */
public class OwnRepositoryProxyPostProcessor implements RepositoryProxyPostProcessor {

    @Override
    public void postProcess(ProxyFactory factory, RepositoryInformation repositoryInformation) {
        factory.addAdvice(new RepositoryMethodInterceptor());
    }

}
