package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Написать игру в угадай слово:
//        Создать массив из слов (из этих или других)
//        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//        сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь.
//        Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
//        apple – загаданное
//        apricot - ответ игрока
//        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//        Для сравнения двух слов посимвольно можно пользоваться:
//        String str = "apple";
//        char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//        Играем до тех пор, пока игрок не отгадает слово.
//        Используем только маленькие буквы.

public class HomeWork3 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        char[] word = new char[15];
        Arrays.fill(word, '#');
        int numberAI = random.nextInt(words.length);
        String wordAI = words[numberAI];

        System.out.println("DEBUG: " + wordAI);
        System.out.print("Try to guess a word from these: ");
        System.out.println(Arrays.toString(words));

        while (true) {
            System.out.print("Guess the word >>> ");
            String answer = scanner.next();
            if (answer.toLowerCase().equals(wordAI)) {
                System.out.println("You won!");
                break;
            }
            for (int i = 0; i < answer.length() && i < wordAI.length(); i++) {
                if (answer.charAt(i) == wordAI.charAt(i)) word[i] = wordAI.charAt(i);
            }
            System.out.println("You guessed these letters: ");
            System.out.println(new String(word));
        }
    }
}