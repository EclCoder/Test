package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f15404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f15405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f15406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f15407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f15408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicBoolean f15409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Integer[] f15410g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a extends e {
        @Override // com.facebook.internal.u0.e
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        @Override // com.facebook.internal.u0.e
        public String d() {
            return "com.facebook.arstudio.player";
        }

        public Void g() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends e {
        @Override // com.facebook.internal.u0.e
        public String c() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // com.facebook.internal.u0.e
        public String d() {
            return "com.instagram.android";
        }

        @Override // com.facebook.internal.u0.e
        public String e() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c extends e {
        private final boolean g() {
            return com.facebook.h0.m().getApplicationInfo().targetSdkVersion >= 30;
        }

        @Override // com.facebook.internal.u0.e
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // com.facebook.internal.u0.e
        public String d() {
            return FbValidationUtils.FB_PACKAGE;
        }

        @Override // com.facebook.internal.u0.e
        public void f() {
            if (g()) {
                Log.w(u0.c(), "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d extends e {
        @Override // com.facebook.internal.u0.e
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        @Override // com.facebook.internal.u0.e
        public String d() {
            return "com.facebook.orca";
        }

        public Void g() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f15412c = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f15413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f15414b;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final f a(e eVar, int i10) {
                f fVar = new f(null);
                fVar.f15413a = eVar;
                fVar.f15414b = i10;
                return fVar;
            }

            public final f b() {
                f fVar = new f(null);
                fVar.f15414b = -1;
                return fVar;
            }

            private a() {
            }
        }

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e c() {
            return this.f15413a;
        }

        public final int d() {
            return this.f15414b;
        }

        private f() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class g extends e {
        @Override // com.facebook.internal.u0.e
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // com.facebook.internal.u0.e
        public String d() {
            return FbValidationUtils.DEBUG_FB_PACKAGE;
        }
    }

    static {
        u0 u0Var = new u0();
        f15404a = u0Var;
        f15405b = u0.class.getName();
        f15406c = u0Var.f();
        f15407d = u0Var.e();
        f15408e = u0Var.d();
        f15409f = new AtomicBoolean(false);
        f15410g = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    private u0() {
    }

    public static final Bundle A(Intent intent) {
        if (x7.a.c(u0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(intent, "intent");
            return !E(B(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
            return null;
        }
    }

    public static final int B(Intent intent) {
        if (x7.a.c(u0.class)) {
            return 0;
        }
        try {
            kotlin.jvm.internal.s.h(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
            return 0;
        }
    }

    public static final Bundle C(Intent resultIntent) {
        if (x7.a.c(u0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(resultIntent, "resultIntent");
            int iB = B(resultIntent);
            Bundle extras = resultIntent.getExtras();
            if (E(iB) && extras != null) {
                return extras.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
            }
            return extras;
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
            return null;
        }
    }

    public static final boolean D(Intent resultIntent) {
        if (x7.a.c(u0.class)) {
            return false;
        }
        try {
            kotlin.jvm.internal.s.h(resultIntent, "resultIntent");
            Bundle bundleS = s(resultIntent);
            return bundleS != null ? bundleS.containsKey("error") : resultIntent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
            return false;
        }
    }

    public static final boolean E(int i10) {
        if (x7.a.c(u0.class)) {
            return false;
        }
        try {
            return gl.j.P(f15410g, Integer.valueOf(i10)) && i10 >= 20140701;
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
            return false;
        }
    }

    public static final void F(Intent intent, String str, String str2, int i10, Bundle bundle) {
        if (x7.a.c(u0.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(intent, "intent");
            String strN = com.facebook.h0.n();
            String strO = com.facebook.h0.o();
            intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i10).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", str2).putExtra("com.facebook.platform.extra.APPLICATION_ID", strN);
            if (!E(i10)) {
                intent.putExtra("com.facebook.platform.protocol.CALL_ID", str);
                if (!e1.e0(strO)) {
                    intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", strO);
                }
                if (bundle != null) {
                    intent.putExtras(bundle);
                    return;
                }
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", str);
            e1.s0(bundle2, "app_name", strO);
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle == null) {
                bundle = new Bundle();
            }
            intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", bundle);
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
        }
    }

    public static final void G() {
        if (x7.a.c(u0.class)) {
            return;
        }
        try {
            if (f15409f.compareAndSet(false, true)) {
                com.facebook.h0.v().execute(new Runnable() { // from class: com.facebook.internal.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        u0.H();
                    }
                });
            }
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H() {
        if (x7.a.c(u0.class)) {
            return;
        }
        try {
            try {
                Iterator it = f15406c.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).a(true);
                }
                f15409f.set(false);
            } catch (Throwable th2) {
                f15409f.set(false);
                throw th2;
            }
        } catch (Throwable th3) {
            x7.a.b(th3, u0.class);
        }
    }

    public static final Intent I(Context context, Intent intent, e eVar) {
        ResolveInfo resolveInfoResolveActivity;
        if (x7.a.c(u0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(context, "context");
            if (intent == null || (resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null) {
                return null;
            }
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            kotlin.jvm.internal.s.g(str, "resolveInfo.activityInfo.packageName");
            if (p.a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
            return null;
        }
    }

    public static final Intent J(Context context, Intent intent, e eVar) {
        ResolveInfo resolveInfoResolveService;
        if (x7.a.c(u0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(context, "context");
            if (intent == null || (resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
                return null;
            }
            String str = resolveInfoResolveService.serviceInfo.packageName;
            kotlin.jvm.internal.s.g(str, "resolveInfo.serviceInfo.packageName");
            if (p.a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
            return null;
        }
    }

    public static final /* synthetic */ TreeSet b(u0 u0Var, e eVar) {
        if (x7.a.c(u0.class)) {
            return null;
        }
        try {
            return u0Var.r(eVar);
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (x7.a.c(u0.class)) {
            return null;
        }
        try {
            return f15405b;
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
            return null;
        }
    }

    private final Map d() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new d());
            List list = f15406c;
            map.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            map.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            map.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            map.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            map.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            map.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            map.put("com.facebook.platform.action.request.CAMERA_EFFECT", f15407d);
            map.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return map;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final List e() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            ArrayList arrayListG = gl.r.g(new a());
            arrayListG.addAll(f());
            return arrayListG;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final List f() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            return gl.r.g(new c(), new g());
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final String g(String str) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            return "intent://" + str;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final Uri h(e eVar) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            Uri uri = Uri.parse("content://" + eVar.d() + ".provider.PlatformProvider/versions");
            kotlin.jvm.internal.s.g(uri, "parse(CONTENT_SCHEME + a…ATFORM_PROVIDER_VERSIONS)");
            return uri;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public static final int i(TreeSet treeSet, int i10, int[] versionSpec) {
        if (x7.a.c(u0.class)) {
            return 0;
        }
        try {
            kotlin.jvm.internal.s.h(versionSpec, "versionSpec");
            if (treeSet == null) {
                return -1;
            }
            int length = versionSpec.length - 1;
            Iterator itDescendingIterator = treeSet.descendingIterator();
            int iMax = -1;
            while (itDescendingIterator.hasNext()) {
                Integer fbAppVersion = (Integer) itDescendingIterator.next();
                kotlin.jvm.internal.s.g(fbAppVersion, "fbAppVersion");
                iMax = Math.max(iMax, fbAppVersion.intValue());
                while (length >= 0 && versionSpec[length] > fbAppVersion.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (versionSpec[length] == fbAppVersion.intValue()) {
                    if (length % 2 != 0) {
                        break;
                    }
                    return Math.min(iMax, i10);
                }
            }
            return -1;
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
            return 0;
        }
    }

    public static final Bundle j(FacebookException facebookException) {
        if (x7.a.c(u0.class) || facebookException == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", facebookException.toString());
            if (!(facebookException instanceof FacebookOperationCanceledException)) {
                return bundle;
            }
            bundle.putString("error_type", "UserCanceled");
            return bundle;
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
            return null;
        }
    }

    public static final Intent k(Context context, String applicationId, Collection permissions, String e2e, boolean z10, boolean z11, com.facebook.login.e defaultAudience, String clientState, String authType, String str, boolean z12, boolean z13, boolean z14) {
        if (x7.a.c(u0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(context, "context");
            kotlin.jvm.internal.s.h(applicationId, "applicationId");
            kotlin.jvm.internal.s.h(permissions, "permissions");
            kotlin.jvm.internal.s.h(e2e, "e2e");
            kotlin.jvm.internal.s.h(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.s.h(clientState, "clientState");
            kotlin.jvm.internal.s.h(authType, "authType");
            b bVar = new b();
            return I(context, m(f15404a, bVar, applicationId, permissions, e2e, z11, defaultAudience, clientState, authType, false, str, z12, com.facebook.login.i0.INSTAGRAM, z13, z14, "", null, null, null, null, false, null, null, 3670016, null), bVar);
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
            return null;
        }
    }

    private final Intent l(e eVar, String str, Collection collection, String str2, boolean z10, com.facebook.login.e eVar2, String str3, String str4, boolean z11, String str5, boolean z12, com.facebook.login.i0 i0Var, boolean z13, boolean z14, String str6, String str7, String str8, String str9, String str10, boolean z15, String str11, String str12) {
        String strC;
        if (x7.a.c(this)) {
            return null;
        }
        if (str11 == null) {
            try {
                strC = eVar.c();
                if (strC == null) {
                    return null;
                }
            } catch (Throwable th2) {
                x7.a.b(th2, this);
                return null;
            }
        } else {
            strC = str11;
        }
        Intent intentPutExtra = new Intent().setClassName(eVar.d(), strC).putExtra("client_id", str);
        kotlin.jvm.internal.s.g(intentPutExtra, "Intent()\n            .se…PP_ID_KEY, applicationId)");
        intentPutExtra.putExtra("facebook_sdk_version", com.facebook.h0.F());
        if (!e1.f0(collection)) {
            intentPutExtra.putExtra(NpmRNZ.PAyZIFkCuW, TextUtils.join(",", collection));
        }
        if (!e1.e0(str2)) {
            intentPutExtra.putExtra("e2e", str2);
        }
        intentPutExtra.putExtra("state", str3);
        intentPutExtra.putExtra("response_type", eVar.e());
        intentPutExtra.putExtra("nonce", str6);
        intentPutExtra.putExtra("return_scopes", "true");
        if (z10) {
            intentPutExtra.putExtra("default_audience", eVar2.g());
        }
        intentPutExtra.putExtra("legacy_override", com.facebook.h0.y());
        intentPutExtra.putExtra("auth_type", str4);
        if (z11) {
            intentPutExtra.putExtra("fail_on_logged_out", true);
        }
        intentPutExtra.putExtra("messenger_page_id", str5);
        intentPutExtra.putExtra("reset_messenger_state", z12);
        if (z13) {
            intentPutExtra.putExtra("fx_app", i0Var.toString());
        }
        if (z14) {
            intentPutExtra.putExtra("skip_dedupe", true);
        }
        if (z15) {
            intentPutExtra.putExtra("force_confirmation", true);
        }
        if (str9 != null && str9.length() != 0) {
            intentPutExtra.putExtra("https_redirect_uri", str9);
        } else if (str10 != null && str10.length() != 0) {
            intentPutExtra.putExtra("intent_uri_package_target", g(str10));
        }
        if (str12 != null && str12.length() != 0) {
            intentPutExtra.putExtra("android_sso_context", str12);
        }
        return intentPutExtra;
    }

    static /* synthetic */ Intent m(u0 u0Var, e eVar, String str, Collection collection, String str2, boolean z10, com.facebook.login.e eVar2, String str3, String str4, boolean z11, String str5, boolean z12, com.facebook.login.i0 i0Var, boolean z13, boolean z14, String str6, String str7, String str8, String str9, String str10, boolean z15, String str11, String str12, int i10, Object obj) {
        if (x7.a.c(u0.class)) {
            return null;
        }
        try {
            return u0Var.l(eVar, str, collection, str2, z10, eVar2, str3, str4, z11, str5, z12, i0Var, z13, z14, str6, str7, str8, str9, str10, (i10 & 524288) != 0 ? false : z15, (i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str11, (i10 & 2097152) != 0 ? null : str12);
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
            return null;
        }
    }

    public static final Intent n(Context context, String str, String str2, f fVar, Bundle bundle) {
        e eVarC;
        Intent intentI;
        if (x7.a.c(u0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(context, "context");
            if (fVar == null || (eVarC = fVar.c()) == null || (intentI = I(context, new Intent().setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(eVarC.d()).addCategory("android.intent.category.DEFAULT"), eVarC)) == null) {
                return null;
            }
            F(intentI, str, str2, fVar.d(), bundle);
            return intentI;
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
            return null;
        }
    }

    public static final Intent o(Context context) {
        if (x7.a.c(u0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(context, "context");
            for (e eVar : f15406c) {
                Intent intentJ = J(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(eVar.d()).addCategory("android.intent.category.DEFAULT"), eVar);
                if (intentJ != null) {
                    return intentJ;
                }
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
            return null;
        }
    }

    public static final Intent p(Intent requestIntent, Bundle bundle, FacebookException facebookException) {
        if (x7.a.c(u0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(requestIntent, "requestIntent");
            UUID uuidT = t(requestIntent);
            if (uuidT == null) {
                return null;
            }
            Intent intent = new Intent();
            intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", B(requestIntent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", uuidT.toString());
            if (facebookException != null) {
                bundle2.putBundle("error", j(facebookException));
            }
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle != null) {
                intent.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent;
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
            return null;
        }
    }

    public static final List q(Context context, String str, Collection collection, String str2, boolean z10, boolean z11, com.facebook.login.e eVar, String str3, String str4, boolean z12, String str5, boolean z13, boolean z14, boolean z15, String str6, String str7, String str8, String str9, String str10, boolean z16, String str11) {
        List list;
        List list2 = null;
        if (x7.a.c(u0.class)) {
            return null;
        }
        try {
            String applicationId = str;
            kotlin.jvm.internal.s.h(applicationId, "applicationId");
            Collection permissions = collection;
            kotlin.jvm.internal.s.h(permissions, "permissions");
            String e2e = str2;
            kotlin.jvm.internal.s.h(e2e, "e2e");
            com.facebook.login.e defaultAudience = eVar;
            kotlin.jvm.internal.s.h(defaultAudience, "defaultAudience");
            String clientState = str3;
            kotlin.jvm.internal.s.h(clientState, "clientState");
            String authType = str4;
            kotlin.jvm.internal.s.h(authType, "authType");
            List list3 = f15406c;
            ArrayList arrayList = new ArrayList();
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                list = list2;
                try {
                    Intent intentM = m(f15404a, (e) it.next(), applicationId, permissions, e2e, z11, defaultAudience, clientState, authType, z12, str5, z13, com.facebook.login.i0.FACEBOOK, z14, z15, str6, str7, str8, str9, str10, z16, null, str11, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, null);
                    if (intentM != null) {
                        arrayList2.add(intentM);
                    }
                    applicationId = str;
                    permissions = collection;
                    e2e = str2;
                    defaultAudience = eVar;
                    clientState = str3;
                    authType = str4;
                    arrayList = arrayList2;
                    list2 = list;
                } catch (Throwable th2) {
                    th = th2;
                    x7.a.b(th, u0.class);
                    return list;
                }
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            list = list2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0097 A[Catch: all -> 0x0091, TryCatch #1 {all -> 0x0091, blocks: (B:5:0x000c, B:39:0x0097, B:40:0x009a, B:34:0x008d), top: B:43:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:53:? A[Catch: all -> 0x0091, SYNTHETIC, TRY_LEAVE, TryCatch #1 {all -> 0x0091, blocks: (B:5:0x000c, B:39:0x0097, B:40:0x009a, B:34:0x008d), top: B:43:0x000c }] */
    private final TreeSet r(e eVar) {
        Throwable th2;
        Cursor cursor;
        ProviderInfo providerInfoResolveContentProvider;
        Cursor cursorQuery;
        if (x7.a.c(this)) {
            return null;
        }
        try {
            TreeSet treeSet = new TreeSet();
            ContentResolver contentResolver = com.facebook.h0.m().getContentResolver();
            String[] strArr = {"version"};
            Uri uriH = h(eVar);
            try {
                try {
                    providerInfoResolveContentProvider = com.facebook.h0.m().getPackageManager().resolveContentProvider(eVar.d() + ".provider.PlatformProvider", 0);
                } catch (RuntimeException e10) {
                    Log.e(f15405b, "Failed to query content resolver.", e10);
                    providerInfoResolveContentProvider = null;
                }
                if (providerInfoResolveContentProvider != null) {
                    try {
                        try {
                            cursorQuery = contentResolver.query(uriH, strArr, null, null, null);
                        } catch (NullPointerException unused) {
                            Log.e(f15405b, "Failed to query content resolver.");
                            cursorQuery = null;
                        }
                    } catch (IllegalArgumentException unused2) {
                        Log.e(f15405b, "Failed to query content resolver.");
                        cursorQuery = null;
                    } catch (SecurityException unused3) {
                        Log.e(f15405b, "Failed to query content resolver.");
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("version"))));
                            } catch (Throwable th3) {
                                cursor = cursorQuery;
                                th2 = th3;
                                if (cursor != null) {
                                    throw th2;
                                }
                                cursor.close();
                                throw th2;
                            }
                        }
                    }
                } else {
                    cursorQuery = null;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return treeSet;
            } catch (Throwable th4) {
                th2 = th4;
                cursor = null;
                if (cursor != null) {
                    throw th2;
                }
                cursor.close();
                throw th2;
            }
        } catch (Throwable th5) {
            x7.a.b(th5, this);
            return null;
        }
    }

    public static final Bundle s(Intent intent) {
        if (x7.a.c(u0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(intent, "intent");
            if (E(B(intent))) {
                return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
            return null;
        }
    }

    public static final UUID t(Intent intent) {
        String stringExtra;
        if (x7.a.c(u0.class) || intent == null) {
            return null;
        }
        try {
            if (E(B(intent))) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
            } else {
                stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (stringExtra != null) {
                try {
                    return UUID.fromString(stringExtra);
                } catch (IllegalArgumentException e10) {
                    e1.m0(f15405b, "Failed to parse call ID from string: " + stringExtra, e10);
                }
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
            return null;
        }
    }

    public static final Bundle u(Intent resultIntent) {
        if (x7.a.c(u0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(resultIntent, "resultIntent");
            if (!D(resultIntent)) {
                return null;
            }
            Bundle bundleS = s(resultIntent);
            return bundleS != null ? bundleS.getBundle("error") : resultIntent.getExtras();
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
            return null;
        }
    }

    public static final FacebookException v(Bundle bundle) {
        if (x7.a.c(u0.class) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = bundle.getString("error_description");
            if (string2 == null) {
                string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            return (string == null || !bm.r.A(string, "UserCanceled", true)) ? new FacebookException(string2) : new FacebookOperationCanceledException(string2);
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
            return null;
        }
    }

    public static final f w(String action, int[] versionSpec) {
        if (x7.a.c(u0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(action, "action");
            kotlin.jvm.internal.s.h(versionSpec, "versionSpec");
            List listL = (List) f15408e.get(action);
            if (listL == null) {
                listL = gl.r.l();
            }
            return f15404a.x(listL, versionSpec);
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
            return null;
        }
    }

    private final f x(List list, int[] iArr) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            G();
            if (list == null) {
                return f.f15412c.b();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                int i10 = i(eVar.b(), z(), iArr);
                if (i10 != -1) {
                    return f.f15412c.a(eVar, i10);
                }
            }
            return f.f15412c.b();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public static final int y(int i10) {
        if (x7.a.c(u0.class)) {
            return 0;
        }
        try {
            return f15404a.x(f15406c, new int[]{i10}).d();
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
            return 0;
        }
    }

    public static final int z() {
        if (x7.a.c(u0.class)) {
            return 0;
        }
        try {
            return f15410g[0].intValue();
        } catch (Throwable th2) {
            x7.a.b(th2, u0.class);
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TreeSet f15411a;

        /* JADX WARN: Code duplicated, block: B:12:0x0012 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:4:0x0003, B:7:0x0009, B:13:0x001a, B:15:0x001e, B:17:0x0024, B:12:0x0012), top: B:22:0x0003 }] */
        public final synchronized void a(boolean z10) {
            if (z10) {
                this.f15411a = u0.b(u0.f15404a, this);
            } else {
                try {
                    TreeSet treeSet = this.f15411a;
                    if (treeSet == null || treeSet == null || treeSet.isEmpty()) {
                        this.f15411a = u0.b(u0.f15404a, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            TreeSet treeSet2 = this.f15411a;
            if (treeSet2 == null || treeSet2.isEmpty()) {
                f();
            }
        }

        public final TreeSet b() {
            TreeSet treeSet = this.f15411a;
            if (treeSet == null || treeSet == null || treeSet.isEmpty()) {
                a(false);
            }
            return this.f15411a;
        }

        public abstract String c();

        public abstract String d();

        public String e() {
            return "id_token,token,signed_request,graph_domain";
        }

        public void f() {
        }
    }
}
