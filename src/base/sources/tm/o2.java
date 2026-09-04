package tm;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class o2 extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zl.c f53547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rm.f f53548c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(zl.c kClass, pm.d eSerializer) {
        super(eSerializer, null);
        kotlin.jvm.internal.s.h(kClass, "kClass");
        kotlin.jvm.internal.s.h(eSerializer, "eSerializer");
        this.f53547b = kClass;
        this.f53548c = new d(eSerializer.getDescriptor());
    }

    @Override // tm.v, pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return this.f53548c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ArrayList a() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int b(ArrayList arrayList) {
        kotlin.jvm.internal.s.h(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void c(ArrayList arrayList, int i10) {
        kotlin.jvm.internal.s.h(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Iterator d(Object[] objArr) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        return kotlin.jvm.internal.c.a(objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public int e(Object[] objArr) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        return objArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.v
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(ArrayList arrayList, int i10, Object obj) {
        kotlin.jvm.internal.s.h(arrayList, "<this>");
        arrayList.add(i10, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList k(Object[] objArr) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        return new ArrayList(gl.j.e(objArr));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Object[] l(ArrayList arrayList) {
        kotlin.jvm.internal.s.h(arrayList, "<this>");
        return z1.q(arrayList, this.f53547b);
    }
}
