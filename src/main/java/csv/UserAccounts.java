package csv;

import miscellaneous.Address;
import store.Store;
import user.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class UserAccounts {
    public HashMap<String, Account> userAccounts;
    public HashMap<String, User> user;
    public HashMap<String, Store> store;
    public String path;

    public UserAccounts(String path){
        this.userAccounts = new HashMap<String, Account>();
        this.user = new HashMap<String, User>();
        this.store = new HashMap<String, Store>();
        this.path = path;
    }

    public void load() throws Exception{
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            //column headers
            //line = br.readLine();

            while((line = br.readLine()) != null) {
                String values[] = line.split(",");
                //0 is first name
                //1 is last name
                //2 is account state
                //3 is username
                //4 is password
                //5 is street number
                //6 is street name
                //7 is city
                //8 is postal
                //9 is province
                //10 is country
                //11 is store street number
                //12 is store street name
                //13 is store city
                //14 is store postal
                //15 is store province
                //16 is store country
                //17 is store id

                Address a2 = new Address(values[5], values[6], values[7], values[8], values[9], values[10]);
                User u = new User(values[0], values[1], a2);
                this.user.put(values[3], u);


                switch(values[2]) {
                    case ("CUSTOMER"):{
                        Customer c = new Customer(values[3], values[4]);
                        u.setAccount(c);
                        this.userAccounts.put(values[3], c);
                        break;
                    }
                    case ("MANAGER"):{
                        Manager m = new Manager(values[3], values[4]);
                        u.setAccount(m);
                        this.userAccounts.put(values[3], m);
                        break;
                    }
                    case("ADMINISTRATOR"):{
                        Administrator ad = new Administrator(values[3],values[4]);
                        u.setAccount(ad);
                        this.userAccounts.put(values[3], ad);
                        break;
                    }
                }

                if(values.length > 11) {
                    Address a = new Address(values[11], values[12], values[13], values[14], values[15], values[16]);
                    Store s = new Store(a, Integer.parseInt(values[17]));
                    this.store.put(values[3], s);
                    u.getAccount().changePreferredStore(s);
                }


            }
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }


    public HashMap<String, Account> getUserAccounts() {
        return userAccounts;
    }

    public void setUserAccounts(HashMap<String, Account> userAccounts) {
        this.userAccounts = userAccounts;
    }

    public HashMap<String, User> getUser() {
        return user;
    }

    public void setUser(HashMap<String, User> user) {
        this.user = user;
    }

    public HashMap<String, Store> getStore() {
        return store;
    }

    public void setStore(HashMap<String, Store> store) {
        this.store = store;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
