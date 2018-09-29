package com.firstapp.darkdreamer.fxpfileexplorerandplaylistcreator;

import java.io.File;
import java.io.FileFilter;

public class DocumentsAdapter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if(pathname.getName().endsWith("pdf") || pathname.getName().endsWith("PDF") || pathname.getName().endsWith("dox") ) {
            return true;
        }else if(pathname.getName().endsWith("DOX") || pathname.getName().endsWith("ppt") || pathname.getName().endsWith("PPT") || pathname.getName().endsWith("docx") || pathname.getName().endsWith("DOCX")  ){
            return true;
        }
        else {
            return false;
        }
    }
}
