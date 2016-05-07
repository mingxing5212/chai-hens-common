package me.mingxing5212.chaihens.domain.store;

import me.mingxing5212.chaihens.domain.DomainEntity;

/**
 * 实体店
 *
 * @author Mingxing Li
 * @date 4/2/16
 */
public class Store extends DomainEntity {
    private Long id;
    private String name;
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
