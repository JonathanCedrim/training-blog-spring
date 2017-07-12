package br.com.amorapro.trainningblogspring.controller;

import br.com.amorapro.trainningblogspring.model.Post;
import br.com.amorapro.trainningblogspring.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    @Autowired
    private PostService postService;

    @GetMapping(value = "/")
    public String index() {
        return "ola";
    }

    @GetMapping(value = "/posts")
    public Iterable<Post> getPosts() {
        return postService.getAllPost();
    }
}