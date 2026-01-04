package Bsics;

import java.util.Objects;

abstract class Trimmer implements StringTrimmer {
    @Override
    public String ready(String s) throws IllegalAccessException {
        if (s.isBlank()) {
            throw new IllegalAccessException("This field should not be empty");
        }
        return s.toLowerCase().trim();
    }
}
