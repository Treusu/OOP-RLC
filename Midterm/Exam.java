/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Midterm;

/**
 * Cubia, Richard L.
 */
public class Exam {
    private String message;
    private double price;
    private boolean isFinished;

    public Exam() {
        message = "Good luck";
    }

    public Exam(String period, String level) {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }
    
    public static class Midterm extends Exam {
        public Midterm() {
            super();
            System.out.println("Midterm exam has started.");
        }
    }
    
    public static class Essay extends Midterm {
        private int wordCount;
        private String topic;

        public Essay(int wordCount, String topic) {
            super();
            this.wordCount = wordCount;
            this.topic = topic;
        }

        public int getWordCount() {
            return wordCount;
        }

        public String getTopic() {
            return topic;
        }

        public void gradeEssay() {
            System.out.println("Essay graded.");
        }
    }   
    
    public static class Quiz extends Exam {
        private int numQuestions;
        private int correctAnswers;

        public Quiz(int numQuestions) {
            super();
            this.numQuestions = numQuestions;
        }

        public int getNumQuestions() {
            return numQuestions;
        }

        public void gradeQuiz() {
            System.out.println("Quiz graded.");
        }
    }
    
    public static void main(String[] args) {
        Exam exam = new Exam();

        exam.setPrice(100.0);
        exam.setFinished(false);

        System.out.println("Exam price: " + exam.getPrice());
        System.out.println("Exam is finished: " + exam.isFinished());

        Essay essay = new Essay(500, "The Importance of Education");

        essay.gradeEssay();

        Quiz quiz = new Quiz(10);

        quiz.gradeQuiz();
    }
}