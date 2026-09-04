package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SparseIntArray f3129a = new SparseIntArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap f3130b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
    }

    public void a(int i10, a aVar) {
        HashSet hashSet = (HashSet) this.f3130b.get(Integer.valueOf(i10));
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f3130b.put(Integer.valueOf(i10), hashSet);
        }
        hashSet.add(new WeakReference(aVar));
    }

    public void b(int i10, a aVar) {
        HashSet<WeakReference> hashSet = (HashSet) this.f3130b.get(Integer.valueOf(i10));
        if (hashSet == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (WeakReference weakReference : hashSet) {
            a aVar2 = (a) weakReference.get();
            if (aVar2 == null || aVar2 == aVar) {
                arrayList.add(weakReference);
            }
        }
        hashSet.removeAll(arrayList);
    }
}
