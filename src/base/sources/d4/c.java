package d4;

import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import y3.d1;
import y3.g1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f36183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v0.c f36184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f36185c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f36186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private v0.c f36187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f36188c;

        public a(g1 navGraph) {
            s.h(navGraph, "navGraph");
            HashSet hashSet = new HashSet();
            this.f36186a = hashSet;
            hashSet.add(Integer.valueOf(g1.f57218i.d(navGraph).p()));
        }

        public final c a() {
            return new c(this.f36186a, this.f36187b, this.f36188c, null);
        }

        public final a b(b bVar) {
            this.f36188c = bVar;
            return this;
        }

        public final a c(v0.c cVar) {
            this.f36187b = cVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        boolean b();
    }

    public /* synthetic */ c(Set set, v0.c cVar, b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, cVar, bVar);
    }

    public final b a() {
        return this.f36185c;
    }

    public final v0.c b() {
        return this.f36184b;
    }

    public final boolean c(d1 destination) {
        s.h(destination, "destination");
        for (d1 d1Var : d1.f57171f.e(destination)) {
            if (this.f36183a.contains(Integer.valueOf(d1Var.p())) && (!(d1Var instanceof g1) || destination.p() == g1.f57218i.d((g1) d1Var).p())) {
                return true;
            }
        }
        return false;
    }

    private c(Set set, v0.c cVar, b bVar) {
        this.f36183a = set;
        this.f36184b = cVar;
        this.f36185c = bVar;
    }
}
