package z5;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.resource.bitmap.l;
import com.bumptech.glide.load.resource.bitmap.r;
import com.bumptech.glide.load.resource.bitmap.z;
import r5.f;
import r5.g;
import r5.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f58647a = z.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f58648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f58649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r5.b f58650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f58651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f58652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h f58653g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ImageDecoder$OnPartialImageListener {
        a() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public c(int i10, int i11, g gVar) {
        this.f58648b = i10;
        this.f58649c = i11;
        this.f58650d = (r5.b) gVar.c(r.f11560f);
        this.f58651e = (l) gVar.c(l.f11555h);
        f fVar = r.f11564j;
        this.f58652f = gVar.c(fVar) != null && ((Boolean) gVar.c(fVar)).booleanValue();
        this.f58653g = (h) gVar.c(r.f11561g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f58647a.f(this.f58648b, this.f58649c, this.f58652f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f58650d == r5.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.f58648b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f58649c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f58651e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        h hVar = this.f58653g;
        if (hVar != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((hVar == h.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i10 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
