package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.o0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final int D0 = sb.l.f51874r;
    private static final int[][] E0 = {new int[]{R.attr.state_pressed}, new int[0]};
    private ColorStateList A;
    private boolean A0;
    private ColorStateList B;
    private boolean B0;
    private ColorStateList C;
    private boolean C0;
    private boolean D;
    private CharSequence E;
    private boolean F;
    private mc.i G;
    private mc.i H;
    private StateListDrawable I;
    private boolean J;
    private mc.i K;
    private mc.i L;
    private mc.p M;
    private boolean N;
    private final int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private final Rect W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FrameLayout f21311a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final Rect f21312a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0 f21313b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final RectF f21314b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f21315c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private Typeface f21316c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21317d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private Drawable f21318d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    EditText f21319e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f21320e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f21321f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final LinkedHashSet f21322f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21323g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private Drawable f21324g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21325h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f21326h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21327i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private Drawable f21328i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f21329j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private ColorStateList f21330j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w f21331k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private ColorStateList f21332k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f21333l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private int f21334l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f21335m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private int f21336m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f21337n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private int f21338n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private f f21339o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private ColorStateList f21340o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextView f21341p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f21342p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f21343q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f21344q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f21345r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f21346r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f21347s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f21348s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f21349t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f21350t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private TextView f21351u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    int f21352u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ColorStateList f21353v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private boolean f21354v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f21355w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    final com.google.android.material.internal.b f21356w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private androidx.transition.c f21357x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private boolean f21358x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private androidx.transition.c f21359y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private boolean f21360y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ColorStateList f21361z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private ValueAnimator f21362z0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends n0.a {
        b() {
        }

        @Override // n0.a
        public void g(View view, o0.p pVar) {
            super.g(view, pVar);
            pVar.a1(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f21315c.j();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f21356w0.D0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class e extends n0.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final TextInputLayout f21369d;

        public e(TextInputLayout textInputLayout) {
            this.f21369d = textInputLayout;
        }

        @Override // n0.a
        public void g(View view, o0.p pVar) {
            super.g(view, pVar);
            EditText editText = this.f21369d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f21369d.getHint();
            CharSequence helperText = this.f21369d.getHelperText();
            CharSequence error = this.f21369d.getError();
            CharSequence placeholderText = this.f21369d.getPlaceholderText();
            int counterMaxLength = this.f21369d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f21369d.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zQ = this.f21369d.Q();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z10 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            if (!TextUtils.isEmpty(helperText) && this.f21369d.f21331k.u()) {
                if (TextUtils.isEmpty(string)) {
                    string = helperText.toString();
                } else {
                    string = string + ", " + ((Object) helperText);
                }
            }
            this.f21369d.f21313b.B(pVar);
            if (!zIsEmpty) {
                pVar.Y0(text);
            } else if (!TextUtils.isEmpty(string)) {
                pVar.Y0(string);
                if (!zQ && placeholderText != null) {
                    pVar.Y0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                pVar.Y0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    pVar.G0(string);
                } else {
                    if (!zIsEmpty) {
                        string = ((Object) text) + ", " + string;
                    }
                    pVar.Y0(string);
                }
                pVar.U0(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            pVar.J0(counterMaxLength);
            if (z10) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                pVar.B0(error);
            }
            this.f21369d.f21315c.o().o(view, pVar);
        }

        @Override // n0.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f21369d.f21315c.o().p(view, accessibilityEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface f {
        int a(Editable editable);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface g {
        void a(TextInputLayout textInputLayout);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class h extends u0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CharSequence f21370c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f21371d;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f21370c) + "}";
        }

        @Override // u0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f21370c, parcel, i10);
            parcel.writeInt(this.f21371d ? 1 : 0);
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f21370c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f21371d = parcel.readInt() == 1;
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, sb.c.f51643x0);
    }

    private void A(boolean z10) {
        ValueAnimator valueAnimator = this.f21362z0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f21362z0.cancel();
        }
        if (z10 && this.f21360y0) {
            m(1.0f);
        } else {
            this.f21356w0.D0(1.0f);
        }
        this.f21354v0 = false;
        if (C()) {
            W();
        }
        z0();
        this.f21313b.m(false);
        this.f21315c.J(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(Editable editable) {
        if (this.f21339o.a(editable) != 0 || this.f21354v0) {
            M();
        } else {
            g0();
        }
    }

    private androidx.transition.c B() {
        androidx.transition.c cVar = new androidx.transition.c();
        cVar.c0(gc.j.f(getContext(), sb.c.P, 87));
        cVar.e0(gc.j.g(getContext(), sb.c.V, tb.b.f53275a));
        return cVar;
    }

    private void B0(boolean z10, boolean z11) {
        int defaultColor = this.f21340o0.getDefaultColor();
        int colorForState = this.f21340o0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f21340o0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.U = colorForState2;
        } else if (z11) {
            this.U = colorForState;
        } else {
            this.U = defaultColor;
        }
    }

    private boolean C() {
        return this.D && !TextUtils.isEmpty(this.E) && (this.G instanceof com.google.android.material.textfield.h);
    }

    private void D() {
        Iterator it = this.f21322f0.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this);
        }
    }

    private void E(Canvas canvas) {
        mc.i iVar;
        if (this.L == null || (iVar = this.K) == null) {
            return;
        }
        iVar.draw(canvas);
        if (this.f21319e.isFocused()) {
            Rect bounds = this.L.getBounds();
            Rect bounds2 = this.K.getBounds();
            float fH = this.f21356w0.H();
            int iCenterX = bounds2.centerX();
            bounds.left = tb.b.c(iCenterX, bounds2.left, fH);
            bounds.right = tb.b.c(iCenterX, bounds2.right, fH);
            this.L.draw(canvas);
        }
    }

    private void F(Canvas canvas) {
        if (this.D) {
            this.f21356w0.k(canvas);
        }
    }

    private void G(boolean z10) {
        ValueAnimator valueAnimator = this.f21362z0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f21362z0.cancel();
        }
        if (z10 && this.f21360y0) {
            m(0.0f);
        } else {
            this.f21356w0.D0(0.0f);
        }
        if (C() && ((com.google.android.material.textfield.h) this.G).L0()) {
            z();
        }
        this.f21354v0 = true;
        M();
        this.f21313b.m(true);
        this.f21315c.J(true);
    }

    private mc.i H(boolean z10) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(sb.e.f51675d1);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f21319e;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(sb.e.I);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(sb.e.Q0);
        mc.p pVarM = mc.p.g().E(f10).I(f10).v(dimensionPixelOffset).z(dimensionPixelOffset).m();
        EditText editText2 = this.f21319e;
        mc.i iVarS = mc.i.s(getContext(), popupElevation, editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null);
        iVarS.setShapeAppearanceModel(pVarM);
        iVarS.o0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return iVarS;
    }

    private static Drawable I(mc.i iVar, int i10, int i11, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{ac.a.j(i11, i10, 0.1f), i10}), iVar, iVar);
    }

    private int J(int i10, boolean z10) {
        int compoundPaddingLeft;
        if (z10 || getPrefixText() == null) {
            compoundPaddingLeft = (!z10 || getSuffixText() == null) ? this.f21319e.getCompoundPaddingLeft() : this.f21315c.A();
        } else {
            compoundPaddingLeft = this.f21313b.d();
        }
        return i10 + compoundPaddingLeft;
    }

    private int K(int i10, boolean z10) {
        int compoundPaddingRight;
        if (z10 || getSuffixText() == null) {
            compoundPaddingRight = (!z10 || getPrefixText() == null) ? this.f21319e.getCompoundPaddingRight() : this.f21313b.d();
        } else {
            compoundPaddingRight = this.f21315c.A();
        }
        return i10 - compoundPaddingRight;
    }

    private static Drawable L(Context context, mc.i iVar, int i10, int[][] iArr) {
        int iC = ac.a.c(context, sb.c.f51620m, "TextInputLayout");
        mc.i iVar2 = new mc.i(iVar.M());
        int iJ = ac.a.j(i10, iC, 0.1f);
        iVar2.l0(new ColorStateList(iArr, new int[]{iJ, 0}));
        iVar2.setTint(iC);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iJ, iC});
        mc.i iVar3 = new mc.i(iVar.M());
        iVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, iVar2, iVar3), iVar});
    }

    private void M() {
        TextView textView = this.f21351u;
        if (textView == null || !this.f21349t) {
            return;
        }
        textView.setText((CharSequence) null);
        androidx.transition.t.b(this.f21311a, this.f21359y);
        this.f21351u.setVisibility(4);
    }

    private boolean R() {
        return getHintMaxLines() == 1;
    }

    private boolean S() {
        if (d0()) {
            return true;
        }
        return this.f21341p != null && this.f21337n;
    }

    private boolean U() {
        return this.P == 1 && this.f21319e.getMinLines() <= 1;
    }

    private void V() {
        q();
        s0();
        C0();
        h0();
        l();
        if (this.P != 0) {
            v0();
        }
        b0();
    }

    private void W() {
        if (C()) {
            RectF rectF = this.f21314b0;
            this.f21356w0.o(rectF, this.f21319e.getWidth(), this.f21319e.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            p(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.R);
            rectF.top = 0.0f;
            ((com.google.android.material.textfield.h) this.G).O0(rectF);
        }
    }

    private void X() {
        if (!C() || this.f21354v0) {
            return;
        }
        z();
        W();
    }

    private static void Y(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                Y((ViewGroup) childAt, z10);
            }
        }
    }

    private void a0() {
        TextView textView = this.f21351u;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void b0() {
        EditText editText = this.f21319e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i10 = this.P;
                if (i10 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i10 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public static /* synthetic */ int c(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private boolean e0() {
        return (this.f21315c.I() || ((this.f21315c.C() && N()) || this.f21315c.y() != null)) && this.f21315c.getMeasuredWidth() > 0;
    }

    private boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f21313b.getMeasuredWidth() > 0;
    }

    private void g0() {
        if (this.f21351u == null || !this.f21349t || TextUtils.isEmpty(this.f21347s)) {
            return;
        }
        this.f21351u.setText(this.f21347s);
        androidx.transition.t.b(this.f21311a, this.f21357x);
        this.f21351u.setVisibility(0);
        this.f21351u.bringToFront();
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f21319e;
        if (!(editText instanceof AutoCompleteTextView) || q.a(editText)) {
            return this.G;
        }
        int iD = ac.a.d(this.f21319e, h.a.f39867t);
        int i10 = this.P;
        if (i10 == 2) {
            return L(getContext(), this.G, iD, E0);
        }
        if (i10 == 1) {
            return I(this.G, this.V, iD, E0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.I == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.I = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.I.addState(new int[0], H(false));
        }
        return this.I;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.H == null) {
            this.H = H(true);
        }
        return this.H;
    }

    private void h0() {
        if (this.P == 1) {
            if (jc.c.l(getContext())) {
                this.Q = getResources().getDimensionPixelSize(sb.e.f51707o0);
            } else if (jc.c.k(getContext())) {
                this.Q = getResources().getDimensionPixelSize(sb.e.f51704n0);
            }
        }
    }

    private void i0(Rect rect) {
        mc.i iVar = this.K;
        if (iVar != null) {
            int i10 = rect.bottom;
            iVar.setBounds(rect.left, i10 - this.S, rect.right, i10);
        }
        mc.i iVar2 = this.L;
        if (iVar2 != null) {
            int i11 = rect.bottom;
            iVar2.setBounds(rect.left, i11 - this.T, rect.right, i11);
        }
    }

    private void j0(int i10) {
        this.f21356w0.U0(i10);
        Rect rect = this.W;
        com.google.android.material.internal.d.a(this, this.f21319e, rect);
        this.f21356w0.g0(s(rect));
        v0();
        l();
        t0(i10);
    }

    private void k() {
        TextView textView = this.f21351u;
        if (textView != null) {
            this.f21311a.addView(textView);
            this.f21351u.setVisibility(0);
        }
    }

    private void k0() {
        if (this.f21341p != null) {
            EditText editText = this.f21319e;
            l0(editText == null ? null : editText.getText());
        }
    }

    private void l() {
        if (this.f21319e == null || this.P != 1) {
            return;
        }
        if (!R()) {
            EditText editText = this.f21319e;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.f21356w0.r() + this.f21317d), this.f21319e.getPaddingEnd(), getResources().getDimensionPixelSize(sb.e.f51692j0));
        } else if (jc.c.l(getContext())) {
            EditText editText2 = this.f21319e;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(sb.e.f51701m0), this.f21319e.getPaddingEnd(), getResources().getDimensionPixelSize(sb.e.f51698l0));
        } else if (jc.c.k(getContext())) {
            EditText editText3 = this.f21319e;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(sb.e.f51695k0), this.f21319e.getPaddingEnd(), getResources().getDimensionPixelSize(sb.e.f51692j0));
        }
    }

    private static void m0(Context context, TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? sb.k.f51840l : sb.k.f51839k, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void n() {
        mc.i iVar = this.G;
        if (iVar == null) {
            return;
        }
        mc.p pVarM = iVar.M();
        mc.p pVar = this.M;
        if (pVarM != pVar) {
            this.G.setShapeAppearanceModel(pVar);
        }
        if (x()) {
            this.G.w0(this.R, this.U);
        }
        int iR = r();
        this.V = iR;
        this.G.l0(ColorStateList.valueOf(iR));
        o();
        s0();
    }

    private void n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f21341p;
        if (textView != null) {
            c0(textView, this.f21337n ? this.f21343q : this.f21345r);
            if (!this.f21337n && (colorStateList2 = this.f21361z) != null) {
                this.f21341p.setTextColor(colorStateList2);
            }
            if (!this.f21337n || (colorStateList = this.A) == null) {
                return;
            }
            this.f21341p.setTextColor(colorStateList);
        }
    }

    private void o() {
        if (this.K == null || this.L == null) {
            return;
        }
        if (y()) {
            this.K.l0(this.f21319e.isFocused() ? ColorStateList.valueOf(this.f21334l0) : ColorStateList.valueOf(this.U));
            this.L.l0(ColorStateList.valueOf(this.U));
        }
        invalidate();
    }

    private void o0() {
        ColorStateList colorStateList;
        ColorStateList colorStateListG = this.B;
        if (colorStateListG == null) {
            colorStateListG = ac.a.g(getContext(), h.a.f39866s);
        }
        EditText editText = this.f21319e;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = f0.a.r(this.f21319e.getTextCursorDrawable()).mutate();
        if (S() && (colorStateList = this.C) != null) {
            colorStateListG = colorStateList;
        }
        drawableMutate.setTintList(colorStateListG);
    }

    private void p(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.O;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    private void q() {
        int i10 = this.P;
        if (i10 == 0) {
            this.G = null;
            this.K = null;
            this.L = null;
            return;
        }
        if (i10 == 1) {
            this.G = new mc.i(this.M);
            this.K = new mc.i();
            this.L = new mc.i();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(this.P + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.D || (this.G instanceof com.google.android.material.textfield.h)) {
                this.G = new mc.i(this.M);
            } else {
                this.G = com.google.android.material.textfield.h.K0(this.M);
            }
            this.K = null;
            this.L = null;
        }
    }

    private int r() {
        return this.P == 1 ? ac.a.i(ac.a.e(this, sb.c.f51620m, 0), this.V) : this.V;
    }

    private void r0() {
        this.f21319e.setBackground(getEditTextBoxBackground());
    }

    private Rect s(Rect rect) {
        if (this.f21319e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f21312a0;
        boolean zM = com.google.android.material.internal.c0.m(this);
        rect2.bottom = rect.bottom;
        int i10 = this.P;
        if (i10 == 1) {
            rect2.left = J(rect.left, zM);
            rect2.top = rect.top + this.Q;
            rect2.right = K(rect.right, zM);
            return rect2;
        }
        if (i10 != 2) {
            rect2.left = J(rect.left, zM);
            rect2.top = getPaddingTop();
            rect2.right = K(rect.right, zM);
            return rect2;
        }
        rect2.left = rect.left + this.f21319e.getPaddingLeft();
        rect2.top = rect.top - w();
        rect2.right = rect.right - this.f21319e.getPaddingRight();
        return rect2;
    }

    private void setEditText(EditText editText) {
        if (this.f21319e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f21319e = editText;
        int i10 = this.f21323g;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f21327i);
        }
        int i11 = this.f21325h;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f21329j);
        }
        this.J = false;
        V();
        setTextInputAccessibilityDelegate(new e(this));
        this.f21356w0.R0(this.f21319e.getTypeface());
        this.f21356w0.A0(this.f21319e.getTextSize());
        this.f21356w0.u0(this.f21319e.getLetterSpacing());
        int gravity = this.f21319e.getGravity();
        this.f21356w0.m0((gravity & (-113)) | 48);
        this.f21356w0.z0(gravity);
        this.f21352u0 = editText.getMinimumHeight();
        this.f21319e.addTextChangedListener(new a(editText));
        if (this.f21330j0 == null) {
            this.f21330j0 = this.f21319e.getHintTextColors();
        }
        if (this.D) {
            if (TextUtils.isEmpty(this.E)) {
                CharSequence hint = this.f21319e.getHint();
                this.f21321f = hint;
                setHint(hint);
                this.f21319e.setHint((CharSequence) null);
            }
            this.F = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            o0();
        }
        if (this.f21341p != null) {
            l0(this.f21319e.getText());
        }
        q0();
        this.f21331k.e();
        this.f21313b.bringToFront();
        this.f21315c.bringToFront();
        D();
        this.f21315c.z0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        x0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.E)) {
            return;
        }
        this.E = charSequence;
        this.f21356w0.O0(charSequence);
        if (this.f21354v0) {
            return;
        }
        W();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f21349t == z10) {
            return;
        }
        if (z10) {
            k();
        } else {
            a0();
            this.f21351u = null;
        }
        this.f21349t = z10;
    }

    private int t(Rect rect, Rect rect2, float f10) {
        return U() ? (int) (rect2.top + f10) : rect.bottom - this.f21319e.getCompoundPaddingBottom();
    }

    private void t0(int i10) {
        if (this.f21319e == null) {
            return;
        }
        float fD = this.f21356w0.D();
        float height = 0.0f;
        if (this.f21347s != null) {
            TextPaint textPaint = new TextPaint(129);
            textPaint.set(this.f21351u.getPaint());
            textPaint.setTextSize(this.f21351u.getTextSize());
            textPaint.setTypeface(this.f21351u.getTypeface());
            textPaint.setLetterSpacing(this.f21351u.getLetterSpacing());
            try {
                height = StaticLayoutBuilderCompat.b(this.f21347s, textPaint, i10).g(getLayoutDirection() == 1).f(true).h(this.f21351u.getLineSpacingExtra(), this.f21351u.getLineSpacingMultiplier()).j(new com.google.android.material.internal.v() { // from class: com.google.android.material.textfield.e0
                    @Override // com.google.android.material.internal.v
                    public final void a(StaticLayout.Builder builder) {
                        builder.setBreakStrategy(this.f21389a.f21351u.getBreakStrategy());
                    }
                }).a().getHeight() + (this.P == 1 ? this.f21356w0.r() + this.Q + this.f21317d : 0.0f);
            } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e10) {
                Log.e("TextInputLayout", e10.getCause().getMessage(), e10);
            }
        }
        float fMax = Math.max(fD, height);
        if (this.f21319e.getMeasuredHeight() < fMax) {
            this.f21319e.setMinimumHeight(Math.round(fMax));
        }
    }

    private int u(Rect rect, float f10) {
        if (U()) {
            return (int) (rect.centerY() - (f10 / 2.0f));
        }
        return (rect.top + this.f21319e.getCompoundPaddingTop()) - ((this.P != 0 || R()) ? 0 : (int) (this.f21356w0.E() / 2.0f));
    }

    private boolean u0() {
        int iMax;
        if (this.f21319e == null || this.f21319e.getMeasuredHeight() >= (iMax = Math.max(this.f21315c.getMeasuredHeight(), this.f21313b.getMeasuredHeight()))) {
            return false;
        }
        this.f21319e.setMinimumHeight(iMax);
        return true;
    }

    private Rect v(Rect rect) {
        if (this.f21319e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f21312a0;
        float fE = R() ? this.f21356w0.E() : this.f21356w0.B() * this.f21356w0.z();
        rect2.left = rect.left + this.f21319e.getCompoundPaddingLeft();
        rect2.top = u(rect, fE);
        rect2.right = rect.right - this.f21319e.getCompoundPaddingRight();
        rect2.bottom = t(rect, rect2, fE);
        return rect2;
    }

    private void v0() {
        if (this.P != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f21311a.getLayoutParams();
            int iW = w();
            if (iW != layoutParams.topMargin) {
                layoutParams.topMargin = iW;
                this.f21311a.requestLayout();
            }
        }
    }

    private int w() {
        if (!this.D) {
            return 0;
        }
        int i10 = this.P;
        if (i10 == 0) {
            return (int) this.f21356w0.r();
        }
        if (i10 != 2) {
            return 0;
        }
        return R() ? (int) (this.f21356w0.r() / 2.0f) : Math.max(0, (int) (this.f21356w0.r() - (this.f21356w0.n() / 2.0f)));
    }

    private boolean x() {
        return this.P == 2 && y();
    }

    private void x0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f21319e;
        boolean z12 = false;
        boolean z13 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f21319e;
        if (editText2 != null && editText2.hasFocus()) {
            z12 = true;
        }
        ColorStateList colorStateList2 = this.f21330j0;
        if (colorStateList2 != null) {
            this.f21356w0.e0(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f21330j0;
            this.f21356w0.e0(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f21350t0) : this.f21350t0));
        } else if (d0()) {
            this.f21356w0.e0(this.f21331k.q());
        } else if (this.f21337n && (textView = this.f21341p) != null) {
            this.f21356w0.e0(textView.getTextColors());
        } else if (z12 && (colorStateList = this.f21332k0) != null) {
            this.f21356w0.l0(colorStateList);
        }
        if (z13 || !this.f21358x0 || (isEnabled() && z12)) {
            if (z11 || this.f21354v0) {
                A(z10);
                return;
            }
            return;
        }
        if (z11 || !this.f21354v0) {
            G(z10);
        }
    }

    private boolean y() {
        return this.R > -1 && this.U != 0;
    }

    private void y0() {
        EditText editText;
        if (this.f21351u == null || (editText = this.f21319e) == null) {
            return;
        }
        this.f21351u.setGravity(editText.getGravity());
        this.f21351u.setPadding(this.f21319e.getCompoundPaddingLeft(), this.f21319e.getCompoundPaddingTop(), this.f21319e.getCompoundPaddingRight(), this.f21319e.getCompoundPaddingBottom());
    }

    private void z() {
        if (C()) {
            ((com.google.android.material.textfield.h) this.G).M0();
        }
    }

    private void z0() {
        EditText editText = this.f21319e;
        A0(editText == null ? null : editText.getText());
    }

    void C0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.G == null || this.P == 0) {
            return;
        }
        boolean z10 = isFocused() || ((editText2 = this.f21319e) != null && editText2.hasFocus());
        boolean z11 = isHovered() || ((editText = this.f21319e) != null && editText.isHovered());
        if (!isEnabled()) {
            this.U = this.f21350t0;
        } else if (d0()) {
            if (this.f21340o0 != null) {
                B0(z10, z11);
            } else {
                this.U = getErrorCurrentTextColors();
            }
        } else if (!this.f21337n || (textView = this.f21341p) == null) {
            if (z10) {
                this.U = this.f21338n0;
            } else if (z11) {
                this.U = this.f21336m0;
            } else {
                this.U = this.f21334l0;
            }
        } else if (this.f21340o0 != null) {
            B0(z10, z11);
        } else {
            this.U = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            o0();
        }
        this.f21315c.K();
        Z();
        if (this.P == 2) {
            int i10 = this.R;
            if (z10 && isEnabled()) {
                this.R = this.T;
            } else {
                this.R = this.S;
            }
            if (this.R != i10) {
                X();
            }
        }
        if (this.P == 1) {
            if (!isEnabled()) {
                this.V = this.f21344q0;
            } else if (z11 && !z10) {
                this.V = this.f21348s0;
            } else if (z10) {
                this.V = this.f21346r0;
            } else {
                this.V = this.f21342p0;
            }
        }
        n();
        if (getEndIconMode() == 3) {
            EditText editText3 = this.f21319e;
            if (!(editText3 instanceof AutoCompleteTextView) || q.a(editText3)) {
                getEndIconView().setFocusable(true);
                getEndIconView().setClickable(true);
            } else {
                getEndIconView().setFocusable(false);
                getEndIconView().setClickable(false);
            }
        }
    }

    public boolean N() {
        return this.f21315c.H();
    }

    public boolean O() {
        return this.f21331k.A();
    }

    public boolean P() {
        return this.f21331k.B();
    }

    final boolean Q() {
        return this.f21354v0;
    }

    public boolean T() {
        return this.F;
    }

    public void Z() {
        this.f21313b.n();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f21311a.addView(view, layoutParams2);
        this.f21311a.setLayoutParams(layoutParams);
        v0();
        setEditText((EditText) view);
    }

    void c0(TextView textView, int i10) {
        try {
            androidx.core.widget.i.m(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        androidx.core.widget.i.m(textView, h.i.f39987c);
        textView.setTextColor(androidx.core.content.a.getColor(getContext(), sb.d.f51648a));
    }

    boolean d0() {
        return this.f21331k.k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f21319e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f21321f != null) {
            boolean z10 = this.F;
            this.F = false;
            CharSequence hint = editText.getHint();
            this.f21319e.setHint(this.f21321f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f21319e.setHint(hint);
                this.F = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f21311a.getChildCount());
        for (int i11 = 0; i11 < this.f21311a.getChildCount(); i11++) {
            View childAt = this.f21311a.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f21319e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.B0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.B0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        F(canvas);
        E(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.A0) {
            return;
        }
        this.A0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.b bVar = this.f21356w0;
        boolean zM0 = bVar != null ? bVar.M0(drawableState) : false;
        if (this.f21319e != null) {
            w0(isLaidOut() && isEnabled());
        }
        q0();
        C0();
        if (zM0) {
            invalidate();
        }
        this.A0 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f21319e;
        return editText != null ? editText.getBaseline() + getPaddingTop() + w() : super.getBaseline();
    }

    mc.i getBoxBackground() {
        int i10 = this.P;
        if (i10 == 1 || i10 == 2) {
            return this.G;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.V;
    }

    public int getBoxBackgroundMode() {
        return this.P;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.Q;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return com.google.android.material.internal.c0.m(this) ? this.M.s().a(this.f21314b0) : this.M.u().a(this.f21314b0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return com.google.android.material.internal.c0.m(this) ? this.M.u().a(this.f21314b0) : this.M.s().a(this.f21314b0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return com.google.android.material.internal.c0.m(this) ? this.M.A().a(this.f21314b0) : this.M.C().a(this.f21314b0);
    }

    public float getBoxCornerRadiusTopStart() {
        return com.google.android.material.internal.c0.m(this) ? this.M.C().a(this.f21314b0) : this.M.A().a(this.f21314b0);
    }

    public int getBoxStrokeColor() {
        return this.f21338n0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f21340o0;
    }

    public int getBoxStrokeWidth() {
        return this.S;
    }

    public int getBoxStrokeWidthFocused() {
        return this.T;
    }

    public int getCounterMaxLength() {
        return this.f21335m;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f21333l && this.f21337n && (textView = this.f21341p) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.A;
    }

    public ColorStateList getCounterTextColor() {
        return this.f21361z;
    }

    public ColorStateList getCursorColor() {
        return this.B;
    }

    public ColorStateList getCursorErrorColor() {
        return this.C;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f21330j0;
    }

    public EditText getEditText() {
        return this.f21319e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f21315c.n();
    }

    public Drawable getEndIconDrawable() {
        return this.f21315c.p();
    }

    public int getEndIconMinSize() {
        return this.f21315c.q();
    }

    public int getEndIconMode() {
        return this.f21315c.r();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f21315c.s();
    }

    CheckableImageButton getEndIconView() {
        return this.f21315c.t();
    }

    public CharSequence getError() {
        if (this.f21331k.A()) {
            return this.f21331k.o();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f21331k.m();
    }

    public CharSequence getErrorContentDescription() {
        return this.f21331k.n();
    }

    public int getErrorCurrentTextColors() {
        return this.f21331k.p();
    }

    public Drawable getErrorIconDrawable() {
        return this.f21315c.u();
    }

    public CharSequence getHelperText() {
        if (this.f21331k.B()) {
            return this.f21331k.r();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f21331k.s();
    }

    public CharSequence getHint() {
        if (this.D) {
            return this.E;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f21356w0.r();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f21356w0.w();
    }

    public int getHintMaxLines() {
        return this.f21356w0.A();
    }

    public ColorStateList getHintTextColor() {
        return this.f21332k0;
    }

    public f getLengthCounter() {
        return this.f21339o;
    }

    public int getMaxEms() {
        return this.f21325h;
    }

    public int getMaxWidth() {
        return this.f21329j;
    }

    public int getMinEms() {
        return this.f21323g;
    }

    public int getMinWidth() {
        return this.f21327i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f21315c.w();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f21315c.x();
    }

    public CharSequence getPlaceholderText() {
        if (this.f21349t) {
            return this.f21347s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f21355w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f21353v;
    }

    public CharSequence getPrefixText() {
        return this.f21313b.b();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f21313b.c();
    }

    public TextView getPrefixTextView() {
        return this.f21313b.e();
    }

    public mc.p getShapeAppearanceModel() {
        return this.M;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f21313b.f();
    }

    public Drawable getStartIconDrawable() {
        return this.f21313b.g();
    }

    public int getStartIconMinSize() {
        return this.f21313b.h();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f21313b.i();
    }

    public CharSequence getSuffixText() {
        return this.f21315c.y();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f21315c.z();
    }

    public TextView getSuffixTextView() {
        return this.f21315c.B();
    }

    public Typeface getTypeface() {
        return this.f21316c0;
    }

    public void j(g gVar) {
        this.f21322f0.add(gVar);
        if (this.f21319e != null) {
            gVar.a(this);
        }
    }

    void l0(Editable editable) {
        int iA = this.f21339o.a(editable);
        boolean z10 = this.f21337n;
        int i10 = this.f21335m;
        if (i10 == -1) {
            this.f21341p.setText(String.valueOf(iA));
            this.f21341p.setContentDescription(null);
            this.f21337n = false;
        } else {
            this.f21337n = iA > i10;
            m0(getContext(), this.f21341p, iA, this.f21335m, this.f21337n);
            if (z10 != this.f21337n) {
                n0();
            }
            this.f21341p.setText(l0.a.c().j(getContext().getString(sb.k.f51841m, Integer.valueOf(iA), Integer.valueOf(this.f21335m))));
        }
        if (this.f21319e == null || z10 == this.f21337n) {
            return;
        }
        w0(false);
        C0();
        q0();
    }

    void m(float f10) {
        if (this.f21356w0.H() == f10) {
            return;
        }
        if (this.f21362z0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f21362z0 = valueAnimator;
            valueAnimator.setInterpolator(gc.j.g(getContext(), sb.c.U, tb.b.f53276b));
            this.f21362z0.setDuration(gc.j.f(getContext(), sb.c.N, 167));
            this.f21362z0.addUpdateListener(new d());
        }
        this.f21362z0.setFloatValues(this.f21356w0.H(), f10);
        this.f21362z0.start();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f21356w0.Z(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f21315c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.C0 = false;
        boolean zU0 = u0();
        boolean zP0 = p0();
        if (zU0 || zP0) {
            this.f21319e.post(new Runnable() { // from class: com.google.android.material.textfield.c0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21386a.f21319e.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f21319e;
        if (editText != null) {
            Rect rect = this.W;
            com.google.android.material.internal.d.a(this, editText, rect);
            i0(rect);
            if (this.D) {
                this.f21356w0.A0(this.f21319e.getTextSize());
                int gravity = this.f21319e.getGravity();
                this.f21356w0.m0((gravity & (-113)) | 48);
                this.f21356w0.z0(gravity);
                this.f21356w0.g0(s(rect));
                this.f21356w0.t0(v(rect));
                this.f21356w0.b0();
                if (!C() || this.f21354v0) {
                    return;
                }
                W();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.C0) {
            this.f21315c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.C0 = true;
        }
        y0();
        this.f21315c.z0();
        if (R()) {
            return;
        }
        j0((this.f21319e.getMeasuredWidth() - this.f21319e.getCompoundPaddingLeft()) - this.f21319e.getCompoundPaddingRight());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.f21370c);
        if (hVar.f21371d) {
            post(new c());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 1;
        if (z10 != this.N) {
            float fA = this.M.A().a(this.f21314b0);
            float fA2 = this.M.C().a(this.f21314b0);
            mc.p pVarM = mc.p.g().D(this.M.B()).H(this.M.z()).u(this.M.t()).y(this.M.r()).E(fA2).I(fA).v(this.M.u().a(this.f21314b0)).z(this.M.s().a(this.f21314b0)).m();
            this.N = z10;
            setShapeAppearanceModel(pVarM);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (d0()) {
            hVar.f21370c = getError();
        }
        hVar.f21371d = this.f21315c.G();
        return hVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    boolean p0() {
        boolean z10;
        if (this.f21319e == null) {
            return false;
        }
        boolean z11 = true;
        if (f0()) {
            int iMax = Math.max(0, this.f21313b.getMeasuredWidth() - this.f21319e.getPaddingLeft());
            if (this.f21318d0 == null || this.f21320e0 != iMax) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f21318d0 = colorDrawable;
                this.f21320e0 = iMax;
                colorDrawable.setBounds(0, 0, iMax, 1);
            }
            Drawable[] compoundDrawablesRelative = this.f21319e.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.f21318d0;
            if (drawable != drawable2) {
                this.f21319e.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (this.f21318d0 != null) {
            Drawable[] compoundDrawablesRelative2 = this.f21319e.getCompoundDrawablesRelative();
            this.f21319e.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
            this.f21318d0 = null;
            z10 = true;
        } else {
            z10 = false;
        }
        if (e0()) {
            int measuredWidth = this.f21315c.B().getMeasuredWidth() - this.f21319e.getPaddingRight();
            CheckableImageButton checkableImageButtonM = this.f21315c.m();
            if (checkableImageButtonM != null) {
                measuredWidth = measuredWidth + checkableImageButtonM.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButtonM.getLayoutParams()).getMarginStart();
            }
            int iMax2 = Math.max(0, measuredWidth);
            Drawable[] compoundDrawablesRelative3 = this.f21319e.getCompoundDrawablesRelative();
            Drawable drawable3 = this.f21324g0;
            if (drawable3 != null && this.f21326h0 != iMax2) {
                this.f21326h0 = iMax2;
                drawable3.setBounds(0, 0, iMax2, 1);
                this.f21319e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f21324g0, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.f21324g0 = colorDrawable2;
                this.f21326h0 = iMax2;
                colorDrawable2.setBounds(0, 0, iMax2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.f21324g0;
            if (drawable4 != drawable5) {
                this.f21328i0 = drawable4;
                this.f21319e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.f21324g0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f21319e.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.f21324g0) {
                this.f21319e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f21328i0, compoundDrawablesRelative4[3]);
            } else {
                z11 = z10;
            }
            this.f21324g0 = null;
            return z11;
        }
        return z10;
    }

    void q0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f21319e;
        if (editText == null || this.P != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (androidx.appcompat.widget.y.a(background)) {
            background = background.mutate();
        }
        if (d0()) {
            background.setColorFilter(androidx.appcompat.widget.h.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f21337n && (textView = this.f21341p) != null) {
            background.setColorFilter(androidx.appcompat.widget.h.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            f0.a.c(background);
            this.f21319e.refreshDrawableState();
        }
    }

    void s0() {
        EditText editText = this.f21319e;
        if (editText == null || this.G == null) {
            return;
        }
        if ((this.J || editText.getBackground() == null) && this.P != 0) {
            r0();
            this.J = true;
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.V != i10) {
            this.V = i10;
            this.f21342p0 = i10;
            this.f21346r0 = i10;
            this.f21348s0 = i10;
            n();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(androidx.core.content.a.getColor(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f21342p0 = defaultColor;
        this.V = defaultColor;
        this.f21344q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f21346r0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f21348s0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        n();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.P) {
            return;
        }
        this.P = i10;
        if (this.f21319e != null) {
            V();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.Q = i10;
    }

    public void setBoxCornerFamily(int i10) {
        this.M = this.M.F().C(i10, this.M.A()).G(i10, this.M.C()).t(i10, this.M.s()).x(i10, this.M.u()).m();
        n();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f21338n0 != i10) {
            this.f21338n0 = i10;
            C0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f21334l0 = colorStateList.getDefaultColor();
            this.f21350t0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f21336m0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f21338n0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f21338n0 != colorStateList.getDefaultColor()) {
            this.f21338n0 = colorStateList.getDefaultColor();
        }
        C0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f21340o0 != colorStateList) {
            this.f21340o0 = colorStateList;
            C0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.S = i10;
        C0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.T = i10;
        C0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f21333l != z10) {
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f21341p = appCompatTextView;
                appCompatTextView.setId(sb.g.f51784s0);
                Typeface typeface = this.f21316c0;
                if (typeface != null) {
                    this.f21341p.setTypeface(typeface);
                }
                this.f21341p.setMaxLines(1);
                this.f21331k.d(this.f21341p, 2);
                ((ViewGroup.MarginLayoutParams) this.f21341p.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(sb.e.f51714q1));
                n0();
                k0();
            } else {
                this.f21331k.C(this.f21341p, 2);
                this.f21341p = null;
            }
            this.f21333l = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f21335m != i10) {
            if (i10 > 0) {
                this.f21335m = i10;
            } else {
                this.f21335m = -1;
            }
            if (this.f21333l) {
                k0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f21343q != i10) {
            this.f21343q = i10;
            n0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            n0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f21345r != i10) {
            this.f21345r = i10;
            n0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f21361z != colorStateList) {
            this.f21361z = colorStateList;
            n0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            o0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            if (S()) {
                o0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f21330j0 = colorStateList;
        this.f21332k0 = colorStateList;
        if (this.f21319e != null) {
            w0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        Y(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f21315c.P(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f21315c.Q(z10);
    }

    public void setEndIconContentDescription(int i10) {
        this.f21315c.R(i10);
    }

    public void setEndIconDrawable(int i10) {
        this.f21315c.T(i10);
    }

    public void setEndIconMinSize(int i10) {
        this.f21315c.V(i10);
    }

    public void setEndIconMode(int i10) {
        this.f21315c.W(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f21315c.X(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f21315c.Y(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f21315c.Z(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f21315c.a0(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f21315c.b0(mode);
    }

    public void setEndIconVisible(boolean z10) {
        this.f21315c.c0(z10);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f21331k.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f21331k.v();
        } else {
            this.f21331k.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        this.f21331k.E(i10);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f21331k.F(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f21331k.G(z10);
    }

    public void setErrorIconDrawable(int i10) {
        this.f21315c.d0(i10);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f21315c.f0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f21315c.g0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f21315c.h0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f21315c.i0(mode);
    }

    public void setErrorTextAppearance(int i10) {
        this.f21331k.H(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f21331k.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f21358x0 != z10) {
            this.f21358x0 = z10;
            w0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (P()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!P()) {
                setHelperTextEnabled(true);
            }
            this.f21331k.R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f21331k.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f21331k.K(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f21331k.J(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f21360y0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.D) {
            this.D = z10;
            if (z10) {
                CharSequence hint = this.f21319e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.E)) {
                        setHint(hint);
                    }
                    this.f21319e.setHint((CharSequence) null);
                }
                this.F = true;
            } else {
                this.F = false;
                if (!TextUtils.isEmpty(this.E) && TextUtils.isEmpty(this.f21319e.getHint())) {
                    this.f21319e.setHint(this.E);
                }
                setHintInternal(null);
            }
            if (this.f21319e != null) {
                v0();
            }
        }
    }

    public void setHintMaxLines(int i10) {
        this.f21356w0.i0(i10);
        this.f21356w0.v0(i10);
        requestLayout();
    }

    public void setHintTextAppearance(int i10) {
        this.f21356w0.j0(i10);
        this.f21332k0 = this.f21356w0.p();
        if (this.f21319e != null) {
            w0(false);
            v0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f21332k0 != colorStateList) {
            if (this.f21330j0 == null) {
                this.f21356w0.l0(colorStateList);
            }
            this.f21332k0 = colorStateList;
            if (this.f21319e != null) {
                w0(false);
            }
        }
    }

    public void setLengthCounter(f fVar) {
        this.f21339o = fVar;
    }

    public void setMaxEms(int i10) {
        this.f21325h = i10;
        EditText editText = this.f21319e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f21329j = i10;
        EditText editText = this.f21319e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f21323g = i10;
        EditText editText = this.f21319e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f21327i = i10;
        EditText editText = this.f21319e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        this.f21315c.k0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        this.f21315c.m0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        this.f21315c.o0(z10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f21315c.p0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f21315c.q0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f21351u == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f21351u = appCompatTextView;
            appCompatTextView.setId(sb.g.f51790v0);
            this.f21351u.setImportantForAccessibility(1);
            this.f21351u.setAccessibilityLiveRegion(1);
            androidx.transition.c cVarB = B();
            this.f21357x = cVarB;
            cVarB.h0(67L);
            this.f21359y = B();
            setPlaceholderTextAppearance(this.f21355w);
            setPlaceholderTextColor(this.f21353v);
            q0.m0(this.f21351u, new b());
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f21349t) {
                setPlaceholderTextEnabled(true);
            }
            this.f21347s = charSequence;
        }
        z0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f21355w = i10;
        TextView textView = this.f21351u;
        if (textView != null) {
            androidx.core.widget.i.m(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f21353v != colorStateList) {
            this.f21353v = colorStateList;
            TextView textView = this.f21351u;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f21313b.o(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.f21313b.p(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f21313b.q(colorStateList);
    }

    public void setShapeAppearanceModel(mc.p pVar) {
        mc.i iVar = this.G;
        if (iVar == null || iVar.M() == pVar) {
            return;
        }
        this.M = pVar;
        n();
    }

    public void setStartIconCheckable(boolean z10) {
        this.f21313b.r(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        this.f21313b.u(i10);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f21313b.v(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f21313b.w(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f21313b.x(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f21313b.y(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f21313b.z(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f21313b.A(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f21315c.r0(charSequence);
    }

    public void setSuffixTextAppearance(int i10) {
        this.f21315c.s0(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f21315c.t0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f21319e;
        if (editText != null) {
            q0.m0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f21316c0) {
            this.f21316c0 = typeface;
            this.f21356w0.R0(typeface);
            this.f21331k.N(typeface);
            TextView textView = this.f21341p;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void w0(boolean z10) {
        x0(z10, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11 = D0;
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f21323g = -1;
        this.f21325h = -1;
        this.f21327i = -1;
        this.f21329j = -1;
        this.f21331k = new w(this);
        this.f21339o = new f() { // from class: com.google.android.material.textfield.d0
            @Override // com.google.android.material.textfield.TextInputLayout.f
            public final int a(Editable editable) {
                return TextInputLayout.c(editable);
            }
        };
        this.W = new Rect();
        this.f21312a0 = new Rect();
        this.f21314b0 = new RectF();
        this.f21322f0 = new LinkedHashSet();
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(this);
        this.f21356w0 = bVar;
        this.C0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f21311a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = tb.b.f53275a;
        bVar.P0(timeInterpolator);
        bVar.K0(timeInterpolator);
        bVar.m0(8388659);
        int[] iArr = sb.m.f52200uc;
        int i12 = sb.m.Rc;
        int i13 = sb.m.Pc;
        int i14 = sb.m.f52036jd;
        int i15 = sb.m.f52111od;
        int i16 = sb.m.f52186td;
        o0 o0VarJ = com.google.android.material.internal.z.j(context2, attributeSet, iArr, i10, i11, i12, i13, i14, i15, i16);
        b0 b0Var = new b0(this, o0VarJ);
        this.f21313b = b0Var;
        this.D = o0VarJ.a(sb.m.f52156rd, true);
        setHint(o0VarJ.p(sb.m.f52275zc));
        this.f21360y0 = o0VarJ.a(sb.m.f52141qd, true);
        this.f21358x0 = o0VarJ.a(sb.m.f52066ld, true);
        int i17 = sb.m.Bc;
        if (o0VarJ.s(i17)) {
            setMinEms(o0VarJ.k(i17, -1));
        } else {
            int i18 = sb.m.f52260yc;
            if (o0VarJ.s(i18)) {
                setMinWidth(o0VarJ.f(i18, -1));
            }
        }
        int i19 = sb.m.Ac;
        if (o0VarJ.s(i19)) {
            setMaxEms(o0VarJ.k(i19, -1));
        } else {
            int i20 = sb.m.f52245xc;
            if (o0VarJ.s(i20)) {
                setMaxWidth(o0VarJ.f(i20, -1));
            }
        }
        this.M = mc.p.k(context2, attributeSet, i10, i11).m();
        this.O = context2.getResources().getDimensionPixelOffset(sb.e.f51705n1);
        this.Q = o0VarJ.e(sb.m.Ec, 0);
        this.f21317d = getResources().getDimensionPixelSize(sb.e.N);
        this.S = o0VarJ.f(sb.m.Lc, context2.getResources().getDimensionPixelSize(sb.e.f51708o1));
        this.T = o0VarJ.f(sb.m.Mc, context2.getResources().getDimensionPixelSize(sb.e.f51711p1));
        this.R = this.S;
        float fD = o0VarJ.d(sb.m.Ic, -1.0f);
        float fD2 = o0VarJ.d(sb.m.Hc, -1.0f);
        float fD3 = o0VarJ.d(sb.m.Fc, -1.0f);
        float fD4 = o0VarJ.d(sb.m.Gc, -1.0f);
        mc.p.b bVarF = this.M.F();
        if (fD >= 0.0f) {
            bVarF.E(fD);
        }
        if (fD2 >= 0.0f) {
            bVarF.I(fD2);
        }
        if (fD3 >= 0.0f) {
            bVarF.z(fD3);
        }
        if (fD4 >= 0.0f) {
            bVarF.v(fD4);
        }
        this.M = bVarF.m();
        ColorStateList colorStateListB = jc.c.b(context2, o0VarJ, sb.m.Cc);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.f21342p0 = defaultColor;
            this.V = defaultColor;
            if (colorStateListB.isStateful()) {
                this.f21344q0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f21346r0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f21348s0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f21346r0 = this.f21342p0;
                ColorStateList colorStateListA = i.a.a(context2, sb.d.f51660m);
                this.f21344q0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.f21348s0 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.V = 0;
            this.f21342p0 = 0;
            this.f21344q0 = 0;
            this.f21346r0 = 0;
            this.f21348s0 = 0;
        }
        int i21 = sb.m.f52230wc;
        if (o0VarJ.s(i21)) {
            ColorStateList colorStateListC = o0VarJ.c(i21);
            this.f21332k0 = colorStateListC;
            this.f21330j0 = colorStateListC;
        }
        int i22 = sb.m.Jc;
        ColorStateList colorStateListB2 = jc.c.b(context2, o0VarJ, i22);
        this.f21338n0 = o0VarJ.b(i22, 0);
        this.f21334l0 = androidx.core.content.a.getColor(context2, sb.d.f51661n);
        this.f21350t0 = androidx.core.content.a.getColor(context2, sb.d.f51662o);
        this.f21336m0 = androidx.core.content.a.getColor(context2, sb.d.f51663p);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        int i23 = sb.m.Kc;
        if (o0VarJ.s(i23)) {
            setBoxStrokeErrorColor(jc.c.b(context2, o0VarJ, i23));
        }
        if (o0VarJ.n(i16, -1) != -1) {
            setHintTextAppearance(o0VarJ.n(i16, 0));
        }
        this.B = o0VarJ.c(sb.m.Tc);
        this.C = o0VarJ.c(sb.m.Uc);
        int iN = o0VarJ.n(i14, 0);
        CharSequence charSequenceP = o0VarJ.p(sb.m.f51961ed);
        int iK = o0VarJ.k(sb.m.f51945dd, 1);
        boolean zA = o0VarJ.a(sb.m.f51976fd, false);
        int iN2 = o0VarJ.n(i15, 0);
        boolean zA2 = o0VarJ.a(sb.m.f52096nd, false);
        CharSequence charSequenceP2 = o0VarJ.p(sb.m.f52081md);
        int iN3 = o0VarJ.n(sb.m.Bd, 0);
        CharSequence charSequenceP3 = o0VarJ.p(sb.m.Ad);
        boolean zA3 = o0VarJ.a(sb.m.Nc, false);
        setCounterMaxLength(o0VarJ.k(sb.m.Oc, -1));
        this.f21345r = o0VarJ.n(i12, 0);
        this.f21343q = o0VarJ.n(i13, 0);
        setBoxBackgroundMode(o0VarJ.k(sb.m.Dc, 0));
        setErrorContentDescription(charSequenceP);
        setErrorAccessibilityLiveRegion(iK);
        setCounterOverflowTextAppearance(this.f21343q);
        setHelperTextTextAppearance(iN2);
        setErrorTextAppearance(iN);
        setCounterTextAppearance(this.f21345r);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        int i24 = sb.m.f52051kd;
        if (o0VarJ.s(i24)) {
            setErrorTextColor(o0VarJ.c(i24));
        }
        int i25 = sb.m.f52126pd;
        if (o0VarJ.s(i25)) {
            setHelperTextColor(o0VarJ.c(i25));
        }
        int i26 = sb.m.f52201ud;
        if (o0VarJ.s(i26)) {
            setHintTextColor(o0VarJ.c(i26));
        }
        int i27 = sb.m.Sc;
        if (o0VarJ.s(i27)) {
            setCounterTextColor(o0VarJ.c(i27));
        }
        int i28 = sb.m.Qc;
        if (o0VarJ.s(i28)) {
            setCounterOverflowTextColor(o0VarJ.c(i28));
        }
        int i29 = sb.m.Cd;
        if (o0VarJ.s(i29)) {
            setPlaceholderTextColor(o0VarJ.c(i29));
        }
        t tVar = new t(this, o0VarJ);
        this.f21315c = tVar;
        boolean zA4 = o0VarJ.a(sb.m.f52215vc, true);
        setHintMaxLines(o0VarJ.k(sb.m.f52171sd, 1));
        o0VarJ.x();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(b0Var);
        frameLayout.addView(tVar);
        addView(frameLayout);
        setEnabled(zA4);
        setHelperTextEnabled(zA2);
        setErrorEnabled(zA);
        setCounterEnabled(zA3);
        setHelperText(charSequenceP2);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f21315c.S(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f21315c.U(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f21315c.e0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f21315c.l0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f21315c.n0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f21313b.s(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f21313b.t(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f21364b;

        a(EditText editText) {
            this.f21364b = editText;
            this.f21363a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.w0(!textInputLayout.B0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f21333l) {
                textInputLayout2.l0(editable);
            }
            if (TextInputLayout.this.f21349t) {
                TextInputLayout.this.A0(editable);
            }
            int lineCount = this.f21364b.getLineCount();
            int i10 = this.f21363a;
            if (lineCount != i10) {
                if (lineCount < i10) {
                    int minimumHeight = this.f21364b.getMinimumHeight();
                    int i11 = TextInputLayout.this.f21352u0;
                    if (minimumHeight != i11) {
                        this.f21364b.setMinimumHeight(i11);
                    }
                }
                this.f21363a = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
