package com.example.aditya.discountfeed;

import java.util.ArrayList;

/**
 * Created by Manu on 4/3/2017.
 */

public class StoreController {

    private static ArrayList<StoreModel> storeList;


    //create an object of SingleObject
    private static StoreController instance ;

    //make the constructor private so that this class cannot be
    //instantiated
    private StoreController(){}

    //Get the only object available
    public static ArrayList getInstance(){

        if (instance==null)
        {
            instance = new StoreController();
            ArrayList<StoreModel> storeListAtInit = new ArrayList();

            storeListAtInit.add(new StoreModel ("walmart1", R.drawable.walmart , false, "1")) ;
            storeListAtInit.add(new StoreModel ("walmart2", R.drawable.walmart , false, "2")) ;
            storeListAtInit.add(new StoreModel ("walmart3", R.drawable.walmart , false, "3")) ;
            storeListAtInit.add(new StoreModel ("biglot1", R.drawable.biglots , false, "4")) ;
            storeListAtInit.add(new StoreModel ("biglot2", R.drawable.biglots , false, "5")) ;
            storeListAtInit.add(new StoreModel ("biglot3", R.drawable.biglots , false, "6")) ;



//            StoreModel
            instance = new  StoreController();
            instance.storeList = storeListAtInit;
        }

        return instance.storeList;
    }


}
