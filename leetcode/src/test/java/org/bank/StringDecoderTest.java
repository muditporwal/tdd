package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.bank.StringDecoder.Expression;
import org.junit.jupiter.api.Test;

class StringDecoderTest {

    @Test
    void testSingleCharacterDecode_ShouldEvaluateToTheSameCharacter() {
        String decoded = StringDecoder.decodeString("c");
        assertEquals("c",decoded);
        decoded = StringDecoder.decodeString("abc");
        assertEquals("abc",decoded);
    }

    @Test
    void testSingleCharacterWithRecurrence_shouldEvaluateToRecurringCharacter(){
        String decoded = StringDecoder.decodeString("3[c]");
        assertEquals("ccc",decoded);
    }

    @Test
    void testComplexTestScenario_shouldEvaluateToRecurringCharacter(){
        String decoded = StringDecoder.decodeString("3[a2[c]]");
        assertEquals("accaccacc",decoded);
    }


    @Test
    void testEvaluationOfStringExpression(){
        Expression exp = new StringDecoder.StringExpression("C");
        assertEquals("C",exp.evaluate());
    }

    @Test
    void testEvaluationOfRepExpression(){
        Expression exp = new StringDecoder.StringExpression("C");
        Expression repExp = new StringDecoder.ComplexExpression(3,exp );
        assertEquals("CCC",repExp.evaluate());
    }

    @Test
    void testEvaluationOfRepExpressionWithPreAndPostString(){
        Expression exp = new StringDecoder.StringExpression("C");
        Expression repExp = new StringDecoder.ComplexExpression("A",3,exp,"BABA" );
        assertEquals("ACCCBABA",repExp.evaluate());
    }

    @Test
    void testEvaluationOfRepeatingExpression(){
        Expression exp = new StringDecoder.StringExpression("C");
        Expression repExp1= new StringDecoder.ComplexExpression("A",3,exp,"BABA" );
        Expression repExp2 = new StringDecoder.ComplexExpression("A",3,exp,"BABA" );
        List<Expression> expressions = new ArrayList<>();
        expressions.add(repExp1);
        expressions.add(repExp2);
        Expression repeatingExpression = new StringDecoder.RepeatingExpressions(expressions);
        assertEquals("ACCCBABAACCCBABA", repeatingExpression.evaluate());
    }

    @Test
    void testParseSimpleStringToStringExp(){
        String c = "C";
        Expression parse = StringDecoder.parse(c);
        assertEquals(StringDecoder.StringExpression.class, Objects.requireNonNull(parse).getClass());
        assertEquals("C", parse.evaluate());
    }

    @Test
    void testParseRepString(){
        String c = "3[C]";
        Expression parse = StringDecoder.parse(c);
        assertEquals(StringDecoder.ComplexExpression.class, Objects.requireNonNull(parse).getClass());
        assertEquals("CCC", parse.evaluate());
    }

    @Test
    void testParseRepStringWithPreAndPostString(){
        String c = "a3[C]d";
        Expression parse = StringDecoder.parse(c);
        assertEquals(StringDecoder.ComplexExpression.class, Objects.requireNonNull(parse).getClass());
        assertEquals("aCCCd", parse.evaluate());
    }

    @Test
    void testParseRepeatingRepString(){
        String c = "a3[C]dd3[D]";
        Expression parse = StringDecoder.parse(c);
        assertEquals(StringDecoder.RepeatingExpressions.class, Objects.requireNonNull(parse).getClass());
        assertEquals("aCCCddDDD", parse.evaluate());
    }

    @Test
    void testGetPreString(){
        String c = "ac3[C]d";
        String preString = StringDecoder.getPreString(c);
        assertEquals("ac", preString);
        c = "a3[C]d";
        preString = StringDecoder.getPreString(c);
        assertEquals("a", preString);
    }

    @Test
    void testGetPostString(){
        String c = "ac3[C]dd";
        String postString = StringDecoder.getPostString(c);
        assertEquals("dd", postString);
        c = "a3[C]d";
        postString = StringDecoder.getPostString(c);
        assertEquals("d", postString);
    }

    @Test
    void testGetRepCount(){
        String c = "3[C]";
        int repCount = StringDecoder.getRepCount(c);
        assertEquals(3,repCount);
    }


}
