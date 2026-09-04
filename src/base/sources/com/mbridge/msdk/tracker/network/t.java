package com.mbridge.msdk.tracker.network;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class t<T> implements Comparable<t<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f33828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile p f33830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f33831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f33832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f33834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f33835h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f33836i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f33837j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f33838k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private v.a f33839l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f33840m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private u f33841n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f33842o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f33843p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f33844q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f33845r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f33846s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private x f33847t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b.a f33848u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f33849v;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public t(int i10, String str) {
        this(i10, str, 0);
    }

    private static int b(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public final boolean A() {
        return this.f33846s;
    }

    public final boolean B() {
        return this.f33845r;
    }

    protected abstract v<T> a(q qVar);

    protected abstract void a(T t10);

    public void a(String str) {
    }

    protected b0 c(b0 b0Var) {
        return b0Var;
    }

    public b.a d() {
        return this.f33848u;
    }

    public String e() {
        if (!TextUtils.isEmpty(this.f33829b)) {
            return this.f33829b;
        }
        if (this.f33828a == null) {
            this.f33828a = new com.mbridge.msdk.tracker.network.toolbox.e();
        }
        String strA = this.f33828a.a(this);
        this.f33829b = strA;
        return strA;
    }

    public Map<String, String> f() {
        return Collections.EMPTY_MAP;
    }

    public int g() {
        return this.f33833f;
    }

    public p h() {
        return this.f33830c;
    }

    protected Map<String, String> i() {
        return null;
    }

    protected String j() {
        return C.UTF8_NAME;
    }

    public int k() {
        return this.f33835h;
    }

    public a l() {
        return a.NORMAL;
    }

    public long m() {
        return this.f33849v;
    }

    public long n() {
        return SystemClock.elapsedRealtime() - this.f33831d;
    }

    public x o() {
        return this.f33847t;
    }

    public String p() {
        return this.f33836i;
    }

    public final int q() {
        x xVarO = o();
        if (xVarO == null) {
            return 30000;
        }
        return xVarO.b();
    }

    public final long r() {
        x xVarO = o();
        if (xVarO == null) {
            return CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        }
        long jA = xVarO.a();
        return jA < 0 ? CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL : jA;
    }

    public int s() {
        return this.f33837j;
    }

    public String t() {
        return this.f33834g;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(s());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(v() ? "[X] " : "[ ] ");
        sb2.append(t());
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(l());
        sb2.append(" ");
        sb2.append(this.f33840m);
        return sb2.toString();
    }

    public boolean u() {
        boolean z10;
        synchronized (this.f33838k) {
            z10 = this.f33844q;
        }
        return z10;
    }

    public boolean v() {
        boolean z10;
        synchronized (this.f33838k) {
            z10 = this.f33843p;
        }
        return z10;
    }

    public void w() {
        synchronized (this.f33838k) {
            this.f33844q = true;
        }
    }

    void x() {
        synchronized (this.f33838k) {
        }
    }

    public boolean y() {
        return true;
    }

    public final boolean z() {
        return this.f33842o;
    }

    public t(int i10, String str, int i11) {
        this(i10, str, i11, "un_known");
    }

    public boolean a() {
        return false;
    }

    void c(String str) {
        u uVar = this.f33841n;
        if (uVar != null) {
            uVar.c(this);
        }
    }

    public String d(String str) {
        if (this.f33832e != null && !TextUtils.isEmpty(str)) {
            try {
                return this.f33832e.get(str);
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public t(int i10, String str, int i11, String str2) {
        this.f33838k = new Object();
        this.f33842o = false;
        this.f33843p = false;
        this.f33844q = false;
        this.f33845r = false;
        this.f33846s = false;
        this.f33848u = null;
        this.f33849v = 0L;
        this.f33833f = i10;
        this.f33834g = str;
        this.f33835h = i11;
        this.f33836i = str2;
        a((x) new e());
        this.f33837j = b(str);
        this.f33831d = SystemClock.elapsedRealtime();
    }

    public void a(v.a aVar) {
        this.f33839l = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t<?> a(x xVar) {
        this.f33847t = xVar;
        return this;
    }

    public String c() {
        return "application/x-www-form-urlencoded; charset=" + j();
    }

    void a(int i10) {
        u uVar = this.f33841n;
        if (uVar != null) {
            uVar.a(this, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> b(int i10) {
        this.f33840m = Integer.valueOf(i10);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> c(boolean z10) {
        this.f33845r = z10;
        return this;
    }

    public byte[] b() {
        Map<String, String> mapI = i();
        if (mapI != null && mapI.size() > 0) {
            byte[] bArrA = a(mapI, j());
            this.f33849v = bArrA.length;
            return bArrA;
        }
        this.f33849v = 0L;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t<?> a(u uVar) {
        this.f33841n = uVar;
        return this;
    }

    private byte[] a(Map<String, String> map, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                i10++;
                if (entry.getKey() != null) {
                    sb2.append(URLEncoder.encode(entry.getKey(), str));
                    sb2.append('=');
                    sb2.append(URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), str));
                    if (i10 <= map.size() - 1) {
                        sb2.append('&');
                    }
                }
            }
            if (map.containsKey("rk") && map.containsKey("erk") && "1".equals(map.get("erk"))) {
                return ("p=" + URLEncoder.encode(v0.b(sb2.toString(), "ebmclXzZOhtU2sRlZxGL8A"), str)).getBytes(str);
            }
            return sb2.toString().getBytes(str);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Encoding not supported: " + str, e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> b(boolean z10) {
        this.f33846s = z10;
        return this;
    }

    public void b(b0 b0Var) {
        v.a aVar;
        synchronized (this.f33838k) {
            aVar = this.f33839l;
        }
        if (aVar != null) {
            aVar.a(b0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> a(boolean z10) {
        this.f33842o = z10;
        return this;
    }

    void a(v<?> vVar) {
        synchronized (this.f33838k) {
        }
    }

    public void a(p pVar) {
        this.f33830c = pVar;
    }

    public void a(String str, String str2) {
        if (this.f33832e == null) {
            this.f33832e = new HashMap();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            this.f33832e.put(str, str2);
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(t<T> tVar) {
        a aVarL = l();
        a aVarL2 = tVar.l();
        return aVarL == aVarL2 ? this.f33840m.intValue() - tVar.f33840m.intValue() : aVarL2.ordinal() - aVarL.ordinal();
    }
}
