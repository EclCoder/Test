package com.vungle.ads.internal.platform;

import android.content.Context;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.ProxyInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import fl.r;
import gl.j;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class e {
    public static final e INSTANCE = new e();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class a extends t implements Function1 {
        public static final a INSTANCE = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Throwable invoke(Throwable it) {
            s.h(it, "it");
            return it.getCause();
        }
    }

    private e() {
    }

    private final boolean isEnabled(ProxyInfo proxyInfo) {
        if (proxyInfo == null) {
            return false;
        }
        String host = proxyInfo.getHost();
        return (host != null && host.length() > 0 && proxyInfo.getPort() > 0) || (proxyInfo.getPacFileUrl() != null && !s.c(proxyInfo.getPacFileUrl(), Uri.EMPTY));
    }

    public final String getActiveNetworkType(Context context) {
        Object objB;
        String string;
        s.h(context, "context");
        try {
            r.a aVar = r.f38769b;
            Object systemService = context.getSystemService("connectivity");
            s.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                string = DevicePublicKeyStringDef.NONE;
            } else {
                s.g(activeNetwork, "cm.activeNetwork ?: return@runCatching \"none\"");
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    string = "unknown";
                } else {
                    s.g(networkCapabilities, "cm.getNetworkCapabilitie…urn@runCatching \"unknown\"");
                    StringBuilder sb2 = new StringBuilder();
                    if (networkCapabilities.hasTransport(1)) {
                        sb2.append("wifi");
                    } else if (networkCapabilities.hasTransport(0)) {
                        sb2.append("cellular");
                    } else if (networkCapabilities.hasTransport(3)) {
                        sb2.append("ethernet");
                    } else {
                        sb2.append("other");
                    }
                    if (networkCapabilities.hasTransport(4)) {
                        sb2.append("+vpn");
                    }
                    if (connectivityManager.isActiveNetworkMetered()) {
                        sb2.append("+metered");
                    }
                    string = sb2.toString();
                    s.g(string, "StringBuilder().apply(builderAction).toString()");
                }
            }
            objB = r.b(string);
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            objB = r.b(fl.s.a(th2));
        }
        return (String) (r.h(objB) ? "unknown" : objB);
    }

    public final int getSensorCount(Context context) {
        s.h(context, "context");
        Object systemService = context.getSystemService("sensor");
        s.f(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return ((SensorManager) systemService).getSensorList(-1).size();
    }

    public final boolean hasSystemAlertWindowPermission(Context context) {
        s.h(context, "context");
        return Settings.canDrawOverlays(context);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:6:0x0013  */
    public final boolean isEmulator() {
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        String lowerCase4;
        String lowerCase5;
        String str = Build.FINGERPRINT;
        String str2 = "";
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            s.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase == null) {
                lowerCase = "";
            }
        } else {
            lowerCase = "";
        }
        String str3 = Build.MODEL;
        if (str3 != null) {
            lowerCase2 = str3.toLowerCase(Locale.ROOT);
            s.g(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase2 == null) {
                lowerCase2 = "";
            }
        } else {
            lowerCase2 = "";
        }
        String str4 = Build.PRODUCT;
        if (str4 != null) {
            lowerCase3 = str4.toLowerCase(Locale.ROOT);
            s.g(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase3 == null) {
                lowerCase3 = "";
            }
        } else {
            lowerCase3 = "";
        }
        String str5 = Build.BRAND;
        if (str5 != null) {
            lowerCase4 = str5.toLowerCase(Locale.ROOT);
            s.g(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase4 == null) {
                lowerCase4 = "";
            }
        } else {
            lowerCase4 = "";
        }
        String str6 = Build.MANUFACTURER;
        if (str6 != null) {
            lowerCase5 = str6.toLowerCase(Locale.ROOT);
            s.g(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase5 == null) {
                lowerCase5 = "";
            }
        } else {
            lowerCase5 = "";
        }
        String str7 = Build.BOARD;
        if (str7 != null) {
            String lowerCase6 = str7.toLowerCase(Locale.ROOT);
            s.g(lowerCase6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase6 != null) {
                str2 = lowerCase6;
            }
        }
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        s.g(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        String lowerCase7 = j.m0(SUPPORTED_ABIS, null, null, null, 0, null, null, 63, null).toLowerCase(Locale.ROOT);
        s.g(lowerCase7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return bm.r.T(lowerCase, "generic", false, 2, null) || bm.r.T(lowerCase, "emulator", false, 2, null) || bm.r.T(lowerCase2, "google_sdk", false, 2, null) || bm.r.T(lowerCase2, "emulator", false, 2, null) || bm.r.T(lowerCase3, "sdk", false, 2, null) || bm.r.T(lowerCase3, "vbox", false, 2, null) || bm.r.T(lowerCase4, "generic", false, 2, null) || bm.r.T(lowerCase5, "genymotion", false, 2, null) || bm.r.T(str2, "nox", false, 2, null) || bm.r.T(lowerCase7, "x86", false, 2, null);
    }

    public final boolean isProxyEnabled(Context context) {
        Object objB;
        boolean zIsEnabled;
        s.h(context, "context");
        try {
            r.a aVar = r.f38769b;
            Object systemService = context.getSystemService("connectivity");
            s.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                zIsEnabled = false;
            } else {
                s.g(activeNetwork, "cm.activeNetwork ?: return@runCatching false");
                LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
                zIsEnabled = isEnabled(linkProperties != null ? linkProperties.getHttpProxy() : null);
            }
            objB = r.b(Boolean.valueOf(zIsEnabled));
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            objB = r.b(fl.s.a(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (r.h(objB)) {
            objB = bool;
        }
        return ((Boolean) objB).booleanValue();
    }

    public final boolean isVpnConnected(Context context) {
        Object objB;
        s.h(context, "context");
        try {
            r.a aVar = r.f38769b;
            Object systemService = context.getSystemService("connectivity");
            s.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network[] allNetworks = connectivityManager.getAllNetworks();
            s.g(allNetworks, "cm.allNetworks");
            boolean z10 = false;
            for (Network network : allNetworks) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                    z10 = true;
                    break;
                }
            }
            objB = r.b(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            objB = r.b(fl.s.a(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (r.h(objB)) {
            objB = bool;
        }
        return ((Boolean) objB).booleanValue();
    }

    public final String classifyNetworkError(Throwable th2) {
        boolean z10;
        if (th2 == null) {
            return DevicePublicKeyStringDef.NONE;
        }
        Iterator it = am.j.g(th2, a.INSTANCE).iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            if (((Throwable) it.next()) instanceof CertificateException) {
                z10 = true;
                break;
            }
        }
        boolean z11 = th2 instanceof SSLHandshakeException;
        if (z11 && z10) {
            return "SSL_CERT_ERROR";
        }
        if (z11) {
            return qEagQqzJZsd.dgRfeGJqj;
        }
        if (th2 instanceof SSLPeerUnverifiedException) {
            return "SSL_PEER_UNVERIFIED";
        }
        if (th2 instanceof SSLException) {
            return "SSL_ERROR";
        }
        if (th2 instanceof UnknownHostException) {
            return "DNS_FAILURE";
        }
        if (th2 instanceof ConnectException) {
            return "CONNECT_FAILURE";
        }
        if (th2 instanceof SocketTimeoutException) {
            return "TIMEOUT";
        }
        if (!(th2 instanceof SocketException)) {
            String simpleName = th2.getClass().getSimpleName();
            s.g(simpleName, "cause.javaClass.simpleName");
            return simpleName;
        }
        SocketException socketException = (SocketException) th2;
        String message = socketException.getMessage();
        if (message != null && bm.r.R(message, "reset", true)) {
            return "CONNECTION_RESET";
        }
        String message2 = socketException.getMessage();
        if (message2 != null && bm.r.R(message2, "abort", true)) {
            return "CONNECTION_ABORT";
        }
        String message3 = socketException.getMessage();
        return (message3 == null || !bm.r.R(message3, "closed", true)) ? "SOCKET_ERROR" : "CONNECTION_CLOSED";
    }

    public final String getPrivateDnsInfo(Context context) {
        Object objB;
        s.h(context, "context");
        if (Build.VERSION.SDK_INT < 28) {
            return "n/a";
        }
        try {
            r.a aVar = r.f38769b;
            String string = Settings.Global.getString(context.getContentResolver(), "private_dns_mode");
            if (string == null) {
                string = QGbBllacZSmHKn.hpUtWdvOfTaH;
            } else {
                s.g(string, "Settings.Global.getStrin…mode\") ?: \"opportunistic\"");
            }
            if (s.c(string, "hostname")) {
                String string2 = Settings.Global.getString(context.getContentResolver(), "private_dns_specifier");
                if (string2 == null) {
                    string2 = "";
                } else {
                    s.g(string2, "Settings.Global.getStrin…ate_dns_specifier\") ?: \"\"");
                }
                string = "hostname(" + string2 + ')';
            }
            objB = r.b(string);
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            objB = r.b(fl.s.a(th2));
        }
        if (r.h(objB)) {
            objB = "unknown";
        }
        return (String) objB;
    }
}
