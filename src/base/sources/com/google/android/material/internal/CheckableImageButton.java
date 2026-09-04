package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f20251h = {R.attr.state_checked};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f20253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f20254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f20255g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends n0.a {
        a() {
        }

        @Override // n0.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // n0.a
        public void g(View view, o0.p pVar) {
            super.g(view, pVar);
            pVar.s0(CheckableImageButton.this.a());
            pVar.t0(CheckableImageButton.this.isChecked());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(View view, boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c extends u0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f20257c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f20257c = parcel.readInt() == 1;
        }

        @Override // u0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f20257c ? 1 : 0);
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.D);
    }

    public boolean a() {
        return this.f20253e;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f20252d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (!this.f20252d) {
            return super.onCreateDrawableState(i10);
        }
        int[] iArr = f20251h;
        return View.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        this.f20255g = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.a());
        setChecked(cVar.f20257c);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f20257c = this.f20252d;
        return cVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f20253e != z10) {
            this.f20253e = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f20253e || this.f20252d == z10) {
            return;
        }
        this.f20252d = z10;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public void setFocusable(boolean z10) {
        b bVar;
        boolean zIsFocusable = isFocusable();
        super.setFocusable(z10);
        if (zIsFocusable == z10 || (bVar = this.f20255g) == null) {
            return;
        }
        bVar.a(this, z10);
    }

    public void setOnFocusableChangedListener(b bVar) {
        this.f20255g = bVar;
    }

    public void setPressable(boolean z10) {
        this.f20254f = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f20254f) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f20252d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f20253e = true;
        this.f20254f = true;
        q0.m0(this, new a());
    }
}
