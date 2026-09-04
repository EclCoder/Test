package td;

import d1.f;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    public static final Object a(f fVar, f.a key, Object obj) {
        s.h(fVar, "<this>");
        s.h(key, "key");
        Object objB = fVar.b(key);
        return objB == null ? obj : objB;
    }
}
