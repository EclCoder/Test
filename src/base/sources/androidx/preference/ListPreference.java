package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    private CharSequence[] W;
    private CharSequence[] X;
    private String Y;
    private String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f6302a0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements Preference.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static b f6304a;

        private b() {
        }

        public static b b() {
            if (f6304a == null) {
                f6304a = new b();
            }
            return f6304a;
        }

        @Override // androidx.preference.Preference.g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.W0()) ? listPreference.j().getString(q.f6449c) : listPreference.W0();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f6511y, i10, i11);
        this.W = d0.k.o(typedArrayObtainStyledAttributes, s.B, s.f6513z);
        this.X = d0.k.o(typedArrayObtainStyledAttributes, s.C, s.A);
        int i12 = s.D;
        if (d0.k.b(typedArrayObtainStyledAttributes, i12, i12, false)) {
            E0(b.b());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, s.J, i10, i11);
        this.Z = d0.k.m(typedArrayObtainStyledAttributes2, s.f6498r0, s.R);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private int Z0() {
        return U0(this.Y);
    }

    @Override // androidx.preference.Preference
    public CharSequence C() {
        if (D() != null) {
            return D().a(this);
        }
        CharSequence charSequenceW0 = W0();
        CharSequence charSequenceC = super.C();
        String str = this.Z;
        if (str != null) {
            if (charSequenceW0 == null) {
                charSequenceW0 = "";
            }
            String str2 = String.format(str, charSequenceW0);
            if (!TextUtils.equals(str2, charSequenceC)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceC;
    }

    @Override // androidx.preference.Preference
    public void D0(CharSequence charSequence) {
        super.D0(charSequence);
        if (charSequence == null) {
            this.Z = null;
        } else {
            this.Z = charSequence.toString();
        }
    }

    public int U0(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.X) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.X[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] V0() {
        return this.W;
    }

    @Override // androidx.preference.Preference
    protected Object W(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    public CharSequence W0() {
        CharSequence[] charSequenceArr;
        int iZ0 = Z0();
        if (iZ0 < 0 || (charSequenceArr = this.W) == null) {
            return null;
        }
        return charSequenceArr[iZ0];
    }

    public CharSequence[] X0() {
        return this.X;
    }

    public String Y0() {
        return this.Y;
    }

    @Override // androidx.preference.Preference
    protected void a0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(a.class)) {
            super.a0(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.a0(aVar.getSuperState());
        e1(aVar.f6303a);
    }

    public void a1(int i10) {
        b1(j().getResources().getTextArray(i10));
    }

    @Override // androidx.preference.Preference
    protected Parcelable b0() {
        Parcelable parcelableB0 = super.b0();
        if (J()) {
            return parcelableB0;
        }
        a aVar = new a(parcelableB0);
        aVar.f6303a = Y0();
        return aVar;
    }

    public void b1(CharSequence[] charSequenceArr) {
        this.W = charSequenceArr;
    }

    @Override // androidx.preference.Preference
    protected void c0(Object obj) {
        e1(x((String) obj));
    }

    public void c1(int i10) {
        d1(j().getResources().getTextArray(i10));
    }

    public void d1(CharSequence[] charSequenceArr) {
        this.X = charSequenceArr;
    }

    public void e1(String str) {
        boolean zEquals = TextUtils.equals(this.Y, str);
        if (zEquals && this.f6302a0) {
            return;
        }
        this.Y = str;
        this.f6302a0 = true;
        j0(str);
        if (zEquals) {
            return;
        }
        M();
    }

    public void f1(int i10) {
        CharSequence[] charSequenceArr = this.X;
        if (charSequenceArr != null) {
            e1(charSequenceArr[i10].toString());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0067a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f6303a;

        /* JADX INFO: renamed from: androidx.preference.ListPreference$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0067a implements Parcelable.Creator {
            C0067a() {
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
            this.f6303a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f6303a);
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d0.k.a(context, m.f6425b, R.attr.dialogPreferenceStyle));
    }

    public ListPreference(Context context) {
        this(context, null);
    }
}
