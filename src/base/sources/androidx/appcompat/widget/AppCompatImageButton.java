package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f1274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f1275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1276c;

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.D);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1274a;
        if (eVar != null) {
            eVar.b();
        }
        l lVar = this.f1275b;
        if (lVar != null) {
            lVar.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1274a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1274a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        l lVar = this.f1275b;
        if (lVar != null) {
            return lVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        l lVar = this.f1275b;
        if (lVar != null) {
            return lVar.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f1275b.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1274a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1274a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        l lVar = this.f1275b;
        if (lVar != null) {
            lVar.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        l lVar = this.f1275b;
        if (lVar != null && drawable != null && !this.f1276c) {
            lVar.h(drawable);
        }
        super.setImageDrawable(drawable);
        l lVar2 = this.f1275b;
        if (lVar2 != null) {
            lVar2.c();
            if (this.f1276c) {
                return;
            }
            this.f1275b.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f1276c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f1275b.i(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        l lVar = this.f1275b;
        if (lVar != null) {
            lVar.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1274a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1274a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        l lVar = this.f1275b;
        if (lVar != null) {
            lVar.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        l lVar = this.f1275b;
        if (lVar != null) {
            lVar.k(mode);
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(l0.b(context), attributeSet, i10);
        this.f1276c = false;
        k0.a(this, getContext());
        e eVar = new e(this);
        this.f1274a = eVar;
        eVar.e(attributeSet, i10);
        l lVar = new l(this);
        this.f1275b = lVar;
        lVar.g(attributeSet, i10);
    }
}
