package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    private CharSequence[] W;
    private CharSequence[] X;
    private Set Y;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.Y = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.E, i10, i11);
        this.W = d0.k.o(typedArrayObtainStyledAttributes, s.H, s.F);
        this.X = d0.k.o(typedArrayObtainStyledAttributes, s.I, s.G);
        typedArrayObtainStyledAttributes.recycle();
    }

    public CharSequence[] U0() {
        return this.W;
    }

    public CharSequence[] V0() {
        return this.X;
    }

    @Override // androidx.preference.Preference
    protected Object W(TypedArray typedArray, int i10) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public Set W0() {
        return this.Y;
    }

    public void X0(Set set) {
        this.Y.clear();
        this.Y.addAll(set);
        k0(set);
        M();
    }

    @Override // androidx.preference.Preference
    protected void a0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(a.class)) {
            super.a0(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.a0(aVar.getSuperState());
        X0(aVar.f6305a);
    }

    @Override // androidx.preference.Preference
    protected Parcelable b0() {
        Parcelable parcelableB0 = super.b0();
        if (J()) {
            return parcelableB0;
        }
        a aVar = new a(parcelableB0);
        aVar.f6305a = W0();
        return aVar;
    }

    @Override // androidx.preference.Preference
    protected void c0(Object obj) {
        X0(y((Set) obj));
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0068a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Set f6305a;

        /* JADX INFO: renamed from: androidx.preference.MultiSelectListPreference$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0068a implements Parcelable.Creator {
            C0068a() {
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
            int i10 = parcel.readInt();
            this.f6305a = new HashSet();
            String[] strArr = new String[i10];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f6305a, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6305a.size());
            Set set = this.f6305a;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d0.k.a(context, m.f6425b, R.attr.dialogPreferenceStyle));
    }
}
