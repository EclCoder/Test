package com.vungle.ads.internal.model;

import androidx.core.app.NotificationCompat;
import bm.o;
import com.bytedance.sdk.component.hn.hnj.yiH.PAFNPq;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.util.p;
import fl.g0;
import fl.q;
import fl.r;
import fl.w;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.d0;
import kotlinx.serialization.json.e0;
import kotlinx.serialization.json.j0;
import tm.b0;
import tm.f1;
import tm.g2;
import tm.l0;
import tm.q2;
import tm.u0;
import tm.v2;
import tm.z0;
import tn.xQIL.Saucuwx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u0000 £\u00012\u00020\u0001:\u0018¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0085\u0001\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0001\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0016\b\u0001\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0007\u0010\u0017J%\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b!\u0010\"J%\u0010%\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b%\u0010&J(\u0010-\u001a\u00020,2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*HÇ\u0001¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b2\u00100J\r\u00103\u001a\u00020\t¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\t¢\u0006\u0004\b5\u00104J\u000f\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b7\u00108J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u00109J\r\u0010:\u001a\u00020\u0012¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0012¢\u0006\u0004\b<\u0010;J\r\u0010=\u001a\u00020\u0012¢\u0006\u0004\b=\u0010;J\u000f\u0010>\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b>\u00100J\r\u0010?\u001a\u00020\u0012¢\u0006\u0004\b?\u0010;J\r\u0010@\u001a\u00020\u0012¢\u0006\u0004\b@\u0010;J\u0015\u0010B\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u000e¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010D\u001a\u00020\u000e¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\b\u0012\u0004\u0012\u00020E0\u00022\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\bH\u0010IJ5\u0010L\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00022\u0006\u0010J\u001a\u00020\u000e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020,¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00020\u0012¢\u0006\u0004\bP\u0010;J\u0015\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0002¢\u0006\u0004\bQ\u0010RJ\r\u0010S\u001a\u00020\u0012¢\u0006\u0004\bS\u0010;J\u000f\u0010T\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bT\u00100J-\u0010Y\u001a\u00020,2\u0006\u0010U\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020\u000e¢\u0006\u0004\bY\u0010ZJ\r\u0010[\u001a\u00020,¢\u0006\u0004\b[\u0010OJ\u0019\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\u0004\b\\\u0010]J\r\u0010_\u001a\u00020^¢\u0006\u0004\b_\u0010`J\u0017\u0010b\u001a\u00020\t2\b\u0010a\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bb\u0010cJ\r\u0010d\u001a\u00020\u000e¢\u0006\u0004\bd\u00100J\u000f\u0010e\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\be\u00100J\u000f\u0010f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bf\u00100J\u000f\u0010g\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bg\u00100J\u000f\u0010i\u001a\u0004\u0018\u00010h¢\u0006\u0004\bi\u0010jJ\r\u0010k\u001a\u00020\u0012¢\u0006\u0004\bk\u0010;J\u001d\u0010n\u001a\u00020,2\u0006\u0010l\u001a\u00020\u000e2\u0006\u0010m\u001a\u00020\u0018¢\u0006\u0004\bn\u0010oJ\u000f\u0010q\u001a\u0004\u0018\u00010p¢\u0006\u0004\bq\u0010rJ\u000f\u0010t\u001a\u0004\u0018\u00010s¢\u0006\u0004\bt\u0010uJ\u0015\u0010v\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0002¢\u0006\u0004\bv\u0010RJ\u0015\u0010w\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0002¢\u0006\u0004\bw\u0010RR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010x\u0012\u0004\by\u0010OR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0006\u0010z\u0012\u0004\b{\u0010OR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010|R(\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u000f\u0010}\u0012\u0004\b~\u0010OR8\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0004\b\u0011\u0010\u007f\u0012\u0005\b\u0083\u0001\u0010O\u001a\u0005\b\u0080\u0001\u0010]\"\u0006\b\u0081\u0001\u0010\u0082\u0001R&\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0013\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010;\"\u0006\b\u0086\u0001\u0010\u0087\u0001R3\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u0012\u0005\b\u008f\u0001\u0010O\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R3\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u0012\u0005\b\u0097\u0001\u0010O\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R+\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0014\u0010\u0099\u0001\u001a\u0005\b\u009a\u0001\u00100R0\u0010\u009b\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020E0\u00108\u0000X\u0081\u0004¢\u0006\u0015\n\u0005\b\u009b\u0001\u0010\u007f\u0012\u0005\b\u009d\u0001\u0010O\u001a\u0005\b\u009c\u0001\u0010]R\u0019\u0010 \u0001\u001a\u0004\u0018\u00010\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0018\u0010¢\u0001\u001a\u0004\u0018\u0001068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u00108¨\u0006°\u0001"}, d2 = {"Lcom/vungle/ads/internal/model/b;", "", "", "Lcom/vungle/ads/internal/model/b$g;", com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "Lcom/vungle/ads/internal/model/g;", "config", "<init>", "(Ljava/util/List;Lcom/vungle/ads/internal/model/g;)V", "", "seen1", "", "expiryWindowStart", "Ljava/util/concurrent/ConcurrentHashMap;", "", "mraidFiles", "", "incentivizedTextSettings", "", "assetsFullyDownloaded", "indexFilePath", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/vungle/ads/internal/model/g;Ljava/lang/Long;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/Map;ZLjava/lang/String;Ltm/q2;)V", "Ljava/io/File;", "dir", "Lfl/q;", "getIndexHtmlFile", "(Ljava/io/File;)Lfl/q;", "percentage", "computeAssetRequirement", "(Ljava/lang/Integer;)Lfl/q;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "valueOrEmpty", "(Ljava/lang/String;)Ljava/lang/String;", "oldValue", "newValue", "complexReplace", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/b;Lsm/d;Lrm/f;)V", "placementId", "()Ljava/lang/String;", "eventId", "advAppId", "adWidth", "()I", "adHeight", "Lcom/vungle/ads/internal/model/b$c;", OutOfContextTestingActivity.AD_UNIT_KEY, "()Lcom/vungle/ads/internal/model/b$c;", "()Lcom/vungle/ads/internal/model/g;", "adLoadOptimizationEnabled", "()Z", "isPartialDownloadEnabled", "isAdPoddingEnabled", "getExperiments", "omEnabled", "isClickCoordinatesTrackingEnabled", "failingUrl", "isCriticalAsset", "(Ljava/lang/String;)Z", "remoteUrl", "Lcom/vungle/ads/internal/model/a;", "getLocalPartialDownloadAssets", "(Ljava/lang/String;)Lcom/vungle/ads/internal/model/a;", "getDownloadableAssets", "(Ljava/io/File;)Ljava/util/List;", NotificationCompat.CATEGORY_EVENT, "secondValue", "getTpatUrls", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "recordExpiryWindowStart", "()V", "hasExpired", "getWinNotifications", "()Ljava/util/List;", "isNativeTemplateType", "templateType", CampaignEx.JSON_KEY_TITLE, TtmlNode.TAG_BODY, "keepWatching", "close", "setIncentivizedText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "setAssetFullyDownloaded", "getMRAIDArgsInMap", "()Ljava/util/Map;", "Lkotlinx/serialization/json/d0;", "createMRAIDArgs", "()Lkotlinx/serialization/json/d0;", "incentivized", "getShowCloseDelay", "(Ljava/lang/Boolean;)I", "getCreativeId", "getAdSource", "getMediationName", "getViewMasterVersion", "Lcom/vungle/ads/internal/model/b$l;", "getWebViewSettings", "()Lcom/vungle/ads/internal/model/b$l;", "usePreloading", "adIdentifier", "localFile", "updateAdAssetPath", "(Ljava/lang/String;Ljava/io/File;)V", "Lcom/vungle/ads/internal/model/b$d;", "getCSBResponse", "()Lcom/vungle/ads/internal/model/b$d;", "", "getWinningPrice", "()Ljava/lang/Double;", "getWinUrls", "getLossUrls", "Ljava/util/List;", "getAds$annotations", "Lcom/vungle/ads/internal/model/g;", "getConfig$annotations", "Ljava/lang/Long;", "Ljava/util/concurrent/ConcurrentHashMap;", "getMraidFiles$annotations", "Ljava/util/Map;", "getIncentivizedTextSettings", "setIncentivizedTextSettings", "(Ljava/util/Map;)V", "getIncentivizedTextSettings$annotations", "Z", "getAssetsFullyDownloaded", "setAssetsFullyDownloaded", "(Z)V", "Lcom/vungle/ads/b;", "adConfig", "Lcom/vungle/ads/b;", "getAdConfig", "()Lcom/vungle/ads/b;", "setAdConfig", "(Lcom/vungle/ads/b;)V", "getAdConfig$annotations", "Lcom/vungle/ads/internal/util/p;", "logEntry", "Lcom/vungle/ads/internal/util/p;", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/p;", "setLogEntry$vungle_ads_release", "(Lcom/vungle/ads/internal/util/p;)V", "getLogEntry$vungle_ads_release$annotations", "<set-?>", "Ljava/lang/String;", "getIndexFilePath", "partialDownloadAssets", "getPartialDownloadAssets$vungle_ads_release", "getPartialDownloadAssets$vungle_ads_release$annotations", "getAd", "()Lcom/vungle/ads/internal/model/b$g;", "ad", "getAdMarkup", "adMarkup", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "e", "f", "g", "h", "i", "j", CampaignEx.JSON_KEY_AD_K, "l", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@pm.k
public final class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String FILE_SCHEME = "file://";
    public static final String INCENTIVIZED_BODY_TEXT = "INCENTIVIZED_BODY_TEXT";
    public static final String INCENTIVIZED_CLOSE_TEXT = "INCENTIVIZED_CLOSE_TEXT";
    public static final String INCENTIVIZED_CONTINUE_TEXT = "INCENTIVIZED_CONTINUE_TEXT";
    public static final String INCENTIVIZED_TITLE_TEXT = "INCENTIVIZED_TITLE_TEXT";
    public static final String KEY_VM = "vmURL";
    private static final String TAG = "AdPayload";
    private static final String UNKNOWN = "unknown";
    private com.vungle.ads.b adConfig;
    private final List<PlacementAdUnit> ads;
    private boolean assetsFullyDownloaded;
    private final g config;
    private Long expiryWindowStart;
    private Map<String, String> incentivizedTextSettings;
    private String indexFilePath;
    private p logEntry;
    private ConcurrentHashMap<String, String> mraidFiles;
    private final Map<String, com.vungle.ads.internal.model.a> partialDownloadAssets;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements l0 {
        public static final a INSTANCE;
        public static final /* synthetic */ rm.f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            g2 g2Var = new g2("com.vungle.ads.internal.model.AdPayload", aVar, 7);
            g2Var.p(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, true);
            g2Var.p("config", true);
            g2Var.p("expiryWindowStart", true);
            g2Var.p("mraidFiles", true);
            g2Var.p("incentivizedTextSettings", true);
            g2Var.p("assetsFullyDownloaded", true);
            g2Var.p("indexFilePath", true);
            descriptor = g2Var;
        }

        private a() {
        }

        @Override // tm.l0
        public pm.d[] childSerializers() {
            pm.d dVarT = qm.a.t(new tm.f(PlacementAdUnit.a.INSTANCE));
            pm.d dVarT2 = qm.a.t(g.a.INSTANCE);
            pm.d dVarT3 = qm.a.t(f1.f53474a);
            zl.c cVarB = kotlin.jvm.internal.l0.b(ConcurrentHashMap.class);
            v2 v2Var = v2.f53598a;
            return new pm.d[]{dVarT, dVarT2, dVarT3, new pm.b(cVarB, null, new pm.d[]{v2Var, v2Var}), new z0(v2Var, v2Var), tm.i.f53507a, qm.a.t(v2Var)};
        }

        @Override // pm.c
        public b deserialize(sm.e decoder) {
            Object objE;
            Object objE2;
            boolean z10;
            Object objN;
            Object objN2;
            int i10;
            Object objE3;
            Object objE4;
            char c10;
            s.h(decoder, "decoder");
            rm.f descriptor2 = getDescriptor();
            sm.c cVarB = decoder.b(descriptor2);
            int i11 = 6;
            int i12 = 5;
            if (cVarB.l()) {
                objE = cVarB.e(descriptor2, 0, new tm.f(PlacementAdUnit.a.INSTANCE), null);
                objE4 = cVarB.e(descriptor2, 1, g.a.INSTANCE, null);
                objE3 = cVarB.e(descriptor2, 2, f1.f53474a, null);
                zl.c cVarB2 = kotlin.jvm.internal.l0.b(ConcurrentHashMap.class);
                v2 v2Var = v2.f53598a;
                objN = cVarB.n(descriptor2, 3, new pm.b(cVarB2, null, new pm.d[]{v2Var, v2Var}), null);
                objN2 = cVarB.n(descriptor2, 4, new z0(v2Var, v2Var), null);
                boolean zX = cVarB.x(descriptor2, 5);
                objE2 = cVarB.e(descriptor2, 6, v2Var, null);
                i10 = Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
                z10 = zX;
            } else {
                boolean z11 = true;
                boolean zX2 = false;
                int i13 = 0;
                objE = null;
                Object objE5 = null;
                Object objE6 = null;
                Object objE7 = null;
                Object objN3 = null;
                Object objN4 = null;
                while (z11) {
                    int iO = cVarB.o(descriptor2);
                    switch (iO) {
                        case -1:
                            z11 = false;
                            i12 = 5;
                            break;
                        case 0:
                            objE = cVarB.e(descriptor2, 0, new tm.f(PlacementAdUnit.a.INSTANCE), objE);
                            i13 |= 1;
                            i11 = 6;
                            i12 = 5;
                            break;
                        case 1:
                            objE6 = cVarB.e(descriptor2, 1, g.a.INSTANCE, objE6);
                            i13 |= 2;
                            i11 = 6;
                            i12 = 5;
                            break;
                        case 2:
                            c10 = 3;
                            objE5 = cVarB.e(descriptor2, 2, f1.f53474a, objE5);
                            i13 |= 4;
                            i11 = 6;
                            i12 = 5;
                            break;
                        case 3:
                            zl.c cVarB3 = kotlin.jvm.internal.l0.b(ConcurrentHashMap.class);
                            v2 v2Var2 = v2.f53598a;
                            c10 = 3;
                            objN3 = cVarB.n(descriptor2, 3, new pm.b(cVarB3, null, new pm.d[]{v2Var2, v2Var2}), objN3);
                            i13 |= 8;
                            i11 = 6;
                            i12 = 5;
                            break;
                        case 4:
                            v2 v2Var3 = v2.f53598a;
                            objN4 = cVarB.n(descriptor2, 4, new z0(v2Var3, v2Var3), objN4);
                            i13 |= 16;
                            i11 = 6;
                            break;
                        case 5:
                            zX2 = cVarB.x(descriptor2, i12);
                            i13 |= 32;
                            break;
                        case 6:
                            objE7 = cVarB.e(descriptor2, i11, v2.f53598a, objE7);
                            i13 |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iO);
                    }
                }
                objE2 = objE7;
                z10 = zX2;
                objN = objN3;
                objN2 = objN4;
                i10 = i13;
                objE3 = objE5;
                objE4 = objE6;
            }
            cVarB.d(descriptor2);
            return new b(i10, (List) objE, (g) objE4, (Long) objE3, (ConcurrentHashMap) objN, (Map) objN2, z10, (String) objE2, null);
        }

        @Override // pm.d, pm.l, pm.c
        public rm.f getDescriptor() {
            return descriptor;
        }

        @Override // pm.l
        public void serialize(sm.f encoder, b value) {
            s.h(encoder, "encoder");
            s.h(value, "value");
            rm.f descriptor2 = getDescriptor();
            sm.d dVarB = encoder.b(descriptor2);
            b.write$Self(value, dVarB, descriptor2);
            dVarB.d(descriptor2);
        }

        @Override // tm.l0
        public pm.d[] typeParametersSerializers() {
            return l0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$b, reason: collision with other inner class name and from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J(\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0014R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0014¨\u0006*"}, d2 = {"Lcom/vungle/ads/internal/model/b$b;", "", "", "width", "height", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/b$b;Lsm/d;Lrm/f;)V", "component1", "()Ljava/lang/Integer;", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/b$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getWidth", "getWidth$annotations", "()V", "getHeight", "getHeight$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class AdSizeInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Integer height;
        private final Integer width;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.AdPayload.AdSizeInfo", aVar, 2);
                g2Var.p("w", true);
                g2Var.p("h", true);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                u0 u0Var = u0.f53588a;
                return new pm.d[]{qm.a.t(u0Var), qm.a.t(u0Var)};
            }

            @Override // pm.c
            public AdSizeInfo deserialize(sm.e decoder) {
                Object objE;
                int i10;
                Object objE2;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                q2 q2Var = null;
                if (cVarB.l()) {
                    u0 u0Var = u0.f53588a;
                    objE2 = cVarB.e(descriptor2, 0, u0Var, null);
                    objE = cVarB.e(descriptor2, 1, u0Var, null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    objE = null;
                    Object objE3 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            objE3 = cVarB.e(descriptor2, 0, u0.f53588a, objE3);
                            i11 |= 1;
                        } else {
                            if (iO != 1) {
                                throw new UnknownFieldException(iO);
                            }
                            objE = cVarB.e(descriptor2, 1, u0.f53588a, objE);
                            i11 |= 2;
                        }
                    }
                    i10 = i11;
                    objE2 = objE3;
                }
                cVarB.d(descriptor2);
                return new AdSizeInfo(i10, (Integer) objE2, (Integer) objE, q2Var);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, AdSizeInfo value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                AdSizeInfo.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$b$b, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final pm.d serializer() {
                return a.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AdSizeInfo() {
            this((Integer) null, (Integer) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ AdSizeInfo copy$default(AdSizeInfo adSizeInfo, Integer num, Integer num2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = adSizeInfo.width;
            }
            if ((i10 & 2) != 0) {
                num2 = adSizeInfo.height;
            }
            return adSizeInfo.copy(num, num2);
        }

        public static final void write$Self(AdSizeInfo self, sm.d output, rm.f serialDesc) {
            Integer num;
            Integer num2;
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            if (output.k(serialDesc, 0) || (num2 = self.width) == null || num2.intValue() != 0) {
                output.w(serialDesc, 0, u0.f53588a, self.width);
            }
            if (output.k(serialDesc, 1) || (num = self.height) == null || num.intValue() != 0) {
                output.w(serialDesc, 1, u0.f53588a, self.height);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getHeight() {
            return this.height;
        }

        public final AdSizeInfo copy(Integer width, Integer height) {
            return new AdSizeInfo(width, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdSizeInfo)) {
                return false;
            }
            AdSizeInfo adSizeInfo = (AdSizeInfo) other;
            return s.c(this.width, adSizeInfo.width) && s.c(this.height, adSizeInfo.height);
        }

        public final Integer getHeight() {
            return this.height;
        }

        public final Integer getWidth() {
            return this.width;
        }

        public int hashCode() {
            Integer num = this.width;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.height;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "AdSizeInfo(width=" + this.width + ", height=" + this.height + ')';
        }

        public AdSizeInfo(Integer num, Integer num2) {
            this.width = num;
            this.height = num2;
        }

        public /* synthetic */ AdSizeInfo(int i10, Integer num, Integer num2, q2 q2Var) {
            if ((i10 & 1) == 0) {
                this.width = 0;
            } else {
                this.width = num;
            }
            if ((i10 & 2) == 0) {
                this.height = 0;
            } else {
                this.height = num2;
            }
        }

        public /* synthetic */ AdSizeInfo(Integer num, Integer num2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0 : num, (i10 & 2) != 0 ? 0 : num2);
        }

        public static /* synthetic */ void getHeight$annotations() {
        }

        public static /* synthetic */ void getWidth$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b{\b\u0087\b\u0018\u0000 ¬\u00012\u00020\u0001:\u0004\u00ad\u0001®\u0001B\u008d\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u001c\b\u0002\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b)\u0010*B¡\u0003\b\u0017\u0012\u0006\u0010+\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u001c\b\u0001\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012\u0012\u0010\b\u0001\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b)\u0010.J(\u00105\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202HÇ\u0001¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u00108J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u00108J\u0012\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b=\u0010<J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u00108J\u0012\u0010?\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bA\u0010@J\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u00108J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u00108J\u0012\u0010D\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bD\u0010<J\u0012\u0010E\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bE\u0010<J$\u0010F\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0012\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u00108J\u0012\u0010I\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u00108J\u0012\u0010J\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bJ\u00108J\u0018\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0018\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bM\u0010LJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bP\u00108J\u0012\u0010Q\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bS\u00108J\u0012\u0010T\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bT\u00108J\u0012\u0010U\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bU\u0010<J\u0012\u0010V\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bV\u0010<J\u0012\u0010W\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0012\u0010Y\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0012\u0010[\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b[\u0010@J\u0012\u0010\\\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\\\u0010@J\u0012\u0010]\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b]\u0010<J\u0096\u0003\u0010^\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u001c\b\u0002\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00122\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00122\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b`\u00108J\u0010\u0010a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\ba\u0010bJ\u001a\u0010d\u001a\u00020\n2\b\u0010c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bd\u0010eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010f\u0012\u0004\bh\u0010i\u001a\u0004\bg\u00108R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010f\u0012\u0004\bk\u0010i\u001a\u0004\bj\u00108R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010f\u0012\u0004\bm\u0010i\u001a\u0004\bl\u00108R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010n\u0012\u0004\bp\u0010i\u001a\u0004\bo\u0010<R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010n\u0012\u0004\br\u0010i\u001a\u0004\bq\u0010<R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010f\u0012\u0004\bt\u0010i\u001a\u0004\bs\u00108R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010u\u0012\u0004\bw\u0010i\u001a\u0004\bv\u0010@R\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010u\u0012\u0004\by\u0010i\u001a\u0004\bx\u0010@R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010f\u0012\u0004\b{\u0010i\u001a\u0004\bz\u00108R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010f\u0012\u0004\b}\u0010i\u001a\u0004\b|\u00108R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010n\u0012\u0004\b\u007f\u0010i\u001a\u0004\b~\u0010<R$\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0010\u0010n\u0012\u0005\b\u0081\u0001\u0010i\u001a\u0005\b\u0080\u0001\u0010<R7\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0013\u0010\u0082\u0001\u0012\u0005\b\u0084\u0001\u0010i\u001a\u0005\b\u0083\u0001\u0010GR$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0014\u0010f\u0012\u0005\b\u0086\u0001\u0010i\u001a\u0005\b\u0085\u0001\u00108R$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0015\u0010f\u0012\u0005\b\u0088\u0001\u0010i\u001a\u0005\b\u0087\u0001\u00108R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0016\u0010f\u0012\u0005\b\u008a\u0001\u0010i\u001a\u0005\b\u0089\u0001\u00108R+\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0017\u0010\u008b\u0001\u0012\u0005\b\u008d\u0001\u0010i\u001a\u0005\b\u008c\u0001\u0010LR+\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0018\u0010\u008b\u0001\u0012\u0005\b\u008f\u0001\u0010i\u001a\u0005\b\u008e\u0001\u0010LR%\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001a\u0010\u0090\u0001\u0012\u0005\b\u0092\u0001\u0010i\u001a\u0005\b\u0091\u0001\u0010OR$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001b\u0010f\u0012\u0005\b\u0094\u0001\u0010i\u001a\u0005\b\u0093\u0001\u00108R%\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001d\u0010\u0095\u0001\u0012\u0005\b\u0097\u0001\u0010i\u001a\u0005\b\u0096\u0001\u0010RR$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001e\u0010f\u0012\u0005\b\u0099\u0001\u0010i\u001a\u0005\b\u0098\u0001\u00108R$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001f\u0010f\u0012\u0005\b\u009b\u0001\u0010i\u001a\u0005\b\u009a\u0001\u00108R$\u0010 \u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b \u0010n\u0012\u0005\b\u009d\u0001\u0010i\u001a\u0005\b\u009c\u0001\u0010<R$\u0010!\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b!\u0010n\u0012\u0005\b\u009f\u0001\u0010i\u001a\u0005\b\u009e\u0001\u0010<R%\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b#\u0010 \u0001\u0012\u0005\b¢\u0001\u0010i\u001a\u0005\b¡\u0001\u0010XR%\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b%\u0010£\u0001\u0012\u0005\b¥\u0001\u0010i\u001a\u0005\b¤\u0001\u0010ZR$\u0010&\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b&\u0010u\u0012\u0005\b§\u0001\u0010i\u001a\u0005\b¦\u0001\u0010@R$\u0010'\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b'\u0010u\u0012\u0005\b©\u0001\u0010i\u001a\u0005\b¨\u0001\u0010@R$\u0010(\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b(\u0010n\u0012\u0005\b«\u0001\u0010i\u001a\u0005\bª\u0001\u0010<¨\u0006¯\u0001"}, d2 = {"Lcom/vungle/ads/internal/model/b$c;", "", "", "id", "adType", "adSource", "", "expiry", "expiryDuration", "deeplinkUrl", "", "clickCoordinatesEnabled", "adLoadOptimizationEnabled", "mediationName", "info", "sleep", "errorCode", "", "", "tpat", b.KEY_VM, "vmVersion", "adMarketId", "notification", "loadAdUrls", "Lcom/vungle/ads/internal/model/b$j;", "viewAbility", "templateType", "Lcom/vungle/ads/internal/model/b$h;", "templateSettings", "creativeId", "advAppId", "showClose", "showCloseIncentivized", "Lcom/vungle/ads/internal/model/b$b;", "adSizeInfo", "Lcom/vungle/ads/internal/model/b$l;", "webViewSettings", "usePreloading", "partialDownloadEnabled", "maxDownloadRetryAttempts", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/vungle/ads/internal/model/b$j;Ljava/lang/String;Lcom/vungle/ads/internal/model/b$h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/b$b;Lcom/vungle/ads/internal/model/b$l;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/vungle/ads/internal/model/b$j;Ljava/lang/String;Lcom/vungle/ads/internal/model/b$h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/b$b;Lcom/vungle/ads/internal/model/b$l;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/b$c;Lsm/d;Lrm/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "component10", "component11", "component12", "component13", "()Ljava/util/Map;", "component14", "component15", "component16", "component17", "()Ljava/util/List;", "component18", "component19", "()Lcom/vungle/ads/internal/model/b$j;", "component20", "component21", "()Lcom/vungle/ads/internal/model/b$h;", "component22", "component23", "component24", "component25", "component26", "()Lcom/vungle/ads/internal/model/b$b;", "component27", "()Lcom/vungle/ads/internal/model/b$l;", "component28", "component29", "component30", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/vungle/ads/internal/model/b$j;Ljava/lang/String;Lcom/vungle/ads/internal/model/b$h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/b$b;Lcom/vungle/ads/internal/model/b$l;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/b$c;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getAdType", "getAdType$annotations", "getAdSource", "getAdSource$annotations", "Ljava/lang/Integer;", "getExpiry", "getExpiry$annotations", "getExpiryDuration", "getExpiryDuration$annotations", "getDeeplinkUrl", "getDeeplinkUrl$annotations", "Ljava/lang/Boolean;", "getClickCoordinatesEnabled", "getClickCoordinatesEnabled$annotations", "getAdLoadOptimizationEnabled", "getAdLoadOptimizationEnabled$annotations", "getMediationName", "getMediationName$annotations", "getInfo", "getInfo$annotations", "getSleep", "getSleep$annotations", "getErrorCode", "getErrorCode$annotations", "Ljava/util/Map;", "getTpat", "getTpat$annotations", "getVmURL", "getVmURL$annotations", "getVmVersion", "getVmVersion$annotations", "getAdMarketId", "getAdMarketId$annotations", "Ljava/util/List;", "getNotification", "getNotification$annotations", "getLoadAdUrls", "getLoadAdUrls$annotations", "Lcom/vungle/ads/internal/model/b$j;", "getViewAbility", "getViewAbility$annotations", "getTemplateType", "getTemplateType$annotations", "Lcom/vungle/ads/internal/model/b$h;", "getTemplateSettings", "getTemplateSettings$annotations", "getCreativeId", "getCreativeId$annotations", "getAdvAppId", "getAdvAppId$annotations", "getShowClose", "getShowClose$annotations", "getShowCloseIncentivized", "getShowCloseIncentivized$annotations", "Lcom/vungle/ads/internal/model/b$b;", "getAdSizeInfo", "getAdSizeInfo$annotations", "Lcom/vungle/ads/internal/model/b$l;", "getWebViewSettings", "getWebViewSettings$annotations", "getUsePreloading", "getUsePreloading$annotations", "getPartialDownloadEnabled", "getPartialDownloadEnabled$annotations", "getMaxDownloadRetryAttempts", "getMaxDownloadRetryAttempts$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean adLoadOptimizationEnabled;
        private final String adMarketId;
        private final AdSizeInfo adSizeInfo;
        private final String adSource;
        private final String adType;
        private final String advAppId;
        private final Boolean clickCoordinatesEnabled;
        private final String creativeId;
        private final String deeplinkUrl;
        private final Integer errorCode;
        private final Integer expiry;
        private final Integer expiryDuration;
        private final String id;
        private final String info;
        private final List<String> loadAdUrls;
        private final Integer maxDownloadRetryAttempts;
        private final String mediationName;
        private final List<String> notification;
        private final Boolean partialDownloadEnabled;
        private final Integer showClose;
        private final Integer showCloseIncentivized;
        private final Integer sleep;
        private final TemplateSettings templateSettings;
        private final String templateType;
        private final Map<String, List<String>> tpat;
        private final Boolean usePreloading;
        private final ViewAbility viewAbility;
        private final String vmURL;
        private final String vmVersion;
        private final WebViewSettings webViewSettings;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        /* JADX INFO: loaded from: classes6.dex */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.AdPayload.AdUnit", aVar, 30);
                g2Var.p("id", true);
                g2Var.p("ad_type", true);
                g2Var.p("ad_source", true);
                g2Var.p("expiry", true);
                g2Var.p("expiry_duration", true);
                g2Var.p("deeplink_url", true);
                g2Var.p("click_coordinates_enabled", true);
                g2Var.p("ad_load_optimization", true);
                g2Var.p("mediation_name", true);
                g2Var.p("info", true);
                g2Var.p("sleep", true);
                g2Var.p("error_code", true);
                g2Var.p("tpat", true);
                g2Var.p("vm_url", true);
                g2Var.p("vm_version", true);
                g2Var.p("ad_market_id", true);
                g2Var.p("notification", true);
                g2Var.p(com.vungle.ads.internal.f.LOAD_AD, true);
                g2Var.p("viewability", true);
                g2Var.p("template_type", true);
                g2Var.p("template_settings", true);
                g2Var.p(CampaignEx.JSON_KEY_CREATIVE_ID, true);
                g2Var.p(MBridgeConstans.APP_ID, true);
                g2Var.p("show_close", true);
                g2Var.p("show_close_incentivized", true);
                g2Var.p("ad_size", true);
                g2Var.p("webview_settings", true);
                g2Var.p("use_preloading", true);
                g2Var.p("ad_partial_download_enabled", true);
                g2Var.p("max_download_retry_attempts", true);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                v2 v2Var = v2.f53598a;
                pm.d dVarT = qm.a.t(v2Var);
                pm.d dVarT2 = qm.a.t(v2Var);
                pm.d dVarT3 = qm.a.t(v2Var);
                u0 u0Var = u0.f53588a;
                pm.d dVarT4 = qm.a.t(u0Var);
                pm.d dVarT5 = qm.a.t(u0Var);
                pm.d dVarT6 = qm.a.t(v2Var);
                tm.i iVar = tm.i.f53507a;
                return new pm.d[]{dVarT, dVarT2, dVarT3, dVarT4, dVarT5, dVarT6, qm.a.t(iVar), qm.a.t(iVar), qm.a.t(v2Var), qm.a.t(v2Var), qm.a.t(u0Var), qm.a.t(u0Var), qm.a.t(i.INSTANCE), qm.a.t(v2Var), qm.a.t(v2Var), qm.a.t(v2Var), qm.a.t(new tm.f(v2Var)), qm.a.t(new tm.f(v2Var)), qm.a.t(ViewAbility.a.INSTANCE), qm.a.t(v2Var), qm.a.t(TemplateSettings.a.INSTANCE), qm.a.t(v2Var), qm.a.t(v2Var), qm.a.t(u0Var), qm.a.t(u0Var), qm.a.t(AdSizeInfo.a.INSTANCE), qm.a.t(WebViewSettings.a.INSTANCE), qm.a.t(iVar), qm.a.t(iVar), qm.a.t(u0Var)};
            }

            @Override // pm.c
            public c deserialize(sm.e decoder) {
                Object obj;
                Object objE;
                Object obj2;
                Object obj3;
                Object obj4;
                Object obj5;
                Object objE2;
                Object obj6;
                Object objE3;
                int i10;
                Object obj7;
                Object obj8;
                Object objE4;
                Object objE5;
                Object objE6;
                Object objE7;
                Object objE8;
                Object objE9;
                Object objE10;
                Object obj9;
                Object obj10;
                Object objE11;
                Object objE12;
                Object obj11;
                Object objE13;
                Object objE14;
                Object objE15;
                Object obj12;
                Object obj13;
                Object objE16;
                Object objE17;
                Object objE18;
                Object obj14;
                Object objE19;
                int i11;
                int i12;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                Object objE20 = null;
                if (cVarB.l()) {
                    v2 v2Var = v2.f53598a;
                    objE15 = cVarB.e(descriptor2, 0, v2Var, null);
                    Object objE21 = cVarB.e(descriptor2, 1, v2Var, null);
                    Object objE22 = cVarB.e(descriptor2, 2, v2Var, null);
                    u0 u0Var = u0.f53588a;
                    objE14 = cVarB.e(descriptor2, 3, u0Var, null);
                    objE10 = cVarB.e(descriptor2, 4, u0Var, null);
                    objE9 = cVarB.e(descriptor2, 5, v2Var, null);
                    tm.i iVar = tm.i.f53507a;
                    objE12 = cVarB.e(descriptor2, 6, iVar, null);
                    objE3 = cVarB.e(descriptor2, 7, iVar, null);
                    Object objE23 = cVarB.e(descriptor2, 8, v2Var, null);
                    objE11 = cVarB.e(descriptor2, 9, v2Var, null);
                    obj9 = objE22;
                    objE2 = cVarB.e(descriptor2, 10, u0Var, null);
                    Object objE24 = cVarB.e(descriptor2, 11, u0Var, null);
                    Object objE25 = cVarB.e(descriptor2, 12, i.INSTANCE, null);
                    Object objE26 = cVarB.e(descriptor2, 13, v2Var, null);
                    obj10 = objE25;
                    objE8 = cVarB.e(descriptor2, 14, v2Var, null);
                    objE7 = cVarB.e(descriptor2, 15, v2Var, null);
                    obj5 = objE26;
                    objE6 = cVarB.e(descriptor2, 16, new tm.f(v2Var), null);
                    objE5 = cVarB.e(descriptor2, 17, new tm.f(v2Var), null);
                    objE4 = cVarB.e(descriptor2, 18, ViewAbility.a.INSTANCE, null);
                    objE = cVarB.e(descriptor2, 19, v2Var, null);
                    Object objE27 = cVarB.e(descriptor2, 20, TemplateSettings.a.INSTANCE, null);
                    Object objE28 = cVarB.e(descriptor2, 21, v2Var, null);
                    obj8 = objE27;
                    Object objE29 = cVarB.e(descriptor2, 22, v2Var, null);
                    Object objE30 = cVarB.e(descriptor2, 23, u0Var, null);
                    objE17 = cVarB.e(descriptor2, 24, u0Var, null);
                    obj3 = objE30;
                    objE16 = cVarB.e(descriptor2, 25, AdSizeInfo.a.INSTANCE, null);
                    Object objE31 = cVarB.e(descriptor2, 26, WebViewSettings.a.INSTANCE, null);
                    Object objE32 = cVarB.e(descriptor2, 27, iVar, null);
                    obj13 = objE31;
                    Object objE33 = cVarB.e(descriptor2, 28, iVar, null);
                    objE13 = cVarB.e(descriptor2, 29, u0Var, null);
                    obj4 = objE32;
                    obj2 = objE28;
                    i10 = 1073741823;
                    obj6 = objE23;
                    obj = objE24;
                    obj11 = objE21;
                    obj12 = objE33;
                    obj7 = objE29;
                } else {
                    boolean z10 = true;
                    int i13 = 0;
                    Object obj15 = null;
                    Object objE34 = null;
                    Object objE35 = null;
                    Object objE36 = null;
                    Object obj16 = null;
                    Object obj17 = null;
                    Object obj18 = null;
                    Object obj19 = null;
                    Object obj20 = null;
                    Object obj21 = null;
                    Object obj22 = null;
                    obj = null;
                    Object obj23 = null;
                    Object obj24 = null;
                    Object obj25 = null;
                    Object obj26 = null;
                    Object obj27 = null;
                    Object obj28 = null;
                    Object obj29 = null;
                    Object obj30 = null;
                    Object obj31 = null;
                    Object obj32 = null;
                    Object obj33 = null;
                    Object obj34 = null;
                    Object obj35 = null;
                    Object obj36 = null;
                    Object obj37 = null;
                    Object obj38 = null;
                    Object obj39 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        switch (iO) {
                            case -1:
                                objE18 = obj39;
                                int i14 = i13;
                                g0 g0Var = g0.f38750a;
                                z10 = false;
                                obj14 = obj23;
                                obj16 = obj16;
                                objE20 = objE20;
                                i13 = i14;
                                obj39 = objE18;
                                objE34 = objE34;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 0:
                                int i15 = i13;
                                objE18 = cVarB.e(descriptor2, 0, v2.f53598a, obj39);
                                int i16 = i15 | 1;
                                g0 g0Var2 = g0.f38750a;
                                obj16 = obj16;
                                objE20 = objE20;
                                i13 = i16;
                                obj14 = obj23;
                                obj39 = objE18;
                                objE34 = objE34;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 1:
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i17 = i13;
                                Object objE37 = cVarB.e(descriptor2, 1, v2.f53598a, obj15);
                                int i18 = i17 | 2;
                                g0 g0Var3 = g0.f38750a;
                                obj16 = obj16;
                                objE20 = objE20;
                                i13 = i18;
                                obj14 = obj23;
                                objE34 = objE34;
                                obj15 = objE37;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 2:
                                obj15 = obj15;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i19 = i13;
                                Object obj40 = objE20;
                                Object objE38 = cVarB.e(descriptor2, 2, v2.f53598a, obj16);
                                g0 g0Var4 = g0.f38750a;
                                obj16 = objE38;
                                objE20 = obj40;
                                i13 = i19 | 4;
                                obj14 = obj23;
                                obj15 = obj15;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 3:
                                objE19 = obj23;
                                obj24 = obj24;
                                objE36 = cVarB.e(descriptor2, 3, u0.f53588a, objE36);
                                i11 = i13 | 8;
                                g0 g0Var5 = g0.f38750a;
                                obj14 = objE19;
                                obj16 = obj16;
                                objE20 = objE20;
                                obj15 = obj15;
                                i13 = i11;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 4:
                                objE19 = obj23;
                                obj24 = obj24;
                                objE35 = cVarB.e(descriptor2, 4, u0.f53588a, objE35);
                                i11 = i13 | 16;
                                g0 g0Var6 = g0.f38750a;
                                obj14 = objE19;
                                obj16 = obj16;
                                objE20 = objE20;
                                obj15 = obj15;
                                i13 = i11;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 5:
                                objE19 = obj23;
                                obj24 = obj24;
                                objE34 = cVarB.e(descriptor2, 5, v2.f53598a, objE34);
                                i11 = i13 | 32;
                                g0 g0Var7 = g0.f38750a;
                                obj14 = objE19;
                                obj16 = obj16;
                                objE20 = objE20;
                                obj15 = obj15;
                                i13 = i11;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 6:
                                Object objE39 = cVarB.e(descriptor2, 6, tm.i.f53507a, obj21);
                                i12 = i13 | 64;
                                g0 g0Var8 = g0.f38750a;
                                obj21 = objE39;
                                objE20 = objE20;
                                i13 = i12;
                                obj14 = obj23;
                                obj16 = obj16;
                                obj15 = obj15;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 7:
                                Object objE40 = cVarB.e(descriptor2, 7, tm.i.f53507a, obj22);
                                i12 = i13 | 128;
                                g0 g0Var9 = g0.f38750a;
                                obj22 = objE40;
                                objE20 = objE20;
                                i13 = i12;
                                obj14 = obj23;
                                obj16 = obj16;
                                obj15 = obj15;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 8:
                                Object objE41 = cVarB.e(descriptor2, 8, v2.f53598a, obj20);
                                i12 = i13 | 256;
                                g0 g0Var10 = g0.f38750a;
                                obj20 = objE41;
                                objE20 = objE20;
                                i13 = i12;
                                obj14 = obj23;
                                obj16 = obj16;
                                obj15 = obj15;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 9:
                                Object objE42 = cVarB.e(descriptor2, 9, v2.f53598a, obj19);
                                i12 = i13 | 512;
                                g0 g0Var11 = g0.f38750a;
                                obj19 = objE42;
                                objE20 = objE20;
                                i13 = i12;
                                obj14 = obj23;
                                obj16 = obj16;
                                obj15 = obj15;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 10:
                                Object objE43 = cVarB.e(descriptor2, 10, u0.f53588a, obj18);
                                i12 = i13 | UserVerificationMethods.USER_VERIFY_ALL;
                                g0 g0Var12 = g0.f38750a;
                                obj18 = objE43;
                                objE20 = objE20;
                                i13 = i12;
                                obj14 = obj23;
                                obj16 = obj16;
                                obj15 = obj15;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 11:
                                Object objE44 = cVarB.e(descriptor2, 11, u0.f53588a, obj);
                                i12 = i13 | 2048;
                                g0 g0Var13 = g0.f38750a;
                                obj = objE44;
                                objE20 = objE20;
                                i13 = i12;
                                obj14 = obj23;
                                obj16 = obj16;
                                obj15 = obj15;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 12:
                                Object objE45 = cVarB.e(descriptor2, 12, i.INSTANCE, obj17);
                                i12 = i13 | 4096;
                                g0 g0Var14 = g0.f38750a;
                                obj17 = objE45;
                                objE20 = objE20;
                                i13 = i12;
                                obj14 = obj23;
                                obj16 = obj16;
                                obj15 = obj15;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 13:
                                obj24 = obj24;
                                objE19 = cVarB.e(descriptor2, 13, v2.f53598a, obj23);
                                i11 = i13 | 8192;
                                g0 g0Var15 = g0.f38750a;
                                obj14 = objE19;
                                obj16 = obj16;
                                objE20 = objE20;
                                obj15 = obj15;
                                i13 = i11;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 14:
                                obj15 = obj15;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i20 = i13;
                                objE20 = objE20;
                                obj25 = obj25;
                                Object objE46 = cVarB.e(descriptor2, 14, v2.f53598a, obj24);
                                i11 = i20 | 16384;
                                g0 g0Var16 = g0.f38750a;
                                obj24 = objE46;
                                obj16 = obj16;
                                obj14 = obj23;
                                objE20 = objE20;
                                obj15 = obj15;
                                i13 = i11;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 15:
                                obj15 = obj15;
                                Object obj41 = obj16;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i21 = i13;
                                objE20 = objE20;
                                obj26 = obj26;
                                Object objE47 = cVarB.e(descriptor2, 15, v2.f53598a, obj25);
                                i11 = i21 | 32768;
                                g0 g0Var17 = g0.f38750a;
                                obj25 = objE47;
                                obj16 = obj41;
                                obj14 = obj23;
                                obj24 = obj24;
                                objE20 = objE20;
                                obj15 = obj15;
                                i13 = i11;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 16:
                                obj15 = obj15;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i22 = i13;
                                objE20 = objE20;
                                obj27 = obj27;
                                Object objE48 = cVarB.e(descriptor2, 16, new tm.f(v2.f53598a), obj26);
                                i11 = i22 | C.DEFAULT_BUFFER_SEGMENT_SIZE;
                                g0 g0Var18 = g0.f38750a;
                                obj26 = objE48;
                                obj16 = obj16;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                objE20 = objE20;
                                obj15 = obj15;
                                i13 = i11;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 17:
                                obj15 = obj15;
                                Object obj42 = obj16;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i23 = i13;
                                objE20 = objE20;
                                obj28 = obj28;
                                Object objE49 = cVarB.e(descriptor2, 17, new tm.f(v2.f53598a), obj27);
                                i11 = i23 | 131072;
                                g0 g0Var19 = g0.f38750a;
                                obj27 = objE49;
                                obj16 = obj42;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                objE20 = objE20;
                                obj15 = obj15;
                                i13 = i11;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 18:
                                obj15 = obj15;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i24 = i13;
                                objE20 = objE20;
                                obj29 = obj29;
                                Object objE50 = cVarB.e(descriptor2, 18, ViewAbility.a.INSTANCE, obj28);
                                i11 = i24 | MediaHttpUploader.MINIMUM_CHUNK_SIZE;
                                g0 g0Var20 = g0.f38750a;
                                obj28 = objE50;
                                obj16 = obj16;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                objE20 = objE20;
                                obj15 = obj15;
                                i13 = i11;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 19:
                                obj15 = obj15;
                                Object obj43 = obj16;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i25 = i13;
                                objE20 = objE20;
                                obj30 = obj30;
                                Object objE51 = cVarB.e(descriptor2, 19, v2.f53598a, obj29);
                                i11 = i25 | 524288;
                                g0 g0Var21 = g0.f38750a;
                                obj29 = objE51;
                                obj16 = obj43;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                objE20 = objE20;
                                obj15 = obj15;
                                i13 = i11;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 20:
                                obj15 = obj15;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i26 = i13;
                                objE20 = objE20;
                                obj31 = obj31;
                                Object objE52 = cVarB.e(descriptor2, 20, TemplateSettings.a.INSTANCE, obj30);
                                i11 = i26 | ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                g0 g0Var22 = g0.f38750a;
                                obj30 = objE52;
                                obj16 = obj16;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                objE20 = objE20;
                                obj15 = obj15;
                                i13 = i11;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 21:
                                obj15 = obj15;
                                Object obj44 = obj16;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i27 = i13;
                                objE20 = objE20;
                                obj32 = obj32;
                                Object objE53 = cVarB.e(descriptor2, 21, v2.f53598a, obj31);
                                i11 = i27 | 2097152;
                                g0 g0Var23 = g0.f38750a;
                                obj31 = objE53;
                                obj16 = obj44;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                objE20 = objE20;
                                obj15 = obj15;
                                i13 = i11;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 22:
                                obj15 = obj15;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i28 = i13;
                                objE20 = objE20;
                                obj33 = obj33;
                                Object objE54 = cVarB.e(descriptor2, 22, v2.f53598a, obj32);
                                i11 = i28 | 4194304;
                                g0 g0Var24 = g0.f38750a;
                                obj32 = objE54;
                                obj16 = obj16;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                objE20 = objE20;
                                obj15 = obj15;
                                i13 = i11;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 23:
                                obj15 = obj15;
                                Object obj45 = obj16;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i29 = i13;
                                objE20 = objE20;
                                obj34 = obj34;
                                Object objE55 = cVarB.e(descriptor2, 23, u0.f53588a, obj33);
                                i11 = i29 | 8388608;
                                g0 g0Var25 = g0.f38750a;
                                obj33 = objE55;
                                obj16 = obj45;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                objE20 = objE20;
                                obj15 = obj15;
                                i13 = i11;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 24:
                                obj15 = obj15;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i30 = i13;
                                objE20 = objE20;
                                obj35 = obj35;
                                Object objE56 = cVarB.e(descriptor2, 24, u0.f53588a, obj34);
                                i11 = i30 | C.DEFAULT_MUXED_BUFFER_SIZE;
                                g0 g0Var26 = g0.f38750a;
                                obj34 = objE56;
                                obj16 = obj16;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                objE20 = objE20;
                                obj15 = obj15;
                                i13 = i11;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 25:
                                obj15 = obj15;
                                Object obj46 = obj16;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i31 = i13;
                                objE20 = objE20;
                                obj36 = obj36;
                                Object objE57 = cVarB.e(descriptor2, 25, AdSizeInfo.a.INSTANCE, obj35);
                                i11 = i31 | MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                                g0 g0Var27 = g0.f38750a;
                                obj35 = objE57;
                                obj16 = obj46;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                objE20 = objE20;
                                obj15 = obj15;
                                i13 = i11;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 26:
                                obj15 = obj15;
                                obj38 = obj38;
                                int i32 = i13;
                                objE20 = objE20;
                                obj37 = obj37;
                                Object objE58 = cVarB.e(descriptor2, 26, WebViewSettings.a.INSTANCE, obj36);
                                i11 = i32 | 67108864;
                                g0 g0Var28 = g0.f38750a;
                                obj36 = objE58;
                                obj16 = obj16;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                objE20 = objE20;
                                obj15 = obj15;
                                i13 = i11;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 27:
                                obj15 = obj15;
                                Object obj47 = obj16;
                                int i33 = i13;
                                objE20 = objE20;
                                obj38 = obj38;
                                Object objE59 = cVarB.e(descriptor2, 27, tm.i.f53507a, obj37);
                                i11 = i33 | 134217728;
                                g0 g0Var29 = g0.f38750a;
                                obj37 = objE59;
                                obj16 = obj47;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                objE20 = objE20;
                                obj15 = obj15;
                                i13 = i11;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 28:
                                obj15 = obj15;
                                int i34 = i13;
                                objE20 = objE20;
                                Object objE60 = cVarB.e(descriptor2, 28, tm.i.f53507a, obj38);
                                i11 = i34 | 268435456;
                                g0 g0Var30 = g0.f38750a;
                                obj38 = objE60;
                                obj16 = obj16;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                objE20 = objE20;
                                obj15 = obj15;
                                i13 = i11;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 29:
                                obj15 = obj15;
                                objE20 = cVarB.e(descriptor2, 29, u0.f53588a, objE20);
                                i13 |= 536870912;
                                g0 g0Var31 = g0.f38750a;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                obj15 = obj15;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            default:
                                throw new UnknownFieldException(iO);
                        }
                    }
                    Object obj48 = objE34;
                    objE = obj29;
                    obj2 = obj31;
                    obj3 = obj33;
                    obj4 = obj37;
                    Object obj49 = obj39;
                    int i35 = i13;
                    Object obj50 = obj15;
                    Object obj51 = objE20;
                    Object obj52 = obj16;
                    obj5 = obj23;
                    objE2 = obj18;
                    obj6 = obj20;
                    objE3 = obj22;
                    i10 = i35;
                    obj7 = obj32;
                    obj8 = obj30;
                    objE4 = obj28;
                    objE5 = obj27;
                    objE6 = obj26;
                    objE7 = obj25;
                    objE8 = obj24;
                    objE9 = obj48;
                    objE10 = objE35;
                    obj9 = obj52;
                    obj10 = obj17;
                    objE11 = obj19;
                    objE12 = obj21;
                    obj11 = obj50;
                    objE13 = obj51;
                    objE14 = objE36;
                    objE15 = obj49;
                    obj12 = obj38;
                    obj13 = obj36;
                    objE16 = obj35;
                    objE17 = obj34;
                }
                cVarB.d(descriptor2);
                return new c(i10, (String) objE15, (String) obj11, (String) obj9, (Integer) objE14, (Integer) objE10, (String) objE9, (Boolean) objE12, (Boolean) objE3, (String) obj6, (String) objE11, (Integer) objE2, (Integer) obj, (Map) obj10, (String) obj5, (String) objE8, (String) objE7, (List) objE6, (List) objE5, (ViewAbility) objE4, (String) objE, (TemplateSettings) obj8, (String) obj2, (String) obj7, (Integer) obj3, (Integer) objE17, (AdSizeInfo) objE16, (WebViewSettings) obj13, (Boolean) obj4, (Boolean) obj12, (Integer) objE13, (q2) null);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, c value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                c.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$c$b, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        /* JADX INFO: loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final pm.d serializer() {
                return a.INSTANCE;
            }

            private Companion() {
            }
        }

        public c() {
            this((String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Integer) null, (Map) null, (String) null, (String) null, (String) null, (List) null, (List) null, (ViewAbility) null, (String) null, (TemplateSettings) null, (String) null, (String) null, (Integer) null, (Integer) null, (AdSizeInfo) null, (WebViewSettings) null, (Boolean) null, (Boolean) null, (Integer) null, 1073741823, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c copy$default(c cVar, String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, String str5, String str6, Integer num3, Integer num4, Map map, String str7, String str8, String str9, List list, List list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num5, Integer num6, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool3, Boolean bool4, Integer num7, int i10, Object obj) {
            Integer num8;
            Boolean bool5;
            String str13 = (i10 & 1) != 0 ? cVar.id : str;
            String str14 = (i10 & 2) != 0 ? cVar.adType : str2;
            String str15 = (i10 & 4) != 0 ? cVar.adSource : str3;
            Integer num9 = (i10 & 8) != 0 ? cVar.expiry : num;
            Integer num10 = (i10 & 16) != 0 ? cVar.expiryDuration : num2;
            String str16 = (i10 & 32) != 0 ? cVar.deeplinkUrl : str4;
            Boolean bool6 = (i10 & 64) != 0 ? cVar.clickCoordinatesEnabled : bool;
            Boolean bool7 = (i10 & 128) != 0 ? cVar.adLoadOptimizationEnabled : bool2;
            String str17 = (i10 & 256) != 0 ? cVar.mediationName : str5;
            String str18 = (i10 & 512) != 0 ? cVar.info : str6;
            Integer num11 = (i10 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cVar.sleep : num3;
            Integer num12 = (i10 & 2048) != 0 ? cVar.errorCode : num4;
            Map map2 = (i10 & 4096) != 0 ? cVar.tpat : map;
            String str19 = (i10 & 8192) != 0 ? cVar.vmURL : str7;
            String str20 = str13;
            String str21 = (i10 & 16384) != 0 ? cVar.vmVersion : str8;
            String str22 = (i10 & 32768) != 0 ? cVar.adMarketId : str9;
            List list3 = (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? cVar.notification : list;
            List list4 = (i10 & 131072) != 0 ? cVar.loadAdUrls : list2;
            ViewAbility viewAbility2 = (i10 & MediaHttpUploader.MINIMUM_CHUNK_SIZE) != 0 ? cVar.viewAbility : viewAbility;
            String str23 = (i10 & 524288) != 0 ? cVar.templateType : str10;
            TemplateSettings templateSettings2 = (i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? cVar.templateSettings : templateSettings;
            String str24 = (i10 & 2097152) != 0 ? cVar.creativeId : str11;
            String str25 = (i10 & 4194304) != 0 ? cVar.advAppId : str12;
            Integer num13 = (i10 & 8388608) != 0 ? cVar.showClose : num5;
            Integer num14 = (i10 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? cVar.showCloseIncentivized : num6;
            AdSizeInfo adSizeInfo2 = (i10 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? cVar.adSizeInfo : adSizeInfo;
            WebViewSettings webViewSettings2 = (i10 & 67108864) != 0 ? cVar.webViewSettings : webViewSettings;
            Boolean bool8 = (i10 & 134217728) != 0 ? cVar.usePreloading : bool3;
            Boolean bool9 = (i10 & 268435456) != 0 ? cVar.partialDownloadEnabled : bool4;
            if ((i10 & 536870912) != 0) {
                bool5 = bool9;
                num8 = cVar.maxDownloadRetryAttempts;
            } else {
                num8 = num7;
                bool5 = bool9;
            }
            return cVar.copy(str20, str14, str15, num9, num10, str16, bool6, bool7, str17, str18, num11, num12, map2, str19, str21, str22, list3, list4, viewAbility2, str23, templateSettings2, str24, str25, num13, num14, adSizeInfo2, webViewSettings2, bool8, bool5, num8);
        }

        public static /* synthetic */ void getAdLoadOptimizationEnabled$annotations() {
        }

        public static /* synthetic */ void getAdMarketId$annotations() {
        }

        public static /* synthetic */ void getAdSizeInfo$annotations() {
        }

        public static /* synthetic */ void getAdSource$annotations() {
        }

        public static /* synthetic */ void getAdType$annotations() {
        }

        public static /* synthetic */ void getAdvAppId$annotations() {
        }

        public static /* synthetic */ void getClickCoordinatesEnabled$annotations() {
        }

        public static /* synthetic */ void getCreativeId$annotations() {
        }

        public static /* synthetic */ void getDeeplinkUrl$annotations() {
        }

        public static /* synthetic */ void getErrorCode$annotations() {
        }

        public static /* synthetic */ void getExpiry$annotations() {
        }

        public static /* synthetic */ void getExpiryDuration$annotations() {
        }

        public static /* synthetic */ void getId$annotations() {
        }

        public static /* synthetic */ void getInfo$annotations() {
        }

        public static /* synthetic */ void getLoadAdUrls$annotations() {
        }

        public static /* synthetic */ void getMaxDownloadRetryAttempts$annotations() {
        }

        public static /* synthetic */ void getMediationName$annotations() {
        }

        public static /* synthetic */ void getNotification$annotations() {
        }

        public static /* synthetic */ void getPartialDownloadEnabled$annotations() {
        }

        public static /* synthetic */ void getShowClose$annotations() {
        }

        public static /* synthetic */ void getShowCloseIncentivized$annotations() {
        }

        public static /* synthetic */ void getSleep$annotations() {
        }

        public static /* synthetic */ void getTemplateSettings$annotations() {
        }

        public static /* synthetic */ void getTemplateType$annotations() {
        }

        @pm.k(with = i.class)
        public static /* synthetic */ void getTpat$annotations() {
        }

        public static /* synthetic */ void getUsePreloading$annotations() {
        }

        public static /* synthetic */ void getViewAbility$annotations() {
        }

        public static /* synthetic */ void getVmURL$annotations() {
        }

        public static /* synthetic */ void getVmVersion$annotations() {
        }

        public static /* synthetic */ void getWebViewSettings$annotations() {
        }

        public static final void write$Self(c self, sm.d output, rm.f serialDesc) {
            Integer num;
            Integer num2;
            Integer num3;
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            if (output.k(serialDesc, 0) || self.id != null) {
                output.w(serialDesc, 0, v2.f53598a, self.id);
            }
            if (output.k(serialDesc, 1) || self.adType != null) {
                output.w(serialDesc, 1, v2.f53598a, self.adType);
            }
            if (output.k(serialDesc, 2) || self.adSource != null) {
                output.w(serialDesc, 2, v2.f53598a, self.adSource);
            }
            if (output.k(serialDesc, 3) || self.expiry != null) {
                output.w(serialDesc, 3, u0.f53588a, self.expiry);
            }
            if (output.k(serialDesc, 4) || self.expiryDuration != null) {
                output.w(serialDesc, 4, u0.f53588a, self.expiryDuration);
            }
            if (output.k(serialDesc, 5) || self.deeplinkUrl != null) {
                output.w(serialDesc, 5, v2.f53598a, self.deeplinkUrl);
            }
            if (output.k(serialDesc, 6) || self.clickCoordinatesEnabled != null) {
                output.w(serialDesc, 6, tm.i.f53507a, self.clickCoordinatesEnabled);
            }
            if (output.k(serialDesc, 7) || self.adLoadOptimizationEnabled != null) {
                output.w(serialDesc, 7, tm.i.f53507a, self.adLoadOptimizationEnabled);
            }
            if (output.k(serialDesc, 8) || self.mediationName != null) {
                output.w(serialDesc, 8, v2.f53598a, self.mediationName);
            }
            if (output.k(serialDesc, 9) || self.info != null) {
                output.w(serialDesc, 9, v2.f53598a, self.info);
            }
            if (output.k(serialDesc, 10) || self.sleep != null) {
                output.w(serialDesc, 10, u0.f53588a, self.sleep);
            }
            if (output.k(serialDesc, 11) || self.errorCode != null) {
                output.w(serialDesc, 11, u0.f53588a, self.errorCode);
            }
            if (output.k(serialDesc, 12) || self.tpat != null) {
                output.w(serialDesc, 12, i.INSTANCE, self.tpat);
            }
            if (output.k(serialDesc, 13) || self.vmURL != null) {
                output.w(serialDesc, 13, v2.f53598a, self.vmURL);
            }
            if (output.k(serialDesc, 14) || self.vmVersion != null) {
                output.w(serialDesc, 14, v2.f53598a, self.vmVersion);
            }
            if (output.k(serialDesc, 15) || self.adMarketId != null) {
                output.w(serialDesc, 15, v2.f53598a, self.adMarketId);
            }
            if (output.k(serialDesc, 16) || self.notification != null) {
                output.w(serialDesc, 16, new tm.f(v2.f53598a), self.notification);
            }
            if (output.k(serialDesc, 17) || self.loadAdUrls != null) {
                output.w(serialDesc, 17, new tm.f(v2.f53598a), self.loadAdUrls);
            }
            if (output.k(serialDesc, 18) || self.viewAbility != null) {
                output.w(serialDesc, 18, ViewAbility.a.INSTANCE, self.viewAbility);
            }
            if (output.k(serialDesc, 19) || self.templateType != null) {
                output.w(serialDesc, 19, v2.f53598a, self.templateType);
            }
            if (output.k(serialDesc, 20) || self.templateSettings != null) {
                output.w(serialDesc, 20, TemplateSettings.a.INSTANCE, self.templateSettings);
            }
            if (output.k(serialDesc, 21) || self.creativeId != null) {
                output.w(serialDesc, 21, v2.f53598a, self.creativeId);
            }
            if (output.k(serialDesc, 22) || self.advAppId != null) {
                output.w(serialDesc, 22, v2.f53598a, self.advAppId);
            }
            if (output.k(serialDesc, 23) || (num3 = self.showClose) == null || num3.intValue() != 0) {
                output.w(serialDesc, 23, u0.f53588a, self.showClose);
            }
            if (output.k(serialDesc, 24) || (num2 = self.showCloseIncentivized) == null || num2.intValue() != 0) {
                output.w(serialDesc, 24, u0.f53588a, self.showCloseIncentivized);
            }
            if (output.k(serialDesc, 25) || self.adSizeInfo != null) {
                output.w(serialDesc, 25, AdSizeInfo.a.INSTANCE, self.adSizeInfo);
            }
            if (output.k(serialDesc, 26) || self.webViewSettings != null) {
                output.w(serialDesc, 26, WebViewSettings.a.INSTANCE, self.webViewSettings);
            }
            if (output.k(serialDesc, 27) || !s.c(self.usePreloading, Boolean.FALSE)) {
                output.w(serialDesc, 27, tm.i.f53507a, self.usePreloading);
            }
            if (output.k(serialDesc, 28) || self.partialDownloadEnabled != null) {
                output.w(serialDesc, 28, tm.i.f53507a, self.partialDownloadEnabled);
            }
            if (output.k(serialDesc, 29) || (num = self.maxDownloadRetryAttempts) == null || num.intValue() != 0) {
                output.w(serialDesc, 29, u0.f53588a, self.maxDownloadRetryAttempts);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getInfo() {
            return this.info;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final Integer getSleep() {
            return this.sleep;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final Map<String, List<String>> component13() {
            return this.tpat;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final String getVmURL() {
            return this.vmURL;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final String getVmVersion() {
            return this.vmVersion;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final String getAdMarketId() {
            return this.adMarketId;
        }

        public final List<String> component17() {
            return this.notification;
        }

        public final List<String> component18() {
            return this.loadAdUrls;
        }

        /* JADX INFO: renamed from: component19, reason: from getter */
        public final ViewAbility getViewAbility() {
            return this.viewAbility;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAdType() {
            return this.adType;
        }

        /* JADX INFO: renamed from: component20, reason: from getter */
        public final String getTemplateType() {
            return this.templateType;
        }

        /* JADX INFO: renamed from: component21, reason: from getter */
        public final TemplateSettings getTemplateSettings() {
            return this.templateSettings;
        }

        /* JADX INFO: renamed from: component22, reason: from getter */
        public final String getCreativeId() {
            return this.creativeId;
        }

        /* JADX INFO: renamed from: component23, reason: from getter */
        public final String getAdvAppId() {
            return this.advAppId;
        }

        /* JADX INFO: renamed from: component24, reason: from getter */
        public final Integer getShowClose() {
            return this.showClose;
        }

        /* JADX INFO: renamed from: component25, reason: from getter */
        public final Integer getShowCloseIncentivized() {
            return this.showCloseIncentivized;
        }

        /* JADX INFO: renamed from: component26, reason: from getter */
        public final AdSizeInfo getAdSizeInfo() {
            return this.adSizeInfo;
        }

        /* JADX INFO: renamed from: component27, reason: from getter */
        public final WebViewSettings getWebViewSettings() {
            return this.webViewSettings;
        }

        /* JADX INFO: renamed from: component28, reason: from getter */
        public final Boolean getUsePreloading() {
            return this.usePreloading;
        }

        /* JADX INFO: renamed from: component29, reason: from getter */
        public final Boolean getPartialDownloadEnabled() {
            return this.partialDownloadEnabled;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAdSource() {
            return this.adSource;
        }

        /* JADX INFO: renamed from: component30, reason: from getter */
        public final Integer getMaxDownloadRetryAttempts() {
            return this.maxDownloadRetryAttempts;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getExpiry() {
            return this.expiry;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Integer getExpiryDuration() {
            return this.expiryDuration;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getDeeplinkUrl() {
            return this.deeplinkUrl;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Boolean getClickCoordinatesEnabled() {
            return this.clickCoordinatesEnabled;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Boolean getAdLoadOptimizationEnabled() {
            return this.adLoadOptimizationEnabled;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getMediationName() {
            return this.mediationName;
        }

        public final c copy(String id2, String adType, String adSource, Integer expiry, Integer expiryDuration, String deeplinkUrl, Boolean clickCoordinatesEnabled, Boolean adLoadOptimizationEnabled, String mediationName, String info, Integer sleep, Integer errorCode, Map<String, ? extends List<String>> tpat, String vmURL, String vmVersion, String adMarketId, List<String> notification, List<String> loadAdUrls, ViewAbility viewAbility, String templateType, TemplateSettings templateSettings, String creativeId, String advAppId, Integer showClose, Integer showCloseIncentivized, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean usePreloading, Boolean partialDownloadEnabled, Integer maxDownloadRetryAttempts) {
            return new c(id2, adType, adSource, expiry, expiryDuration, deeplinkUrl, clickCoordinatesEnabled, adLoadOptimizationEnabled, mediationName, info, sleep, errorCode, tpat, vmURL, vmVersion, adMarketId, notification, loadAdUrls, viewAbility, templateType, templateSettings, creativeId, advAppId, showClose, showCloseIncentivized, adSizeInfo, webViewSettings, usePreloading, partialDownloadEnabled, maxDownloadRetryAttempts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return s.c(this.id, cVar.id) && s.c(this.adType, cVar.adType) && s.c(this.adSource, cVar.adSource) && s.c(this.expiry, cVar.expiry) && s.c(this.expiryDuration, cVar.expiryDuration) && s.c(this.deeplinkUrl, cVar.deeplinkUrl) && s.c(this.clickCoordinatesEnabled, cVar.clickCoordinatesEnabled) && s.c(this.adLoadOptimizationEnabled, cVar.adLoadOptimizationEnabled) && s.c(this.mediationName, cVar.mediationName) && s.c(this.info, cVar.info) && s.c(this.sleep, cVar.sleep) && s.c(this.errorCode, cVar.errorCode) && s.c(this.tpat, cVar.tpat) && s.c(this.vmURL, cVar.vmURL) && s.c(this.vmVersion, cVar.vmVersion) && s.c(this.adMarketId, cVar.adMarketId) && s.c(this.notification, cVar.notification) && s.c(this.loadAdUrls, cVar.loadAdUrls) && s.c(this.viewAbility, cVar.viewAbility) && s.c(this.templateType, cVar.templateType) && s.c(this.templateSettings, cVar.templateSettings) && s.c(this.creativeId, cVar.creativeId) && s.c(this.advAppId, cVar.advAppId) && s.c(this.showClose, cVar.showClose) && s.c(this.showCloseIncentivized, cVar.showCloseIncentivized) && s.c(this.adSizeInfo, cVar.adSizeInfo) && s.c(this.webViewSettings, cVar.webViewSettings) && s.c(this.usePreloading, cVar.usePreloading) && s.c(this.partialDownloadEnabled, cVar.partialDownloadEnabled) && s.c(this.maxDownloadRetryAttempts, cVar.maxDownloadRetryAttempts);
        }

        public final Boolean getAdLoadOptimizationEnabled() {
            return this.adLoadOptimizationEnabled;
        }

        public final String getAdMarketId() {
            return this.adMarketId;
        }

        public final AdSizeInfo getAdSizeInfo() {
            return this.adSizeInfo;
        }

        public final String getAdSource() {
            return this.adSource;
        }

        public final String getAdType() {
            return this.adType;
        }

        public final String getAdvAppId() {
            return this.advAppId;
        }

        public final Boolean getClickCoordinatesEnabled() {
            return this.clickCoordinatesEnabled;
        }

        public final String getCreativeId() {
            return this.creativeId;
        }

        public final String getDeeplinkUrl() {
            return this.deeplinkUrl;
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final Integer getExpiry() {
            return this.expiry;
        }

        public final Integer getExpiryDuration() {
            return this.expiryDuration;
        }

        public final String getId() {
            return this.id;
        }

        public final String getInfo() {
            return this.info;
        }

        public final List<String> getLoadAdUrls() {
            return this.loadAdUrls;
        }

        public final Integer getMaxDownloadRetryAttempts() {
            return this.maxDownloadRetryAttempts;
        }

        public final String getMediationName() {
            return this.mediationName;
        }

        public final List<String> getNotification() {
            return this.notification;
        }

        public final Boolean getPartialDownloadEnabled() {
            return this.partialDownloadEnabled;
        }

        public final Integer getShowClose() {
            return this.showClose;
        }

        public final Integer getShowCloseIncentivized() {
            return this.showCloseIncentivized;
        }

        public final Integer getSleep() {
            return this.sleep;
        }

        public final TemplateSettings getTemplateSettings() {
            return this.templateSettings;
        }

        public final String getTemplateType() {
            return this.templateType;
        }

        public final Map<String, List<String>> getTpat() {
            return this.tpat;
        }

        public final Boolean getUsePreloading() {
            return this.usePreloading;
        }

        public final ViewAbility getViewAbility() {
            return this.viewAbility;
        }

        public final String getVmURL() {
            return this.vmURL;
        }

        public final String getVmVersion() {
            return this.vmVersion;
        }

        public final WebViewSettings getWebViewSettings() {
            return this.webViewSettings;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.adType;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.adSource;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.expiry;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.expiryDuration;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str4 = this.deeplinkUrl;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.clickCoordinatesEnabled;
            int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.adLoadOptimizationEnabled;
            int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str5 = this.mediationName;
            int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.info;
            int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num3 = this.sleep;
            int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.errorCode;
            int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Map<String, List<String>> map = this.tpat;
            int iHashCode13 = (iHashCode12 + (map == null ? 0 : map.hashCode())) * 31;
            String str7 = this.vmURL;
            int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.vmVersion;
            int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.adMarketId;
            int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
            List<String> list = this.notification;
            int iHashCode17 = (iHashCode16 + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.loadAdUrls;
            int iHashCode18 = (iHashCode17 + (list2 == null ? 0 : list2.hashCode())) * 31;
            ViewAbility viewAbility = this.viewAbility;
            int iHashCode19 = (iHashCode18 + (viewAbility == null ? 0 : viewAbility.hashCode())) * 31;
            String str10 = this.templateType;
            int iHashCode20 = (iHashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
            TemplateSettings templateSettings = this.templateSettings;
            int iHashCode21 = (iHashCode20 + (templateSettings == null ? 0 : templateSettings.hashCode())) * 31;
            String str11 = this.creativeId;
            int iHashCode22 = (iHashCode21 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.advAppId;
            int iHashCode23 = (iHashCode22 + (str12 == null ? 0 : str12.hashCode())) * 31;
            Integer num5 = this.showClose;
            int iHashCode24 = (iHashCode23 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.showCloseIncentivized;
            int iHashCode25 = (iHashCode24 + (num6 == null ? 0 : num6.hashCode())) * 31;
            AdSizeInfo adSizeInfo = this.adSizeInfo;
            int iHashCode26 = (iHashCode25 + (adSizeInfo == null ? 0 : adSizeInfo.hashCode())) * 31;
            WebViewSettings webViewSettings = this.webViewSettings;
            int iHashCode27 = (iHashCode26 + (webViewSettings == null ? 0 : webViewSettings.hashCode())) * 31;
            Boolean bool3 = this.usePreloading;
            int iHashCode28 = (iHashCode27 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.partialDownloadEnabled;
            int iHashCode29 = (iHashCode28 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Integer num7 = this.maxDownloadRetryAttempts;
            return iHashCode29 + (num7 != null ? num7.hashCode() : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, String str5, String str6, Integer num3, Integer num4, Map<String, ? extends List<String>> map, String str7, String str8, String str9, List<String> list, List<String> list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num5, Integer num6, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool3, Boolean bool4, Integer num7) {
            this.id = str;
            this.adType = str2;
            this.adSource = str3;
            this.expiry = num;
            this.expiryDuration = num2;
            this.deeplinkUrl = str4;
            this.clickCoordinatesEnabled = bool;
            this.adLoadOptimizationEnabled = bool2;
            this.mediationName = str5;
            this.info = str6;
            this.sleep = num3;
            this.errorCode = num4;
            this.tpat = map;
            this.vmURL = str7;
            this.vmVersion = str8;
            this.adMarketId = str9;
            this.notification = list;
            this.loadAdUrls = list2;
            this.viewAbility = viewAbility;
            this.templateType = str10;
            this.templateSettings = templateSettings;
            this.creativeId = str11;
            this.advAppId = str12;
            this.showClose = num5;
            this.showCloseIncentivized = num6;
            this.adSizeInfo = adSizeInfo;
            this.webViewSettings = webViewSettings;
            this.usePreloading = bool3;
            this.partialDownloadEnabled = bool4;
            this.maxDownloadRetryAttempts = num7;
        }

        public String toString() {
            return "AdUnit(id=" + this.id + ", adType=" + this.adType + ", adSource=" + this.adSource + ", expiry=" + this.expiry + ", expiryDuration=" + this.expiryDuration + ", deeplinkUrl=" + this.deeplinkUrl + ", clickCoordinatesEnabled=" + this.clickCoordinatesEnabled + ", adLoadOptimizationEnabled=" + this.adLoadOptimizationEnabled + ", mediationName=" + this.mediationName + ", info=" + this.info + ", sleep=" + this.sleep + ", errorCode=" + this.errorCode + ", tpat=" + this.tpat + ", vmURL=" + this.vmURL + ", vmVersion=" + this.vmVersion + ", adMarketId=" + this.adMarketId + ", notification=" + this.notification + PAFNPq.ZzERivh + this.loadAdUrls + ", viewAbility=" + this.viewAbility + ", templateType=" + this.templateType + ", templateSettings=" + this.templateSettings + ", creativeId=" + this.creativeId + ", advAppId=" + this.advAppId + ", showClose=" + this.showClose + ", showCloseIncentivized=" + this.showCloseIncentivized + ", adSizeInfo=" + this.adSizeInfo + ", webViewSettings=" + this.webViewSettings + ", usePreloading=" + this.usePreloading + ", partialDownloadEnabled=" + this.partialDownloadEnabled + ", maxDownloadRetryAttempts=" + this.maxDownloadRetryAttempts + ')';
        }

        public /* synthetic */ c(int i10, String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, String str5, String str6, Integer num3, Integer num4, @pm.k(with = i.class) Map map, String str7, String str8, String str9, List list, List list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num5, Integer num6, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool3, Boolean bool4, Integer num7, q2 q2Var) {
            if ((i10 & 1) == 0) {
                this.id = null;
            } else {
                this.id = str;
            }
            if ((i10 & 2) == 0) {
                this.adType = null;
            } else {
                this.adType = str2;
            }
            if ((i10 & 4) == 0) {
                this.adSource = null;
            } else {
                this.adSource = str3;
            }
            if ((i10 & 8) == 0) {
                this.expiry = null;
            } else {
                this.expiry = num;
            }
            if ((i10 & 16) == 0) {
                this.expiryDuration = null;
            } else {
                this.expiryDuration = num2;
            }
            if ((i10 & 32) == 0) {
                this.deeplinkUrl = null;
            } else {
                this.deeplinkUrl = str4;
            }
            if ((i10 & 64) == 0) {
                this.clickCoordinatesEnabled = null;
            } else {
                this.clickCoordinatesEnabled = bool;
            }
            if ((i10 & 128) == 0) {
                this.adLoadOptimizationEnabled = null;
            } else {
                this.adLoadOptimizationEnabled = bool2;
            }
            if ((i10 & 256) == 0) {
                this.mediationName = null;
            } else {
                this.mediationName = str5;
            }
            if ((i10 & 512) == 0) {
                this.info = null;
            } else {
                this.info = str6;
            }
            if ((i10 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                this.sleep = null;
            } else {
                this.sleep = num3;
            }
            if ((i10 & 2048) == 0) {
                this.errorCode = null;
            } else {
                this.errorCode = num4;
            }
            if ((i10 & 4096) == 0) {
                this.tpat = null;
            } else {
                this.tpat = map;
            }
            if ((i10 & 8192) == 0) {
                this.vmURL = null;
            } else {
                this.vmURL = str7;
            }
            if ((i10 & 16384) == 0) {
                this.vmVersion = null;
            } else {
                this.vmVersion = str8;
            }
            if ((32768 & i10) == 0) {
                this.adMarketId = null;
            } else {
                this.adMarketId = str9;
            }
            if ((65536 & i10) == 0) {
                this.notification = null;
            } else {
                this.notification = list;
            }
            if ((131072 & i10) == 0) {
                this.loadAdUrls = null;
            } else {
                this.loadAdUrls = list2;
            }
            if ((262144 & i10) == 0) {
                this.viewAbility = null;
            } else {
                this.viewAbility = viewAbility;
            }
            if ((524288 & i10) == 0) {
                this.templateType = null;
            } else {
                this.templateType = str10;
            }
            if ((1048576 & i10) == 0) {
                this.templateSettings = null;
            } else {
                this.templateSettings = templateSettings;
            }
            if ((2097152 & i10) == 0) {
                this.creativeId = null;
            } else {
                this.creativeId = str11;
            }
            if ((4194304 & i10) == 0) {
                this.advAppId = null;
            } else {
                this.advAppId = str12;
            }
            if ((8388608 & i10) == 0) {
                this.showClose = 0;
            } else {
                this.showClose = num5;
            }
            if ((16777216 & i10) == 0) {
                this.showCloseIncentivized = 0;
            } else {
                this.showCloseIncentivized = num6;
            }
            if ((33554432 & i10) == 0) {
                this.adSizeInfo = null;
            } else {
                this.adSizeInfo = adSizeInfo;
            }
            if ((67108864 & i10) == 0) {
                this.webViewSettings = null;
            } else {
                this.webViewSettings = webViewSettings;
            }
            this.usePreloading = (134217728 & i10) == 0 ? Boolean.FALSE : bool3;
            if ((268435456 & i10) == 0) {
                this.partialDownloadEnabled = null;
            } else {
                this.partialDownloadEnabled = bool4;
            }
            if ((i10 & 536870912) == 0) {
                this.maxDownloadRetryAttempts = 0;
            } else {
                this.maxDownloadRetryAttempts = num7;
            }
        }

        public /* synthetic */ c(String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, String str5, String str6, Integer num3, Integer num4, Map map, String str7, String str8, String str9, List list, List list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num5, Integer num6, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool3, Boolean bool4, Integer num7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : bool, (i10 & 128) != 0 ? null : bool2, (i10 & 256) != 0 ? null : str5, (i10 & 512) != 0 ? null : str6, (i10 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : num3, (i10 & 2048) != 0 ? null : num4, (i10 & 4096) != 0 ? null : map, (i10 & 8192) != 0 ? null : str7, (i10 & 16384) != 0 ? null : str8, (i10 & 32768) != 0 ? null : str9, (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : list, (i10 & 131072) != 0 ? null : list2, (i10 & MediaHttpUploader.MINIMUM_CHUNK_SIZE) != 0 ? null : viewAbility, (i10 & 524288) != 0 ? null : str10, (i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : templateSettings, (i10 & 2097152) != 0 ? null : str11, (i10 & 4194304) != 0 ? null : str12, (i10 & 8388608) != 0 ? 0 : num5, (i10 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? 0 : num6, (i10 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : adSizeInfo, (i10 & 67108864) != 0 ? null : webViewSettings, (i10 & 134217728) != 0 ? Boolean.FALSE : bool3, (i10 & 268435456) != 0 ? null : bool4, (i10 & 536870912) != 0 ? 0 : num7);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$d, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBK\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ@\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001aR(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010\u001a¨\u00062"}, d2 = {"Lcom/vungle/ads/internal/model/b$d;", "", "", BidResponsed.KEY_PRICE, "", "", "nurls", "lurls", "<init>", "(Ljava/lang/Double;Ljava/util/List;Ljava/util/List;)V", "", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/util/List;Ljava/util/List;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/b$d;Lsm/d;Lrm/f;)V", "component1", "()Ljava/lang/Double;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/Double;Ljava/util/List;Ljava/util/List;)Lcom/vungle/ads/internal/model/b$d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getPrice", "getPrice$annotations", "()V", "Ljava/util/List;", "getNurls", "getNurls$annotations", "getLurls", "getLurls$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class CSBResponse {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<String> lurls;
        private final List<String> nurls;
        private final Double price;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$d$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.AdPayload.CSBResponse", aVar, 3);
                g2Var.p(BidResponsed.KEY_PRICE, true);
                g2Var.p("nurls", true);
                g2Var.p("lurls", true);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                pm.d dVarT = qm.a.t(b0.f53441a);
                v2 v2Var = v2.f53598a;
                return new pm.d[]{dVarT, qm.a.t(new tm.f(v2Var)), qm.a.t(new tm.f(v2Var))};
            }

            @Override // pm.c
            public CSBResponse deserialize(sm.e decoder) {
                int i10;
                Object objE;
                Object objE2;
                Object objE3;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                Object objE4 = null;
                if (cVarB.l()) {
                    objE = cVarB.e(descriptor2, 0, b0.f53441a, null);
                    v2 v2Var = v2.f53598a;
                    objE2 = cVarB.e(descriptor2, 1, new tm.f(v2Var), null);
                    objE3 = cVarB.e(descriptor2, 2, new tm.f(v2Var), null);
                    i10 = 7;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    Object objE5 = null;
                    Object objE6 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            objE4 = cVarB.e(descriptor2, 0, b0.f53441a, objE4);
                            i11 |= 1;
                        } else if (iO == 1) {
                            objE5 = cVarB.e(descriptor2, 1, new tm.f(v2.f53598a), objE5);
                            i11 |= 2;
                        } else {
                            if (iO != 2) {
                                throw new UnknownFieldException(iO);
                            }
                            objE6 = cVarB.e(descriptor2, 2, new tm.f(v2.f53598a), objE6);
                            i11 |= 4;
                        }
                    }
                    Object obj = objE4;
                    i10 = i11;
                    objE = obj;
                    objE2 = objE5;
                    objE3 = objE6;
                }
                cVarB.d(descriptor2);
                return new CSBResponse(i10, (Double) objE, (List) objE2, (List) objE3, (q2) null);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, CSBResponse value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                CSBResponse.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$d$b, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final pm.d serializer() {
                return a.INSTANCE;
            }

            private Companion() {
            }
        }

        public CSBResponse() {
            this((Double) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CSBResponse copy$default(CSBResponse cSBResponse, Double d10, List list, List list2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = cSBResponse.price;
            }
            if ((i10 & 2) != 0) {
                list = cSBResponse.nurls;
            }
            if ((i10 & 4) != 0) {
                list2 = cSBResponse.lurls;
            }
            return cSBResponse.copy(d10, list, list2);
        }

        public static final void write$Self(CSBResponse self, sm.d output, rm.f serialDesc) {
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            if (output.k(serialDesc, 0) || self.price != null) {
                output.w(serialDesc, 0, b0.f53441a, self.price);
            }
            if (output.k(serialDesc, 1) || self.nurls != null) {
                output.w(serialDesc, 1, new tm.f(v2.f53598a), self.nurls);
            }
            if (!output.k(serialDesc, 2) && self.lurls == null) {
                return;
            }
            output.w(serialDesc, 2, new tm.f(v2.f53598a), self.lurls);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Double getPrice() {
            return this.price;
        }

        public final List<String> component2() {
            return this.nurls;
        }

        public final List<String> component3() {
            return this.lurls;
        }

        public final CSBResponse copy(Double price, List<String> nurls, List<String> lurls) {
            return new CSBResponse(price, nurls, lurls);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CSBResponse)) {
                return false;
            }
            CSBResponse cSBResponse = (CSBResponse) other;
            return s.c(this.price, cSBResponse.price) && s.c(this.nurls, cSBResponse.nurls) && s.c(this.lurls, cSBResponse.lurls);
        }

        public final List<String> getLurls() {
            return this.lurls;
        }

        public final List<String> getNurls() {
            return this.nurls;
        }

        public final Double getPrice() {
            return this.price;
        }

        public int hashCode() {
            Double d10 = this.price;
            int iHashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
            List<String> list = this.nurls;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.lurls;
            return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        public String toString() {
            return "CSBResponse(price=" + this.price + ", nurls=" + this.nurls + ", lurls=" + this.lurls + ')';
        }

        public /* synthetic */ CSBResponse(int i10, Double d10, List list, List list2, q2 q2Var) {
            if ((i10 & 1) == 0) {
                this.price = null;
            } else {
                this.price = d10;
            }
            if ((i10 & 2) == 0) {
                this.nurls = null;
            } else {
                this.nurls = list;
            }
            if ((i10 & 4) == 0) {
                this.lurls = null;
            } else {
                this.lurls = list2;
            }
        }

        public CSBResponse(Double d10, List<String> list, List<String> list2) {
            this.price = d10;
            this.nurls = list;
            this.lurls = list2;
        }

        public /* synthetic */ CSBResponse(Double d10, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : d10, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : list2);
        }

        public static /* synthetic */ void getLurls$annotations() {
        }

        public static /* synthetic */ void getNurls$annotations() {
        }

        public static /* synthetic */ void getPrice$annotations() {
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$e, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB;\b\u0017\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0019¨\u0006-"}, d2 = {"Lcom/vungle/ads/internal/model/b$e;", "", "", "url", "extension", "", "downloadPercent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/b$e;Lsm/d;Lrm/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/b$e;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getExtension", "Ljava/lang/Integer;", "getDownloadPercent", "getDownloadPercent$annotations", "()V", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class CacheableReplacement {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Integer downloadPercent;
        private final String extension;
        private final String url;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$e$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.AdPayload.CacheableReplacement", aVar, 3);
                g2Var.p("url", true);
                g2Var.p("extension", true);
                g2Var.p("download_percent", true);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                v2 v2Var = v2.f53598a;
                return new pm.d[]{qm.a.t(v2Var), qm.a.t(v2Var), qm.a.t(u0.f53588a)};
            }

            @Override // pm.c
            public CacheableReplacement deserialize(sm.e decoder) {
                int i10;
                Object objE;
                Object objE2;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                Object objE3 = null;
                if (cVarB.l()) {
                    v2 v2Var = v2.f53598a;
                    Object objE4 = cVarB.e(descriptor2, 0, v2Var, null);
                    objE = cVarB.e(descriptor2, 1, v2Var, null);
                    objE2 = cVarB.e(descriptor2, 2, u0.f53588a, null);
                    objE3 = objE4;
                    i10 = 7;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    Object objE5 = null;
                    Object objE6 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            objE3 = cVarB.e(descriptor2, 0, v2.f53598a, objE3);
                            i11 |= 1;
                        } else if (iO == 1) {
                            objE5 = cVarB.e(descriptor2, 1, v2.f53598a, objE5);
                            i11 |= 2;
                        } else {
                            if (iO != 2) {
                                throw new UnknownFieldException(iO);
                            }
                            objE6 = cVarB.e(descriptor2, 2, u0.f53588a, objE6);
                            i11 |= 4;
                        }
                    }
                    i10 = i11;
                    objE = objE5;
                    objE2 = objE6;
                }
                cVarB.d(descriptor2);
                return new CacheableReplacement(i10, (String) objE3, (String) objE, (Integer) objE2, (q2) null);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, CacheableReplacement value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                CacheableReplacement.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$e$b, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final pm.d serializer() {
                return a.INSTANCE;
            }

            private Companion() {
            }
        }

        public CacheableReplacement() {
            this((String) null, (String) null, (Integer) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ CacheableReplacement copy$default(CacheableReplacement cacheableReplacement, String str, String str2, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cacheableReplacement.url;
            }
            if ((i10 & 2) != 0) {
                str2 = cacheableReplacement.extension;
            }
            if ((i10 & 4) != 0) {
                num = cacheableReplacement.downloadPercent;
            }
            return cacheableReplacement.copy(str, str2, num);
        }

        public static final void write$Self(CacheableReplacement self, sm.d output, rm.f serialDesc) {
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            if (output.k(serialDesc, 0) || self.url != null) {
                output.w(serialDesc, 0, v2.f53598a, self.url);
            }
            if (output.k(serialDesc, 1) || self.extension != null) {
                output.w(serialDesc, 1, v2.f53598a, self.extension);
            }
            if (!output.k(serialDesc, 2) && self.downloadPercent == null) {
                return;
            }
            output.w(serialDesc, 2, u0.f53588a, self.downloadPercent);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getExtension() {
            return this.extension;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getDownloadPercent() {
            return this.downloadPercent;
        }

        public final CacheableReplacement copy(String url, String extension, Integer downloadPercent) {
            return new CacheableReplacement(url, extension, downloadPercent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CacheableReplacement)) {
                return false;
            }
            CacheableReplacement cacheableReplacement = (CacheableReplacement) other;
            return s.c(this.url, cacheableReplacement.url) && s.c(this.extension, cacheableReplacement.extension) && s.c(this.downloadPercent, cacheableReplacement.downloadPercent);
        }

        public final Integer getDownloadPercent() {
            return this.downloadPercent;
        }

        public final String getExtension() {
            return this.extension;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.extension;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.downloadPercent;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "CacheableReplacement(url=" + this.url + ", extension=" + this.extension + ", downloadPercent=" + this.downloadPercent + ')';
        }

        public /* synthetic */ CacheableReplacement(int i10, String str, String str2, Integer num, q2 q2Var) {
            if ((i10 & 1) == 0) {
                this.url = null;
            } else {
                this.url = str;
            }
            if ((i10 & 2) == 0) {
                this.extension = null;
            } else {
                this.extension = str2;
            }
            if ((i10 & 4) == 0) {
                this.downloadPercent = null;
            } else {
                this.downloadPercent = num;
            }
        }

        public CacheableReplacement(String str, String str2, Integer num) {
            this.url = str;
            this.extension = str2;
            this.downloadPercent = num;
        }

        public /* synthetic */ CacheableReplacement(String str, String str2, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num);
        }

        public static /* synthetic */ void getDownloadPercent$annotations() {
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$f, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final pm.d serializer() {
            return a.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$g, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB?\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u001c¨\u00063"}, d2 = {"Lcom/vungle/ads/internal/model/b$g;", "", "", "placementReferenceId", "Lcom/vungle/ads/internal/model/b$c;", "adMarkup", "Lcom/vungle/ads/internal/model/b$d;", "csb", "<init>", "(Ljava/lang/String;Lcom/vungle/ads/internal/model/b$c;Lcom/vungle/ads/internal/model/b$d;)V", "", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/vungle/ads/internal/model/b$c;Lcom/vungle/ads/internal/model/b$d;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/b$g;Lsm/d;Lrm/f;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/vungle/ads/internal/model/b$c;", "component3", "()Lcom/vungle/ads/internal/model/b$d;", "copy", "(Ljava/lang/String;Lcom/vungle/ads/internal/model/b$c;Lcom/vungle/ads/internal/model/b$d;)Lcom/vungle/ads/internal/model/b$g;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlacementReferenceId", "getPlacementReferenceId$annotations", "()V", "Lcom/vungle/ads/internal/model/b$c;", "getAdMarkup", "getAdMarkup$annotations", "Lcom/vungle/ads/internal/model/b$d;", "getCsb", "getCsb$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class PlacementAdUnit {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final c adMarkup;
        private final CSBResponse csb;
        private final String placementReferenceId;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$g$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        /* JADX INFO: loaded from: classes6.dex */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.AdPayload.PlacementAdUnit", aVar, 3);
                g2Var.p("placement_reference_id", true);
                g2Var.p("ad_markup", true);
                g2Var.p("csb", true);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                return new pm.d[]{qm.a.t(v2.f53598a), qm.a.t(c.a.INSTANCE), qm.a.t(CSBResponse.a.INSTANCE)};
            }

            @Override // pm.c
            public PlacementAdUnit deserialize(sm.e decoder) {
                int i10;
                Object objE;
                Object objE2;
                Object objE3;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                Object objE4 = null;
                if (cVarB.l()) {
                    objE = cVarB.e(descriptor2, 0, v2.f53598a, null);
                    objE2 = cVarB.e(descriptor2, 1, c.a.INSTANCE, null);
                    objE3 = cVarB.e(descriptor2, 2, CSBResponse.a.INSTANCE, null);
                    i10 = 7;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    Object objE5 = null;
                    Object objE6 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            objE4 = cVarB.e(descriptor2, 0, v2.f53598a, objE4);
                            i11 |= 1;
                        } else if (iO == 1) {
                            objE5 = cVarB.e(descriptor2, 1, c.a.INSTANCE, objE5);
                            i11 |= 2;
                        } else {
                            if (iO != 2) {
                                throw new UnknownFieldException(iO);
                            }
                            objE6 = cVarB.e(descriptor2, 2, CSBResponse.a.INSTANCE, objE6);
                            i11 |= 4;
                        }
                    }
                    Object obj = objE4;
                    i10 = i11;
                    objE = obj;
                    objE2 = objE5;
                    objE3 = objE6;
                }
                cVarB.d(descriptor2);
                return new PlacementAdUnit(i10, (String) objE, (c) objE2, (CSBResponse) objE3, (q2) null);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, PlacementAdUnit value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                PlacementAdUnit.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$g$b, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        /* JADX INFO: loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final pm.d serializer() {
                return a.INSTANCE;
            }

            private Companion() {
            }
        }

        public PlacementAdUnit() {
            this((String) null, (c) null, (CSBResponse) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ PlacementAdUnit copy$default(PlacementAdUnit placementAdUnit, String str, c cVar, CSBResponse cSBResponse, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = placementAdUnit.placementReferenceId;
            }
            if ((i10 & 2) != 0) {
                cVar = placementAdUnit.adMarkup;
            }
            if ((i10 & 4) != 0) {
                cSBResponse = placementAdUnit.csb;
            }
            return placementAdUnit.copy(str, cVar, cSBResponse);
        }

        public static /* synthetic */ void getAdMarkup$annotations() {
        }

        public static /* synthetic */ void getCsb$annotations() {
        }

        public static /* synthetic */ void getPlacementReferenceId$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final c getAdMarkup() {
            return this.adMarkup;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final CSBResponse getCsb() {
            return this.csb;
        }

        public final PlacementAdUnit copy(String placementReferenceId, c adMarkup, CSBResponse csb) {
            return new PlacementAdUnit(placementReferenceId, adMarkup, csb);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlacementAdUnit)) {
                return false;
            }
            PlacementAdUnit placementAdUnit = (PlacementAdUnit) other;
            return s.c(this.placementReferenceId, placementAdUnit.placementReferenceId) && s.c(this.adMarkup, placementAdUnit.adMarkup) && s.c(this.csb, placementAdUnit.csb);
        }

        public final c getAdMarkup() {
            return this.adMarkup;
        }

        public final CSBResponse getCsb() {
            return this.csb;
        }

        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        public int hashCode() {
            String str = this.placementReferenceId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            c cVar = this.adMarkup;
            int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            CSBResponse cSBResponse = this.csb;
            return iHashCode2 + (cSBResponse != null ? cSBResponse.hashCode() : 0);
        }

        public String toString() {
            return "PlacementAdUnit(placementReferenceId=" + this.placementReferenceId + ", adMarkup=" + this.adMarkup + ", csb=" + this.csb + ')';
        }

        public /* synthetic */ PlacementAdUnit(int i10, String str, c cVar, CSBResponse cSBResponse, q2 q2Var) {
            if ((i10 & 1) == 0) {
                this.placementReferenceId = null;
            } else {
                this.placementReferenceId = str;
            }
            if ((i10 & 2) == 0) {
                this.adMarkup = null;
            } else {
                this.adMarkup = cVar;
            }
            if ((i10 & 4) == 0) {
                this.csb = null;
            } else {
                this.csb = cSBResponse;
            }
        }

        public static final void write$Self(PlacementAdUnit self, sm.d output, rm.f serialDesc) {
            s.h(self, Saucuwx.ffEj);
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            if (output.k(serialDesc, 0) || self.placementReferenceId != null) {
                output.w(serialDesc, 0, v2.f53598a, self.placementReferenceId);
            }
            if (output.k(serialDesc, 1) || self.adMarkup != null) {
                output.w(serialDesc, 1, c.a.INSTANCE, self.adMarkup);
            }
            if (!output.k(serialDesc, 2) && self.csb == null) {
                return;
            }
            output.w(serialDesc, 2, CSBResponse.a.INSTANCE, self.csb);
        }

        public PlacementAdUnit(String str, c cVar, CSBResponse cSBResponse) {
            this.placementReferenceId = str;
            this.adMarkup = cVar;
            this.csb = cSBResponse;
        }

        public /* synthetic */ PlacementAdUnit(String str, c cVar, CSBResponse cSBResponse, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : cVar, (i10 & 4) != 0 ? null : cSBResponse);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$h, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B7\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBK\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J@\u0010\u0019\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R.\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R.\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0017¨\u0006,"}, d2 = {"Lcom/vungle/ads/internal/model/b$h;", "", "", "", "normalReplacements", "Lcom/vungle/ads/internal/model/b$e;", "cacheableReplacements", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/util/Map;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/b$h;Lsm/d;Lrm/f;)V", "component1", "()Ljava/util/Map;", "component2", "copy", "(Ljava/util/Map;Ljava/util/Map;)Lcom/vungle/ads/internal/model/b$h;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getNormalReplacements", "getNormalReplacements$annotations", "()V", "getCacheableReplacements", "getCacheableReplacements$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class TemplateSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Map<String, CacheableReplacement> cacheableReplacements;
        private final Map<String, String> normalReplacements;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$h$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.AdPayload.TemplateSettings", aVar, 2);
                g2Var.p("normal_replacements", true);
                g2Var.p("cacheable_replacements", true);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                v2 v2Var = v2.f53598a;
                return new pm.d[]{qm.a.t(new z0(v2Var, v2Var)), qm.a.t(new z0(v2Var, CacheableReplacement.a.INSTANCE))};
            }

            @Override // pm.c
            public TemplateSettings deserialize(sm.e decoder) {
                Object objE;
                Object objE2;
                int i10;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                q2 q2Var = null;
                if (cVarB.l()) {
                    v2 v2Var = v2.f53598a;
                    objE = cVarB.e(descriptor2, 0, new z0(v2Var, v2Var), null);
                    objE2 = cVarB.e(descriptor2, 1, new z0(v2Var, CacheableReplacement.a.INSTANCE), null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    objE = null;
                    Object objE3 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            v2 v2Var2 = v2.f53598a;
                            objE = cVarB.e(descriptor2, 0, new z0(v2Var2, v2Var2), objE);
                            i11 |= 1;
                        } else {
                            if (iO != 1) {
                                throw new UnknownFieldException(iO);
                            }
                            objE3 = cVarB.e(descriptor2, 1, new z0(v2.f53598a, CacheableReplacement.a.INSTANCE), objE3);
                            i11 |= 2;
                        }
                    }
                    objE2 = objE3;
                    i10 = i11;
                }
                cVarB.d(descriptor2);
                return new TemplateSettings(i10, (Map) objE, (Map) objE2, q2Var);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, TemplateSettings value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                TemplateSettings.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$h$b, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final pm.d serializer() {
                return a.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TemplateSettings() {
            this((Map) null, (Map) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TemplateSettings copy$default(TemplateSettings templateSettings, Map map, Map map2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                map = templateSettings.normalReplacements;
            }
            if ((i10 & 2) != 0) {
                map2 = templateSettings.cacheableReplacements;
            }
            return templateSettings.copy(map, map2);
        }

        public static final void write$Self(TemplateSettings self, sm.d output, rm.f serialDesc) {
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            if (output.k(serialDesc, 0) || self.normalReplacements != null) {
                v2 v2Var = v2.f53598a;
                output.w(serialDesc, 0, new z0(v2Var, v2Var), self.normalReplacements);
            }
            if (!output.k(serialDesc, 1) && self.cacheableReplacements == null) {
                return;
            }
            output.w(serialDesc, 1, new z0(v2.f53598a, CacheableReplacement.a.INSTANCE), self.cacheableReplacements);
        }

        public final Map<String, String> component1() {
            return this.normalReplacements;
        }

        public final Map<String, CacheableReplacement> component2() {
            return this.cacheableReplacements;
        }

        public final TemplateSettings copy(Map<String, String> normalReplacements, Map<String, CacheableReplacement> cacheableReplacements) {
            return new TemplateSettings(normalReplacements, cacheableReplacements);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TemplateSettings)) {
                return false;
            }
            TemplateSettings templateSettings = (TemplateSettings) other;
            return s.c(this.normalReplacements, templateSettings.normalReplacements) && s.c(this.cacheableReplacements, templateSettings.cacheableReplacements);
        }

        public final Map<String, CacheableReplacement> getCacheableReplacements() {
            return this.cacheableReplacements;
        }

        public final Map<String, String> getNormalReplacements() {
            return this.normalReplacements;
        }

        public int hashCode() {
            Map<String, String> map = this.normalReplacements;
            int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<String, CacheableReplacement> map2 = this.cacheableReplacements;
            return iHashCode + (map2 != null ? map2.hashCode() : 0);
        }

        public String toString() {
            return "TemplateSettings(normalReplacements=" + this.normalReplacements + ", cacheableReplacements=" + this.cacheableReplacements + ')';
        }

        public /* synthetic */ TemplateSettings(int i10, Map map, Map map2, q2 q2Var) {
            if ((i10 & 1) == 0) {
                this.normalReplacements = null;
            } else {
                this.normalReplacements = map;
            }
            if ((i10 & 2) == 0) {
                this.cacheableReplacements = null;
            } else {
                this.cacheableReplacements = map2;
            }
        }

        public TemplateSettings(Map<String, String> map, Map<String, CacheableReplacement> map2) {
            this.normalReplacements = map;
            this.cacheableReplacements = map2;
        }

        public /* synthetic */ TemplateSettings(Map map, Map map2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : map, (i10 & 2) != 0 ? null : map2);
        }

        public static /* synthetic */ void getCacheableReplacements$annotations() {
        }

        public static /* synthetic */ void getNormalReplacements$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class i extends j0 {
        public static final i INSTANCE = new i();

        /* JADX WARN: Illegal instructions before constructor call */
        private i() {
            o0 o0Var = o0.f43602a;
            super(qm.a.k(qm.a.J(o0Var), qm.a.h(qm.a.J(o0Var))));
        }

        @Override // kotlinx.serialization.json.j0
        protected kotlinx.serialization.json.i transformDeserialize(kotlinx.serialization.json.i element) {
            s.h(element, "element");
            d0 d0VarJ = kotlinx.serialization.json.k.j(element);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, kotlinx.serialization.json.i> entry : d0VarJ.entrySet()) {
                if (!s.c(entry.getKey(), "moat")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return new d0(linkedHashMap);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$j, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006%"}, d2 = {"Lcom/vungle/ads/internal/model/b$j;", "", "Lcom/vungle/ads/internal/model/b$k;", "om", "<init>", "(Lcom/vungle/ads/internal/model/b$k;)V", "", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/model/b$k;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/b$j;Lsm/d;Lrm/f;)V", "component1", "()Lcom/vungle/ads/internal/model/b$k;", "copy", "(Lcom/vungle/ads/internal/model/b$k;)Lcom/vungle/ads/internal/model/b$j;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/vungle/ads/internal/model/b$k;", "getOm", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class ViewAbility {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ViewAbilityInfo om;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$j$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.AdPayload.ViewAbility", aVar, 1);
                g2Var.p("om", true);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                return new pm.d[]{qm.a.t(ViewAbilityInfo.a.INSTANCE)};
            }

            @Override // pm.c
            public ViewAbility deserialize(sm.e decoder) {
                Object objE;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                int i10 = 1;
                q2 q2Var = null;
                if (cVarB.l()) {
                    objE = cVarB.e(descriptor2, 0, ViewAbilityInfo.a.INSTANCE, null);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    objE = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else {
                            if (iO != 0) {
                                throw new UnknownFieldException(iO);
                            }
                            objE = cVarB.e(descriptor2, 0, ViewAbilityInfo.a.INSTANCE, objE);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarB.d(descriptor2);
                return new ViewAbility(i10, (ViewAbilityInfo) objE, q2Var);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, ViewAbility value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                ViewAbility.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$j$b, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final pm.d serializer() {
                return a.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewAbility() {
            this((ViewAbilityInfo) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ ViewAbility copy$default(ViewAbility viewAbility, ViewAbilityInfo viewAbilityInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                viewAbilityInfo = viewAbility.om;
            }
            return viewAbility.copy(viewAbilityInfo);
        }

        public static final void write$Self(ViewAbility self, sm.d output, rm.f serialDesc) {
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            if (!output.k(serialDesc, 0) && self.om == null) {
                return;
            }
            output.w(serialDesc, 0, ViewAbilityInfo.a.INSTANCE, self.om);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ViewAbilityInfo getOm() {
            return this.om;
        }

        public final ViewAbility copy(ViewAbilityInfo om2) {
            return new ViewAbility(om2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViewAbility) && s.c(this.om, ((ViewAbility) other).om);
        }

        public final ViewAbilityInfo getOm() {
            return this.om;
        }

        public int hashCode() {
            ViewAbilityInfo viewAbilityInfo = this.om;
            if (viewAbilityInfo == null) {
                return 0;
            }
            return viewAbilityInfo.hashCode();
        }

        public String toString() {
            return "ViewAbility(om=" + this.om + ')';
        }

        public /* synthetic */ ViewAbility(int i10, ViewAbilityInfo viewAbilityInfo, q2 q2Var) {
            if ((i10 & 1) == 0) {
                this.om = null;
            } else {
                this.om = viewAbilityInfo;
            }
        }

        public ViewAbility(ViewAbilityInfo viewAbilityInfo) {
            this.om = viewAbilityInfo;
        }

        public /* synthetic */ ViewAbility(ViewAbilityInfo viewAbilityInfo, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : viewAbilityInfo);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$k, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b\"\u0010#\u001a\u0004\b\u0003\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b&\u0010#\u001a\u0004\b%\u0010\u0018¨\u0006*"}, d2 = {"Lcom/vungle/ads/internal/model/b$k;", "", "", "isEnabled", "", "extraVast", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/b$k;Lsm/d;Lrm/f;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/vungle/ads/internal/model/b$k;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "isEnabled$annotations", "()V", "Ljava/lang/String;", "getExtraVast", "getExtraVast$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class ViewAbilityInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String extraVast;
        private final Boolean isEnabled;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$k$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo", aVar, 2);
                g2Var.p("is_enabled", true);
                g2Var.p("extra_vast", true);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                return new pm.d[]{qm.a.t(tm.i.f53507a), qm.a.t(v2.f53598a)};
            }

            @Override // pm.c
            public ViewAbilityInfo deserialize(sm.e decoder) {
                Object objE;
                Object objE2;
                int i10;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                q2 q2Var = null;
                if (cVarB.l()) {
                    objE = cVarB.e(descriptor2, 0, tm.i.f53507a, null);
                    objE2 = cVarB.e(descriptor2, 1, v2.f53598a, null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    objE = null;
                    Object objE3 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            objE = cVarB.e(descriptor2, 0, tm.i.f53507a, objE);
                            i11 |= 1;
                        } else {
                            if (iO != 1) {
                                throw new UnknownFieldException(iO);
                            }
                            objE3 = cVarB.e(descriptor2, 1, v2.f53598a, objE3);
                            i11 |= 2;
                        }
                    }
                    objE2 = objE3;
                    i10 = i11;
                }
                cVarB.d(descriptor2);
                return new ViewAbilityInfo(i10, (Boolean) objE, (String) objE2, q2Var);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, ViewAbilityInfo value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                ViewAbilityInfo.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$k$b, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final pm.d serializer() {
                return a.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewAbilityInfo() {
            this((Boolean) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ ViewAbilityInfo copy$default(ViewAbilityInfo viewAbilityInfo, Boolean bool, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = viewAbilityInfo.isEnabled;
            }
            if ((i10 & 2) != 0) {
                str = viewAbilityInfo.extraVast;
            }
            return viewAbilityInfo.copy(bool, str);
        }

        public static final void write$Self(ViewAbilityInfo self, sm.d output, rm.f serialDesc) {
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            if (output.k(serialDesc, 0) || self.isEnabled != null) {
                output.w(serialDesc, 0, tm.i.f53507a, self.isEnabled);
            }
            if (!output.k(serialDesc, 1) && self.extraVast == null) {
                return;
            }
            output.w(serialDesc, 1, v2.f53598a, self.extraVast);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getExtraVast() {
            return this.extraVast;
        }

        public final ViewAbilityInfo copy(Boolean isEnabled, String extraVast) {
            return new ViewAbilityInfo(isEnabled, extraVast);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewAbilityInfo)) {
                return false;
            }
            ViewAbilityInfo viewAbilityInfo = (ViewAbilityInfo) other;
            return s.c(this.isEnabled, viewAbilityInfo.isEnabled) && s.c(this.extraVast, viewAbilityInfo.extraVast);
        }

        public final String getExtraVast() {
            return this.extraVast;
        }

        public int hashCode() {
            Boolean bool = this.isEnabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.extraVast;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final Boolean isEnabled() {
            return this.isEnabled;
        }

        public String toString() {
            return "ViewAbilityInfo(isEnabled=" + this.isEnabled + ", extraVast=" + this.extraVast + ')';
        }

        public /* synthetic */ ViewAbilityInfo(int i10, Boolean bool, String str, q2 q2Var) {
            if ((i10 & 1) == 0) {
                this.isEnabled = null;
            } else {
                this.isEnabled = bool;
            }
            if ((i10 & 2) == 0) {
                this.extraVast = null;
            } else {
                this.extraVast = str;
            }
        }

        public ViewAbilityInfo(Boolean bool, String str) {
            this.isEnabled = bool;
            this.extraVast = str;
        }

        public /* synthetic */ ViewAbilityInfo(Boolean bool, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : str);
        }

        public static /* synthetic */ void getExtraVast$annotations() {
        }

        public static /* synthetic */ void isEnabled$annotations() {
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$l, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J(\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0015¨\u0006*"}, d2 = {"Lcom/vungle/ads/internal/model/b$l;", "", "", "allowFileAccessFromFileUrls", "allowUniversalAccessFromFileUrls", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/b$l;Lsm/d;Lrm/f;)V", "component1", "()Ljava/lang/Boolean;", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/b$l;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getAllowFileAccessFromFileUrls", "getAllowFileAccessFromFileUrls$annotations", "()V", "getAllowUniversalAccessFromFileUrls", "getAllowUniversalAccessFromFileUrls$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class WebViewSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean allowFileAccessFromFileUrls;
        private final Boolean allowUniversalAccessFromFileUrls;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$l$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.AdPayload.WebViewSettings", aVar, 2);
                g2Var.p("allow_file_access_from_file_urls", true);
                g2Var.p("allow_universal_access_from_file_urls", true);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                tm.i iVar = tm.i.f53507a;
                return new pm.d[]{qm.a.t(iVar), qm.a.t(iVar)};
            }

            @Override // pm.c
            public WebViewSettings deserialize(sm.e decoder) {
                Object objE;
                int i10;
                Object objE2;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                q2 q2Var = null;
                if (cVarB.l()) {
                    tm.i iVar = tm.i.f53507a;
                    objE2 = cVarB.e(descriptor2, 0, iVar, null);
                    objE = cVarB.e(descriptor2, 1, iVar, null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    objE = null;
                    Object objE3 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            objE3 = cVarB.e(descriptor2, 0, tm.i.f53507a, objE3);
                            i11 |= 1;
                        } else {
                            if (iO != 1) {
                                throw new UnknownFieldException(iO);
                            }
                            objE = cVarB.e(descriptor2, 1, tm.i.f53507a, objE);
                            i11 |= 2;
                        }
                    }
                    i10 = i11;
                    objE2 = objE3;
                }
                cVarB.d(descriptor2);
                return new WebViewSettings(i10, (Boolean) objE2, (Boolean) objE, q2Var);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, WebViewSettings value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                WebViewSettings.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.b$l$b, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final pm.d serializer() {
                return a.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WebViewSettings() {
            this((Boolean) null, (Boolean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ WebViewSettings copy$default(WebViewSettings webViewSettings, Boolean bool, Boolean bool2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = webViewSettings.allowFileAccessFromFileUrls;
            }
            if ((i10 & 2) != 0) {
                bool2 = webViewSettings.allowUniversalAccessFromFileUrls;
            }
            return webViewSettings.copy(bool, bool2);
        }

        public static final void write$Self(WebViewSettings self, sm.d output, rm.f serialDesc) {
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            if (output.k(serialDesc, 0) || self.allowFileAccessFromFileUrls != null) {
                output.w(serialDesc, 0, tm.i.f53507a, self.allowFileAccessFromFileUrls);
            }
            if (!output.k(serialDesc, 1) && self.allowUniversalAccessFromFileUrls == null) {
                return;
            }
            output.w(serialDesc, 1, tm.i.f53507a, self.allowUniversalAccessFromFileUrls);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getAllowFileAccessFromFileUrls() {
            return this.allowFileAccessFromFileUrls;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getAllowUniversalAccessFromFileUrls() {
            return this.allowUniversalAccessFromFileUrls;
        }

        public final WebViewSettings copy(Boolean allowFileAccessFromFileUrls, Boolean allowUniversalAccessFromFileUrls) {
            return new WebViewSettings(allowFileAccessFromFileUrls, allowUniversalAccessFromFileUrls);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebViewSettings)) {
                return false;
            }
            WebViewSettings webViewSettings = (WebViewSettings) other;
            return s.c(this.allowFileAccessFromFileUrls, webViewSettings.allowFileAccessFromFileUrls) && s.c(this.allowUniversalAccessFromFileUrls, webViewSettings.allowUniversalAccessFromFileUrls);
        }

        public final Boolean getAllowFileAccessFromFileUrls() {
            return this.allowFileAccessFromFileUrls;
        }

        public final Boolean getAllowUniversalAccessFromFileUrls() {
            return this.allowUniversalAccessFromFileUrls;
        }

        public int hashCode() {
            Boolean bool = this.allowFileAccessFromFileUrls;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.allowUniversalAccessFromFileUrls;
            return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        public String toString() {
            return "WebViewSettings(allowFileAccessFromFileUrls=" + this.allowFileAccessFromFileUrls + ", allowUniversalAccessFromFileUrls=" + this.allowUniversalAccessFromFileUrls + ')';
        }

        public /* synthetic */ WebViewSettings(int i10, Boolean bool, Boolean bool2, q2 q2Var) {
            if ((i10 & 1) == 0) {
                this.allowFileAccessFromFileUrls = null;
            } else {
                this.allowFileAccessFromFileUrls = bool;
            }
            if ((i10 & 2) == 0) {
                this.allowUniversalAccessFromFileUrls = null;
            } else {
                this.allowUniversalAccessFromFileUrls = bool2;
            }
        }

        public WebViewSettings(Boolean bool, Boolean bool2) {
            this.allowFileAccessFromFileUrls = bool;
            this.allowUniversalAccessFromFileUrls = bool2;
        }

        public /* synthetic */ WebViewSettings(Boolean bool, Boolean bool2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2);
        }

        public static /* synthetic */ void getAllowFileAccessFromFileUrls$annotations() {
        }

        public static /* synthetic */ void getAllowUniversalAccessFromFileUrls$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class m implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return jl.a.a(Boolean.valueOf(((com.vungle.ads.internal.model.a) obj2).isRequired()), Boolean.valueOf(((com.vungle.ads.internal.model.a) obj).isRequired()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final String complexReplace(String str, String str2, String str3) {
        String strQuote = Pattern.quote(str2);
        s.g(strQuote, "quote(oldValue)");
        return new o(strQuote).i(str, valueOrEmpty(str3));
    }

    private final q computeAssetRequirement(Integer percentage) {
        if (isNativeTemplateType() || !adLoadOptimizationEnabled()) {
            return w.a(Boolean.TRUE, null);
        }
        if (isPartialDownloadEnabled()) {
            return w.a(Boolean.TRUE, Integer.valueOf(Math.max(0, percentage != null ? percentage.intValue() : 0)));
        }
        return w.a(Boolean.FALSE, null);
    }

    private final PlacementAdUnit getAd() {
        List<PlacementAdUnit> list = this.ads;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private final c getAdMarkup() {
        PlacementAdUnit ad2 = getAd();
        if (ad2 != null) {
            return ad2.getAdMarkup();
        }
        return null;
    }

    private final q getIndexHtmlFile(File dir) {
        c adMarkup;
        String vmURL;
        Object objB;
        File parentFile;
        if (isNativeTemplateType() || (adMarkup = getAdMarkup()) == null || (vmURL = adMarkup.getVmURL()) == null) {
            return null;
        }
        String str = com.vungle.ads.internal.util.j.INSTANCE.isValidUrl(vmURL) ? vmURL : null;
        if (str == null) {
            return null;
        }
        try {
            r.a aVar = r.f38769b;
            String path = new URI(str).getPath();
            s.g(path, "URI(url).path");
            List listE0 = bm.r.E0(bm.r.W0(path, '/'), new char[]{'/'}, false, 0, 6, null);
            objB = r.b(listE0.size() >= 2 ? gl.r.l0(gl.r.B0(listE0, 2), "_", null, null, 0, null, null, 62, null) : "index.html");
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            objB = r.b(fl.s.a(th2));
        }
        if (r.h(objB)) {
            objB = null;
        }
        String str2 = (String) objB;
        if (str2 == null || (parentFile = dir.getParentFile()) == null) {
            return null;
        }
        return new q(str, new File(parentFile, str2));
    }

    public static /* synthetic */ List getTpatUrls$default(b bVar, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        return bVar.getTpatUrls(str, str2, str3);
    }

    private final String valueOrEmpty(String value) {
        return value == null ? "" : value;
    }

    public static final void write$Self(b self, sm.d output, rm.f serialDesc) {
        s.h(self, "self");
        s.h(output, "output");
        s.h(serialDesc, "serialDesc");
        if (output.k(serialDesc, 0) || self.ads != null) {
            output.w(serialDesc, 0, new tm.f(PlacementAdUnit.a.INSTANCE), self.ads);
        }
        if (output.k(serialDesc, 1) || self.config != null) {
            output.w(serialDesc, 1, g.a.INSTANCE, self.config);
        }
        if (output.k(serialDesc, 2) || self.expiryWindowStart != null) {
            output.w(serialDesc, 2, f1.f53474a, self.expiryWindowStart);
        }
        if (output.k(serialDesc, 3) || !s.c(self.mraidFiles, new ConcurrentHashMap())) {
            zl.c cVarB = kotlin.jvm.internal.l0.b(ConcurrentHashMap.class);
            v2 v2Var = v2.f53598a;
            output.A(serialDesc, 3, new pm.b(cVarB, null, new pm.d[]{v2Var, v2Var}), self.mraidFiles);
        }
        if (output.k(serialDesc, 4) || !s.c(self.incentivizedTextSettings, new HashMap())) {
            v2 v2Var2 = v2.f53598a;
            output.A(serialDesc, 4, new z0(v2Var2, v2Var2), self.incentivizedTextSettings);
        }
        if (output.k(serialDesc, 5) || self.assetsFullyDownloaded) {
            output.f(serialDesc, 5, self.assetsFullyDownloaded);
        }
        if (!output.k(serialDesc, 6) && self.indexFilePath == null) {
            return;
        }
        output.w(serialDesc, 6, v2.f53598a, self.indexFilePath);
    }

    public final int adHeight() {
        AdSizeInfo adSizeInfo;
        Integer height;
        c adMarkup = getAdMarkup();
        if (adMarkup == null || (adSizeInfo = adMarkup.getAdSizeInfo()) == null || (height = adSizeInfo.getHeight()) == null) {
            return 0;
        }
        return height.intValue();
    }

    public final boolean adLoadOptimizationEnabled() {
        Boolean adLoadOptimizationEnabled;
        c adMarkup = getAdMarkup();
        if (adMarkup == null || (adLoadOptimizationEnabled = adMarkup.getAdLoadOptimizationEnabled()) == null) {
            return true;
        }
        return adLoadOptimizationEnabled.booleanValue();
    }

    public final c adUnit() {
        return getAdMarkup();
    }

    public final int adWidth() {
        AdSizeInfo adSizeInfo;
        Integer width;
        c adMarkup = getAdMarkup();
        if (adMarkup == null || (adSizeInfo = adMarkup.getAdSizeInfo()) == null || (width = adSizeInfo.getWidth()) == null) {
            return 0;
        }
        return width.intValue();
    }

    public final String advAppId() {
        c adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdvAppId();
        }
        return null;
    }

    /* JADX INFO: renamed from: config, reason: from getter */
    public final g getConfig() {
        return this.config;
    }

    public final d0 createMRAIDArgs() {
        Map<String, String> mRAIDArgsInMap = getMRAIDArgsInMap();
        e0 e0Var = new e0();
        for (Map.Entry<String, String> entry : mRAIDArgsInMap.entrySet()) {
            kotlinx.serialization.json.j.c(e0Var, entry.getKey(), entry.getValue());
        }
        return e0Var.a();
    }

    public final String eventId() {
        c adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getId();
        }
        return null;
    }

    public final com.vungle.ads.b getAdConfig() {
        return this.adConfig;
    }

    public final String getAdSource() {
        c adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdSource();
        }
        return null;
    }

    public final boolean getAssetsFullyDownloaded() {
        return this.assetsFullyDownloaded;
    }

    public final CSBResponse getCSBResponse() {
        PlacementAdUnit ad2 = getAd();
        if (ad2 != null) {
            return ad2.getCsb();
        }
        return null;
    }

    public final String getCreativeId() {
        String creativeId;
        c adMarkup = getAdMarkup();
        return (adMarkup == null || (creativeId = adMarkup.getCreativeId()) == null) ? UNKNOWN : creativeId;
    }

    public final List<com.vungle.ads.internal.model.a> getDownloadableAssets(File dir) {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        s.h(dir, "dir");
        ArrayList arrayList = new ArrayList();
        q indexHtmlFile = getIndexHtmlFile(dir);
        if (indexHtmlFile != null) {
            String str = (String) indexHtmlFile.d();
            File file = (File) indexHtmlFile.g();
            this.indexFilePath = file.getAbsolutePath();
            if (!file.exists()) {
                com.vungle.ads.internal.util.q.Companion.d(TAG, "No cacheable index file found, creating new one: " + file);
                String absolutePath = file.getAbsolutePath();
                s.g(absolutePath, "indexFile.absolutePath");
                arrayList.add(new com.vungle.ads.internal.model.a(KEY_VM, str, absolutePath, true, null, 16, null));
            }
        }
        c adMarkup = getAdMarkup();
        if (adMarkup != null && (templateSettings = adMarkup.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                String key = entry.getKey();
                CacheableReplacement value = entry.getValue();
                String url = value.getUrl();
                if (url != null) {
                    com.vungle.ads.internal.util.j jVar = com.vungle.ads.internal.util.j.INSTANCE;
                    if (jVar.isValidUrl(url)) {
                        String filePath = new File(dir, jVar.guessFileName(url, value.getExtension())).getAbsolutePath();
                        q qVarComputeAssetRequirement = computeAssetRequirement(value.getDownloadPercent());
                        boolean zBooleanValue = ((Boolean) qVarComputeAssetRequirement.d()).booleanValue();
                        Integer num = (Integer) qVarComputeAssetRequirement.g();
                        s.g(filePath, "filePath");
                        com.vungle.ads.internal.model.a aVar = new com.vungle.ads.internal.model.a(key, url, filePath, zBooleanValue, num);
                        String extension = value.getExtension();
                        if (extension != null) {
                            aVar.setMimeType(extension);
                        }
                        arrayList.add(aVar);
                        if (zBooleanValue && num != null) {
                            this.partialDownloadAssets.put(url, aVar);
                        }
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            gl.r.y(arrayList, new m());
        }
        return arrayList;
    }

    public final String getExperiments() {
        TemplateSettings templateSettings;
        Map<String, String> normalReplacements;
        c adMarkup = getAdMarkup();
        if (adMarkup == null || (templateSettings = adMarkup.getTemplateSettings()) == null || (normalReplacements = templateSettings.getNormalReplacements()) == null) {
            return null;
        }
        return normalReplacements.get(com.vungle.ads.internal.f.EXPERIMENTS_KEY);
    }

    public final Map<String, String> getIncentivizedTextSettings() {
        return this.incentivizedTextSettings;
    }

    public final String getIndexFilePath() {
        return this.indexFilePath;
    }

    public final com.vungle.ads.internal.model.a getLocalPartialDownloadAssets(String remoteUrl) {
        s.h(remoteUrl, "remoteUrl");
        return this.partialDownloadAssets.get(remoteUrl);
    }

    /* JADX INFO: renamed from: getLogEntry$vungle_ads_release, reason: from getter */
    public final p getLogEntry() {
        return this.logEntry;
    }

    public final List<String> getLossUrls() {
        CSBResponse csb;
        PlacementAdUnit ad2 = getAd();
        if (ad2 == null || (csb = ad2.getCsb()) == null) {
            return null;
        }
        return csb.getLurls();
    }

    public final Map<String, String> getMRAIDArgsInMap() {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        TemplateSettings templateSettings2;
        Map<String, String> normalReplacements;
        c adMarkup = getAdMarkup();
        if ((adMarkup != null ? adMarkup.getTemplateSettings() : null) == null) {
            throw new IllegalArgumentException("Advertisement does not have MRAID Arguments!");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c adMarkup2 = getAdMarkup();
        if (adMarkup2 != null && (templateSettings2 = adMarkup2.getTemplateSettings()) != null && (normalReplacements = templateSettings2.getNormalReplacements()) != null) {
            linkedHashMap.putAll(normalReplacements);
        }
        c adMarkup3 = getAdMarkup();
        if (adMarkup3 != null && (templateSettings = adMarkup3.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                String url = entry.getValue().getUrl();
                if (url != null) {
                    linkedHashMap.put(entry.getKey(), url);
                }
            }
        }
        if (!this.mraidFiles.isEmpty()) {
            linkedHashMap.putAll(this.mraidFiles);
        }
        if (!this.incentivizedTextSettings.isEmpty()) {
            linkedHashMap.putAll(this.incentivizedTextSettings);
        }
        return linkedHashMap;
    }

    public final String getMediationName() {
        c adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getMediationName();
        }
        return null;
    }

    public final Map<String, com.vungle.ads.internal.model.a> getPartialDownloadAssets$vungle_ads_release() {
        return this.partialDownloadAssets;
    }

    public final int getShowCloseDelay(Boolean incentivized) {
        Integer showClose;
        int iIntValue;
        Integer showCloseIncentivized;
        if (s.c(incentivized, Boolean.TRUE)) {
            c adMarkup = getAdMarkup();
            if (adMarkup == null || (showCloseIncentivized = adMarkup.getShowCloseIncentivized()) == null) {
                return 0;
            }
            iIntValue = showCloseIncentivized.intValue();
        } else {
            c adMarkup2 = getAdMarkup();
            if (adMarkup2 == null || (showClose = adMarkup2.getShowClose()) == null) {
                return 0;
            }
            iIntValue = showClose.intValue();
        }
        return iIntValue * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final List<String> getTpatUrls(String event, String value, String secondValue) {
        Map<String, List<String>> tpat;
        Map<String, List<String>> tpat2;
        s.h(event, "event");
        c adMarkup = getAdMarkup();
        if (adMarkup != null && (tpat2 = adMarkup.getTpat()) != null && !tpat2.containsKey(event)) {
            new TpatError(Sdk$SDKError.b.INVALID_TPAT_KEY, "Arbitrary tpat key: " + event).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        c adMarkup2 = getAdMarkup();
        List<String> list = (adMarkup2 == null || (tpat = adMarkup2.getTpat()) == null) ? null : tpat.get(event);
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            new TpatError(Sdk$SDKError.b.EMPTY_TPAT_ERROR, "Empty tpat key: " + event).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        switch (event) {
            case "checkpoint.0":
                List<String> list3 = list;
                ArrayList arrayList = new ArrayList(gl.r.v(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(complexReplace(complexReplace(complexReplace((String) it.next(), com.vungle.ads.internal.f.REMOTE_PLAY_KEY, String.valueOf(!this.assetsFullyDownloaded)), com.vungle.ads.internal.f.NETWORK_OPERATOR_KEY, value), com.vungle.ads.internal.f.DEVICE_VOLUME_KEY, secondValue));
                }
                return arrayList;
            case "video.length":
                List<String> list4 = list;
                ArrayList arrayList2 = new ArrayList(gl.r.v(list4, 10));
                Iterator<T> it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(complexReplace((String) it2.next(), com.vungle.ads.internal.f.VIDEO_LENGTH_KEY, value));
                }
                return arrayList2;
            case "ad.loadDuration":
                List<String> list5 = list;
                ArrayList arrayList3 = new ArrayList(gl.r.v(list5, 10));
                Iterator<T> it3 = list5.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(complexReplace((String) it3.next(), com.vungle.ads.internal.f.AD_LOAD_DURATION_KEY, value));
                }
                return arrayList3;
            case "ad.close":
                List<String> list6 = list;
                ArrayList arrayList4 = new ArrayList(gl.r.v(list6, 10));
                Iterator<T> it4 = list6.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(complexReplace(complexReplace((String) it4.next(), com.vungle.ads.internal.f.AD_DURATION_KEY, value), com.vungle.ads.internal.f.DEVICE_VOLUME_KEY, secondValue));
                }
                return arrayList4;
            case "deeplink.click":
                List<String> list7 = list;
                ArrayList arrayList5 = new ArrayList(gl.r.v(list7, 10));
                Iterator<T> it5 = list7.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(complexReplace((String) it5.next(), com.vungle.ads.internal.f.DEEPLINK_SUCCESS_KEY, value));
                }
                return arrayList5;
            default:
                if (event.equals(com.vungle.ads.internal.f.CHECKPOINT_0)) {
                    List<String> list8 = list;
                    ArrayList arrayList6 = new ArrayList(gl.r.v(list8, 10));
                    Iterator<T> it6 = list8.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add(complexReplace(complexReplace(complexReplace((String) it6.next(), com.vungle.ads.internal.f.REMOTE_PLAY_KEY, String.valueOf(!this.assetsFullyDownloaded)), com.vungle.ads.internal.f.NETWORK_OPERATOR_KEY, value), com.vungle.ads.internal.f.DEVICE_VOLUME_KEY, secondValue));
                    }
                    return arrayList6;
                }
                return list;
        }
    }

    public final String getViewMasterVersion() {
        c adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getVmVersion();
        }
        return null;
    }

    public final WebViewSettings getWebViewSettings() {
        c adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getWebViewSettings();
        }
        return null;
    }

    public final List<String> getWinNotifications() {
        c adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getNotification();
        }
        return null;
    }

    public final List<String> getWinUrls() {
        CSBResponse csb;
        PlacementAdUnit ad2 = getAd();
        if (ad2 == null || (csb = ad2.getCsb()) == null) {
            return null;
        }
        return csb.getNurls();
    }

    public final Double getWinningPrice() {
        CSBResponse csb;
        PlacementAdUnit ad2 = getAd();
        if (ad2 == null || (csb = ad2.getCsb()) == null) {
            return null;
        }
        return csb.getPrice();
    }

    public final boolean hasExpired() {
        c adMarkup = getAdMarkup();
        if (adMarkup == null) {
            return false;
        }
        Long l10 = this.expiryWindowStart;
        if (adMarkup.getExpiryDuration() != null && l10 != null) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - l10.longValue()) / 1000;
            Integer expiryDuration = adMarkup.getExpiryDuration();
            return jCurrentTimeMillis > (expiryDuration != null ? Long.valueOf((long) expiryDuration.intValue()) : null).longValue();
        }
        if (adMarkup.getExpiry() != null) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
            Integer expiry = adMarkup.getExpiry();
            if (jCurrentTimeMillis2 > (expiry != null ? Long.valueOf(expiry.intValue()) : null).longValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isAdPoddingEnabled() {
        TemplateSettings templateSettings;
        Map<String, String> normalReplacements;
        String str;
        c adMarkup = getAdMarkup();
        return (adMarkup == null || (templateSettings = adMarkup.getTemplateSettings()) == null || (normalReplacements = templateSettings.getNormalReplacements()) == null || (str = normalReplacements.get(com.vungle.ads.internal.f.AD_PODDING_KEY)) == null || !bm.r.A(str, "true", true)) ? false : true;
    }

    public final boolean isClickCoordinatesTrackingEnabled() {
        Boolean clickCoordinatesEnabled;
        c adMarkup = getAdMarkup();
        if (adMarkup == null || (clickCoordinatesEnabled = adMarkup.getClickCoordinatesEnabled()) == null) {
            return false;
        }
        return clickCoordinatesEnabled.booleanValue();
    }

    public final boolean isCriticalAsset(String failingUrl) {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        s.h(failingUrl, "failingUrl");
        if (!isNativeTemplateType()) {
            c adMarkup = getAdMarkup();
            if (s.c(adMarkup != null ? adMarkup.getVmURL() : null, failingUrl)) {
                return true;
            }
        }
        c adMarkup2 = getAdMarkup();
        if (adMarkup2 == null || (templateSettings = adMarkup2.getTemplateSettings()) == null || (cacheableReplacements = templateSettings.getCacheableReplacements()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
            if (s.c(entry.getValue().getUrl(), failingUrl)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return !linkedHashMap.isEmpty();
    }

    public final boolean isNativeTemplateType() {
        return s.c(templateType(), "native");
    }

    public final boolean isPartialDownloadEnabled() {
        Boolean partialDownloadEnabled;
        c adMarkup = getAdMarkup();
        return ((adMarkup == null || (partialDownloadEnabled = adMarkup.getPartialDownloadEnabled()) == null) ? false : partialDownloadEnabled.booleanValue()) && !isNativeTemplateType();
    }

    public final boolean omEnabled() {
        ViewAbility viewAbility;
        ViewAbilityInfo om2;
        Boolean boolIsEnabled;
        c adMarkup = getAdMarkup();
        if (adMarkup == null || (viewAbility = adMarkup.getViewAbility()) == null || (om2 = viewAbility.getOm()) == null || (boolIsEnabled = om2.isEnabled()) == null) {
            return false;
        }
        return boolIsEnabled.booleanValue();
    }

    public final String placementId() {
        PlacementAdUnit ad2 = getAd();
        if (ad2 != null) {
            return ad2.getPlacementReferenceId();
        }
        return null;
    }

    public final void recordExpiryWindowStart() {
        this.expiryWindowStart = Long.valueOf(System.currentTimeMillis());
    }

    public final void setAdConfig(com.vungle.ads.b bVar) {
        this.adConfig = bVar;
    }

    public final void setAssetFullyDownloaded() {
        this.assetsFullyDownloaded = true;
    }

    public final void setAssetsFullyDownloaded(boolean z10) {
        this.assetsFullyDownloaded = z10;
    }

    public final void setIncentivizedText(String title, String body, String keepWatching, String close) {
        s.h(title, "title");
        s.h(body, "body");
        s.h(keepWatching, "keepWatching");
        s.h(close, "close");
        if (title.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_TITLE_TEXT, title);
        }
        if (body.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_BODY_TEXT, body);
        }
        if (keepWatching.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CONTINUE_TEXT, keepWatching);
        }
        if (close.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CLOSE_TEXT, close);
        }
    }

    public final void setIncentivizedTextSettings(Map<String, String> map) {
        s.h(map, "<set-?>");
        this.incentivizedTextSettings = map;
    }

    public final void setLogEntry$vungle_ads_release(p pVar) {
        this.logEntry = pVar;
    }

    public final String templateType() {
        c adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getTemplateType();
        }
        return null;
    }

    public final synchronized void updateAdAssetPath(String adIdentifier, File localFile) {
        s.h(adIdentifier, "adIdentifier");
        s.h(localFile, "localFile");
        if (localFile.exists()) {
            this.mraidFiles.put(adIdentifier, FILE_SCHEME + localFile.getAbsolutePath());
        }
    }

    public final boolean usePreloading() {
        c adMarkup = getAdMarkup();
        return (adMarkup != null ? s.c(adMarkup.getUsePreloading(), Boolean.TRUE) : false) && !isNativeTemplateType();
    }

    public /* synthetic */ b(int i10, List list, g gVar, Long l10, ConcurrentHashMap concurrentHashMap, Map map, boolean z10, String str, q2 q2Var) {
        if ((i10 & 1) == 0) {
            this.ads = null;
        } else {
            this.ads = list;
        }
        if ((i10 & 2) == 0) {
            this.config = null;
        } else {
            this.config = gVar;
        }
        if ((i10 & 4) == 0) {
            this.expiryWindowStart = null;
        } else {
            this.expiryWindowStart = l10;
        }
        if ((i10 & 8) == 0) {
            this.mraidFiles = new ConcurrentHashMap<>();
        } else {
            this.mraidFiles = concurrentHashMap;
        }
        if ((i10 & 16) == 0) {
            this.incentivizedTextSettings = new HashMap();
        } else {
            this.incentivizedTextSettings = map;
        }
        if ((i10 & 32) == 0) {
            this.assetsFullyDownloaded = false;
        } else {
            this.assetsFullyDownloaded = z10;
        }
        this.adConfig = null;
        this.logEntry = null;
        if ((i10 & 64) == 0) {
            this.indexFilePath = null;
        } else {
            this.indexFilePath = str;
        }
        this.partialDownloadAssets = new LinkedHashMap();
    }

    public b(List<PlacementAdUnit> list, g gVar) {
        this.ads = list;
        this.config = gVar;
        this.mraidFiles = new ConcurrentHashMap<>();
        this.incentivizedTextSettings = new HashMap();
        this.partialDownloadAssets = new LinkedHashMap();
    }

    public /* synthetic */ b(List list, g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : gVar);
    }

    public static /* synthetic */ void getAdConfig$annotations() {
    }

    private static /* synthetic */ void getAds$annotations() {
    }

    private static /* synthetic */ void getConfig$annotations() {
    }

    public static /* synthetic */ void getIncentivizedTextSettings$annotations() {
    }

    public static /* synthetic */ void getLogEntry$vungle_ads_release$annotations() {
    }

    private static /* synthetic */ void getMraidFiles$annotations() {
    }

    public static /* synthetic */ void getPartialDownloadAssets$vungle_ads_release$annotations() {
    }
}
