package tm;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements pm.d {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void i(a aVar, sm.c cVar, int i10, Object obj, boolean z10, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        aVar.h(cVar, i10, obj, z10);
    }

    private final int j(sm.c cVar, Object obj) {
        int iM = cVar.m(getDescriptor());
        c(obj, iM);
        return iM;
    }

    protected abstract Object a();

    protected abstract int b(Object obj);

    protected abstract void c(Object obj, int i10);

    protected abstract Iterator d(Object obj);

    @Override // pm.c
    public Object deserialize(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        return f(decoder, null);
    }

    protected abstract int e(Object obj);

    public final Object f(sm.e decoder, Object obj) {
        Object objA;
        kotlin.jvm.internal.s.h(decoder, "decoder");
        if (obj == null || (objA = k(obj)) == null) {
            objA = a();
        }
        Object obj2 = objA;
        int iB = b(obj2);
        sm.c cVarB = decoder.b(getDescriptor());
        if (!cVarB.l()) {
            while (true) {
                int iO = cVarB.o(getDescriptor());
                if (iO == -1) {
                    break;
                }
                i(this, cVarB, iB + iO, obj2, false, 8, null);
            }
        } else {
            g(cVarB, obj2, iB, j(cVarB, obj2));
        }
        cVarB.d(getDescriptor());
        return l(obj2);
    }

    protected abstract void g(sm.c cVar, Object obj, int i10, int i11);

    protected abstract void h(sm.c cVar, int i10, Object obj, boolean z10);

    protected abstract Object k(Object obj);

    protected abstract Object l(Object obj);

    private a() {
    }
}
