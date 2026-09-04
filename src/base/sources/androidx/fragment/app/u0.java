package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class u0 extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StringBuilder f4287b = new StringBuilder(128);

    u0(String str) {
        this.f4286a = str;
    }

    private void d() {
        if (this.f4287b.length() > 0) {
            Log.d(this.f4286a, this.f4287b.toString());
            StringBuilder sb2 = this.f4287b;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        d();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                d();
            } else {
                this.f4287b.append(c10);
            }
        }
    }
}
