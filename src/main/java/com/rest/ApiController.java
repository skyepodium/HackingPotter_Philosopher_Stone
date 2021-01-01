package com.rest;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping(value="/api/snitch", method = RequestMethod.GET)
    public String findSnitch1(@RequestParam(value = "number", required = false) Integer number) {

        String result = "wrong value";
        int flagNumber = 44;

        if(!StringUtils.isEmpty(number)) {
            if(number == flagNumber) {
                result = "HP{D0_Y0U_KN0W_4B0UT_B5UTE_F0RCE}";
            }
        }

        return result;
    }
}
