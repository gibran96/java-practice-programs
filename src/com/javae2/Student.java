package com.javae2;

public abstract class Student {
    public abstract String result(String MarksOfStudent);

    public static void main(String[] args) {
        Aided a1 = new Aided();
        SelfFinance sf = new SelfFinance();
        System.out.println(a1.result("100 5,100 5,100 5|1,100,5|0,100,5"));
        System.out.println(sf.result("100 5,100 5,100 5,76 3|0,100,5"));
        System.out.println(sf.result("100 5,100 5,100 5,76 3|0,100,5").hashCode());
    }

    public static double calculateGradePoint(double marks) {
        double gradePoint = 0.0;
        if (marks < 40) {
            gradePoint = 0.0;
        } else if (marks >= 40 && marks < 50) {
            gradePoint = 6 + ((marks - 40) / 10);
        } else if (marks >= 50 && marks < 60) {
            gradePoint = 7 + ((marks - 50) / 10);
        } else if (marks >= 60 && marks < 75) {
            gradePoint = 8 + ((marks - 60) / 15);
        } else if (marks >= 75 && marks <= 100) {
            gradePoint = 9 + ((marks - 75) / 25);
        }
        return gradePoint;
    }
}

class Aided extends Student {

    @Override
    public String result(String allMarks) {
        String[] categories = allMarks.split("\\|");
        String totalSubjects = categories[0];
        double numSum = 0.0;
        double denSum = 0.0;

        String[] subjects = totalSubjects.split(",");
        for (String sub : subjects) {
            String[] details = sub.split(" ");
            double marks = Double.parseDouble(details[0]);
            double credit = Double.parseDouble(details[1]);
            double gradePoint = Student.calculateGradePoint(marks);
            numSum = numSum + (credit * gradePoint);
            denSum = denSum + 5;
        }

        for (int i = 1; i < categories.length; i++) {
            if (categories[i].charAt(0) == '1') {
                String[] details = categories[i].split(",");
                double marks = Double.parseDouble(details[1]);
                double credit = Double.parseDouble(details[2]);
                double gradePoint = Student.calculateGradePoint(marks);
                numSum = numSum + (credit * gradePoint);
                denSum = denSum + 5;
            }
        }

        return String.format("%.2f",(numSum / denSum)) + "";
    }


}

class SelfFinance extends Student {
    @Override
    public String result(String marksOfStudent) {
        String[] categories = marksOfStudent.split("\\|");
        String totalSubjects = categories[0];
        double numSum = 0.0;
        double denSum = 0.0;

        String[] subjects = totalSubjects.split(",");
        for (String sub : subjects) {
            String[] details = sub.split(" ");
            double marks = Double.parseDouble(details[0]);
            double credit = Double.parseDouble(details[1]);
            double gradePoint = Student.calculateGradePoint(marks);
            numSum = numSum + (credit * gradePoint);
            denSum = denSum + 5;
        }


        if (categories[1].charAt(0) == '1') {
            String[] details = categories[1].split(",");
            double marks = Double.parseDouble(details[1]);
            double credit = Double.parseDouble(details[2]);
            double gradePoint = Student.calculateGradePoint(marks);
            numSum = numSum + (credit * gradePoint);
            denSum = denSum + 5;
        }

        return String.format("%.2f",(numSum / denSum)) + "";
    }
}

