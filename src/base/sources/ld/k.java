package ld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f44354a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f44355b;

    public k(int i10) {
        this.f44355b = i10;
    }

    public List a() {
        List listB = b();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < listB.size(); i10++) {
            arrayList.add(((j) listB.get(i10)).h());
        }
        return arrayList;
    }

    public synchronized List b() {
        return Collections.unmodifiableList(new ArrayList(this.f44354a));
    }

    public synchronized boolean c(List list) {
        this.f44354a.clear();
        if (list.size() <= this.f44355b) {
            return this.f44354a.addAll(list);
        }
        gd.g.f().k("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f44355b);
        return this.f44354a.addAll(list.subList(0, this.f44355b));
    }
}
