import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Scanner;
import java.io.*;
import java.util.Map;


public class test {
    static char[] buff = new char[3];
    String key, value;
   static boolean onKey = true;

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/johnmcguinness/Desktop/JavaPrograms/dictwitherik/src/src/source.txt");
        for(int i = 0; 0 < file.length(); i++){
            lookingAtFile(file);
        }
    }
    public static void lookingAtFile(File f) throws IOException {
        Scanner in = new Scanner(f);
        while(in.hasNext()){
               if(onKey){
                  buff[] = in.next().charAt(j);

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
