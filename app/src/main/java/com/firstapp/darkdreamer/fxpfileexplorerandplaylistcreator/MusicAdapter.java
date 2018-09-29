package com.firstapp.darkdreamer.fxpfileexplorerandplaylistcreator;

import android.content.IntentFilter;

import java.io.File;
import java.io.FileFilter;

public class MusicAdapter implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        if(pathname.getName().endsWith("mp3") || pathname.getName().endsWith("MP3")  ) {
            return true;
        }
        else {
            return false;
        }
    }
}
