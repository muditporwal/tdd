package org.bank;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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
        StringDecoder.Expression exp = new StringDecoder.StringExpression("C");
        assertEquals("C",exp.evaluate());
    }

    @Test
    void testEvaluationOfRepExpression(){
        StringDecoder.Expression exp = new StringDecoder.StringExpression("C");
        StringDecoder.Expression repExp = new StringDecoder.RepExpression(3,exp );
        assertEquals("CCC",repExp.evaluate());
    }

    @Test
    void testEvaluationOfRepExpressionWithPreAndPostString(){
        StringDecoder.Expression exp = new StringDecoder.StringExpression("C");
        StringDecoder.Expression repExp = new StringDecoder.RepExpression("A",3,exp,"BABA" );
        assertEquals("ACCCBABA",repExp.evaluate());
    }

    @Test
    void testParseSimpleStringToStringExp(){
        String c = "C";
        StringDecoder.Expression parse = StringDecoder.parse(c);
        assertEquals(StringDecoder.StringExpression.class, Objects.requireNonNull(parse).getClass());
        assertEquals("C", parse.evaluate());
    }

    @Test
    void testParseRepStringToStringExp(){
        String c = "3[C]";
        StringDecoder.Expression parse = StringDecoder.parse(c);
        assertEquals(StringDecoder.RepExpression.class, Objects.requireNonNull(parse).getClass());
        assertEquals("CCC", parse.evaluate());
    }

    @Test
    void testGetRepCount(){
        String c = "3[C]";
        int repCount = StringDecoder.getRepCount(c);
        assertEquals(3,repCount);
    }
}
