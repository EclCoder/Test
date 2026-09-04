package ip;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static void a(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static CharSequence c(CharSequence charSequence, String str) {
        if (charSequence == null) {
            throw new IllegalArgumentException(str + " may not be null");
        }
        if (charSequence.length() == 0) {
            throw new IllegalArgumentException(str + " may not be empty");
        }
        if (!g.a(charSequence)) {
            return charSequence;
        }
        throw new IllegalArgumentException(str + " may not contain blanks");
    }

    public static CharSequence d(CharSequence charSequence, String str) {
        if (charSequence == null) {
            throw new IllegalArgumentException(str + " may not be null");
        }
        if (!g.b(charSequence)) {
            return charSequence;
        }
        throw new IllegalArgumentException(str + " may not be blank");
    }

    public static CharSequence e(CharSequence charSequence, String str) {
        if (charSequence == null) {
            throw new IllegalArgumentException(str + " may not be null");
        }
        if (!g.c(charSequence)) {
            return charSequence;
        }
        throw new IllegalArgumentException(str + " may not be empty");
    }

    public static Collection f(Collection collection, String str) {
        if (collection == null) {
            throw new IllegalArgumentException(str + " may not be null");
        }
        if (!collection.isEmpty()) {
            return collection;
        }
        throw new IllegalArgumentException(str + " may not be empty");
    }

    public static int g(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " may not be negative");
    }

    public static Object h(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException(str + " may not be null");
    }

    public static int i(int i10, String str) {
        if (i10 > 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " may not be negative or zero");
    }
}
