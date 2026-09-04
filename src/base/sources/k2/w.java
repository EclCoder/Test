package k2;

import androidx.media3.exoplayer.h2;
import t1.d0;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h2[] f42967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q[] f42968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f42969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f42970e;

    public w(h2[] h2VarArr, q[] qVarArr, d0 d0Var, Object obj) {
        w1.a.a(h2VarArr.length == qVarArr.length);
        this.f42967b = h2VarArr;
        this.f42968c = (q[]) qVarArr.clone();
        this.f42969d = d0Var;
        this.f42970e = obj;
        this.f42966a = h2VarArr.length;
    }

    public boolean a(w wVar) {
        if (wVar == null || wVar.f42968c.length != this.f42968c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f42968c.length; i10++) {
            if (!b(wVar, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(w wVar, int i10) {
        return wVar != null && c0.c(this.f42967b[i10], wVar.f42967b[i10]) && c0.c(this.f42968c[i10], wVar.f42968c[i10]);
    }

    public boolean c(int i10) {
        return this.f42967b[i10] != null;
    }
}
