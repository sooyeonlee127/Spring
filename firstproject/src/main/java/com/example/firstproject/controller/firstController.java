package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// 요청을 받을 때에는 @Controller 내부의 @GetMapping으로 받음
@Controller
public class firstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "수연");
        // username이라는 변수에 수연이라는 값을 넣어준다.

        return "greetings"; // 이 코드의 의미: templates/greetings.mustache 파일을
        // 찾아서 브라우저로 전송해준다는 의미!
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "홍길동");
        return "goodbye";
    }


}
