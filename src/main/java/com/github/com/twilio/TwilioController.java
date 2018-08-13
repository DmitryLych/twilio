package com.github.com.twilio;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test/webhook")
public class TwilioController {

    @PostMapping
    public void test(@RequestBody final Object body) {

        System.out.println(body);
    }
}
