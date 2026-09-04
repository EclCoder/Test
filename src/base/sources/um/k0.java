package um;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class k0 extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final kotlinx.serialization.json.i f54779g;

    public /* synthetic */ k0(kotlinx.serialization.json.b bVar, kotlinx.serialization.json.i iVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, iVar, (i10 & 4) != 0 ? null : str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // um.c
    public kotlinx.serialization.json.i l0(String tag) {
        kotlin.jvm.internal.s.h(tag, "tag");
        if (tag == "primitive") {
            return z0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // sm.c
    public int o(rm.f descriptor) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return 0;
    }

    @Override // um.c
    public kotlinx.serialization.json.i z0() {
        return this.f54779g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(kotlinx.serialization.json.b json, kotlinx.serialization.json.i value, String str) {
        super(json, value, str, null);
        kotlin.jvm.internal.s.h(json, "json");
        kotlin.jvm.internal.s.h(value, "value");
        this.f54779g = value;
        c0("primitive");
    }
}
