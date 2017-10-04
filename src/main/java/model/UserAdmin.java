package model;

import java.util.ArrayList;
import java.util.List;

public class UserAdmin extends User{
    protected List<Card> cards = new ArrayList<>(); //карты
    protected List<Account> accounts = new ArrayList<>(); //счета

    public UserAdmin(Role role, List<Card> cards, List<Account> accounts) {
        super(Role.ADMIN);
        this.cards = cards;
        this.accounts = accounts;
    }
}
