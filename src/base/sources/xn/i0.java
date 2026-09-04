package xn;

import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c[] f56924b = new c[8];

    private final void c(int i10, c cVar) {
        c cVar2;
        while (true) {
            int i11 = i10 << 1;
            int i12 = i11 + 1;
            int i13 = this.f56923a;
            if (i12 > i13) {
                if (i11 > i13) {
                    break;
                }
                cVar2 = this.f56924b[i11];
                kotlin.jvm.internal.s.e(cVar2);
            } else {
                cVar2 = this.f56924b[i11];
                kotlin.jvm.internal.s.e(cVar2);
                c cVar3 = this.f56924b[i12];
                kotlin.jvm.internal.s.e(cVar3);
                if (kotlin.jvm.internal.s.j(0L, cVar3.u() - cVar2.u()) >= 0) {
                    cVar2 = cVar3;
                }
            }
            if (kotlin.jvm.internal.s.j(0L, cVar2.u() - cVar.u()) <= 0) {
                break;
            }
            int i14 = cVar2.f56901g;
            cVar2.f56901g = i10;
            this.f56924b[i10] = cVar2;
            i10 = i14;
        }
        this.f56924b[i10] = cVar;
        cVar.f56901g = i10;
    }

    private final void d(int i10, c cVar) {
        while (true) {
            int i11 = i10 >> 1;
            if (i11 == 0) {
                break;
            }
            c cVar2 = this.f56924b[i11];
            kotlin.jvm.internal.s.e(cVar2);
            if (kotlin.jvm.internal.s.j(0L, cVar.u() - cVar2.u()) <= 0) {
                break;
            }
            cVar2.f56901g = i10;
            this.f56924b[i10] = cVar2;
            i10 = i11;
        }
        this.f56924b[i10] = cVar;
        cVar.f56901g = i10;
    }

    public final void a(c node) {
        kotlin.jvm.internal.s.h(node, "node");
        int i10 = this.f56923a + 1;
        this.f56923a = i10;
        c[] cVarArr = this.f56924b;
        if (i10 == cVarArr.length) {
            c[] cVarArr2 = new c[i10 * 2];
            gl.j.o(cVarArr, cVarArr2, 0, 0, 0, 14, null);
            this.f56924b = cVarArr2;
        }
        d(i10, node);
    }

    public final c b() {
        return this.f56924b[1];
    }

    public final void e(c node) {
        kotlin.jvm.internal.s.h(node, "node");
        int i10 = node.f56901g;
        if (i10 == -1) {
            throw new IllegalArgumentException(PvZsvNiPV.kyeFdeI);
        }
        int i11 = this.f56923a;
        c cVar = this.f56924b[i11];
        kotlin.jvm.internal.s.e(cVar);
        node.f56901g = -1;
        this.f56924b[i11] = null;
        this.f56923a = i11 - 1;
        if (node == cVar) {
            return;
        }
        int iJ = kotlin.jvm.internal.s.j(0L, cVar.u() - node.u());
        if (iJ == 0) {
            this.f56924b[i10] = cVar;
            cVar.f56901g = i10;
        } else if (iJ < 0) {
            c(i10, cVar);
        } else {
            d(i10, cVar);
        }
    }
}
