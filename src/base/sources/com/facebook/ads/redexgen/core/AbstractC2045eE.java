package com.facebook.ads.redexgen.core;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2045eE {
    public static boolean A00;
    public static byte[] A01;
    public static String[] A02 = {"LOnHKZUk03MjG3VYzMMYiec9SpPsFOh7", "Pbkw0DRwc7jrPzgwHcPKSBrc9yMoULer", "Hj", "S7", "LLbZvFImhG4qXHtXSuU8lE9QXb8BQ4aR", "3BEuw5zYnH62E4dXOlScK8tmPuoX0Dzi", "Tjz3D17CMTsDMz51rRXrrUvPJCeC", "mII8e5HllIg"};

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{81, 124, 102, 101, 121, 116, 108, 88, 112, 97, 103, 124, 118, 102, 53, 124, 102, 53, 123, 96, 121, 121, 59, 25, 46, 56, 36, 62, 57, 40, 46, 56, 107, 34, 56, 107, 37, 62, 39, 39, 101, 37, 18, 31, 26, 23, 18, 7, 26, 28, 29, 83, 21, 18, 26, 31, 22, 23, 93, 107, 105, 106};
    }

    static {
        A03();
        A00 = true;
    }

    public static BitmapDrawable A00(C2198gi c2198gi, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(str, 0);
            Bitmap overlayBm = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            if (overlayBm != null && (!A00 || A05(c2198gi, overlayBm))) {
                BitmapDrawable overlayRepeat = new BitmapDrawable(overlayBm);
                overlayRepeat.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                Resources resources = c2198gi.getResources();
                if (resources != null) {
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    if (displayMetrics != null) {
                        overlayRepeat.setTargetDensity(displayMetrics.densityDpi);
                    } else {
                        A04(c2198gi, A02(0, 23, 41));
                    }
                } else {
                    A04(c2198gi, A02(23, 18, Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE));
                }
                return overlayRepeat;
            }
            return null;
        } catch (Throwable th2) {
            c2198gi.A08().ABC(A02(59, 3, 58), AbstractC1610Td.A1u, new C1611Te(th2));
            return null;
        }
    }

    public static C2046eF A01(C2198gi c2198gi, String str) {
        BitmapDrawable bitmapDrawableA00;
        try {
            if (TextUtils.isEmpty(str) || (bitmapDrawableA00 = A00(c2198gi, str)) == null) {
                return null;
            }
            C2046eF c2046eF = new C2046eF(c2198gi);
            c2046eF.setBackground(bitmapDrawableA00);
            c2046eF.setClickable(false);
            c2046eF.setFocusable(false);
            return c2046eF;
        } catch (Throwable th2) {
            c2198gi.A08().ABC(A02(59, 3, 58), AbstractC1610Td.A1u, new C1611Te(th2));
            return null;
        }
    }

    public static void A04(C2198gi c2198gi, String str) {
        c2198gi.A08().ABC(A02(59, 3, 58), AbstractC1610Td.A1u, new C1611Te(str));
    }

    public static boolean A05(C2198gi c2198gi, Bitmap bitmap) {
        for (int i10 = 0; i10 < x; i10++) {
            for (int pixel = 0; pixel < x; pixel++) {
                int x10 = bitmap.getPixel(i10, pixel);
                if (Color.alpha(x10) / 255.0f > 0.03f) {
                    A04(c2198gi, A02(41, 18, 79));
                    return false;
                }
            }
        }
        String[] strArr = A02;
        if (strArr[2].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "LR4kTGqXNNTRbn07qZCCCo1h4xvtCqSD";
        strArr2[4] = "LZTU5gCJod3YylAEiVGeMzo2seGubyq7";
        return true;
    }
}
