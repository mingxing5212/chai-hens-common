package me.mingxing5212.chaihens.domain;

/**
 * 卡券状态
 *
 * 0: 新建, 草稿状态
 * 1: 待投放
 * 2: 已投放
 * 3: 已撤销
 *
 * @author Mingxing Li
 * @date 4/2/16
 */
public enum VoucherStatus {
    CREATED(0),
    PUT_ON_READY(1),
    PUT_ON(2),
    WITHDRAWN(3);

    private Integer code;
    VoucherStatus(Integer code){
        this.code = code;
    }

}
