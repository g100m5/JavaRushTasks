package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

import java.util.ArrayList;
import java.util.List;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes imageType) throws IllegalArgumentException {

//        String arr [] = type.toString().split(".");
//        //String arr [] = str.split(".");
//        String format = arr[arr.length - 1].toLowerCase();


        if (imageType == ImageTypes.JPG)
            return new JpgReader();

        if (imageType == ImageTypes.BMP)
            return new BmpReader();

        if (imageType == ImageTypes.PNG)
            return new PngReader();

        throw new IllegalArgumentException("Unknown image type");
    }

    }

