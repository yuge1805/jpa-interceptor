package com.yuge.jpa.jpainterceptor.datarule;

import lombok.extern.slf4j.Slf4j;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import org.hibernate.resource.jdbc.spi.StatementInspector;

/**
 * https://www.jianshu.com/p/3103871d5907?u_atoken=a9eca772-3a94-4ca6-9cbc-bb7e4884c4a4&u_asession=018PtQPi55FATScd048pVTcSymbADdJW-TCOudU4xWTi55CQzPBWTsFkT8ks28XEsAX0KNBwm7Lovlpxjd_P_q4JsKWYrT3W_NKPr8w6oU7K-PpE3oPAqeTP88Bb4_L9jvnHmbkqVcEgdObpAroqY1_GBkFo3NEHBv0PZUm6pbxQU&u_asig=05x4JPm4vs5zdTq4YEVpzE7NTpEx0eyTHOOgO2Crl1P-q6KGtqKK2lolRHg_ciMcWj3Xnq8ShsekCtyIXfJtQigN1pAETvhhh0_NUx70vJLOqGFjlDtfl_M2nGz_K2xNBuVDnVsuNzGGAWtpkdIlHrKOKZ8G6CKpD__--mzXFfyc79JS7q8ZD7Xtz2Ly-b0kmuyAKRFSVJkkdwVUnyHAIJzbqd183qsgdwB5Ee-4_oPc8zVrVasviERKq6muEs9MbB6xbSxAaWh9ph0bRUFW-6vO3h9VXwMyh6PgyDIVSG1W9QIxqo8JEc05egsMAylDebXNs2pKup7IWhB7LL2MZFi8Y3XShqqLjYJhPWFvjiTUnoQx6iuVE4l2omFfmB4G8bmWspDxyAEEo4kbsryBKb9Q&u_aref=8L%2FH3rv4gnWbK450EchULmJN5dQ%3D
 *
 * @author: zhangbw
 * @date: 2022-07-25
 **/
@Slf4j
public class DataRuleInterceptor implements StatementInspector {

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
