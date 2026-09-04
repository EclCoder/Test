package pl.droidsonroids.gif;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
class e extends View.BaseSavedState {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long[][] f50231a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    /* synthetic */ e(Parcel parcel, a aVar) {
        this(parcel);
    }

    void a(Drawable drawable, int i10) {
        long[] jArr = this.f50231a[i10];
        if (jArr == null || !(drawable instanceof b)) {
            return;
        }
        b bVar = (b) drawable;
        bVar.j(bVar.f50191g.v(jArr, bVar.f50190f));
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f50231a.length);
        for (long[] jArr : this.f50231a) {
            parcel.writeLongArray(jArr);
        }
    }

    e(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        this.f50231a = new long[drawableArr.length][];
        for (int i10 = 0; i10 < drawableArr.length; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable instanceof b) {
                this.f50231a[i10] = ((b) drawable).f50191g.k();
            } else {
                this.f50231a[i10] = null;
            }
        }
    }

    private e(Parcel parcel) {
        super(parcel);
        this.f50231a = new long[parcel.readInt()][];
        int i10 = 0;
        while (true) {
            long[][] jArr = this.f50231a;
            if (i10 >= jArr.length) {
                return;
            }
            jArr[i10] = parcel.createLongArray();
            i10++;
        }
    }

    e(Parcelable parcelable, long[] jArr) {
        super(parcelable);
        this.f50231a = new long[][]{jArr};
    }
}
