package f6;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class s implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f38289a = Collections.newSetFromMap(new WeakHashMap());

    public void i() {
        this.f38289a.clear();
    }

    public List j() {
        return m6.l.j(this.f38289a);
    }

    public void k(j6.i iVar) {
        this.f38289a.add(iVar);
    }

    public void l(j6.i iVar) {
        this.f38289a.remove(iVar);
    }

    @Override // f6.l
    public void onDestroy() {
        Iterator it = m6.l.j(this.f38289a).iterator();
        while (it.hasNext()) {
            ((j6.i) it.next()).onDestroy();
        }
    }

    @Override // f6.l
    public void onStart() {
        Iterator it = m6.l.j(this.f38289a).iterator();
        while (it.hasNext()) {
            ((j6.i) it.next()).onStart();
        }
    }

    @Override // f6.l
    public void onStop() {
        Iterator it = m6.l.j(this.f38289a).iterator();
        while (it.hasNext()) {
            ((j6.i) it.next()).onStop();
        }
    }
}
