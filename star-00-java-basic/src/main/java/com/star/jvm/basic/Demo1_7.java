package com.star.jvm.basic;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * <p>
 * -XX:+PrintStringTableStatistics -XX:StringTableSize=200000
 * </p>
 *
 * @created： 2020-02-15
 * @author： xingxingzhao
 */
public class Demo1_7 {

  public static void main(String[] args) {
    try (

      BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("/02_projects/99_my/stars/star-00-java-basic/src/main/java/com/star/jvm/basic/dubbo.log"),"UTF-8"))){
        String line = null;
        long start = System.nanoTime();

        while (true){
          line = reader.readLine();
          if (line == null){
            break;
          }

        }
      System.out.println("cost:" + (System.nanoTime() - start) / 1000000);
      } catch (UnsupportedEncodingException ex) {
      ex.printStackTrace();
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
    } catch (IOException ex) {
      ex.printStackTrace();
    }

  }
}
