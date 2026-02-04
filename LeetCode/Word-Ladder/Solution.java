1class Solution {
2    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
3        Set<String> set = new HashSet<>(wordList);
4        if (!set.contains(endWord)) return 0;
5        Queue<String> q = new LinkedList<>();
6        q.offer(beginWord);
7        int level = 1;
8        while (!q.isEmpty()) {
9           int size = q.size();
10           for (int i = 0; i < size; i++) {   
11             String word = q.poll();
12             char[] arr = word.toCharArray();
13             for (int j = 0; j < arr.length; j++) {
14                char original = arr[j];
15                for (char ch = 'a'; ch <= 'z'; ch++) { 
16                    arr[j] = ch;
17                    String newWord = new String(arr);
18                    if (newWord.equals(endWord))
19                        return level + 1;
20                        if (set.contains(newWord)) {
21                        q.offer(newWord);
22                        set.remove(newWord); 
23                        }
24                    }
25                    arr[j] = original; 
26                }
27            }
28            level++;
29        }
30        return 0;
31    }
32}
33