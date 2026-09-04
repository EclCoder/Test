package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.q7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3243q7 extends AbstractC3019hg {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f27323h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final nm.a f27324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public em.z1 f27325g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3243q7(C3433xg dao, I8 listener, C3251qf networkHandler) {
        super(dao, listener, networkHandler);
        kotlin.jvm.internal.s.h(dao, "dao");
        kotlin.jvm.internal.s.h(listener, "listener");
        kotlin.jvm.internal.s.h(networkHandler, "networkHandler");
        this.f27324f = nm.g.b(false, 1, null);
    }

    @Override // com.inmobi.media.AbstractC3019hg
    public final fl.g0 b() {
        em.o0 o0Var = H9.f24931d;
        em.k.d(o0Var, null, null, new C3113l7(this, null), 3, null);
        em.k.d(o0Var, null, null, new C3139m7(this, null), 3, null);
        return fl.g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
    /* JADX WARN: Code duplicated, block: B:37:0x00da  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c6 -> B:34:0x00c9). Please report as a decompilation issue!!! */
    public final Object c(kotlin.coroutines.jvm.internal.d dVar) {
        C3036i7 c3036i7;
        int i10;
        long j10;
        List listA0;
        if (dVar instanceof C3036i7) {
            c3036i7 = (C3036i7) dVar;
            int i11 = c3036i7.f26731e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3036i7.f26731e = i11 - Integer.MIN_VALUE;
            } else {
                c3036i7 = new C3036i7(this, dVar);
            }
        } else {
            c3036i7 = new C3036i7(this, dVar);
        }
        C3036i7 c3036i8 = c3036i7;
        Object objA = c3036i8.f26729c;
        Object objF = ll.b.f();
        int i12 = c3036i8.f26731e;
        if (i12 == 0) {
            fl.s.b(objA);
            long jCurrentTimeMillis = System.currentTimeMillis();
            kotlin.jvm.internal.s.g("q7", "TAG");
            int high = AbstractC3019hg.a().getMaxBatchSize().getHigh();
            C3433xg c3433xg = this.f26680a;
            Integer numD = kotlin.coroutines.jvm.internal.b.d(high);
            c3036i8.f26727a = jCurrentTimeMillis;
            c3036i8.f26728b = high;
            c3036i8.f26731e = 1;
            Object objA2 = c3433xg.a(numD, "high", jCurrentTimeMillis, c3036i8);
            if (objA2 != objF) {
                i10 = high;
                objA = objA2;
                j10 = jCurrentTimeMillis;
            }
            return objF;
        }
        if (i12 == 1) {
            i10 = c3036i8.f26728b;
            j10 = c3036i8.f26727a;
            fl.s.b(objA);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = c3036i8.f26728b;
            j10 = c3036i8.f26727a;
            fl.s.b(objA);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objA) {
            if (!this.f26684e.containsKey(((Zf) obj).f26142b)) {
                arrayList.add(obj);
            }
        }
        listA0 = gl.r.A0(arrayList, i10);
        if (!listA0.isEmpty() || this.f26683d != EnumC2941eg.STARTED) {
            return fl.g0.f38750a;
        }
        kotlin.jvm.internal.s.g("q7", "TAG");
        listA0.size();
        Iterator it = listA0.iterator();
        while (it.hasNext()) {
            em.k.d(H9.f24931d, null, null, new C3087k7(this, (Zf) it.next(), null), 3, null);
        }
        C3433xg c3433xg2 = this.f26680a;
        c3036i8.f26727a = j10;
        c3036i8.f26728b = i10;
        c3036i8.f26731e = 2;
        long j11 = j10;
        C3036i7 c3036i9 = c3036i8;
        objA = c3433xg2.a(null, "high", j11, c3036i9);
        if (objA != objF) {
            j10 = j11;
            c3036i8 = c3036i9;
            ArrayList arrayList2 = new ArrayList();
            while (r1.hasNext()) {
                if (!this.f26684e.containsKey(((Zf) obj).f26142b)) {
                    arrayList2.add(obj);
                }
            }
            listA0 = gl.r.A0(arrayList2, i10);
            if (!listA0.isEmpty()) {
            }
            return fl.g0.f38750a;
        }
        return objF;
        listA0 = (List) objA;
        if (!listA0.isEmpty()) {
        }
        return fl.g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(kotlin.coroutines.jvm.internal.d dVar) {
        C3165n7 c3165n7;
        nm.a aVar;
        if (dVar instanceof C3165n7) {
            c3165n7 = (C3165n7) dVar;
            int i10 = c3165n7.f27040d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3165n7.f27040d = i10 - Integer.MIN_VALUE;
            } else {
                c3165n7 = new C3165n7(this, dVar);
            }
        } else {
            c3165n7 = new C3165n7(this, dVar);
        }
        Object obj = c3165n7.f27038b;
        Object objF = ll.b.f();
        int i11 = c3165n7.f27040d;
        if (i11 == 0) {
            fl.s.b(obj);
            aVar = this.f27324f;
            c3165n7.f27037a = aVar;
            c3165n7.f27040d = 1;
            if (aVar.e(null, c3165n7) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm.a aVar2 = c3165n7.f27037a;
            fl.s.b(obj);
            aVar = aVar2;
        }
        try {
            em.z1 z1Var = this.f27325g;
            if (z1Var != null ? z1Var.isActive() : false) {
                return fl.g0.f38750a;
            }
            long high = AbstractC3019hg.a().getInterval().getHigh();
            if (high <= 0) {
                return fl.g0.f38750a;
            }
            kotlin.jvm.internal.s.g("q7", "TAG");
            em.o0 o0Var = H9.f24931d;
            yl.f fVar = AbstractC2837af.f26214a;
            this.f27325g = J3.a(o0Var, 0L, high * ((long) 1000), new C3191o7(this, null));
            return fl.g0.f38750a;
        } finally {
            aVar.f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(kotlin.coroutines.jvm.internal.d dVar) {
        C3217p7 c3217p7;
        nm.a aVar;
        if (dVar instanceof C3217p7) {
            c3217p7 = (C3217p7) dVar;
            int i10 = c3217p7.f27181d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3217p7.f27181d = i10 - Integer.MIN_VALUE;
            } else {
                c3217p7 = new C3217p7(this, dVar);
            }
        } else {
            c3217p7 = new C3217p7(this, dVar);
        }
        Object obj = c3217p7.f27179b;
        Object objF = ll.b.f();
        int i11 = c3217p7.f27181d;
        if (i11 == 0) {
            fl.s.b(obj);
            nm.a aVar2 = this.f27324f;
            c3217p7.f27178a = aVar2;
            c3217p7.f27181d = 1;
            if (aVar2.e(null, c3217p7) == objF) {
                return objF;
            }
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = c3217p7.f27178a;
            fl.s.b(obj);
        }
        try {
            em.z1 z1Var = this.f27325g;
            if (z1Var != null) {
                em.z1.c0(z1Var, null, 1, null);
            }
            this.f27325g = null;
            return fl.g0.f38750a;
        } finally {
            aVar.f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a9 A[Catch: Error -> 0x003e, Exception -> 0x0041, TryCatch #2 {Error -> 0x003e, Exception -> 0x0041, blocks: (B:14:0x0039, B:54:0x00df, B:23:0x004e, B:43:0x00b6, B:45:0x00be, B:47:0x00ca, B:50:0x00d7, B:51:0x00da, B:56:0x00e2, B:57:0x00ec, B:59:0x00f2, B:24:0x0052, B:38:0x00a0, B:40:0x00a9, B:27:0x0058, B:35:0x0091, B:30:0x005f, B:32:0x0068, B:60:0x010b), top: B:66:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6 A[Catch: Error -> 0x003e, Exception -> 0x0041, PHI: r0 r4
      0x00b6: PHI (r0v18 java.lang.Object) = (r0v16 java.lang.Object), (r0v1 java.lang.Object) binds: [B:41:0x00b3, B:23:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x00b6: PHI (r4v8 java.util.List) = (r4v6 java.util.List), (r4v11 java.util.List) binds: [B:41:0x00b3, B:23:0x004e] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {Error -> 0x003e, Exception -> 0x0041, blocks: (B:14:0x0039, B:54:0x00df, B:23:0x004e, B:43:0x00b6, B:45:0x00be, B:47:0x00ca, B:50:0x00d7, B:51:0x00da, B:56:0x00e2, B:57:0x00ec, B:59:0x00f2, B:24:0x0052, B:38:0x00a0, B:40:0x00a9, B:27:0x0058, B:35:0x0091, B:30:0x005f, B:32:0x0068, B:60:0x010b), top: B:66:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00be A[Catch: Error -> 0x003e, Exception -> 0x0041, TryCatch #2 {Error -> 0x003e, Exception -> 0x0041, blocks: (B:14:0x0039, B:54:0x00df, B:23:0x004e, B:43:0x00b6, B:45:0x00be, B:47:0x00ca, B:50:0x00d7, B:51:0x00da, B:56:0x00e2, B:57:0x00ec, B:59:0x00f2, B:24:0x0052, B:38:0x00a0, B:40:0x00a9, B:27:0x0058, B:35:0x0091, B:30:0x005f, B:32:0x0068, B:60:0x010b), top: B:66:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ca A[Catch: Error -> 0x003e, Exception -> 0x0041, TryCatch #2 {Error -> 0x003e, Exception -> 0x0041, blocks: (B:14:0x0039, B:54:0x00df, B:23:0x004e, B:43:0x00b6, B:45:0x00be, B:47:0x00ca, B:50:0x00d7, B:51:0x00da, B:56:0x00e2, B:57:0x00ec, B:59:0x00f2, B:24:0x0052, B:38:0x00a0, B:40:0x00a9, B:27:0x0058, B:35:0x0091, B:30:0x005f, B:32:0x0068, B:60:0x010b), top: B:66:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d7 A[Catch: Error -> 0x003e, Exception -> 0x0041, TryCatch #2 {Error -> 0x003e, Exception -> 0x0041, blocks: (B:14:0x0039, B:54:0x00df, B:23:0x004e, B:43:0x00b6, B:45:0x00be, B:47:0x00ca, B:50:0x00d7, B:51:0x00da, B:56:0x00e2, B:57:0x00ec, B:59:0x00f2, B:24:0x0052, B:38:0x00a0, B:40:0x00a9, B:27:0x0058, B:35:0x0091, B:30:0x005f, B:32:0x0068, B:60:0x010b), top: B:66:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00da A[Catch: Error -> 0x003e, Exception -> 0x0041, TryCatch #2 {Error -> 0x003e, Exception -> 0x0041, blocks: (B:14:0x0039, B:54:0x00df, B:23:0x004e, B:43:0x00b6, B:45:0x00be, B:47:0x00ca, B:50:0x00d7, B:51:0x00da, B:56:0x00e2, B:57:0x00ec, B:59:0x00f2, B:24:0x0052, B:38:0x00a0, B:40:0x00a9, B:27:0x0058, B:35:0x0091, B:30:0x005f, B:32:0x0068, B:60:0x010b), top: B:66:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2 A[Catch: Error -> 0x003e, Exception -> 0x0041, LOOP:0: B:57:0x00ec->B:59:0x00f2, LOOP_END, TryCatch #2 {Error -> 0x003e, Exception -> 0x0041, blocks: (B:14:0x0039, B:54:0x00df, B:23:0x004e, B:43:0x00b6, B:45:0x00be, B:47:0x00ca, B:50:0x00d7, B:51:0x00da, B:56:0x00e2, B:57:0x00ec, B:59:0x00f2, B:24:0x0052, B:38:0x00a0, B:40:0x00a9, B:27:0x0058, B:35:0x0091, B:30:0x005f, B:32:0x0068, B:60:0x010b), top: B:66:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
    
        if (r0 == r3) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.d r20) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3243q7.b(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
