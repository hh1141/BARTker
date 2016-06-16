package com.honghaisen.bartinfo;


import android.app.Fragment;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.HashMap;

public class InfoFragment extends Fragment {

    String minutes;
    String platform;
    String direction;
    String length;
    String color;
    String bikeflag;
    String num;

    private TextView seperator;
    private TextView min;
    private TextView plat;
    private TextView dir;
    private TextView len;
    private TextView col;
    private TextView bf;
    private HashMap<String, String> map;

    public InfoFragment() {
        // Required empty public constructor
        map = new HashMap<String, String>();
        map.put("RED", "#ff0000");
        map.put("YELLOW", "#ffff00");
        map.put("BLUE", "#0066ff");
        map.put("GREEN", "#009933");
        map.put("ORANGE", "#ff9933");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_info, container, false);
        seperator = (TextView) view.findViewById(R.id.seperator);
        min = (TextView) view.findViewById(R.id.min);
        plat = (TextView) view.findViewById(R.id.plat);
        dir = (TextView) view.findViewById(R.id.direction);
        len = (TextView) view.findViewById(R.id.length);
        col = (TextView) view.findViewById(R.id.color);
        bf = (TextView) view.findViewById(R.id.bikeflag);

        min.setText("minutes left: " + minutes);
        plat.setText("platform: " + platform);
        dir.setText("direction: " + direction);
        len.setText("length: " + length);
        col.setText("color: " + color);
        col.setTextColor(Color.parseColor(map.get(color)));
        bf.setText("bikeflag: " + bikeflag);
        seperator.setText("===============result" + num + "================");

        return view;
    }

}
