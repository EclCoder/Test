package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    int Q;
    int R;
    private int S;
    private int T;
    boolean U;
    SeekBar V;
    private TextView W;
    boolean X;
    private boolean Y;
    boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final SeekBar.OnSeekBarChangeListener f6336a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final View.OnKeyListener f6337b0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.Z || !seekBarPreference.U) {
                    seekBarPreference.S0(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.T0(i10 + seekBarPreference2.R);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.U = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.U = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.R != seekBarPreference.Q) {
                seekBarPreference.S0(seekBar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements View.OnKeyListener {
        b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.X && (i10 == 21 || i10 == 22)) || i10 == 23 || i10 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.V;
            if (seekBar != null) {
                return seekBar.onKeyDown(i10, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f6336a0 = new a();
        this.f6337b0 = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.H0, i10, i11);
        this.R = typedArrayObtainStyledAttributes.getInt(s.K0, 0);
        O0(typedArrayObtainStyledAttributes.getInt(s.I0, 100));
        P0(typedArrayObtainStyledAttributes.getInt(s.L0, 0));
        this.X = typedArrayObtainStyledAttributes.getBoolean(s.J0, true);
        this.Y = typedArrayObtainStyledAttributes.getBoolean(s.M0, false);
        this.Z = typedArrayObtainStyledAttributes.getBoolean(s.N0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void R0(int i10, boolean z10) {
        int i11 = this.R;
        if (i10 < i11) {
            i10 = i11;
        }
        int i12 = this.S;
        if (i10 > i12) {
            i10 = i12;
        }
        if (i10 != this.Q) {
            this.Q = i10;
            T0(i10);
            i0(i10);
            if (z10) {
                M();
            }
        }
    }

    public final void O0(int i10) {
        int i11 = this.R;
        if (i10 < i11) {
            i10 = i11;
        }
        if (i10 != this.S) {
            this.S = i10;
            M();
        }
    }

    public final void P0(int i10) {
        if (i10 != this.T) {
            this.T = Math.min(this.S - this.R, Math.abs(i10));
            M();
        }
    }

    public void Q0(int i10) {
        R0(i10, true);
    }

    @Override // androidx.preference.Preference
    public void S(l lVar) {
        super.S(lVar);
        lVar.itemView.setOnKeyListener(this.f6337b0);
        this.V = (SeekBar) lVar.b(o.f6439c);
        TextView textView = (TextView) lVar.b(o.f6440d);
        this.W = textView;
        if (this.Y) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.W = null;
        }
        SeekBar seekBar = this.V;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f6336a0);
        this.V.setMax(this.S - this.R);
        int i10 = this.T;
        if (i10 != 0) {
            this.V.setKeyProgressIncrement(i10);
        } else {
            this.T = this.V.getKeyProgressIncrement();
        }
        this.V.setProgress(this.Q - this.R);
        T0(this.Q);
        this.V.setEnabled(I());
    }

    void S0(SeekBar seekBar) {
        int progress = this.R + seekBar.getProgress();
        if (progress != this.Q) {
            if (c(Integer.valueOf(progress))) {
                R0(progress, false);
            } else {
                seekBar.setProgress(this.Q - this.R);
                T0(this.Q);
            }
        }
    }

    void T0(int i10) {
        TextView textView = this.W;
        if (textView != null) {
            textView.setText(String.valueOf(i10));
        }
    }

    @Override // androidx.preference.Preference
    protected Object W(TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getInt(i10, 0));
    }

    @Override // androidx.preference.Preference
    protected void a0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(c.class)) {
            super.a0(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.a0(cVar.getSuperState());
        this.Q = cVar.f6340a;
        this.R = cVar.f6341b;
        this.S = cVar.f6342c;
        M();
    }

    @Override // androidx.preference.Preference
    protected Parcelable b0() {
        Parcelable parcelableB0 = super.b0();
        if (J()) {
            return parcelableB0;
        }
        c cVar = new c(parcelableB0);
        cVar.f6340a = this.Q;
        cVar.f6341b = this.R;
        cVar.f6342c = this.S;
        return cVar;
    }

    @Override // androidx.preference.Preference
    protected void c0(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        Q0(w(((Integer) obj).intValue()));
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c extends Preference.b {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f6342c;

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
            this.f6340a = parcel.readInt();
            this.f6341b = parcel.readInt();
            this.f6342c = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6340a);
            parcel.writeInt(this.f6341b);
            parcel.writeInt(this.f6342c);
        }

        c(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m.f6433j);
    }
}
