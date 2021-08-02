package chapter12.GradeBook;

import java.util.Map;

public class GradeBook {
    public static void main(String[] args) {
        Map<String, Integer> originalGrades = TestResults.getOriginalGrades();
        Map<String, Integer> makeUpGrades = TestResults.getMakeUpGrades();

        for (var student: makeUpGrades.entrySet()){
            Integer firstGrade = originalGrades.get(student.getKey());
            Integer secondGrade = makeUpGrades.get(student.getKey());

            if (secondGrade > firstGrade){
                originalGrades.put(student.getKey(), secondGrade);
            }
        }

        System.out.println("Final Grades: ");
        originalGrades.forEach(
                (k,v)->System.out.println("Student: " + k + ", Grade: " + v));

    }
}
