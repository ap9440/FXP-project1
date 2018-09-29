package com.firstapp.darkdreamer.fxpfileexplorerandplaylistcreator;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MyHomePageAdapter extends BaseAdapter {

    Context context;
    String[] names;
    int[] pic;
    LayoutInflater inflater;


    public MyHomePageAdapter(Context context, String[] names, int[] pic) {
        this.context = context;
        this.names = names;
        this.pic = pic;
        inflater =LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.homepageadapter,null);
        ImageView imageView=convertView.findViewById(R.id.imageView2);
        Button button=convertView.findViewById(R.id.button3);
        button.setText(names[position]);
        imageView.setImageResource(pic[position]);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,names[position],Toast.LENGTH_LONG).show();
                try {
                    Class name= Class.forName("com.firstapp.darkdreamer.fxpfileexplorerandplaylistcreator."+names[position]);
                    Intent intent=new Intent(context,name);
                    Toast.makeText(context,names[position],Toast.LENGTH_LONG).show();
                    context.startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText(context,names[position],Toast.LENGTH_LONG).show();
                }
            }
        });
        return convertView;
    }
}
