package w6;

import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static String a(File file) {
        return b(file, null);
    }

    public static String b(File file, String str) {
        if (!file.isFile()) {
            return "";
        }
        byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            while (true) {
                int i10 = bufferedInputStream.read(bArr, 0, UserVerificationMethods.USER_VERIFY_ALL);
                if (i10 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i10);
            }
            if (!TextUtils.isEmpty(str)) {
                messageDigest.update(str.getBytes());
            }
            bufferedInputStream.close();
            return c(messageDigest.digest());
        } catch (Exception unused) {
            return "";
        }
    }

    private static String c(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            cArr2[i10] = cArr[(b10 >>> 4) & 15];
            i10 += 2;
            cArr2[i11] = cArr[b10 & 15];
        }
        return new String(cArr2);
    }
}
