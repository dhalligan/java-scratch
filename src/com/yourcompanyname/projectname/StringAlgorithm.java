package com.yourcompanyname.projectname;

import java.util.ArrayList;

public class StringAlgorithm {

    // compare compares two strings a and b lexicographically. If a < b the return value is true. Otherwise
    // it is false.
    public boolean compare(String a, String b) {
	for (int i = 0; i < a.length() && i < b.length(); ++i) {
	    if (a.charAt(i) < b.charAt(i)) {
		return true;
	    } else if (a.charAt(i) > b.charAt(i)) {
		return false;
	    }
	}
	return a.length() < b.length();
    }

    // Convert integer to string
    public String integerToString(int n, int base)
    {
	StringBuilder sb = new StringBuilder();
	boolean isNegative = (n < 0);
	if (isNegative) n = -n;

	while (n > 0) {
	    int r = n % base;
	    n /= base;
	    sb.append((char)(r >= 10 ? 'A' + r - 10 : '0' + r));
	}
	if (sb.toString().isEmpty()) {
	    sb.append('0');
	} else if (isNegative) {
	    sb.append('-');
	}
	return sb.reverse().toString();
    }

    // Convert string to integer
    public int stringToInteger(String s, int base)
    {
	boolean isNegative = (s.charAt(0) == '-');
	int sn = isNegative ? -1 : 1;
	int result = 0;
	for (int i = 0; i < s.length(); ++i) {
	    result *= base;
	    result += Character.isDigit(s.charAt(i)) ? s.charAt(i) - '0' : s.charAt(i) - 'A' + 10;
	}
	return result;
    }

    // Check if string is palindromic
    public boolean palindromic(String str)
    {
	int i = 0, j = str.length() - 1;
	while (i < j) {
	    while ((i < j) && !(Character.isLetterOrDigit(str.charAt(i)))) i++;
	    while ((i < j) && !(Character.isLetterOrDigit(str.charAt(j)))) j--;
	    if (Character.toLowerCase(str.charAt(i++)) != Character.toLowerCase(str.charAt(j--))) return false;
	}
	return true;
    }

    // Reverse string
    public String reverse(String str)
    {
	char[] arr = str.toCharArray();
	int i = 0, j = str.length() - 1;
	while (i < j) {
	    char temp = arr[i]; arr[i++] = arr[j]; arr[j--] = temp; // swap
	}
	return new String(arr);
    }

    // ssDecodeColId prints the number corresponding to an encoded Excel spreadsheet column.
    public int ssDecodeColId(String str)
    {
	int result = 0;
	for (int i = 0; i < str.length(); ++i) {
	    result *= 26;
	    result += (str.charAt(i) - 'A' + 1);
	}
	return result;
    }

    // Check if string has all unique characters
    public boolean uniqueChars(String str)
    {
	if (str.length() > 128) return false;

	boolean[] bitset = new boolean[128];
	for (int i = 0; i < str.length(); ++i) {
	    int val = str.charAt(i);
	    if (bitset[val]) {
		return false;
	    }
	    bitset[val] = true;
	}
	return true;
    }

}