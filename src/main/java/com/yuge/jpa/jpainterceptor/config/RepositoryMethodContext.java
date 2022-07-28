package com.yuge.jpa.jpainterceptor.config;

/**
 * RepositoryMethodContext
 *
 * @author yuge
 * @since 2022-07-28
 */
public class RepositoryMethodContext {

    private static ThreadLocal<String> REPOSITORY_METHOD_NAME = new ThreadLocal<>();

    public static void setRepositoryMethodName(String repositoryMethodName) {
        REPOSITORY_METHOD_NAME.set(repositoryMethodName);
    }

    public static String getRepositoryMethodName() {
        return REPOSITORY_METHOD_NAME.get();
    }




}
