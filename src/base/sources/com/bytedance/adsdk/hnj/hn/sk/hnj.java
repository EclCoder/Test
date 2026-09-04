package com.bytedance.adsdk.hnj.hn.sk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    public static boolean gjv(char c10) {
        return '+' == c10 || '-' == c10 || '*' == c10 || '/' == c10 || '%' == c10 || '=' == c10 || '>' == c10 || '<' == c10 || '!' == c10 || '&' == c10 || '|' == c10 || '?' == c10 || ':' == c10;
    }

    public static boolean hn(char c10) {
        if (c10 < 'A' || c10 > 'Z') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    public static boolean hnj(char c10) {
        return c10 == ' ';
    }

    public static boolean qor(char c10) {
        return c10 >= '0' && c10 <= '9';
    }
}
