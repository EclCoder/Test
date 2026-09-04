package tm;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pm.d f53595a;

    public /* synthetic */ v(pm.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar);
    }

    @Override // tm.a
    protected final void g(sm.c decoder, Object obj, int i10, int i11) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            h(decoder, i10 + i12, obj, false);
        }
    }

    @Override // pm.d, pm.l, pm.c
    public abstract rm.f getDescriptor();

    @Override // tm.a
    protected void h(sm.c decoder, int i10, Object obj, boolean z10) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        n(obj, i10, sm.c.a.c(decoder, getDescriptor(), i10, this.f53595a, null, 8, null));
    }

    protected abstract void n(Object obj, int i10, Object obj2);

    @Override // pm.l
    public void serialize(sm.f encoder, Object obj) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        int iE = e(obj);
        rm.f descriptor = getDescriptor();
        sm.d dVarR = encoder.r(descriptor, iE);
        Iterator itD = d(obj);
        for (int i10 = 0; i10 < iE; i10++) {
            dVarR.A(getDescriptor(), i10, this.f53595a, itD.next());
        }
        dVarR.d(descriptor);
    }

    private v(pm.d dVar) {
        super(null);
        this.f53595a = dVar;
    }
}
