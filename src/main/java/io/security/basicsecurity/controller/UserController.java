package io.security.basicsecurity.controller;

import io.security.basicsecurity.domain.Account;
import io.security.basicsecurity.domain.AccountDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping(value = "/mypage")
    public String myPage() throws Exception {
        return "user/mypage";
    }

    @GetMapping(value = "/users")
    public String createUser() {
        return "user/login/register";
    }

    @PostMapping(value = "/users")
    public String createUser(AccountDto accountDto) {
        ModelMapper modelMapper = new ModelMapper();
        Account account = modelMapper.map(accountDto, Account.class);
        account.setPassword(accountDto.getPassword());

    }
}
