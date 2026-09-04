package y3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class r extends j {
    public r() {
        super(true);
    }

    @Override // y3.p1
    public String b() {
        return "long[]";
    }

    @Override // y3.j
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public long[] k() {
        return new long[0];
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public long[] a(Bundle bundle, String key) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        Bundle bundleA = n4.c.a(bundle);
        if (!n4.c.b(bundleA, key) || n4.c.w(bundleA, key)) {
            return null;
        }
        return n4.c.m(bundleA, key);
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public long[] l(String value) {
        kotlin.jvm.internal.s.h(value, "value");
        return new long[]{((Number) p1.f57275h.l(value)).longValue()};
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public long[] g(String value, long[] jArr) {
        long[] jArrB;
        kotlin.jvm.internal.s.h(value, "value");
        return (jArr == null || (jArrB = gl.j.B(jArr, l(value))) == null) ? l(value) : jArrB;
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void h(Bundle bundle, String key, long[] jArr) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        Bundle bundleA = n4.k.a(bundle);
        if (jArr != null) {
            n4.k.j(bundleA, key, jArr);
        } else {
            n4.k.k(bundleA, key);
        }
    }

    @Override // y3.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public List l(long[] jArr) {
        List listW0;
        if (jArr == null || (listW0 = gl.j.w0(jArr)) == null) {
            return gl.r.l();
        }
        List list = listW0;
        ArrayList arrayList = new ArrayList(gl.r.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        return arrayList;
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean j(long[] jArr, long[] jArr2) {
        return gl.j.d(jArr != null ? gl.j.J(jArr) : null, jArr2 != null ? gl.j.J(jArr2) : null);
    }
}
