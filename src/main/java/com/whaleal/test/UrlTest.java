package com.whaleal.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class UrlTest {
    public static void main(String[] args)throws Exception {
        URL url = new URL("https://tcc.taobao.com/cc/json/mobile_tel_segment.htm?tel=13026194071") ;
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection() ;
        urlConnection.setRequestMethod("GET") ;
        urlConnection.connect() ;
        InputStream inputStream = urlConnection.getInputStream() ;
        String responseStr = ConvertToString(inputStream) ;
        System.out.println(responseStr);

    }

    public static String ConvertToString(InputStream inputStream){
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        StringBuilder result = new StringBuilder();
        String line = null;
        try {
            while((line = bufferedReader.readLine()) != null){
                result.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                inputStreamReader.close();
                inputStream.close();
                bufferedReader.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        return result.toString();
    }
}