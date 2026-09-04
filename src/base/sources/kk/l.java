package kk;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f43455c = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f43456d = Collections.unmodifiableSet(EnumSet.noneOf(a.class));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f43457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f43458b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        RECORD_EVENTS
    }

    protected l(n nVar, EnumSet enumSet) {
        this.f43457a = (n) jk.b.b(nVar, "context");
        Set setUnmodifiableSet = enumSet == null ? f43456d : Collections.unmodifiableSet(EnumSet.copyOf(enumSet));
        this.f43458b = setUnmodifiableSet;
        jk.b.a(!nVar.c().d() || setUnmodifiableSet.contains(a.RECORD_EVENTS), "Span is sampled, but does not have RECORD_EVENTS set.");
    }

    public final void a(String str) {
        jk.b.b(str, "description");
        b(str, f43455c);
    }

    public abstract void b(String str, Map map);

    public abstract void c(k kVar);

    public final void d() {
        e(j.f43451a);
    }

    public abstract void e(j jVar);

    public final n f() {
        return this.f43457a;
    }

    public abstract void g(String str, kk.a aVar);
}
