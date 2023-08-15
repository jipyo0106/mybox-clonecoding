package clonecoding.mybox.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public Mono<ResponseEntity<String>> login() {
        /* login logic */
        return Mono.just(ResponseEntity.ok("token"));
    }
}