package com.example.new_sample;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityOnlyTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityAllTest() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.button1), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.button_add), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                13),
                        isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.button2), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.button_add), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                13),
                        isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.button3), withText("3"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatButton5.perform(click());

        ViewInteraction appCompatButton6 = onView(
                allOf(withId(R.id.button_add), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                13),
                        isDisplayed()));
        appCompatButton6.perform(click());

        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.button4), withText("4"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton7.perform(click());

        ViewInteraction appCompatButton8 = onView(
                allOf(withId(R.id.button_add), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                13),
                        isDisplayed()));
        appCompatButton8.perform(click());

        ViewInteraction appCompatButton9 = onView(
                allOf(withId(R.id.button5), withText("5"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        appCompatButton9.perform(click());

        ViewInteraction appCompatButton10 = onView(
                allOf(withId(R.id.button_add), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                13),
                        isDisplayed()));
        appCompatButton10.perform(click());

        ViewInteraction appCompatButton11 = onView(
                allOf(withId(R.id.button6), withText("6"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                5),
                        isDisplayed()));
        appCompatButton11.perform(click());

        ViewInteraction appCompatButton12 = onView(
                allOf(withId(R.id.button_add), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                13),
                        isDisplayed()));
        appCompatButton12.perform(click());

        ViewInteraction appCompatButton13 = onView(
                allOf(withId(R.id.button7), withText("7"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                6),
                        isDisplayed()));
        appCompatButton13.perform(click());

        ViewInteraction appCompatButton14 = onView(
                allOf(withId(R.id.button_add), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                13),
                        isDisplayed()));
        appCompatButton14.perform(click());

        ViewInteraction appCompatButton15 = onView(
                allOf(withId(R.id.button8), withText("8"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        appCompatButton15.perform(click());

        ViewInteraction appCompatButton16 = onView(
                allOf(withId(R.id.button_add), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                13),
                        isDisplayed()));
        appCompatButton16.perform(click());

        ViewInteraction appCompatButton17 = onView(
                allOf(withId(R.id.button9), withText("9"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                8),
                        isDisplayed()));
        appCompatButton17.perform(click());

        ViewInteraction appCompatButton18 = onView(
                allOf(withId(R.id.button_sub), withText("-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                14),
                        isDisplayed()));
        appCompatButton18.perform(click());

        ViewInteraction appCompatButton19 = onView(
                allOf(withId(R.id.button9), withText("9"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                8),
                        isDisplayed()));
        appCompatButton19.perform(click());

        ViewInteraction appCompatButton20 = onView(
                allOf(withId(R.id.button_sub), withText("-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                14),
                        isDisplayed()));
        appCompatButton20.perform(click());

        ViewInteraction appCompatButton21 = onView(
                allOf(withId(R.id.button8), withText("8"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        appCompatButton21.perform(click());

        ViewInteraction appCompatButton22 = onView(
                allOf(withId(R.id.button_sub), withText("-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                14),
                        isDisplayed()));
        appCompatButton22.perform(click());

        ViewInteraction appCompatButton23 = onView(
                allOf(withId(R.id.button7), withText("7"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                6),
                        isDisplayed()));
        appCompatButton23.perform(click());

        ViewInteraction appCompatButton24 = onView(
                allOf(withId(R.id.button_sub), withText("-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                14),
                        isDisplayed()));
        appCompatButton24.perform(click());

        ViewInteraction appCompatButton25 = onView(
                allOf(withId(R.id.button6), withText("6"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                5),
                        isDisplayed()));
        appCompatButton25.perform(click());

        ViewInteraction appCompatButton26 = onView(
                allOf(withId(R.id.button_sub), withText("-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                14),
                        isDisplayed()));
        appCompatButton26.perform(click());

        ViewInteraction appCompatButton27 = onView(
                allOf(withId(R.id.button5), withText("5"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        appCompatButton27.perform(click());

        ViewInteraction appCompatButton28 = onView(
                allOf(withId(R.id.button_sub), withText("-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                14),
                        isDisplayed()));
        appCompatButton28.perform(click());

        ViewInteraction appCompatButton29 = onView(
                allOf(withId(R.id.button4), withText("4"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton29.perform(click());

        ViewInteraction appCompatButton30 = onView(
                allOf(withId(R.id.button_sub), withText("-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                14),
                        isDisplayed()));
        appCompatButton30.perform(click());

        ViewInteraction appCompatButton31 = onView(
                allOf(withId(R.id.button3), withText("3"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatButton31.perform(click());

        ViewInteraction appCompatButton32 = onView(
                allOf(withId(R.id.button_sub), withText("-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                14),
                        isDisplayed()));
        appCompatButton32.perform(click());

        ViewInteraction appCompatButton33 = onView(
                allOf(withId(R.id.button2), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatButton33.perform(click());

        ViewInteraction appCompatButton34 = onView(
                allOf(withId(R.id.button_sub), withText("-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                14),
                        isDisplayed()));
        appCompatButton34.perform(click());

        ViewInteraction appCompatButton35 = onView(
                allOf(withId(R.id.button1), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatButton35.perform(click());

        ViewInteraction appCompatButton36 = onView(
                allOf(withId(R.id.button_sub), withText("-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                14),
                        isDisplayed()));
        appCompatButton36.perform(click());

        ViewInteraction appCompatButton37 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton37.perform(click());

        ViewInteraction appCompatButton38 = onView(
                allOf(withId(R.id.button_multi), withText("×"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton38.perform(click());

        ViewInteraction appCompatButton39 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton39.perform(click());

        ViewInteraction appCompatButton40 = onView(
                allOf(withId(R.id.button_multi), withText("×"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton40.perform(click());

        ViewInteraction appCompatButton41 = onView(
                allOf(withId(R.id.button1), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatButton41.perform(click());

        ViewInteraction appCompatButton42 = onView(
                allOf(withId(R.id.button_multi), withText("×"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton42.perform(click());

        ViewInteraction appCompatButton43 = onView(
                allOf(withId(R.id.button2), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatButton43.perform(click());

        ViewInteraction appCompatButton44 = onView(
                allOf(withId(R.id.button_multi), withText("×"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton44.perform(click());

        ViewInteraction appCompatButton45 = onView(
                allOf(withId(R.id.button3), withText("3"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatButton45.perform(click());

        ViewInteraction appCompatButton46 = onView(
                allOf(withId(R.id.button_multi), withText("×"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton46.perform(click());

        ViewInteraction appCompatButton47 = onView(
                allOf(withId(R.id.button4), withText("4"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton47.perform(click());

        ViewInteraction appCompatButton48 = onView(
                allOf(withId(R.id.button_multi), withText("×"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton48.perform(click());

        ViewInteraction appCompatButton49 = onView(
                allOf(withId(R.id.button5), withText("5"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        appCompatButton49.perform(click());

        ViewInteraction appCompatButton50 = onView(
                allOf(withId(R.id.button_multi), withText("×"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton50.perform(click());

        ViewInteraction appCompatButton51 = onView(
                allOf(withId(R.id.button6), withText("6"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                5),
                        isDisplayed()));
        appCompatButton51.perform(click());

        ViewInteraction appCompatButton52 = onView(
                allOf(withId(R.id.button_multi), withText("×"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton52.perform(click());

        ViewInteraction appCompatButton53 = onView(
                allOf(withId(R.id.button7), withText("7"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                6),
                        isDisplayed()));
        appCompatButton53.perform(click());

        ViewInteraction appCompatButton54 = onView(
                allOf(withId(R.id.button_multi), withText("×"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton54.perform(click());

        ViewInteraction appCompatButton55 = onView(
                allOf(withId(R.id.button8), withText("8"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        appCompatButton55.perform(click());

        ViewInteraction appCompatButton56 = onView(
                allOf(withId(R.id.button_multi), withText("×"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton56.perform(click());

        ViewInteraction appCompatButton57 = onView(
                allOf(withId(R.id.button9), withText("9"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                8),
                        isDisplayed()));
        appCompatButton57.perform(click());

        ViewInteraction appCompatButton58 = onView(
                allOf(withId(R.id.button_multi), withText("×"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton58.perform(click());

        ViewInteraction appCompatButton59 = onView(
                allOf(withId(R.id.button_clear), withText("AC"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                15),
                        isDisplayed()));
        appCompatButton59.perform(click());

        ViewInteraction appCompatButton60 = onView(
                allOf(withId(R.id.button1), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatButton60.perform(click());

        ViewInteraction appCompatButton61 = onView(
                allOf(withId(R.id.button_multi), withText("×"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton61.perform(click());

        ViewInteraction appCompatButton62 = onView(
                allOf(withId(R.id.button2), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatButton62.perform(click());

        ViewInteraction appCompatButton63 = onView(
                allOf(withId(R.id.button_multi), withText("×"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton63.perform(click());

        ViewInteraction appCompatButton64 = onView(
                allOf(withId(R.id.button3), withText("3"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatButton64.perform(click());

        ViewInteraction appCompatButton65 = onView(
                allOf(withId(R.id.button_multi), withText("×"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton65.perform(click());

        ViewInteraction appCompatButton66 = onView(
                allOf(withId(R.id.button4), withText("4"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton66.perform(click());

        ViewInteraction appCompatButton67 = onView(
                allOf(withId(R.id.button_multi), withText("×"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton67.perform(click());

        ViewInteraction appCompatButton68 = onView(
                allOf(withId(R.id.button5), withText("5"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        appCompatButton68.perform(click());

        ViewInteraction appCompatButton69 = onView(
                allOf(withId(R.id.button_multi), withText("×"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton69.perform(click());

        ViewInteraction appCompatButton70 = onView(
                allOf(withId(R.id.button6), withText("6"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                5),
                        isDisplayed()));
        appCompatButton70.perform(click());

        ViewInteraction appCompatButton71 = onView(
                allOf(withId(R.id.button_multi), withText("×"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton71.perform(click());

        ViewInteraction appCompatButton72 = onView(
                allOf(withId(R.id.button7), withText("7"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                6),
                        isDisplayed()));
        appCompatButton72.perform(click());

        ViewInteraction appCompatButton73 = onView(
                allOf(withId(R.id.button_multi), withText("×"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton73.perform(click());

        ViewInteraction appCompatButton74 = onView(
                allOf(withId(R.id.button8), withText("8"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        appCompatButton74.perform(click());

        ViewInteraction appCompatButton75 = onView(
                allOf(withId(R.id.button_multi), withText("×"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton75.perform(click());

        ViewInteraction appCompatButton76 = onView(
                allOf(withId(R.id.button9), withText("9"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                8),
                        isDisplayed()));
        appCompatButton76.perform(click());

        ViewInteraction appCompatButton77 = onView(
                allOf(withId(R.id.button_divide), withText("/"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                12),
                        isDisplayed()));
        appCompatButton77.perform(click());

        ViewInteraction appCompatButton78 = onView(
                allOf(withId(R.id.button9), withText("9"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                8),
                        isDisplayed()));
        appCompatButton78.perform(click());

        ViewInteraction appCompatButton79 = onView(
                allOf(withId(R.id.button_divide), withText("/"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                12),
                        isDisplayed()));
        appCompatButton79.perform(click());

        ViewInteraction appCompatButton80 = onView(
                allOf(withId(R.id.button8), withText("8"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        appCompatButton80.perform(click());

        ViewInteraction appCompatButton81 = onView(
                allOf(withId(R.id.button_divide), withText("/"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                12),
                        isDisplayed()));
        appCompatButton81.perform(click());

        ViewInteraction appCompatButton82 = onView(
                allOf(withId(R.id.button7), withText("7"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                6),
                        isDisplayed()));
        appCompatButton82.perform(click());

        ViewInteraction appCompatButton83 = onView(
                allOf(withId(R.id.button_divide), withText("/"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                12),
                        isDisplayed()));
        appCompatButton83.perform(click());

        ViewInteraction appCompatButton84 = onView(
                allOf(withId(R.id.button6), withText("6"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                5),
                        isDisplayed()));
        appCompatButton84.perform(click());

        ViewInteraction appCompatButton85 = onView(
                allOf(withId(R.id.button_divide), withText("/"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                12),
                        isDisplayed()));
        appCompatButton85.perform(click());

        ViewInteraction appCompatButton86 = onView(
                allOf(withId(R.id.button5), withText("5"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        appCompatButton86.perform(click());

        ViewInteraction appCompatButton87 = onView(
                allOf(withId(R.id.button_divide), withText("/"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                12),
                        isDisplayed()));
        appCompatButton87.perform(click());

        ViewInteraction appCompatButton88 = onView(
                allOf(withId(R.id.button4), withText("4"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton88.perform(click());

        ViewInteraction appCompatButton89 = onView(
                allOf(withId(R.id.button_divide), withText("/"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                12),
                        isDisplayed()));
        appCompatButton89.perform(click());

        ViewInteraction appCompatButton90 = onView(
                allOf(withId(R.id.button3), withText("3"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatButton90.perform(click());

        ViewInteraction appCompatButton91 = onView(
                allOf(withId(R.id.button_divide), withText("/"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                12),
                        isDisplayed()));
        appCompatButton91.perform(click());

        ViewInteraction appCompatButton92 = onView(
                allOf(withId(R.id.button2), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatButton92.perform(click());

        ViewInteraction appCompatButton93 = onView(
                allOf(withId(R.id.button_divide), withText("/"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                12),
                        isDisplayed()));
        appCompatButton93.perform(click());

        ViewInteraction appCompatButton94 = onView(
                allOf(withId(R.id.button1), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatButton94.perform(click());

        ViewInteraction appCompatButton95 = onView(
                allOf(withId(R.id.button_divide), withText("/"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                12),
                        isDisplayed()));
        appCompatButton95.perform(click());

        ViewInteraction appCompatButton96 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton96.perform(click());

        ViewInteraction appCompatButton97 = onView(
                allOf(withId(R.id.button_equal), withText("="),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                10),
                        isDisplayed()));
        appCompatButton97.perform(click());

        ViewInteraction appCompatButton98 = onView(
                allOf(withId(R.id.button_clear), withText("AC"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                15),
                        isDisplayed()));
        appCompatButton98.perform(click());

        ViewInteraction appCompatButton99 = onView(
                allOf(withId(R.id.button1), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatButton99.perform(click());

        ViewInteraction appCompatButton100 = onView(
                allOf(withId(R.id.button_para1), withText("%"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                16),
                        isDisplayed()));
        appCompatButton100.perform(click());

        ViewInteraction appCompatButton101 = onView(
                allOf(withId(R.id.button_equal), withText("="),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                10),
                        isDisplayed()));
        appCompatButton101.perform(click());

        ViewInteraction appCompatButton102 = onView(
                allOf(withId(R.id.button_clear), withText("AC"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                15),
                        isDisplayed()));
        appCompatButton102.perform(click());

        ViewInteraction appCompatButton103 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton103.perform(click());

        ViewInteraction appCompatButton104 = onView(
                allOf(withId(R.id.button_dot), withText("."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                18),
                        isDisplayed()));
        appCompatButton104.perform(click());

        ViewInteraction appCompatButton105 = onView(
                allOf(withId(R.id.button1), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatButton105.perform(click());

        ViewInteraction appCompatButton106 = onView(
                allOf(withId(R.id.button_add), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                13),
                        isDisplayed()));
        appCompatButton106.perform(click());

        ViewInteraction appCompatButton107 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton107.perform(click());

        ViewInteraction appCompatButton108 = onView(
                allOf(withId(R.id.button_dot), withText("."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                18),
                        isDisplayed()));
        appCompatButton108.perform(click());

        ViewInteraction appCompatButton109 = onView(
                allOf(withId(R.id.button2), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatButton109.perform(click());

        ViewInteraction appCompatButton110 = onView(
                allOf(withId(R.id.button_add), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                13),
                        isDisplayed()));
        appCompatButton110.perform(click());

        ViewInteraction appCompatButton111 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton111.perform(click());

        ViewInteraction appCompatButton112 = onView(
                allOf(withId(R.id.button_dot), withText("."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                18),
                        isDisplayed()));
        appCompatButton112.perform(click());

        ViewInteraction appCompatButton113 = onView(
                allOf(withId(R.id.button6), withText("6"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                5),
                        isDisplayed()));
        appCompatButton113.perform(click());

        ViewInteraction appCompatButton114 = onView(
                allOf(withId(R.id.button_add), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                13),
                        isDisplayed()));
        appCompatButton114.perform(click());

        ViewInteraction appCompatButton115 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton115.perform(click());

        ViewInteraction appCompatButton116 = onView(
                allOf(withId(R.id.button_dot), withText("."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                18),
                        isDisplayed()));
        appCompatButton116.perform(click());

        ViewInteraction appCompatButton117 = onView(
                allOf(withId(R.id.button7), withText("7"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                6),
                        isDisplayed()));
        appCompatButton117.perform(click());

        ViewInteraction appCompatButton118 = onView(
                allOf(withId(R.id.button_add), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                13),
                        isDisplayed()));
        appCompatButton118.perform(click());

        ViewInteraction appCompatButton119 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton119.perform(click());

        ViewInteraction appCompatButton120 = onView(
                allOf(withId(R.id.button1), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatButton120.perform(click());

        ViewInteraction appCompatButton121 = onView(
                allOf(withId(R.id.button_add), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                13),
                        isDisplayed()));
        appCompatButton121.perform(click());

        ViewInteraction appCompatButton122 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton122.perform(click());

        ViewInteraction appCompatButton123 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton123.perform(click());

        ViewInteraction appCompatButton124 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton124.perform(click());

        ViewInteraction appCompatButton125 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton125.perform(click());

        ViewInteraction appCompatButton126 = onView(
                allOf(withId(R.id.button2), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatButton126.perform(click());

        ViewInteraction appCompatButton127 = onView(
                allOf(withId(R.id.button_add), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                13),
                        isDisplayed()));
        appCompatButton127.perform(click());

        ViewInteraction appCompatButton128 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton128.perform(click());

        ViewInteraction appCompatButton129 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton129.perform(click());

        ViewInteraction appCompatButton130 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton130.perform(click());

        ViewInteraction appCompatButton131 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton131.perform(click());

        ViewInteraction appCompatButton132 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton132.perform(click());

        ViewInteraction appCompatButton133 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton133.perform(click());

        ViewInteraction appCompatButton134 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton134.perform(click());

        ViewInteraction appCompatButton135 = onView(
                allOf(withId(R.id.button5), withText("5"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        appCompatButton135.perform(click());

        ViewInteraction appCompatButton136 = onView(
                allOf(withId(R.id.button_dot), withText("."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                18),
                        isDisplayed()));
        appCompatButton136.perform(click());

        ViewInteraction appCompatButton137 = onView(
                allOf(withId(R.id.button4), withText("4"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton137.perform(click());

        ViewInteraction appCompatButton138 = onView(
                allOf(withId(R.id.button_sub), withText("-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                14),
                        isDisplayed()));
        appCompatButton138.perform(click());

        ViewInteraction appCompatButton139 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton139.perform(click());

        ViewInteraction appCompatButton140 = onView(
                allOf(withId(R.id.button_dot), withText("."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                18),
                        isDisplayed()));
        appCompatButton140.perform(click());

        ViewInteraction appCompatButton141 = onView(
                allOf(withId(R.id.button2), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatButton141.perform(click());

        ViewInteraction appCompatButton142 = onView(
                allOf(withId(R.id.button_add), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                13),
                        isDisplayed()));
        appCompatButton142.perform(click());

        ViewInteraction appCompatButton143 = onView(
                allOf(withId(R.id.button_sub), withText("-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                14),
                        isDisplayed()));
        appCompatButton143.perform(click());

        ViewInteraction appCompatButton144 = onView(
                allOf(withId(R.id.button_clear), withText("AC"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                15),
                        isDisplayed()));
        appCompatButton144.perform(click());

        ViewInteraction appCompatButton145 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton145.perform(click());

        ViewInteraction appCompatButton146 = onView(
                allOf(withId(R.id.button_dot), withText("."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                18),
                        isDisplayed()));
        appCompatButton146.perform(click());

        ViewInteraction appCompatButton147 = onView(
                allOf(withId(R.id.button1), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatButton147.perform(click());

        ViewInteraction appCompatButton148 = onView(
                allOf(withId(R.id.button_multi), withText("×"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton148.perform(click());

        ViewInteraction appCompatButton149 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton149.perform(click());

        ViewInteraction appCompatButton150 = onView(
                allOf(withId(R.id.button_dot), withText("."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                18),
                        isDisplayed()));
        appCompatButton150.perform(click());

        ViewInteraction appCompatButton151 = onView(
                allOf(withId(R.id.button2), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatButton151.perform(click());

        ViewInteraction appCompatButton152 = onView(
                allOf(withId(R.id.button_multi), withText("×"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton152.perform(click());

        ViewInteraction appCompatButton153 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton153.perform(click());

        ViewInteraction appCompatButton154 = onView(
                allOf(withId(R.id.button_multi), withText("×"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton154.perform(click());

        ViewInteraction appCompatButton155 = onView(
                allOf(withId(R.id.button1), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatButton155.perform(click());

        ViewInteraction appCompatButton156 = onView(
                allOf(withId(R.id.button_clear), withText("AC"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                15),
                        isDisplayed()));
        appCompatButton156.perform(click());

        ViewInteraction appCompatButton157 = onView(
                allOf(withId(R.id.button_clear), withText("AC"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                15),
                        isDisplayed()));
        appCompatButton157.perform(click());

        ViewInteraction appCompatButton158 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton158.perform(click());

        ViewInteraction appCompatButton159 = onView(
                allOf(withId(R.id.button_dot), withText("."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                18),
                        isDisplayed()));
        appCompatButton159.perform(click());

        ViewInteraction appCompatButton160 = onView(
                allOf(withId(R.id.button1), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatButton160.perform(click());

        ViewInteraction appCompatButton161 = onView(
                allOf(withId(R.id.button_divide), withText("/"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                12),
                        isDisplayed()));
        appCompatButton161.perform(click());

        ViewInteraction appCompatButton162 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton162.perform(click());

        ViewInteraction appCompatButton163 = onView(
                allOf(withId(R.id.button_dot), withText("."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                18),
                        isDisplayed()));
        appCompatButton163.perform(click());

        ViewInteraction appCompatButton164 = onView(
                allOf(withId(R.id.button2), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatButton164.perform(click());

        ViewInteraction appCompatButton165 = onView(
                allOf(withId(R.id.button_equal), withText("="),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                10),
                        isDisplayed()));
        appCompatButton165.perform(click());

        ViewInteraction appCompatButton166 = onView(
                allOf(withId(R.id.button_clear), withText("AC"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                15),
                        isDisplayed()));
        appCompatButton166.perform(click());

        ViewInteraction appCompatButton167 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton167.perform(click());

        ViewInteraction appCompatButton168 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton168.perform(click());

        ViewInteraction appCompatButton169 = onView(
                allOf(withId(R.id.button1), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatButton169.perform(click());

        ViewInteraction appCompatButton170 = onView(
                allOf(withId(R.id.button_divide), withText("/"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                12),
                        isDisplayed()));
        appCompatButton170.perform(click());

        ViewInteraction appCompatButton171 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton171.perform(click());

        ViewInteraction appCompatButton172 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton172.perform(click());

        ViewInteraction appCompatButton173 = onView(
                allOf(withId(R.id.button2), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatButton173.perform(click());

        ViewInteraction appCompatButton174 = onView(
                allOf(withId(R.id.button_divide), withText("/"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                12),
                        isDisplayed()));
        appCompatButton174.perform(click());

        ViewInteraction appCompatButton175 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton175.perform(click());

        ViewInteraction appCompatButton176 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton176.perform(click());

        ViewInteraction appCompatButton177 = onView(
                allOf(withId(R.id.button3), withText("3"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatButton177.perform(click());

        ViewInteraction appCompatButton178 = onView(
                allOf(withId(R.id.button_equal), withText("="),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                10),
                        isDisplayed()));
        appCompatButton178.perform(click());

        ViewInteraction appCompatButton179 = onView(
                allOf(withId(R.id.button_clear), withText("AC"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                15),
                        isDisplayed()));
        appCompatButton179.perform(click());

        ViewInteraction appCompatButton180 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton180.perform(click());

        ViewInteraction appCompatButton181 = onView(
                allOf(withId(R.id.button1), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatButton181.perform(click());

        ViewInteraction appCompatButton182 = onView(
                allOf(withId(R.id.button_para2), withText("+/-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                17),
                        isDisplayed()));
        appCompatButton182.perform(click());

        ViewInteraction appCompatButton183 = onView(
                allOf(withId(R.id.button_add), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                13),
                        isDisplayed()));
        appCompatButton183.perform(click());

        ViewInteraction appCompatButton184 = onView(
                allOf(withId(R.id.button_clear), withText("AC"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                15),
                        isDisplayed()));
        appCompatButton184.perform(click());

        ViewInteraction appCompatButton185 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton185.perform(click());

        ViewInteraction appCompatButton186 = onView(
                allOf(withId(R.id.button_dot), withText("."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                18),
                        isDisplayed()));
        appCompatButton186.perform(click());

        ViewInteraction appCompatButton187 = onView(
                allOf(withId(R.id.button1), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatButton187.perform(click());

        ViewInteraction appCompatButton188 = onView(
                allOf(withId(R.id.button_para2), withText("+/-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                17),
                        isDisplayed()));
        appCompatButton188.perform(click());

        ViewInteraction appCompatButton189 = onView(
                allOf(withId(R.id.button_sub), withText("-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                14),
                        isDisplayed()));
        appCompatButton189.perform(click());

        ViewInteraction appCompatButton190 = onView(
                allOf(withId(R.id.button_clear), withText("AC"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                15),
                        isDisplayed()));
        appCompatButton190.perform(click());

        ViewInteraction appCompatButton191 = onView(
                allOf(withId(R.id.button2), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatButton191.perform(click());

        ViewInteraction appCompatButton192 = onView(
                allOf(withId(R.id.button_para1), withText("%"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                16),
                        isDisplayed()));
        appCompatButton192.perform(click());

        ViewInteraction appCompatButton193 = onView(
                allOf(withId(R.id.button_add), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                13),
                        isDisplayed()));
        appCompatButton193.perform(click());

        ViewInteraction appCompatButton194 = onView(
                allOf(withId(R.id.button_clear), withText("AC"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                15),
                        isDisplayed()));
        appCompatButton194.perform(click());

        ViewInteraction appCompatButton195 = onView(
                allOf(withId(R.id.button1), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatButton195.perform(click());

        ViewInteraction appCompatButton196 = onView(
                allOf(withId(R.id.button_para1), withText("%"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                16),
                        isDisplayed()));
        appCompatButton196.perform(click());

        ViewInteraction appCompatButton197 = onView(
                allOf(withId(R.id.button_equal), withText("="),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                10),
                        isDisplayed()));
        appCompatButton197.perform(click());

        ViewInteraction appCompatButton198 = onView(
                allOf(withId(R.id.button_clear), withText("AC"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                15),
                        isDisplayed()));
        appCompatButton198.perform(click());

        ViewInteraction appCompatButton199 = onView(
                allOf(withId(R.id.button2), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatButton199.perform(click());

        ViewInteraction appCompatButton200 = onView(
                allOf(withId(R.id.button_para1), withText("%"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                16),
                        isDisplayed()));
        appCompatButton200.perform(click());

        ViewInteraction appCompatButton201 = onView(
                allOf(withId(R.id.button_equal), withText("="),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                10),
                        isDisplayed()));
        appCompatButton201.perform(click());

        ViewInteraction appCompatButton202 = onView(
                allOf(withId(R.id.button_clear), withText("AC"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                15),
                        isDisplayed()));
        appCompatButton202.perform(click());

        ViewInteraction appCompatButton203 = onView(
                allOf(withId(R.id.button_clear), withText("AC"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                15),
                        isDisplayed()));
        appCompatButton203.perform(click());

        ViewInteraction appCompatButton204 = onView(
                allOf(withId(R.id.button1), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatButton204.perform(click());

        ViewInteraction appCompatButton205 = onView(
                allOf(withId(R.id.button_divide), withText("/"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                12),
                        isDisplayed()));
        appCompatButton205.perform(click());

        ViewInteraction appCompatButton206 = onView(
                allOf(withId(R.id.button0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton206.perform(click());

        ViewInteraction appCompatButton207 = onView(
                allOf(withId(R.id.button_equal), withText("="),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                10),
                        isDisplayed()));
        appCompatButton207.perform(click());

        ViewInteraction appCompatButton208 = onView(
                allOf(withId(R.id.button_clear), withText("AC"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                15),
                        isDisplayed()));
        appCompatButton208.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
