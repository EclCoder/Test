package com.mbridge.msdk.tracker.network.toolbox;

import android.text.TextUtils;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import java.io.File;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f33869f = "i";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile i f33870g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, InetAddress> f33871a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f33872b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f33874d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f33875e = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.foundation.buffer.sharedperference.a f33873c = com.mbridge.msdk.foundation.buffer.sharedperference.a.b();

    private i() {
    }

    public static i b() {
        if (f33870g == null) {
            synchronized (i.class) {
                try {
                    if (f33870g == null) {
                        f33870g = new i();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f33870g;
    }

    private void d(String str) {
        try {
            this.f33875e = e(com.mbridge.msdk.foundation.same.net.utils.d.h().f30642y);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(k0.a(str));
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next) && next.contains(this.f33875e)) {
                    String string = jSONObject.getString(next);
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            this.f33871a.put(next, InetAddress.getByAddress(next, com.mbridge.msdk.foundation.same.c.b(string)));
                        } catch (UnknownHostException e10) {
                            this.f33874d = String.format("create InetAddress failed for %s with ip %s", next, string);
                            q0.b(f33869f, "init: local dns cache error", e10);
                        }
                    }
                }
            }
            this.f33872b.set(true);
        } catch (Exception e11) {
            q0.b(f33869f, "init: local dns cache json parse error", e11);
            this.f33874d = "parse local dns config error";
            this.f33871a.clear();
            this.f33872b.set(false);
        }
    }

    private static String e(String str) {
        return str.replace("https://{}", "").replace("http://{}", "");
    }

    public boolean c(String str) {
        return TextUtils.equals(str, com.mbridge.msdk.foundation.same.net.utils.d.h().f30620e.replace("https://", ""));
    }

    public void f(String str) {
        if (TextUtils.isEmpty(str) || !e()) {
            return;
        }
        this.f33872b.set(false);
        this.f33871a.clear();
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f33872b.set(false);
        this.f33874d = "download local dns config error";
    }

    public boolean e() {
        return s0.a().b("local_dns", false, false);
    }

    private void a() {
        String strA = this.f33873c.a("cache");
        String strA2 = this.f33873c.a("url");
        String strB = s0.a().b("local_dns_config_url", "", false);
        if (TextUtils.isEmpty(strB)) {
            this.f33873c.a("cache", "");
        } else if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strA2) && TextUtils.equals(strB, strA2)) {
            d(strA);
        } else {
            a(strB);
        }
    }

    public boolean c(String str, String str2, String str3) {
        if (e() && d() && TextUtils.equals(str, MBInterstitialActivity.INTENT_CAMAPIGN) && !c(str3)) {
            return TextUtils.equals(str2, String.valueOf(94)) || TextUtils.equals(str2, String.valueOf(MBSupportMuteAdType.INTERSTITIAL_VIDEO));
        }
        return false;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String path = new URL(str).getPath();
            return path.substring(path.lastIndexOf(47) + 1);
        } catch (Exception unused) {
            return str;
        }
    }

    private void a(String str) {
        a(str, com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_OTHER) + File.separator, b(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2, String str3) {
        try {
            String strA = com.mbridge.msdk.foundation.same.c.a(new FileInputStream(new File(str2, str3)));
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            this.f33873c.a("cache", strA);
            this.f33873c.a("url", str);
            d(strA);
        } catch (Exception e10) {
            q0.b(f33869f, "downloadLocalDNSConfig: onDownloadComplete: file not found", e10);
            this.f33874d = "find local dns config file error";
        }
    }

    private void a(String str, String str2, String str3) {
        MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str, str3, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER)).withConnectTimeout(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL).withReadTimeout(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL).withWriteTimeout(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL).withTimeout(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL).withHttpRetryCounter(5).withDirectoryPathInternal(str2).withDownloadPriority(DownloadPriority.HIGH).withDownloadStateListener(new a(str, str2, str3)).build().start();
    }

    public boolean d() {
        return this.f33872b.get() && !this.f33871a.isEmpty();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a implements OnDownloadStateListener<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f33876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f33877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f33878c;

        public a(String str, String str2, String str3) {
            this.f33876a = str;
            this.f33877b = str2;
            this.f33878c = str3;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage<Object> downloadMessage) {
            i.b().c();
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage<Object> downloadMessage) {
            i.b().b(this.f33876a, this.f33877b, this.f33878c);
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage<Object> downloadMessage, DownloadError downloadError) {
            i.b().c();
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage<Object> downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage<Object> downloadMessage) {
        }
    }

    public List<InetAddress> a(String str, UnknownHostException unknownHostException) throws UnknownHostException {
        InetAddress inetAddress;
        try {
            inetAddress = this.f33871a.get(str);
        } catch (Exception e10) {
            q0.b(f33869f, "lookup: local dns cache error", e10);
            inetAddress = null;
        }
        if (inetAddress != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(inetAddress);
            return arrayList;
        }
        throw unknownHostException;
    }
}
