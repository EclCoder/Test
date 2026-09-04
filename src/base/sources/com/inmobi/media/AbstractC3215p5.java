package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.net.URISyntaxException;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.p5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3215p5 {
    public static int a(Context context, String url, InterfaceC3408wh redirectionValidator, String api, InterfaceC3322t9 interfaceC3322t9) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(url, "url");
        kotlin.jvm.internal.s.h(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.s.h(api, "api");
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("DeeplinkHandler", "In appLinkOrDeepLinkHandled");
        }
        if (url.length() == 0) {
            if (interfaceC3322t9 == null) {
                return 2;
            }
            ((C3348u9) interfaceC3322t9).c("DeeplinkHandler", "AppLink url is Empty or null");
            return 2;
        }
        try {
            List listA = B3.a(context, url);
            if (listA.isEmpty()) {
                if (interfaceC3322t9 != null) {
                    ((C3348u9) interfaceC3322t9).c("DeeplinkHandler", " Resolve Info Empty");
                }
                return b(context, url, redirectionValidator, api, interfaceC3322t9);
            }
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).c("DeeplinkHandler", "Resolve Info " + ((ResolveInfo) listA.get(0)).activityInfo.name);
            }
            return a(context, url, (ResolveInfo) listA.get(0), redirectionValidator, api, interfaceC3322t9);
        } catch (URISyntaxException unused) {
            if (interfaceC3322t9 == null) {
                return 5;
            }
            ((C3348u9) interfaceC3322t9).b("DeeplinkHandler", "URISyntaxException for url: " + url);
            return 5;
        }
    }

    public static int b(Context context, String str, InterfaceC3408wh interfaceC3408wh, String str2, InterfaceC3322t9 interfaceC3322t9) {
        try {
            return B3.a(context, str, interfaceC3408wh, str2);
        } catch (ActivityNotFoundException unused) {
            return a(context, str, null, interfaceC3408wh, str2, interfaceC3322t9);
        } catch (NullPointerException unused2) {
            return a(context, str, null, interfaceC3408wh, str2, interfaceC3322t9);
        } catch (SecurityException unused3) {
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).b("DeeplinkHandler", "SecurityException");
            }
            return 12;
        } catch (URISyntaxException unused4) {
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).b("DeeplinkHandler", "uriSyntaxException");
            }
            return 5;
        } catch (Exception e10) {
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).b("DeeplinkHandler", "Exception: " + e10);
            }
            return 9;
        }
    }

    public static boolean a(String url, Context context, InterfaceC3408wh redirectionValidator, InterfaceC3322t9 interfaceC3322t9) {
        kotlin.jvm.internal.s.h(url, "url");
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(redirectionValidator, "redirectionValidator");
        B5.f24500a.getClass();
        if (!B5.t() || !redirectionValidator.a()) {
            return false;
        }
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(TelemetryConfig.class, "clazz");
        if (!((TelemetryConfig) AbstractC2878c4.f26300a.a(TelemetryConfig.class)).getLpConfig().getUniversalLinkEnabled()) {
            return false;
        }
        try {
            Uri uri = Uri.parse(url);
            kotlin.jvm.internal.s.g(uri, "Uri.parse(this)");
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            kotlin.jvm.internal.s.h(intent, "<this>");
            intent.addCategory("android.intent.category.BROWSABLE");
            kotlin.jvm.internal.s.h(intent, "<this>");
            intent.setFlags(268436992);
            kotlin.jvm.internal.s.h(intent, "<this>");
            kotlin.jvm.internal.s.h(context, "context");
            context.startActivity(intent);
            if (interfaceC3322t9 == null) {
                return true;
            }
            ((C3348u9) interfaceC3322t9).a("DeeplinkHandler", "openDefaultApplication: SUCCESS");
            return true;
        } catch (ActivityNotFoundException unused) {
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).b("DeeplinkHandler", "openDefaultApplication: ActivityNotFoundException");
            }
            return false;
        } catch (NullPointerException unused2) {
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).b("DeeplinkHandler", "openDefaultApplication: NullPointerException");
            }
            return false;
        }
    }

    public static int a(Context context, String str, ResolveInfo resolveInfo, InterfaceC3408wh interfaceC3408wh, String str2, InterfaceC3322t9 interfaceC3322t9) {
        try {
            return B3.a(context, str, resolveInfo, interfaceC3408wh, str2);
        } catch (ActivityNotFoundException unused) {
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).b("DeeplinkHandler", "ActivityNotFoundException for url: " + str);
            }
            return 6;
        } catch (NullPointerException unused2) {
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).b("DeeplinkHandler", "NullPointerException for url: " + str);
            }
            return 13;
        } catch (SecurityException unused3) {
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).b("DeeplinkHandler", "SecurityException for url: " + str);
            }
            return 12;
        } catch (URISyntaxException unused4) {
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).b("DeeplinkHandler", "URISyntaxException for url: " + str);
            }
            return 5;
        } catch (Exception e10) {
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).b("DeeplinkHandler", "Exception: " + e10);
            }
            return 9;
        }
    }
}
