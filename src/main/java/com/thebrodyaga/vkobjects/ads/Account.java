package com.thebrodyaga.vkobjects.ads;




import java.util.Objects;

/**
 * Account object
 */
public class Account {
    /**
     * Account ID
     */

    private Integer accountId;

    /**
     * Account type
     */

    private AccountAccountType accountType;

    /**
     * Information whether com.thebrodyaga.vkobjects.account is active
     */

    private Boolean accountStatus;


    private AccessRole accessRole;

    public Integer getAccountId() {
        return accountId;
    }

    public AccountAccountType getAccountType() {
        return accountType;
    }

    public boolean isAccountStatus() {
        return accountStatus;
    }

    public AccessRole getAccessRole() {
        return accessRole;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountStatus, accountId, accountType, accessRole);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountId, account.accountId) &&
                Objects.equals(accountType, account.accountType) &&
                Objects.equals(accountStatus, account.accountStatus) &&
                Objects.equals(accessRole, account.accessRole);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("accountId=").append(accountId);
        sb.append(", accountType='").append(accountType).append("'");
        sb.append(", accountStatus=").append(accountStatus);
        sb.append(", accessRole=").append(accessRole);
        sb.append('}');
        return sb.toString();
    }
}
