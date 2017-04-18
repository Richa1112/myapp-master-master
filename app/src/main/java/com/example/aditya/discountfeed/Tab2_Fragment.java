package com.example.aditya.discountfeed;

/**
 * Created by Aditya on 2/5/2017.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class Tab2_Fragment extends Fragment {

    GridView grid;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public void setUserVisibleHint(boolean visible){
        super.setUserVisibleHint(visible);
        if (visible && isResumed()){
            if (grid == null) {
                return;
            }
            final ArrayList<StoreModel> storeList = StoreController.getInstance();

            CustomGridFav adapter = new CustomGridFav(this.getActivity(), storeList);

//        adapter.notifyDataChanged();
            grid.invalidateViews();
            grid.setAdapter(adapter);
        }
    }

    @Override
    public void onResume() {
        super.onResume();

        final ArrayList<StoreModel> storeList = StoreController.getInstance();

        CustomGridFav adapter = new CustomGridFav(this.getActivity(), storeList);

//        adapter.notifyDataChanged();
        grid.invalidateViews();
        grid.setAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_2_fragment, container, false);

        final ArrayList<StoreModel> storeList = StoreController.getInstance();

        CustomGridFav adapter = new CustomGridFav(this.getActivity(), storeList);
        grid = (GridView) view.findViewById(R.id.gridViewFav);


        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getActivity(), "You Clicked at " + storeList.get(position).getStoreName(), Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    public void updateData() {


    }
}

