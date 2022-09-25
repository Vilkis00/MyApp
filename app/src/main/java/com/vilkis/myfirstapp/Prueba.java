package com.vilkis.myfirstapp;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Prueba {
    public static void staircase(int n) {
        for(int i = 1; i <= n; i++) {
            String spaces = "", hashtag = "#";

            hashtag = String.join("", Collections.nCopies(i, "#"));
            spaces = String.join("", Collections.nCopies(n - hashtag.length(), " "));

            System.out.println(spaces + hashtag);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void miniMaxSum(List<Integer> arr) {
        long min = 0, max = 0;

        Collections.sort(arr);
        for (int i = 0; i < 4; i++) {
            min+= arr.get(i);
        }

        Collections.reverse(arr);
        for (int i = 0; i < 4; i++) {
            max+= arr.get(i);
        }

        System.out.println(min + " " + max);
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int maxValue = Collections.max(candles);

        int counter = 0;
        for (int candle: candles) {
            if (candle == maxValue) {
                counter++;
            }
        }

        return counter;
    }

    public static String timeConversion(String s) {
        try {
            Date date = new SimpleDateFormat("hh:mm:ssa").parse(s);
            return new SimpleDateFormat("HH:mm:ss").format(date);
        } catch (Exception e) {
            return "";
        }
    }

    public static void cats() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String[] parts = text.split(" ");
        int intersections = Integer.parseInt(parts[0]);

        int factorial = 1;
        for (int i = 1; i < intersections; i++) {
            factorial *= i;
        }

        System.out.println(factorial/2);
    }

    public static void diagonalDifference() {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1, 2, 3));
        arr.add(Arrays.asList(4, 5, 6));
        arr.add(Arrays.asList(7, 8, 9));

        int diagonalOne = 0, diagonalTwo = 0, difference = 0;

        for (int i = arr.size() - 1; i >= 0; i--) {
            for (int e = arr.get(i).size() - 1; e >= 0; e--) {
                diagonalOne += arr.get(i).get(e);
                i--;
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            for (int e = arr.get(i).size() - 1; e >= 0; e--) {
                diagonalTwo += arr.get(i).get(e);
                i++;
            }
        }

        difference = diagonalOne > diagonalTwo ? diagonalOne - diagonalTwo
                : diagonalTwo - diagonalOne;
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> newGrades = new ArrayList<>();

        for(int grade : grades) {
            int multiple = 5, multiplier = 1;
            while (multiple < grade) {
                multiplier++;
                multiple = 5 * multiplier;
            }

            if (multiple >= 40) {
                if (multiple - grade < 3) {
                    newGrades.add(multiple);
                } else {
                    newGrades.add(grade);
                }
            } else {
                newGrades.add(grade);
            }
        }

        return newGrades;
    }

    public void test() {
        String var = "hola mundo";
        var = var.replaceAll(" ", "");
        var = var.replaceAll("-", "");
        var = var.replaceAll("\\.", "");

        String cadenaNormalize = Normalizer.normalize(var, Normalizer.Form.NFD);
    }

    public static int maximaDiferencia(List<Integer> a) {
        int max = -1;

        for(int x = 0; x < a.size(); x++) {
            for(int y = 0; y < a.size(); y++) {
                if(x == y) {
                    continue;
                }

                if(a.get(x) > a.get(y)) {
                    continue;
                }

                int resta = a.get(x) - a.get(y);
                if(resta > max)
                    max = resta;
            }
        }

        return max;
    }
}
