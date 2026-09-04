package i3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f40945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f40946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f40947c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final UUID[] f40948d;

        a(UUID uuid, int i10, byte[] bArr, UUID[] uuidArr) {
            this.f40945a = uuid;
            this.f40946b = i10;
            this.f40947c = bArr;
            this.f40948d = uuidArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? C.DEFAULT_MUXED_BUFFER_SIZE : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    public static a d(byte[] bArr) {
        UUID[] uuidArr;
        w1.u uVar = new w1.u(bArr);
        if (uVar.g() < 32) {
            return null;
        }
        uVar.T(0);
        int iA = uVar.a();
        int iP = uVar.p();
        if (iP != iA) {
            w1.n.h("PsshAtomUtil", "Advertised atom size (" + iP + ") does not match buffer size: " + iA);
            return null;
        }
        int iP2 = uVar.p();
        if (iP2 != 1886614376) {
            w1.n.h("PsshAtomUtil", "Atom type is not pssh: " + iP2);
            return null;
        }
        int iC = i3.a.c(uVar.p());
        if (iC > 1) {
            w1.n.h("PsshAtomUtil", "Unsupported pssh version: " + iC);
            return null;
        }
        UUID uuid = new UUID(uVar.z(), uVar.z());
        if (iC == 1) {
            int iK = uVar.K();
            uuidArr = new UUID[iK];
            for (int i10 = 0; i10 < iK; i10++) {
                uuidArr[i10] = new UUID(uVar.z(), uVar.z());
            }
        } else {
            uuidArr = null;
        }
        int iK2 = uVar.K();
        int iA2 = uVar.a();
        if (iK2 == iA2) {
            byte[] bArr2 = new byte[iK2];
            uVar.l(bArr2, 0, iK2);
            return new a(uuid, iC, bArr2, uuidArr);
        }
        w1.n.h("PsshAtomUtil", "Atom data size (" + iK2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        if (uuid.equals(aVarD.f40945a)) {
            return aVarD.f40947c;
        }
        w1.n.h("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + aVarD.f40945a + ".");
        return null;
    }

    public static UUID f(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        return aVarD.f40945a;
    }

    public static int g(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return -1;
        }
        return aVarD.f40946b;
    }
}
