package io.barrens.barrens.Service;

import io.barrens.barrens.Model.Owner;
import io.barrens.barrens.Repos.OwnerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {



    @Autowired
    OwnerRepo ownerRepo;
    public List<Owner> getAllOwners()
    {
        return ownerRepo.findAll();
    }


}
