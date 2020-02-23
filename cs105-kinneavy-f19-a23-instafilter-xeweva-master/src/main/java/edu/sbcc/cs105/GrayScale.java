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

/**
 * gray scale filter makes image black - white styled
 */
public class GrayScale implements Filterable{

    @Override
    /**
     * Gray scale filter
     */
    public PixelArray filter(PixelArray pic){

        int picWidth = pic.getWidth();
        int picHeight = pic.getHeight();
        PixelArray newPic = new PixelArray(new BufferedImage(picWidth, picHeight, BufferedImage.TYPE_INT_ARGB));
        
        for(int i = 0; i < picHeight; i++)
            for(int j = 0; j < picWidth; j++){

                Pixel currentPixel = pic.getPixel(i, j);

                int gray = currentPixel.r + currentPixel.g + currentPixel.b;

                int red = gray / 3;
                int green = gray / 3;
                int blue = gray / 3;

                newPic.setPixel(i, j, new Pixel(red, green, blue)); //setting new pixel color
            }
        return newPic;
    }
}