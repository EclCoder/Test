package n4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static Bundle a(Bundle source) {
        s.h(source, "source");
        return source;
    }

    public static final boolean b(Bundle bundle, String key) {
        s.h(key, "key");
        return bundle.containsKey(key);
    }

    public static final boolean c(Bundle bundle, Bundle other) {
        s.h(other, "other");
        return f.c(bundle, other);
    }

    public static final int d(Bundle bundle) {
        return f.d(bundle);
    }

    public static final boolean e(Bundle bundle, String key) {
        s.h(key, "key");
        boolean z10 = bundle.getBoolean(key, false);
        if (z10 || !bundle.getBoolean(key, true)) {
            return z10;
        }
        d.a(key);
        throw new KotlinNothingValueException();
    }

    public static final boolean[] f(Bundle bundle, String key) {
        s.h(key, "key");
        boolean[] booleanArray = bundle.getBooleanArray(key);
        if (booleanArray != null) {
            return booleanArray;
        }
        d.a(key);
        throw new KotlinNothingValueException();
    }

    public static final Boolean g(Bundle bundle, String key) {
        s.h(key, "key");
        boolean z10 = bundle.getBoolean(key, false);
        if (z10 || !bundle.getBoolean(key, true)) {
            return Boolean.valueOf(z10);
        }
        return null;
    }

    public static final float h(Bundle bundle, String key) {
        s.h(key, "key");
        float f10 = bundle.getFloat(key, Float.MIN_VALUE);
        if (f10 != Float.MIN_VALUE || bundle.getFloat(key, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return f10;
        }
        d.a(key);
        throw new KotlinNothingValueException();
    }

    public static final float[] i(Bundle bundle, String key) {
        s.h(key, "key");
        float[] floatArray = bundle.getFloatArray(key);
        if (floatArray != null) {
            return floatArray;
        }
        d.a(key);
        throw new KotlinNothingValueException();
    }

    public static final int j(Bundle bundle, String key) {
        s.h(key, "key");
        int i10 = bundle.getInt(key, Integer.MIN_VALUE);
        if (i10 != Integer.MIN_VALUE || bundle.getInt(key, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i10;
        }
        d.a(key);
        throw new KotlinNothingValueException();
    }

    public static final int[] k(Bundle bundle, String key) {
        s.h(key, "key");
        int[] intArray = bundle.getIntArray(key);
        if (intArray != null) {
            return intArray;
        }
        d.a(key);
        throw new KotlinNothingValueException();
    }

    public static final long l(Bundle bundle, String key) {
        s.h(key, "key");
        long j10 = bundle.getLong(key, Long.MIN_VALUE);
        if (j10 != Long.MIN_VALUE || bundle.getLong(key, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return j10;
        }
        d.a(key);
        throw new KotlinNothingValueException();
    }

    public static final long[] m(Bundle bundle, String key) {
        s.h(key, "key");
        long[] longArray = bundle.getLongArray(key);
        if (longArray != null) {
            return longArray;
        }
        d.a(key);
        throw new KotlinNothingValueException();
    }

    public static final List n(Bundle bundle, String key, zl.c parcelableClass) {
        s.h(key, "key");
        s.h(parcelableClass, "parcelableClass");
        ArrayList arrayListB = j0.d.b(bundle, key, sl.a.a(parcelableClass));
        if (arrayListB != null) {
            return arrayListB;
        }
        d.a(key);
        throw new KotlinNothingValueException();
    }

    public static final Bundle o(Bundle bundle, String key) {
        s.h(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        d.a(key);
        throw new KotlinNothingValueException();
    }

    public static final List p(Bundle bundle, String key) {
        s.h(key, "key");
        return n(bundle, key, l0.b(Bundle.class));
    }

    public static final Bundle q(Bundle bundle, String key) {
        s.h(key, "key");
        return bundle.getBundle(key);
    }

    public static final String r(Bundle bundle, String key) {
        s.h(key, "key");
        String string = bundle.getString(key);
        if (string != null) {
            return string;
        }
        d.a(key);
        throw new KotlinNothingValueException();
    }

    public static final String[] s(Bundle bundle, String key) {
        s.h(key, "key");
        String[] stringArray = bundle.getStringArray(key);
        if (stringArray != null) {
            return stringArray;
        }
        d.a(key);
        throw new KotlinNothingValueException();
    }

    public static final List t(Bundle bundle, String key) {
        s.h(key, "key");
        ArrayList<String> stringArrayList = bundle.getStringArrayList(key);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        d.a(key);
        throw new KotlinNothingValueException();
    }

    public static final List u(Bundle bundle, String key) {
        s.h(key, "key");
        return bundle.getStringArrayList(key);
    }

    public static final boolean v(Bundle bundle) {
        return bundle.isEmpty();
    }

    public static final boolean w(Bundle bundle, String key) {
        s.h(key, "key");
        return b(bundle, key) && bundle.get(key) == null;
    }

    public static final int x(Bundle bundle) {
        return bundle.size();
    }

    public static final Map y(Bundle bundle) {
        Map mapD = gl.l0.d(bundle.size());
        for (String str : bundle.keySet()) {
            s.e(str);
            mapD.put(str, bundle.get(str));
        }
        return gl.l0.b(mapD);
    }
}
