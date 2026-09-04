package um;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class l0 extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private kotlinx.serialization.json.i f54789g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(kotlinx.serialization.json.b json, Function1 nodeConsumer) {
        super(json, nodeConsumer, null);
        kotlin.jvm.internal.s.h(json, "json");
        kotlin.jvm.internal.s.h(nodeConsumer, "nodeConsumer");
        Z("primitive");
    }

    @Override // um.e
    public kotlinx.serialization.json.i s0() {
        kotlinx.serialization.json.i iVar = this.f54789g;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
    }

    @Override // um.e
    public void w0(String key, kotlinx.serialization.json.i element) {
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(element, "element");
        if (key != "primitive") {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
        }
        if (this.f54789g != null) {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        }
        this.f54789g = element;
        t0().invoke(element);
    }
}
