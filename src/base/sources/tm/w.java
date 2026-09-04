package tm;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w extends v {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(pm.d element) {
        super(element, null);
        kotlin.jvm.internal.s.h(element, "element");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Iterator d(Collection collection) {
        kotlin.jvm.internal.s.h(collection, "<this>");
        return collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int e(Collection collection) {
        kotlin.jvm.internal.s.h(collection, "<this>");
        return collection.size();
    }
}
