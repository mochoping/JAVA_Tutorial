package com.kh.testEx.test0prcatice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FilePractices {
    String path = System.getProperty("user.home") + "/Desktop/";
    String fileName = "robot";
    String extension = ".txt";
    String filePath = path + fileName + extension;
    public static void main(String[] args) {



    }

    /**void createFile(String content) 컨탠츠 내용이 담긴 파일 만들기 메서드
     * @param content 파일에 담길 내용.
     *                경로는 지정되어있음.
     */
    public void createFile(String content){
        File file = new File(filePath); // 정해진 경로에 정해진 파일명으로 생성
        if(!file.exists()) {
            try (FileWriter fw = new FileWriter(file)) {
                fw.write(content);
                System.out.println(content + "내용 작성 완료");
            } catch (Exception e) {
                System.out.println(e.getMessage() + "파일 내용 작성에 문제가 발생했습니다.");
            }
        } else {
            System.out.println("생성하려는 파일이 이미 존재합니다.");
        }
    }

    /** void readFile() 파일 읽은후 출력 기능
     *
     */
    public void readFile(){
        File file = new File(filePath);
        if(file.exists()) {
            try (FileReader fr = new FileReader(file)) {
                BufferedReader br = new BufferedReader(fr);
                String line = null;
                while((line = br.readLine()) != null){
                    System.out.println(line);
                }
            } catch (Exception e) {
                System.out.println("파일을 읽는데 문제가 발생했습니다.");
            }
        } else {
            System.out.println("목표 파일을 찾지 못했습니다.");
        }
    }

    /**void writeFile(String content) 존재하는 파일에 content 내용 이어쓰기 기능
     * @param content 이어쓰기를 할 내용
     */
    public void writeFile(String content){
        File file = new File(filePath);
        if (file.exists()) {
            try (FileWriter fw = new FileWriter(file, true);) {// ture값이 붙어야만 이어쓰기 가능.
                fw.write(content);
            } catch (Exception e) {
                System.out.println(e.getMessage()+"문제가 발생했습니다. ");
            } finally {
                System.out.println(  content + "이어쓰기가 완료되었습니다.");
            }
        } else {
            System.out.println("File Not Found");
        }
    }
}
