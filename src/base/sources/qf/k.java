package qf;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
abstract class k {
    private static PublicKey a(String str) throws IOException {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        } catch (InvalidKeySpecException e11) {
            String str2 = "Invalid key specification: " + e11;
            Log.w("IABUtil/Security", str2);
            throw new IOException(str2);
        }
    }

    private static Boolean b(PublicKey publicKey, String str, String str2) {
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            try {
                Signature signature = Signature.getInstance("SHA1withRSA");
                signature.initVerify(publicKey);
                signature.update(str.getBytes());
                if (signature.verify(bArrDecode)) {
                    return Boolean.TRUE;
                }
                Log.w("IABUtil/Security", "Signature verification failed...");
                return Boolean.FALSE;
            } catch (InvalidKeyException unused) {
                Log.e("IABUtil/Security", "Invalid key specification.");
                return Boolean.FALSE;
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            } catch (SignatureException unused2) {
                Log.e("IABUtil/Security", "Signature exception.");
                return Boolean.FALSE;
            }
        } catch (IllegalArgumentException unused3) {
            Log.w("IABUtil/Security", "Base64 decoding failed.");
            return Boolean.FALSE;
        }
    }

    public static boolean c(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxSAdZ0kY3Q/U35+yPWPwqg8gYm90XbQHTNr8JSeWflX/ZDotJMaZ0dXFwFHeAMXeRRZGctuDVybA0UWBaV6OvVezlyjHRAwnaMYhnvBxUMqMKgWbzMIK516BMNbGLRdxf7pDtMStAK347YSgQ7rsCtS+TSMAa0QZp4/mNIsAvorQG75ctbPUJPQ5QfT4cTVu2OhpDTnFF1TJrLP5N6IdJJ0Zo+ozwWt2LG3nuFwPFacDC1e++V9XODZXNIAB8jeSBU+QGAVcLl436Xq5sC6rUfUdztH4bvWj9Wu4wv5dgxD4PM2rlqqgiAc0pirk2ejYg6ILLGPrUlyQxrd+6mlutQIDAQAB") || TextUtils.isEmpty(str2)) {
            Log.w("IABUtil/Security", "Purchase verification failed: missing data.");
            return false;
        }
        try {
            return b(a("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxSAdZ0kY3Q/U35+yPWPwqg8gYm90XbQHTNr8JSeWflX/ZDotJMaZ0dXFwFHeAMXeRRZGctuDVybA0UWBaV6OvVezlyjHRAwnaMYhnvBxUMqMKgWbzMIK516BMNbGLRdxf7pDtMStAK347YSgQ7rsCtS+TSMAa0QZp4/mNIsAvorQG75ctbPUJPQ5QfT4cTVu2OhpDTnFF1TJrLP5N6IdJJ0Zo+ozwWt2LG3nuFwPFacDC1e++V9XODZXNIAB8jeSBU+QGAVcLl436Xq5sC6rUfUdztH4bvWj9Wu4wv5dgxD4PM2rlqqgiAc0pirk2ejYg6ILLGPrUlyQxrd+6mlutQIDAQAB"), str, str2).booleanValue();
        } catch (IOException e10) {
            Log.e("IABUtil/Security", "Error generating PublicKey from encoded key: " + e10.getMessage());
            return false;
        }
    }
}
