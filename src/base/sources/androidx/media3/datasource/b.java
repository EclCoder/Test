package androidx.media3.datasource;

import android.content.Context;
import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import w1.c0;
import w1.n;
import z1.g;
import z1.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b implements androidx.media3.datasource.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f4732b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.datasource.a f4733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.media3.datasource.a f4734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.media3.datasource.a f4735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.media3.datasource.a f4736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.media3.datasource.a f4737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private androidx.media3.datasource.a f4738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.media3.datasource.a f4739i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.media3.datasource.a f4740j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.media3.datasource.a f4741k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements androidx.media3.datasource.a.InterfaceC0055a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f4742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.media3.datasource.a.InterfaceC0055a f4743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private m f4744c;

        public a(Context context) {
            this(context, new c.b());
        }

        @Override // androidx.media3.datasource.a.InterfaceC0055a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createDataSource() {
            b bVar = new b(this.f4742a, this.f4743b.createDataSource());
            m mVar = this.f4744c;
            if (mVar != null) {
                bVar.c(mVar);
            }
            return bVar;
        }

        public a(Context context, androidx.media3.datasource.a.InterfaceC0055a interfaceC0055a) {
            this.f4742a = context.getApplicationContext();
            this.f4743b = interfaceC0055a;
        }
    }

    public b(Context context, androidx.media3.datasource.a aVar) {
        this.f4731a = context.getApplicationContext();
        this.f4733c = (androidx.media3.datasource.a) w1.a.e(aVar);
    }

    private void d(androidx.media3.datasource.a aVar) {
        for (int i10 = 0; i10 < this.f4732b.size(); i10++) {
            aVar.c((m) this.f4732b.get(i10));
        }
    }

    private androidx.media3.datasource.a e() {
        if (this.f4735e == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.f4731a);
            this.f4735e = assetDataSource;
            d(assetDataSource);
        }
        return this.f4735e;
    }

    private androidx.media3.datasource.a f() {
        if (this.f4736f == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.f4731a);
            this.f4736f = contentDataSource;
            d(contentDataSource);
        }
        return this.f4736f;
    }

    private androidx.media3.datasource.a g() {
        if (this.f4739i == null) {
            z1.c cVar = new z1.c();
            this.f4739i = cVar;
            d(cVar);
        }
        return this.f4739i;
    }

    private androidx.media3.datasource.a h() {
        if (this.f4734d == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.f4734d = fileDataSource;
            d(fileDataSource);
        }
        return this.f4734d;
    }

    private androidx.media3.datasource.a i() {
        if (this.f4740j == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f4731a);
            this.f4740j = rawResourceDataSource;
            d(rawResourceDataSource);
        }
        return this.f4740j;
    }

    private androidx.media3.datasource.a j() {
        if (this.f4737g == null) {
            try {
                androidx.media3.datasource.a aVar = (androidx.media3.datasource.a) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f4737g = aVar;
                d(aVar);
            } catch (ClassNotFoundException unused) {
                n.h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f4737g == null) {
                this.f4737g = this.f4733c;
            }
        }
        return this.f4737g;
    }

    private androidx.media3.datasource.a k() {
        if (this.f4738h == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.f4738h = udpDataSource;
            d(udpDataSource);
        }
        return this.f4738h;
    }

    private void l(androidx.media3.datasource.a aVar, m mVar) {
        if (aVar != null) {
            aVar.c(mVar);
        }
    }

    @Override // androidx.media3.datasource.a
    public long a(g gVar) {
        w1.a.g(this.f4741k == null);
        String scheme = gVar.f58544a.getScheme();
        if (c0.z0(gVar.f58544a)) {
            String path = gVar.f58544a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f4741k = h();
            } else {
                this.f4741k = e();
            }
        } else if ("asset".equals(scheme)) {
            this.f4741k = e();
        } else if ("content".equals(scheme)) {
            this.f4741k = f();
        } else if ("rtmp".equals(scheme)) {
            this.f4741k = j();
        } else if ("udp".equals(scheme)) {
            this.f4741k = k();
        } else if (DataSchemeDataSource.SCHEME_DATA.equals(scheme)) {
            this.f4741k = g();
        } else if (com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) || "android.resource".equals(scheme)) {
            this.f4741k = i();
        } else {
            this.f4741k = this.f4733c;
        }
        return this.f4741k.a(gVar);
    }

    @Override // androidx.media3.datasource.a
    public void c(m mVar) {
        w1.a.e(mVar);
        this.f4733c.c(mVar);
        this.f4732b.add(mVar);
        l(this.f4734d, mVar);
        l(this.f4735e, mVar);
        l(this.f4736f, mVar);
        l(this.f4737g, mVar);
        l(this.f4738h, mVar);
        l(this.f4739i, mVar);
        l(this.f4740j, mVar);
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        androidx.media3.datasource.a aVar = this.f4741k;
        if (aVar != null) {
            try {
                aVar.close();
            } finally {
                this.f4741k = null;
            }
        }
    }

    @Override // androidx.media3.datasource.a
    public Map getResponseHeaders() {
        androidx.media3.datasource.a aVar = this.f4741k;
        return aVar == null ? Collections.EMPTY_MAP : aVar.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        androidx.media3.datasource.a aVar = this.f4741k;
        if (aVar == null) {
            return null;
        }
        return aVar.getUri();
    }

    @Override // t1.g
    public int read(byte[] bArr, int i10, int i11) {
        return ((androidx.media3.datasource.a) w1.a.e(this.f4741k)).read(bArr, i10, i11);
    }
}
