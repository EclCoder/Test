package tm;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l2 extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rm.f f53533b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(pm.d primitiveSerializer) {
        super(primitiveSerializer, null);
        kotlin.jvm.internal.s.h(primitiveSerializer, "primitiveSerializer");
        this.f53533b = new k2(primitiveSerializer.getDescriptor());
    }

    @Override // tm.a
    protected final Iterator d(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // tm.a, pm.c
    public final Object deserialize(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        return f(decoder, null);
    }

    @Override // tm.v, pm.d, pm.l, pm.c
    public final rm.f getDescriptor() {
        return this.f53533b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final j2 a() {
        return (j2) k(r());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int b(j2 j2Var) {
        kotlin.jvm.internal.s.h(j2Var, "<this>");
        return j2Var.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void c(j2 j2Var, int i10) {
        kotlin.jvm.internal.s.h(j2Var, "<this>");
        j2Var.b(i10);
    }

    protected abstract Object r();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.v
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void n(j2 j2Var, int i10, Object obj) {
        kotlin.jvm.internal.s.h(j2Var, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // tm.v, pm.l
    public final void serialize(sm.f encoder, Object obj) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        int iE = e(obj);
        rm.f fVar = this.f53533b;
        sm.d dVarR = encoder.r(fVar, iE);
        u(dVarR, obj, iE);
        dVarR.d(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final Object l(j2 j2Var) {
        kotlin.jvm.internal.s.h(j2Var, "<this>");
        return j2Var.a();
    }

    protected abstract void u(sm.d dVar, Object obj, int i10);
}
