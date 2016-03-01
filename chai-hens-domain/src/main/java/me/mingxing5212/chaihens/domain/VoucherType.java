package me.mingxing5212.chaihens.domain;

/**
 * 卡券类型
 * 1: 代金券
 * 2: 优惠券
 *
 * @author Mingxing Li
 * @date 3/2/16
 */
public enum VoucherType {
    CASH(1),
    DISCOUNT(2);

    VoucherType(Integer code){
        this.code = code;
    }

    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return this.code.toString();
    }
}
