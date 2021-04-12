package org.zerock.ui;

import org.zerock.service.MenuService;

public class MenuUI {

	//객체생성안하고 스프링한테 맡긴다
	private MenuService service;
    //set메서드
	public void setService(MenuService service) {
		this.service = service;
	}
	
	@Override
	public String toString() {
		return "MenuUI [service=" + service + "]";
	}
	
	
}
