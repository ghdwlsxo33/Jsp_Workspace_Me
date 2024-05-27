package com.busanit501.springex.controller.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.Arrays;

@ControllerAdvice
@Log4j2
public class CommonExceptionAdvice {

//    @ResponseBody
//    @ExceptionHandler(NumberFormatException.class)
//    public String exceptNumberFormat(NumberFormatException numberFormatException) {
//        log.error("-------error---------");
//        log.error("numberFormatException : " + numberFormatException.getMessage());
//        return "number Format Exception wow!";
//    }

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public String commonException(Exception exception) {
        StringBuffer buffer = new StringBuffer("<ul>");
        buffer.append("<li>" + exception.getMessage() + "</li>");
        Arrays.stream(exception.getStackTrace()).forEach(elem ->
        buffer.append("<li>"+elem+"</li>"));

        buffer.append("</ul>");

        return buffer.toString();
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String notFound() {
        return "custom404";
    }
}
