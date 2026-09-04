package com.google.android.exoplayer2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class z1 extends com.google.android.exoplayer2.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f19205i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f19206j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f19207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int[] f19208l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final h2[] f19209m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object[] f19210n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final HashMap f19211o;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends com.google.android.exoplayer2.source.k {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final h2.d f19212g;

        a(h2 h2Var) {
            super(h2Var);
            this.f19212g = new h2.d();
        }

        @Override // com.google.android.exoplayer2.source.k, com.google.android.exoplayer2.h2
        public h2.b k(int i10, h2.b bVar, boolean z10) {
            h2.b bVarK = super.k(i10, bVar, z10);
            if (super.r(bVarK.f17000c, this.f19212g).h()) {
                bVarK.w(bVar.f16998a, bVar.f16999b, bVar.f17000c, bVar.f17001d, bVar.f17002e, sa.c.f51554g, true);
                return bVarK;
            }
            bVarK.f17003f = true;
            return bVarK;
        }
    }

    public z1(Collection collection, com.google.android.exoplayer2.source.e0 e0Var) {
        this(K(collection), L(collection), e0Var);
    }

    private static h2[] K(Collection collection) {
        h2[] h2VarArr = new h2[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            h2VarArr[i10] = ((e1) it.next()).b();
            i10++;
        }
        return h2VarArr;
    }

    private static Object[] L(Collection collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = ((e1) it.next()).a();
            i10++;
        }
        return objArr;
    }

    @Override // com.google.android.exoplayer2.a
    protected Object B(int i10) {
        return this.f19210n[i10];
    }

    @Override // com.google.android.exoplayer2.a
    protected int D(int i10) {
        return this.f19207k[i10];
    }

    @Override // com.google.android.exoplayer2.a
    protected int E(int i10) {
        return this.f19208l[i10];
    }

    @Override // com.google.android.exoplayer2.a
    protected h2 H(int i10) {
        return this.f19209m[i10];
    }

    public z1 I(com.google.android.exoplayer2.source.e0 e0Var) {
        h2[] h2VarArr = new h2[this.f19209m.length];
        int i10 = 0;
        while (true) {
            h2[] h2VarArr2 = this.f19209m;
            if (i10 >= h2VarArr2.length) {
                return new z1(h2VarArr, this.f19210n, e0Var);
            }
            h2VarArr[i10] = new a(h2VarArr2[i10]);
            i10++;
        }
    }

    List J() {
        return Arrays.asList(this.f19209m);
    }

    @Override // com.google.android.exoplayer2.h2
    public int m() {
        return this.f19206j;
    }

    @Override // com.google.android.exoplayer2.h2
    public int t() {
        return this.f19205i;
    }

    @Override // com.google.android.exoplayer2.a
    protected int w(Object obj) {
        Integer num = (Integer) this.f19211o.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.a
    protected int x(int i10) {
        return ob.r0.h(this.f19207k, i10 + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.a
    protected int y(int i10) {
        return ob.r0.h(this.f19208l, i10 + 1, false, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private z1(h2[] h2VarArr, Object[] objArr, com.google.android.exoplayer2.source.e0 e0Var) {
        super(false, e0Var);
        int i10 = 0;
        int length = h2VarArr.length;
        this.f19209m = h2VarArr;
        this.f19207k = new int[length];
        this.f19208l = new int[length];
        this.f19210n = objArr;
        this.f19211o = new HashMap();
        int length2 = h2VarArr.length;
        int iT = 0;
        int iM = 0;
        int i11 = 0;
        while (i10 < length2) {
            h2 h2Var = h2VarArr[i10];
            this.f19209m[i11] = h2Var;
            this.f19208l[i11] = iT;
            this.f19207k[i11] = iM;
            iT += h2Var.t();
            iM += this.f19209m[i11].m();
            this.f19211o.put(objArr[i11], Integer.valueOf(i11));
            i10++;
            i11++;
        }
        this.f19205i = iT;
        this.f19206j = iM;
    }
}
