package um;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class q0 extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final kotlinx.serialization.json.c f54806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f54807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f54808i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(kotlinx.serialization.json.b json, kotlinx.serialization.json.c value) {
        super(json, value, null, 4, null);
        kotlin.jvm.internal.s.h(json, "json");
        kotlin.jvm.internal.s.h(value, "value");
        this.f54806g = value;
        this.f54807h = z0().size();
        this.f54808i = -1;
    }

    @Override // um.c
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public kotlinx.serialization.json.c z0() {
        return this.f54806g;
    }

    @Override // tm.m1
    protected String f0(rm.f descriptor, int i10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return String.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // um.c
    public kotlinx.serialization.json.i l0(String tag) {
        kotlin.jvm.internal.s.h(tag, "tag");
        return z0().get(Integer.parseInt(tag));
    }

    @Override // sm.c
    public int o(rm.f descriptor) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        int i10 = this.f54808i;
        if (i10 >= this.f54807h - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f54808i = i11;
        return i11;
    }
}
