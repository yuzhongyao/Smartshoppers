package store;

import miscellaneous.Address;
import miscellaneous.Day;
import user.Manager;

import java.util.List;

public class Store {
    private static int count = 0;
    private int id;
    private Address address;
    private List<Item> inventory;
    private List<Item> sale;
    private List<Day> availability;
    private List<String> categories;
    private List<Manager> managers;




















    public Store(Address address) {
        this.address = address;
        this.setId(count);
        count++;
    }

    public Store(Address address, int id) {
        this.address = address;
        this.setId(id);
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public List<Item> getInventory() {
        return inventory;
    }
    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }
    public List<Item> getSale() {
        return sale;
    }
    public void setSale(List<Item> sale) {
        this.sale = sale;
    }
    public List<Day> getAvailability() {
        return availability;
    }
    public void setAvailability(List<Day> availability) {
        this.availability = availability;
    }
    public List<String> getCategories() {
        return categories;
    }
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }
    public List<Manager> getManagers() {
        return managers;
    }
    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }
}
