package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    private CharSequence Q;
    private CharSequence R;
    private Drawable S;
    private CharSequence T;
    private CharSequence U;
    private int V;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        Preference j(CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f6480j, i10, i11);
        String strM = d0.k.m(typedArrayObtainStyledAttributes, s.f6501t, s.f6483k);
        this.Q = strM;
        if (strM == null) {
            this.Q = E();
        }
        this.R = d0.k.m(typedArrayObtainStyledAttributes, s.f6499s, s.f6485l);
        this.S = d0.k.c(typedArrayObtainStyledAttributes, s.f6495q, s.f6487m);
        this.T = d0.k.m(typedArrayObtainStyledAttributes, s.f6505v, s.f6489n);
        this.U = d0.k.m(typedArrayObtainStyledAttributes, s.f6503u, s.f6491o);
        this.V = d0.k.l(typedArrayObtainStyledAttributes, s.f6497r, s.f6493p, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public Drawable O0() {
        return this.S;
    }

    public int P0() {
        return this.V;
    }

    public CharSequence Q0() {
        return this.R;
    }

    public CharSequence R0() {
        return this.Q;
    }

    public CharSequence S0() {
        return this.U;
    }

    @Override // androidx.preference.Preference
    protected void T() {
        A().u(this);
    }

    public CharSequence T0() {
        return this.T;
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d0.k.a(context, m.f6425b, R.attr.dialogPreferenceStyle));
    }
}
