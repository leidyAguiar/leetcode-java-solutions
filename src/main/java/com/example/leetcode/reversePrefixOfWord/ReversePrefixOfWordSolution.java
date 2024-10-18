package com.example.leetcode.reversePrefixOfWord;

import org.springframework.stereotype.Component;

import java.util.Stack;

@Component
class ReversePrefixOfWordSolution {
    public String reversePrefix(String word, char ch) {

        Stack<String> pilha = new Stack<>();

        StringBuilder resto = new StringBuilder();

        if (word.indexOf(ch) != -1) {
            for (int i=0; i<word.length(); i++) {
                char letra = word.charAt(i);
                pilha.push(Character.toString(letra));

                if(letra == ch) {
                    resto.append(word.substring(i+1));
                    break;
                }
            }
            StringBuilder desempilha = new StringBuilder();
            while(!pilha.isEmpty()) {
                desempilha.append(pilha.pop());
            }
            return desempilha.append(resto).toString();
        } else
            return word;
    }
}