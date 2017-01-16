package cn.xiexianbin.ueditor.web.controllers;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.baidu.ueditor.ActionEnter;

@Controller
@RequestMapping("/")
public class UEditorController {

	@Value("${ueditor.config.json.path}")
	private String configJSONPath;

	@RequestMapping(value="/ueditor1_4_3-utf8-jsp/jsp/controller.jsp")
	public void controller(HttpServletRequest request,
			HttpServletResponse response, String action) {
		// response.setContentType("application/json");
		String rootPath = request.getSession().getServletContext().getRealPath("/");
		response.setHeader("Content-Type", "text/html");
		try {
			request.setCharacterEncoding("utf-8");
			String exec = new ActionEnter(request, rootPath).exec();
			PrintWriter writer = response.getWriter();
			writer.write(exec);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
