package me.mingxing5212.chaihens.domain.member;

import java.time.LocalDate;

/**
 * 微信会员
 *
 * @author Mingxing Li
 * @date 23/4/16
 */
public class WechatMember extends Member {
    private String openId;
    private String avatar;
    private LocalDate followDate;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public LocalDate getFollowDate() {
        return followDate;
    }

    public void setFollowDate(LocalDate followDate) {
        this.followDate = followDate;
    }
}
