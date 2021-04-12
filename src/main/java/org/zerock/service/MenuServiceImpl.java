package org.zerock.service;

import java.util.List;

import org.zerock.domain.Menu;

public class MenuServiceImpl implements MenuService {

	private List<Menu> menus;
	
	
	
	public MenuServiceImpl(List<Menu> menus) {
		super();
		this.menus = menus;
	}


	@Override
	public List<Menu> getAllMenus() {
		// TODO Auto-generated method stub
		return this.menus;
	}

}
