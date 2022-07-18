package com.company;

public class Main {

    public static void main(String[] args) {
        int studentsGrade = 3;
        switch (studentsGrade) {
            case 1:
                System.out.println("Неудачник");
                break;
            case 2:
                System.out.println("Все равно неудачник");
                break;
            case 3:
                System.out.println("Нефартануло");
                break;
            case 4:
                System.out.println("Хорощо посторайся еше лудше");
                break;
            case 5:
                System.out.println("Повезло повезло!!");
                break;
        }
        String name = "daniyar";
        switch (name) {
            case "daniyar":
                System.out.println("Hello Dan");
                break;
            case "Batir":
                System.out.println("Hi Turusbek");
                break;
            case "Sapar":
                System.out.println("HEllo, hi Sapar");
                break;
        }
        int temperatura = 20;
        int nambrOfStudent = 10;
        boolean isRaniy = false;
        // && оператор  и (and) - знак аперсанта
        if (temperatura > 10 && nambrOfStudent == 10) {
            // true * true = 1*1=1
            System.out.println("Let's go outside for a walk");
        }
        // || оператор или -or
        if (temperatura < 30 || nambrOfStudent > 20) {
            //true + true = 1+1=1
            System.out.println("У погоды нормальная теипература");
        }
        if (isRaniy || nambrOfStudent < 20 && temperatura > 0) {
            System.out.println("остовайтесь дома пожалуста");
        }
        // ! - not (не) - оператор отрицания
        if (!isRaniy) {
            System.out.println("It's raining");
        }
        if (!(nambrOfStudent > 5)) {
            System.out.println("что нибудь");
        }
        System.out.println(isRaniy);
        //завтрак
        cofe();
          addition(5,4);
        System.out.println(multiplay());
        System.out.println(multiplay1(5,4));
        System.out.println(cocat(6.3, "GEEKtECH", '5'));
    }

    public static  void  cofe(){
        System.out.println("Берем кружку");
        System.out.println("Насыпаем кофе");
        System.out.println("Кипетим воду");
        System.out.println("Заливаем в кружку");
        System.out.println("Добовляем молоко");
        System.out.println("Перемешиваем");
        System.out.println("Выпиваем и наслаждаемся");


    }
    public static  int multiplay(){   // метод с параметрами невозврашаюшихся

        return 5*5;
    }
    public static void  addition(int num1, int num2){ // метод с параметрами возврашяюшихся

        System.out.println(num1+num2);
    }
    public static  int multiplay1(int num1, int num2) {

        return num1*num2;
    }
    public  static  String cocat (double digit ,String phrase, char syambol){
        return digit + " " + phrase +" "+ syambol;
    }
}