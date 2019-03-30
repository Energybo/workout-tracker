package com.sadang.app.WorkoutTracker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@RunWith(SpringRunner.class)
@SpringBootTest
@Controller
public class WorkoutTrackerApplicationTests {

	@Test
	public void contextLoads() {
	}

	@GetMapping("")

	public ModelAndView hello() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name",  "형갑");
		modelAndView.setViewName("index");
		return modelAndView;
	}
}


