package unit3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyClass{
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("C:\\Users\\hello\\IdeaProjects\\aiml-b\\src\\unit3\\db.properties");
            Properties p = new Properties();
            p.load(fr);
            System.out.println(p.getProperty("user"));
            System.out.println(p.getProperty("pass"));
            System.out.println(p.getProperty("coupoun"));


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}