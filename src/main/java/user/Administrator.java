package user;

import store.Store;

public class Administrator extends Account{

    private AccountState userState;
    private String username;
    private String password;
    private Store preferredStore;





    public Administrator (String username, String password) {
        this.username = username;
        this.password = password;
        this.userState = AccountState.ADMINISTRATOR;
    }

    public AccountState getUserState() {
        return userState;
    }

    public void setUserState(AccountState userState) {
        this.userState = userState;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Store getPreferredStore() {
        return preferredStore;
    }

    public void setPreferredStore(Store preferredStore) {
        this.preferredStore = preferredStore;
    }

}
