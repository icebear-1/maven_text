package com.meimei.dao;/* *
 * @author meimei
 * @date 2020/6/22
 * @Description
 * @version 1.0
 * 该代码归meimei所有！
 */

import com.meimei.entity.Menu;
import com.meimei.utils.DBUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class MenuDao extends BaseDao{

public List<Menu> listAll(){
    String sql="select * from ,menu";
    return template.query(sql,new BeanPropertyRowMapper<Menu>(Menu.class));
}


}
