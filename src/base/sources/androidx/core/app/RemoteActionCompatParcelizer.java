package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f3260a = (IconCompat) versionedParcel.v(remoteActionCompat.f3260a, 1);
        remoteActionCompat.f3261b = versionedParcel.l(remoteActionCompat.f3261b, 2);
        remoteActionCompat.f3262c = versionedParcel.l(remoteActionCompat.f3262c, 3);
        remoteActionCompat.f3263d = (PendingIntent) versionedParcel.r(remoteActionCompat.f3263d, 4);
        remoteActionCompat.f3264e = versionedParcel.h(remoteActionCompat.f3264e, 5);
        remoteActionCompat.f3265f = versionedParcel.h(remoteActionCompat.f3265f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.M(remoteActionCompat.f3260a, 1);
        versionedParcel.D(remoteActionCompat.f3261b, 2);
        versionedParcel.D(remoteActionCompat.f3262c, 3);
        versionedParcel.H(remoteActionCompat.f3263d, 4);
        versionedParcel.z(remoteActionCompat.f3264e, 5);
        versionedParcel.z(remoteActionCompat.f3265f, 6);
    }
}
