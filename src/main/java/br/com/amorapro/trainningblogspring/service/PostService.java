package br.com.amorapro.trainningblogspring.service;

import br.com.amorapro.trainningblogspring.model.Post;
import br.com.amorapro.trainningblogspring.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;


    public Post getPost(Long id) {
        return postRepository.findOne(id);
    }

    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    public void insert(Post post) {
        postRepository.save(post);
    }
}
