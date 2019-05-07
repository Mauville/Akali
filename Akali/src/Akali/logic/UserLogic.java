package logic;

import user.AbstractUser;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

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

        String dirPath = "Akali\\res\\userFiles" + File.separator + o.getUsername();
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
        String userPath = dirPath + File.separator + newFileName;

        FileOutputStream fos = new FileOutputStream(userPath);
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


    //Only creates the file in the path, doesn't create the directory
    public static FileOutputStream createUserFile(AbstractUser user) {
        String path = "res\\userFiles" + File.separator + user.getUsername();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(path + user.getUsername() + ".akali");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(user);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert consultUser(user);
        return fos;
    }

    public static boolean updateUser(String username, AbstractUser newOverwrite) {
        boolean success = false;
        String pathOriginal = "res/userFiles/" + username;
        File oldFile = new File("res/userFiles/" + username + File.separator + username + ".akali");
        deleteUser(oldFile.getPath());
        if (newOverwrite.getUsername().equals(username)) {
            createUserFile(newOverwrite);
        } else {
            File oldDir = new File(pathOriginal);
            String newPath = "res/userFiles/" + newOverwrite.getUsername();
            createUserFile(newOverwrite);
            assert oldDir.renameTo(new File(newPath));
        }
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

    //Does the file exist? Recieving path WITH THE .akali FILE
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
        success = deleteUser("/res/userFiles/" + oldName + "/" + oldName + ".akali");


        return success;
    }

    //Delete user, recieve user
    public static boolean deleteUser(AbstractUser user) {
        boolean confirm = false;
        String name = user.getUsername();
        String path = "/res/userFiles/" + name + "/" + name + ".akali";
        File f = new File(path);
        if (f.delete() && consultUser(user))
            confirm = true;
        return confirm;
    }

    //Delete user, recieves path WITH THE FILE "/res/userFiles/[NAME]/[NAME].akali
    //It's super important the path has de .akali in it, otherwise it will delete the hole directory
    public static boolean deleteUser(String path) {
        boolean confirm = false;
        File f = new File(path);
        if (f.delete() && consultUser(path))
            confirm = true;
        return confirm;
    }

    //Add Original file to the common "/res/originalFiles", recieving the file
    public static boolean addOriginal(File f) throws IOException {
        boolean success = false;
        Path pathCopy = Paths.get("/res/originalFiles/");
        Path pathOriginal = Paths.get(f.getAbsolutePath());
        Files.copy(pathOriginal, pathCopy, StandardCopyOption.REPLACE_EXISTING);
        assert (Files.readAllLines(pathOriginal).equals(Files.readAllLines(pathCopy)));
        return success;
    }

    ////Add Original file to the common "/res/originalFiles", recieving the path of the original
    public static boolean addOriginal(String path) throws IOException {
        boolean success = false;
        Path pathCopy = Paths.get("/res/originalFiles");
        Path pathOriginal = Paths.get(path);
        Files.copy(pathOriginal, pathCopy, StandardCopyOption.REPLACE_EXISTING);
        assert (Files.readAllLines(pathOriginal).equals(Files.readAllLines(pathCopy)));

        return success;
    }

    public static boolean addTraduction(File f, String username) throws IOException {
        boolean success = false;
        Path pathCopy = Paths.get("/res/" + username + "/translated/");
        Path pathOriginal = Paths.get(f.getCanonicalPath());
        Files.copy(pathOriginal, pathCopy, StandardCopyOption.REPLACE_EXISTING);
        assert (Files.readAllLines(pathOriginal).equals(Files.readAllLines(pathCopy)));
        if (Files.readAllLines(pathOriginal).equals(Files.readAllLines(pathCopy))) {
            System.out.println("Succesfully uploaded traduction");
            success = true;
        } else {
            System.out.println("Error while uploading");
        }
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

    public static String getMijo(String username) throws IOException {
        String path = "res/userFiles/" + username + "/" + username + ".akali";
        File f = new File(path);
        System.out.println("Looking in this path... %s" + f.getAbsoluteFile());
        FileInputStream fin = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fin);
        AbstractUser elMijo = null;
        try {
            elMijo = (AbstractUser) ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Username that wil return is " + elMijo.getUsername());
        return elMijo.getPassword();

    }

    public static String mijosPrivilege(String username) throws IOException {
        String privilege = null;
        String path = "res/userFiles/" + username + File.separator + username + ".akali";
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        AbstractUser au = null;
        try {
            au = (AbstractUser) ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        privilege = au.getPrivilege();
        return privilege;
    }
}
