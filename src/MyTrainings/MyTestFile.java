package MyTrainings;

import com.sun.deploy.util.SyncFileAccess;

import java.io.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/**
 * @author  Vitalii Nedzelskyi
 * @version 1.0
 *
 * This class could not be used for any projects. This is just for Learning
 * This class will create new File and will do some modification.
 *
 */
public class MyTestFile {

    public static  void createFile(int maxNumberOfFile, File path) {
        for (int i = 0; i <maxNumberOfFile ; i++) {
            File file = new File(path, i+".txt");
            try {
                file.createNewFile();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws URISyntaxException, MalformedURLException, IOException {
        File myFile = new File("D:\\meTest\\", "test.txt");
        File dir = new File("D:\\mytest1\\");
        try {
            dir.mkdir();
        } catch (Exception e) {
            e.printStackTrace();
        }

        createFile(7,dir);

        File[] files = dir.listFiles();
        File root = dir;
        File[] file1 = File.listRoots();
        for (File elem : file1){
            System.out.println(elem);
        }

        URL web = new URL("https://google.com");
        ReadableByteChannel rbc = Channels.newChannel(web.openStream());
        FileOutputStream fos = new FileOutputStream("d:\\mytest1\\0.txt");
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);

       // File file3 = new File(dir, new URL(web));

        System.out.println(root.getTotalSpace() + " " + root.getFreeSpace());
        for (File elem : files){
            System.out.println(elem.getName());
        }

//        if(myFile.isFile()){
//            System.out.println(myFile.getPath());
//            System.out.println(myFile.getAbsolutePath());
//            System.out.println(myFile.canRead());
//            System.out.println(myFile.canWrite());
//            System.out.println(myFile.lastModified());
//            //System.out.println(myFile.createNewFile());
//            try {
//                if(myFile.createNewFile()) {
//                    System.out.println("Cool");
//                }
//            }catch(Exception e){
//                e.printStackTrace();
//            }
//        } else {
//            System.out.println("Is missing");
//        }
//
//        try {
//            myFile.delete();
//            if(myFile.createNewFile()) {
//                System.out.println("Cool");
//            }
//        }catch(Exception e){
//
//        }
    }
}

