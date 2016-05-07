package me.mingxing5212.chaihens.domain.member;

import me.mingxing5212.chaihens.domain.DomainEntity;

/**
 * 商户用户
 *
 * @author Mingxing Li
 * @date 5/2/16
 */
public class MerchantUser extends DomainEntity {
    private Long id;
    private String name;
    private Merchant merchant;

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

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }
}
