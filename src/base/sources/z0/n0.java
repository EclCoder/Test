package z0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements kl.j.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f58442c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f58443d = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f58444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f58445b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: z0.n0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0896a implements kl.j.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0896a f58446a = new C0896a();

            private C0896a() {
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public n0(n0 n0Var, j instance) {
        kotlin.jvm.internal.s.h(instance, "instance");
        this.f58444a = n0Var;
        this.f58445b = instance;
    }

    public final void b(h candidate) {
        kotlin.jvm.internal.s.h(candidate, "candidate");
        if (this.f58445b == candidate) {
            throw new IllegalStateException(f58443d.toString());
        }
        n0 n0Var = this.f58444a;
        if (n0Var != null) {
            n0Var.b(candidate);
        }
    }

    @Override // kl.j
    public Object fold(Object obj, tl.o oVar) {
        return kl.j.b.a.a(this, obj, oVar);
    }

    @Override // kl.j.b, kl.j
    public kl.j.b get(kl.j.c cVar) {
        return kl.j.b.a.b(this, cVar);
    }

    @Override // kl.j.b
    public kl.j.c getKey() {
        return a.C0896a.f58446a;
    }

    @Override // kl.j
    public kl.j minusKey(kl.j.c cVar) {
        return kl.j.b.a.c(this, cVar);
    }

    @Override // kl.j
    public kl.j plus(kl.j jVar) {
        return kl.j.b.a.d(this, jVar);
    }
}
