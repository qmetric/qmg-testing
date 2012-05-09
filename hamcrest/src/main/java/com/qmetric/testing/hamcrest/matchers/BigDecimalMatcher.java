package com.qmetric.testing.hamcrest.matchers;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

import java.math.BigDecimal;

public class BigDecimalMatcher extends TypeSafeMatcher<BigDecimal> {

    private final BigDecimal value;

    public BigDecimalMatcher(BigDecimal value) {
        this.value = value;
    }

    @Override
    public boolean matchesSafely(BigDecimal item) {
        return item.compareTo(value) == 0;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("a numeric value equal to ")
                .appendValue(value);
    }
}