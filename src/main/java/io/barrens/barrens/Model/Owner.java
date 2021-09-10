package io.barrens.barrens.Model;

import javax.persistence.*;

@Entity
@Table
public class Owner {

    @Id
    @SequenceGenerator(
            name = "owner_sequence",
            sequenceName = "owner_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "owner_sequence"
    )
    Long ownerId;

    String ownerName;

    Double ownerBalance;

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Double getOwnerBalance() {
        return ownerBalance;
    }

    public void setOwnerBalance(Double ownerBalance) {
        this.ownerBalance = ownerBalance;
    }
}
