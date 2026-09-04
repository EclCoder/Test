package bm;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h0 extends g0 {
    public static String Y0(String str, int i10) {
        kotlin.jvm.internal.s.h(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(yl.g.f(i10, str.length()));
            kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static String Z0(String str, int i10) {
        kotlin.jvm.internal.s.h(str, "<this>");
        if (i10 >= 0) {
            return e1(str, yl.g.d(str.length() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static char a1(CharSequence charSequence) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char b1(CharSequence charSequence) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(f0.Z(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static CharSequence c1(CharSequence charSequence) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        return new StringBuilder(charSequence).reverse();
    }

    public static char d1(CharSequence charSequence) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static String e1(String str, int i10) {
        kotlin.jvm.internal.s.h(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(0, yl.g.f(i10, str.length()));
            kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }
}
