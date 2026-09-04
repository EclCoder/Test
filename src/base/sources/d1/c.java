package d1;

import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import fl.q;
import gl.l0;
import gl.r;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f36092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f36093b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static final class a extends t implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f36094a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry entry) {
            s.h(entry, "entry");
            Object value = entry.getValue();
            return "  " + ((f.a) entry.getKey()).a() + " = " + (value instanceof byte[] ? gl.j.k0((byte[]) value, ", ", "[", "]", 0, null, null, 56, null) : String.valueOf(entry.getValue()));
        }
    }

    public /* synthetic */ c(Map map, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z10);
    }

    @Override // d1.f
    public Map a() {
        q qVar;
        Set<Map.Entry> setEntrySet = this.f36092a.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(yl.g.d(l0.e(r.v(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                s.g(bArrCopyOf, "copyOf(this, size)");
                qVar = new q(key, bArrCopyOf);
            } else {
                qVar = new q(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(qVar.h(), qVar.i());
        }
        return d1.a.b(linkedHashMap);
    }

    @Override // d1.f
    public Object b(f.a key) {
        s.h(key, "key");
        Object obj = this.f36092a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        s.g(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final void e() {
        if (this.f36093b.a()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    public boolean equals(Object obj) {
        boolean zC;
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Map map = cVar.f36092a;
        if (map == this.f36092a) {
            return true;
        }
        if (map.size() != this.f36092a.size()) {
            return false;
        }
        Map map2 = cVar.f36092a;
        if (map2.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : map2.entrySet()) {
            Object obj2 = this.f36092a.get(entry.getKey());
            if (obj2 != null) {
                Object value = entry.getValue();
                if (!(value instanceof byte[])) {
                    zC = s.c(value, obj2);
                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                    zC = true;
                } else {
                    zC = false;
                }
            } else {
                zC = false;
            }
            if (!zC) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        this.f36093b.b(true);
    }

    public final void g(f.b... pairs) {
        s.h(pairs, "pairs");
        e();
        if (pairs.length <= 0) {
            return;
        }
        f.b bVar = pairs[0];
        throw null;
    }

    public int hashCode() {
        Iterator it = this.f36092a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final void i(f.a key, Object obj) {
        s.h(key, "key");
        j(key, obj);
    }

    public final void j(f.a key, Object obj) {
        s.h(key, "key");
        e();
        if (obj == null) {
            h(key);
            return;
        }
        if (obj instanceof Set) {
            this.f36092a.put(key, d1.a.a((Set) obj));
            return;
        }
        if (!(obj instanceof byte[])) {
            this.f36092a.put(key, obj);
            return;
        }
        Map map = this.f36092a;
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        s.g(bArrCopyOf, "copyOf(this, size)");
        map.put(key, bArrCopyOf);
    }

    public String toString() {
        return r.l0(this.f36092a.entrySet(), ",\n", "{\n", "\n}", 0, null, a.f36094a, 24, null);
    }

    public final Object h(f.a aVar) {
        s.h(aVar, HqKnbV.KeuxuMLSSzlNk);
        e();
        return this.f36092a.remove(aVar);
    }

    public c(Map map, boolean z10) {
        s.h(map, qEagQqzJZsd.TUEYnxVnZN);
        this.f36092a = map;
        this.f36093b = new b(z10);
    }
}
