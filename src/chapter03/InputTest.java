package chapter03;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * TODO
 *
 * @Author L
 * @Since 2020/06/14 20:14
 * @Version 1.0
 **/
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream( new FileInputStream("/Users/liuwenjie/git/project/designpatternheadfirst/src/chapter03/test.txt")));
            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
