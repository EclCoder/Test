package tm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rm.f f53541c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(pm.d kSerializer, pm.d vSerializer) {
        super(kSerializer, vSerializer, null);
        kotlin.jvm.internal.s.h(kSerializer, "kSerializer");
        kotlin.jvm.internal.s.h(vSerializer, "vSerializer");
        this.f53541c = new m0(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // tm.j1, pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return this.f53541c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public HashMap a() {
        return new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(HashMap map) {
        kotlin.jvm.internal.s.h(map, "<this>");
        return map.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(HashMap map, int i10) {
        kotlin.jvm.internal.s.h(map, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Iterator d(Map map) {
        kotlin.jvm.internal.s.h(map, "<this>");
        return map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int e(Map map) {
        kotlin.jvm.internal.s.h(map, "<this>");
        return map.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public HashMap k(Map map) {
        kotlin.jvm.internal.s.h(map, "<this>");
        HashMap map2 = map instanceof HashMap ? (HashMap) map : null;
        return map2 == null ? new HashMap(map) : map2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map l(HashMap map) {
        kotlin.jvm.internal.s.h(map, "<this>");
        return map;
    }
}
