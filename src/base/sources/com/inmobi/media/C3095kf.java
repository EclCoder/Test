package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.kf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3095kf extends AbstractC3019hg {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final nm.a f26857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public em.z1 f26858g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3095kf(C3433xg dao, C3266r5 listener, C3251qf networkHandler) {
        super(dao, listener, networkHandler);
        kotlin.jvm.internal.s.h(dao, "dao");
        kotlin.jvm.internal.s.h(listener, "listener");
        kotlin.jvm.internal.s.h(networkHandler, "networkHandler");
        this.f26857f = nm.g.b(false, 1, null);
    }

    @Override // com.inmobi.media.AbstractC3019hg
    public final fl.g0 b() {
        em.k.d(H9.f24930c, null, null, new C2992gf(this, null), 3, null);
        return fl.g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(kotlin.coroutines.jvm.internal.d dVar) {
        C3018hf c3018hf;
        nm.a aVar;
        if (dVar instanceof C3018hf) {
            c3018hf = (C3018hf) dVar;
            int i10 = c3018hf.f26679d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3018hf.f26679d = i10 - Integer.MIN_VALUE;
            } else {
                c3018hf = new C3018hf(this, dVar);
            }
        } else {
            c3018hf = new C3018hf(this, dVar);
        }
        Object obj = c3018hf.f26677b;
        Object objF = ll.b.f();
        int i11 = c3018hf.f26679d;
        if (i11 == 0) {
            fl.s.b(obj);
            aVar = this.f26857f;
            c3018hf.f26676a = aVar;
            c3018hf.f26679d = 1;
            if (aVar.e(null, c3018hf) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm.a aVar2 = c3018hf.f26676a;
            fl.s.b(obj);
            aVar = aVar2;
        }
        try {
            em.z1 z1Var = this.f26858g;
            if (z1Var != null) {
                kotlin.jvm.internal.s.e(z1Var);
                if (z1Var.h()) {
                    em.z1 z1Var2 = this.f26858g;
                    kotlin.jvm.internal.s.e(z1Var2);
                    if (!z1Var2.isCancelled()) {
                    }
                }
                return fl.g0.f38750a;
            }
            long normal = AbstractC3019hg.a().getInterval().getNormal();
            if (normal <= 0) {
                return fl.g0.f38750a;
            }
            this.f26858g = J3.a(H9.f24930c, 0L, normal * ((long) 1000), new Cif(this, null));
            return fl.g0.f38750a;
        } finally {
            aVar.f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(kotlin.coroutines.jvm.internal.d dVar) {
        C3069jf c3069jf;
        nm.a aVar;
        if (dVar instanceof C3069jf) {
            c3069jf = (C3069jf) dVar;
            int i10 = c3069jf.f26819d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3069jf.f26819d = i10 - Integer.MIN_VALUE;
            } else {
                c3069jf = new C3069jf(this, dVar);
            }
        } else {
            c3069jf = new C3069jf(this, dVar);
        }
        Object obj = c3069jf.f26817b;
        Object objF = ll.b.f();
        int i11 = c3069jf.f26819d;
        if (i11 == 0) {
            fl.s.b(obj);
            nm.a aVar2 = this.f26857f;
            c3069jf.f26816a = aVar2;
            c3069jf.f26819d = 1;
            if (aVar2.e(null, c3069jf) == objF) {
                return objF;
            }
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = c3069jf.f26816a;
            fl.s.b(obj);
        }
        try {
            em.z1 z1Var = this.f26858g;
            if (z1Var != null) {
                em.z1.c0(z1Var, null, 1, null);
            }
            this.f26858g = null;
            return fl.g0.f38750a;
        } finally {
            aVar.f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5 A[PHI: r2 r14
      0x00a5: PHI (r2v8 java.util.List) = (r2v6 java.util.List), (r2v11 java.util.List) binds: [B:31:0x00a2, B:17:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r14v16 java.lang.Object) = (r14v13 java.lang.Object), (r14v1 java.lang.Object) binds: [B:31:0x00a2, B:17:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db A[LOOP:0: B:47:0x00d5->B:49:0x00db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cb, code lost:
    
        if (r14 == r1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.d r14) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3095kf.b(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
