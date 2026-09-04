package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzazo {
    static boolean zza = false;
    public static final /* synthetic */ int zzc = 0;
    private static MessageDigest zzd;
    private static final Object zze = new Object();
    private static final Object zzf = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    static void zza() {
        synchronized (zzf) {
            try {
                if (!zza) {
                    zza = true;
                    new Thread(new zzazn(null)).start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static String zzb(byte[] bArr, String str) {
        zzaze zzazeVarZzc = zzc(bArr, str);
        return zzazi.zza(zzazeVarZzc == null ? zzh(zzg(4096).zzaN(), str, true) : ((zzazf) zzazeVarZzc.zzbu()).zzaN(), true);
    }

    static zzaze zzc(byte[] bArr, String str) {
        Vector vectorZzd = zzd(bArr, 255);
        if (vectorZzd == null || vectorZzd.isEmpty()) {
            return null;
        }
        zzaze zzazeVarZza = zzazf.zza();
        int size = vectorZzd.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzazeVarZza.zza(zzida.zzt(zzh((byte[]) vectorZzd.get(i10), str, false), 0, 256));
        }
        byte[] bArrZze = zze(bArr);
        zzida zzidaVar = zzida.zza;
        zzazeVarZza.zzb(zzida.zzt(bArrZze, 0, bArrZze.length));
        return zzazeVarZza;
    }

    static Vector zzd(byte[] bArr, int i10) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i11 = length + 254;
        Vector vector = new Vector();
        for (int i12 = 0; i12 < i11 / 255; i12++) {
            int i13 = i12 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i13 > 255) {
                    length2 = i13 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i13, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static byte[] zze(byte[] bArr) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (zze) {
            try {
                zza();
                MessageDigest messageDigest2 = null;
                try {
                    if (zzb.await(2L, TimeUnit.SECONDS) && (messageDigest = zzd) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = zzd.digest();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrDigest;
    }

    static zzaym zzg(int i10) {
        zzaxm zzaxmVarZzj = zzaym.zzj();
        zzaxmVarZzj.zzl(4096L);
        return (zzaym) zzaxmVarZzj.zzbu();
    }

    private static byte[] zzh(byte[] bArr, String str, boolean z10) {
        byte[] bArrArray;
        int length = bArr.length;
        int i10 = true != z10 ? 255 : 239;
        if (length > i10) {
            bArr = zzg(4096).zzaN();
        }
        int i11 = i10 + 1;
        int length2 = bArr.length;
        byte b10 = (byte) length2;
        if (length2 < i10) {
            byte[] bArr2 = new byte[i10 - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i11).put(b10).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i11).put(b10).put(bArr).array();
        }
        if (z10) {
            bArrArray = ByteBuffer.allocate(256).put(zze(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzazp[] zzazpVarArr = new zzbac().zzcK;
        int length3 = zzazpVarArr.length;
        for (int i12 = 0; i12 < 12; i12++) {
            zzazpVarArr[i12].zza(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzazg(str.getBytes(C.UTF8_NAME)).zza(bArr3);
        }
        return bArr3;
    }
}
