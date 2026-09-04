package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.google.api.client.http.HttpMethods;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.thrid.okio.s;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final c[] f33268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Map<com.mbridge.msdk.thrid.okio.f, Integer> f33269b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<c> f33270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.e f33271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f33272c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f33273d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        c[] f33274e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f33275f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f33276g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f33277h;

        a(int i10, s sVar) {
            this(i10, i10, sVar);
        }

        private void a() {
            int i10 = this.f33273d;
            int i11 = this.f33277h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    b(i11 - i10);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f33274e, (Object) null);
            this.f33275f = this.f33274e.length - 1;
            this.f33276g = 0;
            this.f33277h = 0;
        }

        private boolean d(int i10) {
            return i10 >= 0 && i10 <= d.f33268a.length - 1;
        }

        private void e(int i10) throws IOException {
            if (d(i10)) {
                this.f33270a.add(d.f33268a[i10]);
                return;
            }
            int iA = a(i10 - d.f33268a.length);
            if (iA >= 0) {
                c[] cVarArr = this.f33274e;
                if (iA < cVarArr.length) {
                    this.f33270a.add(cVarArr[iA]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void g(int i10) throws IOException {
            this.f33270a.add(new c(c(i10), e()));
        }

        private void h() throws IOException {
            this.f33270a.add(new c(d.a(e()), e()));
        }

        public List<c> c() {
            ArrayList arrayList = new ArrayList(this.f33270a);
            this.f33270a.clear();
            return arrayList;
        }

        void f() throws IOException {
            while (!this.f33271b.f()) {
                byte b10 = this.f33271b.readByte();
                int i10 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (i10 == 128) {
                    throw new IOException("index == 0");
                }
                if ((b10 & 128) == 128) {
                    e(a(i10, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) - 1);
                } else if (i10 == 64) {
                    g();
                } else if ((b10 & 64) == 64) {
                    f(a(i10, 63) - 1);
                } else if ((b10 & 32) == 32) {
                    int iA = a(i10, 31);
                    this.f33273d = iA;
                    if (iA < 0 || iA > this.f33272c) {
                        throw new IOException("Invalid dynamic table size update " + this.f33273d);
                    }
                    a();
                } else if (i10 == 16 || i10 == 0) {
                    h();
                } else {
                    g(a(i10, 15) - 1);
                }
            }
        }

        a(int i10, int i11, s sVar) {
            this.f33270a = new ArrayList();
            this.f33274e = new c[8];
            this.f33275f = 7;
            this.f33276g = 0;
            this.f33277h = 0;
            this.f33272c = i10;
            this.f33273d = i11;
            this.f33271b = com.mbridge.msdk.thrid.okio.l.a(sVar);
        }

        private int d() {
            return this.f33271b.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }

        private com.mbridge.msdk.thrid.okio.f c(int i10) throws IOException {
            if (d(i10)) {
                return d.f33268a[i10].f33265a;
            }
            int iA = a(i10 - d.f33268a.length);
            if (iA >= 0) {
                c[] cVarArr = this.f33274e;
                if (iA < cVarArr.length) {
                    return cVarArr[iA].f33265a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private int a(int i10) {
            return this.f33275f + 1 + i10;
        }

        private void g() {
            a(-1, new c(d.a(e()), e()));
        }

        private void a(int i10, c cVar) {
            this.f33270a.add(cVar);
            int i11 = cVar.f33267c;
            if (i10 != -1) {
                i11 -= this.f33274e[a(i10)].f33267c;
            }
            int i12 = this.f33273d;
            if (i11 > i12) {
                b();
                return;
            }
            int iB = b((this.f33277h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f33276g + 1;
                c[] cVarArr = this.f33274e;
                if (i13 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f33275f = this.f33274e.length - 1;
                    this.f33274e = cVarArr2;
                }
                int i14 = this.f33275f;
                this.f33275f = i14 - 1;
                this.f33274e[i14] = cVar;
                this.f33276g++;
            } else {
                this.f33274e[i10 + a(i10) + iB] = cVar;
            }
            this.f33277h += i11;
        }

        private int b(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f33274e.length;
                while (true) {
                    length--;
                    i11 = this.f33275f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f33274e[length].f33267c;
                    i10 -= i13;
                    this.f33277h -= i13;
                    this.f33276g--;
                    i12++;
                }
                c[] cVarArr = this.f33274e;
                int i14 = i11 + 1;
                System.arraycopy(cVarArr, i14, cVarArr, i14 + i12, this.f33276g);
                this.f33275f += i12;
            }
            return i12;
        }

        com.mbridge.msdk.thrid.okio.f e() {
            int iD = d();
            boolean z10 = (iD & 128) == 128;
            int iA = a(iD, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
            if (z10) {
                return com.mbridge.msdk.thrid.okio.f.a(k.b().a(this.f33271b.c(iA)));
            }
            return this.f33271b.b(iA);
        }

        private void f(int i10) {
            a(-1, new c(c(i10), e()));
        }

        int a(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int iD = d();
                if ((iD & 128) == 0) {
                    return i11 + (iD << i13);
                }
                i11 += (iD & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) << i13;
                i13 += 7;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f33278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f33279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f33280c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f33281d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f33282e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f33283f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        c[] f33284g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f33285h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f33286i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f33287j;

        b(com.mbridge.msdk.thrid.okio.c cVar) {
            this(4096, true, cVar);
        }

        private int a(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f33284g.length;
                while (true) {
                    length--;
                    i11 = this.f33285h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f33284g[length].f33267c;
                    i10 -= i13;
                    this.f33287j -= i13;
                    this.f33286i--;
                    i12++;
                }
                c[] cVarArr = this.f33284g;
                int i14 = i11 + 1;
                System.arraycopy(cVarArr, i14, cVarArr, i14 + i12, this.f33286i);
                c[] cVarArr2 = this.f33284g;
                int i15 = this.f33285h + 1;
                Arrays.fill(cVarArr2, i15, i15 + i12, (Object) null);
                this.f33285h += i12;
            }
            return i12;
        }

        private void b() {
            Arrays.fill(this.f33284g, (Object) null);
            this.f33285h = this.f33284g.length - 1;
            this.f33286i = 0;
            this.f33287j = 0;
        }

        b(int i10, boolean z10, com.mbridge.msdk.thrid.okio.c cVar) {
            this.f33280c = Integer.MAX_VALUE;
            this.f33284g = new c[8];
            this.f33285h = 7;
            this.f33286i = 0;
            this.f33287j = 0;
            this.f33282e = i10;
            this.f33283f = i10;
            this.f33279b = z10;
            this.f33278a = cVar;
        }

        void b(int i10) {
            this.f33282e = i10;
            int iMin = Math.min(i10, 16384);
            int i11 = this.f33283f;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.f33280c = Math.min(this.f33280c, iMin);
            }
            this.f33281d = true;
            this.f33283f = iMin;
            a();
        }

        private void a(c cVar) {
            int i10 = cVar.f33267c;
            int i11 = this.f33283f;
            if (i10 > i11) {
                b();
                return;
            }
            a((this.f33287j + i10) - i11);
            int i12 = this.f33286i + 1;
            c[] cVarArr = this.f33284g;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f33285h = this.f33284g.length - 1;
                this.f33284g = cVarArr2;
            }
            int i13 = this.f33285h;
            this.f33285h = i13 - 1;
            this.f33284g[i13] = cVar;
            this.f33286i++;
            this.f33287j += i10;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0069  */
        void a(List<c> list) {
            int length;
            int length2;
            if (this.f33281d) {
                int i10 = this.f33280c;
                if (i10 < this.f33283f) {
                    a(i10, 31, 32);
                }
                this.f33281d = false;
                this.f33280c = Integer.MAX_VALUE;
                a(this.f33283f, 31, 32);
            }
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                c cVar = list.get(i11);
                com.mbridge.msdk.thrid.okio.f fVarK = cVar.f33265a.k();
                com.mbridge.msdk.thrid.okio.f fVar = cVar.f33266b;
                Integer num = d.f33269b.get(fVarK);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (length2 <= 1 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else {
                        c[] cVarArr = d.f33268a;
                        if (com.mbridge.msdk.thrid.okhttp.internal.c.a(cVarArr[iIntValue].f33266b, fVar)) {
                            length = length2;
                        } else if (com.mbridge.msdk.thrid.okhttp.internal.c.a(cVarArr[length2].f33266b, fVar)) {
                            length2 = iIntValue + 2;
                            length = length2;
                        } else {
                            length = length2;
                            length2 = -1;
                        }
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = this.f33284g.length;
                    for (int i12 = this.f33285h + 1; i12 < length3; i12++) {
                        if (com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f33284g[i12].f33265a, fVarK)) {
                            if (com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f33284g[i12].f33266b, fVar)) {
                                length2 = (i12 - this.f33285h) + d.f33268a.length;
                                break;
                            } else if (length == -1) {
                                length = (i12 - this.f33285h) + d.f33268a.length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    a(length2, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 128);
                } else if (length == -1) {
                    this.f33278a.writeByte(64);
                    a(fVarK);
                    a(fVar);
                    a(cVar);
                } else if (fVarK.b(c.f33259d) && !c.f33264i.equals(fVarK)) {
                    a(length, 15, 0);
                    a(fVar);
                } else {
                    a(length, 63, 64);
                    a(fVar);
                    a(cVar);
                }
            }
        }

        void a(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f33278a.writeByte(i10 | i12);
                return;
            }
            this.f33278a.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f33278a.writeByte(128 | (i13 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE));
                i13 >>>= 7;
            }
            this.f33278a.writeByte(i13);
        }

        void a(com.mbridge.msdk.thrid.okio.f fVar) {
            if (this.f33279b && k.b().a(fVar) < fVar.j()) {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                k.b().a(fVar, cVar);
                com.mbridge.msdk.thrid.okio.f fVarO = cVar.o();
                a(fVarO.j(), Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 128);
                this.f33278a.a(fVarO);
                return;
            }
            a(fVar.j(), Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 0);
            this.f33278a.a(fVar);
        }

        private void a() {
            int i10 = this.f33283f;
            int i11 = this.f33287j;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    a(i11 - i10);
                }
            }
        }
    }

    static {
        c cVar = new c(c.f33264i, "");
        com.mbridge.msdk.thrid.okio.f fVar = c.f33261f;
        c cVar2 = new c(fVar, HttpMethods.GET);
        c cVar3 = new c(fVar, HttpMethods.POST);
        com.mbridge.msdk.thrid.okio.f fVar2 = c.f33262g;
        c cVar4 = new c(fVar2, "/");
        c cVar5 = new c(fVar2, "/index.html");
        com.mbridge.msdk.thrid.okio.f fVar3 = c.f33263h;
        c cVar6 = new c(fVar3, "http");
        c cVar7 = new c(fVar3, "https");
        com.mbridge.msdk.thrid.okio.f fVar4 = c.f33260e;
        f33268a = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(fVar4, "200"), new c(fVar4, "204"), new c(fVar4, "206"), new c(fVar4, "304"), new c(fVar4, "400"), new c(fVar4, "404"), new c(fVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c(DownloadModel.ETAG, ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c(ToolBar.REFRESH, ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f33269b = a();
    }

    private static Map<com.mbridge.msdk.thrid.okio.f, Integer> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f33268a.length);
        int i10 = 0;
        while (true) {
            c[] cVarArr = f33268a;
            if (i10 >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i10].f33265a)) {
                linkedHashMap.put(cVarArr[i10].f33265a, Integer.valueOf(i10));
            }
            i10++;
        }
    }

    static com.mbridge.msdk.thrid.okio.f a(com.mbridge.msdk.thrid.okio.f fVar) throws IOException {
        int iJ = fVar.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            byte bA = fVar.a(i10);
            if (bA >= 65 && bA <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.m());
            }
        }
        return fVar;
    }
}
