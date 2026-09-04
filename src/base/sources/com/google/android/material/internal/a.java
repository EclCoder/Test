package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f20301a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f20302b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f20303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f20305e;

    /* JADX INFO: renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0310a implements j.a {
        C0310a() {
        }

        @Override // com.google.android.material.internal.j.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, boolean z10) {
            if (!z10) {
                a aVar = a.this;
                if (!aVar.r(jVar, aVar.f20305e)) {
                    return;
                }
            } else if (!a.this.g(jVar)) {
                return;
            }
            a.this.m();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(Set set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(j jVar) {
        int id2 = jVar.getId();
        if (this.f20302b.contains(Integer.valueOf(id2))) {
            return false;
        }
        j jVar2 = (j) this.f20301a.get(Integer.valueOf(k()));
        if (jVar2 != null) {
            r(jVar2, false);
        }
        boolean zAdd = this.f20302b.add(Integer.valueOf(id2));
        if (!jVar.isChecked()) {
            jVar.setChecked(true);
        }
        return zAdd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        b bVar = this.f20303c;
        if (bVar != null) {
            bVar.a(i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(j jVar, boolean z10) {
        int id2 = jVar.getId();
        if (!this.f20302b.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (z10 && this.f20302b.size() == 1 && this.f20302b.contains(Integer.valueOf(id2))) {
            jVar.setChecked(true);
            return false;
        }
        boolean zRemove = this.f20302b.remove(Integer.valueOf(id2));
        if (jVar.isChecked()) {
            jVar.setChecked(false);
        }
        return zRemove;
    }

    public void e(j jVar) {
        this.f20301a.put(Integer.valueOf(jVar.getId()), jVar);
        if (jVar.isChecked()) {
            g(jVar);
        }
        jVar.setInternalOnCheckedChangeListener(new C0310a());
    }

    public void f(int i10) {
        j jVar = (j) this.f20301a.get(Integer.valueOf(i10));
        if (jVar != null && g(jVar)) {
            m();
        }
    }

    public void h() {
        boolean zIsEmpty = this.f20302b.isEmpty();
        Iterator it = this.f20301a.values().iterator();
        while (it.hasNext()) {
            r((j) it.next(), false);
        }
        if (zIsEmpty) {
            return;
        }
        m();
    }

    public Set i() {
        return new HashSet(this.f20302b);
    }

    public List j(ViewGroup viewGroup) {
        Set setI = i();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof j) && setI.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int k() {
        if (!this.f20304d || this.f20302b.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f20302b.iterator().next()).intValue();
    }

    public boolean l() {
        return this.f20304d;
    }

    public void n(j jVar) {
        jVar.setInternalOnCheckedChangeListener(null);
        this.f20301a.remove(Integer.valueOf(jVar.getId()));
        this.f20302b.remove(Integer.valueOf(jVar.getId()));
    }

    public void o(b bVar) {
        this.f20303c = bVar;
    }

    public void p(boolean z10) {
        this.f20305e = z10;
    }

    public void q(boolean z10) {
        if (this.f20304d != z10) {
            this.f20304d = z10;
            h();
        }
    }
}
