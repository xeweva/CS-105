/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: InstaFilter
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */

package edu.sbcc.cs105;

import sbccutils.*;
import java.awt.image.BufferedImage;
import java.lang.Math;

/**
 * Sepia filter
 */
public class Sepia implements Filterable{

    @Override
    /**
     * sepia filter
     */
    public PixelArray filter(PixelArray pic){

        int picWidth = pic.getWidth();
        int picHeight = pic.getHeight();
        PixelArray newPic = new PixelArray(new BufferedImage(picWidth, picHeight, BufferedImage.TYPE_INT_ARGB));
        
        for(int i = 0; i < picHeight; i++)
            for(int j = 0; j < picWidth; j++){

                Pixel currentPixel = pic.getPixel(i, j);

                int red = Math.min((int) Math.round((currentPixel.r * .393) + (currentPixel.g * .769) + (currentPixel.b * .189)), 255);
                int green = Math.min((int) Math.round((currentPixel.r * .349) + (currentPixel.g * .686) + (currentPixel.b * .168)), 255);
                int blue = Math.min((int) Math.round((currentPixel.r * .272) + (currentPixel.g * .534) + (currentPixel.b * .131)), 255);

                newPic.setPixel(i, j, new Pixel(red, green, blue)); //setting new pixel color
            }
        return newPic;
    }
}