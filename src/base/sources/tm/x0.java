package tm;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class x0 implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pm.d f53607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pm.d f53608b;

    public /* synthetic */ x0(pm.d dVar, pm.d dVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, dVar2);
    }

    protected abstract Object a(Object obj);

    protected final pm.d b() {
        return this.f53607a;
    }

    protected abstract Object c(Object obj);

    protected final pm.d d() {
        return this.f53608b;
    }

    @Override // pm.c
    public Object deserialize(sm.e decoder) {
        Object objE;
        kotlin.jvm.internal.s.h(decoder, "decoder");
        rm.f descriptor = getDescriptor();
        sm.c cVarB = decoder.b(descriptor);
        if (cVarB.l()) {
            objE = e(sm.c.a.c(cVarB, getDescriptor(), 0, b(), null, 8, null), sm.c.a.c(cVarB, getDescriptor(), 1, d(), null, 8, null));
        } else {
            Object objC = c3.f53453a;
            Object objC2 = c3.f53453a;
            while (true) {
                int iO = cVarB.o(getDescriptor());
                if (iO == -1) {
                    if (objC == c3.f53453a) {
                        throw new SerializationException("Element 'key' is missing");
                    }
                    if (objC2 == c3.f53453a) {
                        throw new SerializationException("Element 'value' is missing");
                    }
                    objE = e(objC, objC2);
                    break;
                }
                if (iO == 0) {
                    objC = sm.c.a.c(cVarB, getDescriptor(), 0, b(), null, 8, null);
                } else {
                    if (iO != 1) {
                        throw new SerializationException("Invalid index: " + iO);
                    }
                    objC2 = sm.c.a.c(cVarB, getDescriptor(), 1, d(), null, 8, null);
                }
            }
        }
        cVarB.d(descriptor);
        return objE;
    }

    protected abstract Object e(Object obj, Object obj2);

    @Override // pm.l
    public void serialize(sm.f encoder, Object obj) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        sm.d dVarB = encoder.b(getDescriptor());
        dVarB.A(getDescriptor(), 0, this.f53607a, a(obj));
        dVarB.A(getDescriptor(), 1, this.f53608b, c(obj));
        dVarB.d(getDescriptor());
    }

    private x0(pm.d dVar, pm.d dVar2) {
        this.f53607a = dVar;
        this.f53608b = dVar2;
    }
}
