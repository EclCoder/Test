package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h0 f3575b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f3576a;

    static {
        h0 h0Var = new h0();
        f3575b = h0Var;
        h0Var.n();
    }

    private h0() {
        this.f3576a = true;
    }

    static int c(Map map) {
        int iG = 0;
        for (Map.Entry entry : map.entrySet()) {
            iG += g(entry.getValue()) ^ g(entry.getKey());
        }
        return iG;
    }

    private static int g(Object obj) {
        return obj instanceof byte[] ? x.d((byte[]) obj) : obj.hashCode();
    }

    private static void h(Map map) {
        for (Object obj : map.keySet()) {
            x.a(obj);
            x.a(map.get(obj));
        }
    }

    public static h0 i() {
        return f3575b;
    }

    private void j() {
        if (!m()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean k(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static boolean l(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !k(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        j();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && l(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return c(this);
    }

    public boolean m() {
        return this.f3576a;
    }

    public void n() {
        this.f3576a = false;
    }

    public void o(h0 h0Var) {
        j();
        if (h0Var.isEmpty()) {
            return;
        }
        putAll(h0Var);
    }

    public h0 p() {
        return isEmpty() ? new h0() : new h0(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        j();
        x.a(obj);
        x.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        j();
        h(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        j();
        return super.remove(obj);
    }

    private h0(Map map) {
        super(map);
        this.f3576a = true;
    }
}
