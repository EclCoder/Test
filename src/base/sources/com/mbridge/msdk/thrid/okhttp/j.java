package com.mbridge.msdk.thrid.okhttp;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g[] f33465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g[] f33466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f33467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j f33468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j f33469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j f33470j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f33471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f33472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String[] f33473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String[] f33474d;

    static {
        g gVar = g.f33066n1;
        g gVar2 = g.f33069o1;
        g gVar3 = g.f33072p1;
        g gVar4 = g.f33075q1;
        g gVar5 = g.f33078r1;
        g gVar6 = g.Z0;
        g gVar7 = g.f33036d1;
        g gVar8 = g.f33027a1;
        g gVar9 = g.f33039e1;
        g gVar10 = g.f33057k1;
        g gVar11 = g.f33054j1;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11};
        f33465e = gVarArr;
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, g.K0, g.L0, g.f33050i0, g.f33053j0, g.G, g.K, g.f33055k};
        f33466f = gVarArr2;
        a aVarA = new a(true).a(gVarArr);
        d0 d0Var = d0.TLS_1_3;
        d0 d0Var2 = d0.TLS_1_2;
        f33467g = aVarA.a(d0Var, d0Var2).a(true).a();
        a aVarA2 = new a(true).a(gVarArr2);
        d0 d0Var3 = d0.TLS_1_1;
        d0 d0Var4 = d0.TLS_1_0;
        f33468h = aVarA2.a(d0Var, d0Var2, d0Var3, d0Var4).a(true).a();
        f33469i = new a(true).a(gVarArr2).a(d0Var4).a(true).a();
        f33470j = new a(false).a();
    }

    j(a aVar) {
        this.f33471a = aVar.f33475a;
        this.f33473c = aVar.f33476b;
        this.f33474d = aVar.f33477c;
        this.f33472b = aVar.f33478d;
    }

    public List<g> a() {
        String[] strArr = this.f33473c;
        if (strArr != null) {
            return g.a(strArr);
        }
        return null;
    }

    public boolean b() {
        return this.f33471a;
    }

    public boolean c() {
        return this.f33472b;
    }

    public List<d0> d() {
        String[] strArr = this.f33474d;
        if (strArr != null) {
            return d0.a(strArr);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z10 = this.f33471a;
        if (z10 != jVar.f33471a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f33473c, jVar.f33473c) && Arrays.equals(this.f33474d, jVar.f33474d) && this.f33472b == jVar.f33472b);
    }

    public int hashCode() {
        if (this.f33471a) {
            return ((((Arrays.hashCode(this.f33473c) + 527) * 31) + Arrays.hashCode(this.f33474d)) * 31) + (!this.f33472b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f33471a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + (this.f33473c != null ? a().toString() : "[all enabled]") + ", tlsVersions=" + (this.f33474d != null ? d().toString() : "[all enabled]") + ", supportsTlsExtensions=" + this.f33472b + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f33475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String[] f33476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String[] f33477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f33478d;

        a(boolean z10) {
            this.f33475a = z10;
        }

        public a a(g... gVarArr) {
            if (!this.f33475a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[gVarArr.length];
            for (int i10 = 0; i10 < gVarArr.length; i10++) {
                strArr[i10] = gVarArr[i10].f33095a;
            }
            return a(strArr);
        }

        public a b(String... strArr) {
            if (!this.f33475a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f33477c = (String[]) strArr.clone();
            return this;
        }

        public a(j jVar) {
            this.f33475a = jVar.f33471a;
            this.f33476b = jVar.f33473c;
            this.f33477c = jVar.f33474d;
            this.f33478d = jVar.f33472b;
        }

        public a a(String... strArr) {
            if (this.f33475a) {
                if (strArr.length != 0) {
                    this.f33476b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a a(d0... d0VarArr) {
            if (this.f33475a) {
                String[] strArr = new String[d0VarArr.length];
                for (int i10 = 0; i10 < d0VarArr.length; i10++) {
                    strArr[i10] = d0VarArr[i10].f33017a;
                }
                return b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a a(boolean z10) {
            if (this.f33475a) {
                this.f33478d = z10;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public j a() {
            return new j(this);
        }
    }

    private j b(SSLSocket sSLSocket, boolean z10) {
        String[] strArrA = this.f33473c != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(g.f33028b, sSLSocket.getEnabledCipherSuites(), this.f33473c) : sSLSocket.getEnabledCipherSuites();
        String[] strArrA2 = this.f33474d != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(com.mbridge.msdk.thrid.okhttp.internal.c.f33123q, sSLSocket.getEnabledProtocols(), this.f33474d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(g.f33028b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z10 && iA != -1) {
            strArrA = com.mbridge.msdk.thrid.okhttp.internal.c.a(strArrA, supportedCipherSuites[iA]);
        }
        return new a(this).a(strArrA).b(strArrA2).a();
    }

    void a(SSLSocket sSLSocket, boolean z10) {
        j jVarB = b(sSLSocket, z10);
        String[] strArr = jVarB.f33474d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = jVarB.f33473c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        if (!this.f33471a) {
            return false;
        }
        String[] strArr = this.f33474d;
        if (strArr != null && !com.mbridge.msdk.thrid.okhttp.internal.c.b(com.mbridge.msdk.thrid.okhttp.internal.c.f33123q, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f33473c;
        return strArr2 == null || com.mbridge.msdk.thrid.okhttp.internal.c.b(g.f33028b, strArr2, sSLSocket.getEnabledCipherSuites());
    }
}
