package com.ohgiraffers.section03.remix;

import org.apache.ibatis.session.SqlSession;

import java.util.List;
public interface MenuMapper {

    List<MenuDTO> selectAllMenus();

    MenuDTO selectMenu(int menuCode);

    int insertMenu(MenuDTO menu);

    int updateMenu(MenuDTO menu);

    int deleteMenu(int menuCode);
}
