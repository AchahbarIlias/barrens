package io.barrens.barrens.Controller;


import io.barrens.barrens.Model.ForumPost;
import io.barrens.barrens.Service.ForumPostService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/forum")
public class ForumPostController {

    @Autowired
    ForumPostService forumPostService;

    @GetMapping("all")
    public List<ForumPost> getAllForums()
    {
//        model.addAttribute("owners",ownerService.getAllOwners());
//        return "overview-owners";
        return forumPostService.getAllForumPosts();
    }



}
