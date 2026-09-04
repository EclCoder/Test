package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import re.xQrM.UoyZyZEcGYBpIg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1 f15215a = new f1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f15216b = f1.class.getName();

    private f1() {
    }

    public static final void a(Collection container, String name) {
        kotlin.jvm.internal.s.h(container, "container");
        kotlin.jvm.internal.s.h(name, "name");
        Iterator it = container.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("Container '" + name + "' cannot contain null values");
            }
        }
    }

    public static final String b() {
        String strN = com.facebook.h0.n();
        if (strN != null) {
            return strN;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.");
    }

    public static final String c() {
        String strT = com.facebook.h0.t();
        if (strT != null) {
            return strT;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token. Please follow https://developers.facebook.com/docs/android/getting-started/#client-access-token to get the token and fill it in AndroidManifest.xml");
    }

    public static final boolean e(Context context, String redirectURI) {
        List<ResolveInfo> listQueryIntentActivities;
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(redirectURI, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(redirectURI));
            listQueryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        } else {
            listQueryIntentActivities = null;
        }
        if (listQueryIntentActivities == null) {
            return false;
        }
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!kotlin.jvm.internal.s.c(activityInfo.name, "com.facebook.CustomTabActivity") || !kotlin.jvm.internal.s.c(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z10 = true;
        }
        return z10;
    }

    public static final void f(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        g(context, true);
    }

    public static final void g(Context context, boolean z10) {
        ActivityInfo activityInfo;
        kotlin.jvm.internal.s.h(context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (PackageManager.NameNotFoundException unused) {
                activityInfo = null;
            }
        } else {
            activityInfo = null;
        }
        if (activityInfo == null) {
            if (z10) {
                throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
            }
            Log.w(f15216b, "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
        }
    }

    public static final void h(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        i(context, true);
    }

    public static final void i(Context context, boolean z10) {
        kotlin.jvm.internal.s.h(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            if (z10) {
                throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
            }
            Log.w(f15216b, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
    }

    public static final void j(String arg, String name) {
        kotlin.jvm.internal.s.h(arg, "arg");
        kotlin.jvm.internal.s.h(name, "name");
        if (arg.length() > 0) {
            return;
        }
        throw new IllegalArgumentException(("Argument '" + name + "' cannot be empty").toString());
    }

    public static final void k(Collection container, String name) {
        kotlin.jvm.internal.s.h(container, "container");
        kotlin.jvm.internal.s.h(name, "name");
        if (container.isEmpty()) {
            throw new IllegalArgumentException(("Container '" + name + "' cannot be empty").toString());
        }
    }

    public static final void l(Collection container, String name) {
        kotlin.jvm.internal.s.h(container, "container");
        kotlin.jvm.internal.s.h(name, "name");
        a(container, name);
        k(container, name);
    }

    public static final void m(Object obj, String name) {
        kotlin.jvm.internal.s.h(name, "name");
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Argument '" + name + "' cannot be null");
    }

    public static final String n(String str, String name) {
        kotlin.jvm.internal.s.h(name, "name");
        if (str != null && str.length() > 0) {
            return str;
        }
        throw new IllegalArgumentException(("Argument '" + name + "' cannot be null or empty").toString());
    }

    public static final void o() {
        if (!com.facebook.h0.K()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    public static final void d(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        String strB = b();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            String str = UoyZyZEcGYBpIg.ixGQoj + strB;
            if (packageManager.resolveContentProvider(str, 0) != null) {
                return;
            }
            kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
            String str2 = String.format("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", Arrays.copyOf(new Object[]{str}, 1));
            kotlin.jvm.internal.s.g(str2, "format(format, *args)");
            throw new IllegalStateException(str2.toString());
        }
    }
}
