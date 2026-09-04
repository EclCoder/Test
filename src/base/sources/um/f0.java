package um;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tm.d0 f54763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f54764b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* synthetic */ class a extends kotlin.jvm.internal.p implements tl.o {
        a(Object obj) {
            super(2, obj, f0.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        public final Boolean b(rm.f p10, int i10) {
            kotlin.jvm.internal.s.h(p10, "p0");
            return Boolean.valueOf(((f0) this.receiver).e(p10, i10));
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((rm.f) obj, ((Number) obj2).intValue());
        }
    }

    public f0(rm.f descriptor) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        this.f54763a = new tm.d0(descriptor, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(rm.f fVar, int i10) {
        boolean z10 = !fVar.j(i10) && fVar.h(i10).b();
        this.f54764b = z10;
        return z10;
    }

    public final boolean b() {
        return this.f54764b;
    }

    public final void c(int i10) {
        this.f54763a.a(i10);
    }

    public final int d() {
        return this.f54763a.d();
    }
}
