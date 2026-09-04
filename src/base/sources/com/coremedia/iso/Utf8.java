package com.coremedia.iso;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class Utf8 {
    public static byte[] convert(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(C.UTF8_NAME);
        } catch (UnsupportedEncodingException e10) {
            throw new Error(e10);
        }
    }

    public static int utf8StringLengthInBytes(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return str.getBytes(C.UTF8_NAME).length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException();
        }
    }

    public static String convert(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, C.UTF8_NAME);
        } catch (UnsupportedEncodingException e10) {
            throw new Error(e10);
        }
    }
}
