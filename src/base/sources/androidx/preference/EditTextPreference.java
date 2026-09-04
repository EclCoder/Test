package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    private String W;
    private a X;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(EditText editText);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements Preference.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static c f6301a;

        private c() {
        }

        public static c b() {
            if (f6301a == null) {
                f6301a = new c();
            }
            return f6301a;
        }

        @Override // androidx.preference.Preference.g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.V0()) ? editTextPreference.j().getString(q.f6449c) : editTextPreference.V0();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f6507w, i10, i11);
        int i12 = s.f6509x;
        if (d0.k.b(typedArrayObtainStyledAttributes, i12, i12, false)) {
            E0(c.b());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public boolean J0() {
        return TextUtils.isEmpty(this.W) || super.J0();
    }

    a U0() {
        return this.X;
    }

    public String V0() {
        return this.W;
    }

    @Override // androidx.preference.Preference
    protected Object W(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    public void W0(a aVar) {
        this.X = aVar;
    }

    public void X0(String str) {
        boolean zJ0 = J0();
        this.W = str;
        j0(str);
        boolean zJ1 = J0();
        if (zJ1 != zJ0) {
            N(zJ1);
        }
        M();
    }

    @Override // androidx.preference.Preference
    protected void a0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(b.class)) {
            super.a0(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.a0(bVar.getSuperState());
        X0(bVar.f6300a);
    }

    @Override // androidx.preference.Preference
    protected Parcelable b0() {
        Parcelable parcelableB0 = super.b0();
        if (J()) {
            return parcelableB0;
        }
        b bVar = new b(parcelableB0);
        bVar.f6300a = V0();
        return bVar;
    }

    @Override // androidx.preference.Preference
    protected void c0(Object obj) {
        X0(x((String) obj));
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b extends Preference.b {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f6300a;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        b(Parcel parcel) {
            super(parcel);
            this.f6300a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f6300a);
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d0.k.a(context, m.f6427d, R.attr.editTextPreferenceStyle));
    }
}
