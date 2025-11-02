//Program to define generic functional interface Palindrome

package com.tnsif.Day_19.V1;

public interface Palindrome<T> {
	boolean checkPalindrome(T data);
}
