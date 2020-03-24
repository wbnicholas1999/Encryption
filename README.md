# Encryption
Assignment 3 for CMSC-203

## Contents

1. General Info
2. Screenshots
3. Behind the Scenes
4. Programs used
5. Code Example
6. Filename
7. Contact
8. References

## Section 1: General Info

Encrypt the following letters and characters into some code for 2 different methods (Caesar Cipher and Bellaso Cipher).

## Section 2: Screenshots

https://github.com/wbnicholas1999/Encryption/blob/master/Screenshot1.jpg
https://github.com/wbnicholas1999/Encryption/blob/master/Screenshot2.jpg
https://github.com/wbnicholas1999/Encryption/blob/master/Screenshot3.jpg

## Section 3: Behind the Scenes

The FX java files were a pain to set up because I didn’t know what to do in the first place. I was stuck within days to figure out what to do with the FX files, until you have to download an add-on for the files itself. I watched a YouTube video to get the JavaFX project to set up [1]. As for the “CryptoManager” files; they weren’t really a problem to deal with because we learned to work on the JUnit files in class, and the JUnit files are started to become the most important files to turn in for our assignments starting now. Downloading and setting up javafx required a lot of steps; I made another folder for my flash drive exclusively for any Java extensions needed for any lab or assignment, and typing the argument code took a while. After setting up the GUI; I started to get use to the program itself. At first, the GUI wouldn’t work because I typed something in to encrypt, but then I figured out you can type any integer value to encrypt whatever I type into random key symbols.

Encryption Test Table:

|       Input Text      | Input Key | Encrypted (Method 1)  | Encrypted (Method 2)  | Decrypted  (Method 1) | Decrypted  (Method 2) |
|-----------------------|-----------|-----------------------|-----------------------|-----------------------|-----------------------|
|     ANIME IS LIFE     |     69    |     FSNRJ%NX%QNKJ     |     7G?F;Y?LVE??;     |     ANIME IS LIFE     |     ANIME IS LIFE     |
|      PLAYSTATION5     |     94    |      .*_712_2'-,S     |      I@:MLH:HBCG)     |      PLAYSTATION5     |      PLAYSTATION5     |
|      DISNEY PLUS      |     31    |      #(2-$8?/+42      |      7:F?8JSA?FF      |      DISNEY PLUS      |      DISNEY PLUS      |
| HALF-LIFE 3 CONFIRMED |     3     | KDOI0OLIH#6#FRQILUPHG | ;4?9 ?<98S&S6BA9<E@87 | HALF-LIFE 3 CONFIRMED | HALF-LIFE 3 CONFIRMED |

## Section 4: Programs used

Eclipse
JavaFX
Command Prompt

## Section 5: Code Example

encryptedStr = CryptoManager.encryptBellaso(plainTextTextField.getText().toUpperCase(), bellasoStr);

## Section 6: Filenames

Windows:

https://github.com/wbnicholas1999/Encryption/blob/master/Crypto_GFA_Test.java
https://github.com/wbnicholas1999/Encryption/blob/master/Crypto_JUnit_GFA_Test.java
https://github.com/wbnicholas1999/Encryption/blob/master/CryptoJUnitTest.java
https://github.com/wbnicholas1999/Encryption/blob/master/CryptoManager.java
https://github.com/wbnicholas1999/Encryption/blob/master/CryptoManagerTest.java
https://github.com/wbnicholas1999/Encryption/blob/master/FXDriver.java
https://github.com/wbnicholas1999/Encryption/blob/master/FXMainPane.java

I apologize Linux and Mac users.

## Section 7: Contact
Created by wbnicholas1999

## Section 8: References
[1] YouTube video made by Jose Gomez: https://www.youtube.com/watch?v=oVn6_2KuYbM
