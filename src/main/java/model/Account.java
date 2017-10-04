package model;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DateFormat;
import java.util.Date;


public class Account {
    private Card card;
    private int id;
    private BigDecimal balance;
    private int userId;
    private Date dateOfOpenAccount;

    public Account(Card card, int userId) {
        this.card = card;
        this.balance = balance.divide(BigDecimal.ZERO, MathContext.DECIMAL32);
        this.userId = userId;
        this.dateOfOpenAccount = new Date();
        DateFormat.getDateInstance();
        id++;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;

        Account other = (Account) obj;

        if (this.id != other.id)
            return false;
        if (this.balance != other.balance)
            return false;
        if (this.card != other.card)
            return false;
        if (this.userId != other.userId)
            return false;
        return (this.dateOfOpenAccount != other.dateOfOpenAccount);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + card.hashCode();
        result = 31 * result + id;
        result = 31 * result + balance.hashCode();
        result = 31 * result + userId;
        result = 31 * result + dateOfOpenAccount.hashCode();
        return result;
    }
}
