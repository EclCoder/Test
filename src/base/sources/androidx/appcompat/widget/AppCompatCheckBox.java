package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements androidx.core.widget.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f1259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f1260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q f1261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j f1262d;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.f39862o);
    }

    private j getEmojiTextViewHelper() {
        if (this.f1262d == null) {
            this.f1262d = new j(this);
        }
        return this.f1262d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1260b;
        if (eVar != null) {
            eVar.b();
        }
        q qVar = this.f1261c;
        if (qVar != null) {
            qVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1260b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1260b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.k
    public ColorStateList getSupportButtonTintList() {
        g gVar = this.f1259a;
        if (gVar != null) {
            return gVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        g gVar = this.f1259a;
        if (gVar != null) {
            return gVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1261c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1261c.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1260b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1260b;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        g gVar = this.f1259a;
        if (gVar != null) {
            gVar.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        q qVar = this.f1261c;
        if (qVar != null) {
            qVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        q qVar = this.f1261c;
        if (qVar != null) {
            qVar.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1260b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1260b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        g gVar = this.f1259a;
        if (gVar != null) {
            gVar.f(colorStateList);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        g gVar = this.f1259a;
        if (gVar != null) {
            gVar.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1261c.w(colorStateList);
        this.f1261c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1261c.x(mode);
        this.f1261c.b();
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i10) {
        super(l0.b(context), attributeSet, i10);
        k0.a(this, getContext());
        g gVar = new g(this);
        this.f1259a = gVar;
        gVar.d(attributeSet, i10);
        e eVar = new e(this);
        this.f1260b = eVar;
        eVar.e(attributeSet, i10);
        q qVar = new q(this);
        this.f1261c = qVar;
        qVar.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(i.a.b(getContext(), i10));
    }
}
