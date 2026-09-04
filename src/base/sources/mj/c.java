package mj;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46362a = "Handshake";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f46363b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f46364c = 1536;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f46365d;

    private final byte[] a(InputStream inputStream) throws IOException {
        Log.i(this.f46362a, "reading S0");
        int i10 = inputStream.read();
        if (i10 == this.f46363b || i10 == 72) {
            Log.i(this.f46362a, "read S0 successful");
            return new byte[]{(byte) i10};
        }
        throw new IOException(this.f46362a + " error, unexpected " + i10 + " S0 received");
    }

    private final byte[] b(InputStream inputStream) throws IOException {
        Log.i(this.f46362a, "reading S1");
        byte[] bArr = new byte[this.f46364c];
        tj.e.g(inputStream, bArr);
        Log.i(this.f46362a, "read S1 successful");
        return bArr;
    }

    private final byte[] c(InputStream inputStream, byte[] bArr) throws IOException {
        Log.i(this.f46362a, "reading S2");
        byte[] bArr2 = new byte[this.f46364c];
        tj.e.g(inputStream, bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.e(this.f46362a, "S2 content is different that C1");
        }
        Log.i(this.f46362a, "read S2 successful");
        return bArr2;
    }

    private final void e(OutputStream outputStream) throws IOException {
        Log.i(this.f46362a, "writing C0");
        outputStream.write(this.f46363b);
        Log.i(this.f46362a, "C0 write successful");
    }

    private final byte[] f(OutputStream outputStream) throws IOException {
        Log.i(this.f46362a, "writing C1");
        byte[] bArr = new byte[this.f46364c];
        int iA = (int) (ji.k.a() / ((long) 1000));
        this.f46365d = iA;
        Log.i(this.f46362a, "writing time " + iA + " to c1");
        int i10 = this.f46365d;
        System.arraycopy(new byte[]{(byte) (i10 >>> 24), (byte) (i10 >>> 16), (byte) (i10 >>> 8), (byte) i10}, 0, bArr, 0, 4);
        Log.i(this.f46362a, "writing zero to c1");
        System.arraycopy(new byte[]{0, 0, 0, 0}, 0, bArr, 4, 4);
        Log.i(this.f46362a, "writing random to c1");
        wl.c.a aVar = wl.c.f56362a;
        int i11 = this.f46364c;
        int i12 = i11 - 8;
        byte[] bArr2 = new byte[i12];
        int i13 = i11 - 9;
        if (i13 >= 0) {
            int i14 = 0;
            while (true) {
                int i15 = i14 + 1;
                bArr2[i14] = (byte) aVar.h();
                if (i15 > i13) {
                    break;
                }
                i14 = i15;
            }
        }
        System.arraycopy(bArr2, 0, bArr, 8, i12);
        outputStream.write(bArr);
        Log.i(this.f46362a, "C1 write successful");
        return bArr;
    }

    private final void g(OutputStream outputStream, byte[] bArr) throws IOException {
        Log.i(this.f46362a, "writing C2");
        outputStream.write(bArr);
        Log.i(this.f46362a, "C2 write successful");
    }

    public final boolean d(uj.a socket) throws IOException {
        kotlin.jvm.internal.s.h(socket, "socket");
        OutputStream outputStreamF = socket.f();
        e(outputStreamF);
        byte[] bArrF = f(outputStreamF);
        uj.a.d(socket, false, 1, null);
        InputStream inputStreamE = socket.e();
        a(inputStreamE);
        g(socket.f(), b(inputStreamE));
        uj.a.d(socket, false, 1, null);
        c(socket.e(), bArrF);
        return true;
    }
}
