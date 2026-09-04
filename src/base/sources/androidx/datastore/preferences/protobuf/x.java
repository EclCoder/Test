package androidx.datastore.preferences.protobuf;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f3751a = Charset.forName(C.ASCII_NAME);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f3752b = Charset.forName(C.UTF8_NAME);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Charset f3753c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f3754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f3755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f3756f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        boolean isInRange(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b extends List, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        b mutableCopyWithCapacity(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f3754d = bArr;
        f3755e = ByteBuffer.wrap(bArr);
        f3756f = h.i(bArr);
    }

    static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i10, int i11) {
        int iG = g(i11, bArr, i10, i11);
        if (iG == 0) {
            return 1;
        }
        return iG;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    static int g(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }
}
