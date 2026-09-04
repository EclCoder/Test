package kk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f43469c = b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f43470d = a.OK.d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f43471e = a.CANCELLED.d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p f43472f = a.UNKNOWN.d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p f43473g = a.INVALID_ARGUMENT.d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p f43474h = a.DEADLINE_EXCEEDED.d();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p f43475i = a.NOT_FOUND.d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p f43476j = a.ALREADY_EXISTS.d();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p f43477k = a.PERMISSION_DENIED.d();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p f43478l = a.f43505r.d();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p f43479m = a.RESOURCE_EXHAUSTED.d();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p f43480n = a.FAILED_PRECONDITION.d();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p f43481o = a.ABORTED.d();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p f43482p = a.OUT_OF_RANGE.d();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final p f43483q = a.UNIMPLEMENTED.d();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final p f43484r = a.INTERNAL.d();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p f43485s = a.UNAVAILABLE.d();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p f43486t = a.DATA_LOSS.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f43487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43488b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    public enum a {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        f43505r(16);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f43507a;

        a(int i10) {
            this.f43507a = i10;
        }

        public p d() {
            return (p) p.f43469c.get(this.f43507a);
        }

        public int g() {
            return this.f43507a;
        }
    }

    private p(a aVar, String str) {
        this.f43487a = (a) jk.b.b(aVar, "canonicalCode");
        this.f43488b = str;
    }

    private static List b() {
        TreeMap treeMap = new TreeMap();
        for (a aVar : a.values()) {
            p pVar = (p) treeMap.put(Integer.valueOf(aVar.g()), new p(aVar, null));
            if (pVar != null) {
                throw new IllegalStateException("Code value duplication between " + pVar.c().name() + " & " + aVar.name());
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    public a c() {
        return this.f43487a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f43487a == pVar.f43487a && jk.b.d(this.f43488b, pVar.f43488b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f43487a, this.f43488b});
    }

    public String toString() {
        return "Status{canonicalCode=" + this.f43487a + ", description=" + this.f43488b + "}";
    }
}
