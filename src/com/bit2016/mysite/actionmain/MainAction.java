package com.bit2016.mysite.actionmain;

import java.io.IOException;
import java.net.HttpCookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit2016.web1.Action;
import com.bit2016.web.util.WebUtil;

public class MainAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie c = new Cookie( "nickname", "baboya" );
		c.setDomain( "localhost" );
		c.setPath( "/mysite3" );
		c.setMaxAge( 24 * 60 * 60 );
		response.addCookie( c );
		
		WebUtil.forward(
			request, 
			response, 
			"/WEB-INF/views/main/index.jsp" );
	}
}