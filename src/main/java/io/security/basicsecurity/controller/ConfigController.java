package io.security.basicsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConfigController {

    @GetMapping(value = "/config")
    public String login() {
        return "admin/config";
    }
}
