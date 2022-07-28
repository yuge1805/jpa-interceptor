//package com.yuge.jpa.jpainterceptor.config;
//
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.stereotype.Component;
//
///**
// * OwnAspect
// *
// * @author yuge
// * @since 2022-07-27
// */
//@Aspect
//@Component
//@Slf4j
//@Deprecated
//public class OwnAspect {
//
////    @Around(value = "execution(* com.yuge..repo.*.*(..))")
////    @Around(value = "execution(* com.yuge.jpa.jpainterceptor.repo.GoodsRepository.*(..))")
//    @Around(value = "execution(* javax.persistence.EntityManager.*(..))")
//    public void process(ProceedingJoinPoint point) throws Throwable {
//        String name = point.getSignature().getName();
//        log.info("========");
//        log.info(name);
//        log.info(point.getSignature().getClass().getName());
//    }
//
//}
