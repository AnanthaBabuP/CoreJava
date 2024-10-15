package com;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class CustomClass2 extends SimpleTagSupport{
	
	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		JspWriter writer = getJspContext().getOut();
		writer.println("<br>This is second Custom tag Decalartation");
	}

}
