package com.jeecg.alipay.account.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
 * 描述：</b>QywxMenu:自定义菜单表<br>
 * 实体定义规则
 * 字段不允许存在基本类型，必须都是包装类型(因为基本类型有默认值)
 * 基本数据类型  包装类 byte Byte boolean Boolean short Short char Character int Integer long Long float Float double  Double 
 * @author p3.jeecg
 * @since：2016年03月28日 13时37分49秒 星期一 
 * @version:1.0
 */
public class AlipayMenu implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	/**
	 * 菜单标识
	 */
	private String menuKey;
//	----update----begin---author:chenhcunpeng----for:给菜单数据排序------
	/**
	 * 菜单集合
	 */
	private List<AlipayMenu> menuList=new ArrayList<AlipayMenu>();
//	----update----end---author:chenhcunpeng----for:给菜单数据排序------
	
	public String getMenuKey() {
		return menuKey;
	}
//	----update----begin---author:chenhcunpeng----for:给菜单数据排序------
	public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
	}
	public List<AlipayMenu> getMenuList() {
		return menuList;
	}
	public void setMenuList(List<AlipayMenu> menuList) {
		this.menuList = menuList;
	}
//	----update----end---author:chenhcunpeng----for:给菜单数据排序------
	
	
}
