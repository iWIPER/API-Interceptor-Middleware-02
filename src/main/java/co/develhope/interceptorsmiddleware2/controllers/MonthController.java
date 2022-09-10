package co.develhope.interceptorsmiddleware2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.Month;

@RestController
@RequestMapping("/months")
public class MonthController {

    @GetMapping("")
    public Month getMonth(HttpServletRequest request){
        return (Month) request.getAttribute("MonthInterceptor");
    }
}