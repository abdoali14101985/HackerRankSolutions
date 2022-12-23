package com.abdoa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ClimbingLeaderBoard {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = climbingLeaderboard(ranked, player);

        /*bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );*/

        bufferedReader.close();
        //bufferedWriter.close();
    }

    private static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> rankings = new ArrayList<>();
        Set<Integer> rankedScore = new LinkedHashSet<>(ranked);
        ranked.clear();
        ranked.addAll(rankedScore);
        for(Integer score : player){
            while(ranked.size()> 0 && score >= ranked.get(ranked.size() -1)){
                ranked.remove(ranked.size()-1);
            }
            rankings.add(ranked.size()+1);

        }
        //System.out.println(rankings);
        return rankings;
    }
}
