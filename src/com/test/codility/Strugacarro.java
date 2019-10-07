package com.test.codility;

import java.util.*;
import java.util.stream.Collectors;

public class Strugacarro {

    public static void main(String[] args) {
        int[] inp = {-3, -14, -5, 7, 8, 42, 8, 3};
        int n = inp.length;

        System.out.println(solution(inp));

        int[] a = Arrays.copyOfRange(inp, 0, (n + 1) / 2);
        int[] b = Arrays.copyOfRange(inp, (n + 1) / 2, n);

    }

        public static String solution(int[] T) {
            // write your code in Java SE 8
            int n = T.length;

            int[] arr1 = Arrays.copyOfRange(T, 0, (n + 1) / 2);
            int[] arr2 = Arrays.copyOfRange(T, (n + 1) / 2, n);

            List<Season> seasons = new ArrayList<>();

            // WINTER
            int[] winter = Arrays.copyOfRange(arr1, 0, arr1.length / 2);
            Season winterSeason = new Season();
            winterSeason.name = "WINTER";
            winterSeason.temperature = winter;
            seasons.add(winterSeason);

            // SPRING
            int[] spring = Arrays.copyOfRange(arr1, arr1.length / 2, arr1.length);
            Season springSeason = new Season();
            springSeason.name = "SPRING";
            springSeason.temperature = spring;
            seasons.add(springSeason);

            // SUMMER
            int[] summer = Arrays.copyOfRange(arr2, 0, arr2.length / 2);
            Season summerSeason = new Season();
            summerSeason.name = "SUMMER";
            summerSeason.temperature = summer;
            seasons.add(summerSeason);


            // AUTUMN
            int[] autumn = Arrays.copyOfRange(arr2, arr2.length / 2, arr2.length);
            Season autumnSeason = new Season();
            autumnSeason.name = "AUTUMN";
            autumnSeason.temperature = autumn;
            seasons.add(autumnSeason);

            Optional<Season> s = seasons.stream()
                    .map(season -> season.getHighestAmplitudeDiff(season))
                    .collect(Collectors.maxBy(Comparator.comparing(season -> season.amplitude)));

            return s.get().name;
        }

        static class Season {
            String name;
            int[] temperature;
            int amplitude;

            Season getHighestAmplitudeDiff(Season season) {
                int[] temps = season.temperature;
                Arrays.sort(temps);
                int diff = temps[temps.length - 1] - temps[0];
                season.amplitude = diff;
                return season;
            }
        }
}

