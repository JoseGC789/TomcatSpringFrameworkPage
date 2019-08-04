package com.apishow.controller;

import com.apishow.service.ContentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ShowController{

    private final ContentService contentService;

    public ShowController(ContentService contentService){
        this.contentService = contentService;
    }

    @GetMapping("/service")
    public ModelAndView show(){
        ModelAndView view = new ModelAndView("myView");
        return view.addObject("message", contentService.getMessage());
    }
}
