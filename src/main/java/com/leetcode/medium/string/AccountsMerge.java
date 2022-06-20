package com.leetcode.medium.string;

import java.util.*;

public class AccountsMerge {
    public static List<List<String>> accountsMerge(List<List<String>> acts) {
        Map<String, String> owner = new HashMap<>();
        Map<String, String> parents = new HashMap<>();
        Map<String, TreeSet<String>> unions = new HashMap<>();
        for (List<String> a : acts) {for (int i = 1; i < a.size(); i++) {
                parents.put(a.get(i), a.get(i));
                owner.put(a.get(i), a.get(0));
            }
        }
        for (List<String> a : acts) {
            String p = find(a.get(1), parents);
            for (int i = 2; i < a.size(); i++)
                parents.put(find(a.get(i), parents), p);
        }
        for (List<String> a : acts) {
            String p = find(a.get(1), parents);
            if (!unions.containsKey(p)) unions.put(p, new TreeSet<>());
            for (int i = 1; i < a.size(); i++)
                unions.get(p).add(a.get(i));
        }
        List<List<String>> res = new ArrayList<>();
        for (String p : unions.keySet()) {
            List<String> emails = new ArrayList(unions.get(p));
            emails.add(0, owner.get(p));
            res.add(emails);
        }
        return res;
    }

    private static String find(String s, Map<String, String> p) {
        return p.get(s) == s ? s : find(p.get(s), p);
    }

    public static void main(String args[]) {
        List<List<String>> acts = new ArrayList<>();
        acts.add(Arrays.asList("Gabe", "Gabe0@m.co", "Gabe3@m.co", "Gabe1@m.co"));
        acts.add(Arrays.asList("Kevin","Kevin3@m.co","Kevin5@m.co","Kevin0@m.co"));
        acts.add(Arrays.asList("Ethan","Ethan5@m.co","Ethan4@m.co","Ethan0@m.co"));
        acts.add(Arrays.asList("Hanzo","Hanzo3@m.co","Hanzo1@m.co","Hanzo0@m.co"));
        acts.add(Arrays.asList("Fern","Fern5@m.co","Fern1@m.co","Fern0@m.co"));
        List<List<String>> accountsMergeResult = accountsMerge(acts);
        for (List<String> accountList:   accountsMergeResult) {
            System.out.println(Arrays.toString(accountList.toArray()));
        }

    }

}
