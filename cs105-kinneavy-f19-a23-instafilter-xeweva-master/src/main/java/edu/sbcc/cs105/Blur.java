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
 * blur filter makes picture blurry
 */
public class Blur implements Filterable{

    @Override
    /**
     * blur filter
     */
    public PixelArray filter(PixelArray pic){

        int picWidth = pic.getWidth();
        int picHeight = pic.getHeight();
        PixelArray newPic = new PixelArray(new BufferedImage(picWidth, picHeight, BufferedImage.TYPE_INT_ARGB));
        
        for(int i = 1; i < picHeight - 1; i++) 
            for(int j = 1; j < picWidth - 1; j++){
                
                int red = 0, green = 0, blue = 0;

                for(int k = -1; k <= 1; k++) //heighbour (3x3) pixels survey
                    for(int o = -1; o <= 1; o++)
                        if(!(k == 0 && o == 0)){ //avoiding central pixel
                            
                            Pixel currentPixel = pic.getPixel(i + k, j + o);
                            
                            red += currentPixel.r;
                            green += currentPixel.g;
                            blue += currentPixel.b;
                        }

                red /= 8;
                green /= 8;
                blue /= 8;

                //constrain is not required

                newPic.setPixel(i, j, new Pixel(red, green, blue)); //setting new pixel color
            }

        //filling border pixels
        for(int i = 0; i < picWidth; i++){

            newPic.setPixel(0, i, pic.getPixel(0, i));
            newPic.setPixel(picHeight - 1, i, pic.getPixel(picHeight - 1, i));
        }
        
        for(int i = 0; i < picHeight; i++){

            newPic.setPixel(i, 0, pic.getPixel(i, 0));
            newPic.setPixel(i, picWidth - 1, pic.getPixel(i, picWidth - 1));
        }

        return newPic;
    }
}

