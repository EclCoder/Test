package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class j implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Logger f33408g = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okio.d f33409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f33410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okio.c f33411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f33413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final d.b f33414f;

    j(com.mbridge.msdk.thrid.okio.d dVar, boolean z10) {
        this.f33409a = dVar;
        this.f33410b = z10;
        com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
        this.f33411c = cVar;
        this.f33414f = new d.b(cVar);
        this.f33412d = 16384;
    }

    public synchronized void a(m mVar) {
        try {
            if (this.f33413e) {
                throw new IOException("closed");
            }
            this.f33412d = mVar.c(this.f33412d);
            if (mVar.b() != -1) {
                this.f33414f.b(mVar.b());
            }
            a(0, 0, (byte) 4, (byte) 1);
            this.f33409a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b(m mVar) {
        int i10;
        try {
            if (this.f33413e) {
                throw new IOException("closed");
            }
            int i11 = 0;
            a(0, mVar.d() * 6, (byte) 4, (byte) 0);
            while (i11 < 10) {
                if (mVar.d(i11)) {
                    if (i11 == 4) {
                        i10 = 3;
                    } else {
                        i10 = i11 == 7 ? 4 : i11;
                    }
                    this.f33409a.writeShort(i10);
                    this.f33409a.writeInt(mVar.a(i11));
                }
                i11++;
            }
            this.f33409a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f33413e = true;
        this.f33409a.close();
    }

    public synchronized void d() {
        try {
            if (this.f33413e) {
                throw new IOException("closed");
            }
            if (this.f33410b) {
                Logger logger = f33408g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(com.mbridge.msdk.thrid.okhttp.internal.c.a(">> CONNECTION %s", e.f33288a.g()));
                }
                this.f33409a.write(e.f33288a.l());
                this.f33409a.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void flush() {
        if (this.f33413e) {
            throw new IOException("closed");
        }
        this.f33409a.flush();
    }

    public int h() {
        return this.f33412d;
    }

    public synchronized void a(int i10, int i11, List<c> list) {
        if (!this.f33413e) {
            this.f33414f.a(list);
            long size = this.f33411c.size();
            int iMin = (int) Math.min(this.f33412d - 4, size);
            long j10 = iMin;
            a(i10, iMin + 4, (byte) 5, size == j10 ? (byte) 4 : (byte) 0);
            this.f33409a.writeInt(i11 & Integer.MAX_VALUE);
            this.f33409a.a(this.f33411c, j10);
            if (size > j10) {
                b(i10, size - j10);
            }
        } else {
            throw new IOException("closed");
        }
    }

    private void b(int i10, long j10) {
        while (j10 > 0) {
            int iMin = (int) Math.min(this.f33412d, j10);
            long j11 = iMin;
            j10 -= j11;
            a(i10, iMin, (byte) 9, j10 == 0 ? (byte) 4 : (byte) 0);
            this.f33409a.a(this.f33411c, j11);
        }
    }

    public synchronized void a(boolean z10, int i10, int i11, List<c> list) {
        if (!this.f33413e) {
            a(z10, i10, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(int i10, b bVar) {
        if (!this.f33413e) {
            if (bVar.f33258a != -1) {
                a(i10, 4, (byte) 3, (byte) 0);
                this.f33409a.writeInt(bVar.f33258a);
                this.f33409a.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(boolean z10, int i10, com.mbridge.msdk.thrid.okio.c cVar, int i11) {
        if (!this.f33413e) {
            a(i10, z10 ? (byte) 1 : (byte) 0, cVar, i11);
        } else {
            throw new IOException("closed");
        }
    }

    void a(int i10, byte b10, com.mbridge.msdk.thrid.okio.c cVar, int i11) {
        a(i10, i11, (byte) 0, b10);
        if (i11 > 0) {
            this.f33409a.a(cVar, i11);
        }
    }

    public synchronized void a(boolean z10, int i10, int i11) {
        if (!this.f33413e) {
            a(0, 8, (byte) 6, z10 ? (byte) 1 : (byte) 0);
            this.f33409a.writeInt(i10);
            this.f33409a.writeInt(i11);
            this.f33409a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(int i10, b bVar, byte[] bArr) {
        try {
            if (!this.f33413e) {
                if (bVar.f33258a != -1) {
                    a(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.f33409a.writeInt(i10);
                    this.f33409a.writeInt(bVar.f33258a);
                    if (bArr.length > 0) {
                        this.f33409a.write(bArr);
                    }
                    this.f33409a.flush();
                } else {
                    throw e.a("errorCode.httpCode == -1", new Object[0]);
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a(int i10, long j10) {
        if (this.f33413e) {
            throw new IOException("closed");
        }
        if (j10 != 0 && j10 <= 2147483647L) {
            a(i10, 4, (byte) 8, (byte) 0);
            this.f33409a.writeInt((int) j10);
            this.f33409a.flush();
        } else {
            throw e.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10));
        }
    }

    public void a(int i10, int i11, byte b10, byte b11) {
        Logger logger = f33408g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.a(false, i10, i11, b10, b11));
        }
        int i12 = this.f33412d;
        if (i11 > i12) {
            throw e.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
        }
        if ((Integer.MIN_VALUE & i10) == 0) {
            a(this.f33409a, i11);
            this.f33409a.writeByte(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            this.f33409a.writeByte(b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            this.f33409a.writeInt(i10 & Integer.MAX_VALUE);
            return;
        }
        throw e.a("reserved bit set: %s", Integer.valueOf(i10));
    }

    private static void a(com.mbridge.msdk.thrid.okio.d dVar, int i10) {
        dVar.writeByte((i10 >>> 16) & 255);
        dVar.writeByte((i10 >>> 8) & 255);
        dVar.writeByte(i10 & 255);
    }

    void a(boolean z10, int i10, List<c> list) throws IOException {
        if (!this.f33413e) {
            this.f33414f.a(list);
            long size = this.f33411c.size();
            int iMin = (int) Math.min(this.f33412d, size);
            long j10 = iMin;
            byte b10 = size == j10 ? (byte) 4 : (byte) 0;
            if (z10) {
                b10 = (byte) (b10 | 1);
            }
            a(i10, iMin, (byte) 1, b10);
            this.f33409a.a(this.f33411c, j10);
            if (size > j10) {
                b(i10, size - j10);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }
}
