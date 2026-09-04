package k8;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class i implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43013a = 1179403647;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileChannel f43014b;

    public i(File file) {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f43014b = new FileInputStream(file).getChannel();
    }

    private long a(d dVar, long j10, long j11) {
        for (long j12 = 0; j12 < j10; j12++) {
            e eVarB = dVar.b(j12);
            if (eVarB.f43006a == 1) {
                long j13 = eVarB.f43008c;
                if (j13 <= j11 && j11 <= eVarB.f43009d + j13) {
                    return (j11 - j13) + eVarB.f43007b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f43014b.close();
    }

    public d d() throws IOException {
        this.f43014b.position(0L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        if (q(byteBufferAllocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        short sJ = j(byteBufferAllocate, 4L);
        boolean z10 = j(byteBufferAllocate, 5L) == 2;
        if (sJ == 1) {
            return new g(z10, this);
        }
        if (sJ == 2) {
            return new h(z10, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }

    public List h() throws IOException {
        long j10;
        this.f43014b.position(0L);
        ArrayList arrayList = new ArrayList();
        d dVarD = d();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(dVarD.f42997a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = dVarD.f43002f;
        if (j11 == 65535) {
            j11 = dVarD.c(0).f43010a;
        }
        long j12 = 0;
        while (true) {
            if (j12 >= j11) {
                j10 = 0;
                break;
            }
            e eVarB = dVarD.b(j12);
            if (eVarB.f43006a == 2) {
                j10 = eVarB.f43007b;
                break;
            }
            j12++;
        }
        if (j10 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j13 = 0;
        int i10 = 0;
        while (true) {
            c cVarA = dVarD.a(j10, i10);
            long j14 = j10;
            long j15 = cVarA.f42995a;
            if (j15 == 1) {
                arrayList2.add(Long.valueOf(cVarA.f42996b));
            } else if (j15 == 5) {
                j13 = cVarA.f42996b;
            }
            i10++;
            if (cVarA.f42995a == 0) {
                break;
            }
            j10 = j14;
            j11 = j11;
        }
        if (j13 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long jA = a(dVarD, j11, j13);
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            arrayList.add(m(byteBufferAllocate, ((Long) obj).longValue() + jA));
        }
        return arrayList;
    }

    protected void i(ByteBuffer byteBuffer, long j10, int i10) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        long j11 = 0;
        while (j11 < i10) {
            int i11 = this.f43014b.read(byteBuffer, j10 + j11);
            if (i11 == -1) {
                throw new EOFException();
            }
            j11 += (long) i11;
        }
        byteBuffer.position(0);
    }

    protected short j(ByteBuffer byteBuffer, long j10) throws IOException {
        i(byteBuffer, j10, 1);
        return (short) (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    protected int k(ByteBuffer byteBuffer, long j10) throws IOException {
        i(byteBuffer, j10, 2);
        return byteBuffer.getShort() & 65535;
    }

    protected long l(ByteBuffer byteBuffer, long j10) throws IOException {
        i(byteBuffer, j10, 8);
        return byteBuffer.getLong();
    }

    protected String m(ByteBuffer byteBuffer, long j10) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j11 = 1 + j10;
            short sJ = j(byteBuffer, j10);
            if (sJ == 0) {
                return sb2.toString();
            }
            sb2.append((char) sJ);
            j10 = j11;
        }
    }

    protected long q(ByteBuffer byteBuffer, long j10) throws IOException {
        i(byteBuffer, j10, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }
}
