package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f3300a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f3301b = new Object();

    private static x a(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            int size = stringArrayList.size();
            int i10 = 0;
            while (i10 < size) {
                String str = stringArrayList.get(i10);
                i10++;
                hashSet.add(str);
            }
        }
        return new x(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), hashSet);
    }

    private static x[] b(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        x[] xVarArr = new x[bundleArr.length];
        for (int i10 = 0; i10 < bundleArr.length; i10++) {
            xVarArr[i10] = a(bundleArr[i10]);
        }
        return xVarArr;
    }

    static NotificationCompat.b c(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        return new NotificationCompat.b(bundle.getInt(RewardPlus.ICON), bundle.getCharSequence(CampaignEx.JSON_KEY_TITLE), (PendingIntent) bundle.getParcelable("actionIntent"), bundle.getBundle("extras"), b(d(bundle, "remoteInputs")), b(d(bundle, "dataOnlyRemoteInputs")), bundle2 != null ? bundle2.getBoolean("android.support.allowGeneratedReplies", false) : false, bundle.getInt("semanticAction"), bundle.getBoolean("showsUserInterface"), false, false);
    }

    private static Bundle[] d(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    static Bundle e(NotificationCompat.b bVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = bVar.d();
        bundle.putInt(RewardPlus.ICON, iconCompatD != null ? iconCompatD.k() : 0);
        bundle.putCharSequence(CampaignEx.JSON_KEY_TITLE, bVar.h());
        bundle.putParcelable("actionIntent", bVar.a());
        Bundle bundle2 = bVar.c() != null ? new Bundle(bVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", bVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", g(bVar.e()));
        bundle.putBoolean("showsUserInterface", bVar.g());
        bundle.putInt("semanticAction", bVar.f());
        return bundle;
    }

    private static Bundle f(x xVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", xVar.i());
        bundle.putCharSequence("label", xVar.h());
        bundle.putCharSequenceArray("choices", xVar.e());
        bundle.putBoolean("allowFreeFormInput", xVar.c());
        bundle.putBundle("extras", xVar.g());
        Set setD = xVar.d();
        if (setD != null && !setD.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setD.size());
            Iterator it = setD.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] g(x[] xVarArr) {
        if (xVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[xVarArr.length];
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            bundleArr[i10] = f(xVarArr[i10]);
        }
        return bundleArr;
    }
}
