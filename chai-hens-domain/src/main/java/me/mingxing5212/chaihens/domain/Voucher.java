package me.mingxing5212.chaihens.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 卡券
 *
 * @author Mingxing Li
 * @date 3/2/16
 */
public class Voucher implements Serializable{
    private Long id;
    private String name;
    private VoucherType type;
    private BigDecimal denomination;
    private String description;
    private Merchant merchant;
    private Store store;
    private String avatar;
    private String color;
    private Long effectiveStartTime;
    private Long effectiveEndTime;

    public Voucher(){}
    public Voucher(Long id, String name, VoucherType type, BigDecimal denomination, String description, Merchant merchant, Store store, String avatar, String color, Long effectiveStartTime, Long effectiveEndTime) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.denomination = denomination;
        this.description = description;
        this.merchant = merchant;
        this.store = store;
        this.avatar = avatar;
        this.color = color;
        this.effectiveStartTime = effectiveStartTime;
        this.effectiveEndTime = effectiveEndTime;
    }

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

    public VoucherType getType() {
        return type;
    }

    public void setType(VoucherType type) {
        this.type = type;
    }

    public BigDecimal getDenomination() {
        return denomination;
    }

    public void setDenomination(BigDecimal denomination) {
        this.denomination = denomination;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getEffectiveStartTime() {
        return effectiveStartTime;
    }

    public void setEffectiveStartTime(Long effectiveStartTime) {
        this.effectiveStartTime = effectiveStartTime;
    }

    public Long getEffectiveEndTime() {
        return effectiveEndTime;
    }

    public void setEffectiveEndTime(Long effectiveEndTime) {
        this.effectiveEndTime = effectiveEndTime;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", denomination=" + denomination +
                ", description='" + description + '\'' +
                ", merchant=" + merchant +
                ", store=" + store +
                ", avatar='" + avatar + '\'' +
                ", color='" + color + '\'' +
                ", effectiveStartTime=" + effectiveStartTime +
                ", effectiveEndTime=" + effectiveEndTime +
                '}';
    }
}
