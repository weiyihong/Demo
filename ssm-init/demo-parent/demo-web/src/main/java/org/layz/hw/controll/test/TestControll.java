package org.layz.hw.controll.test;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.layz.hw.service.ITestBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestControll {
	private static final Logger logger = Logger.getLogger(TestControll.class);
	@Autowired
	ITestBiz testBiz;
	@RequestMapping("/list")
	@ResponseBody
	public List<Map<String, Object>> getList(){
		logger.info("访问成功...");
		return testBiz.list();
	}
}
