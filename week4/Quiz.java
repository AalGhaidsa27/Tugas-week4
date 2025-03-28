package week4;

import java.util.Scanner;

public class Quiz {
    private String[] questions = {
        "Ibu kota Indonesia adalah?",
        "Hewan apa yang paling cepat?",
        "Planet terbesar di tata surya?",
        "Siapa penemu bola lampu?",
        "Gunung tertinggi di dunia adalah?",
        "Siapa presiden pertama Indonesia?",
        "Lambang kimia dari air adalah?",
        "Siapa yang menulis novel 'Laskar Pelangi'?",
        "Berapa jumlah provinsi di Indonesia pada tahun 2024?",
        "Negara dengan populasi terbesar di dunia?"
    };
    
    private String[][] options = {
        {"1. Jakarta", "2. Bandung", "3. Surabaya", "4. Bali"},
        {"1. Kelinci", "2. Harimau", "3. Cheetah", "4. Gajah"},
        {"1. Mars", "2. Bumi", "3. Jupiter", "4. Saturnus"},
        {"1. Nikola Tesla", "2. Albert Einstein", "3. Thomas Edison", "4. Isaac Newton"},
        {"1. Kilimanjaro", "2. Elbrus", "3. Everest", "4. Denali"},
        {"1. Soekarno", "2. Soeharto", "3. Habibie", "4. Gus Dur"},
        {"1. O2", "2. CO2", "3. H2O", "4. NaCl"},
        {"1. Tere Liye", "2. Andrea Hirata", "3. Pramoedya Ananta Toer", "4. Dewi Lestari"},
        {"1. 32", "2. 34", "3. 36", "4. 38"},
        {"1. Amerika Serikat", "2. India", "3. Tiongkok", "4. Rusia"}
    };
    
    private int[] correctAnswers = {1, 3, 3, 3, 3, 1, 3, 2, 4, 3}; 
    private int score = 0;
    
    public int getQuestionCount() {
        return questions.length;
    }
    
    public void displayQuestion(int index) {
        System.out.println("\nPertanyaan " + (index + 1) + ": " + questions[index]);
        for (int j = 0; j < options[index].length; j++) {
            System.out.println(options[index][j]);
        }
    }
    
    public void checkAnswer(int index, int userAnswer) {
        if (userAnswer == correctAnswers[index]) {
            System.out.println("Benar!");
            score += 10;
        } else {
            System.out.println("Salah! Jawaban yang benar adalah: " + options[index][correctAnswers[index] - 1]);
        }
    }
    
    public int getScore() {
        return score;
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di kuis!\n");

        for (int i = 0; i < quiz.getQuestionCount(); i++) {
            quiz.displayQuestion(i);
            System.out.print("Masukkan jawaban (1-4): ");
            int userAnswer = scanner.nextInt();
            quiz.checkAnswer(i, userAnswer);
        }

        System.out.println("\nKuis selesai! Skor akhir Anda: " + quiz.getScore());
        scanner.close();
    }
}
