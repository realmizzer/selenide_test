package org.example.testdata;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public final class UserTestData {

    public static Stream<Arguments> getUserTestData() {
        return Stream.of(
                Arguments.of("selenide_test", "12345678")
        );
    }

}
