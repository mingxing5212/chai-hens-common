package me.mingxing5212.chaihens.domain.member;

/**
 * 会员状态
 * 1:关注
 * 2:已取消关注
 *
 * @author Mingxing Li
 * @date 23/4/16
 */
public enum WechatMemberStatus {
    FOLLOWING(1),
    AWAY(2);

    WechatMemberStatus(Integer code){
        this.code = code;
    }

    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
