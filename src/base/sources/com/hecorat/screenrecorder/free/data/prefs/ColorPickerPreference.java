package com.hecorat.screenrecorder.free.data.prefs;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.preference.Preference;
import androidx.preference.l;
import com.hecorat.screenrecorder.free.widget.b;
import wf.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class ColorPickerPreference extends Preference implements Preference.e, c.a {
    private View Q;
    private c R;
    private int S;
    private float T;

    public ColorPickerPreference(Context context) {
        super(context);
        this.S = -16777216;
        this.T = 0.0f;
        P0(context, null);
    }

    private Bitmap O0() {
        int i10 = (int) (this.T * 31.0f);
        int i11 = this.S;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
        int width = bitmapCreateBitmap.getWidth();
        int height = bitmapCreateBitmap.getHeight();
        int i12 = 0;
        while (i12 < width) {
            int i13 = i12;
            while (i13 < height) {
                int i14 = (i12 <= 1 || i13 <= 1 || i12 >= width + (-2) || i13 >= height + (-2)) ? -7829368 : i11;
                bitmapCreateBitmap.setPixel(i12, i13, i14);
                if (i12 != i13) {
                    bitmapCreateBitmap.setPixel(i13, i12, i14);
                }
                i13++;
            }
            i12++;
        }
        return bitmapCreateBitmap;
    }

    private void P0(Context context, AttributeSet attributeSet) {
        this.T = context.getResources().getDisplayMetrics().density;
        A0(this);
    }

    private void Q0() {
        if (this.Q == null) {
            return;
        }
        ImageView imageView = new ImageView(j());
        LinearLayout linearLayout = (LinearLayout) this.Q.findViewById(R.id.widget_frame);
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(0);
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), (int) (this.T * 8.0f), linearLayout.getPaddingBottom());
        int childCount = linearLayout.getChildCount();
        if (childCount > 0) {
            linearLayout.removeViews(0, childCount);
        }
        linearLayout.addView(imageView);
        linearLayout.setMinimumWidth(0);
        imageView.setBackground(new b((int) (this.T * 5.0f)));
        imageView.setImageBitmap(O0());
    }

    private void R0(Bundle bundle) {
        c cVar = new c(j(), this.S, com.hecorat.screenrecorder.free.R.string.color_picker);
        this.R = cVar;
        cVar.C(this);
        this.R.A(true);
        if (bundle != null) {
            this.R.onRestoreInstanceState(bundle);
        }
        this.R.show();
    }

    @Override // androidx.preference.Preference
    public void S(l lVar) {
        super.S(lVar);
        this.Q = lVar.itemView;
        Q0();
    }

    @Override // androidx.preference.Preference
    protected Object W(TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getColor(i10, -16777216));
    }

    @Override // wf.c.a
    public void a(int i10) {
        if (J()) {
            i0(i10);
        }
        this.S = i10;
        Q0();
    }

    @Override // androidx.preference.Preference
    protected void a0(Parcelable parcelable) {
        if (parcelable == null || !(parcelable instanceof a)) {
            super.a0(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.a0(aVar.getSuperState());
        R0(aVar.f22879a);
    }

    @Override // androidx.preference.Preference
    protected Parcelable b0() {
        Parcelable parcelableB0 = super.b0();
        c cVar = this.R;
        if (cVar == null || !cVar.isShowing()) {
            return parcelableB0;
        }
        a aVar = new a(parcelableB0);
        aVar.f22879a = this.R.onSaveInstanceState();
        return aVar;
    }

    @Override // androidx.preference.Preference
    protected void d0(boolean z10, Object obj) {
        this.S = z10 ? w(this.S) : ((Integer) obj).intValue();
        Q0();
    }

    @Override // androidx.preference.Preference.e
    public boolean l(Preference preference) {
        R0(null);
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0336a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Bundle f22879a;

        /* JADX INFO: renamed from: com.hecorat.screenrecorder.free.data.prefs.ColorPickerPreference$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0336a implements Parcelable.Creator {
            C0336a() {
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

        public a(Parcel parcel) {
            super(parcel);
            this.f22879a = parcel.readBundle(getClass().getClassLoader());
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.f22879a);
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ColorPickerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.S = -16777216;
        this.T = 0.0f;
        P0(context, attributeSet);
    }

    public ColorPickerPreference(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.S = -16777216;
        this.T = 0.0f;
        P0(context, attributeSet);
    }
}
