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
}
