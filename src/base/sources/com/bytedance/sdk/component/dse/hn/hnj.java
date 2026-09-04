package com.bytedance.sdk.component.dse.hn;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.hn.hnj.bug;
import com.bytedance.sdk.component.hn.hnj.dkl;
import com.bytedance.sdk.component.hn.hnj.dnm;
import com.bytedance.sdk.component.hn.hnj.mjg;
import com.inmobi.unification.sdk.InitializationStatus;
import com.mbridge.msdk.foundation.download.Command;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public File f12831hn;
    public File hnj;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private volatile boolean f12832ta;

    public hnj(dnm dnmVar) {
        super(dnmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long dkl(Map<String, String> map) {
        String str;
        if (map.containsKey("content-length")) {
            str = map.get("content-length");
        } else {
            str = map.containsKey("Content-Length") ? map.get("Content-Length") : null;
        }
        if (!TextUtils.isEmpty(str) && str != null) {
            try {
                return Long.valueOf(str).longValue();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean dse(Map<String, String> map) {
        return TextUtils.equals(map.get("Content-Encoding"), "gzip");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean sk(Map<String, String> map) {
        if (TextUtils.equals(map.get("Accept-Ranges"), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get("Content-Range");
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        return str != null && str.startsWith("bytes");
    }

    @Override // com.bytedance.sdk.component.dse.hn.qor
    public void hn() {
        this.f12832ta = true;
        super.hn();
    }

    public void hnj(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.hnj = new File(str, str2);
        this.f12831hn = new File(str, str2 + ".temp");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dkl() {
        try {
            this.hnj.delete();
        } catch (Throwable unused) {
        }
        try {
            this.f12831hn.delete();
        } catch (Throwable unused2) {
        }
    }

    public void hnj(final com.bytedance.sdk.component.dse.hnj.hnj hnjVar) {
        File file = this.hnj;
        if (file == null || this.f12831hn == null) {
            if (hnjVar != null) {
                hnjVar.hnj(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
                return;
            }
            return;
        }
        if (file.exists() && this.hnj.length() != 0 && hnjVar != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.dse.hn hnVar = new com.bytedance.sdk.component.dse.hn(true, 200, InitializationStatus.SUCCESS, null, null, jCurrentTimeMillis, jCurrentTimeMillis);
            hnVar.hnj(this.hnj);
            hnjVar.hnj(this, hnVar);
            return;
        }
        long length = this.f12831hn.length();
        final long j10 = length >= 0 ? length : 0L;
        bug.hnj hnjVar2 = new bug.hnj();
        hnjVar2.hnj((Object) gjv());
        hnj(hnjVar2);
        hn(Command.HTTP_HEADER_RANGE, "bytes=" + j10 + "-");
        if (TextUtils.isEmpty(this.aq)) {
            hnjVar.hnj(this, new IOException("Url is Empty"));
            return;
        }
        try {
            hnjVar2.hn(this.aq);
            if (!TextUtils.isEmpty(this.f12835sk)) {
                hnjVar2.hnj(this.f12835sk);
            }
            int i10 = this.dkl;
            if (i10 > 0) {
                hnjVar2.hnj(i10);
            }
            hn(hnjVar2);
            com.bytedance.sdk.component.hn.hnj.hn hnVarHnj = this.qor.hnj(hnjVar2.hnj().hn());
            if (hnVarHnj == null) {
                hnjVar.hnj(this, new IOException("new call error"));
            } else {
                hnVarHnj.hnj(new com.bytedance.sdk.component.hn.hnj.qor() { // from class: com.bytedance.sdk.component.dse.hn.hnj.1
                    @Override // com.bytedance.sdk.component.hn.hnj.qor
                    public void hnj(com.bytedance.sdk.component.hn.hnj.hn hnVar2, IOException iOException) {
                        com.bytedance.sdk.component.dse.hnj.hnj hnjVar3 = hnjVar;
                        if (hnjVar3 != null) {
                            hnjVar3.hnj(hnj.this, iOException);
                        }
                        hnj.this.dkl();
                    }

                    @Override // com.bytedance.sdk.component.hn.hnj.qor
                    public void hnj(com.bytedance.sdk.component.hn.hnj.hn hnVar2, mjg mjgVar) {
                        RandomAccessFile randomAccessFile;
                        long j11;
                        InputStream inputStreamQor;
                        byte[] bArr;
                        long j12;
                        int i11;
                        if (hnjVar == null) {
                            return;
                        }
                        HashMap map = new HashMap();
                        if (mjgVar == null) {
                            return;
                        }
                        hnj.this.hnj(mjgVar.ojm());
                        dkl dklVarDse = mjgVar.dse();
                        if (dklVarDse != null) {
                            for (int i12 = 0; i12 < dklVarDse.hnj(); i12++) {
                                map.put(dklVarDse.hnj(i12), dklVarDse.hn(i12));
                            }
                        }
                        com.bytedance.sdk.component.dse.hn hnVar3 = new com.bytedance.sdk.component.dse.hn(mjgVar.gjv(), mjgVar.qor(), mjgVar.sk(), map, null, mjgVar.hn(), mjgVar.hnj());
                        if (mjgVar.gjv()) {
                            long jHnj = mjgVar.dkl().hnj();
                            long j13 = 0;
                            if (jHnj <= 0) {
                                jHnj = hnj.dkl(map);
                            }
                            boolean zSk = hnj.sk(map);
                            if (zSk) {
                                jHnj += j10;
                                String str = (String) map.get("Content-Range");
                                if (!TextUtils.isEmpty(str)) {
                                    String str2 = "bytes " + j10 + "-" + (jHnj - 1);
                                    if (TextUtils.indexOf(str, str2) == -1) {
                                        hnj.this.dkl();
                                        hnjVar.hnj(hnj.this, new IOException("The Content-Range Header is invalid Assume[" + str2 + "] vs Real[" + str + "], please remove the temporary file [" + hnj.this.f12831hn + "]."));
                                        return;
                                    }
                                }
                            }
                            if (jHnj > 0 && hnj.this.f12831hn.exists() && hnj.this.f12831hn.length() == jHnj) {
                                hnj hnjVar3 = hnj.this;
                                if (!hnjVar3.f12831hn.renameTo(hnjVar3.hnj)) {
                                    hnjVar.hnj(hnj.this, new IOException("Rename fail"));
                                    return;
                                } else {
                                    hnVar3.hnj(hnj.this.hnj);
                                    hnjVar.hnj(hnj.this, hnVar3);
                                    return;
                                }
                            }
                            InputStream inputStream = null;
                            try {
                                try {
                                    randomAccessFile = new RandomAccessFile(hnj.this.f12831hn, "rw");
                                    try {
                                        if (zSk) {
                                            randomAccessFile.seek(j10);
                                            j11 = j10;
                                        } else {
                                            randomAccessFile.setLength(0L);
                                            j11 = 0;
                                        }
                                        while (true) {
                                            long j14 = j13;
                                            int i13 = inputStreamQor.read(bArr, i11, 16384 - i11);
                                            if (i13 != -1) {
                                                i11 += i13;
                                                j12 += (long) i13;
                                                if (j12 % 16384 == j14 || j12 == jHnj - j10) {
                                                    randomAccessFile.seek(j11);
                                                    randomAccessFile.write(bArr, 0, i11);
                                                    j11 += (long) i11;
                                                    i11 = 0;
                                                }
                                                if (hnj.this.f12832ta) {
                                                    throw new IOException("net is cancel");
                                                }
                                                j13 = j14;
                                            } else {
                                                if (i11 != 0) {
                                                    randomAccessFile.seek(j11);
                                                    randomAccessFile.write(bArr, 0, i11);
                                                }
                                                if (!zSk) {
                                                    jHnj = hnj.this.f12831hn.length();
                                                }
                                                if (jHnj > j14 && hnj.this.f12831hn.exists() && hnj.this.f12831hn.length() == jHnj) {
                                                    hnj hnjVar4 = hnj.this;
                                                    if (!hnjVar4.f12831hn.renameTo(hnjVar4.hnj)) {
                                                        hnjVar.hnj(hnj.this, new IOException("Rename fail"));
                                                    } else {
                                                        hnVar3.hnj(hnj.this.hnj);
                                                        hnjVar.hnj(hnj.this, hnVar3);
                                                    }
                                                } else {
                                                    com.bytedance.sdk.component.dse.hnj.hnj hnjVar5 = hnjVar;
                                                    hnj hnjVar6 = hnj.this;
                                                    StringBuilder sb2 = new StringBuilder(" tempFile.length() == fileSize is");
                                                    sb2.append(hnj.this.f12831hn.length() == jHnj);
                                                    hnjVar5.hnj(hnjVar6, new IOException(sb2.toString()));
                                                }
                                                try {
                                                    inputStreamQor.close();
                                                } catch (Throwable unused) {
                                                }
                                                try {
                                                    randomAccessFile.close();
                                                    return;
                                                } catch (Throwable unused2) {
                                                    return;
                                                }
                                            }
                                        }
                                    } catch (Throwable unused3) {
                                    }
                                } catch (Throwable unused4) {
                                    randomAccessFile = null;
                                }
                                inputStreamQor = mjgVar.dkl().qor();
                                if (hnj.dse(map) && !(inputStreamQor instanceof GZIPInputStream)) {
                                    inputStreamQor = new GZIPInputStream(inputStreamQor);
                                }
                                bArr = new byte[16384];
                                j12 = 0;
                                i11 = 0;
                            } catch (Throwable th2) {
                                try {
                                    hnjVar.hnj(hnj.this, new IOException(th2.getMessage()));
                                    if (!zSk) {
                                        hnj.this.dkl();
                                    }
                                } finally {
                                    if (0 != 0) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable unused5) {
                                        }
                                    }
                                    try {
                                        randomAccessFile.close();
                                    } catch (Throwable unused6) {
                                    }
                                }
                            }
                        } else {
                            hnjVar.hnj(hnj.this, hnVar3);
                        }
                    }
                });
            }
        } catch (IllegalArgumentException unused) {
            hnjVar.hnj(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0140 A[PHI: r10
      0x0140: PHI (r10v4 long) = (r10v3 long), (r10v8 long) binds: [B:43:0x0106, B:46:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    public com.bytedance.sdk.component.dse.hn hnj() {
        com.bytedance.sdk.component.dse.hn hnVar;
        RandomAccessFile randomAccessFile;
        long j10;
        InputStream inputStream;
        InputStream inputStreamQor;
        byte[] bArr;
        int i10;
        long j11;
        hnj hnjVar = this;
        File file = hnjVar.hnj;
        if (file == null || hnjVar.f12831hn == null) {
            return null;
        }
        if (file.exists() && hnjVar.hnj.length() != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.dse.hn hnVar2 = new com.bytedance.sdk.component.dse.hn(true, 200, InitializationStatus.SUCCESS, null, null, jCurrentTimeMillis, jCurrentTimeMillis);
            hnVar2.hnj(hnjVar.hnj);
            return hnVar2;
        }
        long length = hnjVar.f12831hn.length();
        if (length < 0) {
            length = 0;
        }
        bug.hnj hnjVar2 = new bug.hnj();
        hnjVar2.hnj((Object) hnjVar.gjv());
        hnjVar.hnj(hnjVar2);
        hnjVar.hn(Command.HTTP_HEADER_RANGE, "bytes=" + length + "-");
        if (TextUtils.isEmpty(hnjVar.aq)) {
            Log.e("DownloadExecutor", "execute: Url is Empty");
            return null;
        }
        try {
            hnjVar2.hn(hnjVar.aq);
            hnjVar.hn(hnjVar2);
            try {
                com.bytedance.sdk.component.hn.hnj.hn hnVarHnj = hnjVar.qor.hnj(hnjVar2.hnj().hn());
                if (hnVarHnj == null) {
                    return null;
                }
                mjg mjgVarHn = hnVarHnj.hn();
                if (mjgVarHn != null) {
                    hnjVar.hnj(mjgVarHn.ojm());
                }
                if (mjgVarHn == null || !mjgVarHn.gjv()) {
                    return null;
                }
                HashMap map = new HashMap();
                dkl dklVarDse = mjgVarHn.dse();
                if (dklVarDse != null) {
                    for (int i11 = 0; i11 < dklVarDse.hnj(); i11++) {
                        map.put(dklVarDse.hnj(i11), dklVarDse.hn(i11));
                    }
                }
                com.bytedance.sdk.component.dse.hn hnVar3 = new com.bytedance.sdk.component.dse.hn(mjgVarHn.gjv(), mjgVarHn.qor(), mjgVarHn.sk(), map, null, mjgVarHn.hn(), mjgVarHn.hnj());
                long jHnj = mjgVarHn.dkl().hnj();
                if (jHnj <= 0) {
                    jHnj = dkl(map);
                }
                long length2 = hnjVar.f12831hn.length();
                boolean zSk = sk(map);
                hnVar = null;
                if (zSk) {
                    jHnj += length2;
                    try {
                        String str = (String) map.get("Content-Range");
                        if (!TextUtils.isEmpty(str)) {
                            if (TextUtils.indexOf(str, "bytes " + length2 + "-" + (jHnj - 1)) == -1) {
                                Objects.toString(hnjVar.f12831hn);
                                hnjVar.dkl();
                                return null;
                            }
                        }
                    } catch (IOException unused) {
                    }
                }
                if (jHnj > r3 && hnjVar.f12831hn.exists() && hnjVar.f12831hn.length() == jHnj) {
                    if (!hnjVar.f12831hn.renameTo(hnjVar.hnj)) {
                        return null;
                    }
                    hnVar3.hnj(hnjVar.hnj);
                    return hnVar3;
                }
                try {
                    randomAccessFile = new RandomAccessFile(hnjVar.f12831hn, "rw");
                    try {
                        try {
                            try {
                                if (zSk) {
                                    randomAccessFile.seek(length);
                                    j10 = length;
                                } else {
                                    randomAccessFile.setLength(0L);
                                    j10 = 0;
                                }
                                while (true) {
                                    int i12 = inputStreamQor.read(bArr, i10, 16384 - i10);
                                    inputStream = inputStreamQor;
                                    if (i12 != -1) {
                                        i10 += i12;
                                        j11 += (long) i12;
                                        try {
                                            if (j11 % 16384 == 0 || j11 == jHnj - length) {
                                                randomAccessFile.seek(j10);
                                                randomAccessFile.write(bArr, 0, i10);
                                                j10 += (long) i10;
                                                i10 = 0;
                                            }
                                            hnjVar = this;
                                            try {
                                                if (hnjVar.f12832ta) {
                                                    throw new IOException("net is cancel");
                                                }
                                                inputStreamQor = inputStream;
                                            } catch (Throwable unused2) {
                                                if (!zSk) {
                                                    try {
                                                        hnjVar.dkl();
                                                    } finally {
                                                        if (inputStream != null) {
                                                            try {
                                                                inputStream.close();
                                                            } catch (Throwable unused3) {
                                                            }
                                                        }
                                                        try {
                                                            randomAccessFile.close();
                                                        } catch (Throwable unused4) {
                                                        }
                                                    }
                                                }
                                                return null;
                                            }
                                        } catch (Throwable unused5) {
                                            hnjVar = this;
                                        }
                                    } else {
                                        if (i12 != 0) {
                                            randomAccessFile.seek(j10);
                                            randomAccessFile.write(bArr, 0, i10);
                                        }
                                        if (!zSk || length == 0) {
                                            jHnj = hnjVar.f12831hn.length();
                                        }
                                        if (jHnj > 0 && hnjVar.f12831hn.exists() && hnjVar.f12831hn.length() == jHnj) {
                                            if (hnjVar.f12831hn.renameTo(hnjVar.hnj)) {
                                                hnVar3.hnj(hnjVar.hnj);
                                                try {
                                                    inputStream.close();
                                                } catch (Throwable unused6) {
                                                }
                                                try {
                                                    randomAccessFile.close();
                                                } catch (Throwable unused7) {
                                                }
                                                return hnVar3;
                                            }
                                            try {
                                                inputStream.close();
                                            } catch (Throwable unused8) {
                                            }
                                            try {
                                                randomAccessFile.close();
                                            } catch (Throwable unused9) {
                                            }
                                            return null;
                                        }
                                        hnjVar.f12831hn.length();
                                        try {
                                            inputStream.close();
                                        } catch (Throwable unused10) {
                                        }
                                        try {
                                            randomAccessFile.close();
                                        } catch (Throwable unused11) {
                                        }
                                        return null;
                                    }
                                }
                            } catch (Throwable unused12) {
                            }
                            if (dse(map) && !(inputStreamQor instanceof GZIPInputStream)) {
                                inputStreamQor = new GZIPInputStream(inputStreamQor);
                            }
                            bArr = new byte[16384];
                            i10 = 0;
                            j11 = 0;
                        } catch (Throwable unused13) {
                            inputStream = inputStreamQor;
                        }
                        inputStreamQor = mjgVarHn.dkl().qor();
                    } catch (Throwable unused14) {
                        inputStream = null;
                    }
                } catch (Throwable unused15) {
                    randomAccessFile = null;
                }
            } catch (IOException unused16) {
                hnVar = null;
            }
            hnjVar.dkl();
            return hnVar;
        } catch (IllegalArgumentException unused17) {
            Log.e("DownloadExecutor", "execute: Url is not a valid HTTP or HTTPS URL");
            return null;
        }
    }
}
