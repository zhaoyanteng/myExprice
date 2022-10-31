package practise;

import java.util.Objects;

public class AccountBank {
    private String accountId;
    private double balance;
    public AccountBank(){

    }

    public AccountBank(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountBank{" +
                "accountId='" + accountId + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountBank that = (AccountBank) o;
        return Double.compare(that.balance, balance) == 0 &&
                Objects.equals(accountId, that.accountId);
    }

    @Override
    public int hashCode() {
        final int prime =21;
        int result =1;
        result = prime*result+((accountId==null)?0:accountId.hashCode());
        long temp;
        temp = Double.doubleToLongBits(balance);
        result = prime*result+(int) temp;
        return result;
    }


}
