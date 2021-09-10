package io.barrens.barrens.Service;

import io.barrens.barrens.Model.ForumPost;
import io.barrens.barrens.Repos.ForumPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForumPostService {

    @Autowired
    ForumPostRepo forumPostRepo;
    public List<ForumPost> getAllForumPosts()
    {
        return forumPostRepo.findAll();
    }
}
