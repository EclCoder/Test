package tm;

import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rm.f f53553b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(pm.d eSerializer) {
        super(eSerializer);
        kotlin.jvm.internal.s.h(eSerializer, "eSerializer");
        this.f53553b = new o0(eSerializer.getDescriptor());
    }

    @Override // tm.v, pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return this.f53553b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public HashSet a() {
        return new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(HashSet hashSet) {
        kotlin.jvm.internal.s.h(hashSet, "<this>");
        return hashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(HashSet hashSet, int i10) {
        kotlin.jvm.internal.s.h(hashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.v
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(HashSet hashSet, int i10, Object obj) {
        kotlin.jvm.internal.s.h(hashSet, "<this>");
        hashSet.add(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Set l(HashSet hashSet) {
        kotlin.jvm.internal.s.h(hashSet, "<this>");
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public HashSet k(Set set) {
        kotlin.jvm.internal.s.h(set, PvZsvNiPV.TuV);
        HashSet hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet(set) : hashSet;
    }
}
