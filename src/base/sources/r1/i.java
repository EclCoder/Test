package r1;

import androidx.lifecycle.p1;
import androidx.lifecycle.s1;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final p1 a(s1.c factory, zl.c modelClass, q1.a extras) {
        s.h(factory, "factory");
        s.h(modelClass, "modelClass");
        s.h(extras, "extras");
        try {
            try {
                return factory.c(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return factory.a(sl.a.a(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return factory.b(sl.a.a(modelClass), extras);
        }
    }
}
