package y4;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y4.a.b f57381a = new y4.a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y4.a.b f57383b = new y4.a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y4.a.e f57385c = new y4.a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y4.a.c f57387d = new y4.a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y4.a.f f57389e = new y4.a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y4.a.f f57391f = new y4.a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final y4.a.f f57393g = new y4.a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final y4.a.f f57395h = new y4.a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final y4.a.f f57397i = new y4.a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final y4.a.f f57399j = new y4.a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final y4.a.c f57400k = new y4.a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final y4.a.c f57401l = new y4.a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final y4.a.c f57402m = new y4.a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final y4.a.c f57403n = new y4.a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final y4.a.c f57404o = new y4.a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final y4.a.c f57405p = new y4.a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final y4.a.b f57406q = new y4.a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final y4.a.b f57407r = new y4.a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final y4.a.c f57408s = new y4.a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final y4.a.f f57409t = new y4.a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final y4.a.c f57410u = new y4.a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final y4.a.b f57411v = new y4.a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final y4.a.b f57412w = new y4.a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final y4.a.f f57413x = new y4.a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final y4.a.f f57414y = new y4.a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final y4.a.f f57415z = new y4.a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
    public static final y4.a.b A = new y4.a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
    public static final y4.a.b B = new y4.a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
    public static final y4.a.d C = new y4.a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
    public static final y4.a.b D = new y4.a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
    public static final y4.a.b E = new y4.a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
    public static final y4.a.b F = new y4.a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
    public static final y4.a.b G = new y4.a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
    public static final y4.a.e H = new y4.a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
    public static final y4.a.e I = new y4.a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
    public static final y4.a.h J = new y4.a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
    public static final y4.a.h K = new y4.a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
    public static final y4.a.g L = new y4.a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
    public static final k.b M = new k.b("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");
    public static final k.a N = new k.a("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");
    public static final y4.a.h O = new y4.a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
    public static final y4.a.i P = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
    public static final y4.a.d Q = new y4.a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
    public static final y4.a.d R = new y4.a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
    public static final y4.a.h S = new y4.a.h("FORCE_DARK", "FORCE_DARK");
    public static final y4.a.d T = new y4.a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
    public static final y4.a.d U = new y4.a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
    public static final y4.a.d V = new y4.a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
    public static final y4.a.d W = new y4.a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
    public static final y4.a.d X = new y4.a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
    public static final y4.a.d Y = new y4.a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
    public static final y4.a.d Z = new y4.a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final y4.a.d f57382a0 = new y4.a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final y4.a.d f57384b0 = new y4.a.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final y4.a.d f57386c0 = new b("MULTI_PROFILE", "MULTI_PROFILE");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final y4.a.d f57388d0 = new y4.a.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final y4.a.d f57390e0 = new y4.a.d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final y4.a.d f57392f0 = new y4.a.d("MUTE_AUDIO", "MUTE_AUDIO");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final y4.a.d f57394g0 = new y4.a.d("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final y4.a.d f57396h0 = new y4.a.d("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final y4.a.d f57398i0 = new y4.a.d("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends y4.a.i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Pattern f57416d;

        a(String str, String str2) {
            super(str, str2);
            this.f57416d = Pattern.compile("\\A\\d+");
        }

        @Override // y4.a
        public boolean d() {
            boolean zD = super.d();
            if (!zD || Build.VERSION.SDK_INT >= 29) {
                return zD;
            }
            PackageInfo packageInfoE = x4.f.e();
            if (packageInfoE == null) {
                return false;
            }
            Matcher matcher = this.f57416d.matcher(packageInfoE.versionName);
            return matcher.find() && Integer.parseInt(packageInfoE.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends y4.a.d {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // y4.a
        public boolean d() {
            if (super.d() && x4.g.a("MULTI_PROCESS")) {
                return x4.f.k();
            }
            return false;
        }
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean b(String str) {
        return c(str, y4.a.e());
    }

    public static boolean c(String str, Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.b().equals(str)) {
                hashSet.add(dVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            if (((d) it2.next()).a()) {
                return true;
            }
        }
        return false;
    }
}
