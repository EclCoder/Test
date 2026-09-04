package com.bytedance.adsdk.hn.gjv;

import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse {
    private final sk hnj;

    public dse(sk skVar) {
        this.hnj = skVar;
    }

    private File hn(String str) {
        File file = new File(hnj(), hnj(str, qor.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(hnj(), hnj(str, qor.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    Pair<qor, InputStream> hnj(String str) {
        try {
            File fileHn = hn(str);
            if (fileHn == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileHn);
            qor qorVar = fileHn.getAbsolutePath().endsWith(".zip") ? qor.ZIP : qor.JSON;
            fileHn.getAbsolutePath();
            return new Pair<>(qorVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    File hnj(String str, InputStream inputStream, qor qorVar) throws IOException {
        File file = new File(hnj(), hnj(str, qorVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 != -1) {
                        fileOutputStream.write(bArr, 0, i10);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                }
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            inputStream.close();
            throw th3;
        }
    }

    void hnj(String str, qor qorVar) {
        File file = new File(hnj(), hnj(str, qorVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        file2.toString();
        if (zRenameTo) {
            return;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
    }

    private File hnj() {
        File fileHnj = this.hnj.hnj();
        if (fileHnj.isFile()) {
            fileHnj.delete();
        }
        if (!fileHnj.exists()) {
            fileHnj.mkdirs();
        }
        return fileHnj;
    }

    private static String hnj(String str, qor qorVar, boolean z10) {
        StringBuilder sb2 = new StringBuilder("lottie_cache_");
        sb2.append(str.replaceAll("\\W+", ""));
        sb2.append(z10 ? qorVar.hnj() : qorVar.qor);
        return sb2.toString();
    }
}
