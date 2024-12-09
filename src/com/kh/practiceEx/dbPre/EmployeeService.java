package com.kh.practiceEx.dbPre;

import java.util.Date;

public interface EmployeeService {

    /**
     * 신규 직원정보 추가기능
     * @param employee
     */
    void addEmployee(Employee employee);

    /**
     * 직원 정보 수정기능
     * @param emp_name
     * @param email
     * @param phone
     * @param dept_code
     * @param job_code
     * @param sal_level
     * @param salary
     * @param bonus
     * @param manager_id
     * @param ent_time
     * @param ent_yn
     */
    void updateEmployee(String emp_name, String email, String phone, String dept_code, String job_code, String sal_level, double salary, double bonus, String manager_id, Date ent_time, char ent_yn);

    /**
     * 직원 삭제 기능
     * 14전부 받는게 아니라 필요에 따른 변수만 받아 진ㅇ행
     *
     * @param emp_id 사원번호
     * @param emp_name 사원이름
     * @param email 이메일
     * @param ent_yn 퇴사여부
     *
     *
     */
    void deleteEmployee(String emp_id, String emp_name, String email, char ent_yn );

    /**
     * 특정 사원이 본인의 회원정보를 수정하기 위해 회원정보 조회 기능
     * 조회시에는 사원번호, 이름, 이메일로 가능
     * @param emp_id
     * @param emp_name
     * @param email
     */
    void viewEmployee(String emp_id, String emp_name, String email);

    /**
     * 특정 회원을 찾고자 하는 상위 직급을 위한 회원정보 조회 기능
     * 조회시에는 사원번호, 이름, 이메일로 가능
     * @param info_emp
     * 사원 번호 또는 사원이름 또는 사원 이메일중 하나라도 일치하는 정보가 있다면 회원정보조회
     */
    void viewEmployee(String info_emp);

    /**
     * 회원정보 조회 기능
     * 조회시에는 사원번호, 이름, 이메일로 가능 (정보가 일치한 회원 찾을것)
     * 동명이인이 존재할때 추가적인 정보확인으로 조회
     * @param emp_name
     * @param email
     */
    void viewEmployee(String emp_name, String email);

    void longinEmployee(String emp_name, String phone);
}
