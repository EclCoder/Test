package com.inmobi.media;

import android.graphics.Bitmap;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.inmobi.media.u2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3341u2 implements M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdConfig.AdQualityConfig f27587a;

    public AbstractC3341u2(AdConfig.AdQualityConfig adQualityConfig) {
        kotlin.jvm.internal.s.h(adQualityConfig, "adQualityConfig");
        this.f27587a = adQualityConfig;
    }

    public final Bitmap a(Bitmap bitmap) {
        kotlin.jvm.internal.s.h(bitmap, "bitmap");
        double resizedPercentage = (((double) this.f27587a.getResizedPercentage()) / 100.0d) * ((double) bitmap.getWidth());
        double resizedPercentage2 = (((double) this.f27587a.getResizedPercentage()) / 100.0d) * ((double) bitmap.getHeight());
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) resizedPercentage, (int) resizedPercentage2, true);
        kotlin.jvm.internal.s.g(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        int length = byteArrayOutputStream.toByteArray().length;
        if (length <= this.f27587a.getMaxImageSize()) {
            return bitmapCreateScaledBitmap;
        }
        while (length > this.f27587a.getMaxImageSize()) {
            double dSqrt = Math.sqrt(((double) this.f27587a.getMaxImageSize()) / ((double) length));
            resizedPercentage *= dSqrt;
            resizedPercentage2 *= dSqrt;
            if (Math.floor(resizedPercentage) <= 0.0d && Math.floor(resizedPercentage2) <= 0.0d) {
                return bitmapCreateScaledBitmap;
            }
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, (int) Math.floor(resizedPercentage), (int) Math.floor(resizedPercentage2), true);
            kotlin.jvm.internal.s.g(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
            byteArrayOutputStream.reset();
            bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            length = byteArrayOutputStream.toByteArray().length;
        }
        byteArrayOutputStream.size();
        return bitmapCreateScaledBitmap;
    }
}
