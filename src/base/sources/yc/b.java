package yc;

import android.content.Context;
import com.google.firebase.abt.AbtException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ce.b f57483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f57484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f57485c = null;

    public b(Context context, ce.b bVar, String str) {
        this.f57483a = bVar;
        this.f57484b = str;
    }

    private void a(bd.a.c cVar) {
        ((bd.a) this.f57483a.get()).a(cVar);
    }

    private void b(List list) {
        ArrayDeque arrayDeque = new ArrayDeque(f());
        int i10 = i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            while (arrayDeque.size() >= i10) {
                k(((bd.a.c) arrayDeque.pollFirst()).f8827b);
            }
            bd.a.c cVarF = aVar.f(this.f57484b);
            a(cVarF);
            arrayDeque.offer(cVarF);
        }
    }

    private static List c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a.b((Map) it.next()));
        }
        return arrayList;
    }

    private boolean d(List list, a aVar) {
        String strC = aVar.c();
        String strE = aVar.e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (aVar2.c().equals(strC) && aVar2.e().equals(strE)) {
                return true;
            }
        }
        return false;
    }

    private List f() {
        return ((bd.a) this.f57483a.get()).f(this.f57484b, "");
    }

    private ArrayList g(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!d(list2, aVar)) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    private ArrayList h(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!d(list2, aVar)) {
                arrayList.add(aVar.f(this.f57484b));
            }
        }
        return arrayList;
    }

    private int i() {
        if (this.f57485c == null) {
            this.f57485c = Integer.valueOf(((bd.a) this.f57483a.get()).e(this.f57484b));
        }
        return this.f57485c.intValue();
    }

    private void k(String str) {
        ((bd.a) this.f57483a.get()).clearConditionalUserProperty(str, null, null);
    }

    private void l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            k(((bd.a.c) it.next()).f8827b);
        }
    }

    private void n(List list) throws AbtException {
        if (list.isEmpty()) {
            j();
            return;
        }
        List listE = e();
        l(h(listE, list));
        b(g(list, listE));
    }

    private void o() throws AbtException {
        if (this.f57483a.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    public List e() throws AbtException {
        o();
        List listF = f();
        ArrayList arrayList = new ArrayList();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(a.a((bd.a.c) it.next()));
        }
        return arrayList;
    }

    public void j() throws AbtException {
        o();
        l(f());
    }

    public void m(List list) throws AbtException {
        o();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        n(c(list));
    }
}
