package com.kh.practiceEx.filePre;

import java.io.*;

public class FileService {

    // File FileWriter 이용해서 바탕화면에 food.docs 생성하기
    // try-catch

    /**
     * void createFile(String fileName)
     *
     * @param content
     */
    public void createFile(String content) {
        // 사용자 바탕화면 경로 가져오기
        String path = System.getProperty("user.home") + "/Desktop/";
        String filename = "food.docs";


        File file = new File(path + filename); //파일경로와 파일명 가져오기

        // try() 안에 FileWriter 나 FileREader BufferedReader 를 작성하면 close는 생략 가능
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(content); // 내용 작성하기
            System.out.println("File Created");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "파일 생성중 문제가 발생했습니다.");
        }
    }

    /**
     * 파일 읽기 기능 설정
     */
    public void readFile() {

        String path = System.getProperty("user.home") + "/Desktop/";
        String filename = "food.docs";

        File file = new File(path + filename);
        if (file.exists()) {
            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                System.out.println("File Read : " + file);
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage() + "파일을 읽는중 오류가 발생했습니다.");
            }
        } else {
            System.out.println("File Not Found");
        }


    }


    // todo : food.docs 파일에 이어쓰기 기능 설정해서 이어서 음식 작성
    // 줄바꿈 - 햄버거 줄바꿈 - 돈까스 줄바꿈 - 쌀국수 줄바굼 - 카레

    /** 파일 이어쓰기 기능 설정
     * void appendToFile(String content)
     * @param content 파일내용
     */
    public void appendToFile(String content) {
        String path = System.getProperty("user.home") + "/Desktop/";
        String filename = "food.docs";
        File file = new File(path + filename);
        if (file.exists()) {
            try (FileWriter fw = new FileWriter(file, true);) {
            fw.write(content);
            } catch (Exception e) {
            System.out.println(e.getMessage()+"문제가 발생했습니다. ");
            } finally {
            System.out.println(  content + "이어쓰기가 완료되었습니다.");
            }
        } else {
            System.out.println("File Not Found");
        }

/*try {
            if (!file.exists()) {
                file.createNewFile();
            }
                FileWriter fw = new FileWriter(file, true);
                fw.write(content);
                fw.close();
                System.out.println( content +"\n 이어쓰기가 완료되었습니다.");
        } catch (IOException e) {
            System.out.println(e.getMessage()+"문제가 발생했습니다. ");
        }*/
    }
}
