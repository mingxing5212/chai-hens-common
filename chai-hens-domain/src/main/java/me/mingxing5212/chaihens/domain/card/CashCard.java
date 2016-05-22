package me.mingxing5212.chaihens.domain.card;

import me.mingxing5212.chaihens.domain.DomainEntity;

/**
 * CashCard
 *
 * @author Mingxing Li
 * @date 15/5/16
 */
public class CashCard extends DomainEntity {
    private String id;
    private String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
