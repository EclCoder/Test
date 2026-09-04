package pl.droidsonroids.gif;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Surface;
import android.view.TextureView;
import android.widget.ImageView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class GifTextureView extends TextureView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ImageView.ScaleType[] f50169g = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView.ScaleType f50170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix f50171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f50172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f50173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f50174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f.b f50175f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50176a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f50176a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50176a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50176a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50176a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50176a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50176a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50176a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f50176a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
    }

    public GifTextureView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f50170a = ImageView.ScaleType.FIT_CENTER;
        this.f50171b = new Matrix();
        this.f50174e = 1.0f;
        h(attributeSet, i10, 0);
    }

    private void f() {
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (surfaceTexture != null) {
            Surface surface = new Surface(surfaceTexture);
            try {
                surface.unlockCanvasAndPost(surface.lockCanvas(null));
            } finally {
                surface.release();
            }
        }
    }

    private void h(AttributeSet attributeSet, int i10, int i11) {
        if (attributeSet != null) {
            int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "scaleType", -1);
            if (attributeIntValue >= 0) {
                ImageView.ScaleType[] scaleTypeArr = f50169g;
                if (attributeIntValue < scaleTypeArr.length) {
                    this.f50170a = scaleTypeArr[attributeIntValue];
                }
            }
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f50243a, i10, i11);
            this.f50172c = g(typedArrayObtainStyledAttributes);
            super.setOpaque(typedArrayObtainStyledAttributes.getBoolean(k.f50245c, false));
            typedArrayObtainStyledAttributes.recycle();
            this.f50175f = new f.b(this, attributeSet, i10, i11);
        } else {
            super.setOpaque(false);
            this.f50175f = new f.b();
        }
        if (isInEditMode()) {
            return;
        }
        c cVar = new c(this);
        this.f50173d = cVar;
        if (this.f50172c != null) {
            cVar.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(GifInfoHandle gifInfoHandle) {
        Matrix matrix = new Matrix();
        float width = getWidth();
        float height = getHeight();
        float fL = gifInfoHandle.l() / width;
        float f10 = gifInfoHandle.f() / height;
        RectF rectF = new RectF(0.0f, 0.0f, gifInfoHandle.l(), gifInfoHandle.f());
        RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
        switch (a.f50176a[this.f50170a.ordinal()]) {
            case 1:
                matrix.setScale(fL, f10, width / 2.0f, height / 2.0f);
                break;
            case 2:
                float fMin = 1.0f / Math.min(fL, f10);
                matrix.setScale(fL * fMin, fMin * f10, width / 2.0f, height / 2.0f);
                break;
            case 3:
                float fMin2 = (((float) gifInfoHandle.l()) > width || ((float) gifInfoHandle.f()) > height) ? Math.min(1.0f / fL, 1.0f / f10) : 1.0f;
                matrix.setScale(fL * fMin2, fMin2 * f10, width / 2.0f, height / 2.0f);
                break;
            case 4:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                matrix.preScale(fL, f10);
                break;
            case 5:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                matrix.preScale(fL, f10);
                break;
            case 6:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                matrix.preScale(fL, f10);
                break;
            case 7:
                return;
            case 8:
                matrix.set(this.f50171b);
                matrix.preScale(fL, f10);
                break;
        }
        super.setTransform(matrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuperSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        super.setSurfaceTextureListener(surfaceTextureListener);
    }

    public IOException getIOException() {
        return this.f50173d.f50179c != null ? this.f50173d.f50179c : GifIOException.a(this.f50173d.f50178b.h());
    }

    public ImageView.ScaleType getScaleType() {
        return this.f50170a;
    }

    @Override // android.view.TextureView
    public TextureView.SurfaceTextureListener getSurfaceTextureListener() {
        return null;
    }

    @Override // android.view.TextureView
    public Matrix getTransform(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        }
        matrix.set(this.f50171b);
        return matrix;
    }

    public synchronized void i(g gVar, b bVar) {
        this.f50173d.c(this, bVar);
        try {
            this.f50173d.join();
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        this.f50172c = gVar;
        c cVar = new c(this);
        this.f50173d = cVar;
        if (gVar != null) {
            cVar.start();
        } else {
            f();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        this.f50173d.c(this, null);
        super.onDetachedFromWindow();
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.f50173d.f50180d = eVar.f50231a[0];
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = this.f50173d;
        cVar.f50180d = cVar.f50178b.k();
        return new e(super.onSaveInstanceState(), this.f50175f.f50235a ? this.f50173d.f50180d : null);
    }

    public void setFreezesAnimation(boolean z10) {
        this.f50175f.f50235a = z10;
    }

    public void setImageMatrix(Matrix matrix) {
        setTransform(matrix);
    }

    public synchronized void setInputSource(g gVar) {
        i(gVar, null);
    }

    @Override // android.view.TextureView
    public void setOpaque(boolean z10) {
        if (z10 != isOpaque()) {
            super.setOpaque(z10);
            setInputSource(this.f50172c);
        }
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        this.f50170a = scaleType;
        j(this.f50173d.f50178b);
    }

    public void setSpeed(float f10) {
        this.f50174e = f10;
        this.f50173d.f50178b.A(f10);
    }

    @Override // android.view.TextureView
    public void setSurfaceTexture(SurfaceTexture surfaceTexture) {
        throw new UnsupportedOperationException("Changing SurfaceTexture is not supported");
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        throw new UnsupportedOperationException("Changing SurfaceTextureListener is not supported");
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        this.f50171b.set(matrix);
        j(this.f50173d.f50178b);
    }

    private static g g(TypedArray typedArray) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(k.f50244b, typedValue)) {
            return null;
        }
        if (typedValue.resourceId != 0) {
            String resourceTypeName = typedArray.getResources().getResourceTypeName(typedValue.resourceId);
            if (f.f50232a.contains(resourceTypeName)) {
                return new g.c(typedArray.getResources(), typedValue.resourceId);
            }
            if (!"string".equals(resourceTypeName)) {
                throw new IllegalArgumentException("Expected string, drawable, mipmap or raw resource type. '" + resourceTypeName + HqKnbV.uPfhF);
            }
        }
        return new g.b(typedArray.getResources().getAssets(), typedValue.string.toString());
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c extends Thread implements TextureView.SurfaceTextureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final pl.droidsonroids.gif.a f50177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private GifInfoHandle f50178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private IOException f50179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long[] f50180d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final WeakReference f50181e;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ GifTextureView f50182a;

            a(GifTextureView gifTextureView) {
                this.f50182a = gifTextureView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f50182a.j(c.this.f50178b);
            }
        }

        c(GifTextureView gifTextureView) {
            super("GifRenderThread");
            this.f50177a = new pl.droidsonroids.gif.a();
            this.f50178b = new GifInfoHandle();
            this.f50181e = new WeakReference(gifTextureView);
        }

        void c(GifTextureView gifTextureView, b bVar) {
            this.f50177a.b();
            gifTextureView.setSuperSurfaceTextureListener(bVar != null ? new j(bVar) : null);
            this.f50178b.q();
            interrupt();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            GifTextureView gifTextureView = (GifTextureView) this.f50181e.get();
            if (gifTextureView != null) {
                gifTextureView.j(this.f50178b);
            }
            this.f50177a.c();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f50177a.b();
            this.f50178b.q();
            interrupt();
            return true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                GifTextureView gifTextureView = (GifTextureView) this.f50181e.get();
                if (gifTextureView == null) {
                    return;
                }
                GifInfoHandle gifInfoHandleA = gifTextureView.f50172c.a();
                this.f50178b = gifInfoHandleA;
                gifInfoHandleA.z((char) 1, gifTextureView.isOpaque());
                if (gifTextureView.f50175f.f50236b >= 0) {
                    this.f50178b.y(gifTextureView.f50175f.f50236b);
                }
                GifTextureView gifTextureView2 = (GifTextureView) this.f50181e.get();
                if (gifTextureView2 == null) {
                    this.f50178b.r();
                    return;
                }
                gifTextureView2.setSuperSurfaceTextureListener(this);
                boolean zIsAvailable = gifTextureView2.isAvailable();
                this.f50177a.d(zIsAvailable);
                if (zIsAvailable) {
                    gifTextureView2.post(new a(gifTextureView2));
                }
                this.f50178b.A(gifTextureView2.f50174e);
                while (!isInterrupted()) {
                    try {
                        this.f50177a.a();
                        GifTextureView gifTextureView3 = (GifTextureView) this.f50181e.get();
                        if (gifTextureView3 == null) {
                            break;
                        }
                        SurfaceTexture surfaceTexture = gifTextureView3.getSurfaceTexture();
                        if (surfaceTexture != null) {
                            Surface surface = new Surface(surfaceTexture);
                            try {
                                this.f50178b.a(surface, this.f50180d);
                                surface.release();
                            } catch (Throwable th2) {
                                surface.release();
                                throw th2;
                            }
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                this.f50178b.r();
                this.f50178b = new GifInfoHandle();
            } catch (IOException e10) {
                this.f50179c = e10;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        }
    }
}
