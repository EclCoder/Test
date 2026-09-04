package wm;

import android.text.TextUtils;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    public static void a(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void b(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static Collection c(Collection collection, Object obj) {
        f(collection, obj);
        a(!collection.isEmpty(), obj);
        return collection;
    }

    public static String d(String str, Object obj) {
        f(str, obj);
        a(!TextUtils.isEmpty(str), obj);
        return str;
    }

    public static Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object f(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static String g(String str, Object obj) {
        if (str != null) {
            d(str, obj);
        }
        return str;
    }
}
