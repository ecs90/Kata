package org.ecs90;

import java.util.Arrays;
import java.util.Iterator;

public class Analizador {
    public static void unicoBucle(String data){
        String[] words = data.split(" ");
        int word = words.length;
        System.out.println("Total de palabras: " + word);

        double media = 0;
        for (int i = 0; i < word; i++){
            media += words[i].length();
            if (words[i].contains(",") || words[i].contains(".")){
                media--;
            }
        }
        System.out.println("Longitud media: " + media/word);

        String[] sentence = data.split("\\.");
        int sentences = sentence.length;
        System.out.println("Total de oraciones: " + sentences);

    }
    public static void unicoBucleLambda(String data){
        String[] words = data.split(" ");
        int word = words.length;
        System.out.println("Total de palabras: " + word);

        Arrays.asList(words).forEach(wordes -> {
            double media = media + wordes.length();
            if (wordes.contains(",") || wordes.contains(".")) {
                media--;
            }
        });
        System.out.println("Longitud media: " + media/word);

        String[] sentence = data.split("\\.");
        int sentences = sentence.length;
        System.out.println("Total de oraciones: " + sentences);
    }
}
