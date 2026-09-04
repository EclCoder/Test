package jl;

import com.android.vending.billing.fTvD.qEagQqzJZsd;
import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static int a(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static int b(Object obj, Object obj2, Function1... selectors) {
        s.h(selectors, "selectors");
        if (selectors.length > 0) {
            return c(obj, obj2, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private static final int c(Object obj, Object obj2, Function1[] function1Arr) {
        for (Function1 function1 : function1Arr) {
            int iA = a((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
            if (iA != 0) {
                return iA;
            }
        }
        return 0;
    }

    public static Comparator d() {
        e eVar = e.f42632a;
        s.f(eVar, qEagQqzJZsd.qHNIOcWUV);
        return eVar;
    }
}
