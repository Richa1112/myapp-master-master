package com.example.aditya.discountfeed;

/**
 * Created by Manu on 4/3/2017.
 */

public class StoreModel {

    String storeName;
    int image;
    boolean isFav;
    String id;

    public StoreModel(String storeName, int image, boolean isFav, String id) {
        this.storeName = storeName;
        this.image = image;
        this.isFav = isFav;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public boolean isFav() {
        return isFav;
    }

    public void setFav(boolean fav) {
        isFav = fav;
    }
}
