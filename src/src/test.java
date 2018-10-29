import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Scanner;
import java.io.*;
import java.util.Map;


public class test {
    static char[] buff = new char[3];
    String key, value;
   static boolean onKey = true;
    static int i = 0;

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/johnmcguinness/Desktop/JavaPrograms/dictwitherik/src/src/source.txt");
        Scanner start = new Scanner(file);
        buff[0] = start.next().charAt(2);
        buff[1] = start.next().charAt(3);
        buff[2] = start.next().charAt(4);
        for(; 0 < file.length(); i++){
            lookingAtFile(file);
        }
    }
    public static void lookingAtFile(File f) throws IOException {
        Scanner in = new Scanner(f);
        while(in.hasNext()){
               if(onKey){
                   buff[0] = buff[1];
                   buff[1] = buff[2];
                   buff[2] = in.next().charAt(i);
               }
               if(buff.equals("\";\"") && onKey==false){
                   onKey = true;
               }
               if(buff.equals("\",\"") && onKey){
                   onKey = false;
               }
       }

    }

}
