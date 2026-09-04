package vh;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
abstract class l {
    static boolean a(Activity activity, boolean z10) {
        if (activity == null) {
            if (z10) {
                throw new IllegalArgumentException("The instance of the context must be an activity object");
            }
            return false;
        }
        if (activity.isFinishing()) {
            if (z10) {
                throw new IllegalStateException("The activity has been finishing, please manually determine the status of the activity");
            }
            return false;
        }
        if (!c.g() || !activity.isDestroyed()) {
            return true;
        }
        if (z10) {
            throw new IllegalStateException("The activity has been destroyed, please manually determine the status of the activity");
        }
        return false;
    }

    static void c(List list) {
        if (e0.f(list, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            if (e0.f(list, "android.permission.ACCESS_COARSE_LOCATION") && !e0.f(list, "android.permission.ACCESS_FINE_LOCATION")) {
                throw new IllegalArgumentException("Applying for background positioning permissions must include android.permission.ACCESS_FINE_LOCATION");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!e0.g(str, "android.permission.ACCESS_FINE_LOCATION") && !e0.g(str, "android.permission.ACCESS_COARSE_LOCATION") && !e0.g(str, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    throw new IllegalArgumentException("Because it includes background location permissions, do not apply for permissions unrelated to location");
                }
            }
        }
    }

    static void d(List list, String str) {
        e(list, str, Integer.MAX_VALUE);
    }

    static void e(List list, String str, int i10) {
        a.c cVar;
        String str2;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                cVar = null;
                break;
            }
            cVar = (a.c) it.next();
        } while (!TextUtils.equals(cVar.f55569a, str));
        if (cVar == null) {
            throw new IllegalStateException("Please register permissions in the AndroidManifest.xml file <uses-permission android:name=\"" + str + "\" />");
        }
        int i11 = cVar.f55570b;
        if (i11 < i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The AndroidManifest.xml file <uses-permission android:name=\"");
            sb2.append(str);
            sb2.append("\" android:maxSdkVersion=\"");
            sb2.append(i11);
            sb2.append("\" /> does not meet the requirements, ");
            if (i10 != Integer.MAX_VALUE) {
                str2 = "the minimum requirement for maxSdkVersion is " + i10;
            } else {
                str2 = "please delete the android:maxSdkVersion=\"" + i11 + "\" attribute";
            }
            sb2.append(str2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    static void f(Context context, List list, a aVar) {
        int i10;
        if (aVar == null) {
            return;
        }
        List list2 = aVar.f55561c;
        if (list2.isEmpty()) {
            throw new IllegalStateException("No permissions are registered in the AndroidManifest.xml file");
        }
        if (c.m()) {
            i10 = context.getApplicationInfo().minSdkVersion;
        } else {
            a.e eVar = aVar.f55560b;
            i10 = eVar != null ? eVar.f55574a : 23;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!e0.g(str, "android.permission.NOTIFICATION_SERVICE") && !e0.g(str, "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE") && !e0.g(str, "android.permission.BIND_VPN_SERVICE") && !e0.g(str, "android.permission.PICTURE_IN_PICTURE")) {
                d(list2, str);
                if (e0.g(str, "android.permission.BODY_SENSORS_BACKGROUND")) {
                    d(list2, "android.permission.BODY_SENSORS");
                } else if (!e0.g(str, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    if (i10 < 33) {
                        if (e0.g(str, "android.permission.READ_MEDIA_IMAGES") || e0.g(str, "android.permission.READ_MEDIA_VIDEO") || e0.g(str, "android.permission.READ_MEDIA_AUDIO")) {
                            e(list2, "android.permission.READ_EXTERNAL_STORAGE", 32);
                        } else if (e0.g(str, "android.permission.NEARBY_WIFI_DEVICES")) {
                            e(list2, "android.permission.ACCESS_FINE_LOCATION", 32);
                        }
                    }
                    if (i10 < 31) {
                        if (e0.g(str, "android.permission.BLUETOOTH_SCAN")) {
                            e(list2, "android.permission.BLUETOOTH_ADMIN", 30);
                            e(list2, "android.permission.ACCESS_FINE_LOCATION", 30);
                        } else if (e0.g(str, "android.permission.BLUETOOTH_CONNECT")) {
                            e(list2, "android.permission.BLUETOOTH", 30);
                        } else if (e0.g(str, "android.permission.BLUETOOTH_ADVERTISE")) {
                            e(list2, "android.permission.BLUETOOTH_ADMIN", 30);
                        }
                    }
                    if (i10 < 30 && e0.g(str, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                        e(list2, "android.permission.READ_EXTERNAL_STORAGE", 29);
                        e(list2, "android.permission.WRITE_EXTERNAL_STORAGE", 29);
                    } else if (i10 < 26 && e0.g(str, "android.permission.READ_PHONE_NUMBERS")) {
                        e(list2, "android.permission.READ_PHONE_STATE", 25);
                    } else if (e0.g(str, "com.android.permission.GET_INSTALLED_APPS")) {
                        d(list2, "android.permission.QUERY_ALL_PACKAGES");
                    }
                } else if (c.b(context) >= 31) {
                    e(list2, "android.permission.ACCESS_FINE_LOCATION", 30);
                    d(list2, "android.permission.ACCESS_COARSE_LOCATION");
                } else {
                    d(list2, "android.permission.ACCESS_FINE_LOCATION");
                }
            }
        }
    }

    static void g(Context context, List list) {
        if (e0.f(list, "android.permission.ACCESS_MEDIA_LOCATION")) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!e0.g(str, "android.permission.ACCESS_MEDIA_LOCATION") && !e0.g(str, "android.permission.READ_MEDIA_IMAGES") && !e0.g(str, "android.permission.READ_EXTERNAL_STORAGE") && !e0.g(str, "android.permission.WRITE_EXTERNAL_STORAGE") && !e0.g(str, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    throw new IllegalArgumentException("Because it includes access media location permissions, do not apply for permissions unrelated to access media location");
                }
            }
            if (c.b(context) >= 33) {
                if (!e0.f(list, "android.permission.READ_MEDIA_IMAGES") && !e0.f(list, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    throw new IllegalArgumentException("You must add android.permission.READ_MEDIA_IMAGES or android.permission.MANAGE_EXTERNAL_STORAGE rights to apply for android.permission.ACCESS_MEDIA_LOCATION rights");
                }
            } else if (!e0.f(list, "android.permission.READ_EXTERNAL_STORAGE") && !e0.f(list, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                throw new IllegalArgumentException("You must add android.permission.READ_EXTERNAL_STORAGE or android.permission.MANAGE_EXTERNAL_STORAGE rights to apply for android.permission.ACCESS_MEDIA_LOCATION rights");
            }
        }
    }

    static void h(List list, a aVar) {
        if ((!e0.f(list, "android.permission.BLUETOOTH_SCAN") && !e0.f(list, "android.permission.NEARBY_WIFI_DEVICES")) || e0.f(list, "android.permission.ACCESS_FINE_LOCATION") || aVar == null) {
            return;
        }
        for (a.c cVar : aVar.f55561c) {
            if (e0.g(cVar.f55569a, "android.permission.BLUETOOTH_SCAN") || e0.g(cVar.f55569a, "android.permission.NEARBY_WIFI_DEVICES")) {
                if (!cVar.a()) {
                    String str = cVar.f55570b != Integer.MAX_VALUE ? "android:maxSdkVersion=\"" + cVar.f55570b + "\" " : "";
                    throw new IllegalArgumentException("If your app doesn't use " + cVar.f55569a + " to get physical location, please change the <uses-permission android:name=\"" + cVar.f55569a + "\" " + str + "/> node in the manifest file to <uses-permission android:name=\"" + cVar.f55569a + "\" android:usesPermissionFlags=\"neverForLocation\" " + str + "/> node, if your app need use " + cVar.f55569a + " to get physical location, also need to add android.permission.ACCESS_FINE_LOCATION permissions");
                }
            }
        }
    }

    static void i(List list, a aVar) {
        if (e0.f(list, "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE") && aVar != null) {
            List list2 = aVar.f55564f;
            for (int i10 = 0; i10 < list2.size(); i10++) {
                if (TextUtils.equals(((a.d) list2.get(i10)).f55573b, "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE")) {
                    return;
                }
            }
            throw new IllegalArgumentException("No service registered permission attribute, please register <service android:permission=\"android.permission.BIND_NOTIFICATION_LISTENER_SERVICE\" > in AndroidManifest.xml");
        }
    }

    static boolean j(List list, boolean z10) {
        if (list == null || list.isEmpty()) {
            if (z10) {
                throw new IllegalArgumentException("The requested permission cannot be empty");
            }
            return false;
        }
        if (c.a() <= 33 && z10) {
            ArrayList arrayList = new ArrayList();
            Field[] declaredFields = j.class.getDeclaredFields();
            if (declaredFields.length == 0) {
                return true;
            }
            for (Field field : declaredFields) {
                if (String.class.equals(field.getType())) {
                    try {
                        arrayList.add((String) field.get(null));
                    } catch (IllegalAccessException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!e0.f(arrayList, str)) {
                    throw new IllegalArgumentException("The " + str + " is not a dangerous permission or special permission, please do not request dynamically");
                }
            }
        }
        return true;
    }

    static void k(Activity activity, List list, a aVar) {
        if (e0.f(list, "android.permission.PICTURE_IN_PICTURE") && aVar != null) {
            List list2 = aVar.f55563e;
            for (int i10 = 0; i10 < list2.size(); i10++) {
                if (((a.C0840a) list2.get(i10)).f55566b) {
                    return;
                }
            }
            throw new IllegalArgumentException("No activity registered supportsPictureInPicture attribute, please register \n<activity android:name=\"" + activity.getClass().getName().replace(activity.getPackageName(), "") + "\" android:supportsPictureInPicture=\"true\" > in AndroidManifest.xml");
        }
    }

    static void l(Context context, List list, a aVar) {
        a.b bVar;
        if (e0.f(list, "android.permission.READ_MEDIA_IMAGES") || e0.f(list, "android.permission.READ_MEDIA_VIDEO") || e0.f(list, "android.permission.READ_MEDIA_AUDIO") || e0.f(list, "android.permission.MANAGE_EXTERNAL_STORAGE") || e0.f(list, "android.permission.READ_EXTERNAL_STORAGE") || e0.f(list, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            if (c.b(context) >= 33 && e0.f(list, "android.permission.READ_EXTERNAL_STORAGE")) {
                throw new IllegalArgumentException("When targetSdkVersion >= 33 should use android.permission.READ_MEDIA_IMAGES, android.permission.READ_MEDIA_VIDEO, android.permission.READ_MEDIA_AUDIO instead of android.permission.READ_EXTERNAL_STORAGE");
            }
            if (e0.f(list, "android.permission.READ_MEDIA_IMAGES") || e0.f(list, "android.permission.ACCESS_MEDIA_LOCATION") || aVar == null || (bVar = aVar.f55562d) == null) {
                return;
            }
            boolean zO = e0.o(context);
            int iB = c.b(context);
            boolean z10 = bVar.f55568b;
            if (iB >= 29 && !z10 && (e0.f(list, "android.permission.MANAGE_EXTERNAL_STORAGE") || !zO)) {
                throw new IllegalStateException("Please register the android:requestLegacyExternalStorage=\"true\" attribute in the AndroidManifest.xml file, otherwise it will cause incompatibility with the old version");
            }
            if (iB >= 30 && !e0.f(list, "android.permission.MANAGE_EXTERNAL_STORAGE") && !zO) {
                throw new IllegalArgumentException("The storage permission application is abnormal. If you have adapted the scope storage, please register the <meta-data android:name=\"ScopedStorage\" android:value=\"true\" /> attribute in the AndroidManifest.xml file. If there is no adaptation scope storage, please use android.permission.MANAGE_EXTERNAL_STORAGE to apply for permission");
            }
        }
    }

    static void m(Context context, List list) {
        int i10;
        if (e0.f(list, "android.permission.POST_NOTIFICATIONS") || e0.f(list, "android.permission.NEARBY_WIFI_DEVICES") || e0.f(list, "android.permission.BODY_SENSORS_BACKGROUND") || e0.f(list, "android.permission.READ_MEDIA_IMAGES") || e0.f(list, "android.permission.READ_MEDIA_VIDEO") || e0.f(list, "android.permission.READ_MEDIA_AUDIO")) {
            i10 = 33;
        } else if (e0.f(list, "android.permission.BLUETOOTH_SCAN") || e0.f(list, "android.permission.BLUETOOTH_CONNECT") || e0.f(list, "android.permission.BLUETOOTH_ADVERTISE") || e0.f(list, "android.permission.SCHEDULE_EXACT_ALARM")) {
            i10 = 31;
        } else if (e0.f(list, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
            i10 = 30;
        } else if (e0.f(list, "android.permission.ACCESS_BACKGROUND_LOCATION") || e0.f(list, "android.permission.ACTIVITY_RECOGNITION") || e0.f(list, "android.permission.ACCESS_MEDIA_LOCATION")) {
            i10 = 29;
        } else if (e0.f(list, "android.permission.ACCEPT_HANDOVER")) {
            i10 = 28;
        } else {
            i10 = (e0.f(list, "android.permission.REQUEST_INSTALL_PACKAGES") || e0.f(list, "android.permission.ANSWER_PHONE_CALLS") || e0.f(list, "android.permission.READ_PHONE_NUMBERS") || e0.f(list, "android.permission.PICTURE_IN_PICTURE")) ? 26 : 23;
        }
        if (c.b(context) >= i10) {
            return;
        }
        throw new RuntimeException("The targetSdkVersion SDK must be " + i10 + " or more, if you do not want to upgrade targetSdkVersion, please apply with the old permissions");
    }

    static void n(List list) {
        if (!c.f()) {
            if (e0.f(list, "android.permission.POST_NOTIFICATIONS") && !e0.f(list, "android.permission.NOTIFICATION_SERVICE")) {
                list.add("android.permission.NOTIFICATION_SERVICE");
            }
            if (e0.f(list, "android.permission.NEARBY_WIFI_DEVICES") && !e0.f(list, "android.permission.ACCESS_FINE_LOCATION")) {
                list.add("android.permission.ACCESS_FINE_LOCATION");
            }
            if ((e0.f(list, "android.permission.READ_MEDIA_IMAGES") || e0.f(list, "android.permission.READ_MEDIA_VIDEO") || e0.f(list, "android.permission.READ_MEDIA_AUDIO")) && !e0.f(list, "android.permission.READ_EXTERNAL_STORAGE")) {
                list.add("android.permission.READ_EXTERNAL_STORAGE");
            }
        }
        if (!c.e() && e0.f(list, "android.permission.BLUETOOTH_SCAN") && !e0.f(list, "android.permission.ACCESS_FINE_LOCATION")) {
            list.add("android.permission.ACCESS_FINE_LOCATION");
        }
        if (e0.f(list, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
            if (e0.f(list, "android.permission.READ_EXTERNAL_STORAGE") || e0.f(list, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                throw new IllegalArgumentException("If you have applied for MANAGE_EXTERNAL_STORAGE permissions, do not apply for the READ_EXTERNAL_STORAGE and WRITE_EXTERNAL_STORAGE permissions");
            }
            if (!c.d()) {
                list.add("android.permission.READ_EXTERNAL_STORAGE");
                list.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
        }
        if (!c.c() && e0.f(list, "android.permission.ACTIVITY_RECOGNITION") && !e0.f(list, "android.permission.BODY_SENSORS")) {
            list.add("android.permission.BODY_SENSORS");
        }
        if (c.n() || !e0.f(list, "android.permission.READ_PHONE_NUMBERS") || e0.f(list, "android.permission.READ_PHONE_STATE")) {
            return;
        }
        list.add("android.permission.READ_PHONE_STATE");
    }

    static void b(List list) {
        if (e0.f(list, "android.permission.BODY_SENSORS_BACKGROUND")) {
            if (e0.f(list, "android.permission.BODY_SENSORS_BACKGROUND") && !e0.f(list, "android.permission.BODY_SENSORS")) {
                throw new IllegalArgumentException(UHbHibBvYxKnPE.kQnUnk);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (e0.g(str, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    throw new IllegalArgumentException("Applying for permissions android.permission.BODY_SENSORS_BACKGROUND and android.permission.ACCESS_BACKGROUND_LOCATION at the same time is not supported");
                }
                if (e0.g(str, "android.permission.ACCESS_MEDIA_LOCATION")) {
                    throw new IllegalArgumentException("Applying for permissions android.permission.BODY_SENSORS_BACKGROUND and android.permission.ACCESS_MEDIA_LOCATION at the same time is not supported");
                }
            }
        }
    }
}
