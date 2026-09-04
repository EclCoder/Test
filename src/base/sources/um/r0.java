package um;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class r0 extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList f54815g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(kotlinx.serialization.json.b json, Function1 nodeConsumer) {
        super(json, nodeConsumer, null);
        kotlin.jvm.internal.s.h(json, "json");
        kotlin.jvm.internal.s.h(nodeConsumer, "nodeConsumer");
        this.f54815g = new ArrayList();
    }

    @Override // um.e, tm.n1
    protected String b0(rm.f descriptor, int i10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return String.valueOf(i10);
    }

    @Override // um.e
    public kotlinx.serialization.json.i s0() {
        return new kotlinx.serialization.json.c(this.f54815g);
    }

    @Override // um.e
    public void w0(String key, kotlinx.serialization.json.i element) {
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(element, "element");
        this.f54815g.add(Integer.parseInt(key), element);
    }
}
