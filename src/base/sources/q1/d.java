package q1;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a {
    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // q1.a
    public Object a(a.c key) {
        s.h(key, "key");
        return b().get(key);
    }

    public final void c(a.c key, Object obj) {
        s.h(key, "key");
        b().put(key, obj);
    }

    public d(Map initialExtras) {
        s.h(initialExtras, "initialExtras");
        b().putAll(initialExtras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(a initialExtras) {
        this(initialExtras.b());
        s.h(initialExtras, "initialExtras");
    }

    public /* synthetic */ d(a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? a.b.f50288c : aVar);
    }
}
