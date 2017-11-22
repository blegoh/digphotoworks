package com.mascitra.digphotoworks;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class About extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about,container,false);
        TextView textView = view.findViewById(R.id.konten);
        textView.setText("Saya Hardiyan Digwiyono (Jember). Saya & team akan mengambil sisi terbaik Anda dalam bingkai foto. Hubungi DiG: 081357772570 | 580C7A93");
        return view;
    }
}
