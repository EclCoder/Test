package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3336a = versionedParcel.p(iconCompat.f3336a, 1);
        iconCompat.f3338c = versionedParcel.j(iconCompat.f3338c, 2);
        iconCompat.f3339d = versionedParcel.r(iconCompat.f3339d, 3);
        iconCompat.f3340e = versionedParcel.p(iconCompat.f3340e, 4);
        iconCompat.f3341f = versionedParcel.p(iconCompat.f3341f, 5);
        iconCompat.f3342g = (ColorStateList) versionedParcel.r(iconCompat.f3342g, 6);
        iconCompat.f3344i = versionedParcel.t(iconCompat.f3344i, 7);
        iconCompat.f3345j = versionedParcel.t(iconCompat.f3345j, 8);
        iconCompat.p();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(true, true);
        iconCompat.q(versionedParcel.f());
        int i10 = iconCompat.f3336a;
        if (-1 != i10) {
            versionedParcel.F(i10, 1);
        }
        byte[] bArr = iconCompat.f3338c;
        if (bArr != null) {
            versionedParcel.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f3339d;
        if (parcelable != null) {
            versionedParcel.H(parcelable, 3);
        }
        int i11 = iconCompat.f3340e;
        if (i11 != 0) {
            versionedParcel.F(i11, 4);
        }
        int i12 = iconCompat.f3341f;
        if (i12 != 0) {
            versionedParcel.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f3342g;
        if (colorStateList != null) {
            versionedParcel.H(colorStateList, 6);
        }
        String str = iconCompat.f3344i;
        if (str != null) {
            versionedParcel.J(str, 7);
        }
        String str2 = iconCompat.f3345j;
        if (str2 != null) {
            versionedParcel.J(str2, 8);
        }
    }
}
