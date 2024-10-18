package com.example.leetcode.reversePrefixOfWord

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class ReversePrefixOfWordSolutionTest extends Specification {

    @Autowired
    ReversePrefixOfWordSolution reversePrefixOfWord

    @Test
    void testeReversePrefix() {

        List<Map<String, Object>> testCases = [
                [word: "abcdefd", ch: 'd'],
                [word: "xyxzxe", ch: 'z'],
                [word: "abcd", ch: 'z']
        ]

        testCases.each { testCase ->
            String word = testCase.word
            char ch = testCase.ch

            String resultado = reversePrefixOfWord.reversePrefix(word, ch)

            println("Input: word = ${word}, ch = ${ch} -> Output: ${resultado}")
        }
    }
}