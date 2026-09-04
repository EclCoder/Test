package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.collection.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    final u Q;
    private final Handler R;
    private final List S;
    private boolean T;
    private int U;
    private boolean V;
    private int W;
    private final Runnable X;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.Q.clear();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.Q = new u();
        this.R = new Handler(Looper.getMainLooper());
        this.T = true;
        this.U = 0;
        this.V = false;
        this.W = Integer.MAX_VALUE;
        this.X = new a();
        this.S = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.A0, i10, i11);
        int i12 = s.C0;
        this.T = d0.k.b(typedArrayObtainStyledAttributes, i12, i12, true);
        int i13 = s.B0;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            Z0(d0.k.d(typedArrayObtainStyledAttributes, i13, i13, Integer.MAX_VALUE));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private boolean Y0(Preference preference) {
        boolean zRemove;
        synchronized (this) {
            try {
                preference.Z();
                if (preference.t() == this) {
                    preference.b(null);
                }
                zRemove = this.S.remove(preference);
                if (zRemove) {
                    String strQ = preference.q();
                    if (strQ != null) {
                        this.Q.put(strQ, Long.valueOf(preference.o()));
                        this.R.removeCallbacks(this.X);
                        this.R.post(this.X);
                    }
                    if (this.V) {
                        preference.V();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zRemove;
    }

    @Override // androidx.preference.Preference
    public void N(boolean z10) {
        super.N(z10);
        int iU0 = U0();
        for (int i10 = 0; i10 < iU0; i10++) {
            T0(i10).Y(this, z10);
        }
    }

    public void O0(Preference preference) {
        P0(preference);
    }

    @Override // androidx.preference.Preference
    public void P() {
        super.P();
        this.V = true;
        int iU0 = U0();
        for (int i10 = 0; i10 < iU0; i10++) {
            T0(i10).P();
        }
    }

    public boolean P0(Preference preference) {
        long jF;
        if (this.S.contains(preference)) {
            return true;
        }
        if (preference.q() != null) {
            PreferenceGroup preferenceGroupT = this;
            while (preferenceGroupT.t() != null) {
                preferenceGroupT = preferenceGroupT.t();
            }
            String strQ = preference.q();
            if (preferenceGroupT.Q0(strQ) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + strQ + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.s() == Integer.MAX_VALUE) {
            if (this.T) {
                int i10 = this.U;
                this.U = i10 + 1;
                preference.B0(i10);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).a1(this.T);
            }
        }
        int iBinarySearch = Collections.binarySearch(this.S, preference);
        if (iBinarySearch < 0) {
            iBinarySearch = (iBinarySearch * (-1)) - 1;
        }
        if (!W0(preference)) {
            return false;
        }
        synchronized (this) {
            this.S.add(iBinarySearch, preference);
        }
        j jVarA = A();
        String strQ2 = preference.q();
        if (strQ2 == null || !this.Q.containsKey(strQ2)) {
            jF = jVarA.f();
        } else {
            jF = ((Long) this.Q.get(strQ2)).longValue();
            this.Q.remove(strQ2);
        }
        preference.R(jVarA, jF);
        preference.b(this);
        if (this.V) {
            preference.P();
        }
        O();
        return true;
    }

    public Preference Q0(CharSequence charSequence) {
        Preference preferenceQ0;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(q(), charSequence)) {
            return this;
        }
        int iU0 = U0();
        for (int i10 = 0; i10 < iU0; i10++) {
            Preference preferenceT0 = T0(i10);
            if (TextUtils.equals(preferenceT0.q(), charSequence)) {
                return preferenceT0;
            }
            if ((preferenceT0 instanceof PreferenceGroup) && (preferenceQ0 = ((PreferenceGroup) preferenceT0).Q0(charSequence)) != null) {
                return preferenceQ0;
            }
        }
        return null;
    }

    public int R0() {
        return this.W;
    }

    public b S0() {
        return null;
    }

    public Preference T0(int i10) {
        return (Preference) this.S.get(i10);
    }

    public int U0() {
        return this.S.size();
    }

    @Override // androidx.preference.Preference
    public void V() {
        super.V();
        this.V = false;
        int iU0 = U0();
        for (int i10 = 0; i10 < iU0; i10++) {
            T0(i10).V();
        }
    }

    protected boolean V0() {
        return true;
    }

    protected boolean W0(Preference preference) {
        preference.Y(this, J0());
        return true;
    }

    public boolean X0(Preference preference) {
        boolean zY0 = Y0(preference);
        O();
        return zY0;
    }

    public void Z0(int i10) {
        if (i10 != Integer.MAX_VALUE && !G()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.W = i10;
    }

    @Override // androidx.preference.Preference
    protected void a0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(c.class)) {
            super.a0(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        this.W = cVar.f6335a;
        super.a0(cVar.getSuperState());
    }

    public void a1(boolean z10) {
        this.T = z10;
    }

    @Override // androidx.preference.Preference
    protected Parcelable b0() {
        return new c(super.b0(), this.W);
    }

    void b1() {
        synchronized (this) {
            Collections.sort(this.S);
        }
    }

    @Override // androidx.preference.Preference
    protected void f(Bundle bundle) {
        super.f(bundle);
        int iU0 = U0();
        for (int i10 = 0; i10 < iU0; i10++) {
            T0(i10).f(bundle);
        }
    }

    @Override // androidx.preference.Preference
    protected void g(Bundle bundle) {
        super.g(bundle);
        int iU0 = U0();
        for (int i10 = 0; i10 < iU0; i10++) {
            T0(i10).g(bundle);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c extends Preference.b {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6335a;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        c(Parcel parcel) {
            super(parcel);
            this.f6335a = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6335a);
        }

        c(Parcelable parcelable, int i10) {
            super(parcelable);
            this.f6335a = i10;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
