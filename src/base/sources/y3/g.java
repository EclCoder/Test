package y3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g extends j {
    public g() {
        super(true);
    }

    @Override // y3.p1
    public String b() {
        return "boolean[]";
    }

    @Override // y3.j
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public boolean[] k() {
        return new boolean[0];
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public boolean[] a(Bundle bundle, String key) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        Bundle bundleA = n4.c.a(bundle);
        if (!n4.c.b(bundleA, key) || n4.c.w(bundleA, key)) {
            return null;
        }
        return n4.c.f(bundleA, key);
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean[] l(String value) {
        kotlin.jvm.internal.s.h(value, "value");
        return new boolean[]{((Boolean) p1.f57281n.l(value)).booleanValue()};
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean[] g(String value, boolean[] zArr) {
        boolean[] zArrD;
        kotlin.jvm.internal.s.h(value, "value");
        return (zArr == null || (zArrD = gl.j.D(zArr, l(value))) == null) ? l(value) : zArrD;
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void h(Bundle bundle, String key, boolean[] zArr) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        Bundle bundleA = n4.k.a(bundle);
        if (zArr != null) {
            n4.k.d(bundleA, key, zArr);
        } else {
            n4.k.k(bundleA, key);
        }
    }

    @Override // y3.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public List l(boolean[] zArr) {
        List listY0;
        if (zArr == null || (listY0 = gl.j.y0(zArr)) == null) {
            return gl.r.l();
        }
        List list = listY0;
        ArrayList arrayList = new ArrayList(gl.r.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
        }
        return arrayList;
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean j(boolean[] zArr, boolean[] zArr2) {
        return gl.j.d(zArr != null ? gl.j.G(zArr) : null, zArr2 != null ? gl.j.G(zArr2) : null);
    }
}
