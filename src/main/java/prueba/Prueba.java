package prueba;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Prueba {


    public static void main(String[] args) {



        try {
            MultiTiff.generateMultiPageTiff("/home/eespinoza/IdeaProjects/pruebaImagen/src/main/resources/","prueba");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
