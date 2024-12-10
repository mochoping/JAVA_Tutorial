package com.kh.practiceEx.filePre;

import java.io.File;
import java.io.FileWriter;

public class FileService {

    // File FileWriter 이용해서 바탕화면에 food.docs 생성하기
    // try-catch

    /** void createFile(String fileName)
     *
     * @param content
     */
    public void createFile(String content) {
        // 사용자 바탕화면 경로 가져오기
        String path = System.getProperty("user.home")+ "/Desktop/";
        String filename = "food.docs";


        File file = new File(path + filename); //파일경로와 파일명 가져오기

        // try() 안에 FileWriter 나 FileREader BufferedReader 를 작성하면 close는 생략 가능
        try(FileWriter fw = new FileWriter(file)){
            fw.write(content); // 내용 작성하기
            System.out.println("File Created");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "파일 생성중 문제가 발생했습니다.");
        }





    }

}
