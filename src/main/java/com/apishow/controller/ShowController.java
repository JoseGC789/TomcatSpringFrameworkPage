package com.apishow.controller;

import com.apishow.entities.PersonEntity;
import com.apishow.service.ContentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ShowController{

    private final ContentService contentService;

    public ShowController(ContentService contentService){
        this.contentService = contentService;
    }

    @GetMapping("/service/read")
    public ModelAndView showAll(){
        ModelAndView view = new ModelAndView("myView");
        return view.addObject("message", contentService.readAll());
    }

    @PostMapping("/service/write")
    public ResponseEntity<PersonEntity> writeEntry(@RequestBody PersonEntity person){
        return ResponseEntity.ok(contentService.write(person));
    }
}