package com.example.leetcode.twoSum

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

import java.nio.file.Files
import java.nio.file.Paths

@SpringBootTest
class TwoSumSolutionTest extends Specification {

    @Autowired
    TwoSumSolution twoSumSolution

    @Test
    void testeTwoSum() {

        List<Map<String, Object>> testCases = [
                [nums: [2,7,11,15], target: 9],
                [nums: [3,2,4], target: 6],
                [nums: [3,3], target: 6]
        ]

        testCases.each { testCase ->
            int[] nums = testCase.nums as int[]
            int target = testCase.target

            int[] resultado = twoSumSolution.twoSum(nums, target)

            println("Input: word = ${nums}, ch = ${target} -> Output: ${resultado}")
        }
    }
}
