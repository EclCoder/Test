package y3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h extends j {
    public h() {
        super(true);
    }

    @Override // y3.p1
    public String b() {
        return "List<Boolean>";
    }

    @Override // y3.j
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public List k() {
        return gl.r.l();
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public List a(Bundle bundle, String key) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        Bundle bundleA = n4.c.a(bundle);
        if (!n4.c.b(bundleA, key) || n4.c.w(bundleA, key)) {
            return null;
        }
        return gl.j.y0(n4.c.f(bundleA, key));
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public List l(String value) {
        kotlin.jvm.internal.s.h(value, "value");
        return gl.r.e(p1.f57281n.l(value));
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public List g(String value, List list) {
        List listS0;
        kotlin.jvm.internal.s.h(value, "value");
        return (list == null || (listS0 = gl.r.s0(list, l(value))) == null) ? l(value) : listS0;
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void h(Bundle bundle, String key, List list) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        Bundle bundleA = n4.k.a(bundle);
        if (list != null) {
            n4.k.d(bundleA, key, gl.r.C0(list));
        } else {
            n4.k.k(bundleA, key);
        }
    }

    @Override // y3.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public List l(List list) {
        if (list == null) {
            return gl.r.l();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(gl.r.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
        }
        return arrayList;
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean j(List list, List list2) {
        return gl.j.d(list != null ? (Boolean[]) list.toArray(new Boolean[0]) : null, list2 != null ? (Boolean[]) list2.toArray(new Boolean[0]) : null);
    }
}
