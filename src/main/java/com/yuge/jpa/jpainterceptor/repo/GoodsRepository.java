package com.yuge.jpa.jpainterceptor.repo;

import com.yuge.jpa.jpainterceptor.po.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author: zhangbw
 * @date: 2022-07-25
 **/
public interface GoodsRepository extends JpaRepository<Goods, Long>, JpaSpecificationExecutor<Goods> {

}
