package qe;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f50685c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f50686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f50687b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f50688r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f50690t;

        b(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f50688r = obj;
            this.f50690t |= Integer.MIN_VALUE;
            return j.this.f(this);
        }
    }

    public j(o localOverrideSettings, o remoteSettings) {
        s.h(localOverrideSettings, "localOverrideSettings");
        s.h(remoteSettings, "remoteSettings");
        this.f50686a = localOverrideSettings;
        this.f50687b = remoteSettings;
    }

    private final boolean d(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    private final boolean e(long j10) {
        return cm.a.A(j10) && cm.a.v(j10);
    }

    public final double a() {
        Double d10 = this.f50686a.d();
        if (d10 != null) {
            double dDoubleValue = d10.doubleValue();
            if (d(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double d11 = this.f50687b.d();
        if (d11 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = d11.doubleValue();
        if (d(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    public final long b() {
        cm.a aVarB = this.f50686a.b();
        if (aVarB != null) {
            long jG = aVarB.G();
            if (e(jG)) {
                return jG;
            }
        }
        cm.a aVarB2 = this.f50687b.b();
        if (aVarB2 != null) {
            long jG2 = aVarB2.G();
            if (e(jG2)) {
                return jG2;
            }
        }
        cm.a.C0139a c0139a = cm.a.f10121b;
        return cm.c.s(30, cm.d.MINUTES);
    }

    public final boolean c() {
        Boolean boolA = this.f50686a.a();
        if (boolA != null) {
            return boolA.booleanValue();
        }
        Boolean boolA2 = this.f50687b.a();
        if (boolA2 != null) {
            return boolA2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r6.c(r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(kl.f r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof qe.j.b
            if (r0 == 0) goto L13
            r0 = r6
            qe.j$b r0 = (qe.j.b) r0
            int r1 = r0.f50690t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50690t = r1
            goto L18
        L13:
            qe.j$b r0 = new qe.j$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f50688r
            java.lang.Object r1 = ll.b.f()
            int r2 = r0.f50690t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            fl.s.b(r6)
            goto L51
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            fl.s.b(r6)
            goto L46
        L38:
            fl.s.b(r6)
            qe.o r6 = r5.f50686a
            r0.f50690t = r4
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L46
            goto L50
        L46:
            qe.o r6 = r5.f50687b
            r0.f50690t = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L51
        L50:
            return r1
        L51:
            fl.g0 r6 = fl.g0.f38750a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.j.f(kl.f):java.lang.Object");
    }
}
