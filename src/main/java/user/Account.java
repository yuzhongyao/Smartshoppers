package user;

import store.Store;

public abstract class Account {
    private AccountState userState;
    private String username;
    private String password;
    private Store preferredStore;

    public void changePreferredStore(Store s){
        this.preferredStore = s;
    }

}
