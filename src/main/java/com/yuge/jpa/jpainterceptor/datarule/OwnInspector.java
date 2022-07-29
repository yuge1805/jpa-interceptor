package com.yuge.jpa.jpainterceptor.datarule;

import lombok.extern.slf4j.Slf4j;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import org.hibernate.resource.jdbc.spi.StatementInspector;

/**
 * @author: zhangbw
 * @date: 2022-07-25
 **/
@Slf4j
public class OwnInspector implements StatementInspector {

    @Override
    public String inspect(String sql) {
        log.info(sql);
        try {
            Statement statement = CCJSqlParserUtil.parse(sql);

        } catch (JSQLParserException e) {
            e.printStackTrace();
        }
        return sql;
    }

}
