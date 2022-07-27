package com.yuge.jpa.jpainterceptor.repo;

import com.yuge.jpa.jpainterceptor.po.Goods;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@Slf4j
public class GoodsRepositoryTest {

    @Resource
    private GoodsRepository goodsRepository;

    @Test
    public void test() {
        List<Goods> all = goodsRepository.findAll();
        log.info(String.valueOf(all));
    }

}