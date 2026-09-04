package com.mbridge.msdk.foundation.tools;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final List<String> f30984a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        void a(String str, DownloadError downloadError);

        void a(String str, String str2, String str3, String str4, boolean z10);
    }

    static {
        ArrayList arrayList = new ArrayList(4);
        f30984a = arrayList;
        arrayList.add("mbridge_splash_native_template_v_v1.xml");
        arrayList.add("mbridge_splash_native_template_h_v1.xml");
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        if (r14 != 5) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(int r14, java.lang.String r15, java.lang.String r16, com.mbridge.msdk.foundation.tools.z.c r17, com.mbridge.msdk.foundation.entity.CampaignEx r18) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.z.a(int, java.lang.String, java.lang.String, com.mbridge.msdk.foundation.tools.z$c, com.mbridge.msdk.foundation.entity.CampaignEx):void");
    }

    private static String b(int i10, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                String path = new URL(str2).getPath();
                String strSubstring = path.substring(path.lastIndexOf(47) + 1);
                if (!TextUtils.isEmpty(strSubstring)) {
                    return strSubstring.replace(".zip", "");
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    private static String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = new URL(str).getPath();
                String strSubstring = path.substring(path.lastIndexOf(47) + 1);
                if (!TextUtils.isEmpty(strSubstring)) {
                    String strReplace = strSubstring.replace(".zip", "");
                    List<String> list = f30984a;
                    if (list != null && !list.contains(strReplace)) {
                        return strReplace;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements OnDownloadStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f30987c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30988d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f30989e;

        a(String str, String str2, c cVar, String str3, String str4) {
            this.f30985a = str;
            this.f30986b = str2;
            this.f30987c = cVar;
            this.f30988d = str3;
            this.f30989e = str4;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage downloadMessage) {
            String str;
            try {
                String str2 = this.f30985a + File.separator + this.f30986b;
                String str3 = this.f30985a;
                MBResourceManager.getInstance().unZip(str2, str3);
                if (this.f30987c != null) {
                    if (downloadMessage != null) {
                        try {
                            str = (String) downloadMessage.getExtra("responseHeaders");
                        } catch (Throwable th2) {
                            q0.b("DynamicViewResourceManager", th2.getMessage());
                            str = "";
                        }
                    } else {
                        str = "";
                    }
                    try {
                        this.f30987c.a(this.f30988d, str3, this.f30989e, str, false);
                    } catch (Exception e10) {
                        q0.b("DynamicViewResourceManager", e10.getMessage());
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            c cVar = this.f30987c;
            if (cVar != null) {
                try {
                    cVar.a(this.f30988d, downloadError);
                } catch (Exception e10) {
                    q0.b("DynamicViewResourceManager", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage downloadMessage) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements OnDownloadStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30991b;

        b(String str, String str2) {
            this.f30990a = str;
            this.f30991b = str2;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage downloadMessage) {
            try {
                MBResourceManager.getInstance().unZip(this.f30990a + File.separator + this.f30991b, this.f30990a);
            } catch (Exception unused) {
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
        }
    }

    public static String a(int i10, String str, String str2) {
        String strB;
        File file;
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            strB = b(i10, str, str2);
        } catch (Exception unused) {
            strB = "";
        }
        String str3 = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_XML) + File.separator;
        try {
            file = !TextUtils.isEmpty(strB) ? new File(str3, strB) : null;
        } catch (Exception unused2) {
        }
        if (file == null || !file.exists()) {
            file = new File(str3 + File.separator + strB.replace(".xml", ""), strB);
        }
        return file.getPath();
    }

    public static String a(String str) {
        String strB;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_KEY_NATMP);
            if (!TextUtils.isEmpty(queryParameter) && !queryParameter.equals("1")) {
                return "";
            }
        } catch (Throwable unused) {
        }
        try {
            strB = b(str);
        } catch (Exception unused2) {
            strB = "";
        }
        if (TextUtils.isEmpty(strB)) {
            return "";
        }
        try {
            String str2 = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_XML) + File.separator;
            File file = new File(str2, strB);
            if (file.isFile() && file.exists()) {
                return file.getPath();
            }
            String path = new URL(str).getPath();
            a(str, path.substring(path.lastIndexOf(47) + 1), str2, strB);
            return "";
        } catch (Exception unused3) {
        }
    }

    private static final void a(String str, String str2, String str3, String str4, c cVar, CampaignEx campaignEx, int i10) {
        q0.a("test_zip_download ", "start download path： " + str3 + str2);
        DownloadMessage<?> downloadMessage = new DownloadMessage<>(campaignEx, str, str2, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER);
        downloadMessage.addExtra("resource_type", Integer.valueOf(i10));
        MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout((long) com.mbridge.msdk.foundation.same.a.f30499u).withConnectTimeout((long) com.mbridge.msdk.foundation.same.a.f30498t).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).withWriteTimeout((long) com.mbridge.msdk.foundation.same.a.f30497s).with("download_scene", "download_dynamic_view").withDownloadPriority(DownloadPriority.MEDIUM).withHttpRetryCounter(1).withDirectoryPathInternal(str3).withDownloadStateListener(new a(str3, str2, cVar, str, str4)).build().start();
    }

    private static final void a(String str, String str2, String str3, String str4) {
        MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str, str2, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER)).withReadTimeout(com.mbridge.msdk.foundation.same.a.f30499u).withConnectTimeout(com.mbridge.msdk.foundation.same.a.f30493o).with("download_scene", "download_dynamic_view").withWriteTimeout(com.mbridge.msdk.foundation.same.a.f30497s).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).withDownloadPriority(DownloadPriority.MEDIUM).withHttpRetryCounter(1).withDirectoryPathInternal(str3).withDownloadStateListener(new b(str3, str2)).build().start();
    }
}
