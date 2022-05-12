package ua.lviv.iot.lab4.expression;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RegularTest {
    Regular regular;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
        regular = new Regular();
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void testWordsSwitch() {
        var actual = regular.switchWords();
        String expected = "Founded traditionally 6 "
                + "March 1902 as Madrid Football "
                + "Club, the club has on worn a "
                + "white home kit since inception."
                + " The is title real honorific "
                + "Spanish for and was bestowed to "
                + "the club by King Alfonso XIII in"
                + " 1920 together with the royal "
                + "crown in the emblem. The team "
                + "has played capacity home matches"
                + " in the 81,044-its Santiago "
                + "Bernabeu Stadium in downtown "
                + "Madrid since 1947. throughout "
                + "most European sporting entities,"
                + " Real Madrid's members have "
                + "owned and operated the club "
                + "Unlike its history.";
        Assert.assertEquals(expected, actual);
    }

}
