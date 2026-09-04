package org.apache.http.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class q implements Cloneable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final co.d[] f49427b = new co.d[0];
    private static final long serialVersionUID = 2608834160639271617L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f49428a = new ArrayList(16);

    public void b(co.d dVar) {
        if (dVar == null) {
            return;
        }
        this.f49428a.add(dVar);
    }

    public Object clone() {
        return super.clone();
    }

    public void g() {
        this.f49428a.clear();
    }

    public boolean h(String str) {
        for (int i10 = 0; i10 < this.f49428a.size(); i10++) {
            if (((co.d) this.f49428a.get(i10)).getName().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public co.d[] i() {
        List list = this.f49428a;
        return (co.d[]) list.toArray(new co.d[list.size()]);
    }

    public co.d j(String str) {
        for (int i10 = 0; i10 < this.f49428a.size(); i10++) {
            co.d dVar = (co.d) this.f49428a.get(i10);
            if (dVar.getName().equalsIgnoreCase(str)) {
                return dVar;
            }
        }
        return null;
    }

    public co.d[] k(String str) {
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < this.f49428a.size(); i10++) {
            co.d dVar = (co.d) this.f49428a.get(i10);
            if (dVar.getName().equalsIgnoreCase(str)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(dVar);
            }
        }
        return arrayList != null ? (co.d[]) arrayList.toArray(new co.d[arrayList.size()]) : f49427b;
    }

    public co.d l(String str) {
        for (int size = this.f49428a.size() - 1; size >= 0; size--) {
            co.d dVar = (co.d) this.f49428a.get(size);
            if (dVar.getName().equalsIgnoreCase(str)) {
                return dVar;
            }
        }
        return null;
    }

    public co.g m() {
        return new l(this.f49428a, null);
    }

    public co.g n(String str) {
        return new l(this.f49428a, str);
    }

    public void o(co.d dVar) {
        if (dVar == null) {
            return;
        }
        this.f49428a.remove(dVar);
    }

    public void p(co.d[] dVarArr) {
        g();
        if (dVarArr == null) {
            return;
        }
        Collections.addAll(this.f49428a, dVarArr);
    }

    public void q(co.d dVar) {
        if (dVar == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f49428a.size(); i10++) {
            if (((co.d) this.f49428a.get(i10)).getName().equalsIgnoreCase(dVar.getName())) {
                this.f49428a.set(i10, dVar);
                return;
            }
        }
        this.f49428a.add(dVar);
    }

    public String toString() {
        return this.f49428a.toString();
    }
}
