package um;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f54822c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(c0 writer, boolean z10) {
        super(writer);
        kotlin.jvm.internal.s.h(writer, "writer");
        this.f54822c = z10;
    }

    @Override // um.s
    public void n(String value) {
        kotlin.jvm.internal.s.h(value, "value");
        if (this.f54822c) {
            super.n(value);
        } else {
            super.k(value);
        }
    }
}
