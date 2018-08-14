package com.example.myblog.controller;

import com.example.myblog.domain.BlogEntry;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BlogController {

    @RequestMapping(value = "/test")
    public ResponseEntity<Object> testApp() {

        BlogEntry blogEntry = new BlogEntry();
        blogEntry.setTitle("Blog entry name");
        return new ResponseEntity<>(blogEntry, HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<BlogEntry> createBlogEntry(@RequestBody BlogEntry blogEntry)
    {
        return new ResponseEntity<>(blogEntry, HttpStatus.OK);
    }

}
