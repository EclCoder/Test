package androidx.media3.datasource.cache;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import w1.c0;
import w1.n;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class CacheDataSink implements z1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Cache f4771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f4772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z1.g f4774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f4775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private File f4776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private OutputStream f4777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f4778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f4779i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g f4780j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class CacheDataSinkException extends Cache.CacheException {
        public CacheDataSinkException(IOException iOException) {
            super(iOException);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements z1.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Cache f4781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f4782b = 5242880;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f4783c = com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSink.DEFAULT_BUFFER_SIZE;

        public a a(Cache cache) {
            this.f4781a = cache;
            return this;
        }

        @Override // z1.d.a
        public z1.d createDataSink() {
            return new CacheDataSink((Cache) w1.a.e(this.f4781a), this.f4782b, this.f4783c);
        }
    }

    public CacheDataSink(Cache cache, long j10, int i10) {
        w1.a.h(j10 > 0 || j10 == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j10 != -1 && j10 < CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE) {
            n.h("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f4771a = (Cache) w1.a.e(cache);
        this.f4772b = j10 == -1 ? Long.MAX_VALUE : j10;
        this.f4773c = i10;
    }

    private void b() {
        OutputStream outputStream = this.f4777g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            c0.l(this.f4777g);
            this.f4777g = null;
            File file = (File) c0.h(this.f4776f);
            this.f4776f = null;
            this.f4771a.f(file, this.f4778h);
        } catch (Throwable th2) {
            c0.l(this.f4777g);
            this.f4777g = null;
            File file2 = (File) c0.h(this.f4776f);
            this.f4776f = null;
            file2.delete();
            throw th2;
        }
    }

    private void c(z1.g gVar) {
        long j10 = gVar.f58551h;
        this.f4776f = this.f4771a.startFile((String) c0.h(gVar.f58552i), gVar.f58550g + this.f4779i, j10 != -1 ? Math.min(j10 - this.f4779i, this.f4775e) : -1L);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f4776f);
        if (this.f4773c > 0) {
            g gVar2 = this.f4780j;
            if (gVar2 == null) {
                this.f4780j = new g(fileOutputStream, this.f4773c);
            } else {
                gVar2.a(fileOutputStream);
            }
            this.f4777g = this.f4780j;
        } else {
            this.f4777g = fileOutputStream;
        }
        this.f4778h = 0L;
    }

    @Override // z1.d
    public void a(z1.g gVar) throws CacheDataSinkException {
        w1.a.e(gVar.f58552i);
        if (gVar.f58551h == -1 && gVar.d(2)) {
            this.f4774d = null;
            return;
        }
        this.f4774d = gVar;
        this.f4775e = gVar.d(4) ? this.f4772b : Long.MAX_VALUE;
        this.f4779i = 0L;
        try {
            c(gVar);
        } catch (IOException e10) {
            throw new CacheDataSinkException(e10);
        }
    }

    @Override // z1.d
    public void close() throws CacheDataSinkException {
        if (this.f4774d == null) {
            return;
        }
        try {
            b();
        } catch (IOException e10) {
            throw new CacheDataSinkException(e10);
        }
    }

    @Override // z1.d
    public void write(byte[] bArr, int i10, int i11) throws CacheDataSinkException {
        z1.g gVar = this.f4774d;
        if (gVar == null) {
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            try {
                if (this.f4778h == this.f4775e) {
                    b();
                    c(gVar);
                }
                int iMin = (int) Math.min(i11 - i12, this.f4775e - this.f4778h);
                ((OutputStream) c0.h(this.f4777g)).write(bArr, i10 + i12, iMin);
                i12 += iMin;
                long j10 = iMin;
                this.f4778h += j10;
                this.f4779i += j10;
            } catch (IOException e10) {
                throw new CacheDataSinkException(e10);
            }
        }
    }
}
