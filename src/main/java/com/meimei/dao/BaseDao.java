package com.meimei.dao;/* *
 * @author meimei
 * @date 2020/6/22
 * @Description
 * @version 1.0
 * 该代码归meimei所有！
 */

import com.meimei.utils.DBUtil;
import org.springframework.jdbc.core.JdbcTemplate;

public class BaseDao {
    public JdbcTemplate template=new JdbcTemplate(DBUtil.getDateSource());
}
