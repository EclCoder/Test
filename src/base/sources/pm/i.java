package pm;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i {
    public static final c a(tm.b bVar, sm.c decoder, String str) {
        kotlin.jvm.internal.s.h(bVar, "<this>");
        kotlin.jvm.internal.s.h(decoder, "decoder");
        c cVarC = bVar.c(decoder, str);
        if (cVarC != null) {
            return cVarC;
        }
        tm.c.a(str, bVar.e());
        throw new KotlinNothingValueException();
    }

    public static final l b(tm.b bVar, sm.f encoder, Object value) {
        kotlin.jvm.internal.s.h(bVar, "<this>");
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(value, "value");
        l lVarD = bVar.d(encoder, value);
        if (lVarD != null) {
            return lVarD;
        }
        tm.c.b(l0.b(value.getClass()), bVar.e());
        throw new KotlinNothingValueException();
    }
}
