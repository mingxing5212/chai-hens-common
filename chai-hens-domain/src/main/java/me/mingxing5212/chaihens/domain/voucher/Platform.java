package me.mingxing5212.chaihens.domain.voucher;

/**
 * 外部卡券接入平台
 * 1: 微信
 * 11:其他
 *
 * @author Mingxing Li
 * @date 3/2/16
 */
public enum Platform {
    WECHAT(1),
    OTHERTS(11);

    Platform(Integer code){this.code = code;}

    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
