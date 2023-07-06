package org.bank;

import org.junit.jupiter.api.Test;

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
    void testParseSimpleStringToStringExp(){

    }
}
