package com.leetcode.medium.string;

class TrieNode {
    public char val;
    public boolean isWord;
    public TrieNode[] children = new TrieNode[26];

    public TrieNode() {
    }

    TrieNode(char c) {
        TrieNode node = new TrieNode();
        node.val = c;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
        root.val = ' ';
    }

    public void insert(String word) {
        TrieNode trieNode = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (trieNode.children[c - 'a'] == null) {
                trieNode.children[c - 'a'] = new TrieNode(c);
            }
            trieNode = trieNode.children[c - 'a'];
        }
        trieNode.isWord = true;
    }

    public boolean search(String word) {
        TrieNode ws = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (ws.children[c - 'a'] == null) return false;
            ws = ws.children[c - 'a'];
        }
        return ws.isWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode ws = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (ws.children[c - 'a'] == null) return false;
            ws = ws.children[c - 'a'];
        }
        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        boolean searchResult = trie.search("apple");   // return True
        if (searchResult) {
            System.out.println("Apple is found in this trie");
        }

//        String word2 = "app";
//        boolean searchResult2 = trie.search(word2);     // return False
//        if (searchResult2) {
//            System.out.println(word2 + " word is found in this trie");
//        } else {
//            System.out.println(word2 + "word is not found in this trie");
//        }
//
//        String word3 = "app";
//        boolean searchResult3 = trie.startsWith(word3); // return True
//        if (searchResult3) {
//            System.out.println("Previously inserted string word: -apple that has the prefix :- " + word3);
//        } else {
//            System.out.println("No word found with prefix:- " + word3);
//        }
//        trie.insert("app");
//        trie.search("app");
    }
}
