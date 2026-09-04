package com.hecorat.screenrecorder.free.helpers.webserver;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.api.client.http.HttpStatusCodes;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLException;
import nh.l0;
import qd.qPi.SVWsZyNSAChGIA;
import tn.xQIL.Saucuwx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseWebServer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f22906h = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f22907i = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f22908j = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Logger f22909k = Logger.getLogger(BaseWebServer.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile ServerSocket f22912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o f22913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Thread f22914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f22915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q f22916g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(c cVar);

        void b();

        void c(c cVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InputStream f22918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Socket f22919b;

        public c(InputStream inputStream, Socket socket) {
            this.f22918a = inputStream;
            this.f22919b = socket;
        }

        public void a() {
            BaseWebServer.p(this.f22918a);
            BaseWebServer.p(this.f22919b);
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            OutputStream outputStream = null;
            try {
                try {
                    OutputStream outputStream2 = this.f22919b.getOutputStream();
                    try {
                        j jVar = BaseWebServer.this.new j(BaseWebServer.this.f22916g.a(), this.f22918a, outputStream2, this.f22919b.getInetAddress());
                        while (!this.f22919b.isClosed()) {
                            jVar.c();
                        }
                        BaseWebServer.p(outputStream2);
                    } catch (Exception e10) {
                        e = e10;
                        outputStream = outputStream2;
                        if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                            BaseWebServer.f22909k.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
                        }
                        BaseWebServer.p(outputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = outputStream2;
                        BaseWebServer.p(outputStream);
                        BaseWebServer.p(this.f22918a);
                        BaseWebServer.p(this.f22919b);
                        BaseWebServer.this.f22915f.c(this);
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
                BaseWebServer.p(this.f22918a);
                BaseWebServer.p(this.f22919b);
                BaseWebServer.this.f22915f.c(this);
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Pattern f22921e = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Pattern f22922f = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Pattern f22923g = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f22924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f22925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f22926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f22927d;

        public d(String str) {
            this.f22924a = str;
            if (str != null) {
                this.f22925b = b(str, f22921e, "", 1);
                this.f22926c = b(str, f22922f, null, 2);
            } else {
                this.f22925b = "";
                this.f22926c = C.UTF8_NAME;
            }
            if ("multipart/form-data".equalsIgnoreCase(this.f22925b)) {
                this.f22927d = b(str, f22923g, null, 2);
            } else {
                this.f22927d = null;
            }
        }

        private String b(String str, Pattern pattern, String str2, int i10) {
            Matcher matcher = pattern.matcher(str);
            return matcher.find() ? matcher.group(i10) : str2;
        }

        public String a() {
            return this.f22924a;
        }

        public String c() {
            String str = this.f22926c;
            return str == null ? C.ASCII_NAME : str;
        }

        public d d() {
            if (this.f22926c != null) {
                return this;
            }
            return new d(this.f22924a + "; charset=UTF-8");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class e implements Iterable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f22928a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList f22929b = new ArrayList();

        public e(Map map) {
            String str = (String) map.get("cookie");
            if (str != null) {
                for (String str2 : str.split(";")) {
                    String[] strArrSplit = str2.trim().split("=");
                    if (strArrSplit.length == 2) {
                        this.f22928a.put(strArrSplit[0], strArrSplit[1]);
                    }
                }
            }
        }

        public void a(m mVar) {
            Iterator it = this.f22929b.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f22928a.keySet().iterator();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class f implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f22931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f22932b = Collections.synchronizedList(new ArrayList());

        @Override // com.hecorat.screenrecorder.free.helpers.webserver.BaseWebServer.b
        public void a(c cVar) {
            this.f22931a++;
            Thread thread = new Thread(cVar);
            thread.setDaemon(true);
            thread.setName("NanoHttpd Request Processor (#" + this.f22931a + ")");
            this.f22932b.add(cVar);
            thread.start();
        }

        @Override // com.hecorat.screenrecorder.free.helpers.webserver.BaseWebServer.b
        public void b() {
            ArrayList arrayList = new ArrayList(this.f22932b);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((c) obj).a();
            }
        }

        @Override // com.hecorat.screenrecorder.free.helpers.webserver.BaseWebServer.b
        public void c(c cVar) {
            this.f22932b.remove(cVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class g implements o {
        @Override // com.hecorat.screenrecorder.free.helpers.webserver.BaseWebServer.o
        public ServerSocket a() {
            return new ServerSocket();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class h implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f22933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f22934b;

        public h() {
            File file = new File(System.getProperty("java.io.tmpdir"));
            this.f22933a = file;
            if (!file.exists()) {
                file.mkdirs();
            }
            this.f22934b = new ArrayList();
        }

        @Override // com.hecorat.screenrecorder.free.helpers.webserver.BaseWebServer.p
        public void clear() {
            Iterator it = this.f22934b.iterator();
            while (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                try {
                    throw null;
                } catch (Exception e10) {
                    BaseWebServer.f22909k.log(Level.WARNING, "could not delete file ", (Throwable) e10);
                }
            }
            this.f22934b.clear();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class i implements q {
        private i() {
        }

        @Override // com.hecorat.screenrecorder.free.helpers.webserver.BaseWebServer.q
        public p a() {
            return new h();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    private class j implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p f22936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final OutputStream f22937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final BufferedInputStream f22938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f22939d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f22940e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f22941f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private l f22942g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Map f22943h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Map f22944i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private e f22945j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f22946k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f22947l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f22948m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f22949n;

        public j(p pVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
            this.f22936a = pVar;
            this.f22938c = new BufferedInputStream(inputStream, 8192);
            this.f22937b = outputStream;
            this.f22947l = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress();
            this.f22948m = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "localhost" : inetAddress.getHostName();
            this.f22944i = new HashMap();
        }

        private void a(BufferedReader bufferedReader, Map map, Map map2, Map map3) throws ResponseException {
            String strJ;
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(line);
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new ResponseException(m.d.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
                }
                map.put("method", stringTokenizer.nextToken());
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new ResponseException(m.d.BAD_REQUEST, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                }
                String strNextToken = stringTokenizer.nextToken();
                int iIndexOf = strNextToken.indexOf(63);
                if (iIndexOf >= 0) {
                    b(strNextToken.substring(iIndexOf + 1), map2);
                    strJ = BaseWebServer.j(strNextToken.substring(0, iIndexOf));
                } else {
                    strJ = BaseWebServer.j(strNextToken);
                }
                if (stringTokenizer.hasMoreTokens()) {
                    this.f22949n = stringTokenizer.nextToken();
                } else {
                    this.f22949n = "HTTP/1.1";
                    BaseWebServer.f22909k.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
                }
                String line2 = bufferedReader.readLine();
                while (line2 != null && !line2.trim().isEmpty()) {
                    int iIndexOf2 = line2.indexOf(58);
                    if (iIndexOf2 >= 0) {
                        map3.put(line2.substring(0, iIndexOf2).trim().toLowerCase(Locale.US), line2.substring(iIndexOf2 + 1).trim());
                    }
                    line2 = bufferedReader.readLine();
                }
                map.put("uri", strJ);
            } catch (IOException e10) {
                throw new ResponseException(m.d.INTERNAL_ERROR, "SERVER INTERNAL ERROR: IOException: " + e10.getMessage(), e10);
            }
        }

        private void b(String str, Map map) {
            String strTrim;
            String strJ;
            if (str == null) {
                this.f22946k = "";
                return;
            }
            this.f22946k = str;
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                int iIndexOf = strNextToken.indexOf(61);
                if (iIndexOf >= 0) {
                    strTrim = BaseWebServer.j(strNextToken.substring(0, iIndexOf)).trim();
                    strJ = BaseWebServer.j(strNextToken.substring(iIndexOf + 1));
                } else {
                    strTrim = BaseWebServer.j(strNextToken).trim();
                    strJ = "";
                }
                List arrayList = (List) map.get(strTrim);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(strTrim, arrayList);
                }
                arrayList.add(strJ);
            }
        }

        private int d(byte[] bArr, int i10) {
            int i11;
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (i13 >= i10) {
                    return 0;
                }
                byte b10 = bArr[i12];
                if (b10 == 13 && bArr[i13] == 10 && (i11 = i12 + 3) < i10 && bArr[i12 + 2] == 13 && bArr[i11] == 10) {
                    return i12 + 4;
                }
                if (b10 == 10 && bArr[i13] == 10) {
                    return i12 + 2;
                }
                i12 = i13;
            }
        }

        @Override // com.hecorat.screenrecorder.free.helpers.webserver.BaseWebServer.k
        public final Map getParameters() {
            return this.f22943h;
        }

        @Override // com.hecorat.screenrecorder.free.helpers.webserver.BaseWebServer.k
        public final String getUri() {
            return this.f22941f;
        }

        public void c() {
            String str = SVWsZyNSAChGIA.wMOJbvP;
            try {
                try {
                    try {
                        try {
                            byte[] bArr = new byte[8192];
                            boolean z10 = false;
                            this.f22939d = 0;
                            this.f22940e = 0;
                            this.f22938c.mark(8192);
                            try {
                                int i10 = this.f22938c.read(bArr, 0, 8192);
                                if (i10 == -1) {
                                    BaseWebServer.p(this.f22938c);
                                    BaseWebServer.p(this.f22937b);
                                    throw new SocketException("NanoHttpd Shutdown");
                                }
                                while (i10 > 0) {
                                    int i11 = this.f22940e + i10;
                                    this.f22940e = i11;
                                    int iD = d(bArr, i11);
                                    this.f22939d = iD;
                                    if (iD > 0) {
                                        break;
                                    }
                                    BufferedInputStream bufferedInputStream = this.f22938c;
                                    int i12 = this.f22940e;
                                    i10 = bufferedInputStream.read(bArr, i12, 8192 - i12);
                                }
                                if (this.f22939d < this.f22940e) {
                                    this.f22938c.reset();
                                    this.f22938c.skip(this.f22939d);
                                }
                                this.f22943h = new HashMap();
                                Map map = this.f22944i;
                                if (map == null) {
                                    this.f22944i = new HashMap();
                                } else {
                                    map.clear();
                                }
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f22940e)));
                                HashMap map2 = new HashMap();
                                a(bufferedReader, map2, this.f22943h, this.f22944i);
                                String str2 = this.f22947l;
                                if (str2 != null) {
                                    this.f22944i.put("remote-addr", str2);
                                    this.f22944i.put("http-client-ip", this.f22947l);
                                }
                                l lVarE = l.e((String) map2.get(str));
                                this.f22942g = lVarE;
                                if (lVarE == null) {
                                    throw new ResponseException(m.d.BAD_REQUEST, "BAD REQUEST: Syntax error. HTTP verb " + ((String) map2.get(str)) + " unhandled.");
                                }
                                this.f22941f = (String) map2.get("uri");
                                this.f22945j = BaseWebServer.this.new e(this.f22944i);
                                String str3 = (String) this.f22944i.get("connection");
                                boolean z11 = "HTTP/1.1".equals(this.f22949n) && (str3 == null || !str3.matches("(?i).*close.*"));
                                m mVarQ = BaseWebServer.this.q(this);
                                if (mVarQ == null) {
                                    throw new ResponseException(m.d.INTERNAL_ERROR, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                                }
                                String str4 = (String) this.f22944i.get("accept-encoding");
                                this.f22945j.a(mVarQ);
                                mVarQ.i0(this.f22942g);
                                if (BaseWebServer.this.x(mVarQ) && str4 != null && str4.contains("gzip")) {
                                    z10 = true;
                                }
                                mVarQ.d0(z10);
                                mVarQ.g0(z11);
                                mVarQ.m(this.f22937b);
                                if (!z11 || mVarQ.k()) {
                                    throw new SocketException("NanoHttpd Shutdown");
                                }
                                BaseWebServer.p(mVarQ);
                                this.f22936a.clear();
                            } catch (SSLException e10) {
                                throw e10;
                            } catch (IOException unused) {
                                BaseWebServer.p(this.f22938c);
                                BaseWebServer.p(this.f22937b);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                        } catch (ResponseException e11) {
                            BaseWebServer.n(e11.d(), "text/plain", e11.getMessage()).m(this.f22937b);
                            BaseWebServer.p(this.f22937b);
                            BaseWebServer.p(null);
                            this.f22936a.clear();
                        }
                    } catch (SocketException e12) {
                        throw e12;
                    } catch (SocketTimeoutException e13) {
                        throw e13;
                    }
                } catch (SSLException e14) {
                    BaseWebServer.n(m.d.INTERNAL_ERROR, "text/plain", "SSL PROTOCOL FAILURE: " + e14.getMessage()).m(this.f22937b);
                    BaseWebServer.p(this.f22937b);
                    BaseWebServer.p(null);
                    this.f22936a.clear();
                } catch (IOException e15) {
                    BaseWebServer.n(m.d.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e15.getMessage()).m(this.f22937b);
                    BaseWebServer.p(this.f22937b);
                    BaseWebServer.p(null);
                    this.f22936a.clear();
                }
            } catch (Throwable th2) {
                BaseWebServer.p(null);
                this.f22936a.clear();
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface k {
        Map getParameters();

        String getUri();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum l {
        GET,
        PUT,
        POST,
        DELETE,
        HEAD,
        OPTIONS,
        TRACE,
        CONNECT,
        PATCH,
        PROPFIND,
        PROPPATCH,
        MKCOL,
        MOVE,
        COPY,
        LOCK,
        UNLOCK;

        static l e(String str) {
            if (str == null) {
                return null;
            }
            try {
                return valueOf(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class m implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f22968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f22969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private InputStream f22970c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f22971d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Map f22972e = new a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Map f22973f = new HashMap();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private l f22974g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f22975h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f22976i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f22977j;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a extends HashMap {
            a() {
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public String put(String str, String str2) {
                m.this.f22973f.put(str == null ? str : str.toLowerCase(), str2);
                return (String) super.put(str, str2);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public interface c {
            String getDescription();
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        /* JADX INFO: loaded from: classes2.dex */
        public enum d implements c {
            SWITCH_PROTOCOL(101, "Switching Protocols"),
            OK(200, "OK"),
            CREATED(201, "Created"),
            ACCEPTED(202, Saucuwx.uLVaOKeV),
            NO_CONTENT(204, "No Content"),
            PARTIAL_CONTENT(Sdk$SDKError.b.AD_ALREADY_FAILED_VALUE, "Partial Content"),
            MULTI_STATUS(Sdk$SDKError.b.PLACEMENT_AD_TYPE_MISMATCH_VALUE, "Multi-Status"),
            REDIRECT(301, "Moved Permanently"),
            FOUND(302, "Found"),
            REDIRECT_SEE_OTHER(HttpStatusCodes.STATUS_CODE_SEE_OTHER, "See Other"),
            NOT_MODIFIED(304, "Not Modified"),
            TEMPORARY_REDIRECT(307, "Temporary Redirect"),
            BAD_REQUEST(400, "Bad Request"),
            UNAUTHORIZED(401, "Unauthorized"),
            FORBIDDEN(403, "Forbidden"),
            NOT_FOUND(404, "Not Found"),
            METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
            NOT_ACCEPTABLE(TTAdConstant.LANDING_PAGE_TYPE_CODE, "Not Acceptable"),
            REQUEST_TIMEOUT(TTAdConstant.DOWNLOAD_URL_CODE, "Request Timeout"),
            CONFLICT(409, "Conflict"),
            GONE(TTAdConstant.IMAGE_LIST_SIZE_CODE, "Gone"),
            LENGTH_REQUIRED(TTAdConstant.IMAGE_CODE, "Length Required"),
            PRECONDITION_FAILED(412, "Precondition Failed"),
            PAYLOAD_TOO_LARGE(TTAdConstant.VIDEO_INFO_CODE, "Payload Too Large"),
            UNSUPPORTED_MEDIA_TYPE(TTAdConstant.VIDEO_COVER_URL_CODE, "Unsupported Media Type"),
            RANGE_NOT_SATISFIABLE(TTAdConstant.PACKAGE_NAME_CODE, "Requested Range Not Satisfiable"),
            EXPECTATION_FAILED(TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, "Expectation Failed"),
            TOO_MANY_REQUESTS(429, "Too Many Requests"),
            INTERNAL_ERROR(500, "Internal Server Error"),
            NOT_IMPLEMENTED(PglCryptUtils.LOAD_SO_FAILED, "Not Implemented"),
            SERVICE_UNAVAILABLE(503, "Service Unavailable"),
            UNSUPPORTED_HTTP_VERSION(PglCryptUtils.ENCRYPT_FAILED, "HTTP Version Not Supported");


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f23003a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f23004b;

            d(int i10, String str) {
                this.f23003a = i10;
                this.f23004b = str;
            }

            @Override // com.hecorat.screenrecorder.free.helpers.webserver.BaseWebServer.m.c
            public String getDescription() {
                return "" + this.f23003a + " " + this.f23004b;
            }
        }

        protected m(c cVar, String str, InputStream inputStream, long j10) {
            this.f22968a = cVar;
            this.f22969b = str;
            if (inputStream == null) {
                this.f22970c = new ByteArrayInputStream(new byte[0]);
                this.f22971d = 0L;
            } else {
                this.f22970c = inputStream;
                this.f22971d = j10;
            }
            this.f22975h = this.f22971d < 0;
            this.f22977j = true;
        }

        private void q(OutputStream outputStream, long j10) throws IOException {
            byte[] bArr = new byte[(int) 16384];
            boolean z10 = j10 == -1;
            while (true) {
                if (j10 <= 0 && !z10) {
                    return;
                }
                int i10 = this.f22970c.read(bArr, 0, (int) (z10 ? 16384L : Math.min(j10, 16384L)));
                if (i10 <= 0) {
                    return;
                }
                outputStream.write(bArr, 0, i10);
                if (!z10) {
                    j10 -= (long) i10;
                }
            }
        }

        private void r(OutputStream outputStream, long j10) throws IOException {
            if (!this.f22976i) {
                q(outputStream, j10);
                return;
            }
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            q(gZIPOutputStream, -1L);
            gZIPOutputStream.finish();
        }

        private void s(OutputStream outputStream, long j10) throws IOException {
            if (this.f22974g == l.HEAD || !this.f22975h) {
                r(outputStream, j10);
                return;
            }
            b bVar = new b(outputStream);
            r(bVar, -1L);
            bVar.d();
        }

        public void c(String str, String str2) {
            this.f22972e.put(str, str2);
        }

        public void c0(boolean z10) {
            this.f22975h = z10;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            InputStream inputStream = this.f22970c;
            if (inputStream != null) {
                inputStream.close();
            }
        }

        public String d(String str) {
            return (String) this.f22973f.get(str.toLowerCase());
        }

        public void d0(boolean z10) {
            this.f22976i = z10;
        }

        public void g0(boolean z10) {
            this.f22977j = z10;
        }

        public String h() {
            return this.f22969b;
        }

        public void i0(l lVar) {
            this.f22974g = lVar;
        }

        public boolean k() {
            return "ic_close_white_big_42dp".equals(d("connection"));
        }

        protected void l(PrintWriter printWriter, String str, String str2) {
            printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
        }

        protected void m(OutputStream outputStream) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", l0.e());
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            try {
                if (this.f22968a == null) {
                    throw new Error("sendResponse(): Status can't be null.");
                }
                PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, new d(this.f22969b).c())), false);
                printWriter.append("HTTP/1.1 ").append((CharSequence) this.f22968a.getDescription()).append(" \r\n");
                String str = this.f22969b;
                if (str != null) {
                    l(printWriter, "Content-Type", str);
                }
                if (d("date") == null) {
                    l(printWriter, "Date", simpleDateFormat.format(new Date()));
                }
                for (Map.Entry entry : this.f22972e.entrySet()) {
                    l(printWriter, (String) entry.getKey(), (String) entry.getValue());
                }
                if (d("connection") == null) {
                    l(printWriter, "Connection", this.f22977j ? "keep-alive" : "ic_close_white_big_42dp");
                }
                if (d("content-length") != null) {
                    this.f22976i = false;
                }
                if (this.f22976i) {
                    l(printWriter, "Content-Encoding", "gzip");
                    c0(true);
                }
                long jT = this.f22970c != null ? this.f22971d : 0L;
                if (this.f22974g != l.HEAD && this.f22975h) {
                    l(printWriter, "Transfer-Encoding", "chunked");
                } else if (!this.f22976i) {
                    jT = t(printWriter, jT);
                }
                printWriter.append("\r\n");
                printWriter.flush();
                s(outputStream, jT);
                outputStream.flush();
                BaseWebServer.p(this.f22970c);
            } catch (IOException e10) {
                BaseWebServer.f22909k.log(Level.SEVERE, "Could not send response to the client", (Throwable) e10);
            }
        }

        protected long t(PrintWriter printWriter, long j10) {
            String strD = d("content-length");
            if (strD != null) {
                try {
                    j10 = Long.parseLong(strD);
                } catch (NumberFormatException unused) {
                    BaseWebServer.f22909k.severe("content-length was no number " + strD);
                }
            }
            printWriter.print("Content-Length: " + j10 + "\r\n");
            return j10;
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static class b extends FilterOutputStream {
            public b(OutputStream outputStream) {
                super(outputStream);
            }

            public void d() throws IOException {
                ((FilterOutputStream) this).out.write("0\r\n\r\n".getBytes());
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i10) throws IOException {
                write(new byte[]{(byte) i10}, 0, 1);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr) throws IOException {
                write(bArr, 0, bArr.length);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i10, int i11) throws IOException {
                if (i11 == 0) {
                    return;
                }
                ((FilterOutputStream) this).out.write(String.format("%x\r\n", Integer.valueOf(i11)).getBytes());
                ((FilterOutputStream) this).out.write(bArr, i10, i11);
                ((FilterOutputStream) this).out.write("\r\n".getBytes());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f23005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IOException f23006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f23007c = false;

        public n(int i10) {
            this.f23005a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                BaseWebServer.this.f22912c.bind(BaseWebServer.this.f22910a != null ? new InetSocketAddress(BaseWebServer.this.f22910a, BaseWebServer.this.f22911b) : new InetSocketAddress(BaseWebServer.this.f22911b));
                this.f23007c = true;
                do {
                    try {
                        Socket socketAccept = BaseWebServer.this.f22912c.accept();
                        int i10 = this.f23005a;
                        if (i10 > 0) {
                            socketAccept.setSoTimeout(i10);
                        }
                        BaseWebServer.this.f22915f.a(BaseWebServer.this.h(socketAccept, socketAccept.getInputStream()));
                    } catch (IOException e10) {
                        BaseWebServer.f22909k.log(Level.FINE, "Communication with the client broken", (Throwable) e10);
                    }
                } while (!BaseWebServer.this.f22912c.isClosed());
            } catch (IOException e11) {
                this.f23006b = e11;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface o {
        ServerSocket a();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface p {
        void clear();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface q {
        p a();
    }

    public BaseWebServer(int i10) {
        this(null, i10);
    }

    protected static String j(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e10) {
            f22909k.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e10);
            return null;
        }
    }

    public static m l(m.c cVar, String str, InputStream inputStream) {
        return new m(cVar, str, inputStream, -1L);
    }

    public static m m(m.c cVar, String str, InputStream inputStream, long j10) {
        return new m(cVar, str, inputStream, j10);
    }

    public static m n(m.c cVar, String str, String str2) {
        byte[] bytes;
        d dVar = new d(str);
        if (str2 == null) {
            return m(cVar, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        try {
            if (!Charset.forName(dVar.c()).newEncoder().canEncode(str2)) {
                dVar = dVar.d();
            }
            bytes = str2.getBytes(dVar.c());
        } catch (UnsupportedEncodingException e10) {
            f22909k.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e10);
            bytes = new byte[0];
        }
        return m(cVar, dVar.a(), new ByteArrayInputStream(bytes), bytes.length);
    }

    public static m o(String str) {
        return n(m.d.OK, "text/html", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else {
                    if (!(obj instanceof ServerSocket)) {
                        throw new IllegalArgumentException("Unknown object to ic_close_white_big_42dp");
                    }
                    ((ServerSocket) obj).close();
                }
            } catch (IOException e10) {
                f22909k.log(Level.SEVERE, "Could not ic_close_white_big_42dp", (Throwable) e10);
            }
        }
    }

    protected c h(Socket socket, InputStream inputStream) {
        return new c(inputStream, socket);
    }

    protected n i(int i10) {
        return new n(i10);
    }

    public o k() {
        return this.f22913d;
    }

    public abstract m q(k kVar);

    public void r(b bVar) {
        this.f22915f = bVar;
    }

    public void s(q qVar) {
        this.f22916g = qVar;
    }

    public void t() throws IOException {
        u(5000);
    }

    public void u(int i10) throws IOException {
        v(i10, true);
    }

    public void v(int i10, boolean z10) throws IOException {
        this.f22912c = k().a();
        this.f22912c.setReuseAddress(true);
        n nVarI = i(i10);
        Thread thread = new Thread(nVarI);
        this.f22914e = thread;
        thread.setDaemon(z10);
        this.f22914e.setName("NanoHttpd Main NativeAdListener");
        this.f22914e.start();
        while (!nVarI.f23007c && nVarI.f23006b == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable unused) {
            }
        }
        if (nVarI.f23006b != null) {
            throw nVarI.f23006b;
        }
    }

    public void w() {
        try {
            p(this.f22912c);
            this.f22915f.b();
            Thread thread = this.f22914e;
            if (thread != null) {
                thread.join();
            }
        } catch (Exception e10) {
            f22909k.log(Level.SEVERE, "Could not stop all connections", (Throwable) e10);
        }
    }

    protected boolean x(m mVar) {
        return mVar.h() != null && mVar.h().toLowerCase().contains("text/");
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class ResponseException extends Exception {
        private static final long serialVersionUID = 6569838532917408380L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m.d f22917a;

        public ResponseException(m.d dVar, String str) {
            super(str);
            this.f22917a = dVar;
        }

        public m.d d() {
            return this.f22917a;
        }

        public ResponseException(m.d dVar, String str, Exception exc) {
            super(str, exc);
            this.f22917a = dVar;
        }
    }

    public BaseWebServer(String str, int i10) {
        this.f22913d = new g();
        this.f22910a = str;
        this.f22911b = i10;
        s(new i());
        r(new f());
    }
}
