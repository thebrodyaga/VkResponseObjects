package com.thebrodyaga.vkobjects.ads;



/**
 * Campaign com.thebrodyaga.vkobjects.status
 */
public enum CampaignStatus {

    STOPPED(0),


    STARTED(1),


    DELETED(2);

    private final Integer value;

    CampaignStatus(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
