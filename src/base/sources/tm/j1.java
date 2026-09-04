package tm;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j1 extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pm.d f53521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pm.d f53522b;

    public /* synthetic */ j1(pm.d dVar, pm.d dVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, dVar2);
    }

    @Override // pm.d, pm.l, pm.c
    public abstract rm.f getDescriptor();

    public final pm.d m() {
        return this.f53521a;
    }

    public final pm.d n() {
        return this.f53522b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void g(sm.c decoder, Map builder, int i10, int i11) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        kotlin.jvm.internal.s.h(builder, "builder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        yl.d dVarL = yl.g.l(yl.g.m(0, i11 * 2), 2);
        int iA = dVarL.a();
        int iB = dVarL.b();
        int iD = dVarL.d();
        if ((iD <= 0 || iA > iB) && (iD >= 0 || iB > iA)) {
            return;
        }
        while (true) {
            h(decoder, i10 + iA, builder, false);
            if (iA == iB) {
                return;
            } else {
                iA += iD;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void h(sm.c decoder, int i10, Map builder, boolean z10) {
        int iO;
        kotlin.jvm.internal.s.h(decoder, "decoder");
        kotlin.jvm.internal.s.h(builder, "builder");
        Object objC = sm.c.a.c(decoder, getDescriptor(), i10, this.f53521a, null, 8, null);
        if (z10) {
            iO = decoder.o(getDescriptor());
            if (iO != i10 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i10 + ", returned index for value: " + iO).toString());
            }
        } else {
            iO = i10 + 1;
        }
        int i11 = iO;
        builder.put(objC, (!builder.containsKey(objC) || (this.f53522b.getDescriptor().d() instanceof rm.e)) ? sm.c.a.c(decoder, getDescriptor(), i11, this.f53522b, null, 8, null) : decoder.n(getDescriptor(), i11, this.f53522b, gl.l0.i(builder, objC)));
    }

    @Override // pm.l
    public void serialize(sm.f encoder, Object obj) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        int iE = e(obj);
        rm.f descriptor = getDescriptor();
        sm.d dVarR = encoder.r(descriptor, iE);
        Iterator itD = d(obj);
        int i10 = 0;
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i11 = i10 + 1;
            dVarR.A(getDescriptor(), i10, m(), key);
            i10 += 2;
            dVarR.A(getDescriptor(), i11, n(), value);
        }
        dVarR.d(descriptor);
    }

    private j1(pm.d dVar, pm.d dVar2) {
        super(null);
        this.f53521a = dVar;
        this.f53522b = dVar2;
    }
}
