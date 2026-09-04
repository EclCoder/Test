package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.source.q;
import com.google.android.exoplayer2.source.r;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.y0;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nb.a0;
import nb.j;
import nb.v;
import o9.n;
import ob.h0;
import ob.r0;
import ob.u;
import ra.i;
import t9.k;
import va.l;
import va.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class DashMediaSource extends com.google.android.exoplayer2.source.a {
    private j A;
    private Loader B;
    private a0 C;
    private IOException D;
    private Handler E;
    private y0.g F;
    private Uri G;
    private Uri H;
    private va.c I;
    private boolean J;
    private long K;
    private long L;
    private long M;
    private int N;
    private long O;
    private int P;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final y0 f17494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f17495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final j.a f17496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.dash.a.InterfaceC0284a f17497k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ra.d f17498l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.j f17499m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.c f17500n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ua.b f17501o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f17502p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final long f17503q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final q.a f17504r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.d.a f17505s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final e f17506t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Object f17507u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final SparseArray f17508v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f17509w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Runnable f17510x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.dash.e.b f17511y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final v f17512z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Factory implements r {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ int f17513k = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.google.android.exoplayer2.source.dash.a.InterfaceC0284a f17514c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final j.a f17515d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private k f17516e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ra.d f17517f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.c f17518g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f17519h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f17520i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.d.a f17521j;

        public Factory(j.a aVar) {
            this(new com.google.android.exoplayer2.source.dash.c.a(aVar), aVar);
        }

        @Override // com.google.android.exoplayer2.source.p.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public DashMediaSource a(y0 y0Var) {
            ob.a.e(y0Var.f18982b);
            com.google.android.exoplayer2.upstream.d.a dVar = this.f17521j;
            if (dVar == null) {
                dVar = new va.d();
            }
            List list = y0Var.f18982b.f19083e;
            return new DashMediaSource(y0Var, null, this.f17515d, !list.isEmpty() ? new qa.b(dVar, list) : dVar, this.f17514c, this.f17517f, null, this.f17516e.a(y0Var), this.f17518g, this.f17519h, this.f17520i, null);
        }

        @Override // com.google.android.exoplayer2.source.p.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Factory c(k kVar) {
            this.f17516e = (k) ob.a.f(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Factory b(com.google.android.exoplayer2.upstream.c cVar) {
            this.f17518g = (com.google.android.exoplayer2.upstream.c) ob.a.f(cVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public Factory(com.google.android.exoplayer2.source.dash.a.InterfaceC0284a interfaceC0284a, j.a aVar) {
            this.f17514c = (com.google.android.exoplayer2.source.dash.a.InterfaceC0284a) ob.a.e(interfaceC0284a);
            this.f17515d = aVar;
            this.f17516e = new com.google.android.exoplayer2.drm.g();
            this.f17518g = new com.google.android.exoplayer2.upstream.b();
            this.f17519h = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
            this.f17520i = 5000000L;
            this.f17517f = new ra.f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements h0.b {
        a() {
        }

        @Override // ob.h0.b
        public void a() {
            DashMediaSource.this.Y(h0.h());
        }

        @Override // ob.h0.b
        public void b(IOException iOException) {
            DashMediaSource.this.X(iOException);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends h2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f17523f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f17524g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f17525h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f17526i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f17527j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final long f17528k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final long f17529l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final va.c f17530m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final y0 f17531n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final y0.g f17532o;

        public b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, va.c cVar, y0 y0Var, y0.g gVar) {
            ob.a.g(cVar.f55306d == (gVar != null));
            this.f17523f = j10;
            this.f17524g = j11;
            this.f17525h = j12;
            this.f17526i = i10;
            this.f17527j = j13;
            this.f17528k = j14;
            this.f17529l = j15;
            this.f17530m = cVar;
            this.f17531n = y0Var;
            this.f17532o = gVar;
        }

        private long w(long j10) {
            ua.e eVarK;
            long j11 = this.f17529l;
            if (!x(this.f17530m)) {
                return j11;
            }
            if (j10 > 0) {
                j11 += j10;
                if (j11 > this.f17528k) {
                    return C.TIME_UNSET;
                }
            }
            long j12 = this.f17527j + j11;
            long jF = this.f17530m.f(0);
            int i10 = 0;
            while (i10 < this.f17530m.d() - 1 && j12 >= jF) {
                j12 -= jF;
                i10++;
                jF = this.f17530m.f(i10);
            }
            va.g gVarC = this.f17530m.c(i10);
            int iA = gVarC.a(2);
            return (iA == -1 || (eVarK = ((va.j) ((va.a) gVarC.f55340c.get(iA)).f55295c.get(0)).k()) == null || eVarK.f(jF) == 0) ? j11 : (j11 + eVarK.getTimeUs(eVarK.e(j12, jF))) - j12;
        }

        private static boolean x(va.c cVar) {
            return cVar.f55306d && cVar.f55307e != C.TIME_UNSET && cVar.f55304b == C.TIME_UNSET;
        }

        @Override // com.google.android.exoplayer2.h2
        public int f(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f17526i) >= 0 && iIntValue < m()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.h2
        public h2.b k(int i10, h2.b bVar, boolean z10) {
            ob.a.c(i10, 0, m());
            return bVar.v(z10 ? this.f17530m.c(i10).f55338a : null, z10 ? Integer.valueOf(this.f17526i + i10) : null, 0, this.f17530m.f(i10), r0.H0(this.f17530m.c(i10).f55339b - this.f17530m.c(0).f55339b) - this.f17527j);
        }

        @Override // com.google.android.exoplayer2.h2
        public int m() {
            return this.f17530m.d();
        }

        @Override // com.google.android.exoplayer2.h2
        public Object q(int i10) {
            ob.a.c(i10, 0, m());
            return Integer.valueOf(this.f17526i + i10);
        }

        @Override // com.google.android.exoplayer2.h2
        public h2.d s(int i10, h2.d dVar, long j10) {
            ob.a.c(i10, 0, 1);
            long jW = w(j10);
            Object obj = h2.d.f17009r;
            y0 y0Var = this.f17531n;
            va.c cVar = this.f17530m;
            return dVar.i(obj, y0Var, cVar, this.f17523f, this.f17524g, this.f17525h, true, x(cVar), this.f17532o, jW, this.f17528k, 0, m() - 1, this.f17527j);
        }

        @Override // com.google.android.exoplayer2.h2
        public int t() {
            return 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class c implements com.google.android.exoplayer2.source.dash.e.b {
        private c() {
        }

        @Override // com.google.android.exoplayer2.source.dash.e.b
        public void a(long j10) {
            DashMediaSource.this.Q(j10);
        }

        @Override // com.google.android.exoplayer2.source.dash.e.b
        public void b() {
            DashMediaSource.this.R();
        }

        /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d implements com.google.android.exoplayer2.upstream.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Pattern f17534a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        d() {
        }

        @Override // com.google.android.exoplayer2.upstream.d.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long parse(Uri uri, InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, sc.e.f52294c)).readLine();
            try {
                Matcher matcher = f17534a.matcher(line);
                if (!matcher.matches()) {
                    throw ParserException.c("Couldn't parse timestamp: " + line, null);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j11 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= j10 * (((j11 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                }
                return Long.valueOf(time);
            } catch (ParseException e10) {
                throw ParserException.c(null, e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class e implements Loader.b {
        private e() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void e(com.google.android.exoplayer2.upstream.d dVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.S(dVar, j10, j11);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void i(com.google.android.exoplayer2.upstream.d dVar, long j10, long j11) {
            DashMediaSource.this.T(dVar, j10, j11);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.c n(com.google.android.exoplayer2.upstream.d dVar, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.U(dVar, j10, j11, iOException, i10);
        }

        /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class f implements v {
        f() {
        }

        private void a() throws IOException {
            if (DashMediaSource.this.D != null) {
                throw DashMediaSource.this.D;
            }
        }

        @Override // nb.v
        public void maybeThrowError() throws IOException {
            DashMediaSource.this.B.maybeThrowError();
            a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class g implements Loader.b {
        private g() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void e(com.google.android.exoplayer2.upstream.d dVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.S(dVar, j10, j11);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void i(com.google.android.exoplayer2.upstream.d dVar, long j10, long j11) {
            DashMediaSource.this.V(dVar, j10, j11);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.c n(com.google.android.exoplayer2.upstream.d dVar, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.W(dVar, j10, j11, iOException);
        }

        /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class h implements com.google.android.exoplayer2.upstream.d.a {
        private h() {
        }

        @Override // com.google.android.exoplayer2.upstream.d.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long parse(Uri uri, InputStream inputStream) {
            return Long.valueOf(r0.O0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    static {
        n.a("goog.exo.dash");
    }

    /* synthetic */ DashMediaSource(y0 y0Var, va.c cVar, j.a aVar, com.google.android.exoplayer2.upstream.d.a aVar2, com.google.android.exoplayer2.source.dash.a.InterfaceC0284a interfaceC0284a, ra.d dVar, nb.f fVar, com.google.android.exoplayer2.drm.j jVar, com.google.android.exoplayer2.upstream.c cVar2, long j10, long j11, a aVar3) {
        this(y0Var, cVar, aVar, aVar2, interfaceC0284a, dVar, fVar, jVar, cVar2, j10, j11);
    }

    private static long J(va.g gVar, long j10, long j11) {
        long jH0 = r0.H0(gVar.f55339b);
        boolean zN = N(gVar);
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < gVar.f55340c.size(); i10++) {
            va.a aVar = (va.a) gVar.f55340c.get(i10);
            List list = aVar.f55295c;
            int i11 = aVar.f55294b;
            boolean z10 = (i11 == 1 || i11 == 2) ? false : true;
            if ((!zN || !z10) && !list.isEmpty()) {
                ua.e eVarK = ((va.j) list.get(0)).k();
                if (eVarK == null) {
                    return jH0 + j10;
                }
                long jI = eVarK.i(j10, j11);
                if (jI == 0) {
                    return jH0;
                }
                long jB = (eVarK.b(j10, j11) + jI) - 1;
                jMin = Math.min(jMin, eVarK.a(jB, j10) + eVarK.getTimeUs(jB) + jH0);
            }
        }
        return jMin;
    }

    private static long K(va.g gVar, long j10, long j11) {
        long jH0 = r0.H0(gVar.f55339b);
        boolean zN = N(gVar);
        long jMax = jH0;
        for (int i10 = 0; i10 < gVar.f55340c.size(); i10++) {
            va.a aVar = (va.a) gVar.f55340c.get(i10);
            List list = aVar.f55295c;
            int i11 = aVar.f55294b;
            boolean z10 = (i11 == 1 || i11 == 2) ? false : true;
            if ((!zN || !z10) && !list.isEmpty()) {
                ua.e eVarK = ((va.j) list.get(0)).k();
                if (eVarK == null || eVarK.i(j10, j11) == 0) {
                    return jH0;
                }
                jMax = Math.max(jMax, eVarK.getTimeUs(eVarK.b(j10, j11)) + jH0);
            }
        }
        return jMax;
    }

    private static long L(va.c cVar, long j10) {
        ua.e eVarK;
        int iD = cVar.d() - 1;
        va.g gVarC = cVar.c(iD);
        long jH0 = r0.H0(gVarC.f55339b);
        long jF = cVar.f(iD);
        long jH1 = r0.H0(j10);
        long jH2 = r0.H0(cVar.f55303a);
        long jH3 = r0.H0(5000L);
        for (int i10 = 0; i10 < gVarC.f55340c.size(); i10++) {
            List list = ((va.a) gVarC.f55340c.get(i10)).f55295c;
            if (!list.isEmpty() && (eVarK = ((va.j) list.get(0)).k()) != null) {
                long jC = ((jH2 + jH0) + eVarK.c(jF, jH1)) - jH1;
                if (jC < jH3 - 100000 || (jC > jH3 && jC < jH3 + 100000)) {
                    jH3 = jC;
                }
            }
        }
        return wc.e.b(jH3, 1000L, RoundingMode.CEILING);
    }

    private long M() {
        return Math.min((this.N - 1) * 1000, 5000);
    }

    private static boolean N(va.g gVar) {
        for (int i10 = 0; i10 < gVar.f55340c.size(); i10++) {
            int i11 = ((va.a) gVar.f55340c.get(i10)).f55294b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean O(va.g gVar) {
        for (int i10 = 0; i10 < gVar.f55340c.size(); i10++) {
            ua.e eVarK = ((va.j) ((va.a) gVar.f55340c.get(i10)).f55295c.get(0)).k();
            if (eVarK == null || eVarK.g()) {
                return true;
            }
        }
        return false;
    }

    private void P() {
        h0.j(this.B, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(IOException iOException) {
        u.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        Z(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(long j10) {
        this.M = j10;
        Z(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(boolean z10) {
        long j10;
        long j11;
        long j12;
        for (int i10 = 0; i10 < this.f17508v.size(); i10++) {
            int iKeyAt = this.f17508v.keyAt(i10);
            if (iKeyAt >= this.P) {
                ((com.google.android.exoplayer2.source.dash.b) this.f17508v.valueAt(i10)).B(this.I, iKeyAt - this.P);
            }
        }
        va.g gVarC = this.I.c(0);
        int iD = this.I.d() - 1;
        va.g gVarC2 = this.I.c(iD);
        long jF = this.I.f(iD);
        long jH0 = r0.H0(r0.e0(this.M));
        long jK = K(gVarC, this.I.f(0), jH0);
        long J = J(gVarC2, jF, jH0);
        boolean z11 = this.I.f55306d && !O(gVarC2);
        if (z11) {
            long j13 = this.I.f55308f;
            if (j13 != C.TIME_UNSET) {
                jK = Math.max(jK, J - r0.H0(j13));
            }
        }
        long j14 = J - jK;
        va.c cVar = this.I;
        if (cVar.f55306d) {
            ob.a.g(cVar.f55303a != C.TIME_UNSET);
            long jH1 = (jH0 - r0.H0(this.I.f55303a)) - jK;
            g0(jH1, j14);
            long jI1 = this.I.f55303a + r0.i1(jK);
            long jH2 = jH1 - r0.H0(this.F.f19061a);
            j10 = 0;
            long jMin = Math.min(this.f17503q, j14 / 2);
            j11 = jI1;
            j12 = jH2 < jMin ? jMin : jH2;
        } else {
            j10 = 0;
            j11 = -9223372036854775807L;
            j12 = 0;
        }
        long jH3 = jK - r0.H0(gVarC.f55339b);
        va.c cVar2 = this.I;
        B(new b(cVar2.f55303a, j11, this.M, this.P, jH3, j14, j12, cVar2, this.f17494h, cVar2.f55306d ? this.F : null));
        if (this.f17495i) {
            return;
        }
        this.E.removeCallbacks(this.f17510x);
        if (z11) {
            this.E.postDelayed(this.f17510x, L(this.I, r0.e0(this.M)));
        }
        if (this.J) {
            f0();
            return;
        }
        if (z10) {
            va.c cVar3 = this.I;
            if (cVar3.f55306d) {
                long j15 = cVar3.f55307e;
                if (j15 != C.TIME_UNSET) {
                    if (j15 == j10) {
                        j15 = 5000;
                    }
                    d0(Math.max(j10, (this.K + j15) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void a0(o oVar) {
        String str = oVar.f55393a;
        if (r0.c(str, "urn:mpeg:dash:utc:direct:2014") || r0.c(str, "urn:mpeg:dash:utc:direct:2012")) {
            b0(oVar);
            return;
        }
        if (r0.c(str, "urn:mpeg:dash:utc:http-iso:2014") || r0.c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            c0(oVar, new d());
            return;
        }
        if (r0.c(str, "urn:mpeg:dash:utc:http-xsdate:2014") || r0.c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            c0(oVar, new h(null));
        } else if (r0.c(str, "urn:mpeg:dash:utc:ntp:2014") || r0.c(str, "urn:mpeg:dash:utc:ntp:2012")) {
            P();
        } else {
            X(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void b0(o oVar) {
        try {
            Y(r0.O0(oVar.f55394b) - this.L);
        } catch (ParserException e10) {
            X(e10);
        }
    }

    private void c0(o oVar, com.google.android.exoplayer2.upstream.d.a aVar) {
        e0(new com.google.android.exoplayer2.upstream.d(this.A, Uri.parse(oVar.f55394b), 5, aVar), new g(this, null), 1);
    }

    private void d0(long j10) {
        this.E.postDelayed(this.f17509w, j10);
    }

    private void e0(com.google.android.exoplayer2.upstream.d dVar, Loader.b bVar, int i10) {
        this.f17504r.s(new i(dVar.f18811a, dVar.f18812b, this.B.m(dVar, bVar, i10)), dVar.f18813c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0() {
        Uri uri;
        this.E.removeCallbacks(this.f17509w);
        if (this.B.h()) {
            return;
        }
        if (this.B.i()) {
            this.J = true;
            return;
        }
        synchronized (this.f17507u) {
            uri = this.G;
        }
        this.J = false;
        e0(new com.google.android.exoplayer2.upstream.d(this.A, uri, 4, this.f17505s), this.f17506t, this.f17500n.a(4));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:67:0x00df  */
    private void g0(long j10, long j11) {
        long j12;
        long jMin;
        long jI1;
        long j13;
        long jR;
        long j14;
        l lVar;
        long j15;
        long j16;
        long j17;
        long jR2;
        float f10;
        float f11;
        l lVar2;
        l lVar3;
        l lVar4;
        va.c cVar;
        l lVar5;
        long j18;
        long jI2 = r0.i1(j10);
        long j19 = this.f17494h.f18984d.f19063c;
        if (j19 == C.TIME_UNSET) {
            l lVar6 = this.I.f55312j;
            if (lVar6 != null) {
                long j20 = lVar6.f55385c;
                if (j20 != C.TIME_UNSET) {
                    jMin = Math.min(jI2, j20);
                }
                jI1 = r0.i1(j10 - j11);
                if (jI1 < 0 && j12 > 0) {
                    jI1 = 0;
                }
                j13 = this.I.f55305c;
                if (j13 != C.TIME_UNSET) {
                    jI1 = Math.min(jI1 + j13, jI2);
                }
                jR = jI1;
                j14 = this.f17494h.f18984d.f19062b;
                if (j14 != C.TIME_UNSET) {
                    jR = r0.r(j14, jR, jI2);
                } else {
                    lVar = this.I.f55312j;
                    if (lVar != null) {
                        j15 = lVar.f55384b;
                        if (j15 != C.TIME_UNSET) {
                            jR = r0.r(j15, jR, jI2);
                        }
                    }
                }
                j16 = jR;
                if (j16 > j12) {
                    j17 = j16;
                } else {
                    j17 = j12;
                }
                jR2 = this.F.f19061a;
                if (jR2 == C.TIME_UNSET) {
                    cVar = this.I;
                    lVar5 = cVar.f55312j;
                    if (lVar5 != null) {
                        j18 = lVar5.f55383a;
                        if (j18 != C.TIME_UNSET) {
                            jR2 = j18;
                        } else {
                            jR2 = cVar.f55309g;
                            if (jR2 == C.TIME_UNSET) {
                                jR2 = this.f17502p;
                            }
                        }
                    } else {
                        jR2 = cVar.f55309g;
                        if (jR2 == C.TIME_UNSET) {
                            jR2 = this.f17502p;
                        }
                    }
                }
                if (jR2 < j16) {
                    jR2 = j16;
                }
                if (jR2 > j17) {
                    jR2 = r0.r(r0.i1(j10 - Math.min(this.f17503q, j11 / 2)), j16, j17);
                }
                long j21 = j17;
                y0.g gVar = this.f17494h.f18984d;
                f10 = gVar.f19064d;
                if (f10 == -3.4028235E38f) {
                    lVar4 = this.I.f55312j;
                    if (lVar4 != null) {
                        f10 = lVar4.f55386d;
                    } else {
                        f10 = -3.4028235E38f;
                    }
                }
                f11 = gVar.f19065e;
                if (f11 == -3.4028235E38f) {
                    lVar3 = this.I.f55312j;
                    if (lVar3 != null) {
                        f11 = lVar3.f55387e;
                    } else {
                        f11 = -3.4028235E38f;
                    }
                }
                if (f10 == -3.4028235E38f && f11 == -3.4028235E38f && ((lVar2 = this.I.f55312j) == null || lVar2.f55383a == C.TIME_UNSET)) {
                    f10 = 1.0f;
                    f11 = 1.0f;
                }
                this.F = new y0.g.a().k(jR2).i(j16).g(j21).j(f10).h(f11).f();
            }
            j12 = jI2;
            jI1 = r0.i1(j10 - j11);
            if (jI1 < 0) {
                jI1 = 0;
            }
            j13 = this.I.f55305c;
            if (j13 != C.TIME_UNSET) {
                jI1 = Math.min(jI1 + j13, jI2);
            }
            jR = jI1;
            j14 = this.f17494h.f18984d.f19062b;
            if (j14 != C.TIME_UNSET) {
                jR = r0.r(j14, jR, jI2);
            } else {
                lVar = this.I.f55312j;
                if (lVar != null) {
                    j15 = lVar.f55384b;
                    if (j15 != C.TIME_UNSET) {
                        jR = r0.r(j15, jR, jI2);
                    }
                }
            }
            j16 = jR;
            if (j16 > j12) {
                j17 = j16;
            } else {
                j17 = j12;
            }
            jR2 = this.F.f19061a;
            if (jR2 == C.TIME_UNSET) {
                cVar = this.I;
                lVar5 = cVar.f55312j;
                if (lVar5 != null) {
                    j18 = lVar5.f55383a;
                    if (j18 != C.TIME_UNSET) {
                        jR2 = j18;
                    } else {
                        jR2 = cVar.f55309g;
                        if (jR2 == C.TIME_UNSET) {
                            jR2 = this.f17502p;
                        }
                    }
                } else {
                    jR2 = cVar.f55309g;
                    if (jR2 == C.TIME_UNSET) {
                        jR2 = this.f17502p;
                    }
                }
            }
            if (jR2 < j16) {
                jR2 = j16;
            }
            if (jR2 > j17) {
                jR2 = r0.r(r0.i1(j10 - Math.min(this.f17503q, j11 / 2)), j16, j17);
            }
            long j22 = j17;
            y0.g gVar2 = this.f17494h.f18984d;
            f10 = gVar2.f19064d;
            if (f10 == -3.4028235E38f) {
                lVar4 = this.I.f55312j;
                if (lVar4 != null) {
                    f10 = lVar4.f55386d;
                } else {
                    f10 = -3.4028235E38f;
                }
            }
            f11 = gVar2.f19065e;
            if (f11 == -3.4028235E38f) {
                lVar3 = this.I.f55312j;
                if (lVar3 != null) {
                    f11 = lVar3.f55387e;
                } else {
                    f11 = -3.4028235E38f;
                }
            }
            if (f10 == -3.4028235E38f) {
                f10 = 1.0f;
                f11 = 1.0f;
            }
            this.F = new y0.g.a().k(jR2).i(j16).g(j22).j(f10).h(f11).f();
        }
        jMin = Math.min(jI2, j19);
        j12 = jMin;
        jI1 = r0.i1(j10 - j11);
        if (jI1 < 0) {
            jI1 = 0;
        }
        j13 = this.I.f55305c;
        if (j13 != C.TIME_UNSET) {
            jI1 = Math.min(jI1 + j13, jI2);
        }
        jR = jI1;
        j14 = this.f17494h.f18984d.f19062b;
        if (j14 != C.TIME_UNSET) {
            jR = r0.r(j14, jR, jI2);
        } else {
            lVar = this.I.f55312j;
            if (lVar != null) {
                j15 = lVar.f55384b;
                if (j15 != C.TIME_UNSET) {
                    jR = r0.r(j15, jR, jI2);
                }
            }
        }
        j16 = jR;
        if (j16 > j12) {
            j17 = j16;
        } else {
            j17 = j12;
        }
        jR2 = this.F.f19061a;
        if (jR2 == C.TIME_UNSET) {
            cVar = this.I;
            lVar5 = cVar.f55312j;
            if (lVar5 != null) {
                j18 = lVar5.f55383a;
                if (j18 != C.TIME_UNSET) {
                    jR2 = j18;
                } else {
                    jR2 = cVar.f55309g;
                    if (jR2 == C.TIME_UNSET) {
                        jR2 = this.f17502p;
                    }
                }
            } else {
                jR2 = cVar.f55309g;
                if (jR2 == C.TIME_UNSET) {
                    jR2 = this.f17502p;
                }
            }
        }
        if (jR2 < j16) {
            jR2 = j16;
        }
        if (jR2 > j17) {
            jR2 = r0.r(r0.i1(j10 - Math.min(this.f17503q, j11 / 2)), j16, j17);
        }
        long j23 = j17;
        y0.g gVar3 = this.f17494h.f18984d;
        f10 = gVar3.f19064d;
        if (f10 == -3.4028235E38f) {
            lVar4 = this.I.f55312j;
            if (lVar4 != null) {
                f10 = lVar4.f55386d;
            } else {
                f10 = -3.4028235E38f;
            }
        }
        f11 = gVar3.f19065e;
        if (f11 == -3.4028235E38f) {
            lVar3 = this.I.f55312j;
            if (lVar3 != null) {
                f11 = lVar3.f55387e;
            } else {
                f11 = -3.4028235E38f;
            }
        }
        if (f10 == -3.4028235E38f) {
            f10 = 1.0f;
            f11 = 1.0f;
        }
        this.F = new y0.g.a().k(jR2).i(j16).g(j23).j(f10).h(f11).f();
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void A(a0 a0Var) {
        this.C = a0Var;
        this.f17499m.e(Looper.myLooper(), y());
        this.f17499m.a();
        if (this.f17495i) {
            Z(false);
            return;
        }
        this.A = this.f17496j.createDataSource();
        this.B = new Loader("DashMediaSource");
        this.E = r0.w();
        f0();
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void C() {
        this.J = false;
        this.A = null;
        Loader loader = this.B;
        if (loader != null) {
            loader.k();
            this.B = null;
        }
        this.K = 0L;
        this.L = 0L;
        this.I = this.f17495i ? this.I : null;
        this.G = this.H;
        this.D = null;
        Handler handler = this.E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.E = null;
        }
        this.M = C.TIME_UNSET;
        this.N = 0;
        this.O = C.TIME_UNSET;
        this.f17508v.clear();
        this.f17501o.i();
        this.f17499m.release();
    }

    void Q(long j10) {
        long j11 = this.O;
        if (j11 == C.TIME_UNSET || j11 < j10) {
            this.O = j10;
        }
    }

    void R() {
        this.E.removeCallbacks(this.f17510x);
        f0();
    }

    void S(com.google.android.exoplayer2.upstream.d dVar, long j10, long j11) {
        i iVar = new i(dVar.f18811a, dVar.f18812b, dVar.d(), dVar.b(), j10, j11, dVar.a());
        this.f17500n.b(dVar.f18811a);
        this.f17504r.j(iVar, dVar.f18813c);
    }

    void T(com.google.android.exoplayer2.upstream.d dVar, long j10, long j11) {
        i iVar = new i(dVar.f18811a, dVar.f18812b, dVar.d(), dVar.b(), j10, j11, dVar.a());
        this.f17500n.b(dVar.f18811a);
        this.f17504r.m(iVar, dVar.f18813c);
        va.c cVar = (va.c) dVar.c();
        va.c cVar2 = this.I;
        int iD = cVar2 == null ? 0 : cVar2.d();
        long j12 = cVar.c(0).f55339b;
        int i10 = 0;
        while (i10 < iD && this.I.c(i10).f55339b < j12) {
            i10++;
        }
        if (cVar.f55306d) {
            if (iD - i10 > cVar.d()) {
                u.i("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j13 = this.O;
                if (j13 == C.TIME_UNSET || cVar.f55310h * 1000 > j13) {
                    this.N = 0;
                } else {
                    u.i("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.f55310h + ", " + this.O);
                }
            }
            int i11 = this.N;
            this.N = i11 + 1;
            if (i11 < this.f17500n.a(dVar.f18813c)) {
                d0(M());
                return;
            } else {
                this.D = new DashManifestStaleException();
                return;
            }
        }
        this.I = cVar;
        this.J = cVar.f55306d & this.J;
        this.K = j10 - j11;
        this.L = j10;
        synchronized (this.f17507u) {
            try {
                if (dVar.f18812b.f18779a == this.G) {
                    Uri uriD = this.I.f55313k;
                    if (uriD == null) {
                        uriD = dVar.d();
                    }
                    this.G = uriD;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (iD != 0) {
            this.P += i10;
            Z(true);
            return;
        }
        va.c cVar3 = this.I;
        if (!cVar3.f55306d) {
            Z(true);
            return;
        }
        o oVar = cVar3.f55311i;
        if (oVar != null) {
            a0(oVar);
        } else {
            P();
        }
    }

    Loader.c U(com.google.android.exoplayer2.upstream.d dVar, long j10, long j11, IOException iOException, int i10) {
        i iVar = new i(dVar.f18811a, dVar.f18812b, dVar.d(), dVar.b(), j10, j11, dVar.a());
        long jC = this.f17500n.c(new com.google.android.exoplayer2.upstream.c.C0294c(iVar, new ra.j(dVar.f18813c), iOException, i10));
        Loader.c cVarG = jC == C.TIME_UNSET ? Loader.f18746g : Loader.g(false, jC);
        boolean zC = cVarG.c();
        this.f17504r.q(iVar, dVar.f18813c, iOException, !zC);
        if (!zC) {
            this.f17500n.b(dVar.f18811a);
        }
        return cVarG;
    }

    void V(com.google.android.exoplayer2.upstream.d dVar, long j10, long j11) {
        i iVar = new i(dVar.f18811a, dVar.f18812b, dVar.d(), dVar.b(), j10, j11, dVar.a());
        this.f17500n.b(dVar.f18811a);
        this.f17504r.m(iVar, dVar.f18813c);
        Y(((Long) dVar.c()).longValue() - j10);
    }

    Loader.c W(com.google.android.exoplayer2.upstream.d dVar, long j10, long j11, IOException iOException) {
        this.f17504r.q(new i(dVar.f18811a, dVar.f18812b, dVar.d(), dVar.b(), j10, j11, dVar.a()), dVar.f18813c, iOException, true);
        this.f17500n.b(dVar.f18811a);
        X(iOException);
        return Loader.f18745f;
    }

    @Override // com.google.android.exoplayer2.source.p
    public y0 a() {
        return this.f17494h;
    }

    @Override // com.google.android.exoplayer2.source.p
    public void l(com.google.android.exoplayer2.source.o oVar) {
        com.google.android.exoplayer2.source.dash.b bVar = (com.google.android.exoplayer2.source.dash.b) oVar;
        bVar.x();
        this.f17508v.remove(bVar.f17540a);
    }

    @Override // com.google.android.exoplayer2.source.p
    public void maybeThrowSourceInfoRefreshError() {
        this.f17512z.maybeThrowError();
    }

    @Override // com.google.android.exoplayer2.source.p
    public com.google.android.exoplayer2.source.o o(p.b bVar, nb.b bVar2, long j10) {
        int iIntValue = ((Integer) bVar.f51199a).intValue() - this.P;
        q.a aVarV = v(bVar);
        com.google.android.exoplayer2.source.dash.b bVar3 = new com.google.android.exoplayer2.source.dash.b(this.P + iIntValue, this.I, this.f17501o, iIntValue, this.f17497k, this.C, null, this.f17499m, t(bVar), this.f17500n, aVarV, this.M, this.f17512z, bVar2, this.f17498l, this.f17511y, y());
        this.f17508v.put(bVar3.f17540a, bVar3);
        return bVar3;
    }

    private DashMediaSource(y0 y0Var, va.c cVar, j.a aVar, com.google.android.exoplayer2.upstream.d.a aVar2, com.google.android.exoplayer2.source.dash.a.InterfaceC0284a interfaceC0284a, ra.d dVar, nb.f fVar, com.google.android.exoplayer2.drm.j jVar, com.google.android.exoplayer2.upstream.c cVar2, long j10, long j11) {
        this.f17494h = y0Var;
        this.F = y0Var.f18984d;
        this.G = ((y0.h) ob.a.e(y0Var.f18982b)).f19079a;
        this.H = y0Var.f18982b.f19079a;
        this.I = cVar;
        this.f17496j = aVar;
        this.f17505s = aVar2;
        this.f17497k = interfaceC0284a;
        this.f17499m = jVar;
        this.f17500n = cVar2;
        this.f17502p = j10;
        this.f17503q = j11;
        this.f17498l = dVar;
        this.f17501o = new ua.b();
        boolean z10 = cVar != null;
        this.f17495i = z10;
        a aVar3 = null;
        this.f17504r = v(null);
        this.f17507u = new Object();
        this.f17508v = new SparseArray();
        this.f17511y = new c(this, aVar3);
        this.O = C.TIME_UNSET;
        this.M = C.TIME_UNSET;
        if (!z10) {
            this.f17506t = new e(this, aVar3);
            this.f17512z = new f();
            this.f17509w = new Runnable() { // from class: ua.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f54342a.f0();
                }
            };
            this.f17510x = new Runnable() { // from class: ua.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f54343a.Z(false);
                }
            };
            return;
        }
        ob.a.g(true ^ cVar.f55306d);
        this.f17506t = null;
        this.f17509w = null;
        this.f17510x = null;
        this.f17512z = new v.a();
    }
}
