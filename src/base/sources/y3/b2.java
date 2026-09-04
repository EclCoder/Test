package y3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b4.b0 f57160a = new b4.b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hm.w f57161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hm.w f57162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f57163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final hm.i0 f57164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final hm.i0 f57165f;

    public b2() {
        hm.w wVarA = hm.k0.a(gl.r.l());
        this.f57161b = wVarA;
        hm.w wVarA2 = hm.k0.a(gl.s0.d());
        this.f57162c = wVarA2;
        this.f57164e = hm.g.a(wVarA);
        this.f57165f = hm.g.a(wVarA2);
    }

    public abstract y b(d1 d1Var, Bundle bundle);

    public final hm.i0 c() {
        return this.f57164e;
    }

    public final hm.i0 d() {
        return this.f57165f;
    }

    public final boolean e() {
        return this.f57163d;
    }

    public void f(y entry) {
        kotlin.jvm.internal.s.h(entry, "entry");
        hm.w wVar = this.f57162c;
        wVar.setValue(gl.s0.i((Set) wVar.getValue(), entry));
    }

    public void g(y backStackEntry) {
        int iNextIndex;
        kotlin.jvm.internal.s.h(backStackEntry, "backStackEntry");
        synchronized (this.f57160a) {
            try {
                List listL0 = gl.r.L0((Collection) c().getValue());
                ListIterator listIterator = listL0.listIterator(listL0.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    } else if (kotlin.jvm.internal.s.c(((y) listIterator.previous()).f(), backStackEntry.f())) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                listL0.set(iNextIndex, backStackEntry);
                this.f57161b.setValue(listL0);
                fl.g0 g0Var = fl.g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void h(y backStackEntry) {
        kotlin.jvm.internal.s.h(backStackEntry, "backStackEntry");
        List list = (List) this.f57164e.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            y yVar = (y) listIterator.previous();
            if (kotlin.jvm.internal.s.c(yVar.f(), backStackEntry.f())) {
                hm.w wVar = this.f57162c;
                wVar.setValue(gl.s0.k(gl.s0.k((Set) wVar.getValue(), yVar), backStackEntry));
                g(backStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public void i(y popUpTo, boolean z10) {
        kotlin.jvm.internal.s.h(popUpTo, "popUpTo");
        synchronized (this.f57160a) {
            try {
                hm.w wVar = this.f57161b;
                Iterable iterable = (Iterable) this.f57161b.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (kotlin.jvm.internal.s.c((y) obj, popUpTo)) {
                        break;
                    } else {
                        arrayList.add(obj);
                    }
                }
                wVar.setValue(arrayList);
                fl.g0 g0Var = fl.g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(y popUpTo, boolean z10) {
        Object objPrevious;
        kotlin.jvm.internal.s.h(popUpTo, "popUpTo");
        Iterable iterable = (Iterable) this.f57162c.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((y) it.next()) == popUpTo) {
                    Iterable iterable2 = (Iterable) this.f57164e.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((y) it2.next()) == popUpTo) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        hm.w wVar = this.f57162c;
        wVar.setValue(gl.s0.k((Set) wVar.getValue(), popUpTo));
        List list = (List) this.f57164e.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            y yVar = (y) objPrevious;
            if (!kotlin.jvm.internal.s.c(yVar, popUpTo) && ((List) this.f57164e.getValue()).lastIndexOf(yVar) < ((List) this.f57164e.getValue()).lastIndexOf(popUpTo)) {
                break;
            }
        }
        y yVar2 = (y) objPrevious;
        if (yVar2 != null) {
            hm.w wVar2 = this.f57162c;
            wVar2.setValue(gl.s0.k((Set) wVar2.getValue(), yVar2));
        }
        i(popUpTo, z10);
    }

    public void k(y entry) {
        kotlin.jvm.internal.s.h(entry, "entry");
        hm.w wVar = this.f57162c;
        wVar.setValue(gl.s0.k((Set) wVar.getValue(), entry));
    }

    public void l(y backStackEntry) {
        kotlin.jvm.internal.s.h(backStackEntry, "backStackEntry");
        synchronized (this.f57160a) {
            this.f57161b.setValue(gl.r.t0((Collection) this.f57161b.getValue(), backStackEntry));
            fl.g0 g0Var = fl.g0.f38750a;
        }
    }

    public void m(y backStackEntry) {
        kotlin.jvm.internal.s.h(backStackEntry, "backStackEntry");
        Iterable iterable = (Iterable) this.f57162c.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((y) it.next()) == backStackEntry) {
                    Iterable iterable2 = (Iterable) this.f57164e.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((y) it2.next()) == backStackEntry) {
                                return;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        y yVar = (y) gl.r.o0((List) this.f57164e.getValue());
        if (yVar != null) {
            hm.w wVar = this.f57162c;
            wVar.setValue(gl.s0.k((Set) wVar.getValue(), yVar));
        }
        hm.w wVar2 = this.f57162c;
        wVar2.setValue(gl.s0.k((Set) wVar2.getValue(), backStackEntry));
        l(backStackEntry);
    }

    public final void n(boolean z10) {
        this.f57163d = z10;
    }
}
