package com.ruby.java.ch06;

public class Member {
    private String username;
    private String password;
    private String role;
    private boolean enabled;

    public Member(String username, String password, String role, boolean enabled) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "Member{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", enabled=" + enabled +
                '}';
    }

    public static void main(String[] args) {
        Member[] members = new Member[10];

        // 10개의 Member 객체 생성
        for (int i = 0; i < members.length; i++) {
            // 예시로 사용할 값들 설정
            String username = "사용자" + (i + 1);
            String password = "password" + (i + 1);
            String role = (i % 2 == 0) ? "사용자" : "관리자";
            boolean enabled = (i % 2 == 0);

            // Member 객체 생성 및 배열에 저장
            members[i] = new Member(username, password, role, enabled);
        }

        // 저장된 객체들을 반복문을 이용하여 출력
        for (Member member : members) {
            System.out.println(member);
        }
    }
}
