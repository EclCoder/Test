package androidx.media3.datasource.cache;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.FileDataSource;
import java.io.File;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import w1.c0;
import z1.l;
import z1.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements androidx.media3.datasource.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Cache f4784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.datasource.a f4785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.datasource.a f4786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.datasource.a f4787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a2.b f4788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f4789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f4790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f4791h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Uri f4792i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private z1.g f4793j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private z1.g f4794k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private androidx.media3.datasource.a f4795l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f4796m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f4797n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f4798o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a2.c f4799p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f4800q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f4801r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f4802s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f4803t;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements androidx.media3.datasource.a.InterfaceC0055a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Cache f4804a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private z1.d.a f4806c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f4808e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private androidx.media3.datasource.a.InterfaceC0055a f4809f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f4810g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f4811h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.media3.datasource.a.InterfaceC0055a f4805b = new FileDataSource.b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private a2.b f4807d = a2.b.f87a;

        private a b(androidx.media3.datasource.a aVar, int i10, int i11) {
            z1.d dVarCreateDataSink;
            Cache cache = (Cache) w1.a.e(this.f4804a);
            if (this.f4808e || aVar == null) {
                dVarCreateDataSink = null;
            } else {
                z1.d.a aVar2 = this.f4806c;
                dVarCreateDataSink = aVar2 != null ? aVar2.createDataSink() : new CacheDataSink.a().a(cache).createDataSink();
            }
            return new a(cache, aVar, this.f4805b.createDataSource(), dVarCreateDataSink, this.f4807d, i10, null, i11, null);
        }

        @Override // androidx.media3.datasource.a.InterfaceC0055a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createDataSource() {
            androidx.media3.datasource.a.InterfaceC0055a interfaceC0055a = this.f4809f;
            return b(interfaceC0055a != null ? interfaceC0055a.createDataSource() : null, this.f4811h, this.f4810g);
        }

        public c c(Cache cache) {
            this.f4804a = cache;
            return this;
        }

        public c d(androidx.media3.datasource.a.InterfaceC0055a interfaceC0055a) {
            this.f4805b = interfaceC0055a;
            return this;
        }

        public c e(z1.d.a aVar) {
            this.f4806c = aVar;
            this.f4808e = aVar == null;
            return this;
        }

        public c f(int i10) {
            this.f4811h = i10;
            return this;
        }

        public c g(androidx.media3.datasource.a.InterfaceC0055a interfaceC0055a) {
            this.f4809f = interfaceC0055a;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d() {
        androidx.media3.datasource.a aVar = this.f4795l;
        if (aVar == null) {
            return;
        }
        try {
            aVar.close();
        } finally {
            this.f4794k = null;
            this.f4795l = null;
            a2.c cVar = this.f4799p;
            if (cVar != null) {
                this.f4784a.c(cVar);
                this.f4799p = null;
            }
        }
    }

    private static Uri e(Cache cache, String str, Uri uri) {
        Uri uriA = a2.d.a(cache.getContentMetadata(str));
        return uriA != null ? uriA : uri;
    }

    private void f(Throwable th2) {
        if (h() || (th2 instanceof Cache.CacheException)) {
            this.f4800q = true;
        }
    }

    private boolean g() {
        return this.f4795l == this.f4787d;
    }

    private boolean h() {
        return this.f4795l == this.f4785b;
    }

    private boolean i() {
        return !h();
    }

    private boolean j() {
        return this.f4795l == this.f4786c;
    }

    private void m(z1.g gVar, boolean z10) throws InterruptedIOException {
        a2.c cVarE;
        long jMin;
        z1.g gVarA;
        androidx.media3.datasource.a aVar;
        String str = (String) c0.h(gVar.f58552i);
        if (this.f4801r) {
            cVarE = null;
        } else if (this.f4789f) {
            try {
                cVarE = this.f4784a.e(str, this.f4797n, this.f4798o);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            cVarE = this.f4784a.b(str, this.f4797n, this.f4798o);
        }
        if (cVarE == null) {
            aVar = this.f4787d;
            gVarA = gVar.a().h(this.f4797n).g(this.f4798o).a();
        } else if (cVarE.f91d) {
            Uri uriFromFile = Uri.fromFile((File) c0.h(cVarE.f92e));
            long j10 = cVarE.f89b;
            long j11 = this.f4797n - j10;
            long jMin2 = cVarE.f90c - j11;
            long j12 = this.f4798o;
            if (j12 != -1) {
                jMin2 = Math.min(jMin2, j12);
            }
            gVarA = gVar.a().i(uriFromFile).k(j10).h(j11).g(jMin2).a();
            aVar = this.f4785b;
        } else {
            if (cVarE.c()) {
                jMin = this.f4798o;
            } else {
                jMin = cVarE.f90c;
                long j13 = this.f4798o;
                if (j13 != -1) {
                    jMin = Math.min(jMin, j13);
                }
            }
            gVarA = gVar.a().h(this.f4797n).g(jMin).a();
            aVar = this.f4786c;
            if (aVar == null) {
                aVar = this.f4787d;
                this.f4784a.c(cVarE);
                cVarE = null;
            }
        }
        this.f4803t = (this.f4801r || aVar != this.f4787d) ? Long.MAX_VALUE : this.f4797n + 102400;
        if (z10) {
            w1.a.g(g());
            if (aVar == this.f4787d) {
                return;
            }
            try {
                d();
            } catch (Throwable th2) {
                if (((a2.c) c0.h(cVarE)).b()) {
                    this.f4784a.c(cVarE);
                }
                throw th2;
            }
        }
        if (cVarE != null && cVarE.b()) {
            this.f4799p = cVarE;
        }
        this.f4795l = aVar;
        this.f4794k = gVarA;
        this.f4796m = 0L;
        long jA = aVar.a(gVarA);
        a2.e eVar = new a2.e();
        if (gVarA.f58551h == -1 && jA != -1) {
            this.f4798o = jA;
            a2.e.g(eVar, this.f4797n + jA);
        }
        if (i()) {
            Uri uri = aVar.getUri();
            this.f4792i = uri;
            a2.e.h(eVar, gVar.f58544a.equals(uri) ? null : this.f4792i);
        }
        if (j()) {
            this.f4784a.d(str, eVar);
        }
    }

    private void n(String str) {
        this.f4798o = 0L;
        if (j()) {
            a2.e eVar = new a2.e();
            a2.e.g(eVar, this.f4797n);
            this.f4784a.d(str, eVar);
        }
    }

    private int o(z1.g gVar) {
        if (this.f4790g && this.f4800q) {
            return 0;
        }
        return (this.f4791h && gVar.f58551h == -1) ? 1 : -1;
    }

    @Override // androidx.media3.datasource.a
    public long a(z1.g gVar) {
        try {
            String strB = this.f4788e.b(gVar);
            z1.g gVarA = gVar.a().f(strB).a();
            this.f4793j = gVarA;
            this.f4792i = e(this.f4784a, strB, gVarA.f58544a);
            this.f4797n = gVar.f58550g;
            int iO = o(gVar);
            boolean z10 = iO != -1;
            this.f4801r = z10;
            if (z10) {
                l(iO);
            }
            if (this.f4801r) {
                this.f4798o = -1L;
            } else {
                long jB = a2.d.b(this.f4784a.getContentMetadata(strB));
                this.f4798o = jB;
                if (jB != -1) {
                    long j10 = jB - gVar.f58550g;
                    this.f4798o = j10;
                    if (j10 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            long jMin = gVar.f58551h;
            if (jMin != -1) {
                long j11 = this.f4798o;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f4798o = jMin;
            }
            long j12 = this.f4798o;
            if (j12 > 0 || j12 == -1) {
                m(gVarA, false);
            }
            long j13 = gVar.f58551h;
            return j13 != -1 ? j13 : this.f4798o;
        } catch (Throwable th2) {
            f(th2);
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.a
    public void c(m mVar) {
        w1.a.e(mVar);
        this.f4785b.c(mVar);
        this.f4787d.c(mVar);
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        this.f4793j = null;
        this.f4792i = null;
        this.f4797n = 0L;
        k();
        try {
            d();
        } catch (Throwable th2) {
            f(th2);
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.a
    public Map getResponseHeaders() {
        return i() ? this.f4787d.getResponseHeaders() : Collections.EMPTY_MAP;
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        return this.f4792i;
    }

    @Override // t1.g
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f4798o == 0) {
            return -1;
        }
        z1.g gVar = (z1.g) w1.a.e(this.f4793j);
        z1.g gVar2 = (z1.g) w1.a.e(this.f4794k);
        try {
            if (this.f4797n >= this.f4803t) {
                m(gVar, true);
            }
            int i12 = ((androidx.media3.datasource.a) w1.a.e(this.f4795l)).read(bArr, i10, i11);
            if (i12 == -1) {
                if (i()) {
                    long j10 = gVar2.f58551h;
                    if (j10 == -1 || this.f4796m < j10) {
                        n((String) c0.h(gVar.f58552i));
                        return i12;
                    }
                }
                long j11 = this.f4798o;
                if (j11 <= 0) {
                    if (j11 == -1) {
                    }
                }
                d();
                m(gVar, false);
                return read(bArr, i10, i11);
            }
            if (h()) {
                this.f4802s += (long) i12;
            }
            long j12 = i12;
            this.f4797n += j12;
            this.f4796m += j12;
            long j13 = this.f4798o;
            if (j13 != -1) {
                this.f4798o = j13 - j12;
                return i12;
            }
            return i12;
        } catch (Throwable th2) {
            f(th2);
            throw th2;
        }
    }

    private a(Cache cache, androidx.media3.datasource.a aVar, androidx.media3.datasource.a aVar2, z1.d dVar, a2.b bVar, int i10, PriorityTaskManager priorityTaskManager, int i11, b bVar2) {
        this.f4784a = cache;
        this.f4785b = aVar2;
        this.f4788e = bVar == null ? a2.b.f87a : bVar;
        this.f4789f = (i10 & 1) != 0;
        this.f4790g = (i10 & 2) != 0;
        this.f4791h = (i10 & 4) != 0;
        if (aVar != null) {
            this.f4787d = aVar;
            this.f4786c = dVar != null ? new l(aVar, dVar) : null;
        } else {
            this.f4787d = androidx.media3.datasource.f.f4860a;
            this.f4786c = null;
        }
    }

    private void k() {
    }

    private void l(int i10) {
    }
}
