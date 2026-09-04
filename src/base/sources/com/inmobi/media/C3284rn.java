package com.inmobi.media;

import android.widget.ProgressBar;

/* JADX INFO: renamed from: com.inmobi.media.rn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3284rn extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f27413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f27414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressBar f27415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ProgressBar f27417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C3310sn f27418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f27419j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3284rn(ProgressBar progressBar, C3310sn c3310sn, int i10, kl.f fVar) {
        super(2, fVar);
        this.f27417h = progressBar;
        this.f27418i = c3310sn;
        this.f27419j = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3284rn(this.f27417h, this.f27418i, this.f27419j, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C3284rn) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0068 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0066 -> B:13:0x0069). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = ll.b.f()
            int r1 = r13.f27416g
            r2 = 1
            if (r1 == 0) goto L23
            if (r1 != r2) goto L1b
            int r1 = r13.f27412c
            int r3 = r13.f27411b
            float r4 = r13.f27414e
            long r5 = r13.f27413d
            int r7 = r13.f27410a
            android.widget.ProgressBar r8 = r13.f27415f
            fl.s.b(r14)
            goto L69
        L1b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L23:
            fl.s.b(r14)
            android.widget.ProgressBar r14 = r13.f27417h
            int r14 = r14.getProgress()
            com.inmobi.media.sn r1 = r13.f27418i
            com.inmobi.media.Og r1 = r1.f27487c
            long r3 = r1.f25423f
            r1 = 10
            long r5 = (long) r1
            long r3 = r3 / r5
            int r5 = r13.f27419j
            int r5 = r5 - r14
            float r5 = (float) r5
            r6 = 1092616192(0x41200000, float:10.0)
            float r5 = r5 / r6
            android.widget.ProgressBar r6 = r13.f27417h
            r7 = 0
            r8 = r6
            r10 = r7
            r7 = r14
            r11 = r3
            r3 = r1
            r4 = r5
            r1 = r10
            r5 = r11
        L48:
            if (r1 >= r3) goto L6b
            float r14 = (float) r7
            int r9 = r1 + 1
            float r9 = (float) r9
            float r9 = r9 * r4
            float r9 = r9 + r14
            int r14 = (int) r9
            com.inmobi.media.Mn.a(r8, r14)
            r13.f27415f = r8
            r13.f27410a = r7
            r13.f27413d = r5
            r13.f27414e = r4
            r13.f27411b = r3
            r13.f27412c = r1
            r13.f27416g = r2
            java.lang.Object r14 = em.y0.a(r5, r13)
            if (r14 != r0) goto L69
            return r0
        L69:
            int r1 = r1 + r2
            goto L48
        L6b:
            fl.g0 r14 = fl.g0.f38750a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3284rn.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
