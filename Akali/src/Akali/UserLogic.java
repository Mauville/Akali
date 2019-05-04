package Akali;

import Akali.user.AbstractUser;

import java.io.*;

public class UserLogic {

    public static boolean createFile(AbstractUser o) {
        String name = o.getUsername();
        File f = null;
        boolean bool = false;
        try {
            // returns pathnames for files and directory
            f = new File("/res/userFiles/" + name);
            // create directories
            bool = f.mkdirs();
            // print

        } catch (Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
        try {
            FileOutputStream fos = new FileOutputStream(name + ".alv");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(o);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bool;
    }

    public void notepad(File f) throws Exception {
        String path = f.getAbsolutePath();
        ProcessBuilder pb = new ProcessBuilder("Notepad.exe", path);
        try {
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //TODO recursive deleting
    //TODO  rename deleted folders, delete credentials and keep the translation.
    //TODO when manager "accepts" a traduction, the traduction.txt is moved to "../Finished/"

    public boolean consultFile(AbstractUser user) {
        String name = user.getUsername();
        boolean confirmed = false;
        File f = new File("/res/userFiles/" + name);
        confirmed = f.isDirectory();
        return confirmed;
    }


}
