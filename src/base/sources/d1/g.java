package d1;

import java.util.Arrays;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final f a() {
        return new c(null, true, 1, null);
    }

    public static final c b(f.b... pairs) {
        s.h(pairs, "pairs");
        c cVar = new c(null, false, 1, null);
        cVar.g((f.b[]) Arrays.copyOf(pairs, pairs.length));
        return cVar;
    }
}
