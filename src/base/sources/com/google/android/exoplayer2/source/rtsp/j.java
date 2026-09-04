package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.i0;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class j implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f18006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f18007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SocketFactory f18009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f18010e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Uri f18014i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private u.a f18016k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f18017l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b f18018m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private i f18019n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f18021p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f18022q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f18023r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f18011f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SparseArray f18012g = new SparseArray();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f18013h = new d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private s f18015j = new s(new c());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f18024s = C.TIME_UNSET;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f18020o = -1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b implements Runnable, Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f18025a = r0.w();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f18026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f18027c;

        public b(long j10) {
            this.f18026b = j10;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f18027c = false;
            this.f18025a.removeCallbacks(this);
        }

        public void d() {
            if (this.f18027c) {
                return;
            }
            this.f18027c = true;
            this.f18025a.postDelayed(this, this.f18026b);
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f18013h.e(j.this.f18014i, j.this.f18017l);
            this.f18025a.postDelayed(this, this.f18026b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class c implements s.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f18029a = r0.w();

        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(List list) {
            j.this.f1(list);
            if (u.e(list)) {
                g(list);
            } else {
                f(list);
            }
        }

        private void f(List list) {
            j.this.f18013h.d(Integer.parseInt((String) ob.a.e(u.k(list).f18123c.d("CSeq"))));
        }

        private void g(List list) {
            com.google.common.collect.c0 c0VarC;
            y yVarL = u.l(list);
            int i10 = Integer.parseInt((String) ob.a.e(yVarL.f18126b.d("CSeq")));
            x xVar = (x) j.this.f18012g.get(i10);
            if (xVar == null) {
                return;
            }
            j.this.f18012g.remove(i10);
            int i11 = xVar.f18122b;
            try {
                try {
                    int i12 = yVarL.f18125a;
                    if (i12 == 200) {
                        switch (i11) {
                            case 1:
                            case 3:
                            case 7:
                            case 8:
                            case 9:
                            case 11:
                            case 12:
                                return;
                            case 2:
                                h(new l(yVarL.f18126b, i12, d0.b(yVarL.f18127c)));
                                return;
                            case 4:
                                i(new v(i12, u.j(yVarL.f18126b.d("Public"))));
                                return;
                            case 5:
                                j();
                                return;
                            case 6:
                                String strD = yVarL.f18126b.d(Command.HTTP_HEADER_RANGE);
                                z zVarD = strD == null ? z.f18128c : z.d(strD);
                                try {
                                    String strD2 = yVarL.f18126b.d("RTP-Info");
                                    c0VarC = strD2 == null ? com.google.common.collect.c0.C() : b0.a(strD2, j.this.f18014i);
                                } catch (ParserException unused) {
                                    c0VarC = com.google.common.collect.c0.C();
                                }
                                k(new w(yVarL.f18125a, zVarD, c0VarC));
                                return;
                            case 10:
                                String strD3 = yVarL.f18126b.d("Session");
                                String strD4 = yVarL.f18126b.d("Transport");
                                if (strD3 == null || strD4 == null) {
                                    throw ParserException.c("Missing mandatory session or transport header", null);
                                }
                                l(new a0(yVarL.f18125a, u.m(strD3), strD4));
                                return;
                            default:
                                throw new IllegalStateException();
                        }
                    }
                    if (i12 == 401) {
                        if (j.this.f18016k == null || j.this.f18022q) {
                            j.this.c1(new RtspMediaSource.RtspPlaybackException(u.t(i11) + " " + yVarL.f18125a));
                            return;
                        }
                        com.google.common.collect.c0 c0VarE = yVarL.f18126b.e("WWW-Authenticate");
                        if (c0VarE.isEmpty()) {
                            throw ParserException.c("Missing WWW-Authenticate header in a 401 response.", null);
                        }
                        for (int i13 = 0; i13 < c0VarE.size(); i13++) {
                            j.this.f18019n = u.o((String) c0VarE.get(i13));
                            if (j.this.f18019n.f18002a == 2) {
                                break;
                            }
                        }
                        j.this.f18013h.b();
                        j.this.f18022q = true;
                        return;
                    }
                    if (i12 == 461) {
                        String str = u.t(i11) + " " + yVarL.f18125a;
                        j.this.c1((i11 != 10 || ((String) ob.a.e(xVar.f18123c.d("Transport"))).contains("TCP")) ? new RtspMediaSource.RtspPlaybackException(str) : new RtspMediaSource.RtspUdpUnsupportedTransportException(str));
                        return;
                    }
                    if (i12 != 301 && i12 != 302) {
                        j.this.c1(new RtspMediaSource.RtspPlaybackException(u.t(i11) + " " + yVarL.f18125a));
                        return;
                    }
                    if (j.this.f18020o != -1) {
                        j.this.f18020o = 0;
                    }
                    String strD5 = yVarL.f18126b.d("Location");
                    if (strD5 == null) {
                        j.this.f18006a.b("Redirection without new location.", null);
                        return;
                    }
                    Uri uri = Uri.parse(strD5);
                    j.this.f18014i = u.p(uri);
                    j.this.f18016k = u.n(uri);
                    j.this.f18013h.c(j.this.f18014i, j.this.f18017l);
                } catch (IllegalArgumentException e10) {
                    e = e10;
                    j.this.c1(new RtspMediaSource.RtspPlaybackException(e));
                }
            } catch (ParserException e11) {
                e = e11;
                j.this.c1(new RtspMediaSource.RtspPlaybackException(e));
            }
        }

        private void h(l lVar) {
            z zVarD = z.f18128c;
            String str = (String) lVar.f18038c.f17931a.get("range");
            if (str != null) {
                try {
                    zVarD = z.d(str);
                } catch (ParserException e10) {
                    j.this.f18006a.b("SDP format error.", e10);
                    return;
                }
            }
            com.google.common.collect.c0 c0VarA1 = j.a1(lVar, j.this.f18014i);
            if (c0VarA1.isEmpty()) {
                j.this.f18006a.b("No playable track.", null);
            } else {
                j.this.f18006a.h(zVarD, c0VarA1);
                j.this.f18021p = true;
            }
        }

        private void i(v vVar) {
            if (j.this.f18018m != null) {
                return;
            }
            if (j.j1(vVar.f18117b)) {
                j.this.f18013h.c(j.this.f18014i, j.this.f18017l);
            } else {
                j.this.f18006a.b("DESCRIBE not supported.", null);
            }
        }

        private void j() {
            ob.a.g(j.this.f18020o == 2);
            j.this.f18020o = 1;
            j.this.f18023r = false;
            if (j.this.f18024s != C.TIME_UNSET) {
                j jVar = j.this;
                jVar.n1(r0.i1(jVar.f18024s));
            }
        }

        private void k(w wVar) {
            boolean z10 = true;
            if (j.this.f18020o != 1 && j.this.f18020o != 2) {
                z10 = false;
            }
            ob.a.g(z10);
            j.this.f18020o = 2;
            if (j.this.f18018m == null) {
                j jVar = j.this;
                jVar.f18018m = jVar.new b(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
                j.this.f18018m.d();
            }
            j.this.f18024s = C.TIME_UNSET;
            j.this.f18007b.g(r0.H0(wVar.f18119b.f18130a), wVar.f18120c);
        }

        private void l(a0 a0Var) {
            ob.a.g(j.this.f18020o != -1);
            j.this.f18020o = 1;
            j.this.f18017l = a0Var.f17923b.f18114a;
            j.this.b1();
        }

        @Override // com.google.android.exoplayer2.source.rtsp.s.d
        public void c(final List list) {
            this.f18029a.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18034a.e(list);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f18031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private x f18032b;

        private d() {
        }

        private x a(int i10, String str, Map map, Uri uri) {
            String str2 = j.this.f18008c;
            int i11 = this.f18031a;
            this.f18031a = i11 + 1;
            m.b bVar = new m.b(str2, str, i11);
            if (j.this.f18019n != null) {
                ob.a.i(j.this.f18016k);
                try {
                    bVar.b("Authorization", j.this.f18019n.a(j.this.f18016k, uri, i10));
                } catch (ParserException e10) {
                    j.this.c1(new RtspMediaSource.RtspPlaybackException(e10));
                }
            }
            bVar.d(map);
            return new x(uri, i10, bVar.e(), "");
        }

        private void h(x xVar) {
            int i10 = Integer.parseInt((String) ob.a.e(xVar.f18123c.d("CSeq")));
            ob.a.g(j.this.f18012g.get(i10) == null);
            j.this.f18012g.append(i10, xVar);
            com.google.common.collect.c0 c0VarQ = u.q(xVar);
            j.this.f1(c0VarQ);
            j.this.f18015j.j(c0VarQ);
            this.f18032b = xVar;
        }

        private void i(y yVar) {
            com.google.common.collect.c0 c0VarR = u.r(yVar);
            j.this.f1(c0VarR);
            j.this.f18015j.j(c0VarR);
        }

        public void b() {
            ob.a.i(this.f18032b);
            com.google.common.collect.d0 d0VarB = this.f18032b.f18123c.b();
            HashMap map = new HashMap();
            for (String str : d0VarB.keySet()) {
                if (!str.equals("CSeq") && !str.equals(Command.HTTP_HEADER_USER_AGENT) && !str.equals("Session") && !str.equals("Authorization")) {
                    map.put(str, (String) i0.d(d0VarB.get(str)));
                }
            }
            h(a(this.f18032b.f18122b, j.this.f18017l, map, this.f18032b.f18121a));
        }

        public void c(Uri uri, String str) {
            h(a(2, str, com.google.common.collect.e0.q(), uri));
        }

        public void d(int i10) {
            i(new y(405, new m.b(j.this.f18008c, j.this.f18017l, i10).e()));
            this.f18031a = Math.max(this.f18031a, i10 + 1);
        }

        public void e(Uri uri, String str) {
            h(a(4, str, com.google.common.collect.e0.q(), uri));
        }

        public void f(Uri uri, String str) {
            ob.a.g(j.this.f18020o == 2);
            h(a(5, str, com.google.common.collect.e0.q(), uri));
            j.this.f18023r = true;
        }

        public void g(Uri uri, long j10, String str) {
            boolean z10 = true;
            if (j.this.f18020o != 1 && j.this.f18020o != 2) {
                z10 = false;
            }
            ob.a.g(z10);
            h(a(6, str, com.google.common.collect.e0.r(Command.HTTP_HEADER_RANGE, z.b(j10)), uri));
        }

        public void j(Uri uri, String str, String str2) {
            j.this.f18020o = 0;
            h(a(10, str2, com.google.common.collect.e0.r("Transport", str), uri));
        }

        public void k(Uri uri, String str) {
            if (j.this.f18020o == -1 || j.this.f18020o == 0) {
                return;
            }
            j.this.f18020o = 0;
            h(a(12, str, com.google.common.collect.e0.q(), uri));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface e {
        void d(RtspMediaSource.RtspPlaybackException rtspPlaybackException);

        void f();

        void g(long j10, com.google.common.collect.c0 c0Var);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface f {
        void b(String str, Throwable th2);

        void h(z zVar, com.google.common.collect.c0 c0Var);
    }

    public j(f fVar, e eVar, String str, Uri uri, SocketFactory socketFactory, boolean z10) {
        this.f18006a = fVar;
        this.f18007b = eVar;
        this.f18008c = str;
        this.f18009d = socketFactory;
        this.f18010e = z10;
        this.f18014i = u.p(uri);
        this.f18016k = u.n(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.common.collect.c0 a1(l lVar, Uri uri) {
        com.google.common.collect.c0.a aVar = new com.google.common.collect.c0.a();
        for (int i10 = 0; i10 < lVar.f18038c.f17932b.size(); i10++) {
            com.google.android.exoplayer2.source.rtsp.a aVar2 = (com.google.android.exoplayer2.source.rtsp.a) lVar.f18038c.f17932b.get(i10);
            if (h.c(aVar2)) {
                aVar.a(new r(lVar.f18036a, aVar2, uri));
            }
        }
        return aVar.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b1() {
        n.d dVar = (n.d) this.f18011f.pollFirst();
        if (dVar == null) {
            this.f18007b.f();
        } else {
            this.f18013h.j(dVar.c(), dVar.d(), this.f18017l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1(Throwable th2) {
        RtspMediaSource.RtspPlaybackException rtspPlaybackException = th2 instanceof RtspMediaSource.RtspPlaybackException ? (RtspMediaSource.RtspPlaybackException) th2 : new RtspMediaSource.RtspPlaybackException(th2);
        if (this.f18021p) {
            this.f18007b.d(rtspPlaybackException);
        } else {
            this.f18006a.b(sc.w.e(th2.getMessage()), th2);
        }
    }

    private Socket d1(Uri uri) {
        ob.a.a(uri.getHost() != null);
        return this.f18009d.createSocket((String) ob.a.e(uri.getHost()), uri.getPort() > 0 ? uri.getPort() : 554);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1(List list) {
        if (this.f18010e) {
            ob.u.b("RtspClient", sc.i.g("\n").d(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j1(List list) {
        return list.isEmpty() || list.contains(2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b bVar = this.f18018m;
        if (bVar != null) {
            bVar.close();
            this.f18018m = null;
            this.f18013h.k(this.f18014i, (String) ob.a.e(this.f18017l));
        }
        this.f18015j.close();
    }

    public int e1() {
        return this.f18020o;
    }

    public void g1(int i10, s.b bVar) {
        this.f18015j.i(i10, bVar);
    }

    public void h1() {
        try {
            close();
            s sVar = new s(new c());
            this.f18015j = sVar;
            sVar.h(d1(this.f18014i));
            this.f18017l = null;
            this.f18022q = false;
            this.f18019n = null;
        } catch (IOException e10) {
            this.f18007b.d(new RtspMediaSource.RtspPlaybackException(e10));
        }
    }

    public void i1(long j10) {
        if (this.f18020o == 2 && !this.f18023r) {
            this.f18013h.f(this.f18014i, (String) ob.a.e(this.f18017l));
        }
        this.f18024s = j10;
    }

    public void k1(List list) {
        this.f18011f.addAll(list);
        b1();
    }

    public void l1() {
        this.f18020o = 1;
    }

    public void m1() throws IOException {
        try {
            this.f18015j.h(d1(this.f18014i));
            this.f18013h.e(this.f18014i, this.f18017l);
        } catch (IOException e10) {
            r0.n(this.f18015j);
            throw e10;
        }
    }

    public void n1(long j10) {
        this.f18013h.g(this.f18014i, j10, (String) ob.a.e(this.f18017l));
    }
}
