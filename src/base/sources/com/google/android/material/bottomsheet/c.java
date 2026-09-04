package com.google.android.material.bottomsheet;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import n0.f1;
import n0.k1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class c extends f1.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f19565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f19568f;

    public c(View view) {
        super(0);
        this.f19568f = new int[2];
        this.f19565c = view;
    }

    @Override // n0.f1.b
    public void b(f1 f1Var) {
        this.f19565c.setTranslationY(0.0f);
    }

    @Override // n0.f1.b
    public void c(f1 f1Var) {
        this.f19565c.getLocationOnScreen(this.f19568f);
        this.f19566d = this.f19568f[1];
    }

    @Override // n0.f1.b
    public k1 d(k1 k1Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f1 f1Var = (f1) it.next();
            if ((f1Var.d() & k1.s.b()) != 0) {
                this.f19565c.setTranslationY(tb.b.c(this.f19567e, 0, f1Var.c()));
                break;
            }
        }
        return k1Var;
    }

    @Override // n0.f1.b
    public f1.a e(f1 f1Var, f1.a aVar) {
        this.f19565c.getLocationOnScreen(this.f19568f);
        int i10 = this.f19566d - this.f19568f[1];
        this.f19567e = i10;
        this.f19565c.setTranslationY(i10);
        return aVar;
    }
}
