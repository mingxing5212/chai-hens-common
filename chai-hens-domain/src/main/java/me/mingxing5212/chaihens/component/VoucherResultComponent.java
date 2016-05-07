package me.mingxing5212.chaihens.component;

import me.mingxing5212.chaihens.domain.voucher.Voucher;

import java.util.List;

/**
 * 优惠券查询结果组件
 *
 * @author Mingxing Li
 * @date 13/3/16
 */
public class VoucherResultComponent implements java.io.Serializable {
    private List<Voucher> vouchers;
    private Integer totalCount;

    public List<Voucher> getVouchers() {
        return vouchers;
    }

    public void setVouchers(List<Voucher> vouchers) {
        this.vouchers = vouchers;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
