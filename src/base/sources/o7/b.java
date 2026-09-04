package o7;

import fl.w;
import gl.l0;
import gl.s0;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f48223m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map f48224n = l0.j(w.a("embedding.weight", "embed.weight"), w.a("dense1.weight", "fc1.weight"), w.a("dense2.weight", "fc2.weight"), w.a("dense3.weight", "fc3.weight"), w.a("dense1.bias", "fc1.bias"), w.a("dense2.bias", "fc2.bias"), w.a("dense3.bias", "fc3.bias"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o7.a f48225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o7.a f48226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o7.a f48227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o7.a f48228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o7.a f48229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o7.a f48230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o7.a f48231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o7.a f48232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final o7.a f48233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final o7.a f48234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final o7.a f48235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f48236l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map b(File file) {
            Map mapC = j.c(file);
            if (mapC == null) {
                return null;
            }
            HashMap map = new HashMap();
            Map mapA = b.a();
            for (Map.Entry entry : mapC.entrySet()) {
                String str = (String) entry.getKey();
                if (mapA.containsKey(entry.getKey()) && (str = (String) mapA.get(entry.getKey())) == null) {
                    return null;
                }
                map.put(str, entry.getValue());
            }
            return map;
        }

        public final b a(File file) {
            s.h(file, "file");
            Map mapB = b(file);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (mapB == null) {
                return null;
            }
            try {
                return new b(mapB, defaultConstructorMarker);
            } catch (Exception unused) {
                return null;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ b(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public static final /* synthetic */ Map a() {
        if (x7.a.c(b.class)) {
            return null;
        }
        try {
            return f48224n;
        } catch (Throwable th2) {
            x7.a.b(th2, b.class);
            return null;
        }
    }

    public final o7.a b(o7.a dense, String[] texts, String task) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            s.h(dense, "dense");
            s.h(texts, "texts");
            s.h(task, "task");
            o7.a aVarC = i.c(i.e(texts, 128, this.f48225a), this.f48226b);
            i.a(aVarC, this.f48229e);
            i.i(aVarC);
            o7.a aVarC2 = i.c(aVarC, this.f48227c);
            i.a(aVarC2, this.f48230f);
            i.i(aVarC2);
            o7.a aVarG = i.g(aVarC2, 2);
            o7.a aVarC3 = i.c(aVarG, this.f48228d);
            i.a(aVarC3, this.f48231g);
            i.i(aVarC3);
            o7.a aVarG2 = i.g(aVarC, aVarC.b(1));
            o7.a aVarG3 = i.g(aVarG, aVarG.b(1));
            o7.a aVarG4 = i.g(aVarC3, aVarC3.b(1));
            i.f(aVarG2, 1);
            i.f(aVarG3, 1);
            i.f(aVarG4, 1);
            o7.a aVarD = i.d(i.b(new o7.a[]{aVarG2, aVarG3, aVarG4, dense}), this.f48232h, this.f48234j);
            i.i(aVarD);
            o7.a aVarD2 = i.d(aVarD, this.f48233i, this.f48235k);
            i.i(aVarD2);
            o7.a aVar = (o7.a) this.f48236l.get(task + ".weight");
            o7.a aVar2 = (o7.a) this.f48236l.get(task + ".bias");
            if (aVar != null && aVar2 != null) {
                o7.a aVarD3 = i.d(aVarD2, aVar, aVar2);
                i.j(aVarD3);
                return aVarD3;
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private b(Map map) {
        Object obj = map.get("embed.weight");
        if (obj == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f48225a = (o7.a) obj;
        Object obj2 = map.get("convs.0.weight");
        if (obj2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f48226b = i.l((o7.a) obj2);
        Object obj3 = map.get("convs.1.weight");
        if (obj3 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f48227c = i.l((o7.a) obj3);
        Object obj4 = map.get("convs.2.weight");
        if (obj4 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f48228d = i.l((o7.a) obj4);
        Object obj5 = map.get("convs.0.bias");
        if (obj5 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f48229e = (o7.a) obj5;
        Object obj6 = map.get("convs.1.bias");
        if (obj6 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f48230f = (o7.a) obj6;
        Object obj7 = map.get("convs.2.bias");
        if (obj7 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f48231g = (o7.a) obj7;
        Object obj8 = map.get("fc1.weight");
        if (obj8 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f48232h = i.k((o7.a) obj8);
        Object obj9 = map.get("fc2.weight");
        if (obj9 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f48233i = i.k((o7.a) obj9);
        Object obj10 = map.get("fc1.bias");
        if (obj10 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f48234j = (o7.a) obj10;
        Object obj11 = map.get("fc2.bias");
        if (obj11 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f48235k = (o7.a) obj11;
        this.f48236l = new HashMap();
        for (String str : s0.h(f.a.MTML_INTEGRITY_DETECT.g(), f.a.MTML_APP_EVENT_PREDICTION.g())) {
            String str2 = str + ".weight";
            String str3 = str + ".bias";
            o7.a aVar = (o7.a) map.get(str2);
            o7.a aVar2 = (o7.a) map.get(str3);
            if (aVar != null) {
                this.f48236l.put(str2, i.k(aVar));
            }
            if (aVar2 != null) {
                this.f48236l.put(str3, aVar2);
            }
        }
    }
}
