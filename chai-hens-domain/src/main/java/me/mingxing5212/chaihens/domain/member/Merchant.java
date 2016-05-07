package me.mingxing5212.chaihens.domain.member;

import me.mingxing5212.chaihens.domain.DomainEntity;

/**
 * 接入平台商户
 *
 * @author Mingxing Li
 * @date 3/2/16
 */
public class Merchant extends DomainEntity {
    private Long id;
    private String name;

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
}
