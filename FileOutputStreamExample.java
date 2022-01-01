package IOStreamIntro;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args){
        try{
            FileOutputStream fout= new FileOutputStream("E:\\Projects\\Java-FileIO-Project G13\\testout.txt");
            fout.write(65);
            fout.close();
            System.out.println("success...");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
