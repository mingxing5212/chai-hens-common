package me.mingxing5212.chaihens.component;

import me.mingxing5212.chaihens.domain.VoucherStatus;
import me.mingxing5212.chaihens.domain.VoucherType;

import java.util.List;
import java.util.Optional;

/**
 * 优惠券查询组件
 *
 * @author Mingxing Li
 * @date 21/2/16
 */
public class VoucherSearchComponent implements java.io.Serializable{

    private Long merchantId;
    private List<VoucherStatus> voucherStatus;
    private List<VoucherType> voucherTypes;
    private Long storeId;
    private Long effectiveStartTime;
    private Long effectiveEndTime;
    private Integer start;
    private Integer end;

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public List<VoucherStatus> getVoucherStatus() {
        return voucherStatus;
    }

    public void setVoucherStatus(List<VoucherStatus> voucherStatus) {
        this.voucherStatus = voucherStatus;
    }

    public List<VoucherType> getVoucherTypes() {
        return voucherTypes;
    }

    public void setVoucherTypes(List<VoucherType> voucherTypes) {
        this.voucherTypes = voucherTypes;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
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

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }
}
