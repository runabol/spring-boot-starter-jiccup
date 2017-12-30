package com.creactiviti.jiccup.spring.boot;

import static com.creactiviti.jiccup.Elements.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.creactiviti.jiccup.Html;

@Controller
public class Hello {
  
  @ResponseBody
  @RequestMapping("/hi")
  public Html render () {
    return html (
            body(
                h1(content("Hello World"))
              )
           );
  }
  
  
  
}
