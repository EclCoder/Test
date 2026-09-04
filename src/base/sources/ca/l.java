package ca;

import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.UUID;
import ob.d0;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final UUID f9811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f9812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f9813c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f9811a = uuid;
            this.f9812b = i10;
            this.f9813c = bArr;
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
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    private static a d(byte[] bArr) {
        d0 d0Var = new d0(bArr);
        if (d0Var.g() < 32) {
            return null;
        }
        d0Var.U(0);
        if (d0Var.q() != d0Var.a() + 4 || d0Var.q() != 1886614376) {
            return null;
        }
        int iC = ca.a.c(d0Var.q());
        if (iC > 1) {
            u.i("PsshAtomUtil", "Unsupported pssh version: " + iC);
            return null;
        }
        UUID uuid = new UUID(d0Var.A(), d0Var.A());
        if (iC == 1) {
            d0Var.V(d0Var.L() * 16);
        }
        int iL = d0Var.L();
        if (iL != d0Var.a()) {
            return null;
        }
        byte[] bArr2 = new byte[iL];
        d0Var.l(bArr2, 0, iL);
        return new a(uuid, iC, bArr2);
    }

    public static UUID f(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        return aVarD.f9811a;
    }

    public static int g(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return -1;
        }
        return aVarD.f9812b;
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        if (uuid.equals(aVarD.f9811a)) {
            return aVarD.f9813c;
        }
        u.i("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + dOIDCKnIR.LrbXNNppx + aVarD.f9811a + ".");
        return null;
    }
}
