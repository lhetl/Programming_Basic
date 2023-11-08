package club.club5_25.test2.MainTest;

import club.club5_25.test2.sharingTest.Admin;
import club.club5_25.test2.sharingTest.Professor;

import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            int[] scores = { 80, 90, 70, 85, 95 };
            // 배열 인수를 사용하여 학생들의 점수를 5씩 증가시키는 메서드
            updateScores(scores);
            System.out.println("변경된 점수: " + Arrays.toString(scores));

            // 내부 클래스를 사용하여 학생 객체 생성 및 점수 조회
            Student student = new Student("testid", "testname");
            student.displayScores();

            // 클래스 간 데이터 공유
            Professor professor = new Professor();
            professor.updateData();
            Admin admin = new Admin();
            admin.readData();
        }

        // 배열 인수를 사용하여 학생들의 점수를 변경하는 메서드
        public static void updateScores(int[] score) {
            for(int i=0;i<score.length;i++){
                score[i]+=5;
            }
        }

        static class Student {
            private String studentId;
            private String name;
            private int[] scores;

            public Student(String studentId, String name) {
                this.studentId = studentId;
                this.name = name;
                this.scores = new int[] { 80, 90, 70, 85, 95 };
            }

            public void displayScores() {
                System.out.println("학번: " + studentId);
                System.out.println("이름: " + name);
                System.out.println("과목별 점수: " + Arrays.toString(scores));
            }
        }
}

