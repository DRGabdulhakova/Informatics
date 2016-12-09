package com.disclosure.pack;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by GDR on 24.11.2016.
 * @author Dina Gabdulhakova
 * @version 1.0
 */

public class MyString {

    /**
     * The value is used for character storage
     */
    private char[] character;

    /**
     * Initializes a newly created object so that it
     * represents an empty character sequence.
     */
    MyString() {
        character = new char[0];
    }

    /**
     * Allocates a new String so that it represents the sequence
     * of characters currently contained in the character array argument.
     * @param character an initial char sequences of the string
     */
    private MyString(char[] character) {
       this.character = character;
   }

    /**
     * Initializes a newly created object so that it represents
     * the characters sequence of String argument.
     * @param name the initial value of the String.
     */
    MyString(String name) {
        character = name.toCharArray();
    }

    /**
     * This method concatenates the specified string to the end of this string.
     * @param str the MyString that is concatenated to the end of this MyString.
     * @return a string that represents the concatenation of this object's characters
     * followed by the string argument's characters.
     */
    MyString concat(MyString str) {
        int otherLen = str.length();
        if (otherLen == 0) {
            return this;
        }
        int len = character.length;
        char buf[] = Arrays.copyOf(character, len + otherLen);
        System.arraycopy(str.character, 0, buf, len, otherLen);
        return new MyString(buf);
   }

    /**
     * Converts this string to a new character array.
     * @return a new character array whose length
     * is the length of this string and whose contents are initialized
     * to contain the character sequence represented by this string.
     */
   char[] toCharArray() {
       return character;
   }

    /**
     * Returns the char value at the specified index
     * @param index the index of the char value
     * @return the char value at the specified index of this string
     */
   protected char charAt(int index) {
       if ((index < 0) || (index >= character.length)) {
           throw new StringIndexOutOfBoundsException(index);
       }
       return character[index];
   }

    /**
     * Returns the index within this string of the
     * first occurrence of the specified substring
     * @param name the substring to search for
     * @return the index of the first appearance of the specified substring,
     * or -1 if there is no such appearance.
     */
    int indexOf(MyString name) {
        int length = character.length;
        int n = 0;

        for(int i = 0; i < length; i++) {
            if(character[i] != name.character[0]) continue;
            for (int j = 0; j < name.character.length; j++) {
                if(i + j < length && character[i + j] == name.character[j]) n++;
                else break;
            }
            if(n == name.character.length) return i;
            else n = 0;
        }
        return  -1;
   }


    /**
     * Returns a new string that is a substring of this string
     * @param beginIndex the begin index
     * @param endIndex the end index
     * @return the specified subsequence.
     */
    MyString substring(int beginIndex, int endIndex) {
        if (beginIndex < 0) {
            throw new StringIndexOutOfBoundsException(beginIndex);
        }
        if (endIndex + beginIndex > character.length) {
            throw new StringIndexOutOfBoundsException(beginIndex + endIndex);
        }
        if (endIndex < 0) {
            throw new StringIndexOutOfBoundsException(endIndex);
        }
        if ((beginIndex == 0) && (endIndex + beginIndex == character.length)) {
            return this;
        }
        char result[] = new char[endIndex];
        System.arraycopy(character, beginIndex, result, 0, endIndex);
        return new MyString(result);
   }

    /**
     * Returns the length of this string
     * @return the length of the sequence of characters represented by this object
     */
    int length() {
        return character.length;
   }


    /**
     * This method splits the string around matches of the given character.
     * @param lim delimiter the delimiting character
     * @return the array of strings computed by splitting this string
     */
    MyString[] split(char lim) {
       ArrayList<MyString> list = new ArrayList<>();
       int start = 0;
       for (int i = 0; i < character.length; i++) {
           if (character[i] == lim) {
               if (start != i) {
                   list.add(substring(start, i - start));
               }
               start = i + 1;
           } else if (i == character.length - 1) {
               list.add(substring(start, i - start + 1));
           }
       }
       MyString[] splitted = new MyString[list.size()];
       return list.toArray(splitted);
   }

   @Override
    public  String toString() {
       return  new String(character);
   }

   @Override
    public  boolean equals(Object o) {
       if (this == o) {
           return true;
       }
       if (o == null || getClass() != o.getClass()) {
           return false;
       }
       MyString string = (MyString) o;
       return Arrays.equals(this.character, string.character);

   }

   @Override
    public int hashCode() {
       return Arrays.hashCode(character);
   }


}
