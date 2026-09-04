package com.bytedance.sdk.component.utils;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {
    public static byte[] hnj(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bitmap.getByteCount());
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap hnj(Bitmap bitmap, int i10, int i11) {
        if (bitmap == null) {
            return null;
        }
        if (i10 > 0 && i11 > 0) {
            try {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (i10 < width && i11 < height) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(i10 / width, i11 / height);
                    return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                }
            } catch (Throwable th2) {
                th2.getMessage();
                return null;
            }
        }
        return bitmap;
    }
}
