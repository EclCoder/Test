package tj;

import gl.r;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class e {
    public static final List a(ByteBuffer byteBuffer, byte[] prefix) {
        s.h(byteBuffer, "<this>");
        s.h(prefix, "prefix");
        if (prefix.length == 0) {
            return r.l();
        }
        ArrayList arrayList = new ArrayList();
        int iLimit = (byteBuffer.limit() - prefix.length) + 1;
        for (int i10 = 0; i10 < iLimit; i10++) {
            int length = prefix.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    arrayList.add(Integer.valueOf(i10));
                    break;
                }
                if (byteBuffer.get(i10 + i11) != prefix[i11]) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }

    public static final void b(ByteBuffer byteBuffer, ByteBuffer buffer, int i10, int i11) {
        s.h(byteBuffer, "<this>");
        s.h(buffer, "buffer");
        int iLimit = buffer.limit();
        buffer.position(i10);
        buffer.limit(i10 + i11);
        byteBuffer.put(buffer);
        buffer.limit(iLimit);
    }

    public static final int c(InputStream inputStream) {
        s.h(inputStream, "<this>");
        return (inputStream.read() & 255) | ((inputStream.read() & 255) << 8);
    }

    public static final int d(InputStream inputStream) {
        s.h(inputStream, "<this>");
        return (inputStream.read() & 255) | ((inputStream.read() & 255) << 16) | ((inputStream.read() & 255) << 8);
    }

    public static final int e(InputStream inputStream) {
        s.h(inputStream, "<this>");
        return (inputStream.read() & 255) | ((inputStream.read() & 255) << 24) | ((inputStream.read() & 255) << 16) | ((inputStream.read() & 255) << 8);
    }

    public static final int f(InputStream inputStream) {
        s.h(inputStream, "<this>");
        return i(e(inputStream));
    }

    public static final void g(InputStream inputStream, byte[] byteArray) throws IOException {
        s.h(inputStream, "<this>");
        s.h(byteArray, "byteArray");
        int i10 = 0;
        while (i10 < byteArray.length) {
            int i11 = inputStream.read(byteArray, i10, byteArray.length - i10);
            if (i11 != -1) {
                i10 += i11;
            }
        }
    }

    public static final byte[] h(long j10) {
        byte[] bArrArray = ByteBuffer.allocate(8).putLong(j10).array();
        s.g(bArrArray, "array(...)");
        return bArrArray;
    }

    private static final int i(int i10) {
        return Integer.reverseBytes(i10);
    }

    public static final void j(OutputStream outputStream, int i10) throws IOException {
        s.h(outputStream, "<this>");
        outputStream.write(i10 >>> 8);
        outputStream.write(i10);
    }

    public static final void k(OutputStream outputStream, int i10) throws IOException {
        s.h(outputStream, "<this>");
        outputStream.write(i10 >>> 16);
        outputStream.write(i10 >>> 8);
        outputStream.write(i10);
    }

    public static final void l(OutputStream outputStream, int i10) throws IOException {
        s.h(outputStream, "<this>");
        outputStream.write(i10 >>> 24);
        outputStream.write(i10 >>> 16);
        outputStream.write(i10 >>> 8);
        outputStream.write(i10);
    }

    public static final void m(OutputStream outputStream, int i10) throws IOException {
        s.h(outputStream, "<this>");
        outputStream.write(i10);
        outputStream.write(i10 >>> 8);
        outputStream.write(i10 >>> 16);
        outputStream.write(i10 >>> 24);
    }
}
