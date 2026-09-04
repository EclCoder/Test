package y3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends j {
    public f2() {
        super(true);
    }

    @Override // y3.p1
    public String b() {
        return "string[]";
    }

    @Override // y3.j
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public String[] k() {
        return new String[0];
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public String[] a(Bundle bundle, String key) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        Bundle bundleA = n4.c.a(bundle);
        if (!n4.c.b(bundleA, key) || n4.c.w(bundleA, key)) {
            return null;
        }
        return n4.c.s(bundleA, key);
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public String[] l(String value) {
        kotlin.jvm.internal.s.h(value, "value");
        return new String[]{value};
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public String[] g(String value, String[] strArr) {
        String[] strArr2;
        kotlin.jvm.internal.s.h(value, "value");
        return (strArr == null || (strArr2 = (String[]) gl.j.C(strArr, l(value))) == null) ? l(value) : strArr2;
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void h(Bundle bundle, String key, String[] strArr) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        Bundle bundleA = n4.k.a(bundle);
        if (strArr != null) {
            n4.k.q(bundleA, key, strArr);
        } else {
            n4.k.k(bundleA, key);
        }
    }

    @Override // y3.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public List l(String[] strArr) {
        if (strArr == null) {
            return gl.r.l();
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(s1.c(s1.f57297a, str, null, 2, null));
        }
        return arrayList;
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean j(String[] strArr, String[] strArr2) {
        return gl.j.d(strArr, strArr2);
    }
}
