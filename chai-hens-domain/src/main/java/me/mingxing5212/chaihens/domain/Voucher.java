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
    private String code;
    private VoucherStatus status = VoucherStatus.CREATED;
    private BigDecimal denomination;
    private String description;
    private Merchant merchant;
    private Store store;
    private String avatar;
    private String color;
    private Long effectiveStartTime;
    private Long effectiveEndTime;

    public Voucher(){}

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

    public VoucherStatus getStatus() {
        return status;
    }

    public void setStatus(VoucherStatus status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", code='" + code + '\'' +
                ", status=" + status +
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
