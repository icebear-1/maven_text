package com.meimei.service;/* *
 * @author meimei
 * @date 2020/6/22
 * @Description
 * @version 1.0
 * 该代码归meimei所有！
 */

import com.meimei.dao.MenuDao;
import com.meimei.entity.Menu;

import java.util.List;

public class MenuService {
    private MenuDao menuDao=new MenuDao();
    public List<Menu> listAll(){
        return menuDao.listAll();
    }
}
