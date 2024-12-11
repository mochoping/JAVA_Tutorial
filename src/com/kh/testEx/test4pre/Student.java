package com.kh.testEx.test4pre;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Student {
    public static void main(String[] args) {
        Set<String> students = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("학생 관리 프로그램");
            System.out.println("1. 학생 추가");
            System.out.println("2. 학생 삭제");
            System.out.println("3. 학생 목록 출력");
            System.out.println("4. 특정 학생 존재 여부 확인");
            System.out.println("5. 종료");
            System.out.print("메뉴 선택: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("추가 할 학생 이름을 입력하세요 : ");
                    String inputName = sc.next();
                    if (students.add(inputName)) {
                        System.out.println(inputName + " 학생이 등록되었습니다. ");
                    } else {
                        System.out.println(inputName + " 학생은 이미 등록되었습니다. ");
                    }
                    break;
                case "2":
                    System.out.print("목록에서 제거하고자 하는 학생 이름을 입력하세요 : ");
                    String removeName = sc.next();
                    if (students.contains(removeName)) {
                        students.remove(removeName);
                        System.out.println(removeName + " 학생이 삭제되었습니다. ");
                    } else {
                        System.out.println(removeName + "입력하신 학생을 찾을 수 없습니다.");
                    }
                    break;
                case "3":
                    System.out.println(students.toString());
                    System.out.println();
                    Iterator<String> iterator = students.iterator();
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next() + "");
                    }
                    break;
                case "4":
                    System.out.print("확인 하고자 하는 학생 이름을 입력하세요 : ");
                    String containsName = sc.next();
                    if (students.contains(containsName)) {
                        System.out.println(containsName + " 해당 학생은 목록에 존재합니다.");
                    } else {
                        System.out.println(containsName + " 해당 학생이 목록에 존재하지 않습니다.");
                    }
                    break;
                case "5":
                    exit = true;
                    return;
                default:
                    System.out.println("메뉴 선택은 1 - 5 번까지의 숫자로만 선택 가능합니다. ");
                    break;


            }
        }
    }

}
