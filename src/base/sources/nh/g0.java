package nh;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class g0 {
    public static void a(lg.a aVar, Context context, MediaScannerConnection.OnScanCompletedListener onScanCompletedListener) {
        ArrayList arrayList = new ArrayList();
        File file = new File(pf.a.f50027b);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(pf.a.f50026a);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        c(context, arrayList, true);
        c(context, arrayList, false);
        if (arrayList.isEmpty()) {
            onScanCompletedListener.onScanCompleted(null, null);
        } else {
            MediaScannerConnection.scanFile(context, (String[]) arrayList.toArray(new String[0]), null, onScanCompletedListener);
        }
    }

    private static boolean b(File file, String str, String str2, List list) {
        String absolutePath = file.getAbsolutePath();
        String str3 = str2 + File.separator + str;
        wp.a.a("Before rename old path %s to new path %s", absolutePath, str3);
        boolean zRenameTo = file.renameTo(new File(str3));
        if (zRenameTo) {
            list.add(absolutePath);
            list.add(str3);
        }
        wp.a.a("After rename old path %s to new path %s, result: %s", absolutePath, str3, Boolean.valueOf(zRenameTo));
        return zRenameTo;
    }

    private static void c(Context context, List list, boolean z10) {
        String strP;
        String str;
        String str2;
        if (z10) {
            str = pf.a.f50030e;
            str2 = pf.a.f50027b;
            strP = pf.a.f50026a;
        } else {
            String strK = e.k(context);
            String strP2 = e.p(context, Environment.DIRECTORY_PICTURES);
            strP = e.p(context, Environment.DIRECTORY_MOVIES);
            str = strK;
            str2 = strP2;
        }
        if (str == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str3 = File.separator;
        sb2.append(str3);
        sb2.append("AzScreenShots");
        d(sb2.toString(), str2, list);
        d(str + str3 + "AzImageEdit", str2, list);
        d(str + str3 + "AzGif", str2, list);
        d(str + str3 + "AzVideoEdit", strP, list);
        d(str, strP, list);
    }

    private static void d(String str, String str2, List list) {
        File file = new File(str);
        File[] fileArrListFiles = file.listFiles();
        boolean z10 = true;
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            boolean z11 = true;
            for (File file2 : fileArrListFiles) {
                z11 = z11 && b(file2, file2.getName(), str2, list);
            }
            z10 = z11;
        }
        if (file.exists() && z10) {
            file.delete();
        }
    }
}
