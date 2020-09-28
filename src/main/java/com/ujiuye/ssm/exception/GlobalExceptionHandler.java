package com.ujiuye.ssm.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author LiLe
 * @create 2020-08-17 21:18
 */
public class GlobalExceptionHandler implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse,
                                         Object o,
                                         Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        String message=e.getMessage();
        System.out.println(message);

        modelAndView.addObject("msg","您的网络不稳定");
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
