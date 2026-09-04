package dh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.WindowManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import dg.l;
import dg.u;
import em.k0;
import em.o0;
import yf.c0;
import yf.e0;
import yf.k;
import zg.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class j implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f36927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f36928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final el.a f36929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final el.a f36930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final el.a f36931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final el.a f36932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final el.a f36933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final el.a f36934h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final el.a f36935i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final el.a f36936j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final el.a f36937k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final el.a f36938l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final el.a f36939m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final el.a f36940n;

    public j(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4, el.a aVar5, el.a aVar6, el.a aVar7, el.a aVar8, el.a aVar9, el.a aVar10, el.a aVar11, el.a aVar12, el.a aVar13, el.a aVar14) {
        this.f36927a = aVar;
        this.f36928b = aVar2;
        this.f36929c = aVar3;
        this.f36930d = aVar4;
        this.f36931e = aVar5;
        this.f36932f = aVar6;
        this.f36933g = aVar7;
        this.f36934h = aVar8;
        this.f36935i = aVar9;
        this.f36936j = aVar10;
        this.f36937k = aVar11;
        this.f36938l = aVar12;
        this.f36939m = aVar13;
        this.f36940n = aVar14;
    }

    public static j a(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4, el.a aVar5, el.a aVar6, el.a aVar7, el.a aVar8, el.a aVar9, el.a aVar10, el.a aVar11, el.a aVar12, el.a aVar13, el.a aVar14) {
        return new j(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14);
    }

    public static i c(o0 o0Var, k kVar, e0 e0Var, yf.i iVar, c0 c0Var, yf.c cVar, p pVar, u uVar, l lVar, k0 k0Var, LayoutInflater layoutInflater, FirebaseAnalytics firebaseAnalytics, Context context) {
        return new i(o0Var, kVar, e0Var, iVar, c0Var, cVar, pVar, uVar, lVar, k0Var, layoutInflater, firebaseAnalytics, context);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        i iVarC = c((o0) this.f36927a.get(), (k) this.f36928b.get(), (e0) this.f36929c.get(), (yf.i) this.f36930d.get(), (c0) this.f36931e.get(), (yf.c) this.f36932f.get(), (p) this.f36933g.get(), (u) this.f36934h.get(), (l) this.f36935i.get(), (k0) this.f36936j.get(), (LayoutInflater) this.f36937k.get(), (FirebaseAnalytics) this.f36938l.get(), (Context) this.f36939m.get());
        zg.c.a(iVarC, (WindowManager) this.f36940n.get());
        return iVarC;
    }
}
