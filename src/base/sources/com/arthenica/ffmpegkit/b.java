package com.arthenica.ffmpegkit;

import android.util.Log;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final AtomicLong f11059n = new AtomicLong(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final i f11061b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final String[] f11065f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final j f11072m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final long f11060a = f11059n.getAndIncrement();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Date f11062c = new Date();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Date f11063d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Date f11064e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final List f11066g = new LinkedList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final Object f11067h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected Future f11068i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected o f11069j = o.CREATED;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected m f11070k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected String f11071l = null;

    protected b(String[] strArr, i iVar, j jVar) {
        this.f11061b = iVar;
        this.f11065f = strArr;
        this.f11072m = jVar;
        FFmpegKitConfig.b(this);
    }

    @Override // com.arthenica.ffmpegkit.n
    public j a() {
        return this.f11072m;
    }

    @Override // com.arthenica.ffmpegkit.n
    public i b() {
        return this.f11061b;
    }

    @Override // com.arthenica.ffmpegkit.n
    public String d() {
        return this.f11071l;
    }

    @Override // com.arthenica.ffmpegkit.n
    public String e() {
        return k(5000);
    }

    @Override // com.arthenica.ffmpegkit.n
    public List f() {
        return j(5000);
    }

    @Override // com.arthenica.ffmpegkit.n
    public void g(h hVar) {
        synchronized (this.f11067h) {
            this.f11066g.add(hVar);
        }
    }

    @Override // com.arthenica.ffmpegkit.n
    public long getSessionId() {
        return this.f11060a;
    }

    void h(m mVar) {
        this.f11070k = mVar;
        this.f11069j = o.COMPLETED;
        this.f11064e = new Date();
    }

    void i(Exception exc) {
        this.f11071l = o5.a.a(exc);
        this.f11069j = o.FAILED;
        this.f11064e = new Date();
    }

    public List j(int i10) {
        s(i10);
        if (r()) {
            Log.i("ffmpeg-kit", String.format("getAllLogs was called to return all logs but there are still logs being transmitted for session id %d.", Long.valueOf(this.f11060a)));
        }
        return m();
    }

    public String k(int i10) {
        s(i10);
        if (r()) {
            Log.i("ffmpeg-kit", String.format("getAllLogsAsString was called to return all logs but there are still logs being transmitted for session id %d.", Long.valueOf(this.f11060a)));
        }
        return n();
    }

    public String[] l() {
        return this.f11065f;
    }

    public List m() {
        LinkedList linkedList;
        synchronized (this.f11067h) {
            linkedList = new LinkedList(this.f11066g);
        }
        return linkedList;
    }

    public String n() {
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.f11067h) {
            try {
                Iterator it = this.f11066g.iterator();
                while (it.hasNext()) {
                    sb2.append(((h) it.next()).b());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sb2.toString();
    }

    public m o() {
        return this.f11070k;
    }

    void p(Future future) {
        this.f11068i = future;
    }

    void q() {
        this.f11069j = o.RUNNING;
        this.f11063d = new Date();
    }

    public boolean r() {
        return FFmpegKitConfig.messagesInTransmit(this.f11060a) != 0;
    }

    protected void s(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (r() && System.currentTimeMillis() < ((long) i10) + jCurrentTimeMillis) {
            synchronized (this) {
                try {
                    wait(100L);
                } catch (InterruptedException unused) {
                }
            }
        }
    }
}
