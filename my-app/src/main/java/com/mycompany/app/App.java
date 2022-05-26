package com.mycompany.app;
import com.github.lalyos.jfiglet.FigletFont;
import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // using default font standard.flf, obtained from maven artifact
        String asciiArt1 = FigletFont.convertOneLine("hello");
        System.out.println(asciiArt1);
    }
}
