package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class u implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public boolean a(InputStream inputStream, u5.b bVar) {
        return false;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(InputStream inputStream, u5.b bVar) {
        int iC = new androidx.exifinterface.media.a(inputStream).c("Orientation", 1);
        if (iC == 0) {
            return -1;
        }
        return iC;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType c(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType d(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public boolean e(ByteBuffer byteBuffer, u5.b bVar) {
        return false;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int f(ByteBuffer byteBuffer, u5.b bVar) {
        return b(m6.a.g(byteBuffer), bVar);
    }
}
