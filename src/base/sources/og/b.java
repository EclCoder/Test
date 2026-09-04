package og;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import m0.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static HashMap f48575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List f48576b;

    /* JADX INFO: renamed from: og.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0749b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private RandomAccessFile f48577a;

        private C0749b() {
            this.f48577a = null;
        }

        private int b(byte[] bArr, int i10) {
            return (bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        }

        private void c(byte[] bArr) throws IOException {
            if (this.f48577a.read(bArr) != bArr.length) {
                throw new IOException();
            }
        }

        private int d() {
            return this.f48577a.read() & 255;
        }

        private int e() {
            return (d() << 24) | (d() << 16) | (d() << 8) | d();
        }

        private int f() {
            return (d() << 8) | d();
        }

        String a(String str) {
            RandomAccessFile randomAccessFile;
            try {
                try {
                    this.f48577a = new RandomAccessFile(str, CampaignEx.JSON_KEY_AD_R);
                    int iE = e();
                    if (iE != 1953658213 && iE != 65536) {
                        randomAccessFile = this.f48577a;
                        if (randomAccessFile != null) {
                        }
                        return null;
                    }
                    int iF = f();
                    f();
                    f();
                    f();
                    for (int i10 = 0; i10 < iF; i10++) {
                        int iE2 = e();
                        e();
                        int iE3 = e();
                        int iE4 = e();
                        if (iE2 == 1851878757) {
                            byte[] bArr = new byte[iE4];
                            this.f48577a.seek(iE3);
                            c(bArr);
                            int iB = b(bArr, 2);
                            int iB2 = b(bArr, 4);
                            for (int i11 = 0; i11 < iB; i11++) {
                                int i12 = i11 * 12;
                                int iB3 = b(bArr, i12 + 6);
                                if (b(bArr, i12 + 12) == 4 && iB3 == 1) {
                                    int iB4 = b(bArr, i12 + 14);
                                    int iB5 = b(bArr, i12 + 16) + iB2;
                                    if (iB5 >= 0 && iB5 + iB4 < iE4) {
                                        String str2 = new String(bArr, iB5, iB4);
                                        RandomAccessFile randomAccessFile2 = this.f48577a;
                                        if (randomAccessFile2 != null) {
                                            try {
                                                randomAccessFile2.close();
                                                return str2;
                                            } catch (IOException e10) {
                                                e10.printStackTrace();
                                            }
                                        }
                                        return str2;
                                    }
                                }
                            }
                        }
                    }
                    randomAccessFile = this.f48577a;
                    if (randomAccessFile == null) {
                        return null;
                    }
                    try {
                        randomAccessFile.close();
                        return null;
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                } catch (Throwable th2) {
                    RandomAccessFile randomAccessFile3 = this.f48577a;
                    if (randomAccessFile3 != null) {
                        try {
                            randomAccessFile3.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    throw th2;
                }
            } catch (IOException e13) {
                com.google.firebase.crashlytics.a.b().d(e13);
                RandomAccessFile randomAccessFile4 = this.f48577a;
                if (randomAccessFile4 != null) {
                    try {
                        randomAccessFile4.close();
                    } catch (IOException e14) {
                        e14.printStackTrace();
                    }
                }
                return null;
            }
        }
    }

    public static c a() {
        File[] fileArrListFiles;
        String[] strArr = {"/system/fonts", "/system/font", "/data/fonts"};
        C0749b c0749b = new C0749b();
        for (int i10 = 0; i10 < 3; i10++) {
            File file = new File(strArr[i10]);
            if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    String strA = c0749b.a(file2.getAbsolutePath());
                    if (strA != null) {
                        return new c(file2.getAbsolutePath(), strA);
                    }
                }
            }
        }
        return null;
    }

    public static ArrayList b() {
        HashMap mapC = c();
        ArrayList arrayList = new ArrayList();
        for (String str : mapC.keySet()) {
            arrayList.add(new og.a(str, (String) mapC.get(str)));
        }
        return arrayList;
    }

    public static HashMap c() {
        HashMap map = f48575a;
        return map == null ? d() : map;
    }

    public static HashMap d() {
        File[] fileArrListFiles;
        f48575a = new HashMap();
        f48576b = new ArrayList();
        String[] strArr = {"/system/fonts", "/system/font", "/data/fonts"};
        C0749b c0749b = new C0749b();
        for (int i10 = 0; i10 < 3; i10++) {
            File file = new File(strArr[i10]);
            if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    String strA = c0749b.a(file2.getAbsolutePath());
                    if (strA != null) {
                        f48575a.put(file2.getAbsolutePath(), strA);
                    }
                }
            }
        }
        return f48575a;
    }
}
