package com.deloitte.mytags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomTagAddress extends TagSupport {
   
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		JspWriter out = pageContext.getOut();
		
			try {
				out.println("<h2>Address of deloitte</h2>");
				out.println("<h2>DivyaSree Technopolis</h2>");
				out.println("<h2>Yemlur</h2>");
				out.println("<h2>Bangalore</h2>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return super.doStartTag();
	}
}
