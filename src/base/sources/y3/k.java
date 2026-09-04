package y3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class k extends j {
    public k() {
        super(true);
    }

    @Override // y3.p1
    public String b() {
        return "float[]";
    }

    @Override // y3.j
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public float[] k() {
        return new float[0];
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public float[] a(Bundle bundle, String key) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        Bundle bundleA = n4.c.a(bundle);
        if (!n4.c.b(bundleA, key) || n4.c.w(bundleA, key)) {
            return null;
        }
        return n4.c.i(bundleA, key);
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public float[] l(String value) {
        kotlin.jvm.internal.s.h(value, "value");
        return new float[]{((Number) p1.f57278k.l(value)).floatValue()};
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public float[] g(String value, float[] fArr) {
        float[] fArrZ;
        kotlin.jvm.internal.s.h(value, "value");
        return (fArr == null || (fArrZ = gl.j.z(fArr, l(value))) == null) ? l(value) : fArrZ;
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void h(Bundle bundle, String key, float[] fArr) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        Bundle bundleA = n4.k.a(bundle);
        if (fArr != null) {
            n4.k.f(bundleA, key, fArr);
        } else {
            n4.k.k(bundleA, key);
        }
    }

    @Override // y3.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public List l(float[] fArr) {
        List listU0;
        if (fArr == null || (listU0 = gl.j.u0(fArr)) == null) {
            return gl.r.l();
        }
        List list = listU0;
        ArrayList arrayList = new ArrayList(gl.r.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
        }
        return arrayList;
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean j(float[] fArr, float[] fArr2) {
        return gl.j.d(fArr != null ? gl.j.H(fArr) : null, fArr2 != null ? gl.j.H(fArr2) : null);
    }
}
