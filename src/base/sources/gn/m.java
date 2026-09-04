package gn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f39716e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List f39717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List f39718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m f39719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m f39720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m f39721j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m f39722k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f39723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f39724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f39725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f39726d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        j jVar = j.f39684o1;
        j jVar2 = j.f39687p1;
        j jVar3 = j.f39690q1;
        j jVar4 = j.f39642a1;
        j jVar5 = j.f39654e1;
        j jVar6 = j.f39645b1;
        j jVar7 = j.f39657f1;
        j jVar8 = j.f39675l1;
        j jVar9 = j.f39672k1;
        List listO = gl.r.o(jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9);
        f39717f = listO;
        List listO2 = gl.r.o(jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, j.L0, j.M0, j.f39668j0, j.f39671k0, j.H, j.L, j.f39673l);
        f39718g = listO2;
        a aVar = new a(true);
        j[] jVarArr = (j[]) listO.toArray(new j[0]);
        a aVarB = aVar.b((j[]) Arrays.copyOf(jVarArr, jVarArr.length));
        i0 i0Var = i0.TLS_1_3;
        i0 i0Var2 = i0.TLS_1_2;
        f39719h = aVarB.e(i0Var, i0Var2).d(true).a();
        a aVar2 = new a(true);
        j[] jVarArr2 = (j[]) listO2.toArray(new j[0]);
        f39720i = aVar2.b((j[]) Arrays.copyOf(jVarArr2, jVarArr2.length)).e(i0Var, i0Var2).d(true).a();
        a aVar3 = new a(true);
        j[] jVarArr3 = (j[]) listO2.toArray(new j[0]);
        f39721j = aVar3.b((j[]) Arrays.copyOf(jVarArr3, jVarArr3.length)).e(i0Var, i0Var2, i0.TLS_1_1, i0.TLS_1_0).d(true).a();
        f39722k = new a(false).a();
    }

    public m(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f39723a = z10;
        this.f39724b = z11;
        this.f39725c = strArr;
        this.f39726d = strArr2;
    }

    private final m g(SSLSocket sSLSocket, boolean z10) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        kotlin.jvm.internal.s.e(enabledCipherSuites);
        String[] strArrC = hn.b.c(this, enabledCipherSuites);
        if (this.f39726d != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.s.g(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = hn.m.w(enabledProtocols2, this.f39726d, jl.a.d());
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.s.e(supportedCipherSuites);
        int iO = hn.m.o(supportedCipherSuites, "TLS_FALLBACK_SCSV", j.f39643b.c());
        if (z10 && iO != -1) {
            String str = supportedCipherSuites[iO];
            kotlin.jvm.internal.s.g(str, "get(...)");
            strArrC = hn.m.g(strArrC, str);
        }
        return new a(this).c((String[]) Arrays.copyOf(strArrC, strArrC.length)).f((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).a();
    }

    public final void b(SSLSocket sslSocket, boolean z10) {
        kotlin.jvm.internal.s.h(sslSocket, "sslSocket");
        m mVarG = g(sslSocket, z10);
        if (mVarG.i() != null) {
            sslSocket.setEnabledProtocols(mVarG.f39726d);
        }
        if (mVarG.c() != null) {
            sslSocket.setEnabledCipherSuites(mVarG.f39725c);
        }
    }

    public final List c() {
        String[] strArr = this.f39725c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(j.f39643b.b(str));
        }
        return arrayList;
    }

    public final String[] d() {
        return this.f39725c;
    }

    public final boolean e(SSLSocket socket) {
        kotlin.jvm.internal.s.h(socket, "socket");
        if (!this.f39723a) {
            return false;
        }
        String[] strArr = this.f39726d;
        if (strArr != null && !hn.m.n(strArr, socket.getEnabledProtocols(), jl.a.d())) {
            return false;
        }
        String[] strArr2 = this.f39725c;
        return strArr2 == null || hn.m.n(strArr2, socket.getEnabledCipherSuites(), j.f39643b.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f39723a;
        m mVar = (m) obj;
        if (z10 != mVar.f39723a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f39725c, mVar.f39725c) && Arrays.equals(this.f39726d, mVar.f39726d) && this.f39724b == mVar.f39724b);
    }

    public final boolean f() {
        return this.f39723a;
    }

    public final boolean h() {
        return this.f39724b;
    }

    public int hashCode() {
        if (!this.f39723a) {
            return 17;
        }
        String[] strArr = this.f39725c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f39726d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f39724b ? 1 : 0);
    }

    public final List i() {
        String[] strArr = this.f39726d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(i0.f39632b.a(str));
        }
        return arrayList;
    }

    public String toString() {
        if (!this.f39723a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(c(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f39724b + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f39727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String[] f39728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String[] f39729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f39730d;

        public a(boolean z10) {
            this.f39727a = z10;
        }

        public final m a() {
            return new m(this.f39727a, this.f39730d, this.f39728b, this.f39729c);
        }

        public final a b(j... cipherSuites) {
            kotlin.jvm.internal.s.h(cipherSuites, "cipherSuites");
            if (!this.f39727a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (j jVar : cipherSuites) {
                arrayList.add(jVar.c());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return c((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a c(String... cipherSuites) {
            kotlin.jvm.internal.s.h(cipherSuites, "cipherSuites");
            if (!this.f39727a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuites, cipherSuites.length);
            kotlin.jvm.internal.s.g(objArrCopyOf, "copyOf(...)");
            this.f39728b = (String[]) objArrCopyOf;
            return this;
        }

        public final a d(boolean z10) {
            if (!this.f39727a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f39730d = z10;
            return this;
        }

        public final a e(i0... tlsVersions) {
            kotlin.jvm.internal.s.h(tlsVersions, "tlsVersions");
            if (!this.f39727a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (i0 i0Var : tlsVersions) {
                arrayList.add(i0Var.g());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return f((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a f(String... tlsVersions) {
            kotlin.jvm.internal.s.h(tlsVersions, "tlsVersions");
            if (!this.f39727a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            Object[] objArrCopyOf = Arrays.copyOf(tlsVersions, tlsVersions.length);
            kotlin.jvm.internal.s.g(objArrCopyOf, "copyOf(...)");
            this.f39729c = (String[]) objArrCopyOf;
            return this;
        }

        public a(m connectionSpec) {
            kotlin.jvm.internal.s.h(connectionSpec, "connectionSpec");
            this.f39727a = connectionSpec.f();
            this.f39728b = connectionSpec.d();
            this.f39729c = connectionSpec.f39726d;
            this.f39730d = connectionSpec.h();
        }
    }
}
