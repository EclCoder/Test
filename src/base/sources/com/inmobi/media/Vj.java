package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Vj implements M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f25906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25907b;

    public Vj(String location, byte[] imageBytes) {
        kotlin.jvm.internal.s.h(imageBytes, "imageBytes");
        kotlin.jvm.internal.s.h(location, "location");
        this.f25906a = imageBytes;
        this.f25907b = location;
    }

    @Override // com.inmobi.media.M0
    public final Object a() {
        byte[] bArr = this.f25906a;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        kotlin.jvm.internal.s.e(bitmapDecodeByteArray);
        return a(bitmapDecodeByteArray);
    }

    public final String a(Bitmap bitmap) {
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        String str = string + ".jpg";
        File file = new File(this.f25907b);
        if (!file.exists()) {
            file.mkdirs();
        }
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(new File(this.f25907b + "/" + str)));
        return this.f25907b + "/" + str;
    }
}
