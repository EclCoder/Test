package a2;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f96c = new f(Collections.EMPTY_MAP);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f97a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f98b;

    public f(Map map) {
        this.f98b = Collections.unmodifiableMap(map);
    }

    private static void c(HashMap map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), g(entry.getValue()));
        }
    }

    private static Map d(Map map, e eVar) {
        HashMap map2 = new HashMap(map);
        i(map2, eVar.c());
        c(map2, eVar.b());
        return map2;
    }

    private static byte[] g(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(sc.e.f52294c);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    private static boolean h(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private static void i(HashMap map, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.remove(list.get(i10));
        }
    }

    public f e(e eVar) {
        Map mapD = d(this.f98b, eVar);
        return h(this.f98b, mapD) ? this : new f(mapD);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        return h(this.f98b, ((f) obj).f98b);
    }

    public Set f() {
        return this.f98b.entrySet();
    }

    @Override // a2.d
    public final String get(String str, String str2) {
        byte[] bArr = (byte[]) this.f98b.get(str);
        return bArr != null ? new String(bArr, sc.e.f52294c) : str2;
    }

    public int hashCode() {
        if (this.f97a == 0) {
            int iHashCode = 0;
            for (Map.Entry entry : this.f98b.entrySet()) {
                iHashCode += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.f97a = iHashCode;
        }
        return this.f97a;
    }

    @Override // a2.d
    public final long get(String str, long j10) {
        byte[] bArr = (byte[]) this.f98b.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j10;
    }
}
