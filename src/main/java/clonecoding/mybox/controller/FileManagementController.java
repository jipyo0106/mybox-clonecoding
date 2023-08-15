package clonecoding.mybox.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class FileManagementController {
    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public Mono<String> uploadFile () {
        return Mono.just("upload success!");
    }

    @RequestMapping(value = "/download", method = RequestMethod.PUT)
    public Mono<String> uploadFile (String fileName) {
        return Mono.just("Download success!");
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public Mono<String> deleteFile (String fileName) {
        return Mono.just("Delete success!");
    }
}
