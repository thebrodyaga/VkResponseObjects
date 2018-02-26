package com.thebrodyaga.vkobjects.ads;



/**
 * Campaign type
 */
public enum CampaignType {

    NORMAL("normal"),


    VK_APPS_MANAGED("vk_apps_managed"),


    MOBILE_APPS("mobile_apps"),


    PROMOTED_POSTS("promoted_posts");

    private final String value;

    CampaignType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
