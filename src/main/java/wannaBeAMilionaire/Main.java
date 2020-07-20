package wannaBeAMilionaire;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        QuestionEasy question1easy = new QuestionEasy("How many continents does exist?", "A) 5", "B) 6", "C) 7", "D) 8", "C", "A) 5", "C) 7");
        QuestionEasy question2easy = new QuestionEasy("How many countries does exist?", "A) 50", "B) 100", "C) 170", "D) 250", "C", "B) 100", "C) 170");
        QuestionEasy question3easy = new QuestionEasy("What is the heart?", "A) An organ", "B) A song", "C) A formation", "D) A country", "A", "A) An organ", "D) A Country");
        QuestionEasy question4easy = new QuestionEasy("Which of these is not an official department of the U.S. government?", "A) Justice", "B) Integrity", "C) Treasury", "D) Defense", "B", "B) Integrity", "C) Treasury");
        QuestionEasy question5easy = new QuestionEasy("Which of these is not a programming language?", "A) Swift", "B) Java", "C) HTML", "D) Python", "C", "A) Swift", "C) HTML");

        //in the purpose for the program not to broke, if you add questions
        //add the same number of questions to all 3 levels

        ArrayList<Question> easyQuestions = new ArrayList<Question>();
        easyQuestions.add(question1easy);
        easyQuestions.add(question2easy);
        easyQuestions.add(question3easy);
        easyQuestions.add(question4easy);
        easyQuestions.add(question5easy);





        QuestionMedium question1medium = new QuestionMedium("Which is the richest company?", "A) Apple", "B) Amazon", "D) Samsung", "D) DHL", "A", "A) Apple", "B) Amazon");
        QuestionMedium question2medium = new QuestionMedium("When ended the 100 years war if it started in 1337?", "A) 1430", "B) 1437", "C) 1443", "D) 1453", "D", "C) 1443", "D) 1453");
        QuestionMedium question3medium = new QuestionMedium("How many planets are in our Solar System?", "A) 6", "B) 7", "C) 8", "D) 9", "C", "C) 8", "D) 9");
        QuestionMedium question4medium = new QuestionMedium("Which is the largest continent?", "A) Africa", "B) Asia", "C) Australia", "D) Europe", "A", "A) Africa", "C) Australia");
        QuestionMedium question5medium = new QuestionMedium("What was the name of the first continent?", "A) Pangea", "B) Terra", "C) Africa", "D) Paleozoic", "A", "A) Pangea", "D) Paleozoic");

        //in the purpose for the program not to broke, if you add questions
        //add the same number of questions to all 3 levels

        ArrayList<Question> mediumQuestions = new ArrayList<Question>();
        mediumQuestions.add(question1medium);
        mediumQuestions.add(question2medium);
        mediumQuestions.add(question3medium);
        mediumQuestions.add(question4medium);
        mediumQuestions.add(question5medium);






        QuestionHard question1hard = new QuestionHard("What is bigger?", "A) 5 GB", "B) 50000 KB", "C) 500 MB", "D) 20.000.000 bytes", "A", "A) 5 GB", "D) 20.000.000 bytes");
        QuestionHard question2hard = new QuestionHard("What is the chemical formula of Sulfuric acid?", "A) HSO2", "B) H2SO4", "C) H1N1", "D) HSO4", "B", "B) H2SO4", "C) H1N1");
        QuestionHard question3hard = new QuestionHard("What was the lowest temperature ever recored?", "A) -42°C", "B) -77°C", "C) -89°C", "D) -125°C", "C", "B) -77°C", "C) -89°C");
        QuestionHard question4hard = new QuestionHard("What mammal is faster?", "A) A bat", "B) A Cheetah", "C) A lion", "D) A kangaroo", "A", "A) A bat", "B) A Cheetah");
        QuestionHard question5hard = new QuestionHard("What country is the smallest?", "A) Monaco", "B) Malta", "C) Maldives", "D) Vatican", "D", "B) Malta", "D) Vatican");

        //in the purpose for the program not to broke, if you add questions
        //add the same number of questions to all 3 levels

        ArrayList<Question> hardQuestions = new ArrayList<Question>();
        hardQuestions.add(question1hard);
        hardQuestions.add(question2hard);
        hardQuestions.add(question3hard);
        hardQuestions.add(question4hard);
        hardQuestions.add(question5hard);




        ArrayList<String> prise = new ArrayList<String>();
        prices(prise);



        Scanner sc = new Scanner(System.in);;
        boolean validQuestion = true;
        String userInput;


        //shuffle numbers from 1 to easyQuestions.size()
        //WARNING! This will for all 3 question difficulties only if they have the same number of questions
        Integer[] arr = new Integer[easyQuestions.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Collections.shuffle(Arrays.asList(arr));
        int index;



        ArrayList<String> letters = new ArrayList<String>();
        acceptedLetters(letters); //only the letters the user can input (a, b, c, d)


        int oneTime1 = 1; //used repeating an if (from easy)
        int oneTime2 = 1; //used repeating an if (from medium)
        int oneTime3 = 1; //used repeating an if (from hard)

        boolean playAgain = false;
        boolean wrongInput = false;

        int additionalHelp = 3;


        do {
            for (int i = 0; i < 15; i++) {
                if (i < 5 && oneTime1 == 1) {
                    //easy
                    oneTime1 = 0;
                    Collections.shuffle(Arrays.asList(arr));
                    for (int j = 0; j < 5; j++) {
                        index = arr[j];
                        System.out.println(easyQuestions.get(index).question);
                        System.out.println(easyQuestions.get(index).ansA);
                        System.out.println(easyQuestions.get(index).ansB);
                        System.out.println(easyQuestions.get(index).ansC);
                        System.out.println(easyQuestions.get(index).ansD);
                        System.out.println("");
                        System.out.print("Your answer: ");

                        userInput = sc.nextLine();
                        userInput = userInput.toLowerCase();
                        validQuestion = false;

                        do { //done only if the user enter a non-valid input
                            if (letters.contains(userInput)) {
                                validQuestion = true;
                            } else if (userInput.equalsIgnoreCase("50") && additionalHelp > 0) {
                                validQuestion = true;
                                if (additionalHelp > 1){
                                    additionalHelp--;
                                    System.out.println("You can use 50% 50% " + additionalHelp + " more times" );
                                }
                                else {
                                    additionalHelp--;
                                    System.out.println("You can use 50% 50% " + additionalHelp + " more time" );
                                }

                            } else if (userInput.equalsIgnoreCase("50") && additionalHelp <= 0){
                                System.out.print("You can't use 50% 50% anymore! Please type a letter: ");
                                userInput = sc.nextLine();
                            }
                            else {
                                System.out.print("Please enter a valid input: ");
                                userInput = sc.nextLine();
                            }
                        }
                        while (!validQuestion);

                        if (userInput.equalsIgnoreCase("50")) {
                            System.out.println("You have choosen 50% 50%");
                            System.out.println(easyQuestions.get(index).question);
                            System.out.println(easyQuestions.get(index).var1);
                            System.out.println(easyQuestions.get(index).var2);
                            validQuestion = false;

                            do {
                                userInput = sc.nextLine();
                                userInput = userInput.toLowerCase();
                                if (letters.contains(userInput)) {
                                    validQuestion = true;
                                } else {
                                    System.out.println("Invalid Input");
                                }
                            }
                            while (!validQuestion);

                            if (easyQuestions.get(index).ansId.equalsIgnoreCase(userInput)) {
                                System.out.println("Congrats! Correct answer! You've got " + prise.get(j));
                            } else {
                                System.out.println("Game over! You've lost " + prise.get(j - 1));
                                j = 5;
                                i = 16;
                            }
                        } else {
                            if (easyQuestions.get(index).ansId.equalsIgnoreCase(userInput)) {
                                System.out.println("Congrats! Correct answer! You've got " + prise.get(j));
                            } else {
                                System.out.println("Game over! You've lost " + prise.get(j - 1));
                                j = 5;
                                i = 16;
                            }
                        }

                    }
                } else if (i < 10 && oneTime2 == 1) {
                    //medium questions
                    oneTime2 = 0;
                    Collections.shuffle(Arrays.asList(arr));
                    for (int j = 5; j < 10; j++) {
                        j -= 5;
                        index = arr[j];
                        j += 5;
                        System.out.println(mediumQuestions.get(index).question);
                        System.out.println(mediumQuestions.get(index).ansA);
                        System.out.println(mediumQuestions.get(index).ansB);
                        System.out.println(mediumQuestions.get(index).ansC);
                        System.out.println(mediumQuestions.get(index).ansD);
                        System.out.println("");
                        System.out.print("Your answer: ");

                        userInput = sc.nextLine();
                        userInput = userInput.toLowerCase();
                        validQuestion = false;

                        do { //done only if the user enter a non-valid input
                            if (letters.contains(userInput)) {
                                validQuestion = true;
                            } else if (userInput.equalsIgnoreCase("50") && additionalHelp > 0) {
                                validQuestion = true;
                                if (additionalHelp > 1){
                                    additionalHelp--;
                                    System.out.println("You can use 50% 50% " + additionalHelp + " more times" );
                                }
                                else {
                                    additionalHelp--;
                                    System.out.println("You can use 50% 50% " + additionalHelp + " more time" );
                                }

                            } else if (userInput.equalsIgnoreCase("50") && additionalHelp <= 0){
                                System.out.print("You can't use 50% 50% anymore! Please type a letter: ");
                                userInput = sc.nextLine();
                            }
                            else {
                                System.out.print("Please enter a valid input: ");
                                userInput = sc.nextLine();
                            }
                        }
                        while (!validQuestion);

                        if (userInput.equalsIgnoreCase("50")) {
                            System.out.println("You have choosen 50% 50%");
                            System.out.println(mediumQuestions.get(index).question);
                            System.out.println(mediumQuestions.get(index).var1);
                            System.out.println(mediumQuestions.get(index).var2);
                            validQuestion = false;

                            do {
                                userInput = sc.nextLine();
                                userInput = userInput.toLowerCase();
                                if (letters.contains(userInput)) {
                                    validQuestion = true;
                                } else {
                                    System.out.println("Invalid Input");
                                }
                            }
                            while (!validQuestion);

                            if (mediumQuestions.get(index).ansId.equalsIgnoreCase(userInput)) {
                                System.out.println("Congrats! Correct answer! You've got " + prise.get(j));
                            } else {
                                System.out.println("Game over! You've lost " + prise.get(j));
                                j = 10;
                                i = 16;
                            }
                        } else {
                            if (mediumQuestions.get(index).ansId.equalsIgnoreCase(userInput)) {
                                System.out.println("Congrats! Correct answer! You've got " + prise.get(j));
                            } else {
                                System.out.println("Game over! You've lost " + prise.get(j));
                                j = 10;
                                i = 16;
                            }
                        }

                    }
                } else if (i >= 10 && oneTime3 == 1) {
                    //hard level
                    oneTime3 = 0;
                    Collections.shuffle(Arrays.asList(arr));
                    for (int j = 10; j < 15; j++) {
                        j -= 10;
                        index = arr[j];
                        j += 10;
                        System.out.println(hardQuestions.get(index).question);
                        System.out.println(hardQuestions.get(index).ansA);
                        System.out.println(hardQuestions.get(index).ansB);
                        System.out.println(hardQuestions.get(index).ansC);
                        System.out.println(hardQuestions.get(index).ansD);
                        System.out.println("");
                        System.out.print("Your answer: ");

                        userInput = sc.nextLine();
                        userInput = userInput.toLowerCase();
                        validQuestion = false;

                        do { //done only if the user enter a non-valid input
                            if (letters.contains(userInput)) {
                                validQuestion = true;
                            } else if (userInput.equalsIgnoreCase("50")) {
                                validQuestion = true;
                            } else {
                                System.out.print("Please enter a valid input: ");
                                userInput = sc.nextLine();
                            }
                        }
                        while (!validQuestion);

                        if (userInput.equalsIgnoreCase("50")) {
                            System.out.println("You have choosen 50% 50%");
                            System.out.println(hardQuestions.get(index).question);
                            System.out.println(hardQuestions.get(index).var1);
                            System.out.println(hardQuestions.get(index).var2);
                            validQuestion = false;

                            do { //done only if the user enter a non-valid input
                                if (letters.contains(userInput)) {
                                    validQuestion = true;
                                } else if (userInput.equalsIgnoreCase("50") && additionalHelp > 0) {
                                    validQuestion = true;
                                    if (additionalHelp > 1){
                                        additionalHelp--;
                                        System.out.println("You can use 50% 50% " + additionalHelp + " more times" );
                                    }
                                    else {
                                        additionalHelp--;
                                        System.out.println("You can use 50% 50% " + additionalHelp + " more time" );
                                    }

                                } else if (userInput.equalsIgnoreCase("50") && additionalHelp <= 0){
                                    System.out.print("You can't use 50% 50% anymore! Please type a letter: ");
                                    userInput = sc.nextLine();
                                }
                                else {
                                    System.out.print("Please enter a valid input: ");
                                    userInput = sc.nextLine();
                                }
                            }
                            while (!validQuestion);

                            if (hardQuestions.get(index).ansId.equalsIgnoreCase(userInput)) {
                                System.out.println("Congrats! Correct answer! You've got " + prise.get(j));
                            } else {
                                System.out.println("Game over! You've lost " + prise.get(j));
                                j = 5;
                                i = 16;
                            }
                        } else {
                            if (hardQuestions.get(index).ansId.equalsIgnoreCase(userInput)) {
                                System.out.println("Congrats! Correct answer! You've got " + prise.get(j));
                            } else {
                                System.out.println("Game over! You've lost " + prise.get(j));
                                j = 5;
                                i = 16;
                            }
                        }

                    }
                }
            }


            do {
                System.out.println("Play again? (yes / no)");
                userInput = sc.nextLine();
                if (userInput.equalsIgnoreCase("yes")){
                    wrongInput = true;
                }
                else if (userInput.equalsIgnoreCase("no")){
                    wrongInput = true;
                }
            }
            while (!wrongInput);

            if (userInput.equalsIgnoreCase("yes")){
                playAgain = true;
            }
            else {
                playAgain = false;
            }
        }
        while (playAgain);

    }


    public static void prices(ArrayList<String> prise){
        prise.add(0, "100$");
        prise.add(1, "200$");
        prise.add(2, "300$");
        prise.add(3, "500$");
        prise.add(4,"1,000$");
        prise.add(5, "2,000$");
        prise.add(6, "4,000$");
        prise.add(7, "8,000$");
        prise.add(8,"16,000$");
        prise.add(9,"32,000$");
        prise.add(10,"64,000$");
        prise.add(11,"125,000$");
        prise.add(12,"250,000$");
        prise.add(13,"500,000$");
        prise.add(14,"1,000,000$");
    }


    public static void acceptedLetters(ArrayList<String> letters){
        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("d");
    }



    //ummmmmmmmmmmmmmm?
    public static void printQuestions(ArrayList<QuestionEasy> easyQuestions, int index){
        System.out.println(easyQuestions.get(index).question);
        System.out.println(easyQuestions.get(index).ansA);
        System.out.println(easyQuestions.get(index).ansB);
        System.out.println(easyQuestions.get(index).ansC);
        System.out.println(easyQuestions.get(index).ansD);
    }

}



//do {
//            switch (questionId) {
//                case 1:
//                    System.out.println(question1.question);
//                    System.out.println(question1.ansA);
//                    System.out.println(question1.ansB);
//                    System.out.println(question1.ansC);
//                    System.out.println(question1.ansD);
//                    System.out.print("What's the answer: ");
//                    boolean isValid = true;
//                    do {
//                        userInput = sc.nextLine();
//                        if (userInput.equalsIgnoreCase("A") || userInput.equalsIgnoreCase("B")
//                        || userInput.equalsIgnoreCase("C") || userInput.equalsIgnoreCase("D")) {
//                            isValid = true;
//                        }
//                        else {
//                            System.out.println("Type a valid letter!");
//                        }
//                    }
//                    while (!isValid);
//                    if (userInput.equalsIgnoreCase(question1.ansId)){
//                        System.out.println("Raspuns corect!");
//                    }
//            }
//        }
//        while (areAnsTrue);