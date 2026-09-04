package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f25633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f25634g;

    public Rb(Context context, String url, long j10, long j11, int i10, int i11) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(url, "url");
        this.f25628a = url;
        this.f25629b = j10;
        this.f25630c = j11;
        this.f25631d = i10;
        this.f25632e = i11;
        WeakReference weakReference = new WeakReference(context);
        this.f25633f = weakReference;
        this.f25634g = new AtomicBoolean(false);
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            em.o0 o0Var = AbstractC2834ac.f26174a;
            Zb.a(new Qb(this, context2, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:24:0x0067->B:34:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r7 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r6, kotlin.coroutines.jvm.internal.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.inmobi.media.Nb
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.Nb r0 = (com.inmobi.media.Nb) r0
            int r1 = r0.f25342e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25342e = r1
            goto L18
        L13:
            com.inmobi.media.Nb r0 = new com.inmobi.media.Nb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f25340c
            java.lang.Object r1 = ll.b.f()
            int r2 = r0.f25342e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.util.Iterator r6 = r0.f25339b
            android.content.Context r2 = r0.f25338a
            fl.s.b(r7)
            goto L67
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            android.content.Context r6 = r0.f25338a
            fl.s.b(r7)
            goto L5f
        L3e:
            fl.s.b(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r5.f25634g
            boolean r7 = r7.get()
            if (r7 == 0) goto L4c
            fl.g0 r6 = fl.g0.f38750a
            return r6
        L4c:
            fl.k r7 = com.inmobi.media.Gb.f24849a
            java.lang.Object r7 = r7.getValue()
            com.inmobi.media.Fb r7 = (com.inmobi.media.Fb) r7
            r0.f25338a = r6
            r0.f25342e = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L5f
            goto L81
        L5f:
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
            r2 = r6
            r6 = r7
        L67:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L82
            java.lang.Object r7 = r6.next()
            com.inmobi.media.yb r7 = (com.inmobi.media.C3453yb) r7
            java.lang.String r4 = r5.f25628a
            r0.f25338a = r2
            r0.f25339b = r6
            r0.f25342e = r3
            java.lang.Object r7 = r5.b(r4, r7, r0)
            if (r7 != r1) goto L67
        L81:
            return r1
        L82:
            fl.g0 r6 = fl.g0.f38750a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Rb.a(android.content.Context, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005f A[PHI: r1 r2 r4 r6
      0x005f: PHI (r1v4 com.inmobi.media.yb) = (r1v7 com.inmobi.media.yb), (r1v17 com.inmobi.media.yb) binds: [B:49:0x0102, B:19:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x005f: PHI (r2v2 com.inmobi.media.yb) = (r2v6 com.inmobi.media.yb), (r2v12 com.inmobi.media.yb) binds: [B:49:0x0102, B:19:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x005f: PHI (r4v3 com.inmobi.media.Pb) = (r4v5 com.inmobi.media.Pb), (r4v2 com.inmobi.media.Pb) binds: [B:49:0x0102, B:19:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x005f: PHI (r6v6 java.lang.String) = (r6v8 java.lang.String), (r6v23 java.lang.String) binds: [B:49:0x0102, B:19:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:54:0x0115  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0115 -> B:55:0x011c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.String r25, com.inmobi.media.C3453yb r26, kotlin.coroutines.jvm.internal.d r27) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Rb.b(java.lang.String, com.inmobi.media.yb, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String url, C3453yb data, kotlin.coroutines.jvm.internal.d dVar) {
        Ob ob2;
        if (dVar instanceof Ob) {
            ob2 = (Ob) dVar;
            int i10 = ob2.f25412c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ob2.f25412c = i10 - Integer.MIN_VALUE;
            } else {
                ob2 = new Ob(this, dVar);
            }
        } else {
            ob2 = new Ob(this, dVar);
        }
        Object obj = ob2.f25410a;
        Object objF = ll.b.f();
        int i11 = ob2.f25412c;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
                return obj;
            }
            fl.s.b(obj);
            B9 b10 = (B9) Pe.f25491h.getValue();
            kotlin.jvm.internal.s.h(url, "loggingUrl");
            kotlin.jvm.internal.s.h(data, "data");
            kotlin.jvm.internal.s.h(url, "url");
            Te te2 = new Te(url, null, null, new W6(data.f27931a), null, 54);
            ob2.f25412c = 1;
            Object objA = b10.f24525a.a(te2, ob2);
            return objA == objF ? objF : objA;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r7.a(r6, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
    
        if (r7 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b9, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b7 -> B:38:0x00ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.inmobi.media.C3453yb r6, kotlin.coroutines.jvm.internal.d r7) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Rb.a(com.inmobi.media.yb, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
