package org.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

class StringDecoderTest {

    @Test
    void setupInterface() {
        String decoded = StringDecoder.decodeString("3[a]2[bc]");
        assertNull(decoded);
    }
}
