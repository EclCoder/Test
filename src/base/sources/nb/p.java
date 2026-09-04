package nb;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.AssetDataSource;
import com.google.android.exoplayer2.upstream.ContentDataSource;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f47019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f47020b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f47021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j f47022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j f47023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j f47024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j f47025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j f47026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private j f47027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private j f47028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private j f47029k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f47030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final j.a f47031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a0 f47032c;

        public a(Context context) {
            this(context, new q.b());
        }

        @Override // nb.j.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p createDataSource() {
            p pVar = new p(this.f47030a, this.f47031b.createDataSource());
            a0 a0Var = this.f47032c;
            if (a0Var != null) {
                pVar.d(a0Var);
            }
            return pVar;
        }

        public a(Context context, j.a aVar) {
            this.f47030a = context.getApplicationContext();
            this.f47031b = aVar;
        }
    }

    public p(Context context, j jVar) {
        this.f47019a = context.getApplicationContext();
        this.f47021c = (j) ob.a.e(jVar);
    }

    private void f(j jVar) {
        for (int i10 = 0; i10 < this.f47020b.size(); i10++) {
            jVar.d((a0) this.f47020b.get(i10));
        }
    }

    private j i() {
        if (this.f47023e == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.f47019a);
            this.f47023e = assetDataSource;
            f(assetDataSource);
        }
        return this.f47023e;
    }

    private j j() {
        if (this.f47024f == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.f47019a);
            this.f47024f = contentDataSource;
            f(contentDataSource);
        }
        return this.f47024f;
    }

    private j k() {
        if (this.f47027i == null) {
            i iVar = new i();
            this.f47027i = iVar;
            f(iVar);
        }
        return this.f47027i;
    }

    private j l() {
        if (this.f47022d == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.f47022d = fileDataSource;
            f(fileDataSource);
        }
        return this.f47022d;
    }

    private j m() {
        if (this.f47028j == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f47019a);
            this.f47028j = rawResourceDataSource;
            f(rawResourceDataSource);
        }
        return this.f47028j;
    }

    private j n() {
        if (this.f47025g == null) {
            try {
                j jVar = (j) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f47025g = jVar;
                f(jVar);
            } catch (ClassNotFoundException unused) {
                ob.u.i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f47025g == null) {
                this.f47025g = this.f47021c;
            }
        }
        return this.f47025g;
    }

    private j o() {
        if (this.f47026h == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.f47026h = udpDataSource;
            f(udpDataSource);
        }
        return this.f47026h;
    }

    private void p(j jVar, a0 a0Var) {
        if (jVar != null) {
            jVar.d(a0Var);
        }
    }

    @Override // nb.j
    public void close() {
        j jVar = this.f47029k;
        if (jVar != null) {
            try {
                jVar.close();
            } finally {
                this.f47029k = null;
            }
        }
    }

    @Override // nb.j
    public void d(a0 a0Var) {
        ob.a.e(a0Var);
        this.f47021c.d(a0Var);
        this.f47020b.add(a0Var);
        p(this.f47022d, a0Var);
        p(this.f47023e, a0Var);
        p(this.f47024f, a0Var);
        p(this.f47025g, a0Var);
        p(this.f47026h, a0Var);
        p(this.f47027i, a0Var);
        p(this.f47028j, a0Var);
    }

    @Override // nb.j
    public Map getResponseHeaders() {
        j jVar = this.f47029k;
        return jVar == null ? Collections.EMPTY_MAP : jVar.getResponseHeaders();
    }

    @Override // nb.j
    public Uri getUri() {
        j jVar = this.f47029k;
        if (jVar == null) {
            return null;
        }
        return jVar.getUri();
    }

    @Override // nb.j
    public long h(com.google.android.exoplayer2.upstream.a aVar) {
        ob.a.g(this.f47029k == null);
        String scheme = aVar.f18779a.getScheme();
        if (r0.D0(aVar.f18779a)) {
            String path = aVar.f18779a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f47029k = l();
            } else {
                this.f47029k = i();
            }
        } else if ("asset".equals(scheme)) {
            this.f47029k = i();
        } else if ("content".equals(scheme)) {
            this.f47029k = j();
        } else if ("rtmp".equals(scheme)) {
            this.f47029k = n();
        } else if ("udp".equals(scheme)) {
            this.f47029k = o();
        } else if (DataSchemeDataSource.SCHEME_DATA.equals(scheme)) {
            this.f47029k = k();
        } else if (com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) || "android.resource".equals(scheme)) {
            this.f47029k = m();
        } else {
            this.f47029k = this.f47021c;
        }
        return this.f47029k.h(aVar);
    }

    @Override // nb.h
    public int read(byte[] bArr, int i10, int i11) {
        return ((j) ob.a.e(this.f47029k)).read(bArr, i10, i11);
    }
}
