package kotlinx.serialization.json;

import java.io.InputStream;
import um.m0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k0 {
    public static final Object a(b bVar, pm.c deserializer, InputStream stream) {
        kotlin.jvm.internal.s.h(bVar, "<this>");
        kotlin.jvm.internal.s.h(deserializer, "deserializer");
        kotlin.jvm.internal.s.h(stream, "stream");
        um.d0 d0Var = new um.d0(stream);
        try {
            return m0.a(bVar, deserializer, d0Var);
        } finally {
            d0Var.b();
        }
    }
}
