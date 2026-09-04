package z0;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileOutputStream f58433a;

    public m0(FileOutputStream fileOutputStream) {
        kotlin.jvm.internal.s.h(fileOutputStream, "fileOutputStream");
        this.f58433a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f58433a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f58433a.write(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b10) throws IOException {
        kotlin.jvm.internal.s.h(b10, "b");
        this.f58433a.write(b10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bytes, int i10, int i11) throws IOException {
        kotlin.jvm.internal.s.h(bytes, "bytes");
        this.f58433a.write(bytes, i10, i11);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
