package o2;

import androidx.media3.common.ParserException;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static void a(boolean z10, String str) throws ParserException {
        if (!z10) {
            throw ParserException.a(str, null);
        }
    }

    public static boolean b(q qVar, byte[] bArr, int i10, int i11, boolean z10) throws EOFException {
        try {
            return qVar.peekFully(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int c(q qVar, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int iB = qVar.b(bArr, i10 + i12, i11 - i12);
            if (iB == -1) {
                break;
            }
            i12 += iB;
        }
        return i12;
    }

    public static boolean d(q qVar, byte[] bArr, int i10, int i11) {
        try {
            qVar.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(q qVar, int i10) {
        try {
            qVar.skipFully(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
