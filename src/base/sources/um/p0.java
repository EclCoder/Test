package um;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class p0 extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f54802g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(kotlinx.serialization.json.b json, Function1 nodeConsumer) {
        super(json, nodeConsumer, null);
        kotlin.jvm.internal.s.h(json, "json");
        kotlin.jvm.internal.s.h(nodeConsumer, "nodeConsumer");
        this.f54802g = new LinkedHashMap();
    }

    @Override // um.e
    public kotlinx.serialization.json.i s0() {
        return new kotlinx.serialization.json.d0(this.f54802g);
    }

    @Override // tm.z2, sm.d
    public void w(rm.f descriptor, int i10, pm.l serializer, Object obj) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        kotlin.jvm.internal.s.h(serializer, "serializer");
        if (obj != null || this.f54752d.j()) {
            super.w(descriptor, i10, serializer, obj);
        }
    }

    @Override // um.e
    public void w0(String key, kotlinx.serialization.json.i element) {
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(element, "element");
        this.f54802g.put(key, element);
    }

    protected final Map x0() {
        return this.f54802g;
    }
}
