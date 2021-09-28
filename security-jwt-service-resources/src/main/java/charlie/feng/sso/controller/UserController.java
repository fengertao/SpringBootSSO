package charlie.feng.sso.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/query")
    public String query() {
        return "success";
    }

    @RequestMapping("/update")
    public String update() {
        return "update";
    }
}
