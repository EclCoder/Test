package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import u5.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface ImageHeaderParser {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f11215a;

        ImageType(boolean z10) {
            this.f11215a = z10;
        }

        public boolean hasAlpha() {
            return this.f11215a;
        }

        public boolean isWebp() {
            int i10 = a.f11216a[ordinal()];
            return i10 == 1 || i10 == 2 || i10 == 3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11216a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f11216a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11216a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11216a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    boolean a(InputStream inputStream, b bVar);

    int b(InputStream inputStream, b bVar);

    ImageType c(ByteBuffer byteBuffer);

    ImageType d(InputStream inputStream);

    boolean e(ByteBuffer byteBuffer, b bVar);

    int f(ByteBuffer byteBuffer, b bVar);
}
