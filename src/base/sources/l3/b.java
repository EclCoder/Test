package l3;

import android.os.Bundle;
import android.os.Parcel;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public e a(long j10, byte[] bArr, int i10, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i10, i11);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new e(w1.c.a(new sc.g() { // from class: l3.a
            @Override // sc.g
            public final Object apply(Object obj) {
                return v1.a.b((Bundle) obj);
            }
        }, (ArrayList) w1.a.e(bundle.getParcelableArrayList("c"))), j10, bundle.getLong(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D));
    }
}
