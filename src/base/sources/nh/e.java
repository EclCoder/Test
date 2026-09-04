package nh;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.os.StatFs;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.hecorat.screenrecorder.free.R;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class e {
    public static void b(Context context, String str, String str2) {
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
            while (true) {
                int i10 = inputStreamOpen.read(bArr);
                if (i10 == -1) {
                    inputStreamOpen.close();
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, i10);
            }
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    public static String c(long j10) {
        float f10 = j10 / 1024;
        float f11 = j10 / 1048576;
        float f12 = j10 / 1073741824;
        Locale localeE = l0.e();
        if (f12 >= 1.0f) {
            return String.format(localeE, "%.1f", Float.valueOf(f12)) + "Gb";
        }
        if (f11 >= 1.0f) {
            return String.format(localeE, "%.1f", Float.valueOf(f11)) + "Mb";
        }
        return String.format(localeE, "%.1f", Float.valueOf(f10)) + "Kb";
    }

    public static String d(String str) {
        String str2 = "az_recorder_" + new SimpleDateFormat("yyyyMMdd_HHmmss", l0.e()).format(Calendar.getInstance().getTime());
        if (str == null) {
            return str2;
        }
        return str2 + str;
    }

    public static long e(lg.a aVar, Context context) {
        return aVar.b(R.string.pref_use_internal_storage, true) ? g() : o(context);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    public static String f(Context context, lg.a aVar) {
        String strP;
        boolean z10 = true;
        boolean zB = aVar.b(R.string.pref_use_internal_storage, true);
        if (!zB) {
            strP = p(context, Environment.DIRECTORY_PICTURES);
            if (strP == null) {
                aVar.j(R.string.pref_use_internal_storage, true);
                strP = pf.a.f50027b;
            }
            if (z10) {
                new File(strP).mkdirs();
            }
            return strP;
        }
        strP = pf.a.f50027b;
        z10 = zB;
        if (z10) {
            new File(strP).mkdirs();
        }
        return strP;
    }

    public static long g() {
        if (Environment.getExternalStorageState().equals("mounted")) {
            return new StatFs(Environment.getExternalStorageDirectory().getPath()).getAvailableBytes() / 1048576;
        }
        return -1L;
    }

    public static long h() {
        if (Environment.getExternalStorageState().equals("mounted")) {
            return new StatFs(Environment.getExternalStorageDirectory().getPath()).getTotalBytes() / 1048576;
        }
        return -1L;
    }

    public static String i(Context context, String str) {
        String str2;
        if (Objects.equals(str, "video/*")) {
            str2 = MimeTypes.BASE_TYPE_VIDEO;
        } else {
            str2 = Objects.equals(str, "image/*") ? "image" : "gif";
        }
        return context.getString(R.string.prefix_pref_shared_packages) + str2;
    }

    public static String j(lg.a aVar, long j10) {
        int i10;
        int iY = Integer.parseInt(aVar.h(R.string.pref_bitrate, MBridgeConstans.ENDCARD_URL_TYPE_PL));
        if (iY == 0) {
            try {
                i10 = Integer.parseInt(aVar.h(R.string.pref_resolution, "720"));
            } catch (Exception unused) {
                int i11 = Integer.parseInt("720");
                aVar.m(R.string.pref_resolution, "720");
                aVar.m(R.string.pref_countdown, "3");
                i10 = i11;
            }
            iY = f0.y(i10);
        }
        long j11 = ((j10 * 8388608) - 104857600) / ((long) iY);
        if (j11 < 0) {
            j11 = 0;
        }
        long j12 = j11 / 3600;
        long j13 = (j11 / 60) % 60;
        long j14 = j11 % 60;
        StringBuilder sb2 = new StringBuilder();
        if (j12 > 0) {
            if (j12 < 10) {
                sb2.append('0');
            }
            sb2.append(j12);
            sb2.append(":");
        }
        if (j13 < 10) {
            sb2.append('0');
        }
        sb2.append(j13);
        sb2.append(':');
        if (j14 < 10) {
            sb2.append('0');
        }
        sb2.append(j14);
        return sb2.toString();
    }

    public static String k(Context context) {
        File fileN = n(context.getExternalFilesDirs(Environment.DIRECTORY_MOVIES));
        if (fileN == null) {
            return null;
        }
        return fileN.getAbsolutePath();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    public static String l(Context context, lg.a aVar) {
        String strP;
        boolean z10 = true;
        boolean zB = aVar.b(R.string.pref_use_internal_storage, true);
        if (!zB) {
            strP = p(context, Environment.DIRECTORY_MOVIES);
            if (strP == null) {
                aVar.j(R.string.pref_use_internal_storage, true);
                strP = pf.a.f50026a;
            }
            if (z10) {
                new File(strP).mkdirs();
            }
            return strP;
        }
        strP = pf.a.f50026a;
        z10 = zB;
        if (z10) {
            new File(strP).mkdirs();
        }
        return strP;
    }

    public static String m(Context context) {
        File[] fileArrListFiles;
        String str = context.getCacheDir() + File.separator + ".AzEditor";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
            return str;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
        return str;
    }

    private static File n(File[] fileArr) {
        if (fileArr == null) {
            return null;
        }
        for (File file : fileArr) {
            if (file != null && file.exists()) {
                try {
                    if (Environment.isExternalStorageRemovable(file)) {
                        return file;
                    }
                } catch (Exception e10) {
                    wp.a.e(e10);
                    com.google.firebase.crashlytics.a.b().d(e10);
                }
            }
        }
        return null;
    }

    public static long o(Context context) {
        String strQ = q(context);
        if (strQ == null || strQ.length() <= 0) {
            return -1L;
        }
        return new StatFs(strQ).getAvailableBytes() / 1048576;
    }

    public static String p(Context context, String str) {
        File fileN = n(context.getExternalMediaDirs());
        if (fileN == null) {
            return null;
        }
        String str2 = fileN.getAbsolutePath() + File.separator + str;
        new File(str2).mkdirs();
        return str2;
    }

    public static String q(Context context) {
        String absolutePath;
        int iIndexOf;
        File fileN = n(context.getExternalMediaDirs());
        if (fileN == null || (iIndexOf = (absolutePath = fileN.getAbsolutePath()).indexOf("Android/media")) <= 1) {
            return null;
        }
        return absolutePath.substring(0, iIndexOf - 1);
    }

    public static long r(Context context) {
        String strQ = q(context);
        if (strQ == null || strQ.length() <= 0) {
            return -1L;
        }
        return new StatFs(strQ).getTotalBytes() / 1048576;
    }

    public static List s(Context context, String str) {
        int i10;
        JSONArray jSONArrayT = t(context, str);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(str);
        intent.addFlags(1);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList3 = new ArrayList();
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            Drawable drawableLoadIcon = activityInfo.loadIcon(packageManager);
            String string = activityInfo.loadLabel(packageManager).toString();
            String str2 = activityInfo.packageName;
            String str3 = activityInfo.name;
            int i11 = 0;
            while (true) {
                try {
                    if (i11 >= jSONArrayT.length()) {
                        i11 = -1;
                        break;
                    }
                    JSONObject jSONObject = jSONArrayT.getJSONObject(i11);
                    if (jSONObject.getString("package").equals(str2) && jSONObject.getString("activity").equals(str3)) {
                        break;
                    }
                    i11++;
                } catch (JSONException e10) {
                    wp.a.e(e10);
                    com.google.firebase.crashlytics.a.b().d(e10);
                    i10 = -1;
                }
            }
            i10 = i11;
            tg.c cVar = new tg.c(string, str2, str3, drawableLoadIcon, i10);
            if (str2.equals("com.google.android.youtube")) {
                arrayList3.add(cVar);
            } else if (i10 == -1) {
                arrayList2.add(cVar);
            } else {
                arrayList.add(cVar);
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: nh.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((tg.c) obj2).e(), ((tg.c) obj).e());
            }
        });
        ArrayList arrayList4 = new ArrayList(arrayList);
        arrayList4.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            arrayList4.addAll(0, arrayList3);
        }
        int size = arrayList4.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList4.get(i12);
            i12++;
            tg.c cVar2 = (tg.c) obj;
            wp.a.g(cVar2.d() + " --- " + cVar2.a() + " --- " + cVar2.c(), new Object[0]);
        }
        return arrayList4;
    }

    public static JSONArray t(Context context, String str) {
        String string = androidx.preference.j.b(context).getString(i(context, str), "[]");
        JSONArray jSONArray = new JSONArray();
        if (!string.isEmpty()) {
            try {
                return new JSONArray(string);
            } catch (JSONException e10) {
                wp.a.e(e10);
                com.google.firebase.crashlytics.a.b().d(e10);
            }
        }
        return jSONArray;
    }

    public static String u(long j10) {
        return String.format(Locale.US, "%.2f", Double.valueOf(j10 / 1024.0d));
    }

    public static long v(lg.a aVar, Context context) {
        return aVar.b(R.string.pref_use_internal_storage, true) ? h() : r(context);
    }

    public static boolean w(Context context) {
        return q(context) != null;
    }

    public static boolean x(String str) {
        return !str.isEmpty() && str.equals(str.replaceAll("[\\\\/:*?\"<>|]", " "));
    }

    public static void y(Context context, String str, tg.c cVar) {
        try {
            JSONArray jSONArrayT = t(context, str);
            for (int i10 = 0; i10 < jSONArrayT.length(); i10++) {
                JSONObject jSONObject = jSONArrayT.getJSONObject(i10);
                if (jSONObject.getString("package").equals(cVar.d()) && jSONObject.getString("activity").equals(cVar.a())) {
                    jSONArrayT.remove(i10);
                    jSONArrayT.put(0, jSONObject);
                    androidx.preference.j.b(context).edit().putString(i(context, str), jSONArrayT.toString()).apply();
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("package", cVar.d());
            jSONObject2.put("activity", cVar.a());
            jSONArrayT.put(jSONObject2);
            androidx.preference.j.b(context).edit().putString(i(context, str), jSONArrayT.toString()).apply();
        } catch (JSONException e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }
}
