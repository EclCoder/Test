package gm;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    public static final g a(int i10, a aVar, Function1 function1) {
        if (i10 == -2) {
            return aVar == a.SUSPEND ? new e(g.f39387y2.a(), function1) : new p(1, aVar, function1);
        }
        if (i10 == -1) {
            if (aVar == a.SUSPEND) {
                return new p(1, a.DROP_OLDEST, function1);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == 0) {
            return aVar == a.SUSPEND ? new e(0, function1) : new p(1, aVar, function1);
        }
        if (i10 != Integer.MAX_VALUE) {
            return aVar == a.SUSPEND ? new e(i10, function1) : new p(i10, aVar, function1);
        }
        return new e(Integer.MAX_VALUE, function1);
    }

    public static /* synthetic */ g b(int i10, a aVar, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        return a(i10, aVar, function1);
    }
}
