package um;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class t0 extends p0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f54823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f54824i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(kotlinx.serialization.json.b json, Function1 nodeConsumer) {
        super(json, nodeConsumer);
        kotlin.jvm.internal.s.h(json, "json");
        kotlin.jvm.internal.s.h(nodeConsumer, "nodeConsumer");
        this.f54824i = true;
    }

    @Override // um.p0, um.e
    public kotlinx.serialization.json.i s0() {
        return new kotlinx.serialization.json.d0(x0());
    }

    @Override // um.p0, um.e
    public void w0(String key, kotlinx.serialization.json.i element) {
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(element, "element");
        if (!this.f54824i) {
            Map mapX0 = x0();
            String str = this.f54823h;
            if (str == null) {
                kotlin.jvm.internal.s.w("tag");
                str = null;
            }
            mapX0.put(str, element);
            this.f54824i = true;
            return;
        }
        if (element instanceof kotlinx.serialization.json.g0) {
            this.f54823h = ((kotlinx.serialization.json.g0) element).a();
            this.f54824i = false;
        } else {
            if (element instanceof kotlinx.serialization.json.d0) {
                throw g0.d(kotlinx.serialization.json.f0.f43659a.getDescriptor());
            }
            if (!(element instanceof kotlinx.serialization.json.c)) {
                throw new NoWhenBranchMatchedException();
            }
            throw g0.d(kotlinx.serialization.json.d.f43635a.getDescriptor());
        }
    }
}
