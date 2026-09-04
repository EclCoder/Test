package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e implements r5.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u5.d f11512a = new u5.e();

    @Override // r5.i
    public /* bridge */ /* synthetic */ t5.c a(Object obj, int i10, int i11, r5.g gVar) {
        return c(d.a(obj), i10, i11, gVar);
    }

    @Override // r5.i
    public /* bridge */ /* synthetic */ boolean b(Object obj, r5.g gVar) {
        return d(d.a(obj), gVar);
    }

    public t5.c c(ImageDecoder.Source source, int i10, int i11, r5.g gVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new z5.c(i10, i11, gVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new f(bitmapDecodeBitmap, this.f11512a);
    }

    public boolean d(ImageDecoder.Source source, r5.g gVar) {
        return true;
    }
}
