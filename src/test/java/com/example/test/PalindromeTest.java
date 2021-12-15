package com.example.test;

import com.example.StringPalindrome;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void isPalindromeTest(){
        StringPalindrome obj = new StringPalindrome();
        //System.out.println(obj.reverse("hello"));
        //Assert.assertEquals("olleh", obj.reverse("hello"));
        Assert.assertTrue(obj.isStringPalindrome("noon"));
    }

    @Test
    public void isNotPalindromeTest(){
        StringPalindrome obj = new StringPalindrome();
        Assert.assertFalse(obj.isStringPalindrome("abc"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void IllegalArgumentExceptionTest(){
        StringPalindrome obj = new StringPalindrome();
        obj.isStringPalindrome(null);
    }
}
