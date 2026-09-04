package androidx.media3.exoplayer;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class e2 extends androidx.media3.exoplayer.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f5325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f5326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f5327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f5328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final t1.a0[] f5329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object[] f5330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HashMap f5331n;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends androidx.media3.exoplayer.source.m {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final t1.a0.c f5332f;

        a(t1.a0 a0Var) {
            super(a0Var);
            this.f5332f = new t1.a0.c();
        }

        @Override // androidx.media3.exoplayer.source.m, t1.a0
        public t1.a0.b g(int i10, t1.a0.b bVar, boolean z10) {
            t1.a0.b bVarG = super.g(i10, bVar, z10);
            if (super.n(bVarG.f52521c, this.f5332f).f()) {
                bVarG.t(bVar.f52519a, bVar.f52520b, bVar.f52521c, bVar.f52522d, bVar.f52523e, t1.a.f52480g, true);
                return bVarG;
            }
            bVarG.f52524f = true;
            return bVarG;
        }
    }

    public e2(Collection collection, i2.r rVar) {
        this(G(collection), H(collection), rVar);
    }

    private static t1.a0[] G(Collection collection) {
        t1.a0[] a0VarArr = new t1.a0[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            a0VarArr[i10] = ((o1) it.next()).b();
            i10++;
        }
        return a0VarArr;
    }

    private static Object[] H(Collection collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = ((o1) it.next()).a();
            i10++;
        }
        return objArr;
    }

    @Override // androidx.media3.exoplayer.a
    protected int A(int i10) {
        return this.f5328k[i10];
    }

    @Override // androidx.media3.exoplayer.a
    protected t1.a0 D(int i10) {
        return this.f5329l[i10];
    }

    public e2 E(i2.r rVar) {
        t1.a0[] a0VarArr = new t1.a0[this.f5329l.length];
        int i10 = 0;
        while (true) {
            t1.a0[] a0VarArr2 = this.f5329l;
            if (i10 >= a0VarArr2.length) {
                return new e2(a0VarArr, this.f5330m, rVar);
            }
            a0VarArr[i10] = new a(a0VarArr2[i10]);
            i10++;
        }
    }

    List F() {
        return Arrays.asList(this.f5329l);
    }

    @Override // t1.a0
    public int i() {
        return this.f5326i;
    }

    @Override // t1.a0
    public int p() {
        return this.f5325h;
    }

    @Override // androidx.media3.exoplayer.a
    protected int s(Object obj) {
        Integer num = (Integer) this.f5331n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // androidx.media3.exoplayer.a
    protected int t(int i10) {
        return w1.c0.f(this.f5327j, i10 + 1, false, false);
    }

    @Override // androidx.media3.exoplayer.a
    protected int u(int i10) {
        return w1.c0.f(this.f5328k, i10 + 1, false, false);
    }

    @Override // androidx.media3.exoplayer.a
    protected Object x(int i10) {
        return this.f5330m[i10];
    }

    @Override // androidx.media3.exoplayer.a
    protected int z(int i10) {
        return this.f5327j[i10];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private e2(t1.a0[] a0VarArr, Object[] objArr, i2.r rVar) {
        super(false, rVar);
        int i10 = 0;
        int length = a0VarArr.length;
        this.f5329l = a0VarArr;
        this.f5327j = new int[length];
        this.f5328k = new int[length];
        this.f5330m = objArr;
        this.f5331n = new HashMap();
        int length2 = a0VarArr.length;
        int iP = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length2) {
            t1.a0 a0Var = a0VarArr[i10];
            this.f5329l[i12] = a0Var;
            this.f5328k[i12] = iP;
            this.f5327j[i12] = i11;
            iP += a0Var.p();
            i11 += this.f5329l[i12].i();
            this.f5331n.put(objArr[i12], Integer.valueOf(i12));
            i10++;
            i12++;
        }
        this.f5325h = iP;
        this.f5326i = i11;
    }
}
