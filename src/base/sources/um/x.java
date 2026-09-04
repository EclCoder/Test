package um;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kotlinx.serialization.json.b f54843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f54844d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(c0 writer, kotlinx.serialization.json.b json) {
        super(writer);
        kotlin.jvm.internal.s.h(writer, "writer");
        kotlin.jvm.internal.s.h(json, "json");
        this.f54843c = json;
    }

    @Override // um.s
    public void b() {
        o(true);
        this.f54844d++;
    }

    @Override // um.s
    public void c() {
        o(false);
        k("\n");
        int i10 = this.f54844d;
        for (int i11 = 0; i11 < i10; i11++) {
            k(this.f54843c.e().n());
        }
    }

    @Override // um.s
    public void d() {
        if (a()) {
            o(false);
        } else {
            c();
        }
    }

    @Override // um.s
    public void p() {
        f(' ');
    }

    @Override // um.s
    public void q() {
        this.f54844d--;
    }
}
