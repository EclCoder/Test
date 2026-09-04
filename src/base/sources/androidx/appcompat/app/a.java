package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public abstract void A(boolean z10);

    public abstract void B(boolean z10);

    public abstract void C(int i10);

    public abstract void D(CharSequence charSequence);

    public abstract void E(CharSequence charSequence);

    public abstract void F();

    public androidx.appcompat.view.b G(androidx.appcompat.view.b.a aVar) {
        return null;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z10);

    public abstract int i();

    public abstract Context j();

    public abstract void k();

    public boolean l() {
        return false;
    }

    public abstract boolean o(int i10, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(View view);

    public abstract void s(boolean z10);

    public abstract void t(boolean z10);

    public abstract void u(boolean z10);

    public abstract void v(boolean z10);

    public abstract void w(float f10);

    public abstract void x(int i10);

    public abstract void y(int i10);

    public abstract void z(Drawable drawable);

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class C0009a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f697a;

        public C0009a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f697a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.j.f40098t);
            this.f697a = typedArrayObtainStyledAttributes.getInt(h.j.f40103u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0009a(int i10, int i11) {
            super(i10, i11);
            this.f697a = 8388627;
        }

        public C0009a(C0009a c0009a) {
            super((ViewGroup.MarginLayoutParams) c0009a);
            this.f697a = 0;
            this.f697a = c0009a.f697a;
        }

        public C0009a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f697a = 0;
        }
    }

    void n() {
    }

    public void m(Configuration configuration) {
    }
}
