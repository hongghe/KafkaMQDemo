package com.hongghe.kafkamqdemo.controller;


import com.hongghe.kafkamqdemo.domain.ApiResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/home")
public class HomepageController {

    private static final Logger logger = LoggerFactory.getLogger(HomepageController.class);

    @RequestMapping("hello")
    public ApiResult hello(HttpServletRequest request, HttpServletResponse response) {
        ApiResult apiResult = new ApiResult();
        apiResult.setErrorCode(0);
        apiResult.setErrorMessage("success");
        String hello = "hello, man!";
        apiResult.setData(hello);
        return apiResult;
    }
}
