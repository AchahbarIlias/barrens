package io.barrens.barrens.Repos;

import io.barrens.barrens.Model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OwnerRepo extends JpaRepository<Owner, Long> {
    
}
