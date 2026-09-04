package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<Character, Character> f30904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f30905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static byte[] f30906c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f30907d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    static {
        HashMap map = new HashMap();
        f30904a = map;
        map.put('v', 'A');
        f30904a.put('S', 'B');
        f30904a.put('o', 'C');
        f30904a.put('a', 'D');
        f30904a.put('j', 'E');
        f30904a.put('c', 'F');
        f30904a.put('7', 'G');
        f30904a.put('d', 'H');
        f30904a.put('R', 'I');
        f30904a.put('z', 'J');
        f30904a.put('p', 'K');
        f30904a.put('W', 'L');
        f30904a.put('i', 'M');
        f30904a.put('f', 'N');
        f30904a.put('G', 'O');
        f30904a.put('y', 'P');
        f30904a.put('N', 'Q');
        f30904a.put('x', 'R');
        f30904a.put('Z', 'S');
        f30904a.put('n', 'T');
        f30904a.put('V', 'U');
        f30904a.put('5', 'V');
        f30904a.put('k', 'W');
        f30904a.put('+', 'X');
        f30904a.put('D', 'Y');
        f30904a.put('H', 'Z');
        f30904a.put('L', 'a');
        f30904a.put('Y', 'b');
        f30904a.put('h', 'c');
        f30904a.put('J', 'd');
        f30904a.put('4', 'e');
        f30904a.put('6', 'f');
        f30904a.put('l', 'g');
        f30904a.put('t', 'h');
        f30904a.put('0', 'i');
        f30904a.put('U', 'j');
        f30904a.put('3', 'k');
        f30904a.put('Q', 'l');
        f30904a.put('r', 'm');
        f30904a.put('g', 'n');
        f30904a.put('E', 'o');
        f30904a.put('u', 'p');
        f30904a.put('q', 'q');
        f30904a.put('8', 'r');
        f30904a.put('s', 's');
        f30904a.put('w', 't');
        f30904a.put('/', 'u');
        f30904a.put('X', 'v');
        f30904a.put('M', 'w');
        f30904a.put('e', 'x');
        f30904a.put('B', 'y');
        f30904a.put('A', 'z');
        f30904a.put('T', '0');
        f30904a.put('2', '1');
        f30904a.put('F', '2');
        f30904a.put('b', '3');
        f30904a.put('9', '4');
        f30904a.put('P', '5');
        f30904a.put('1', '6');
        f30904a.put('O', '7');
        f30904a.put('I', '8');
        f30904a.put('K', '9');
        f30904a.put('m', '+');
        f30904a.put('C', '/');
        HashMap map2 = new HashMap();
        f30905b = map2;
        map2.put('A', 'v');
        f30905b.put('B', 'S');
        f30905b.put('C', 'o');
        f30905b.put('D', 'a');
        f30905b.put('E', 'j');
        f30905b.put('F', 'c');
        f30905b.put('G', '7');
        f30905b.put('H', 'd');
        f30905b.put('I', 'R');
        f30905b.put('J', 'z');
        f30905b.put('K', 'p');
        f30905b.put('L', 'W');
        f30905b.put('M', 'i');
        f30905b.put('N', 'f');
        f30905b.put('O', 'G');
        f30905b.put('P', 'y');
        f30905b.put('Q', 'N');
        f30905b.put('R', 'x');
        f30905b.put('S', 'Z');
        f30905b.put('T', 'n');
        f30905b.put('U', 'V');
        f30905b.put('V', '5');
        f30905b.put('W', 'k');
        f30905b.put('X', '+');
        f30905b.put('Y', 'D');
        f30905b.put('Z', 'H');
        f30905b.put('a', 'L');
        f30905b.put('b', 'Y');
        f30905b.put('c', 'h');
        f30905b.put('d', 'J');
        f30905b.put('e', '4');
        f30905b.put('f', '6');
        f30905b.put('g', 'l');
        f30905b.put('h', 't');
        f30905b.put('i', '0');
        f30905b.put('j', 'U');
        f30905b.put('k', '3');
        f30905b.put('l', 'Q');
        f30905b.put('m', 'r');
        f30905b.put('n', 'g');
        f30905b.put('o', 'E');
        f30905b.put('p', 'u');
        f30905b.put('q', 'q');
        f30905b.put('r', '8');
        f30905b.put('s', 's');
        f30905b.put('t', 'w');
        f30905b.put('u', '/');
        f30905b.put('v', 'X');
        f30905b.put('w', 'M');
        f30905b.put('x', 'e');
        f30905b.put('y', 'B');
        f30905b.put('z', 'A');
        f30905b.put('0', 'T');
        f30905b.put('1', '2');
        f30905b.put('2', 'F');
        f30905b.put('3', 'b');
        f30905b.put('4', '9');
        f30905b.put('5', 'P');
        f30905b.put('6', '1');
        f30905b.put('7', 'O');
        f30905b.put('8', 'I');
        f30905b.put('9', 'K');
        f30905b.put('+', 'm');
        f30905b.put('/', 'C');
    }

    public static String a(String str) {
        return r0.b(str);
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? "" : r0.c(str);
    }
}
