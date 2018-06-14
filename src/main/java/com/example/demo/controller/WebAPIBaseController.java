package com.example.demo.controller;

import com.example.demo.base.exception.GetFailedException;
import com.example.demo.base.exception.PostFailedException;
import com.example.demo.base.response.Response;
import org.apache.log4j.Logger;
import org.hibernate.service.spi.ServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by CHENGRui on 2017/9/7.
 */
@Controller
public abstract class WebAPIBaseController {
    private static final Logger LOGGER = Logger.getLogger(WebAPIBaseController.class);

    @ExceptionHandler(ServiceException.class)
    public
    @ResponseBody
    Response handleServiceException(HttpServletRequest req, Throwable exception) {
        LOGGER.error("handleServiceException, req:" + req.getRequestURI(), exception);
        return Response.fail("服务暂时不可用，请稍后再试或联系技术人员~~~");
    }

    @ExceptionHandler(Throwable.class)
    public
    @ResponseBody
    Response handleThrowable(HttpServletRequest req, Throwable exception) {
        LOGGER.error("handleThrowable, req:" + req.getRequestURI(), exception);
        return Response.fail(exception.getMessage()+"，联系技术人员或待会儿再试试看~0=0~");
    }

    @ExceptionHandler(GetFailedException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public String handleGetFailedException(){
        return "noPrivilege";
    }

    @ExceptionHandler(PostFailedException.class)
    @ResponseBody
    public Response handlePostFailedException(HttpServletRequest req, Throwable exception) {
        return Response.fail(exception.getMessage());
    }
}