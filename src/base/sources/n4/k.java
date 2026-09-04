package n4;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static Bundle a(Bundle source) {
        s.h(source, "source");
        return source;
    }

    public static final void b(Bundle bundle, Bundle from) {
        s.h(from, "from");
        bundle.putAll(from);
    }

    public static final void c(Bundle bundle, String key, boolean z10) {
        s.h(key, "key");
        bundle.putBoolean(key, z10);
    }

    public static final void d(Bundle bundle, String key, boolean[] value) {
        s.h(key, "key");
        s.h(value, "value");
        bundle.putBooleanArray(key, value);
    }

    public static final void e(Bundle bundle, String key, float f10) {
        s.h(key, "key");
        bundle.putFloat(key, f10);
    }

    public static final void f(Bundle bundle, String key, float[] value) {
        s.h(key, "key");
        s.h(value, "value");
        bundle.putFloatArray(key, value);
    }

    public static final void g(Bundle bundle, String key, int i10) {
        s.h(key, "key");
        bundle.putInt(key, i10);
    }

    public static final void h(Bundle bundle, String key, int[] value) {
        s.h(key, "key");
        s.h(value, "value");
        bundle.putIntArray(key, value);
    }

    public static final void i(Bundle bundle, String key, long j10) {
        s.h(key, "key");
        bundle.putLong(key, j10);
    }

    public static final void j(Bundle bundle, String key, long[] value) {
        s.h(key, "key");
        s.h(value, "value");
        bundle.putLongArray(key, value);
    }

    public static final void k(Bundle bundle, String key) {
        s.h(key, "key");
        bundle.putString(key, null);
    }

    public static final void l(Bundle bundle, String key, Parcelable value) {
        s.h(key, "key");
        s.h(value, "value");
        bundle.putParcelable(key, value);
    }

    public static final void m(Bundle bundle, String key, List value) {
        s.h(key, "key");
        s.h(value, "value");
        bundle.putParcelableArrayList(key, l.a(value));
    }

    public static final void n(Bundle bundle, String key, Bundle value) {
        s.h(key, "key");
        s.h(value, "value");
        bundle.putBundle(key, value);
    }

    public static final void o(Bundle bundle, String key, List value) {
        s.h(key, "key");
        s.h(value, "value");
        m(bundle, key, value);
    }

    public static final void p(Bundle bundle, String key, String value) {
        s.h(key, "key");
        s.h(value, "value");
        bundle.putString(key, value);
    }

    public static final void q(Bundle bundle, String key, String[] value) {
        s.h(key, "key");
        s.h(value, "value");
        bundle.putStringArray(key, value);
    }

    public static final void r(Bundle bundle, String key, List value) {
        s.h(key, "key");
        s.h(value, "value");
        bundle.putStringArrayList(key, l.a(value));
    }

    public static final void s(Bundle bundle, String key) {
        s.h(key, "key");
        bundle.remove(key);
    }
}
