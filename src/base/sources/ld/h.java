package ld;

import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class h implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Logger f44328g = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RandomAccessFile f44329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f44330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f44332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f44333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f44334f = new byte[16];

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f44335a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f44336b;

        a(StringBuilder sb2) {
            this.f44336b = sb2;
        }

        @Override // ld.h.d
        public void a(InputStream inputStream, int i10) {
            if (this.f44335a) {
                this.f44335a = false;
            } else {
                this.f44336b.append(", ");
            }
            this.f44336b.append(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final b f44338c = new b(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f44339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f44340b;

        b(int i10, int i11) {
            this.f44339a = i10;
            this.f44340b = i11;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f44339a + ", length = " + this.f44340b + "]";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class c extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f44341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f44342b;

        /* synthetic */ c(h hVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            h.s(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f44342b;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            h.this.p0(this.f44341a, bArr, i10, i11);
            this.f44341a = h.this.T0(this.f44341a + i11);
            this.f44342b -= i11;
            return i11;
        }

        private c(b bVar) {
            this.f44341a = h.this.T0(bVar.f44339a + 4);
            this.f44342b = bVar.f44340b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f44342b == 0) {
                return -1;
            }
            h.this.f44329a.seek(this.f44341a);
            int i10 = h.this.f44329a.read();
            this.f44341a = h.this.T0(this.f44341a + 1);
            this.f44342b--;
            return i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        void a(InputStream inputStream, int i10);
    }

    public h(File file) throws IOException {
        if (!file.exists()) {
            q(file);
        }
        this.f44329a = t(file);
        d0();
    }

    private void F0(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iT0 = T0(i10);
        int i13 = iT0 + i12;
        int i14 = this.f44330b;
        if (i13 <= i14) {
            this.f44329a.seek(iT0);
            this.f44329a.write(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iT0;
        this.f44329a.seek(iT0);
        this.f44329a.write(bArr, i11, i15);
        this.f44329a.seek(16L);
        this.f44329a.write(bArr, i11 + i15, i12 - i15);
    }

    private void K0(int i10) throws IOException {
        this.f44329a.setLength(i10);
        this.f44329a.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int T0(int i10) {
        int i11 = this.f44330b;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    private void U0(int i10, int i11, int i12, int i13) throws IOException {
        W0(this.f44334f, i10, i11, i12, i13);
        this.f44329a.seek(0L);
        this.f44329a.write(this.f44334f);
    }

    private static void V0(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    private static void W0(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            V0(bArr, i10, i11);
            i10 += 4;
        }
    }

    private b c0(int i10) throws IOException {
        if (i10 == 0) {
            return b.f44338c;
        }
        this.f44329a.seek(i10);
        return new b(i10, this.f44329a.readInt());
    }

    private void d0() throws IOException {
        this.f44329a.seek(0L);
        this.f44329a.readFully(this.f44334f);
        int iG0 = g0(this.f44334f, 0);
        this.f44330b = iG0;
        if (iG0 <= this.f44329a.length()) {
            this.f44331c = g0(this.f44334f, 4);
            int iG1 = g0(this.f44334f, 8);
            int iG2 = g0(this.f44334f, 12);
            this.f44332d = c0(iG1);
            this.f44333e = c0(iG2);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f44330b + ", Actual length: " + this.f44329a.length());
    }

    private static int g0(byte[] bArr, int i10) {
        return ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) + ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) + ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) + (bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    private int i0() {
        return this.f44330b - N0();
    }

    private void l(int i10) throws IOException {
        int i11 = i10 + 4;
        int iI0 = i0();
        if (iI0 >= i11) {
            return;
        }
        int i12 = this.f44330b;
        do {
            iI0 += i12;
            i12 <<= 1;
        } while (iI0 < i11);
        K0(i12);
        b bVar = this.f44333e;
        int iT0 = T0(bVar.f44339a + 4 + bVar.f44340b);
        if (iT0 < this.f44332d.f44339a) {
            FileChannel channel = this.f44329a.getChannel();
            channel.position(this.f44330b);
            long j10 = iT0 - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f44333e.f44339a;
        int i14 = this.f44332d.f44339a;
        if (i13 < i14) {
            int i15 = (this.f44330b + i13) - 16;
            U0(i12, this.f44331c, i14, i15);
            this.f44333e = new b(i15, this.f44333e.f44340b);
        } else {
            U0(i12, this.f44331c, i14, i13);
        }
        this.f44330b = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iT0 = T0(i10);
        int i13 = iT0 + i12;
        int i14 = this.f44330b;
        if (i13 <= i14) {
            this.f44329a.seek(iT0);
            this.f44329a.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iT0;
        this.f44329a.seek(iT0);
        this.f44329a.readFully(bArr, i11, i15);
        this.f44329a.seek(16L);
        this.f44329a.readFully(bArr, i11 + i15, i12 - i15);
    }

    private static void q(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileT = t(file2);
        try {
            randomAccessFileT.setLength(4096L);
            randomAccessFileT.seek(0L);
            byte[] bArr = new byte[16];
            W0(bArr, 4096, 0, 0, 0);
            randomAccessFileT.write(bArr);
            randomAccessFileT.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th2) {
            randomAccessFileT.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object s(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile t(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    public int N0() {
        if (this.f44331c == 0) {
            return 16;
        }
        b bVar = this.f44333e;
        int i10 = bVar.f44339a;
        int i11 = this.f44332d.f44339a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.f44340b + 16 : (((i10 + 4) + bVar.f44340b) + this.f44330b) - i11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f44329a.close();
    }

    public void i(byte[] bArr) {
        j(bArr, 0, bArr.length);
    }

    public synchronized void j(byte[] bArr, int i10, int i11) {
        int iT0;
        try {
            s(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            l(i11);
            boolean zR = r();
            if (zR) {
                iT0 = 16;
            } else {
                b bVar = this.f44333e;
                iT0 = T0(bVar.f44339a + 4 + bVar.f44340b);
            }
            b bVar2 = new b(iT0, i11);
            V0(this.f44334f, 0, i11);
            F0(bVar2.f44339a, this.f44334f, 0, 4);
            F0(bVar2.f44339a + 4, bArr, i10, i11);
            U0(this.f44330b, this.f44331c + 1, zR ? bVar2.f44339a : this.f44332d.f44339a, bVar2.f44339a);
            this.f44333e = bVar2;
            this.f44331c++;
            if (zR) {
                this.f44332d = bVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void k() {
        try {
            U0(4096, 0, 0, 0);
            this.f44331c = 0;
            b bVar = b.f44338c;
            this.f44332d = bVar;
            this.f44333e = bVar;
            if (this.f44330b > 4096) {
                K0(4096);
            }
            this.f44330b = 4096;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void m(d dVar) {
        int iT0 = this.f44332d.f44339a;
        for (int i10 = 0; i10 < this.f44331c; i10++) {
            b bVarC0 = c0(iT0);
            dVar.a(new c(this, bVarC0, null), bVarC0.f44340b);
            iT0 = T0(bVarC0.f44339a + 4 + bVarC0.f44340b);
        }
    }

    public synchronized void m0() {
        try {
            if (r()) {
                throw new NoSuchElementException();
            }
            if (this.f44331c == 1) {
                k();
            } else {
                b bVar = this.f44332d;
                int iT0 = T0(bVar.f44339a + 4 + bVar.f44340b);
                p0(iT0, this.f44334f, 0, 4);
                int iG0 = g0(this.f44334f, 0);
                U0(this.f44330b, this.f44331c - 1, iT0, this.f44333e.f44339a);
                this.f44331c--;
                this.f44332d = new b(iT0, iG0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean r() {
        return this.f44331c == 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f44330b);
        sb2.append(", size=");
        sb2.append(this.f44331c);
        sb2.append(", first=");
        sb2.append(this.f44332d);
        sb2.append(", last=");
        sb2.append(this.f44333e);
        sb2.append(PvZsvNiPV.FOILy);
        try {
            m(new a(sb2));
        } catch (IOException e10) {
            f44328g.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }
}
