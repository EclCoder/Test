package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f1256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f1257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f1258c;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.f39861n);
    }

    private j getEmojiTextViewHelper() {
        if (this.f1258c == null) {
            this.f1258c = new j(this);
        }
        return this.f1258c;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1256a;
        if (eVar != null) {
            eVar.b();
        }
        q qVar = this.f1257b;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (z0.f1783c) {
            return super.getAutoSizeMaxTextSize();
        }
        q qVar = this.f1257b;
        if (qVar != null) {
            return qVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (z0.f1783c) {
            return super.getAutoSizeMinTextSize();
        }
        q qVar = this.f1257b;
        if (qVar != null) {
            return qVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (z0.f1783c) {
            return super.getAutoSizeStepGranularity();
        }
        q qVar = this.f1257b;
        if (qVar != null) {
            return qVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (z0.f1783c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        q qVar = this.f1257b;
        return qVar != null ? qVar.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (z0.f1783c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        q qVar = this.f1257b;
        if (qVar != null) {
            return qVar.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1256a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1256a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1257b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1257b.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        q qVar = this.f1257b;
        if (qVar != null) {
            qVar.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        q qVar = this.f1257b;
        if (qVar == null || z0.f1783c || !qVar.l()) {
            return;
        }
        this.f1257b.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (z0.f1783c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        q qVar = this.f1257b;
        if (qVar != null) {
            qVar.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (z0.f1783c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        q qVar = this.f1257b;
        if (qVar != null) {
            qVar.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (z0.f1783c) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        q qVar = this.f1257b;
        if (qVar != null) {
            qVar.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1256a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1256a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        q qVar = this.f1257b;
        if (qVar != null) {
            qVar.s(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1256a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1256a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1257b.w(colorStateList);
        this.f1257b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1257b.x(mode);
        this.f1257b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        q qVar = this.f1257b;
        if (qVar != null) {
            qVar.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (z0.f1783c) {
            super.setTextSize(i10, f10);
            return;
        }
        q qVar = this.f1257b;
        if (qVar != null) {
            qVar.A(i10, f10);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i10) {
        super(l0.b(context), attributeSet, i10);
        k0.a(this, getContext());
        e eVar = new e(this);
        this.f1256a = eVar;
        eVar.e(attributeSet, i10);
        q qVar = new q(this);
        this.f1257b = qVar;
        qVar.m(attributeSet, i10);
        qVar.b();
        getEmojiTextViewHelper().c(attributeSet, i10);
    }
}
