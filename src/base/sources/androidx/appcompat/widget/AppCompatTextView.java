package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f1313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f1314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f1315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j f1316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f1318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Future f1319g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface a {
        void a(int[] iArr, int i10);

        void b(int i10);

        int c();

        int d();

        void e(int i10, float f10);

        int[] f();

        TextClassifier g();

        int h();

        void i(TextClassifier textClassifier);

        void j(int i10, int i11, int i12, int i13);

        void k(int i10);

        int l();

        void m(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void b(int i10) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void k(int i10) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends c {
        d() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void e(int i10, float f10) {
            AppCompatTextView.super.setLineHeight(i10, f10);
        }
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private j getEmojiTextViewHelper() {
        if (this.f1316d == null) {
            this.f1316d = new j(this);
        }
        return this.f1316d;
    }

    private void r() {
        Future future = this.f1319g;
        if (future != null) {
            try {
                this.f1319g = null;
                android.support.v4.media.session.b.a(future.get());
                androidx.core.widget.i.l(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1313a;
        if (eVar != null) {
            eVar.b();
        }
        q qVar = this.f1314b;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (z0.f1783c) {
            return getSuperCaller().h();
        }
        q qVar = this.f1314b;
        if (qVar != null) {
            return qVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (z0.f1783c) {
            return getSuperCaller().d();
        }
        q qVar = this.f1314b;
        if (qVar != null) {
            return qVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (z0.f1783c) {
            return getSuperCaller().l();
        }
        q qVar = this.f1314b;
        if (qVar != null) {
            return qVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (z0.f1783c) {
            return getSuperCaller().f();
        }
        q qVar = this.f1314b;
        return qVar != null ? qVar.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (z0.f1783c) {
            return getSuperCaller().c() == 1 ? 1 : 0;
        }
        q qVar = this.f1314b;
        if (qVar != null) {
            return qVar.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.o(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.i.a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.i.b(this);
    }

    a getSuperCaller() {
        if (this.f1318f == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f1318f = new d();
            } else if (i10 >= 28) {
                this.f1318f = new c();
            } else if (i10 >= 26) {
                this.f1318f = new b();
            }
        }
        return this.f1318f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1313a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1313a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1314b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1314b.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        r();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        p pVar;
        return (Build.VERSION.SDK_INT >= 28 || (pVar = this.f1315c) == null) ? getSuperCaller().g() : pVar.a();
    }

    public l0.c.a getTextMetricsParamsCompat() {
        return androidx.core.widget.i.e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1314b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return k.a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        q qVar = this.f1314b;
        if (qVar != null) {
            qVar.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        r();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        q qVar = this.f1314b;
        if (qVar == null || z0.f1783c || !qVar.l()) {
            return;
        }
        this.f1314b.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (z0.f1783c) {
            getSuperCaller().j(i10, i11, i12, i13);
            return;
        }
        q qVar = this.f1314b;
        if (qVar != null) {
            qVar.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (z0.f1783c) {
            getSuperCaller().a(iArr, i10);
            return;
        }
        q qVar = this.f1314b;
        if (qVar != null) {
            qVar.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (z0.f1783c) {
            getSuperCaller().m(i10);
            return;
        }
        q qVar = this.f1314b;
        if (qVar != null) {
            qVar.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1313a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1313a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        q qVar = this.f1314b;
        if (qVar != null) {
            qVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        q qVar = this.f1314b;
        if (qVar != null) {
            qVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        q qVar = this.f1314b;
        if (qVar != null) {
            qVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        q qVar = this.f1314b;
        if (qVar != null) {
            qVar.p();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().k(i10);
        } else {
            androidx.core.widget.i.h(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i10);
        } else {
            androidx.core.widget.i.i(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        androidx.core.widget.i.j(this, i10);
    }

    public void setPrecomputedText(l0.c cVar) {
        androidx.core.widget.i.l(this, cVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1313a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1313a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1314b.w(colorStateList);
        this.f1314b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1314b.x(mode);
        this.f1314b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        q qVar = this.f1314b;
        if (qVar != null) {
            qVar.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        p pVar;
        if (Build.VERSION.SDK_INT >= 28 || (pVar = this.f1315c) == null) {
            getSuperCaller().i(textClassifier);
        } else {
            pVar.b(textClassifier);
        }
    }

    public void setTextFuture(Future<l0.c> future) {
        this.f1319g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(l0.c.a aVar) {
        androidx.core.widget.i.n(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (z0.f1783c) {
            super.setTextSize(i10, f10);
            return;
        }
        q qVar = this.f1314b;
        if (qVar != null) {
            qVar.A(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        if (this.f1317e) {
            return;
        }
        Typeface typefaceA = (typeface == null || i10 <= 0) ? null : e0.j.a(getContext(), typeface, i10);
        this.f1317e = true;
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f1317e = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10, float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().e(i10, f10);
        } else {
            androidx.core.widget.i.k(this, i10, f10);
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i10) {
        super(l0.b(context), attributeSet, i10);
        this.f1317e = false;
        this.f1318f = null;
        k0.a(this, getContext());
        e eVar = new e(this);
        this.f1313a = eVar;
        eVar.e(attributeSet, i10);
        q qVar = new q(this);
        this.f1314b = qVar;
        qVar.m(attributeSet, i10);
        qVar.b();
        this.f1315c = new p(this);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? i.a.b(context, i10) : null, i11 != 0 ? i.a.b(context, i11) : null, i12 != 0 ? i.a.b(context, i12) : null, i13 != 0 ? i.a.b(context, i13) : null);
        q qVar = this.f1314b;
        if (qVar != null) {
            qVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? i.a.b(context, i10) : null, i11 != 0 ? i.a.b(context, i11) : null, i12 != 0 ? i.a.b(context, i12) : null, i13 != 0 ? i.a.b(context, i13) : null);
        q qVar = this.f1314b;
        if (qVar != null) {
            qVar.p();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void a(int[] iArr, int i10) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int c() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int d() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int[] f() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public TextClassifier g() {
            return AppCompatTextView.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int h() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void i(TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void j(int i10, int i11, int i12, int i13) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int l() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void m(int i10) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i10);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void b(int i10) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void k(int i10) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void e(int i10, float f10) {
        }
    }
}
