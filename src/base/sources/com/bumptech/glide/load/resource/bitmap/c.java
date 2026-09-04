package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class c implements r5.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r5.f f11506b = r5.f.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r5.f f11507c = r5.f.e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u5.b f11508a;

    public c(u5.b bVar) {
        this.f11508a = bVar;
    }

    private Bitmap.CompressFormat d(Bitmap bitmap, r5.g gVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) gVar.c(f11507c);
        if (compressFormat != null) {
            return compressFormat;
        }
        return bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // r5.j
    public r5.c b(r5.g gVar) {
        return r5.c.TRANSFORMED;
    }

    @Override // r5.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(t5.c cVar, File file, r5.g gVar) {
        boolean z10;
        Bitmap bitmap = (Bitmap) cVar.get();
        Bitmap.CompressFormat compressFormatD = d(bitmap, gVar);
        n6.b.d("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), compressFormatD);
        try {
            long jB = m6.g.b();
            int iIntValue = ((Integer) gVar.c(f11506b)).intValue();
            OutputStream cVar2 = null;
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        cVar2 = this.f11508a != null ? new com.bumptech.glide.load.data.c(fileOutputStream, this.f11508a) : fileOutputStream;
                        bitmap.compress(compressFormatD, iIntValue, cVar2);
                        cVar2.close();
                        try {
                            cVar2.close();
                        } catch (IOException unused) {
                        }
                        z10 = true;
                    } catch (IOException e10) {
                        e = e10;
                        cVar2 = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (cVar2 != null) {
                            try {
                                cVar2.close();
                            } catch (IOException unused2) {
                            }
                        }
                        z10 = false;
                    } catch (Throwable th2) {
                        th = th2;
                        cVar2 = fileOutputStream;
                        if (cVar2 != null) {
                            try {
                                cVar2.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e11) {
                e = e11;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormatD + " of size " + m6.l.h(bitmap) + " in " + m6.g.a(jB) + ", options format: " + gVar.c(f11507c) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            n6.b.e();
            return z10;
        } catch (Throwable th4) {
            n6.b.e();
            throw th4;
        }
    }
}
