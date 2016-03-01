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

    private Optional<Long> merchantId = Optional.empty();
    private Optional<List<VoucherStatus>> voucherStatus = Optional.empty();
    private Optional<List<VoucherType>> voucherTypes = Optional.empty();
    private Optional<Long> storeId = Optional.empty();
    private Optional<Long> effectiveStartTime = Optional.empty();
    private Optional<Long> effectiveEndTime = Optional.empty();
    private Optional<Integer> start = Optional.empty();
    private Optional<Integer> end = Optional.empty();

    public Optional<Long> getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Optional<Long> merchantId) {
        this.merchantId = merchantId;
    }

    public Optional<List<VoucherStatus>> getVoucherStatus() {
        return voucherStatus;
    }

    public void setVoucherStatus(Optional<List<VoucherStatus>> voucherStatus) {
        this.voucherStatus = voucherStatus;
    }

    public Optional<List<VoucherType>> getVoucherTypes() {
        return voucherTypes;
    }

    public void setVoucherTypes(Optional<List<VoucherType>> voucherTypes) {
        this.voucherTypes = voucherTypes;
    }

    public Optional<Long> getStoreId() {
        return storeId;
    }

    public void setStoreId(Optional<Long> storeId) {
        this.storeId = storeId;
    }

    public Optional<Long> getEffectiveStartTime() {
        return effectiveStartTime;
    }

    public void setEffectiveStartTime(Optional<Long> effectiveStartTime) {
        this.effectiveStartTime = effectiveStartTime;
    }

    public Optional<Long> getEffectiveEndTime() {
        return effectiveEndTime;
    }

    public void setEffectiveEndTime(Optional<Long> effectiveEndTime) {
        this.effectiveEndTime = effectiveEndTime;
    }

    public Optional<Integer> getStart() {
        return start;
    }

    public void setStart(Optional<Integer> start) {
        this.start = start;
    }

    public Optional<Integer> getEnd() {
        return end;
    }

    public void setEnd(Optional<Integer> end) {
        this.end = end;
    }
}
