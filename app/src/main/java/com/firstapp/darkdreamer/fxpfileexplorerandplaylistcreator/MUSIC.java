package com.firstapp.darkdreamer.fxpfileexplorerandplaylistcreator;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;

import static android.os.Environment.getExternalStorageDirectory;

public class MUSIC extends AppCompatActivity {

    ListView listView;
    ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        listView=findViewById(R.id.listview4);
        adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1);
        getDir();
    }

    public void getDir(){
        try{
            File[] files=File.listRoots();
            File f1= Environment.getExternalStorageDirectory();
            adapter.add(f1.getName());
            File[] files1=f1.listFiles();
            for(File file:files1){
                adapter.add(file.getName());
                if(file.isDirectory()){
                    File[] files2=file.listFiles();
                    for (final File file1:files2){
                        adapter.add(file1.getName());
                        if(file1.isDirectory()){
                            File[] files3=file1.listFiles();
                            for(final File file2:files3){
                                adapter.add(file2.getName());
                                if(file2.isDirectory()){
                                    File[] files4=file2.listFiles(new MusicAdapter());
                                    for(final File file3:files4){
                                        adapter.add(file3.getName());
                                    }
                                }
                            }
                        }
                    }
                }
            }
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent=new Intent();
                    intent.setAction(Intent.ACTION_GET_CONTENT);
                    intent.setDataAndType(Uri.parse("Files://"+getExternalStorageDirectory().getAbsolutePath()),"audio/*");
                }
            });
        }catch (Exception e){
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG).show();
        }
    }
}

