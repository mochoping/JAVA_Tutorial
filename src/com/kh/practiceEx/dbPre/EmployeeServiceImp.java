package com.kh.practiceEx.dbPre;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceImp implements EmployeeService{
    // String = 사원ID 를 가져오는 문자열   Employee = ID에 해당하는 사원 정보
    public Map<String, Employee> employeeMap = new HashMap<String, Employee>();

    @Override
    public void addEmployee(Employee employee) {
        // 추가할 사원 정보 put 저장  사원등록을 할 때마다
        // 몇 번째로 가입한 사원인지 자동으로 count 를 진행할 것
        // 사원정보를 모두 저장
        employeeMap.put(employee.getEmp_id(), employee);
    }

    @Override
    public void updateEmployee(String emp_name, String email, String phone, String dept_code, String job_code, String sal_level, double salary, double bonus, String manager_id, Date ent_time, char ent_yn) {
        System.out.println("정보 저장하고자하는 코드 작성");
    }

    @Override
    public void deleteEmployee(String emp_id, String emp_name, String email, char ent_yn) {
        Employee employee = employeeMap.get(emp_id);
         if(employee != null){
             employeeMap.remove(emp_id);
             System.out.println("사원정보를 제거했습니다.");
         } else {
             System.out.println("employee is null");
         }
    }

    @Override
    public void viewEmployee(String emp_id, String emp_name, String email) {
        Employee employee = employeeMap.get(emp_id);
        if(employee != null){
            System.out.println(employee.toString());
        } else {
            System.out.println("사원번호, 사원이름, 이메일 주소가 일치하는 정보가 없습니다.");
            System.out.println("employee is null");
        }
    }

    @Override
    public void viewEmployee(String info_emp) {// info_emp = emp_id or emp_name or emp_email
        Employee employee = employeeMap.get(info_emp);
        if(employee != null){
            System.out.println(employee.toString());
        } else {
            System.out.println("사원번호, 사원이름, 이메일 주소가 일치하는 정보가 없습니다.");
            System.out.println("employee is null");
        }
    }

    @Override
    public void viewEmployee(String emp_name, String email) {
        Employee employee = employeeMap.get(emp_name);
        if(employee != null) {
            System.out.println(employee.toString());
        } else {
            System.out.println("employee is null");
        }
    }

    @Override
    public void longinEmployee(String emp_name, String phone) {
        //일치하는 정보가 존재하면 로그인이 완료되었습니다.
    }
}
