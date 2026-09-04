package b6;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import m6.l;
import r5.i;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f8485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u5.b f8486b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements t5.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AnimatedImageDrawable f8487a;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f8487a = animatedImageDrawable;
        }

        @Override // t5.c
        public void a() {
            this.f8487a.stop();
            this.f8487a.clearAnimationCallbacks();
        }

        @Override // t5.c
        public Class b() {
            return Drawable.class;
        }

        @Override // t5.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f8487a;
        }

        @Override // t5.c
        public int getSize() {
            return this.f8487a.getIntrinsicWidth() * this.f8487a.getIntrinsicHeight() * l.i(Bitmap.Config.ARGB_8888) * 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f8488a;

        b(c cVar) {
            this.f8488a = cVar;
        }

        @Override // r5.i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public t5.c a(ByteBuffer byteBuffer, int i10, int i11, r5.g gVar) {
            return this.f8488a.b(ImageDecoder.createSource(byteBuffer), i10, i11, gVar);
        }

        @Override // r5.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(ByteBuffer byteBuffer, r5.g gVar) {
            return this.f8488a.d(byteBuffer);
        }
    }

    /* JADX INFO: renamed from: b6.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0109c implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f8489a;

        C0109c(c cVar) {
            this.f8489a = cVar;
        }

        @Override // r5.i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public t5.c a(InputStream inputStream, int i10, int i11, r5.g gVar) {
            return this.f8489a.b(ImageDecoder.createSource(m6.a.b(inputStream)), i10, i11, gVar);
        }

        @Override // r5.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(InputStream inputStream, r5.g gVar) {
            return this.f8489a.c(inputStream);
        }
    }

    private c(List list, u5.b bVar) {
        this.f8485a = list;
        this.f8486b = bVar;
    }

    public static i a(List list, u5.b bVar) {
        return new b(new c(list, bVar));
    }

    private boolean e(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }

    public static i f(List list, u5.b bVar) {
        return new C0109c(new c(list, bVar));
    }

    t5.c b(ImageDecoder.Source source, int i10, int i11, r5.g gVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new z5.c(i10, i11, gVar));
        if (b6.a.a(drawableDecodeDrawable)) {
            return new a(b6.b.a(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    boolean c(InputStream inputStream) {
        return e(com.bumptech.glide.load.a.f(this.f8485a, inputStream, this.f8486b));
    }

    boolean d(ByteBuffer byteBuffer) {
        return e(com.bumptech.glide.load.a.g(this.f8485a, byteBuffer));
    }
}
