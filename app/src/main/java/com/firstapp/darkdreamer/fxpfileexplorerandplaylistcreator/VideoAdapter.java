package com.firstapp.darkdreamer.fxpfileexplorerandplaylistcreator;

import java.io.File;
import java.io.FileFilter;

public class VideoAdapter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if(pathname.getName().endsWith("mp4") || pathname.getName().endsWith("MP4") || pathname.getName().endsWith("avi") ) {
            return true;
        }else if(pathname.getName().endsWith("AVI") || pathname.getName().endsWith("mkv") || pathname.getName().endsWith("MKV")  ){
            return true;
        }
        else {
            return false;
        }
    }
}
