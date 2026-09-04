package v6;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b extends TextureView implements TextureView.SurfaceTextureListener, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f55195a;

    public b(Context context) {
        this(context, null);
    }

    @Override // v6.c
    public void a(d dVar) {
        this.f55195a = dVar;
        setSurfaceTextureListener(this);
    }

    @Override // v6.c
    public SurfaceHolder getHolder() {
        return null;
    }

    @Override // v6.c
    public void hnj(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i11;
        layoutParams.width = i10;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.TextureView, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        d dVar = this.f55195a;
        if (dVar != null) {
            dVar.hnj(surfaceTexture, i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        d dVar = this.f55195a;
        if (dVar != null) {
            return dVar.hnj(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        d dVar = this.f55195a;
        if (dVar != null) {
            dVar.hn(surfaceTexture);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // v6.c
    public View getView() {
        return this;
    }

    public void setWindowVisibilityChangedListener(c.a aVar) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }
}
