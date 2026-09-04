package o1;

import android.os.Bundle;
import fl.q;
import gl.l0;
import hm.w;
import j0.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import n4.g;
import n4.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f47956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f47957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f47958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f47959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g.b f47960e;

    public b(Map initialState) {
        s.h(initialState, "initialState");
        this.f47956a = l0.v(initialState);
        this.f47957b = new LinkedHashMap();
        this.f47958c = new LinkedHashMap();
        this.f47959d = new LinkedHashMap();
        this.f47960e = new g.b() { // from class: o1.a
            @Override // n4.g.b
            public final Bundle a() {
                return b.g(this.f47955a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle g(b bVar) {
        q[] qVarArr;
        for (Map.Entry entry : l0.t(bVar.f47959d).entrySet()) {
            bVar.h((String) entry.getKey(), ((w) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : l0.t(bVar.f47957b).entrySet()) {
            bVar.h((String) entry2.getKey(), ((g.b) entry2.getValue()).a());
        }
        Map map = bVar.f47956a;
        if (map.isEmpty()) {
            qVarArr = new q[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry3 : map.entrySet()) {
                arrayList.add(fl.w.a((String) entry3.getKey(), entry3.getValue()));
            }
            qVarArr = (q[]) arrayList.toArray(new q[0]);
        }
        Bundle bundleA = e.a((q[]) Arrays.copyOf(qVarArr, qVarArr.length));
        k.a(bundleA);
        return bundleA;
    }

    public final Object b(String key) {
        Object value;
        s.h(key, "key");
        try {
            w wVar = (w) this.f47959d.get(key);
            if (wVar != null && (value = wVar.getValue()) != null) {
                return value;
            }
            return this.f47956a.get(key);
        } catch (ClassCastException unused) {
            f(key);
            return null;
        }
    }

    public final Map c() {
        return this.f47959d;
    }

    public final Map d() {
        return this.f47956a;
    }

    public final g.b e() {
        return this.f47960e;
    }

    public final Object f(String key) {
        s.h(key, "key");
        Object objRemove = this.f47956a.remove(key);
        this.f47958c.remove(key);
        this.f47959d.remove(key);
        return objRemove;
    }

    public final void h(String key, Object obj) {
        s.h(key, "key");
        this.f47956a.put(key, obj);
        w wVar = (w) this.f47958c.get(key);
        if (wVar != null) {
            wVar.setValue(obj);
        }
        w wVar2 = (w) this.f47959d.get(key);
        if (wVar2 != null) {
            wVar2.setValue(obj);
        }
    }

    public /* synthetic */ b(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? l0.h() : map);
    }
}
