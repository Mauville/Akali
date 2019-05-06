package Akali;

import user.AbstractUser;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class UserLogic {
//TODO LogIn & SignUp
    //TODO finish deletingFile addOriginal addTranslated
    //FilesLogic
    //UpdateUser
    //TODO commonFiles
//TODO recursive deleting
//TODO  rename deleted folders, delete credentials and keep the translation.
//TODO when manager "accepts" a traduction, the traduction.txt is moved to "../Finished/"


    //CreateUser v2 Create new file, called on the Log In page
    public static boolean createUser(AbstractUser o) throws IOException {
        boolean everythingOK = false;

        String dirPath = "res\\userFiles";
        String dirTranslate = "translated";
        String newFileName = o.getUsername() + ".akali";

        //We could set a README file inside the translated directory with the next line
        //String anotherNewFileName="README.txt";

        File newDir = new File(dirPath);

        everythingOK = newDir.mkdirs();
        if (everythingOK) {
            System.out.printf("1.Succesfully created directories, path: %s",
                    newDir.getCanonicalPath());
        } else if (newDir.exists()) {
            System.out.printf("1 Directory path already exists, path:%s", newDir.getCanonicalPath());
        } else {
            System.out.println("1.Unable to create directory");
        }

        //Create file under new dirPath
        File newFile = new File(dirPath + File.separator + newFileName);

        FileOutputStream fos = new FileOutputStream(newFileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(o);
        oos.close();


        //Create new file under the specified dir
        everythingOK = newFile.createNewFile();
        if (everythingOK) {
            System.out.printf("\n2. Succesfully created new file, path%s", newFile.getCanonicalPath());
        } else { //File may already exist
            System.out.printf("\n2. Unable to create new File");
        }

        //Create new dir under past dir
        File oneMoreDir = new File(dirPath + File.separator + dirTranslate);
        //Create dir for existed path
        everythingOK = oneMoreDir.mkdir();
        if (everythingOK) {
            System.out.printf("\n3. Succesfully created new directory, path:%s", oneMoreDir.getCanonicalPath());
        } else { //Dir may already exist
            System.out.printf("\n3. Unable to create dir");
        }


        return everythingOK;
    }

    /*
    public static boolean createUser(AbstractUser o) {
        String name = o.getUsername();
        File f = null;
        boolean bool = false;
        try {
            // returns pathnames for files and directory
            f = new File("/res/userFiles/" + name);
            // create directories
            bool = f.mkdirs();

        } catch (Exception e) {
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
     */
    //Only creates the file in the path, doesn't create the directory
    public static boolean createUserFile(AbstractUser user) {
        boolean success = false;
        try {
            FileOutputStream fos = new FileOutputStream(user.getUsername() + ".alv");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(user);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        success = consultUser(user);
        return success;
    }


    //Does the file exist? Recieving user
    public static boolean consultUser(AbstractUser user) {
        boolean confirmed = false;
        String name = user.getUsername();
        File f = new File("/res/userFiles/" + name);
        confirmed = f.exists();
        return confirmed;
    }

    //Does the file exist? Recieving path WITH THE .alv FILE
    public static boolean consultUser(String path) {
        boolean confirmed = false;
        File f = new File(path);
        confirmed = f.exists();
        return confirmed;
    }


    //Edit user's data, recieve old user & new user.
    public static boolean editUser(AbstractUser oldUser, AbstractUser newUser) {
        boolean success = false;
        String oldName = oldUser.getUsername();
        File f = new File("/res/userFiles/" + oldName);
        success = deleteUser("/res/userFiles/" + oldName + "/" + oldName + ".alv");


        return success;
    }

    //Delete user, recieve user
    public static boolean deleteUser(AbstractUser user) {
        boolean confirm = false;
        String name = user.getUsername();
        String path = "/res/userFiles/" + name + "/" + name + ".alv";
        File f = new File(path);
        if (f.delete() && consultUser(user))
            confirm = true;
        return confirm;
    }

    //Delete user, recieves path WITH THE FILE "/res/userFiles/[NAME]/[NAME].alv
    //It's super important the path has de .alv in it, otherwise it will delete the hole directory
    public static boolean deleteUser(String path) {
        boolean confirm = false;
        File f = new File(path);
        if (f.delete() && consultUser(path))
            confirm = true;
        return confirm;
    }

    //Add Original file to the common "/res/originalFiles", recieving the file
    public static boolean addOriginal(File f) {
        boolean success = false;


        return success;
    }

    ////Add Original file to the common "/res/originalFiles", recieving the path of the original
    public static boolean addOriginal(String path) {
        boolean success = false;
        File f = new File(path);

        return success;
    }


    //Open notepad with the original file, to be called when user opens "Original.txt"
    public void notepad(File f) throws Exception {
        String path = f.getAbsolutePath();
        ProcessBuilder pb = new ProcessBuilder("Notepad.exe", path);
        try {
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
