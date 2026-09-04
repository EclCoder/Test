package w1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f55764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f55765b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FileOutputStream f55766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f55767b = false;

        public a(File file) {
            this.f55766a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f55767b) {
                return;
            }
            this.f55767b = true;
            flush();
            try {
                this.f55766a.getFD().sync();
            } catch (IOException e10) {
                n.i("AtomicFile", "Failed to sync file descriptor:", e10);
            }
            this.f55766a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f55766a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            this.f55766a.write(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f55766a.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.f55766a.write(bArr, i10, i11);
        }
    }

    public b(File file) {
        this.f55764a = file;
        this.f55765b = new File(file.getPath() + ".bak");
    }

    private void e() {
        if (this.f55765b.exists()) {
            this.f55764a.delete();
            this.f55765b.renameTo(this.f55764a);
        }
    }

    public void a() {
        this.f55764a.delete();
        this.f55765b.delete();
    }

    public void b(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f55765b.delete();
    }

    public boolean c() {
        return this.f55764a.exists() || this.f55765b.exists();
    }

    public InputStream d() {
        e();
        return new FileInputStream(this.f55764a);
    }

    public OutputStream f() throws IOException {
        if (this.f55764a.exists()) {
            if (this.f55765b.exists()) {
                this.f55764a.delete();
            } else if (!this.f55764a.renameTo(this.f55765b)) {
                n.h("AtomicFile", "Couldn't rename file " + this.f55764a + " to backup file " + this.f55765b);
            }
        }
        try {
            return new a(this.f55764a);
        } catch (FileNotFoundException e10) {
            File parentFile = this.f55764a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f55764a, e10);
            }
            try {
                return new a(this.f55764a);
            } catch (FileNotFoundException e11) {
                throw new IOException("Couldn't create " + this.f55764a, e11);
            }
        }
    }
}
