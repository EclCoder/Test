package on;

import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.google.api.client.http.HttpMethods;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xn.c0;
import xn.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f49030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c[] f49031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f49032c;

    private d() {
    }

    private final Map d() {
        c[] cVarArr = f49031b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length, 1.0f);
        int length = cVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            c[] cVarArr2 = f49031b;
            if (!linkedHashMap.containsKey(cVarArr2[i10].f49027a)) {
                linkedHashMap.put(cVarArr2[i10].f49027a, Integer.valueOf(i10));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.s.g(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    public final xn.h a(xn.h name) throws IOException {
        kotlin.jvm.internal.s.h(name, "name");
        int iD = name.D();
        for (int i10 = 0; i10 < iD; i10++) {
            byte bJ = name.j(i10);
            if (65 <= bJ && bJ < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.K());
            }
        }
        return name;
    }

    public final Map b() {
        return f49032c;
    }

    public final c[] c() {
        return f49031b;
    }

    static {
        d dVar = new d();
        f49030a = dVar;
        c cVar = new c(c.f49026j, "");
        xn.h hVar = c.f49023g;
        c cVar2 = new c(hVar, HttpMethods.GET);
        c cVar3 = new c(hVar, HttpMethods.POST);
        xn.h hVar2 = c.f49024h;
        c cVar4 = new c(hVar2, "/");
        c cVar5 = new c(hVar2, "/index.html");
        xn.h hVar3 = c.f49025i;
        c cVar6 = new c(hVar3, "http");
        c cVar7 = new c(hVar3, "https");
        xn.h hVar4 = c.f49022f;
        f49031b = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(hVar4, "200"), new c(hVar4, "204"), new c(hVar4, "206"), new c(hVar4, "304"), new c(hVar4, "400"), new c(hVar4, "404"), new c(hVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c(dOIDCKnIR.CkKBlKgmhNX, ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c(obFGmWgqyy.NVdptrzw, ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c(DownloadModel.ETAG, ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c(ToolBar.REFRESH, ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f49032c = dVar.d();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f49033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f49034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f49035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f49036d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final xn.g f49037e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c[] f49038f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f49039g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f49040h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f49041i;

        public a(q0 source, int i10, int i11) {
            kotlin.jvm.internal.s.h(source, "source");
            this.f49033a = i10;
            this.f49034b = i11;
            this.f49035c = new ArrayList();
            this.f49037e = c0.c(source);
            c[] cVarArr = new c[8];
            this.f49038f = cVarArr;
            this.f49039g = cVarArr.length - 1;
        }

        private final void a(c cVar) throws IOException {
            this.f49035c.add(cVar);
            long jD = this.f49036d + ((long) (cVar.f49027a.D() + cVar.f49028b.D()));
            this.f49036d = jD;
            if (jD > 262144) {
                throw new IOException("header byte count limit of 262144 exceeded");
            }
        }

        private final void b() {
            int i10 = this.f49034b;
            int i11 = this.f49041i;
            if (i10 < i11) {
                if (i10 == 0) {
                    c();
                } else {
                    e(i11 - i10);
                }
            }
        }

        private final void c() {
            gl.j.x(this.f49038f, null, 0, 0, 6, null);
            this.f49039g = this.f49038f.length - 1;
            this.f49040h = 0;
            this.f49041i = 0;
        }

        private final int d(int i10) {
            return this.f49039g + 1 + i10;
        }

        private final int e(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f49038f.length;
                while (true) {
                    length--;
                    i11 = this.f49039g;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c cVar = this.f49038f[length];
                    kotlin.jvm.internal.s.e(cVar);
                    int i13 = cVar.f49029c;
                    i10 -= i13;
                    this.f49041i -= i13;
                    this.f49040h--;
                    i12++;
                }
                c[] cVarArr = this.f49038f;
                System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f49040h);
                this.f49039g += i12;
            }
            return i12;
        }

        private final xn.h g(int i10) throws IOException {
            if (i(i10)) {
                return d.f49030a.c()[i10].f49027a;
            }
            int iD = d(i10 - d.f49030a.c().length);
            if (iD >= 0) {
                c[] cVarArr = this.f49038f;
                if (iD < cVarArr.length) {
                    c cVar = cVarArr[iD];
                    kotlin.jvm.internal.s.e(cVar);
                    return cVar.f49027a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void h(int i10, c cVar) throws IOException {
            a(cVar);
            int i11 = cVar.f49029c;
            if (i10 != -1) {
                c cVar2 = this.f49038f[d(i10)];
                kotlin.jvm.internal.s.e(cVar2);
                i11 -= cVar2.f49029c;
            }
            int i12 = this.f49034b;
            if (i11 > i12) {
                c();
                return;
            }
            int iE = e((this.f49041i + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f49040h + 1;
                c[] cVarArr = this.f49038f;
                if (i13 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f49039g = this.f49038f.length - 1;
                    this.f49038f = cVarArr2;
                }
                int i14 = this.f49039g;
                this.f49039g = i14 - 1;
                this.f49038f[i14] = cVar;
                this.f49040h++;
            } else {
                this.f49038f[i10 + d(i10) + iE] = cVar;
            }
            this.f49041i += i11;
        }

        private final boolean i(int i10) {
            return i10 >= 0 && i10 <= d.f49030a.c().length - 1;
        }

        private final int j() {
            return hn.m.b(this.f49037e.readByte(), 255);
        }

        private final void m(int i10) throws IOException {
            if (i(i10)) {
                a(d.f49030a.c()[i10]);
                return;
            }
            int iD = d(i10 - d.f49030a.c().length);
            if (iD >= 0) {
                c[] cVarArr = this.f49038f;
                if (iD < cVarArr.length) {
                    c cVar = cVarArr[iD];
                    kotlin.jvm.internal.s.e(cVar);
                    a(cVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void o(int i10) throws IOException {
            h(-1, new c(g(i10), k()));
        }

        private final void p() throws IOException {
            h(-1, new c(d.f49030a.a(k()), k()));
        }

        private final void q(int i10) throws IOException {
            a(new c(g(i10), k()));
        }

        private final void r() throws IOException {
            a(new c(d.f49030a.a(k()), k()));
        }

        public final List f() {
            List listI0 = gl.r.I0(this.f49035c);
            this.f49035c.clear();
            this.f49036d = 0L;
            return listI0;
        }

        public final xn.h k() throws IOException {
            int iJ = j();
            boolean z10 = (iJ & 128) == 128;
            long jN = n(iJ, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
            if (this.f49036d + jN > 262144) {
                throw new IOException("header byte count limit of 262144 exceeded");
            }
            if (!z10) {
                return this.f49037e.f0(jN);
            }
            xn.e eVar = new xn.e();
            w.f49184a.b(this.f49037e, jN, eVar);
            return eVar.B0();
        }

        public final void l() throws IOException {
            while (!this.f49037e.n0()) {
                int iB = hn.m.b(this.f49037e.readByte(), 255);
                if (iB == 128) {
                    throw new IOException("index == 0");
                }
                if ((iB & 128) == 128) {
                    m(n(iB, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) - 1);
                } else if (iB == 64) {
                    p();
                } else if ((iB & 64) == 64) {
                    o(n(iB, 63) - 1);
                } else if ((iB & 32) == 32) {
                    int iN = n(iB, 31);
                    this.f49034b = iN;
                    if (iN < 0 || iN > this.f49033a) {
                        throw new IOException("Invalid dynamic table size update " + this.f49034b);
                    }
                    b();
                } else if (iB == 16 || iB == 0) {
                    r();
                } else {
                    q(n(iB, 15) - 1);
                }
            }
        }

        public final int n(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            long j10 = i11;
            int i13 = 0;
            int i14 = 0;
            while (i13 != 5) {
                int iJ = j();
                i13++;
                long j11 = ((long) (iJ & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) << i14;
                if (j11 > 2147483647L - j10) {
                    throw new IOException("HPACK integer overflow");
                }
                j10 += j11;
                if ((iJ & 128) == 0) {
                    return (int) j10;
                }
                i14 += 7;
            }
            throw new IOException("HPACK integer overflow");
        }

        public /* synthetic */ a(q0 q0Var, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(q0Var, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f49043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final xn.e f49044c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f49045d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f49046e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f49047f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public c[] f49048g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f49049h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f49050i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f49051j;

        public b(int i10, boolean z10, xn.e out) {
            kotlin.jvm.internal.s.h(out, "out");
            this.f49042a = i10;
            this.f49043b = z10;
            this.f49044c = out;
            this.f49045d = Integer.MAX_VALUE;
            this.f49047f = i10;
            c[] cVarArr = new c[8];
            this.f49048g = cVarArr;
            this.f49049h = cVarArr.length - 1;
        }

        private final void a() {
            int i10 = this.f49047f;
            int i11 = this.f49051j;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    c(i11 - i10);
                }
            }
        }

        private final void b() {
            gl.j.x(this.f49048g, null, 0, 0, 6, null);
            this.f49049h = this.f49048g.length - 1;
            this.f49050i = 0;
            this.f49051j = 0;
        }

        private final int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f49048g.length;
                while (true) {
                    length--;
                    i11 = this.f49049h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c cVar = this.f49048g[length];
                    kotlin.jvm.internal.s.e(cVar);
                    i10 -= cVar.f49029c;
                    int i13 = this.f49051j;
                    c cVar2 = this.f49048g[length];
                    kotlin.jvm.internal.s.e(cVar2);
                    this.f49051j = i13 - cVar2.f49029c;
                    this.f49050i--;
                    i12++;
                }
                c[] cVarArr = this.f49048g;
                System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f49050i);
                c[] cVarArr2 = this.f49048g;
                int i14 = this.f49049h;
                Arrays.fill(cVarArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.f49049h += i12;
            }
            return i12;
        }

        private final void d(c cVar) {
            int i10 = cVar.f49029c;
            int i11 = this.f49047f;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.f49051j + i10) - i11);
            int i12 = this.f49050i + 1;
            c[] cVarArr = this.f49048g;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f49049h = this.f49048g.length - 1;
                this.f49048g = cVarArr2;
            }
            int i13 = this.f49049h;
            this.f49049h = i13 - 1;
            this.f49048g[i13] = cVar;
            this.f49050i++;
            this.f49051j += i10;
        }

        public final void e(int i10) {
            this.f49042a = i10;
            int iMin = Math.min(i10, 16384);
            int i11 = this.f49047f;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.f49045d = Math.min(this.f49045d, iMin);
            }
            this.f49046e = true;
            this.f49047f = iMin;
            a();
        }

        public final void f(xn.h data) {
            kotlin.jvm.internal.s.h(data, "data");
            if (this.f49043b) {
                w wVar = w.f49184a;
                if (wVar.d(data) < data.D()) {
                    xn.e eVar = new xn.e();
                    wVar.c(data, eVar);
                    xn.h hVarB0 = eVar.B0();
                    h(hVarB0.D(), Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 128);
                    this.f49044c.k0(hVarB0);
                    return;
                }
            }
            h(data.D(), Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 0);
            this.f49044c.k0(data);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0077  */
        public final void g(List headerBlock) {
            int length;
            int length2;
            kotlin.jvm.internal.s.h(headerBlock, "headerBlock");
            if (this.f49046e) {
                int i10 = this.f49045d;
                if (i10 < this.f49047f) {
                    h(i10, 31, 32);
                }
                this.f49046e = false;
                this.f49045d = Integer.MAX_VALUE;
                h(this.f49047f, 31, 32);
            }
            int size = headerBlock.size();
            for (int i11 = 0; i11 < size; i11++) {
                c cVar = (c) headerBlock.get(i11);
                xn.h hVarI = cVar.f49027a.I();
                xn.h hVar = cVar.f49028b;
                d dVar = d.f49030a;
                Integer num = (Integer) dVar.b().get(hVarI);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else if (kotlin.jvm.internal.s.c(dVar.c()[iIntValue].f49028b, hVar)) {
                        length = length2;
                    } else if (kotlin.jvm.internal.s.c(dVar.c()[length2].f49028b, hVar)) {
                        length = length2;
                        length2 = iIntValue + 2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = this.f49048g.length;
                    for (int i12 = this.f49049h + 1; i12 < length3; i12++) {
                        c cVar2 = this.f49048g[i12];
                        kotlin.jvm.internal.s.e(cVar2);
                        if (kotlin.jvm.internal.s.c(cVar2.f49027a, hVarI)) {
                            c cVar3 = this.f49048g[i12];
                            kotlin.jvm.internal.s.e(cVar3);
                            if (kotlin.jvm.internal.s.c(cVar3.f49028b, hVar)) {
                                length2 = d.f49030a.c().length + (i12 - this.f49049h);
                                break;
                            } else if (length == -1) {
                                length = (i12 - this.f49049h) + d.f49030a.c().length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    h(length2, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 128);
                } else if (length == -1) {
                    this.f49044c.writeByte(64);
                    f(hVarI);
                    f(hVar);
                    d(cVar);
                } else if (!hVarI.E(c.f49021e) || kotlin.jvm.internal.s.c(c.f49026j, hVarI)) {
                    h(length, 63, 64);
                    f(hVar);
                    d(cVar);
                } else {
                    h(length, 15, 0);
                    f(hVar);
                }
            }
        }

        public final void h(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f49044c.writeByte(i10 | i12);
                return;
            }
            this.f49044c.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f49044c.writeByte(128 | (i13 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE));
                i13 >>>= 7;
            }
            this.f49044c.writeByte(i13);
        }

        public /* synthetic */ b(int i10, boolean z10, xn.e eVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, eVar);
        }
    }
}
