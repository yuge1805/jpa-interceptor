package com.yuge.jpa.jpainterceptor.config;

import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

import javax.persistence.EntityManager;

/**
 * OwnRepositoryFactoryBean
 *
 * @author yuge
 * @since 2022-07-28
 */
public class OwnRepositoryFactoryBean<T extends Repository<S, ID>, S, ID> extends JpaRepositoryFactoryBean {

    public OwnRepositoryFactoryBean(Class repositoryInterface) {
        super(repositoryInterface);
    }

    @Override
    protected RepositoryFactorySupport createRepositoryFactory(EntityManager entityManager) {
        RepositoryFactorySupport repositoryFactory = super.createRepositoryFactory(entityManager);
        repositoryFactory.addRepositoryProxyPostProcessor(new OwnRepositoryProxyPostProcessor());
        return repositoryFactory;
    }
}
