package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    protected boolean Q;
    private CharSequence R;
    private CharSequence S;
    private boolean T;
    private boolean U;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // androidx.preference.Preference
    public boolean J0() {
        boolean z10;
        if (this.U) {
            z10 = this.Q;
        } else {
            z10 = !this.Q;
        }
        return z10 || super.J0();
    }

    public boolean O0() {
        return this.Q;
    }

    public void P0(boolean z10) {
        boolean z11 = this.Q != z10;
        if (z11 || !this.T) {
            this.Q = z10;
            this.T = true;
            g0(z10);
            if (z11) {
                N(J0());
                M();
            }
        }
    }

    public void Q0(boolean z10) {
        this.U = z10;
    }

    public void R0(CharSequence charSequence) {
        this.S = charSequence;
        if (O0()) {
            return;
        }
        M();
    }

    public void S0(CharSequence charSequence) {
        this.R = charSequence;
        if (O0()) {
            M();
        }
    }

    @Override // androidx.preference.Preference
    protected void T() {
        super.T();
        boolean z10 = !O0();
        if (c(Boolean.valueOf(z10))) {
            P0(z10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    protected void T0(View view) {
        boolean z10;
        int i10;
        CharSequence charSequenceC;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (!this.Q || TextUtils.isEmpty(this.R)) {
                if (this.Q || TextUtils.isEmpty(this.S)) {
                    z10 = true;
                } else {
                    textView.setText(this.S);
                }
                if (z10) {
                    charSequenceC = C();
                    if (!TextUtils.isEmpty(charSequenceC)) {
                        textView.setText(charSequenceC);
                        z10 = false;
                    }
                }
                i10 = z10 ? 8 : 0;
                if (i10 != textView.getVisibility()) {
                    textView.setVisibility(i10);
                }
            }
            textView.setText(this.R);
            z10 = false;
            if (z10) {
                charSequenceC = C();
                if (!TextUtils.isEmpty(charSequenceC)) {
                    textView.setText(charSequenceC);
                    z10 = false;
                }
            }
            if (z10) {
            }
            if (i10 != textView.getVisibility()) {
                textView.setVisibility(i10);
            }
        }
    }

    protected void U0(l lVar) {
        T0(lVar.b(R.id.summary));
    }

    @Override // androidx.preference.Preference
    protected Object W(TypedArray typedArray, int i10) {
        return Boolean.valueOf(typedArray.getBoolean(i10, false));
    }

    @Override // androidx.preference.Preference
    protected void a0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(a.class)) {
            super.a0(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.a0(aVar.getSuperState());
        P0(aVar.f6345a);
    }

    @Override // androidx.preference.Preference
    protected Parcelable b0() {
        Parcelable parcelableB0 = super.b0();
        if (J()) {
            return parcelableB0;
        }
        a aVar = new a(parcelableB0);
        aVar.f6345a = O0();
        return aVar;
    }

    @Override // androidx.preference.Preference
    protected void c0(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        P0(u(((Boolean) obj).booleanValue()));
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0069a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f6345a;

        /* JADX INFO: renamed from: androidx.preference.TwoStatePreference$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0069a implements Parcelable.Creator {
            C0069a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        a(Parcel parcel) {
            super(parcel);
            this.f6345a = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6345a ? 1 : 0);
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
