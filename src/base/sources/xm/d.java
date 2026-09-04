package xm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Intent f56885a = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));

    public static List a(Context context) {
        int i10;
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        Intent intent = f56885a;
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        String str = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 131136)) {
            if (c(resolveInfo)) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(resolveInfo.activityInfo.packageName, 64);
                    if (b(packageManager, resolveInfo.activityInfo.packageName)) {
                        i10 = 1;
                        b bVar = new b(packageInfo, true);
                        if (resolveInfo.activityInfo.packageName.equals(str)) {
                            arrayList.add(0, bVar);
                        } else {
                            arrayList.add(bVar);
                            i10 = 0;
                        }
                    } else {
                        i10 = 0;
                    }
                    b bVar2 = new b(packageInfo, false);
                    if (resolveInfo.activityInfo.packageName.equals(str)) {
                        arrayList.add(i10, bVar2);
                    } else {
                        arrayList.add(bVar2);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return arrayList;
    }

    private static boolean b(PackageManager packageManager, String str) {
        Intent intent = new Intent();
        intent.setAction("android.support.customtabs.action.CustomTabsService");
        intent.setPackage(str);
        return packageManager.resolveService(intent, 0) != null;
    }

    private static boolean c(ResolveInfo resolveInfo) {
        if (!resolveInfo.filter.hasAction("android.intent.action.VIEW") || !resolveInfo.filter.hasCategory("android.intent.category.BROWSABLE") || resolveInfo.filter.schemesIterator() == null || resolveInfo.filter.authoritiesIterator() != null) {
            return false;
        }
        Iterator<String> itSchemesIterator = resolveInfo.filter.schemesIterator();
        boolean zEquals = false;
        boolean zEquals2 = false;
        while (itSchemesIterator.hasNext()) {
            String next = itSchemesIterator.next();
            zEquals |= "http".equals(next);
            zEquals2 |= "https".equals(next);
            if (zEquals && zEquals2) {
                return true;
            }
        }
        return false;
    }

    public static b d(Context context, c cVar) {
        b bVar = null;
        for (b bVar2 : a(context)) {
            if (cVar.a(bVar2)) {
                if (bVar2.f56884d.booleanValue()) {
                    return bVar2;
                }
                if (bVar == null) {
                    bVar = bVar2;
                }
            }
        }
        return bVar;
    }
}
