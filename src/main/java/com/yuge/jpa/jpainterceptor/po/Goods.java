package com.yuge.jpa.jpainterceptor.po;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author: zhangbw
 * @date: 2022-07-25
 **/
@Data
@NoArgsConstructor
@Entity
@Table(name = "goods")
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer type;

    private String address;

}
