package tm;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b1 extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rm.f f53443b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(pm.d eSerializer) {
        super(eSerializer);
        kotlin.jvm.internal.s.h(eSerializer, "eSerializer");
        this.f53443b = new a1(eSerializer.getDescriptor());
    }

    @Override // tm.v, pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return this.f53443b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet a() {
        return new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(LinkedHashSet linkedHashSet) {
        kotlin.jvm.internal.s.h(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(LinkedHashSet linkedHashSet, int i10) {
        kotlin.jvm.internal.s.h(linkedHashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.v
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(LinkedHashSet linkedHashSet, int i10, Object obj) {
        kotlin.jvm.internal.s.h(linkedHashSet, "<this>");
        linkedHashSet.add(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet k(Set set) {
        kotlin.jvm.internal.s.h(set, "<this>");
        LinkedHashSet linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet(set) : linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Set l(LinkedHashSet linkedHashSet) {
        kotlin.jvm.internal.s.h(linkedHashSet, "<this>");
        return linkedHashSet;
    }
}
