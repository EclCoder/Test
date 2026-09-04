package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class MergedDataBinderMapper extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set f3434a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f3435b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f3436c = new CopyOnWriteArrayList();

    private boolean f() {
        boolean z10 = false;
        for (String str : this.f3436c) {
            try {
                Class<?> cls = Class.forName(str);
                if (e.class.isAssignableFrom(cls)) {
                    e((e) cls.newInstance());
                    this.f3436c.remove(str);
                    z10 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e10) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e10);
            } catch (InstantiationException e11) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e11);
            }
        }
        return z10;
    }

    @Override // androidx.databinding.e
    public p b(f fVar, View view, int i10) {
        Iterator it = this.f3435b.iterator();
        while (it.hasNext()) {
            p pVarB = ((e) it.next()).b(fVar, view, i10);
            if (pVarB != null) {
                return pVarB;
            }
        }
        if (f()) {
            return b(fVar, view, i10);
        }
        return null;
    }

    @Override // androidx.databinding.e
    public p c(f fVar, View[] viewArr, int i10) {
        Iterator it = this.f3435b.iterator();
        while (it.hasNext()) {
            p pVarC = ((e) it.next()).c(fVar, viewArr, i10);
            if (pVarC != null) {
                return pVarC;
            }
        }
        if (f()) {
            return c(fVar, viewArr, i10);
        }
        return null;
    }

    @Override // androidx.databinding.e
    public int d(String str) {
        Iterator it = this.f3435b.iterator();
        while (it.hasNext()) {
            int iD = ((e) it.next()).d(str);
            if (iD != 0) {
                return iD;
            }
        }
        if (f()) {
            return d(str);
        }
        return 0;
    }

    public void e(e eVar) {
        if (this.f3434a.add(eVar.getClass())) {
            this.f3435b.add(eVar);
            Iterator it = eVar.a().iterator();
            while (it.hasNext()) {
                e((e) it.next());
            }
        }
    }
}
