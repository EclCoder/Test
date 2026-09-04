package nb;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import com.google.common.collect.e0;
import com.google.common.collect.g1;
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
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class q extends e implements j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f47033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f47034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f47035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f47036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final t f47037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final t f47038j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f47039k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private sc.q f47040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.android.exoplayer2.upstream.a f47041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private HttpURLConnection f47042n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private InputStream f47043o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f47044p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f47045q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f47046r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f47047s;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements j.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a0 f47049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private sc.q f47050c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f47051d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f47054g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f47055h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t f47048a = new t();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f47052e = 8000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f47053f = 8000;

        @Override // nb.j.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q createDataSource() {
            q qVar = new q(this.f47051d, this.f47052e, this.f47053f, this.f47054g, this.f47048a, this.f47050c, this.f47055h);
            a0 a0Var = this.f47049b;
            if (a0Var != null) {
                qVar.d(a0Var);
            }
            return qVar;
        }

        public b b(String str) {
            this.f47051d = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c extends com.google.common.collect.v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f47056a;

        public c(Map map) {
            this.f47056a = map;
        }

        public static /* synthetic */ boolean m(String str) {
            return str != null;
        }

        public static /* synthetic */ boolean n(Map.Entry entry) {
            return entry.getKey() != null;
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
            return g1.b(super.entrySet(), new sc.q() { // from class: nb.s
                @Override // sc.q
                public final boolean apply(Object obj) {
                    return q.c.n((Map.Entry) obj);
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
            return this.f47056a;
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
            return g1.b(super.keySet(), new sc.q() { // from class: nb.r
                @Override // sc.q
                public final boolean apply(Object obj) {
                    return q.c.m((String) obj);
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

    private URL n(URL url, String str, com.google.android.exoplayer2.upstream.a aVar) throws HttpDataSource$HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", aVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource$HttpDataSourceException("Unsupported protocol redirect: " + protocol, aVar, 2001, 1);
            }
            if (this.f47033e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new HttpDataSource$HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", aVar, 2001, 1);
        } catch (MalformedURLException e10) {
            throw new HttpDataSource$HttpDataSourceException(e10, aVar, 2001, 1);
        }
    }

    private static boolean o(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection p(com.google.android.exoplayer2.upstream.a aVar) throws IOException {
        URL url = new URL(aVar.f18779a.toString());
        int i10 = aVar.f18781c;
        byte[] bArr = aVar.f18782d;
        long j10 = aVar.f18785g;
        long j11 = aVar.f18786h;
        int i11 = 1;
        boolean zD = aVar.d(1);
        if (!this.f47033e && !this.f47039k) {
            return q(url, i10, bArr, j10, j11, zD, true, aVar.f18783e);
        }
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException("Too many redirects: " + i13), aVar, 2001, 1);
            }
            HttpURLConnection httpURLConnectionQ = q(url, i10, bArr, j10, j11, zD, false, aVar.f18783e);
            int responseCode = httpURLConnectionQ.getResponseCode();
            String headerField = httpURLConnectionQ.getHeaderField("Location");
            if ((i10 == i11 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionQ.disconnect();
                url = n(url, headerField, aVar);
            } else {
                if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionQ;
                }
                httpURLConnectionQ.disconnect();
                if (!this.f47039k || responseCode != 302) {
                    bArr = null;
                    i10 = 1;
                }
                url = n(url, headerField, aVar);
            }
            i12 = i13;
            i11 = 1;
        }
    }

    private HttpURLConnection q(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) throws IOException {
        HttpURLConnection httpURLConnectionS = s(url);
        httpURLConnectionS.setConnectTimeout(this.f47034f);
        httpURLConnectionS.setReadTimeout(this.f47035g);
        HashMap map2 = new HashMap();
        t tVar = this.f47037i;
        if (tVar != null) {
            map2.putAll(tVar.a());
        }
        map2.putAll(this.f47038j.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionS.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = u.a(j10, j11);
        if (strA != null) {
            httpURLConnectionS.setRequestProperty(Command.HTTP_HEADER_RANGE, strA);
        }
        String str = this.f47036h;
        if (str != null) {
            httpURLConnectionS.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, str);
        }
        httpURLConnectionS.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnectionS.setInstanceFollowRedirects(z11);
        httpURLConnectionS.setDoOutput(bArr != null);
        httpURLConnectionS.setRequestMethod(com.google.android.exoplayer2.upstream.a.c(i10));
        if (bArr == null) {
            httpURLConnectionS.connect();
            return httpURLConnectionS;
        }
        httpURLConnectionS.setFixedLengthStreamingMode(bArr.length);
        httpURLConnectionS.connect();
        OutputStream outputStream = httpURLConnectionS.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnectionS;
    }

    private static void r(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection == null || (i10 = r0.f48425a) < 19 || i10 > 20) {
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
                Method declaredMethod = ((Class) ob.a.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    private int t(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f47046r;
        if (j10 != -1) {
            long j11 = j10 - this.f47047s;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int i12 = ((InputStream) r0.j(this.f47043o)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f47047s += (long) i12;
        i(i12);
        return i12;
    }

    private void u(long j10, com.google.android.exoplayer2.upstream.a aVar) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int i10 = ((InputStream) r0.j(this.f47043o)).read(bArr, 0, (int) Math.min(j10, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), aVar, 2000, 1);
            }
            if (i10 == -1) {
                throw new HttpDataSource$HttpDataSourceException(aVar, 2008, 1);
            }
            j10 -= (long) i10;
            i(i10);
        }
    }

    @Override // nb.j
    public void close() {
        try {
            InputStream inputStream = this.f47043o;
            if (inputStream != null) {
                long j10 = this.f47046r;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f47047s;
                }
                r(this.f47042n, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new HttpDataSource$HttpDataSourceException(e10, (com.google.android.exoplayer2.upstream.a) r0.j(this.f47041m), 2000, 3);
                }
            }
            this.f47043o = null;
            m();
            if (this.f47044p) {
                this.f47044p = false;
                j();
            }
        } catch (Throwable th2) {
            this.f47043o = null;
            m();
            if (this.f47044p) {
                this.f47044p = false;
                j();
            }
            throw th2;
        }
    }

    @Override // nb.j
    public Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f47042n;
        return httpURLConnection == null ? e0.q() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // nb.j
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f47042n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // nb.j
    public long h(final com.google.android.exoplayer2.upstream.a aVar) throws HttpDataSource$HttpDataSourceException {
        byte[] bArrC1;
        this.f47041m = aVar;
        long j10 = 0;
        this.f47047s = 0L;
        this.f47046r = 0L;
        k(aVar);
        try {
            HttpURLConnection httpURLConnectionP = p(aVar);
            this.f47042n = httpURLConnectionP;
            this.f47045q = httpURLConnectionP.getResponseCode();
            String responseMessage = httpURLConnectionP.getResponseMessage();
            int i10 = this.f47045q;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionP.getHeaderFields();
                if (this.f47045q == 416) {
                    if (aVar.f18785g == u.c(httpURLConnectionP.getHeaderField("Content-Range"))) {
                        this.f47044p = true;
                        l(aVar);
                        long j11 = aVar.f18786h;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionP.getErrorStream();
                try {
                    bArrC1 = errorStream != null ? r0.c1(errorStream) : r0.f48430f;
                } catch (IOException unused) {
                    bArrC1 = r0.f48430f;
                }
                byte[] bArr = bArrC1;
                m();
                throw new HttpDataSource$InvalidResponseCodeException(this.f47045q, responseMessage, this.f47045q == 416 ? new DataSourceException(2008) : null, headerFields, aVar, bArr);
            }
            final String contentType = httpURLConnectionP.getContentType();
            sc.q qVar = this.f47040l;
            if (qVar != null && !qVar.apply(contentType)) {
                m();
                throw new HttpDataSource$HttpDataSourceException(contentType, aVar) { // from class: com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final String f18738d;

                    {
                        super("Invalid content type: " + contentType, aVar, 2003, 1);
                        this.f18738d = contentType;
                    }
                };
            }
            if (this.f47045q == 200) {
                long j12 = aVar.f18785g;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            boolean zO = o(httpURLConnectionP);
            if (zO) {
                this.f47046r = aVar.f18786h;
            } else {
                long j13 = aVar.f18786h;
                if (j13 != -1) {
                    this.f47046r = j13;
                } else {
                    long jB = u.b(httpURLConnectionP.getHeaderField("Content-Length"), httpURLConnectionP.getHeaderField("Content-Range"));
                    this.f47046r = jB != -1 ? jB - j10 : -1L;
                }
            }
            try {
                this.f47043o = httpURLConnectionP.getInputStream();
                if (zO) {
                    this.f47043o = new GZIPInputStream(this.f47043o);
                }
                this.f47044p = true;
                l(aVar);
                try {
                    u(j10, aVar);
                    return this.f47046r;
                } catch (IOException e10) {
                    m();
                    if (e10 instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e10);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e10, aVar, 2000, 1);
                }
            } catch (IOException e11) {
                m();
                throw new HttpDataSource$HttpDataSourceException(e11, aVar, 2000, 1);
            }
        } catch (IOException e12) {
            m();
            throw HttpDataSource$HttpDataSourceException.c(e12, aVar, 1);
        }
    }

    @Override // nb.h
    public int read(byte[] bArr, int i10, int i11) throws HttpDataSource$HttpDataSourceException {
        try {
            return t(bArr, i10, i11);
        } catch (IOException e10) {
            throw HttpDataSource$HttpDataSourceException.c(e10, (com.google.android.exoplayer2.upstream.a) r0.j(this.f47041m), 2);
        }
    }

    HttpURLConnection s(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    private q(String str, int i10, int i11, boolean z10, t tVar, sc.q qVar, boolean z11) {
        super(true);
        this.f47036h = str;
        this.f47034f = i10;
        this.f47035g = i11;
        this.f47033e = z10;
        this.f47037i = tVar;
        this.f47040l = qVar;
        this.f47038j = new t();
        this.f47039k = z11;
    }

    private void m() {
        HttpURLConnection httpURLConnection = this.f47042n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                ob.u.d("DefaultHttpDataSource", mDXVAtwcaFMHJ.HCRVa, e10);
            }
            this.f47042n = null;
        }
    }
}
