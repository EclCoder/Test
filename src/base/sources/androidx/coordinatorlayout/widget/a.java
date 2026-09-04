package androidx.coordinatorlayout.widget;

import androidx.collection.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import m0.d;
import m0.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f3192a = new e(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f3193b = new u();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f3194c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet f3195d = new HashSet();

    private void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f3193b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                e(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    private ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f3192a.b();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    private void k(ArrayList arrayList) {
        arrayList.clear();
        this.f3192a.a(arrayList);
    }

    public void a(Object obj, Object obj2) {
        if (!this.f3193b.containsKey(obj) || !this.f3193b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayListF = (ArrayList) this.f3193b.get(obj);
        if (arrayListF == null) {
            arrayListF = f();
            this.f3193b.put(obj, arrayListF);
        }
        arrayListF.add(obj2);
    }

    public void b(Object obj) {
        if (this.f3193b.containsKey(obj)) {
            return;
        }
        this.f3193b.put(obj, null);
    }

    public void c() {
        int size = this.f3193b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f3193b.m(i10);
            if (arrayList != null) {
                k(arrayList);
            }
        }
        this.f3193b.clear();
    }

    public boolean d(Object obj) {
        return this.f3193b.containsKey(obj);
    }

    public List g(Object obj) {
        return (List) this.f3193b.get(obj);
    }

    public List h(Object obj) {
        int size = this.f3193b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = (ArrayList) this.f3193b.m(i10);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f3193b.i(i10));
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        this.f3194c.clear();
        this.f3195d.clear();
        int size = this.f3193b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f3193b.i(i10), this.f3194c, this.f3195d);
        }
        return this.f3194c;
    }

    public boolean j(Object obj) {
        int size = this.f3193b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f3193b.m(i10);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
