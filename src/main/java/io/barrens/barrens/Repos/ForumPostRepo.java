package io.barrens.barrens.Repos;

import io.barrens.barrens.Model.ForumPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForumPostRepo extends JpaRepository<ForumPost, Long> {

}