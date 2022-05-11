package by.academy.Exam;

import java.util.Arrays;


    public class MainExam {
        public static void main(String[] args) {
            Integer [] arrayMarks = new Integer[5];
            Double [] arrayMarks1 = new Double[5];
            Exam<Integer> exam = new Exam<>(arrayMarks, 1);
            Exam<Double> exam1 = new Exam<>(arrayMarks1, 1.0);
            for (int j = 0; j < 5; j++){
                exam.add((int)(Math.random()*100));
            }
            exam.add(48);
            exam.add(84);
            System.out.println(Arrays.toString(exam.array));
            System.out.println(exam.calaFinalMark(exam.array));

            for (int jr = 0; jr < 5; jr++){
                exam1.add(Math.random()*100);
            }
            exam1.add(48.0);
            exam1.add(88.0);
            System.out.println(Arrays.toString(exam1.array));
            System.out.println(exam1.calaFinalMark(exam1.array));
        }
    }


