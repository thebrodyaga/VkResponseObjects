package com.thebrodyaga.vkobjects.groups;



/**
 * Current user's member com.thebrodyaga.vkobjects.status
 */
public enum GroupFullMemberStatus {

    NOT_A_MEMBER(0),


    MEMBER(1),


    NOT_SURE(2),


    DECLINED(3),


    HAS_SENT_A_REQUEST(4),


    INVITED(5);

    private final Integer value;

    GroupFullMemberStatus(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
