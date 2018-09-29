package com.firstapp.darkdreamer.fxpfileexplorerandplaylistcreator;

import java.io.File;
import java.io.FileFilter;

public class ImageAdapter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if(pathname.getName().endsWith("img") || pathname.getName().endsWith("IMG") || pathname.getName().endsWith("jpg") ) {
            return true;
        }else if(pathname.getName().endsWith("jpeg") || pathname.getName().endsWith("png") || pathname.getName().endsWith("gif") || pathname.getName().endsWith("JPEG") || pathname.getName().endsWith("JPG") || pathname.getName().endsWith("GIF") ){
            return true;
        }
        else {
            return false;
        }
    }
}
