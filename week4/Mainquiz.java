package week4;

import java.util.Scanner;

public class Mainquiz{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quiz quiz = new Quiz();

        System.out.println("Selamat datang di kuis pengetahuan umum!");
        System.out.println("Jawab semua pertanyaan dengan memilih nomor opsi!");

        // Looping untuk setiap pertanyaan
        for (int i = 0; i < quiz.getQuestionCount(); i++) {
            quiz.displayQuestion(i);
            System.out.print("Masukkan pilihan Anda (1-4): ");
            int userAnswer = scanner.nextInt();
            quiz.checkAnswer(i, userAnswer);
        }
        
        // Tampilkan skor akhir
        int finalScore = quiz.getScore();
        System.out.println("\nKuis selesai! Skor akhir Anda: " + finalScore);
        
        // Kondisional untuk pesan berdasarkan skor
        if (finalScore == 30) {
            System.out.println("Luar biasa! Anda menjawab semua pertanyaan dengan benar!");
        } else if (finalScore >= 20) {
            System.out.println("Bagus! Anda memiliki pemahaman yang baik.");
        } else if (finalScore >= 10) {
            System.out.println("Cukup baik, tetapi masih bisa ditingkatkan.");
        } else {
            System.out.println("Terus belajar! Jangan menyerah untuk meningkatkan pengetahuan Anda.");
        }
        
        scanner.close();
    }
}
