package com.r1ckr.jwtgenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/token")
public class TokenController {

    @Autowired
    private JwtTokenGenerator jwtTokenGenerator;

    @GetMapping
    public @ResponseBody String getToken(
            @RequestHeader(value="X-Consumer-Username") String username){
        return jwtTokenGenerator.generate(username);
    }
}
