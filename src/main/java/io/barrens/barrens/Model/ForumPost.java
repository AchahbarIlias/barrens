package io.barrens.barrens.Model;

import javax.persistence.*;

@Entity
@Table
public class ForumPost {

    @Id
    @SequenceGenerator(
            name = "forumPost_sequence",
            sequenceName = "forumPost_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "forumPost_sequence"
    )
    int forumPostId;
    String forumPostCategory;
    String forumPostName;
    String forumPostDescription;


    public int getForumPostId() {
        return forumPostId;
    }

    public void setForumPostId(int forumPostId) {
        this.forumPostId = forumPostId;
    }

    public String getForumPostCategory() {
        return forumPostCategory;
    }

    public void setForumPostCategory(String forumPostCategory) {
        this.forumPostCategory = forumPostCategory;
    }

    public String getForumPostName() {
        return forumPostName;
    }

    public void setForumPostName(String forumPostName) {
        this.forumPostName = forumPostName;
    }

    public String getForumPostDescription() {
        return forumPostDescription;
    }

    public void setForumPostDescription(String forumPostDescription) {
        this.forumPostDescription = forumPostDescription;
    }
}
