package y3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class o extends j {
    public o() {
        super(true);
    }

    @Override // y3.p1
    public String b() {
        return "integer[]";
    }

    @Override // y3.j
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public int[] k() {
        return new int[0];
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int[] a(Bundle bundle, String key) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        Bundle bundleA = n4.c.a(bundle);
        if (!n4.c.b(bundleA, key) || n4.c.w(bundleA, key)) {
            return null;
        }
        return n4.c.k(bundleA, key);
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int[] l(String value) {
        kotlin.jvm.internal.s.h(value, "value");
        return new int[]{((Number) p1.f57271d.l(value)).intValue()};
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int[] g(String value, int[] iArr) {
        int[] iArrA;
        kotlin.jvm.internal.s.h(value, "value");
        return (iArr == null || (iArrA = gl.j.A(iArr, l(value))) == null) ? l(value) : iArrA;
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void h(Bundle bundle, String key, int[] iArr) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        Bundle bundleA = n4.k.a(bundle);
        if (iArr != null) {
            n4.k.h(bundleA, key, iArr);
        } else {
            n4.k.k(bundleA, key);
        }
    }

    @Override // y3.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public List l(int[] iArr) {
        List listV0;
        if (iArr == null || (listV0 = gl.j.v0(iArr)) == null) {
            return gl.r.l();
        }
        List list = listV0;
        ArrayList arrayList = new ArrayList(gl.r.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean j(int[] iArr, int[] iArr2) {
        return gl.j.d(iArr != null ? gl.j.I(iArr) : null, iArr2 != null ? gl.j.I(iArr2) : null);
    }
}
