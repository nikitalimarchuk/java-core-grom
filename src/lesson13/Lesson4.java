package lesson13;

import junit.framework.TestCase;
import lesson4.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by susanoo on 25.07.17.
 */
public class Lesson4 {

    @Test
    public void Lesson4_Comparing_VerifySumOfElementsFromPositiveToPositiveValues(){
        int a = 2;
        int b = 4;
        int expectedResult = 9;

        Assert.assertEquals(expectedResult, Comparing.sum(a, b));
    }

    @Test
    public void Lesson4_Comparing_VerifySumFromZeroToZeroValues(){
        int a = 0;
        int b = 0;
        int expectedResult = 0;

        Assert.assertEquals(expectedResult, Comparing.sum(a, b));
    }

    @Test
    public void Lesson4_Comparing_VerifySumFromNegativeToNegativeValues(){
        int a = -5;
        int b = -2;
        int expectedResult = -14;

        Assert.assertEquals(expectedResult, Comparing.sum(a, b));
    }

    @Test
    public void Lesson4_Comparing_VerifySumFromBiggerToSmallerValues(){
        int a = 6;
        int b = 2;
        int expectedResult = 0;

        Assert.assertEquals(expectedResult, Comparing.sum(a, b));
    }

    @Test
    public void Lesson4_Comparing_VerifyCompareSumForZeroValues() {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        boolean exepectedResult = false;

        Assert.assertEquals(exepectedResult, Comparing.compareSums(a, b, c, d));
    }

    @Test
    public void Lesson4_Comparing_VerifyCompareSumForTwoPairsOfValues() {
        int a = 2;
        int b = 4;
        int c = 1;
        int d = 2;
        boolean exepectedResult = true;

        Assert.assertEquals(exepectedResult, Comparing.compareSums(a, b, c, d));
    }

    @Test
    public void Lesson4_Comparing_VerifyCompareSumForZeroAndPositiveValues() {
        int a = 0;
        int b = 0;
        int c = 1;
        int d = 2;
        boolean exepectedResult = false;

        Assert.assertEquals(exepectedResult, Comparing.compareSums(a, b, c, d));
    }

    @Test
    public void Lesson4_ConcatString_VerifyConcatinationWithSomeStrings(){
        String a = "a string + ";
        String b = "b string + ";
        String c = "c string";
        String expectedResult = "a string + b string + c string";

        Assert.assertEquals(expectedResult, ConcatString.concat(a, b, c));
    }

    @Test
    public void Lesson4_ConcatString_VerifyConcatinationWithEmptyStrings(){
        String a = "";
        String b = "b string + ";
        String c = "";
        String expectedResult = "b string + ";

        Assert.assertEquals(expectedResult, ConcatString.concat(a, b, c));
    }

    @Test
    public void Lesson4_ConcatString_VerifyConcatinationWithNullStrings(){
        String a = null;
        String b = "b string + ";
        String c = "";
        String expectedResult = "";

        Assert.assertEquals(expectedResult, ConcatString.concat(a, b, c));
    }

    @Test
    public void Lesson4_ConcatString_VerifyConcatinationWithSpecialCharacters(){
        String a = "\"";
        String b = "b \"string + '";
        String c = "'";
        String expectedResult = "\"b \"string + ''";

        Assert.assertEquals(expectedResult, ConcatString.concat(a, b, c));
    }

    @Test
    public void Lesson4_MethodExamples_VerifyIncreasingResultsForTwoPositiveValues(){
        int a = 3;
        int b = 5;
        int expectedResult = 8;

        Assert.assertEquals(expectedResult, MethodExamples.increaser(a, b));
    }

    @Test
    public void Lesson4_MethodExamples_VerifyIncreasingResultsForPositiveAndNegativeValues(){
        int a = 3;
        int b = -5;
        int expectedResult = -2;

        Assert.assertEquals(expectedResult, MethodExamples.increaser(a, b));
    }

    @Test
    public void Lesson4_MethodExamples_VerifyIncreasingResultsForZerosValues(){
        int a = 0;
        int b = 0;
        int expectedResult = 0;

        Assert.assertEquals(expectedResult, MethodExamples.increaser(a, b));
    }

    @Test
    public void Lesson4_MethodExemples_VerifyMinimumValueFromPairOfPositiveValues(){
        int a = 1;
        int b = 2;
        int expectedResult = 1;

        Assert.assertEquals(expectedResult, MethodExamples.min(a, b));
    }

    @Test
    public void Lesson4_MethodExemples_VerifyMinimumValueFromPairOfNegativeValues(){
        int a = -1;
        int b = -2;
        int expectedResult = -2;

        Assert.assertEquals(expectedResult, MethodExamples.min(a, b));
    }

    @Test
    public void Lesson4_MethodExemples_VerifyMinimumValueFromPairOfZerosValues(){
        int a = 0;
        int b = 0;
        int expectedResult = 0;

        Assert.assertEquals(expectedResult, MethodExamples.min(a, b));
    }

    @Test
    public void Lesson4_MethodExemples_VerifyMinimumValueFromPairOfNegativeAndPositiveValues(){
        int a = -5;
        int b = 5;
        int expectedResult = -5;

        Assert.assertEquals(expectedResult, MethodExamples.min(a, b));
    }

    @Test
    public void Lesson4_NumCounter_VerifyDivCounterWithValidPositiveRangeAndModule(){
        short a = 2;
        short b = 10;
        int n = 2;
        int expectedResult = 5;

        Assert.assertEquals(expectedResult, NumCounter.findDivCount(a, b, n));
    }

    @Test
    public void Lesson4_NumCounter_VerifyDivCounterWithValidPositiveRangeAndBiggerModule(){
        short a = 2;
        short b = 10;
        int n = 4;
        int expectedResult = 2;

        Assert.assertEquals(expectedResult, NumCounter.findDivCount(a, b, n));
    }

    @Test
    public void Lesson4_NumCounter_VerifyDivCounterWithValidPositiveRangeAndModuleEqualToFirst(){
        short a = 2;
        short b = 10;
        int n = 1;
        int expectedResult = 9;

        Assert.assertEquals(expectedResult, NumCounter.findDivCount(a, b, n));
    }

    @Test
    public void Lesson4_NumCounter_VerifyDivCounterWithValidPositiveRangeAndModuleEqualToZero(){
        short a = 2;
        short b = 10;
        int n = 0;
        int expectedResult = 0;

        Assert.assertEquals(expectedResult, NumCounter.findDivCount(a, b, n));
    }

    @Test
    public void Lesson4_PracticeExample_VerifyMinValueFromThreePositiveValues(){
        int a = 2;
        int b = 3;
        int c = 4;
        int expectedResult = 2;

        Assert.assertEquals(expectedResult, PracticeExample.min(a, b, c));
    }

    @Test
    public void Lesson4_PracticeExample_VerifyMinValueFromThreeZeroValues(){
        int a = 0;
        int b = 0;
        int c = 0;
        int expectedResult = 0;

        Assert.assertEquals(expectedResult, PracticeExample.min(a, b, c));
    }

    @Test
    public void Lesson4_PracticeExample_VerifyMinValueFromThreePositiveAndNefativeValues(){
        int a = 5;
        int b = 0;
        int c = -2;
        int expectedResult = -2;

        Assert.assertEquals(expectedResult, PracticeExample.min(a, b, c));
    }

    @Test
    public void Lesson4_PracticeExample_VerifyAverageForPositiveValue(){
        int n = 5;
        double expectedResult = 3;

        if(expectedResult == PracticeExample.average(n))
            return;
        else
            Assert.fail("\nExpected: " + expectedResult + "\nActual: " + PracticeExample.average(n));
    }

    @Test
    public void Lesson4_PracticeExample_VerifyAverageForNegativeValue(){
        int n = -5;
        double expectedResult = 0;

        if(expectedResult == PracticeExample.average(n))
            return;
        else
            Assert.fail("\nExpected: " + expectedResult + "\nActual: " + PracticeExample.average(n));
    }

    @Test
    public void Lesson4_PracticeExample_VerifyAverageForZeroValue(){
        int n = 0;
        double expectedResult = 0;

        if(expectedResult == PracticeExample.average(n))
            return;
        else
            Assert.fail("\nExpected: " + expectedResult + "\nActual: " + PracticeExample.average(n));
    }
}
