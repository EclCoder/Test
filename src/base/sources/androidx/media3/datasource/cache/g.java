package androidx.media3.datasource.cache;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class g extends BufferedOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f4842a;

    public g(OutputStream outputStream) {
        super(outputStream);
    }

    public void a(OutputStream outputStream) {
        w1.a.g(this.f4842a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f4842a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f4842a = true;
        flush();
        th = null;
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            c0.S0(th);
        }
    }

    public g(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }
}
