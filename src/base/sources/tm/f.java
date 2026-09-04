package tm;

import com.google.firebase.installations.ktx.gUsI.dmHT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rm.f f53471b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(pm.d element) {
        super(element);
        kotlin.jvm.internal.s.h(element, "element");
        this.f53471b = new e(element.getDescriptor());
    }

    @Override // tm.v, pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return this.f53471b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public ArrayList a() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(ArrayList arrayList) {
        kotlin.jvm.internal.s.h(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(ArrayList arrayList, int i10) {
        kotlin.jvm.internal.s.h(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
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
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public List l(ArrayList arrayList) {
        kotlin.jvm.internal.s.h(arrayList, "<this>");
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList k(List list) {
        kotlin.jvm.internal.s.h(list, dmHT.iCmV);
        ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList(list) : arrayList;
    }
}
