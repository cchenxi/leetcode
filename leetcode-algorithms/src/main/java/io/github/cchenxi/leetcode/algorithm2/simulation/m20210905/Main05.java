package io.github.cchenxi.leetcode.algorithm2.simulation.m20210905;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * TODO: description
 * Date: 2021-09-05
 *
 * @author chenxi
 */
public class Main05 {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.merge(word, 1, Integer::sum);
        }

        PriorityQueue<Tuple> queue = new PriorityQueue<>(new Comparator<Tuple>() {
            @Override
            public int compare(Tuple o1, Tuple o2) {
                if (o2.count - o1.count == 0) {
                    return o1.word.compareTo(o2.word);
                }
                return o2.count - o1.count;
            }
        });
        map.forEach((word, count) -> {
            queue.offer(new Tuple(word, count));
        });

        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(queue.poll().word);
        }

        return result;
    }

    static class Tuple {
        String word;
        Integer count;

        public Tuple(String word, Integer count) {
            this.word = word;
            this.count = count;
        }
    }


    public static void main(String[] args) {
        Main05 main05 = new Main05();
        System.out.println(
                main05.topKFrequent(new String[]{"i", "love", "io/github/cchenxi/leetcode", "i", "love", "coding"}, 2)
        );
    }
}
