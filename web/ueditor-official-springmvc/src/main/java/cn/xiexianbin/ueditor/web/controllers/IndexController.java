package cn.xiexianbin.ueditor.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * main controller.
 *
 * @author Xie Xianbin
 * @since 1.4.3
 */
@Controller
public class IndexController {

	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	
    @RequestMapping("/")
    String index() {
    	logger.debug("into index controller...........");
        return "upload.html";
    }
}
