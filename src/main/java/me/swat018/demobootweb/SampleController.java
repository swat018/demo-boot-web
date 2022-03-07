package me.swat018.demobootweb;

import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {


    // preHandle 1
    // preHandle 2
    // 요청 처리
    // postHandler 2
    // postHandler 1
    // 뷰 렌더링
    // afterCompletion 2
    // afterCompletion 1

    @GetMapping("/hello")
    public String hello(@RequestParam("id") Person person) {
        return "hello " + person.getName();
    }

    @GetMapping("/message")
    public @ResponseBody String message(@RequestBody String body) {
        return body;
    }
}
