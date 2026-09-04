package com.facebook;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t extends Button {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View.OnClickListener f16060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View.OnClickListener f16061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.facebook.internal.f0 f16065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16066i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, AttributeSet attributeSet, int i10, int i11, String analyticsButtonCreatedEventName, String analyticsButtonTappedEventName) {
        super(context, attributeSet, 0);
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(analyticsButtonCreatedEventName, "analyticsButtonCreatedEventName");
        kotlin.jvm.internal.s.h(analyticsButtonTappedEventName, "analyticsButtonTappedEventName");
        i11 = i11 == 0 ? getDefaultStyleResource() : i11;
        c(context, attributeSet, i10, i11 == 0 ? com.facebook.common.f.f15061c : i11);
        this.f16058a = analyticsButtonCreatedEventName;
        this.f16059b = analyticsButtonTappedEventName;
        setClickable(true);
        setFocusable(true);
    }

    private final void g(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (isInEditMode()) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.background}, i10, i11);
            kotlin.jvm.internal.s.g(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setBackgroundResource(resourceId);
                    } else {
                        setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
                    }
                } else {
                    setBackgroundColor(androidx.core.content.a.getColor(context, com.facebook.common.a.f15039a));
                }
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final void h(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.drawableLeft, R.attr.drawableTop, R.attr.drawableRight, R.attr.drawableBottom, R.attr.drawablePadding}, i10, i11);
            kotlin.jvm.internal.s.g(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
            try {
                setCompoundDrawablesWithIntrinsicBounds(typedArrayObtainStyledAttributes.getResourceId(0, 0), typedArrayObtainStyledAttributes.getResourceId(1, 0), typedArrayObtainStyledAttributes.getResourceId(2, 0), typedArrayObtainStyledAttributes.getResourceId(3, 0));
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
                typedArrayObtainStyledAttributes.recycle();
                setCompoundDrawablePadding(dimensionPixelSize);
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } catch (Throwable th3) {
            x7.a.b(th3, this);
        }
    }

    private final void i(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom}, i10, i11);
            kotlin.jvm.internal.s.g(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
            try {
                setPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final void j(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.textColor}, i10, i11);
            kotlin.jvm.internal.s.g(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
            try {
                setTextColor(typedArrayObtainStyledAttributes.getColorStateList(0));
                typedArrayObtainStyledAttributes.recycle();
                TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.gravity}, i10, i11);
                kotlin.jvm.internal.s.g(typedArrayObtainStyledAttributes2, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
                try {
                    int i12 = typedArrayObtainStyledAttributes2.getInt(0, 17);
                    typedArrayObtainStyledAttributes2.recycle();
                    setGravity(i12);
                    TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.textSize, R.attr.textStyle, R.attr.text}, i10, i11);
                    kotlin.jvm.internal.s.g(typedArrayObtainStyledAttributes3, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
                    try {
                        setTextSize(0, typedArrayObtainStyledAttributes3.getDimensionPixelSize(0, 0));
                        setTypeface(Typeface.create(getTypeface(), 1));
                        String string = typedArrayObtainStyledAttributes3.getString(2);
                        typedArrayObtainStyledAttributes3.recycle();
                        setText(string);
                    } catch (Throwable th2) {
                        typedArrayObtainStyledAttributes3.recycle();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th3;
                }
            } catch (Throwable th4) {
                typedArrayObtainStyledAttributes.recycle();
                throw th4;
            }
        } catch (Throwable th5) {
            x7.a.b(th5, this);
        }
    }

    private final void k() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            super.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    t.l(this.f16002a, view);
                }
            });
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public static final void l(t this$0, View view) {
        if (x7.a.c(t.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(this$0, "this$0");
            this$0.e(this$0.getContext());
            View.OnClickListener onClickListener = this$0.f16061d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
                return;
            }
            View.OnClickListener onClickListener2 = this$0.f16060c;
            if (onClickListener2 != null) {
                onClickListener2.onClick(view);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, t.class);
        }
    }

    protected void b(View view) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            View.OnClickListener onClickListener = this.f16060c;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    protected void c(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(context, "context");
            g(context, attributeSet, i10, i11);
            h(context, attributeSet, i10, i11);
            i(context, attributeSet, i10, i11);
            j(context, attributeSet, i10, i11);
            k();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    protected void d(Context context) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            com.facebook.appevents.o0.f14970b.a(context, null).f(this.f16058a);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    protected void e(Context context) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            com.facebook.appevents.o0.f14970b.a(context, null).f(this.f16059b);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    protected int f(String str) {
        if (x7.a.c(this)) {
            return 0;
        }
        try {
            return (int) Math.ceil(getPaint().measureText(str));
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return 0;
        }
    }

    protected Activity getActivity() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            Context context = getContext();
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            throw new FacebookException("Unable to get Activity.");
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    protected final String getAnalyticsButtonCreatedEventName() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            return this.f16058a;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    protected final String getAnalyticsButtonTappedEventName() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            return this.f16059b;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public final f.g getAndroidxActivityResultRegistryOwner() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            ComponentCallbacks2 activity = getActivity();
            if (activity instanceof f.g) {
                return (f.g) activity;
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (x7.a.c(this)) {
            return 0;
        }
        try {
            return this.f16062e ? this.f16063f : super.getCompoundPaddingLeft();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return 0;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        if (x7.a.c(this)) {
            return 0;
        }
        try {
            return this.f16062e ? this.f16064g : super.getCompoundPaddingRight();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return 0;
        }
    }

    protected abstract int getDefaultRequestCode();

    protected int getDefaultStyleResource() {
        if (x7.a.c(this)) {
            return 0;
        }
        try {
            return this.f16066i;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return 0;
        }
    }

    public final Fragment getFragment() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            com.facebook.internal.f0 f0Var = this.f16065h;
            if (f0Var != null) {
                return f0Var.c();
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public final android.app.Fragment getNativeFragment() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            com.facebook.internal.f0 f0Var = this.f16065h;
            if (f0Var != null) {
                return f0Var.b();
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public int getRequestCode() {
        if (x7.a.c(this)) {
            return 0;
        }
        try {
            return getDefaultRequestCode();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return 0;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (isInEditMode()) {
                return;
            }
            d(getContext());
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(canvas, "canvas");
            if ((getGravity() & 1) != 0) {
                int compoundPaddingLeft = getCompoundPaddingLeft();
                int compoundPaddingRight = getCompoundPaddingRight();
                int iMin = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - f(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                this.f16063f = compoundPaddingLeft - iMin;
                this.f16064g = compoundPaddingRight + iMin;
                this.f16062e = true;
            }
            super.onDraw(canvas);
            this.f16062e = false;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void setFragment(android.app.Fragment fragment) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(fragment, "fragment");
            this.f16065h = new com.facebook.internal.f0(fragment);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    protected void setInternalOnClickListener(View.OnClickListener onClickListener) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            this.f16061d = onClickListener;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            this.f16060c = onClickListener;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void setFragment(Fragment fragment) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(fragment, "fragment");
            this.f16065h = new com.facebook.internal.f0(fragment);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }
}
