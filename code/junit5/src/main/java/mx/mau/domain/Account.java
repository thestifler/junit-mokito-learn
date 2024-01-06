package mx.mau.domain;

import java.math.BigDecimal;

public class Account {

    private String name;
    private BigDecimal amount;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public Account(String name, BigDecimal amount) {
        this.name = name;
        this.amount = amount;
    }

    public void  debit(BigDecimal amount){
        this.amount = this.amount.subtract(amount);

    }
    public void credit(BigDecimal amount){
        this.amount=this.amount.add(amount);
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Account)) {
            return false;
        }
        Account account = (Account) obj;
        if (this.name == null || this.amount == null) {
            return false;
        }
        return this.name.equals(account.getName()) && this.amount.equals(account.getAmount());
    }

    
}
