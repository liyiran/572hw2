package liyiran.usc;/*
 * $Id$
 *
 * Copyright (c) 2003, 2004 WorldTicket A/S
 * All rights reserved.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yiran Li / 2M business applications a|s
 * @version $Revision$ $Date$
 */
@RestController
public class MainController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @Autowired
    private CrawEntityRepository crawEntityRepository;

    @GetMapping(path = "/craw") // Map ONLY GET Requests
    public @ResponseBody
    String addNewUser() {
        WebPage webPage = new WebPage();
        webPage.setUrl("test");
        crawEntityRepository.save(webPage);
        return "saved";
    }
}
