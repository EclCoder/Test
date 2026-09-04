package l6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import r5.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap f43925a = new ConcurrentHashMap();

    private static PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e10);
            return null;
        }
    }

    private static String b(PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    public static e c(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap concurrentMap = f43925a;
        e eVar = (e) concurrentMap.get(packageName);
        if (eVar != null) {
            return eVar;
        }
        e eVarD = d(context);
        e eVar2 = (e) concurrentMap.putIfAbsent(packageName, eVarD);
        return eVar2 == null ? eVarD : eVar2;
    }

    private static e d(Context context) {
        return new d(b(a(context)));
    }
}
