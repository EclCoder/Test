package com.mbridge.msdk.foundation.tools;

import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static char[] f30931a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static MessageDigest f30932b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f30933c = "SameFileMD5";

    static {
        try {
            f30932b = MessageDigest.getInstance(SameMD5.TAG);
        } catch (NoSuchAlgorithmException e10) {
            System.err.println(n0.class.getName() + "初始化失败，MessageDigest不支持MD5Util.");
            e10.printStackTrace();
        }
    }

    public static String a(File file) {
        RandomAccessFile randomAccessFile;
        if (file == null || !file.exists()) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            randomAccessFile = new RandomAccessFile(file, CampaignEx.JSON_KEY_AD_R);
            try {
                byte[] bArr = new byte[MediaHttpUploader.DEFAULT_CHUNK_SIZE];
                while (true) {
                    int i10 = randomAccessFile.read(bArr);
                    if (i10 == -1) {
                        String strA = a(messageDigest.digest());
                        try {
                            randomAccessFile.close();
                            return strA;
                        } catch (IOException e10) {
                            q0.b(f30933c, e10.getMessage());
                            return strA;
                        }
                    }
                    messageDigest.update(bArr, 0, i10);
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    q0.b(f30933c, th.getMessage());
                    return "";
                } finally {
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e11) {
                            q0.b(f30933c, e11.getMessage());
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    private static String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    private static String a(byte[] bArr, int i10, int i11) {
        StringBuffer stringBuffer = new StringBuffer(i11 * 2);
        int i12 = i11 + i10;
        while (i10 < i12) {
            a(bArr[i10], stringBuffer);
            i10++;
        }
        return stringBuffer.toString();
    }

    private static void a(byte b10, StringBuffer stringBuffer) {
        char[] cArr = f30931a;
        char c10 = cArr[(b10 & 240) >> 4];
        char c11 = cArr[b10 & 15];
        stringBuffer.append(c10);
        stringBuffer.append(c11);
    }
}
