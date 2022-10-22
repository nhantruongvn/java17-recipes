package org.java17recipes.chapter03.recipe03_01;

import org.apache.commons.text.StrSubstitutor;
import org.apache.commons.text.WordUtils;
import org.apache.commons.text.diff.EditScript;
import org.apache.commons.text.diff.StringsComparator;
import org.apache.commons.text.similarity.LongestCommonSubsequence;
import org.apache.commons.text.translate.UnicodeEscaper;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ApacheCommonsTextDemo {

    @Test
    @org.junit.jupiter.api.Test
    public void whenContainsWords_thenCorrect() {
        boolean containsWords = WordUtils
                .containsAllWords("String to search", "to", "search");

        assertTrue(containsWords);
    }
    @Test
    @org.junit.jupiter.api.Test
    public void whenCapitalized_thenCorrect() {
        String toBeCapitalized = "to be capitalized!";
        String result = WordUtils.capitalize(toBeCapitalized);

        assertEquals("To Be Capitalized!", result);
    }

    @org.junit.jupiter.api.Test
    @Test
    public void whenEditScript_thenCorrect() {
        StringsComparator cmp = new StringsComparator("ABCFGH", "BCDEFG");
        EditScript<Character> script = cmp.getScript();
        int mod = script.getModifications();

        assertEquals(4, mod);
    }

    @org.junit.jupiter.api.Test
    @Test
    public void whenCompare_thenCorrect() {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        int countLcs = lcs.apply("New York", "New Hampshire");

        assertEquals(5, countLcs);
    }

    @org.junit.jupiter.api.Test
    @Test
    public void whenTranslate_thenCorrect() {
        UnicodeEscaper ue = UnicodeEscaper.above(0);
        String result = ue.translate("ABCD");

        assertEquals("\\u0041\\u0042\\u0043\\u0044", result);
    }
}