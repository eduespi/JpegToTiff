package prueba;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) {



        try {
            MultiTiff.generateMultiPageTiff("PATH/file.tiff","fileName");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
