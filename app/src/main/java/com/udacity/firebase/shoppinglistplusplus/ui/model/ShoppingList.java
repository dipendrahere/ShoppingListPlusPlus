package com.udacity.firebase.shoppinglistplusplus.ui.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.firebase.client.ServerValue;
import com.google.firebase.database.Exclude;

import java.util.HashMap;

/**
 * Created by dipendra on 10/03/17.
 */

public class ShoppingList {
    private String listName;
    private String owner;
    private HashMap<String, Object> latestModified;

    public HashMap<String, Object> getLatestModified() {
        return latestModified;
    }

    public void setLatestModified(HashMap<String, Object> latestModified) {
        this.latestModified = latestModified;
    }
    public ShoppingList() {

    }

    public ShoppingList(String listName, String owner) {
        this.listName = listName;
        this.owner = owner;
        this.latestModified = new HashMap<String, Object>();
        this.latestModified.put("date", ServerValue.TIMESTAMP);
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    @JsonIgnore
    @Exclude
    public long getLatestModifiedlong(){
        return (long)latestModified.get("date");
    }

}
