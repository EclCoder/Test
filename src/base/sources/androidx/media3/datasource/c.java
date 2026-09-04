package androidx.media3.datasource;

import android.net.Uri;
import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import com.google.common.collect.e0;
import com.google.common.collect.g1;
import com.google.common.collect.v;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import sc.q;
import w1.c0;
import w1.n;
import z1.g;
import z1.h;
import z1.i;
import z1.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class c extends z1.a implements androidx.media3.datasource.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f4745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f4746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f4747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f4748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f4749i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h f4750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final h f4751k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final q f4752l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f4753m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private g f4754n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private HttpURLConnection f4755o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private InputStream f4756p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f4757q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f4758r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f4759s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f4760t;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static final class b implements androidx.media3.datasource.a.InterfaceC0055a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private m f4762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private q f4763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f4764d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f4767g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f4768h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f4769i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f4761a = new h();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f4765e = 8000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f4766f = 8000;

        @Override // androidx.media3.datasource.a.InterfaceC0055a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createDataSource() {
            c cVar = new c(this.f4764d, this.f4765e, this.f4766f, this.f4767g, this.f4768h, this.f4761a, this.f4763c, this.f4769i);
            m mVar = this.f4762b;
            if (mVar != null) {
                cVar.c(mVar);
            }
            return cVar;
        }

        public b b(String str) {
            this.f4764d = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.media3.datasource.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static class C0056c extends v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f4770a;

        public C0056c(Map map) {
            this.f4770a = map;
        }

        public static /* synthetic */ boolean m(Map.Entry entry) {
            return entry.getKey() != null;
        }

        public static /* synthetic */ boolean n(String str) {
            return str != null;
        }

        @Override // com.google.common.collect.v, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return super.g(obj);
        }

        @Override // com.google.common.collect.v, java.util.Map
        public Set entrySet() {
            return g1.b(super.entrySet(), new q() { // from class: androidx.media3.datasource.d
                @Override // sc.q
                public final boolean apply(Object obj) {
                    return c.C0056c.m((Map.Entry) obj);
                }
            });
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.h(obj);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.x
        public Map f() {
            return this.f4770a;
        }

        @Override // java.util.Map
        public int hashCode() {
            return super.k();
        }

        @Override // com.google.common.collect.v, java.util.Map
        public boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // com.google.common.collect.v, java.util.Map
        public Set keySet() {
            return g1.b(super.keySet(), new q() { // from class: androidx.media3.datasource.e
                @Override // sc.q
                public final boolean apply(Object obj) {
                    return c.C0056c.n((String) obj);
                }
            });
        }

        @Override // com.google.common.collect.v, java.util.Map
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public List get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // com.google.common.collect.v, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    private void h() {
        HttpURLConnection httpURLConnection = this.f4755o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                n.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f4755o = null;
        }
    }

    private URL i(URL url, String str, g gVar) throws HttpDataSource$HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", gVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource$HttpDataSourceException("Unsupported protocol redirect: " + protocol, gVar, 2001, 1);
            }
            if (this.f4745e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.f4746f) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e10) {
                    throw new HttpDataSource$HttpDataSourceException(e10, gVar, 2001, 1);
                }
            }
            throw new HttpDataSource$HttpDataSourceException(IAoPeRfJn.ljhaKFA + url.getProtocol() + " to " + protocol + ")", gVar, 2001, 1);
        } catch (MalformedURLException e11) {
            throw new HttpDataSource$HttpDataSourceException(e11, gVar, 2001, 1);
        }
    }

    private static boolean j(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection k(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) throws IOException {
        HttpURLConnection httpURLConnectionN = n(url);
        httpURLConnectionN.setConnectTimeout(this.f4747g);
        httpURLConnectionN.setReadTimeout(this.f4748h);
        HashMap map2 = new HashMap();
        h hVar = this.f4750j;
        if (hVar != null) {
            map2.putAll(hVar.a());
        }
        map2.putAll(this.f4751k.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionN.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = i.a(j10, j11);
        if (strA != null) {
            httpURLConnectionN.setRequestProperty(Command.HTTP_HEADER_RANGE, strA);
        }
        String str = this.f4749i;
        if (str != null) {
            httpURLConnectionN.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, str);
        }
        httpURLConnectionN.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnectionN.setInstanceFollowRedirects(z11);
        httpURLConnectionN.setDoOutput(bArr != null);
        httpURLConnectionN.setRequestMethod(g.c(i10));
        if (bArr == null) {
            httpURLConnectionN.connect();
            return httpURLConnectionN;
        }
        httpURLConnectionN.setFixedLengthStreamingMode(bArr.length);
        httpURLConnectionN.connect();
        OutputStream outputStream = httpURLConnectionN.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnectionN;
    }

    private HttpURLConnection l(g gVar) throws IOException {
        URL url = new URL(gVar.f58544a.toString());
        int i10 = gVar.f58546c;
        byte[] bArr = gVar.f58547d;
        long j10 = gVar.f58550g;
        long j11 = gVar.f58551h;
        int i11 = 1;
        boolean zD = gVar.d(1);
        if (!this.f4745e && !this.f4746f && !this.f4753m) {
            return k(url, i10, bArr, j10, j11, zD, true, gVar.f58548e);
        }
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException("Too many redirects: " + i13), gVar, 2001, 1);
            }
            HttpURLConnection httpURLConnectionK = k(url, i10, bArr, j10, j11, zD, false, gVar.f58548e);
            int responseCode = httpURLConnectionK.getResponseCode();
            String headerField = httpURLConnectionK.getHeaderField("Location");
            if ((i10 == i11 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionK.disconnect();
                url = i(url, headerField, gVar);
            } else {
                if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionK;
                }
                httpURLConnectionK.disconnect();
                if (!this.f4753m || responseCode != 302) {
                    bArr = null;
                    i10 = 1;
                }
                url = i(url, headerField, gVar);
            }
            i12 = i13;
            i11 = 1;
        }
    }

    private static void m(HttpURLConnection httpURLConnection, long j10) {
        if (httpURLConnection == null || c0.f55769a > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j10 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j10 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = ((Class) w1.a.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    private int o(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f4759s;
        if (j10 != -1) {
            long j11 = j10 - this.f4760t;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int i12 = ((InputStream) c0.h(this.f4756p)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f4760t += (long) i12;
        d(i12);
        return i12;
    }

    private void p(long j10, g gVar) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int i10 = ((InputStream) c0.h(this.f4756p)).read(bArr, 0, (int) Math.min(j10, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), gVar, 2000, 1);
            }
            if (i10 == -1) {
                throw new HttpDataSource$HttpDataSourceException(gVar, 2008, 1);
            }
            j10 -= (long) i10;
            d(i10);
        }
    }

    @Override // androidx.media3.datasource.a
    public long a(final g gVar) throws HttpDataSource$HttpDataSourceException {
        byte[] bArrE;
        this.f4754n = gVar;
        long j10 = 0;
        this.f4760t = 0L;
        this.f4759s = 0L;
        f(gVar);
        try {
            HttpURLConnection httpURLConnectionL = l(gVar);
            this.f4755o = httpURLConnectionL;
            this.f4758r = httpURLConnectionL.getResponseCode();
            String responseMessage = httpURLConnectionL.getResponseMessage();
            int i10 = this.f4758r;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionL.getHeaderFields();
                if (this.f4758r == 416) {
                    if (gVar.f58550g == i.c(httpURLConnectionL.getHeaderField("Content-Range"))) {
                        this.f4757q = true;
                        g(gVar);
                        long j11 = gVar.f58551h;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionL.getErrorStream();
                try {
                    bArrE = errorStream != null ? vc.a.e(errorStream) : c0.f55774f;
                } catch (IOException unused) {
                    bArrE = c0.f55774f;
                }
                byte[] bArr = bArrE;
                h();
                throw new HttpDataSource$InvalidResponseCodeException(this.f4758r, responseMessage, this.f4758r == 416 ? new DataSourceException(2008) : null, headerFields, gVar, bArr);
            }
            final String contentType = httpURLConnectionL.getContentType();
            q qVar = this.f4752l;
            if (qVar != null && !qVar.apply(contentType)) {
                h();
                throw new HttpDataSource$HttpDataSourceException(contentType, gVar) { // from class: androidx.media3.datasource.HttpDataSource$InvalidContentTypeException

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final String f4711d;

                    {
                        super("Invalid content type: " + contentType, gVar, 2003, 1);
                        this.f4711d = contentType;
                    }
                };
            }
            if (this.f4758r == 200) {
                long j12 = gVar.f58550g;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            boolean zJ = j(httpURLConnectionL);
            if (zJ) {
                this.f4759s = gVar.f58551h;
            } else {
                long j13 = gVar.f58551h;
                if (j13 != -1) {
                    this.f4759s = j13;
                } else {
                    long jB = i.b(httpURLConnectionL.getHeaderField("Content-Length"), httpURLConnectionL.getHeaderField("Content-Range"));
                    this.f4759s = jB != -1 ? jB - j10 : -1L;
                }
            }
            try {
                this.f4756p = httpURLConnectionL.getInputStream();
                if (zJ) {
                    this.f4756p = new GZIPInputStream(this.f4756p);
                }
                this.f4757q = true;
                g(gVar);
                try {
                    p(j10, gVar);
                    return this.f4759s;
                } catch (IOException e10) {
                    h();
                    if (e10 instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e10);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e10, gVar, 2000, 1);
                }
            } catch (IOException e11) {
                h();
                throw new HttpDataSource$HttpDataSourceException(e11, gVar, 2000, 1);
            }
        } catch (IOException e12) {
            h();
            throw HttpDataSource$HttpDataSourceException.c(e12, gVar, 1);
        }
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        try {
            InputStream inputStream = this.f4756p;
            if (inputStream != null) {
                long j10 = this.f4759s;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f4760t;
                }
                m(this.f4755o, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new HttpDataSource$HttpDataSourceException(e10, (g) c0.h(this.f4754n), 2000, 3);
                }
            }
            this.f4756p = null;
            h();
            if (this.f4757q) {
                this.f4757q = false;
                e();
            }
        } catch (Throwable th2) {
            this.f4756p = null;
            h();
            if (this.f4757q) {
                this.f4757q = false;
                e();
            }
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.a
    public Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f4755o;
        return httpURLConnection == null ? e0.q() : new C0056c(httpURLConnection.getHeaderFields());
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f4755o;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    HttpURLConnection n(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // t1.g
    public int read(byte[] bArr, int i10, int i11) throws HttpDataSource$HttpDataSourceException {
        try {
            return o(bArr, i10, i11);
        } catch (IOException e10) {
            throw HttpDataSource$HttpDataSourceException.c(e10, (g) c0.h(this.f4754n), 2);
        }
    }

    private c(String str, int i10, int i11, boolean z10, boolean z11, h hVar, q qVar, boolean z12) {
        super(true);
        this.f4749i = str;
        this.f4747g = i10;
        this.f4748h = i11;
        this.f4745e = z10;
        this.f4746f = z11;
        if (z10 && z11) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.f4750j = hVar;
        this.f4752l = qVar;
        this.f4751k = new h();
        this.f4753m = z12;
    }
}
