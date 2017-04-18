package com.example.aditya.discountfeed;

/**
 * Created by Manu on 4/2/2017.
 */


import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Belal on 5/27/2016.
 */


//Class extending FirebaseInstanceIdService
public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static final String TAG = "MyFirebaseIIDService";

    @Override
    public void onTokenRefresh() {

        //Getting registration token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();

        //Displaying token on logcat
        Log.d(TAG, "Refreshed token: " + refreshedToken);

    }

    private void sendRegistrationToServer(String token) {
        //You can implement this method to store the token on your server
        //Not required for current project
    }
}

//acess token
//fDhqPVRsx4Y:APA91bEhYZLG5IrjO5tUe-eKCdNGD3_uJNiOOF3q-uoCHq4n28YZ1ZIgdBs_bXYHpbs8pdbR5eEPK7LyiatnpEwL7oW8DtI5e0czC_cxpt0p_qnVXB8M5yqXKJ6rduqaX8sHTNsIJotw
//    From the left menu select notification.
//        Click on new message.
//        Enter message, select single device and paste the token you copied and click on send.