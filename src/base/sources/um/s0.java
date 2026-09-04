package um;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class s0 extends o0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final kotlinx.serialization.json.d0 f54818k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f54819l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f54820m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f54821n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(kotlinx.serialization.json.b json, kotlinx.serialization.json.d0 value) {
        super(json, value, null, null, 12, null);
        kotlin.jvm.internal.s.h(json, "json");
        kotlin.jvm.internal.s.h(value, "value");
        this.f54818k = value;
        List listI0 = gl.r.I0(z0().keySet());
        this.f54819l = listI0;
        this.f54820m = listI0.size() * 2;
        this.f54821n = -1;
    }

    @Override // um.o0, um.c
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public kotlinx.serialization.json.d0 z0() {
        return this.f54818k;
    }

    @Override // um.o0, um.c, sm.c
    public void d(rm.f descriptor) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
    }

    @Override // um.o0, tm.m1
    protected String f0(rm.f descriptor, int i10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return (String) this.f54819l.get(i10 / 2);
    }

    @Override // um.o0, um.c
    protected kotlinx.serialization.json.i l0(String tag) {
        kotlin.jvm.internal.s.h(tag, "tag");
        return this.f54821n % 2 == 0 ? kotlinx.serialization.json.k.c(tag) : (kotlinx.serialization.json.i) gl.l0.i(z0(), tag);
    }

    @Override // um.o0, sm.c
    public int o(rm.f descriptor) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        int i10 = this.f54821n;
        if (i10 >= this.f54820m - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f54821n = i11;
        return i11;
    }
}
