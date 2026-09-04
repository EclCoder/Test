package com.vungle.ads.internal.model;

import com.bytedance.sdk.component.hn.hnj.yiH.PAFNPq;
import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.inmobi.sdk.InMobiSdk;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.UnknownFieldException;
import tm.f1;
import tm.g2;
import tm.l0;
import tm.q2;
import tm.u0;
import tm.v2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bh\b\u0087\b\u0018\u0000 \u0088\u00012\u00020\u0001:\u0014\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001Bå\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b \u0010!Bù\u0001\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J(\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)HÇ\u0001¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b4\u00105J\u0018\u00106\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b>\u0010=J\u0012\u0010?\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bA\u0010=J\u0012\u0010B\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bB\u0010@J\u0012\u0010C\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bC\u0010=J\u0012\u0010D\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bD\u0010=J\u0012\u0010E\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bE\u0010=J\u0012\u0010F\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bJ\u0010=Jî\u0001\u0010K\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\bM\u0010;J\u0010\u0010N\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\bN\u0010OJ\u001a\u0010Q\u001a\u00020\u00112\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bQ\u0010RR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010S\u0012\u0004\bU\u0010V\u001a\u0004\bT\u0010/R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010W\u0012\u0004\bY\u0010V\u001a\u0004\bX\u00101R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010Z\u0012\u0004\b\\\u0010V\u001a\u0004\b[\u00103R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010]\u0012\u0004\b_\u0010V\u001a\u0004\b^\u00105R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010`\u0012\u0004\bb\u0010V\u001a\u0004\ba\u00107R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010c\u0012\u0004\be\u0010V\u001a\u0004\bd\u00109R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010f\u0012\u0004\bh\u0010V\u001a\u0004\bg\u0010;R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010i\u0012\u0004\bk\u0010V\u001a\u0004\bj\u0010=R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010i\u0012\u0004\bl\u0010V\u001a\u0004\b\u0013\u0010=R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010m\u0012\u0004\bo\u0010V\u001a\u0004\bn\u0010@R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010i\u0012\u0004\bq\u0010V\u001a\u0004\bp\u0010=R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010m\u0012\u0004\bs\u0010V\u001a\u0004\br\u0010@R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010i\u0012\u0004\bu\u0010V\u001a\u0004\bt\u0010=R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010i\u0012\u0004\bw\u0010V\u001a\u0004\bv\u0010=R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010i\u0012\u0004\by\u0010V\u001a\u0004\bx\u0010=R*\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010z\u0012\u0004\b~\u0010V\u001a\u0004\b{\u0010G\"\u0004\b|\u0010}R.\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0004\b\u001e\u0010\u007f\u0012\u0005\b\u0083\u0001\u0010V\u001a\u0005\b\u0080\u0001\u0010I\"\u0006\b\u0081\u0001\u0010\u0082\u0001R.\u0010\u001f\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0004\b\u001f\u0010i\u0012\u0005\b\u0087\u0001\u0010V\u001a\u0005\b\u0084\u0001\u0010=\"\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006\u0093\u0001"}, d2 = {"Lcom/vungle/ads/internal/model/g;", "", "Lcom/vungle/ads/internal/model/g$c;", "cleverCache", "Lcom/vungle/ads/internal/model/g$e;", "configSettings", "Lcom/vungle/ads/internal/model/g$f;", "endpoints", "Lcom/vungle/ads/internal/model/g$i;", "logMetricsSettings", "", "Lcom/vungle/ads/internal/model/k;", "placements", "Lcom/vungle/ads/internal/model/g$j;", "userPrivacy", "", "configExtension", "", "disableAdId", "isReportIncentivizedEnabled", "", "sessionTimeout", "waitForConnectivityForTPAT", "signalSessionTimeout", "signalsDisabled", "fpdEnabled", "rtaDebugging", "", "configLastValidatedTimestamp", "Lcom/vungle/ads/internal/model/g$b;", "autoRedirect", "enableOT", "<init>", "(Lcom/vungle/ads/internal/model/g$c;Lcom/vungle/ads/internal/model/g$e;Lcom/vungle/ads/internal/model/g$f;Lcom/vungle/ads/internal/model/g$i;Ljava/util/List;Lcom/vungle/ads/internal/model/g$j;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/vungle/ads/internal/model/g$b;Ljava/lang/Boolean;)V", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/model/g$c;Lcom/vungle/ads/internal/model/g$e;Lcom/vungle/ads/internal/model/g$f;Lcom/vungle/ads/internal/model/g$i;Ljava/util/List;Lcom/vungle/ads/internal/model/g$j;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/vungle/ads/internal/model/g$b;Ljava/lang/Boolean;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/g;Lsm/d;Lrm/f;)V", "component1", "()Lcom/vungle/ads/internal/model/g$c;", "component2", "()Lcom/vungle/ads/internal/model/g$e;", "component3", "()Lcom/vungle/ads/internal/model/g$f;", "component4", "()Lcom/vungle/ads/internal/model/g$i;", "component5", "()Ljava/util/List;", "component6", "()Lcom/vungle/ads/internal/model/g$j;", "component7", "()Ljava/lang/String;", "component8", "()Ljava/lang/Boolean;", "component9", "component10", "()Ljava/lang/Integer;", "component11", "component12", "component13", "component14", "component15", "component16", "()Ljava/lang/Long;", "component17", "()Lcom/vungle/ads/internal/model/g$b;", "component18", "copy", "(Lcom/vungle/ads/internal/model/g$c;Lcom/vungle/ads/internal/model/g$e;Lcom/vungle/ads/internal/model/g$f;Lcom/vungle/ads/internal/model/g$i;Ljava/util/List;Lcom/vungle/ads/internal/model/g$j;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/vungle/ads/internal/model/g$b;Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/g;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/vungle/ads/internal/model/g$c;", "getCleverCache", "getCleverCache$annotations", "()V", "Lcom/vungle/ads/internal/model/g$e;", "getConfigSettings", "getConfigSettings$annotations", "Lcom/vungle/ads/internal/model/g$f;", "getEndpoints", "getEndpoints$annotations", "Lcom/vungle/ads/internal/model/g$i;", "getLogMetricsSettings", "getLogMetricsSettings$annotations", "Ljava/util/List;", "getPlacements", "getPlacements$annotations", "Lcom/vungle/ads/internal/model/g$j;", "getUserPrivacy", "getUserPrivacy$annotations", "Ljava/lang/String;", "getConfigExtension", "getConfigExtension$annotations", "Ljava/lang/Boolean;", "getDisableAdId", "getDisableAdId$annotations", "isReportIncentivizedEnabled$annotations", "Ljava/lang/Integer;", "getSessionTimeout", "getSessionTimeout$annotations", "getWaitForConnectivityForTPAT", "getWaitForConnectivityForTPAT$annotations", "getSignalSessionTimeout", "getSignalSessionTimeout$annotations", "getSignalsDisabled", "getSignalsDisabled$annotations", "getFpdEnabled", "getFpdEnabled$annotations", "getRtaDebugging", "getRtaDebugging$annotations", "Ljava/lang/Long;", "getConfigLastValidatedTimestamp", "setConfigLastValidatedTimestamp", "(Ljava/lang/Long;)V", "getConfigLastValidatedTimestamp$annotations", "Lcom/vungle/ads/internal/model/g$b;", "getAutoRedirect", "setAutoRedirect", "(Lcom/vungle/ads/internal/model/g$b;)V", "getAutoRedirect$annotations", "getEnableOT", "setEnableOT", "(Ljava/lang/Boolean;)V", "getEnableOT$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "e", "f", "g", "h", "i", "j", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@pm.k
public final /* data */ class g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private AutoRedirect autoRedirect;
    private final CleverCache cleverCache;
    private final String configExtension;
    private Long configLastValidatedTimestamp;
    private final ConfigSettings configSettings;
    private final Boolean disableAdId;
    private Boolean enableOT;
    private final Endpoints endpoints;
    private final Boolean fpdEnabled;
    private final Boolean isReportIncentivizedEnabled;
    private final LogMetricsSettings logMetricsSettings;
    private final List<Placement> placements;
    private final Boolean rtaDebugging;
    private final Integer sessionTimeout;
    private final Integer signalSessionTimeout;
    private final Boolean signalsDisabled;
    private final UserPrivacy userPrivacy;
    private final Boolean waitForConnectivityForTPAT;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a implements l0 {
        public static final a INSTANCE;
        public static final /* synthetic */ rm.f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            g2 g2Var = new g2("com.vungle.ads.internal.model.ConfigPayload", aVar, 18);
            g2Var.p("reuse_assets", true);
            g2Var.p("config", true);
            g2Var.p("endpoints", true);
            g2Var.p("log_metrics", true);
            g2Var.p("placements", true);
            g2Var.p("user", true);
            g2Var.p("config_extension", true);
            g2Var.p("disable_ad_id", true);
            g2Var.p("ri_enabled", true);
            g2Var.p("session_timeout", true);
            g2Var.p("wait_for_connectivity_for_tpat", true);
            g2Var.p("sdk_session_timeout", true);
            g2Var.p("signals_disabled", true);
            g2Var.p("fpd_enabled", true);
            g2Var.p("rta_debugging", true);
            g2Var.p("config_last_validated_ts", true);
            g2Var.p("auto_redirect", true);
            g2Var.p("enable_ot", true);
            descriptor = g2Var;
        }

        private a() {
        }

        @Override // tm.l0
        public pm.d[] childSerializers() {
            pm.d dVarT = qm.a.t(CleverCache.a.INSTANCE);
            pm.d dVarT2 = qm.a.t(ConfigSettings.a.INSTANCE);
            pm.d dVarT3 = qm.a.t(Endpoints.a.INSTANCE);
            pm.d dVarT4 = qm.a.t(LogMetricsSettings.a.INSTANCE);
            pm.d dVarT5 = qm.a.t(new tm.f(Placement.a.INSTANCE));
            pm.d dVarT6 = qm.a.t(UserPrivacy.a.INSTANCE);
            pm.d dVarT7 = qm.a.t(v2.f53598a);
            tm.i iVar = tm.i.f53507a;
            pm.d dVarT8 = qm.a.t(iVar);
            pm.d dVarT9 = qm.a.t(iVar);
            u0 u0Var = u0.f53588a;
            return new pm.d[]{dVarT, dVarT2, dVarT3, dVarT4, dVarT5, dVarT6, dVarT7, dVarT8, dVarT9, qm.a.t(u0Var), qm.a.t(iVar), qm.a.t(u0Var), qm.a.t(iVar), qm.a.t(iVar), qm.a.t(iVar), qm.a.t(f1.f53474a), qm.a.t(AutoRedirect.a.INSTANCE), qm.a.t(iVar)};
        }

        @Override // pm.c
        public g deserialize(sm.e decoder) {
            int i10;
            Object objE;
            Object obj;
            Object objE2;
            Object objE3;
            Object obj2;
            Object objE4;
            Object objE5;
            Object objE6;
            Object objE7;
            Object obj3;
            Object objE8;
            Object objE9;
            Object objE10;
            Object objE11;
            Object obj4;
            Object objE12;
            Object objE13;
            Object objE14;
            s.h(decoder, "decoder");
            rm.f descriptor2 = getDescriptor();
            sm.c cVarB = decoder.b(descriptor2);
            if (cVarB.l()) {
                Object objE15 = cVarB.e(descriptor2, 0, CleverCache.a.INSTANCE, null);
                objE3 = cVarB.e(descriptor2, 1, ConfigSettings.a.INSTANCE, null);
                objE2 = cVarB.e(descriptor2, 2, Endpoints.a.INSTANCE, null);
                objE14 = cVarB.e(descriptor2, 3, LogMetricsSettings.a.INSTANCE, null);
                objE6 = cVarB.e(descriptor2, 4, new tm.f(Placement.a.INSTANCE), null);
                objE7 = cVarB.e(descriptor2, 5, UserPrivacy.a.INSTANCE, null);
                objE5 = cVarB.e(descriptor2, 6, v2.f53598a, null);
                tm.i iVar = tm.i.f53507a;
                objE4 = cVarB.e(descriptor2, 7, iVar, null);
                Object objE16 = cVarB.e(descriptor2, 8, iVar, null);
                u0 u0Var = u0.f53588a;
                objE13 = cVarB.e(descriptor2, 9, u0Var, null);
                objE12 = cVarB.e(descriptor2, 10, iVar, null);
                Object objE17 = cVarB.e(descriptor2, 11, u0Var, null);
                objE11 = cVarB.e(descriptor2, 12, iVar, null);
                obj4 = objE17;
                objE10 = cVarB.e(descriptor2, 13, iVar, null);
                objE9 = cVarB.e(descriptor2, 14, iVar, null);
                obj2 = objE16;
                objE8 = cVarB.e(descriptor2, 15, f1.f53474a, null);
                Object objE18 = cVarB.e(descriptor2, 16, AutoRedirect.a.INSTANCE, null);
                i10 = 262143;
                objE = cVarB.e(descriptor2, 17, iVar, null);
                obj3 = objE18;
                obj = objE15;
            } else {
                boolean z10 = true;
                Object objE19 = null;
                Object objE20 = null;
                Object objE21 = null;
                Object objE22 = null;
                Object objE23 = null;
                Object objE24 = null;
                Object objE25 = null;
                Object objE26 = null;
                Object objE27 = null;
                Object objE28 = null;
                Object objE29 = null;
                Object objE30 = null;
                Object objE31 = null;
                Object objE32 = null;
                Object objE33 = null;
                Object objE34 = null;
                Object objE35 = null;
                i10 = 0;
                Object objE36 = null;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    switch (iO) {
                        case -1:
                            z10 = false;
                            objE36 = objE36;
                            objE22 = objE22;
                            objE20 = objE20;
                            objE35 = objE35;
                            objE19 = objE19;
                            break;
                        case 0:
                            i10 |= 1;
                            objE36 = objE36;
                            objE22 = objE22;
                            objE19 = objE19;
                            objE20 = objE20;
                            objE35 = cVarB.e(descriptor2, 0, CleverCache.a.INSTANCE, objE35);
                            break;
                        case 1:
                            i10 |= 2;
                            objE22 = objE22;
                            objE19 = objE19;
                            objE36 = cVarB.e(descriptor2, 1, ConfigSettings.a.INSTANCE, objE36);
                            break;
                        case 2:
                            objE21 = cVarB.e(descriptor2, 2, Endpoints.a.INSTANCE, objE21);
                            i10 |= 4;
                            objE22 = objE22;
                            objE36 = objE36;
                            break;
                        case 3:
                            objE20 = cVarB.e(descriptor2, 3, LogMetricsSettings.a.INSTANCE, objE20);
                            i10 |= 8;
                            objE22 = objE22;
                            objE36 = objE36;
                            break;
                        case 4:
                            objE28 = cVarB.e(descriptor2, 4, new tm.f(Placement.a.INSTANCE), objE28);
                            i10 |= 16;
                            objE22 = objE22;
                            objE36 = objE36;
                            break;
                        case 5:
                            objE29 = cVarB.e(descriptor2, 5, UserPrivacy.a.INSTANCE, objE29);
                            i10 |= 32;
                            objE22 = objE22;
                            objE36 = objE36;
                            break;
                        case 6:
                            objE27 = cVarB.e(descriptor2, 6, v2.f53598a, objE27);
                            i10 |= 64;
                            objE22 = objE22;
                            objE36 = objE36;
                            break;
                        case 7:
                            objE26 = cVarB.e(descriptor2, 7, tm.i.f53507a, objE26);
                            i10 |= 128;
                            objE22 = objE22;
                            objE36 = objE36;
                            break;
                        case 8:
                            objE25 = cVarB.e(descriptor2, 8, tm.i.f53507a, objE25);
                            i10 |= 256;
                            objE22 = objE22;
                            objE36 = objE36;
                            break;
                        case 9:
                            objE19 = cVarB.e(descriptor2, 9, u0.f53588a, objE19);
                            i10 |= 512;
                            objE22 = objE22;
                            objE36 = objE36;
                            break;
                        case 10:
                            objE24 = cVarB.e(descriptor2, 10, tm.i.f53507a, objE24);
                            i10 |= UserVerificationMethods.USER_VERIFY_ALL;
                            objE22 = objE22;
                            objE36 = objE36;
                            break;
                        case 11:
                            objE23 = cVarB.e(descriptor2, 11, u0.f53588a, objE23);
                            i10 |= 2048;
                            objE22 = objE22;
                            objE36 = objE36;
                            break;
                        case 12:
                            objE36 = objE36;
                            objE30 = cVarB.e(descriptor2, 12, tm.i.f53507a, objE30);
                            i10 |= 4096;
                            objE22 = objE22;
                            objE31 = objE31;
                            objE36 = objE36;
                            break;
                        case 13:
                            objE36 = objE36;
                            objE31 = cVarB.e(descriptor2, 13, tm.i.f53507a, objE31);
                            i10 |= 8192;
                            objE22 = objE22;
                            objE32 = objE32;
                            objE36 = objE36;
                            break;
                        case 14:
                            objE36 = objE36;
                            objE32 = cVarB.e(descriptor2, 14, tm.i.f53507a, objE32);
                            i10 |= 16384;
                            objE22 = objE22;
                            objE33 = objE33;
                            objE36 = objE36;
                            break;
                        case 15:
                            objE36 = objE36;
                            objE33 = cVarB.e(descriptor2, 15, f1.f53474a, objE33);
                            i10 |= 32768;
                            objE22 = objE22;
                            objE34 = objE34;
                            objE36 = objE36;
                            break;
                        case 16:
                            objE34 = cVarB.e(descriptor2, 16, AutoRedirect.a.INSTANCE, objE34);
                            i10 |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
                            objE22 = objE22;
                            objE36 = objE36;
                            break;
                        case 17:
                            objE22 = cVarB.e(descriptor2, 17, tm.i.f53507a, objE22);
                            i10 |= 131072;
                            objE36 = objE36;
                            break;
                        default:
                            throw new UnknownFieldException(iO);
                    }
                }
                Object obj5 = objE19;
                objE = objE22;
                Object obj6 = objE35;
                Object obj7 = objE20;
                obj = obj6;
                objE2 = objE21;
                objE3 = objE36;
                obj2 = objE25;
                objE4 = objE26;
                objE5 = objE27;
                objE6 = objE28;
                objE7 = objE29;
                obj3 = objE34;
                objE8 = objE33;
                objE9 = objE32;
                objE10 = objE31;
                objE11 = objE30;
                obj4 = objE23;
                objE12 = objE24;
                objE13 = obj5;
                objE14 = obj7;
            }
            int i11 = i10;
            cVarB.d(descriptor2);
            return new g(i11, (CleverCache) obj, (ConfigSettings) objE3, (Endpoints) objE2, (LogMetricsSettings) objE14, (List) objE6, (UserPrivacy) objE7, (String) objE5, (Boolean) objE4, (Boolean) obj2, (Integer) objE13, (Boolean) objE12, (Integer) obj4, (Boolean) objE11, (Boolean) objE10, (Boolean) objE9, (Long) objE8, (AutoRedirect) obj3, (Boolean) objE, (q2) null);
        }

        @Override // pm.d, pm.l, pm.c
        public rm.f getDescriptor() {
            return descriptor;
        }

        @Override // pm.l
        public void serialize(sm.f encoder, g value) {
            s.h(encoder, "encoder");
            s.h(value, "value");
            rm.f descriptor2 = getDescriptor();
            sm.d dVarB = encoder.b(descriptor2);
            g.write$Self(value, dVarB, descriptor2);
            dVarB.d(descriptor2);
        }

        @Override // tm.l0
        public pm.d[] typeParametersSerializers() {
            return l0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$b, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0018¨\u0006-"}, d2 = {"Lcom/vungle/ads/internal/model/g$b;", "", "", "allowAutoRedirect", "", "afterClickDuration", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;)V", "", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Long;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/g$b;Lsm/d;Lrm/f;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/Long;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/vungle/ads/internal/model/g$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getAllowAutoRedirect", "getAllowAutoRedirect$annotations", "()V", "Ljava/lang/Long;", "getAfterClickDuration", "getAfterClickDuration$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class AutoRedirect {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Long afterClickDuration;
        private final Boolean allowAutoRedirect;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$b$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.ConfigPayload.AutoRedirect", aVar, 2);
                g2Var.p("allow_auto_redirect", true);
                g2Var.p("after_click_ms", true);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                return new pm.d[]{qm.a.t(tm.i.f53507a), qm.a.t(f1.f53474a)};
            }

            @Override // pm.c
            public AutoRedirect deserialize(sm.e decoder) {
                Object objE;
                Object objE2;
                int i10;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                q2 q2Var = null;
                if (cVarB.l()) {
                    objE = cVarB.e(descriptor2, 0, tm.i.f53507a, null);
                    objE2 = cVarB.e(descriptor2, 1, f1.f53474a, null);
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
                            objE3 = cVarB.e(descriptor2, 1, f1.f53474a, objE3);
                            i11 |= 2;
                        }
                    }
                    objE2 = objE3;
                    i10 = i11;
                }
                cVarB.d(descriptor2);
                return new AutoRedirect(i10, (Boolean) objE, (Long) objE2, q2Var);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, AutoRedirect value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                AutoRedirect.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$b$b, reason: collision with other inner class name and from kotlin metadata */
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
        public AutoRedirect() {
            this((Boolean) null, (Long) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ AutoRedirect copy$default(AutoRedirect autoRedirect, Boolean bool, Long l10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = autoRedirect.allowAutoRedirect;
            }
            if ((i10 & 2) != 0) {
                l10 = autoRedirect.afterClickDuration;
            }
            return autoRedirect.copy(bool, l10);
        }

        public static final void write$Self(AutoRedirect self, sm.d output, rm.f serialDesc) {
            Long l10;
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            if (output.k(serialDesc, 0) || !s.c(self.allowAutoRedirect, Boolean.FALSE)) {
                output.w(serialDesc, 0, tm.i.f53507a, self.allowAutoRedirect);
            }
            if (output.k(serialDesc, 1) || (l10 = self.afterClickDuration) == null || l10.longValue() != Long.MAX_VALUE) {
                output.w(serialDesc, 1, f1.f53474a, self.afterClickDuration);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getAllowAutoRedirect() {
            return this.allowAutoRedirect;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getAfterClickDuration() {
            return this.afterClickDuration;
        }

        public final AutoRedirect copy(Boolean allowAutoRedirect, Long afterClickDuration) {
            return new AutoRedirect(allowAutoRedirect, afterClickDuration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoRedirect)) {
                return false;
            }
            AutoRedirect autoRedirect = (AutoRedirect) other;
            return s.c(this.allowAutoRedirect, autoRedirect.allowAutoRedirect) && s.c(this.afterClickDuration, autoRedirect.afterClickDuration);
        }

        public final Long getAfterClickDuration() {
            return this.afterClickDuration;
        }

        public final Boolean getAllowAutoRedirect() {
            return this.allowAutoRedirect;
        }

        public int hashCode() {
            Boolean bool = this.allowAutoRedirect;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l10 = this.afterClickDuration;
            return iHashCode + (l10 != null ? l10.hashCode() : 0);
        }

        public String toString() {
            return "AutoRedirect(allowAutoRedirect=" + this.allowAutoRedirect + ", afterClickDuration=" + this.afterClickDuration + ')';
        }

        public /* synthetic */ AutoRedirect(int i10, Boolean bool, Long l10, q2 q2Var) {
            this.allowAutoRedirect = (i10 & 1) == 0 ? Boolean.FALSE : bool;
            if ((i10 & 2) == 0) {
                this.afterClickDuration = Long.MAX_VALUE;
            } else {
                this.afterClickDuration = l10;
            }
        }

        public AutoRedirect(Boolean bool, Long l10) {
            this.allowAutoRedirect = bool;
            this.afterClickDuration = l10;
        }

        public /* synthetic */ AutoRedirect(Boolean bool, Long l10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? Boolean.FALSE : bool, (i10 & 2) != 0 ? Long.MAX_VALUE : l10);
        }

        public static /* synthetic */ void getAfterClickDuration$annotations() {
        }

        public static /* synthetic */ void getAllowAutoRedirect$annotations() {
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$c, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0015R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0017¨\u0006-"}, d2 = {"Lcom/vungle/ads/internal/model/g$c;", "", "", "diskSize", "", "diskPercentage", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;)V", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Integer;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/g$c;Lsm/d;Lrm/f;)V", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Long;Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/g$c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getDiskSize", "getDiskSize$annotations", "()V", "Ljava/lang/Integer;", "getDiskPercentage", "getDiskPercentage$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class CleverCache {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Integer diskPercentage;
        private final Long diskSize;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$c$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        /* JADX INFO: loaded from: classes6.dex */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.ConfigPayload.CleverCache", aVar, 2);
                g2Var.p("disk_size", true);
                g2Var.p("disk_percentage", true);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                return new pm.d[]{qm.a.t(f1.f53474a), qm.a.t(u0.f53588a)};
            }

            @Override // pm.c
            public CleverCache deserialize(sm.e decoder) {
                Object objE;
                Object objE2;
                int i10;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                q2 q2Var = null;
                if (cVarB.l()) {
                    objE = cVarB.e(descriptor2, 0, f1.f53474a, null);
                    objE2 = cVarB.e(descriptor2, 1, u0.f53588a, null);
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
                            objE = cVarB.e(descriptor2, 0, f1.f53474a, objE);
                            i11 |= 1;
                        } else {
                            if (iO != 1) {
                                throw new UnknownFieldException(iO);
                            }
                            objE3 = cVarB.e(descriptor2, 1, u0.f53588a, objE3);
                            i11 |= 2;
                        }
                    }
                    objE2 = objE3;
                    i10 = i11;
                }
                cVarB.d(descriptor2);
                return new CleverCache(i10, (Long) objE, (Integer) objE2, q2Var);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, CleverCache value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                CleverCache.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$c$b, reason: from kotlin metadata */
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

        /* JADX WARN: Multi-variable type inference failed */
        public CleverCache() {
            this((Long) null, (Integer) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ CleverCache copy$default(CleverCache cleverCache, Long l10, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                l10 = cleverCache.diskSize;
            }
            if ((i10 & 2) != 0) {
                num = cleverCache.diskPercentage;
            }
            return cleverCache.copy(l10, num);
        }

        public static /* synthetic */ void getDiskPercentage$annotations() {
        }

        public static /* synthetic */ void getDiskSize$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getDiskSize() {
            return this.diskSize;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getDiskPercentage() {
            return this.diskPercentage;
        }

        public final CleverCache copy(Long diskSize, Integer diskPercentage) {
            return new CleverCache(diskSize, diskPercentage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CleverCache)) {
                return false;
            }
            CleverCache cleverCache = (CleverCache) other;
            return s.c(this.diskSize, cleverCache.diskSize) && s.c(this.diskPercentage, cleverCache.diskPercentage);
        }

        public final Integer getDiskPercentage() {
            return this.diskPercentage;
        }

        public final Long getDiskSize() {
            return this.diskSize;
        }

        public int hashCode() {
            Long l10 = this.diskSize;
            int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
            Integer num = this.diskPercentage;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "CleverCache(diskSize=" + this.diskSize + ", diskPercentage=" + this.diskPercentage + ')';
        }

        public /* synthetic */ CleverCache(int i10, Long l10, Integer num, q2 q2Var) {
            this.diskSize = (i10 & 1) == 0 ? 1000L : l10;
            if ((i10 & 2) == 0) {
                this.diskPercentage = 3;
            } else {
                this.diskPercentage = num;
            }
        }

        public static final void write$Self(CleverCache self, sm.d output, rm.f serialDesc) {
            Integer num;
            Long l10;
            s.h(self, "self");
            s.h(output, PAFNPq.UwWPqIvKKgE);
            s.h(serialDesc, "serialDesc");
            if (output.k(serialDesc, 0) || (l10 = self.diskSize) == null || l10.longValue() != 1000) {
                output.w(serialDesc, 0, f1.f53474a, self.diskSize);
            }
            if (output.k(serialDesc, 1) || (num = self.diskPercentage) == null || num.intValue() != 3) {
                output.w(serialDesc, 1, u0.f53588a, self.diskPercentage);
            }
        }

        public CleverCache(Long l10, Integer num) {
            this.diskSize = l10;
            this.diskPercentage = num;
        }

        public /* synthetic */ CleverCache(Long l10, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 1000L : l10, (i10 & 2) != 0 ? 3 : num);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$d, reason: from kotlin metadata */
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

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$e, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0014¨\u0006'"}, d2 = {"Lcom/vungle/ads/internal/model/g$e;", "", "", "refreshTime", "<init>", "(Ljava/lang/Long;)V", "", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/Long;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/g$e;Lsm/d;Lrm/f;)V", "component1", "()Ljava/lang/Long;", "copy", "(Ljava/lang/Long;)Lcom/vungle/ads/internal/model/g$e;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getRefreshTime", "getRefreshTime$annotations", "()V", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class ConfigSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Long refreshTime;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$e$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.ConfigPayload.ConfigSettings", aVar, 1);
                g2Var.p("refresh_interval", true);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                return new pm.d[]{qm.a.t(f1.f53474a)};
            }

            @Override // pm.c
            public ConfigSettings deserialize(sm.e decoder) {
                Object objE;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                int i10 = 1;
                q2 q2Var = null;
                if (cVarB.l()) {
                    objE = cVarB.e(descriptor2, 0, f1.f53474a, null);
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
                            objE = cVarB.e(descriptor2, 0, f1.f53474a, objE);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarB.d(descriptor2);
                return new ConfigSettings(i10, (Long) objE, q2Var);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, ConfigSettings value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                ConfigSettings.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$e$b, reason: from kotlin metadata */
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
        public ConfigSettings() {
            this((Long) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ ConfigSettings copy$default(ConfigSettings configSettings, Long l10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                l10 = configSettings.refreshTime;
            }
            return configSettings.copy(l10);
        }

        public static final void write$Self(ConfigSettings self, sm.d output, rm.f serialDesc) {
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            if (!output.k(serialDesc, 0) && self.refreshTime == null) {
                return;
            }
            output.w(serialDesc, 0, f1.f53474a, self.refreshTime);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getRefreshTime() {
            return this.refreshTime;
        }

        public final ConfigSettings copy(Long refreshTime) {
            return new ConfigSettings(refreshTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConfigSettings) && s.c(this.refreshTime, ((ConfigSettings) other).refreshTime);
        }

        public final Long getRefreshTime() {
            return this.refreshTime;
        }

        public int hashCode() {
            Long l10 = this.refreshTime;
            if (l10 == null) {
                return 0;
            }
            return l10.hashCode();
        }

        public String toString() {
            return "ConfigSettings(refreshTime=" + this.refreshTime + ')';
        }

        public /* synthetic */ ConfigSettings(int i10, Long l10, q2 q2Var) {
            if ((i10 & 1) == 0) {
                this.refreshTime = null;
            } else {
                this.refreshTime = l10;
            }
        }

        public ConfigSettings(Long l10) {
            this.refreshTime = l10;
        }

        public /* synthetic */ ConfigSettings(Long l10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : l10);
        }

        public static /* synthetic */ void getRefreshTime$annotations() {
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$f, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBW\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018JL\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b-\u0010)\u001a\u0004\b,\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b1\u0010)\u001a\u0004\b0\u0010\u0018¨\u00065"}, d2 = {"Lcom/vungle/ads/internal/model/g$f;", "", "", "adsEndpoint", "riEndpoint", "errorLogsEndpoint", "metricsEndpoint", "csbEndpoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/g$f;Lsm/d;Lrm/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vungle/ads/internal/model/g$f;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAdsEndpoint", "getAdsEndpoint$annotations", "()V", "getRiEndpoint", "getRiEndpoint$annotations", "getErrorLogsEndpoint", "getErrorLogsEndpoint$annotations", "getMetricsEndpoint", "getMetricsEndpoint$annotations", "getCsbEndpoint", "getCsbEndpoint$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class Endpoints {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String adsEndpoint;
        private final String csbEndpoint;
        private final String errorLogsEndpoint;
        private final String metricsEndpoint;
        private final String riEndpoint;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$f$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.ConfigPayload.Endpoints", aVar, 5);
                g2Var.p(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, true);
                g2Var.p("ri", true);
                g2Var.p("error_logs", true);
                g2Var.p("metrics", true);
                g2Var.p("csb", true);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                v2 v2Var = v2.f53598a;
                return new pm.d[]{qm.a.t(v2Var), qm.a.t(v2Var), qm.a.t(v2Var), qm.a.t(v2Var), qm.a.t(v2Var)};
            }

            @Override // pm.c
            public Endpoints deserialize(sm.e decoder) {
                Object objE;
                int i10;
                Object objE2;
                Object objE3;
                Object objE4;
                Object objE5;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                Object objE6 = null;
                if (cVarB.l()) {
                    v2 v2Var = v2.f53598a;
                    objE2 = cVarB.e(descriptor2, 0, v2Var, null);
                    objE3 = cVarB.e(descriptor2, 1, v2Var, null);
                    Object objE7 = cVarB.e(descriptor2, 2, v2Var, null);
                    objE4 = cVarB.e(descriptor2, 3, v2Var, null);
                    objE5 = cVarB.e(descriptor2, 4, v2Var, null);
                    objE = objE7;
                    i10 = 31;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    Object objE8 = null;
                    objE = null;
                    Object objE9 = null;
                    Object objE10 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            objE6 = cVarB.e(descriptor2, 0, v2.f53598a, objE6);
                            i11 |= 1;
                        } else if (iO == 1) {
                            objE8 = cVarB.e(descriptor2, 1, v2.f53598a, objE8);
                            i11 |= 2;
                        } else if (iO == 2) {
                            objE = cVarB.e(descriptor2, 2, v2.f53598a, objE);
                            i11 |= 4;
                        } else if (iO == 3) {
                            objE9 = cVarB.e(descriptor2, 3, v2.f53598a, objE9);
                            i11 |= 8;
                        } else {
                            if (iO != 4) {
                                throw new UnknownFieldException(iO);
                            }
                            objE10 = cVarB.e(descriptor2, 4, v2.f53598a, objE10);
                            i11 |= 16;
                        }
                    }
                    i10 = i11;
                    objE2 = objE6;
                    objE3 = objE8;
                    objE4 = objE9;
                    objE5 = objE10;
                }
                cVarB.d(descriptor2);
                return new Endpoints(i10, (String) objE2, (String) objE3, (String) objE, (String) objE4, (String) objE5, (q2) null);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, Endpoints value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                Endpoints.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$f$b, reason: from kotlin metadata */
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

        public Endpoints() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Endpoints copy$default(Endpoints endpoints, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = endpoints.adsEndpoint;
            }
            if ((i10 & 2) != 0) {
                str2 = endpoints.riEndpoint;
            }
            if ((i10 & 4) != 0) {
                str3 = endpoints.errorLogsEndpoint;
            }
            if ((i10 & 8) != 0) {
                str4 = endpoints.metricsEndpoint;
            }
            if ((i10 & 16) != 0) {
                str5 = endpoints.csbEndpoint;
            }
            String str6 = str5;
            String str7 = str3;
            return endpoints.copy(str, str2, str7, str4, str6);
        }

        public static final void write$Self(Endpoints self, sm.d output, rm.f serialDesc) {
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            if (output.k(serialDesc, 0) || self.adsEndpoint != null) {
                output.w(serialDesc, 0, v2.f53598a, self.adsEndpoint);
            }
            if (output.k(serialDesc, 1) || self.riEndpoint != null) {
                output.w(serialDesc, 1, v2.f53598a, self.riEndpoint);
            }
            if (output.k(serialDesc, 2) || self.errorLogsEndpoint != null) {
                output.w(serialDesc, 2, v2.f53598a, self.errorLogsEndpoint);
            }
            if (output.k(serialDesc, 3) || self.metricsEndpoint != null) {
                output.w(serialDesc, 3, v2.f53598a, self.metricsEndpoint);
            }
            if (!output.k(serialDesc, 4) && self.csbEndpoint == null) {
                return;
            }
            output.w(serialDesc, 4, v2.f53598a, self.csbEndpoint);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAdsEndpoint() {
            return this.adsEndpoint;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRiEndpoint() {
            return this.riEndpoint;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getErrorLogsEndpoint() {
            return this.errorLogsEndpoint;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMetricsEndpoint() {
            return this.metricsEndpoint;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getCsbEndpoint() {
            return this.csbEndpoint;
        }

        public final Endpoints copy(String adsEndpoint, String riEndpoint, String errorLogsEndpoint, String metricsEndpoint, String csbEndpoint) {
            return new Endpoints(adsEndpoint, riEndpoint, errorLogsEndpoint, metricsEndpoint, csbEndpoint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Endpoints)) {
                return false;
            }
            Endpoints endpoints = (Endpoints) other;
            return s.c(this.adsEndpoint, endpoints.adsEndpoint) && s.c(this.riEndpoint, endpoints.riEndpoint) && s.c(this.errorLogsEndpoint, endpoints.errorLogsEndpoint) && s.c(this.metricsEndpoint, endpoints.metricsEndpoint) && s.c(this.csbEndpoint, endpoints.csbEndpoint);
        }

        public final String getAdsEndpoint() {
            return this.adsEndpoint;
        }

        public final String getCsbEndpoint() {
            return this.csbEndpoint;
        }

        public final String getErrorLogsEndpoint() {
            return this.errorLogsEndpoint;
        }

        public final String getMetricsEndpoint() {
            return this.metricsEndpoint;
        }

        public final String getRiEndpoint() {
            return this.riEndpoint;
        }

        public int hashCode() {
            String str = this.adsEndpoint;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.riEndpoint;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.errorLogsEndpoint;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.metricsEndpoint;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.csbEndpoint;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "Endpoints(adsEndpoint=" + this.adsEndpoint + ", riEndpoint=" + this.riEndpoint + ", errorLogsEndpoint=" + this.errorLogsEndpoint + ", metricsEndpoint=" + this.metricsEndpoint + ", csbEndpoint=" + this.csbEndpoint + ')';
        }

        public /* synthetic */ Endpoints(int i10, String str, String str2, String str3, String str4, String str5, q2 q2Var) {
            if ((i10 & 1) == 0) {
                this.adsEndpoint = null;
            } else {
                this.adsEndpoint = str;
            }
            if ((i10 & 2) == 0) {
                this.riEndpoint = null;
            } else {
                this.riEndpoint = str2;
            }
            if ((i10 & 4) == 0) {
                this.errorLogsEndpoint = null;
            } else {
                this.errorLogsEndpoint = str3;
            }
            if ((i10 & 8) == 0) {
                this.metricsEndpoint = null;
            } else {
                this.metricsEndpoint = str4;
            }
            if ((i10 & 16) == 0) {
                this.csbEndpoint = null;
            } else {
                this.csbEndpoint = str5;
            }
        }

        public Endpoints(String str, String str2, String str3, String str4, String str5) {
            this.adsEndpoint = str;
            this.riEndpoint = str2;
            this.errorLogsEndpoint = str3;
            this.metricsEndpoint = str4;
            this.csbEndpoint = str5;
        }

        public /* synthetic */ Endpoints(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
        }

        public static /* synthetic */ void getAdsEndpoint$annotations() {
        }

        public static /* synthetic */ void getCsbEndpoint$annotations() {
        }

        public static /* synthetic */ void getErrorLogsEndpoint$annotations() {
        }

        public static /* synthetic */ void getMetricsEndpoint$annotations() {
        }

        public static /* synthetic */ void getRiEndpoint$annotations() {
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$g, reason: collision with other inner class name and from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bBc\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001cJX\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b*\u0010+\u001a\u0004\b\u0003\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b0\u0010+\u001a\u0004\b/\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b2\u0010+\u001a\u0004\b1\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b4\u0010+\u001a\u0004\b3\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b6\u0010+\u001a\u0004\b5\u0010\u001c¨\u0006:"}, d2 = {"Lcom/vungle/ads/internal/model/g$g;", "", "", "isCountryDataProtected", "", "consentTitle", "consentMessage", "consentMessageVersion", "buttonAccept", "buttonDeny", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/g$g;Lsm/d;Lrm/f;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vungle/ads/internal/model/g$g;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "isCountryDataProtected$annotations", "()V", "Ljava/lang/String;", "getConsentTitle", "getConsentTitle$annotations", "getConsentMessage", "getConsentMessage$annotations", "getConsentMessageVersion", "getConsentMessageVersion$annotations", "getButtonAccept", "getButtonAccept$annotations", "getButtonDeny", "getButtonDeny$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class GDPRSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String buttonAccept;
        private final String buttonDeny;
        private final String consentMessage;
        private final String consentMessageVersion;
        private final String consentTitle;
        private final Boolean isCountryDataProtected;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$g$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.ConfigPayload.GDPRSettings", aVar, 6);
                g2Var.p("is_country_data_protected", true);
                g2Var.p("consent_title", true);
                g2Var.p("consent_message", true);
                g2Var.p("consent_message_version", true);
                g2Var.p("button_accept", true);
                g2Var.p("button_deny", true);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                pm.d dVarT = qm.a.t(tm.i.f53507a);
                v2 v2Var = v2.f53598a;
                return new pm.d[]{dVarT, qm.a.t(v2Var), qm.a.t(v2Var), qm.a.t(v2Var), qm.a.t(v2Var), qm.a.t(v2Var)};
            }

            @Override // pm.c
            public GDPRSettings deserialize(sm.e decoder) {
                int i10;
                Object objE;
                Object objE2;
                Object objE3;
                Object objE4;
                Object objE5;
                Object objE6;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                int i11 = 5;
                Object objE7 = null;
                if (cVarB.l()) {
                    objE = cVarB.e(descriptor2, 0, tm.i.f53507a, null);
                    v2 v2Var = v2.f53598a;
                    objE2 = cVarB.e(descriptor2, 1, v2Var, null);
                    objE3 = cVarB.e(descriptor2, 2, v2Var, null);
                    objE4 = cVarB.e(descriptor2, 3, v2Var, null);
                    objE5 = cVarB.e(descriptor2, 4, v2Var, null);
                    objE6 = cVarB.e(descriptor2, 5, v2Var, null);
                    i10 = 63;
                } else {
                    boolean z10 = true;
                    int i12 = 0;
                    Object objE8 = null;
                    Object objE9 = null;
                    Object objE10 = null;
                    Object objE11 = null;
                    Object objE12 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        switch (iO) {
                            case -1:
                                z10 = false;
                                i11 = 5;
                                break;
                            case 0:
                                objE7 = cVarB.e(descriptor2, 0, tm.i.f53507a, objE7);
                                i12 |= 1;
                                i11 = 5;
                                break;
                            case 1:
                                objE8 = cVarB.e(descriptor2, 1, v2.f53598a, objE8);
                                i12 |= 2;
                                break;
                            case 2:
                                objE9 = cVarB.e(descriptor2, 2, v2.f53598a, objE9);
                                i12 |= 4;
                                break;
                            case 3:
                                objE10 = cVarB.e(descriptor2, 3, v2.f53598a, objE10);
                                i12 |= 8;
                                break;
                            case 4:
                                objE11 = cVarB.e(descriptor2, 4, v2.f53598a, objE11);
                                i12 |= 16;
                                break;
                            case 5:
                                objE12 = cVarB.e(descriptor2, i11, v2.f53598a, objE12);
                                i12 |= 32;
                                break;
                            default:
                                throw new UnknownFieldException(iO);
                        }
                    }
                    Object obj = objE7;
                    i10 = i12;
                    objE = obj;
                    objE2 = objE8;
                    objE3 = objE9;
                    objE4 = objE10;
                    objE5 = objE11;
                    objE6 = objE12;
                }
                cVarB.d(descriptor2);
                return new GDPRSettings(i10, (Boolean) objE, (String) objE2, (String) objE3, (String) objE4, (String) objE5, (String) objE6, (q2) null);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, GDPRSettings value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                GDPRSettings.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$g$b, reason: from kotlin metadata */
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

        public GDPRSettings() {
            this((Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ GDPRSettings copy$default(GDPRSettings gDPRSettings, Boolean bool, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = gDPRSettings.isCountryDataProtected;
            }
            if ((i10 & 2) != 0) {
                str = gDPRSettings.consentTitle;
            }
            if ((i10 & 4) != 0) {
                str2 = gDPRSettings.consentMessage;
            }
            if ((i10 & 8) != 0) {
                str3 = gDPRSettings.consentMessageVersion;
            }
            if ((i10 & 16) != 0) {
                str4 = gDPRSettings.buttonAccept;
            }
            if ((i10 & 32) != 0) {
                str5 = gDPRSettings.buttonDeny;
            }
            String str6 = str4;
            String str7 = str5;
            return gDPRSettings.copy(bool, str, str2, str3, str6, str7);
        }

        public static final void write$Self(GDPRSettings self, sm.d output, rm.f serialDesc) {
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            if (output.k(serialDesc, 0) || self.isCountryDataProtected != null) {
                output.w(serialDesc, 0, tm.i.f53507a, self.isCountryDataProtected);
            }
            if (output.k(serialDesc, 1) || self.consentTitle != null) {
                output.w(serialDesc, 1, v2.f53598a, self.consentTitle);
            }
            if (output.k(serialDesc, 2) || self.consentMessage != null) {
                output.w(serialDesc, 2, v2.f53598a, self.consentMessage);
            }
            if (output.k(serialDesc, 3) || self.consentMessageVersion != null) {
                output.w(serialDesc, 3, v2.f53598a, self.consentMessageVersion);
            }
            if (output.k(serialDesc, 4) || self.buttonAccept != null) {
                output.w(serialDesc, 4, v2.f53598a, self.buttonAccept);
            }
            if (!output.k(serialDesc, 5) && self.buttonDeny == null) {
                return;
            }
            output.w(serialDesc, 5, v2.f53598a, self.buttonDeny);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsCountryDataProtected() {
            return this.isCountryDataProtected;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConsentTitle() {
            return this.consentTitle;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getConsentMessage() {
            return this.consentMessage;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getButtonAccept() {
            return this.buttonAccept;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getButtonDeny() {
            return this.buttonDeny;
        }

        public final GDPRSettings copy(Boolean isCountryDataProtected, String consentTitle, String consentMessage, String consentMessageVersion, String buttonAccept, String buttonDeny) {
            return new GDPRSettings(isCountryDataProtected, consentTitle, consentMessage, consentMessageVersion, buttonAccept, buttonDeny);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GDPRSettings)) {
                return false;
            }
            GDPRSettings gDPRSettings = (GDPRSettings) other;
            return s.c(this.isCountryDataProtected, gDPRSettings.isCountryDataProtected) && s.c(this.consentTitle, gDPRSettings.consentTitle) && s.c(this.consentMessage, gDPRSettings.consentMessage) && s.c(this.consentMessageVersion, gDPRSettings.consentMessageVersion) && s.c(this.buttonAccept, gDPRSettings.buttonAccept) && s.c(this.buttonDeny, gDPRSettings.buttonDeny);
        }

        public final String getButtonAccept() {
            return this.buttonAccept;
        }

        public final String getButtonDeny() {
            return this.buttonDeny;
        }

        public final String getConsentMessage() {
            return this.consentMessage;
        }

        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        public final String getConsentTitle() {
            return this.consentTitle;
        }

        public int hashCode() {
            Boolean bool = this.isCountryDataProtected;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.consentTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.consentMessage;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.consentMessageVersion;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.buttonAccept;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.buttonDeny;
            return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        }

        public final Boolean isCountryDataProtected() {
            return this.isCountryDataProtected;
        }

        public String toString() {
            return "GDPRSettings(isCountryDataProtected=" + this.isCountryDataProtected + ", consentTitle=" + this.consentTitle + ", consentMessage=" + this.consentMessage + ", consentMessageVersion=" + this.consentMessageVersion + ", buttonAccept=" + this.buttonAccept + ", buttonDeny=" + this.buttonDeny + ')';
        }

        public /* synthetic */ GDPRSettings(int i10, Boolean bool, String str, String str2, String str3, String str4, String str5, q2 q2Var) {
            if ((i10 & 1) == 0) {
                this.isCountryDataProtected = null;
            } else {
                this.isCountryDataProtected = bool;
            }
            if ((i10 & 2) == 0) {
                this.consentTitle = null;
            } else {
                this.consentTitle = str;
            }
            if ((i10 & 4) == 0) {
                this.consentMessage = null;
            } else {
                this.consentMessage = str2;
            }
            if ((i10 & 8) == 0) {
                this.consentMessageVersion = null;
            } else {
                this.consentMessageVersion = str3;
            }
            if ((i10 & 16) == 0) {
                this.buttonAccept = null;
            } else {
                this.buttonAccept = str4;
            }
            if ((i10 & 32) == 0) {
                this.buttonDeny = null;
            } else {
                this.buttonDeny = str5;
            }
        }

        public GDPRSettings(Boolean bool, String str, String str2, String str3, String str4, String str5) {
            this.isCountryDataProtected = bool;
            this.consentTitle = str;
            this.consentMessage = str2;
            this.consentMessageVersion = str3;
            this.buttonAccept = str4;
            this.buttonDeny = str5;
        }

        public /* synthetic */ GDPRSettings(Boolean bool, String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5);
        }

        public static /* synthetic */ void getButtonAccept$annotations() {
        }

        public static /* synthetic */ void getButtonDeny$annotations() {
        }

        public static /* synthetic */ void getConsentMessage$annotations() {
        }

        public static /* synthetic */ void getConsentMessageVersion$annotations() {
        }

        public static /* synthetic */ void getConsentTitle$annotations() {
        }

        public static /* synthetic */ void isCountryDataProtected$annotations() {
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$h, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003$%&B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rHÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0013¨\u0006'"}, d2 = {"Lcom/vungle/ads/internal/model/g$h;", "", "", "tcfStatus", "<init>", "(Ljava/lang/Integer;)V", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/g$h;Lsm/d;Lrm/f;)V", "component1", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/g$h;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getTcfStatus", "getTcfStatus$annotations", "()V", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class IABSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Integer tcfStatus;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$h$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.ConfigPayload.IABSettings", aVar, 1);
                g2Var.p("tcf_status", true);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                return new pm.d[]{qm.a.t(u0.f53588a)};
            }

            @Override // pm.c
            public IABSettings deserialize(sm.e decoder) {
                Object objE;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                int i10 = 1;
                q2 q2Var = null;
                if (cVarB.l()) {
                    objE = cVarB.e(descriptor2, 0, u0.f53588a, null);
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
                            objE = cVarB.e(descriptor2, 0, u0.f53588a, objE);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarB.d(descriptor2);
                return new IABSettings(i10, (Integer) objE, q2Var);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, IABSettings value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                IABSettings.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$h$b, reason: from kotlin metadata */
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

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$h$c */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public enum c {
            ALLOW_ID(0),
            DISABLE_ID(1),
            LEGACY(2);

            public static final a Companion = new a(null);
            private static final Map<Integer, c> rawValueMap;
            private final int rawValue;

            /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$h$c$a */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final c fromRawValue(Integer num) {
                    return (c) c.rawValueMap.get(num);
                }

                private a() {
                }
            }

            static {
                c[] cVarArrValues = values();
                LinkedHashMap linkedHashMap = new LinkedHashMap(yl.g.d(gl.l0.e(cVarArrValues.length), 16));
                for (c cVar : cVarArrValues) {
                    linkedHashMap.put(Integer.valueOf(cVar.rawValue), cVar);
                }
                rawValueMap = linkedHashMap;
            }

            c(int i10) {
                this.rawValue = i10;
            }

            public final int getRawValue() {
                return this.rawValue;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public IABSettings() {
            this((Integer) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ IABSettings copy$default(IABSettings iABSettings, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = iABSettings.tcfStatus;
            }
            return iABSettings.copy(num);
        }

        public static final void write$Self(IABSettings self, sm.d output, rm.f serialDesc) {
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            if (!output.k(serialDesc, 0) && self.tcfStatus == null) {
                return;
            }
            output.w(serialDesc, 0, u0.f53588a, self.tcfStatus);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getTcfStatus() {
            return this.tcfStatus;
        }

        public final IABSettings copy(Integer tcfStatus) {
            return new IABSettings(tcfStatus);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IABSettings) && s.c(this.tcfStatus, ((IABSettings) other).tcfStatus);
        }

        public final Integer getTcfStatus() {
            return this.tcfStatus;
        }

        public int hashCode() {
            Integer num = this.tcfStatus;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public String toString() {
            return "IABSettings(tcfStatus=" + this.tcfStatus + ')';
        }

        public /* synthetic */ IABSettings(int i10, Integer num, q2 q2Var) {
            if ((i10 & 1) == 0) {
                this.tcfStatus = null;
            } else {
                this.tcfStatus = num;
            }
        }

        public IABSettings(Integer num) {
            this.tcfStatus = num;
        }

        public /* synthetic */ IABSettings(Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : num);
        }

        public static /* synthetic */ void getTcfStatus$annotations() {
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$i, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0015R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u0017¨\u0006,"}, d2 = {"Lcom/vungle/ads/internal/model/g$i;", "", "", "errorLogLevel", "", "metricsEnabled", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;)V", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Boolean;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/g$i;Lsm/d;Lrm/f;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/g$i;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getErrorLogLevel", "getErrorLogLevel$annotations", "()V", "Ljava/lang/Boolean;", "getMetricsEnabled", "getMetricsEnabled$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class LogMetricsSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Integer errorLogLevel;
        private final Boolean metricsEnabled;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$i$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.ConfigPayload.LogMetricsSettings", aVar, 2);
                g2Var.p("error_log_level", true);
                g2Var.p("metrics_is_enabled", true);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                return new pm.d[]{qm.a.t(u0.f53588a), qm.a.t(tm.i.f53507a)};
            }

            @Override // pm.c
            public LogMetricsSettings deserialize(sm.e decoder) {
                Object objE;
                Object objE2;
                int i10;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                q2 q2Var = null;
                if (cVarB.l()) {
                    objE = cVarB.e(descriptor2, 0, u0.f53588a, null);
                    objE2 = cVarB.e(descriptor2, 1, tm.i.f53507a, null);
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
                            objE = cVarB.e(descriptor2, 0, u0.f53588a, objE);
                            i11 |= 1;
                        } else {
                            if (iO != 1) {
                                throw new UnknownFieldException(iO);
                            }
                            objE3 = cVarB.e(descriptor2, 1, tm.i.f53507a, objE3);
                            i11 |= 2;
                        }
                    }
                    objE2 = objE3;
                    i10 = i11;
                }
                cVarB.d(descriptor2);
                return new LogMetricsSettings(i10, (Integer) objE, (Boolean) objE2, q2Var);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, LogMetricsSettings value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                LogMetricsSettings.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$i$b, reason: from kotlin metadata */
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
        public LogMetricsSettings() {
            this((Integer) null, (Boolean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ LogMetricsSettings copy$default(LogMetricsSettings logMetricsSettings, Integer num, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = logMetricsSettings.errorLogLevel;
            }
            if ((i10 & 2) != 0) {
                bool = logMetricsSettings.metricsEnabled;
            }
            return logMetricsSettings.copy(num, bool);
        }

        public static final void write$Self(LogMetricsSettings self, sm.d output, rm.f serialDesc) {
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            if (output.k(serialDesc, 0) || self.errorLogLevel != null) {
                output.w(serialDesc, 0, u0.f53588a, self.errorLogLevel);
            }
            if (!output.k(serialDesc, 1) && self.metricsEnabled == null) {
                return;
            }
            output.w(serialDesc, 1, tm.i.f53507a, self.metricsEnabled);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getErrorLogLevel() {
            return this.errorLogLevel;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getMetricsEnabled() {
            return this.metricsEnabled;
        }

        public final LogMetricsSettings copy(Integer errorLogLevel, Boolean metricsEnabled) {
            return new LogMetricsSettings(errorLogLevel, metricsEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LogMetricsSettings)) {
                return false;
            }
            LogMetricsSettings logMetricsSettings = (LogMetricsSettings) other;
            return s.c(this.errorLogLevel, logMetricsSettings.errorLogLevel) && s.c(this.metricsEnabled, logMetricsSettings.metricsEnabled);
        }

        public final Integer getErrorLogLevel() {
            return this.errorLogLevel;
        }

        public final Boolean getMetricsEnabled() {
            return this.metricsEnabled;
        }

        public int hashCode() {
            Integer num = this.errorLogLevel;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Boolean bool = this.metricsEnabled;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "LogMetricsSettings(errorLogLevel=" + this.errorLogLevel + ", metricsEnabled=" + this.metricsEnabled + ')';
        }

        public /* synthetic */ LogMetricsSettings(int i10, Integer num, Boolean bool, q2 q2Var) {
            if ((i10 & 1) == 0) {
                this.errorLogLevel = null;
            } else {
                this.errorLogLevel = num;
            }
            if ((i10 & 2) == 0) {
                this.metricsEnabled = null;
            } else {
                this.metricsEnabled = bool;
            }
        }

        public LogMetricsSettings(Integer num, Boolean bool) {
            this.errorLogLevel = num;
            this.metricsEnabled = bool;
        }

        public /* synthetic */ LogMetricsSettings(Integer num, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : bool);
        }

        public static /* synthetic */ void getErrorLogLevel$annotations() {
        }

        public static /* synthetic */ void getMetricsEnabled$annotations() {
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$j, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u0018¨\u0006."}, d2 = {"Lcom/vungle/ads/internal/model/g$j;", "", "Lcom/vungle/ads/internal/model/g$g;", InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, "Lcom/vungle/ads/internal/model/g$h;", "iab", "<init>", "(Lcom/vungle/ads/internal/model/g$g;Lcom/vungle/ads/internal/model/g$h;)V", "", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/model/g$g;Lcom/vungle/ads/internal/model/g$h;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/g$j;Lsm/d;Lrm/f;)V", "component1", "()Lcom/vungle/ads/internal/model/g$g;", "component2", "()Lcom/vungle/ads/internal/model/g$h;", "copy", "(Lcom/vungle/ads/internal/model/g$g;Lcom/vungle/ads/internal/model/g$h;)Lcom/vungle/ads/internal/model/g$j;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/vungle/ads/internal/model/g$g;", "getGdpr", "getGdpr$annotations", "()V", "Lcom/vungle/ads/internal/model/g$h;", "getIab", "getIab$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class UserPrivacy {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final GDPRSettings gdpr;
        private final IABSettings iab;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$j$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.ConfigPayload.UserPrivacy", aVar, 2);
                g2Var.p(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, true);
                g2Var.p("iab", true);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                return new pm.d[]{qm.a.t(GDPRSettings.a.INSTANCE), qm.a.t(IABSettings.a.INSTANCE)};
            }

            @Override // pm.c
            public UserPrivacy deserialize(sm.e decoder) {
                Object objE;
                Object objE2;
                int i10;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                q2 q2Var = null;
                if (cVarB.l()) {
                    objE = cVarB.e(descriptor2, 0, GDPRSettings.a.INSTANCE, null);
                    objE2 = cVarB.e(descriptor2, 1, IABSettings.a.INSTANCE, null);
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
                            objE = cVarB.e(descriptor2, 0, GDPRSettings.a.INSTANCE, objE);
                            i11 |= 1;
                        } else {
                            if (iO != 1) {
                                throw new UnknownFieldException(iO);
                            }
                            objE3 = cVarB.e(descriptor2, 1, IABSettings.a.INSTANCE, objE3);
                            i11 |= 2;
                        }
                    }
                    objE2 = objE3;
                    i10 = i11;
                }
                cVarB.d(descriptor2);
                return new UserPrivacy(i10, (GDPRSettings) objE, (IABSettings) objE2, q2Var);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, UserPrivacy value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                UserPrivacy.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.g$j$b, reason: from kotlin metadata */
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
        public UserPrivacy() {
            this((GDPRSettings) null, (IABSettings) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ UserPrivacy copy$default(UserPrivacy userPrivacy, GDPRSettings gDPRSettings, IABSettings iABSettings, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                gDPRSettings = userPrivacy.gdpr;
            }
            if ((i10 & 2) != 0) {
                iABSettings = userPrivacy.iab;
            }
            return userPrivacy.copy(gDPRSettings, iABSettings);
        }

        public static final void write$Self(UserPrivacy self, sm.d output, rm.f serialDesc) {
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            if (output.k(serialDesc, 0) || self.gdpr != null) {
                output.w(serialDesc, 0, GDPRSettings.a.INSTANCE, self.gdpr);
            }
            if (!output.k(serialDesc, 1) && self.iab == null) {
                return;
            }
            output.w(serialDesc, 1, IABSettings.a.INSTANCE, self.iab);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final GDPRSettings getGdpr() {
            return this.gdpr;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final IABSettings getIab() {
            return this.iab;
        }

        public final UserPrivacy copy(GDPRSettings gdpr, IABSettings iab) {
            return new UserPrivacy(gdpr, iab);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserPrivacy)) {
                return false;
            }
            UserPrivacy userPrivacy = (UserPrivacy) other;
            return s.c(this.gdpr, userPrivacy.gdpr) && s.c(this.iab, userPrivacy.iab);
        }

        public final GDPRSettings getGdpr() {
            return this.gdpr;
        }

        public final IABSettings getIab() {
            return this.iab;
        }

        public int hashCode() {
            GDPRSettings gDPRSettings = this.gdpr;
            int iHashCode = (gDPRSettings == null ? 0 : gDPRSettings.hashCode()) * 31;
            IABSettings iABSettings = this.iab;
            return iHashCode + (iABSettings != null ? iABSettings.hashCode() : 0);
        }

        public String toString() {
            return "UserPrivacy(gdpr=" + this.gdpr + ", iab=" + this.iab + ')';
        }

        public /* synthetic */ UserPrivacy(int i10, GDPRSettings gDPRSettings, IABSettings iABSettings, q2 q2Var) {
            if ((i10 & 1) == 0) {
                this.gdpr = null;
            } else {
                this.gdpr = gDPRSettings;
            }
            if ((i10 & 2) == 0) {
                this.iab = null;
            } else {
                this.iab = iABSettings;
            }
        }

        public UserPrivacy(GDPRSettings gDPRSettings, IABSettings iABSettings) {
            this.gdpr = gDPRSettings;
            this.iab = iABSettings;
        }

        public /* synthetic */ UserPrivacy(GDPRSettings gDPRSettings, IABSettings iABSettings, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : gDPRSettings, (i10 & 2) != 0 ? null : iABSettings);
        }

        public static /* synthetic */ void getGdpr$annotations() {
        }

        public static /* synthetic */ void getIab$annotations() {
        }
    }

    public g() {
        this((CleverCache) null, (ConfigSettings) null, (Endpoints) null, (LogMetricsSettings) null, (List) null, (UserPrivacy) null, (String) null, (Boolean) null, (Boolean) null, (Integer) null, (Boolean) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (AutoRedirect) null, (Boolean) null, 262143, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ g copy$default(g gVar, CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List list, UserPrivacy userPrivacy, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l10, AutoRedirect autoRedirect, Boolean bool7, int i10, Object obj) {
        Boolean bool8;
        AutoRedirect autoRedirect2;
        CleverCache cleverCache2 = (i10 & 1) != 0 ? gVar.cleverCache : cleverCache;
        ConfigSettings configSettings2 = (i10 & 2) != 0 ? gVar.configSettings : configSettings;
        Endpoints endpoints2 = (i10 & 4) != 0 ? gVar.endpoints : endpoints;
        LogMetricsSettings logMetricsSettings2 = (i10 & 8) != 0 ? gVar.logMetricsSettings : logMetricsSettings;
        List list2 = (i10 & 16) != 0 ? gVar.placements : list;
        UserPrivacy userPrivacy2 = (i10 & 32) != 0 ? gVar.userPrivacy : userPrivacy;
        String str2 = (i10 & 64) != 0 ? gVar.configExtension : str;
        Boolean bool9 = (i10 & 128) != 0 ? gVar.disableAdId : bool;
        Boolean bool10 = (i10 & 256) != 0 ? gVar.isReportIncentivizedEnabled : bool2;
        Integer num3 = (i10 & 512) != 0 ? gVar.sessionTimeout : num;
        Boolean bool11 = (i10 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? gVar.waitForConnectivityForTPAT : bool3;
        Integer num4 = (i10 & 2048) != 0 ? gVar.signalSessionTimeout : num2;
        Boolean bool12 = (i10 & 4096) != 0 ? gVar.signalsDisabled : bool4;
        Boolean bool13 = (i10 & 8192) != 0 ? gVar.fpdEnabled : bool5;
        CleverCache cleverCache3 = cleverCache2;
        Boolean bool14 = (i10 & 16384) != 0 ? gVar.rtaDebugging : bool6;
        Long l11 = (i10 & 32768) != 0 ? gVar.configLastValidatedTimestamp : l10;
        AutoRedirect autoRedirect3 = (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? gVar.autoRedirect : autoRedirect;
        if ((i10 & 131072) != 0) {
            autoRedirect2 = autoRedirect3;
            bool8 = gVar.enableOT;
        } else {
            bool8 = bool7;
            autoRedirect2 = autoRedirect3;
        }
        return gVar.copy(cleverCache3, configSettings2, endpoints2, logMetricsSettings2, list2, userPrivacy2, str2, bool9, bool10, num3, bool11, num4, bool12, bool13, bool14, l11, autoRedirect2, bool8);
    }

    public static /* synthetic */ void getAutoRedirect$annotations() {
    }

    public static /* synthetic */ void getCleverCache$annotations() {
    }

    public static /* synthetic */ void getConfigExtension$annotations() {
    }

    public static /* synthetic */ void getConfigLastValidatedTimestamp$annotations() {
    }

    public static /* synthetic */ void getConfigSettings$annotations() {
    }

    public static /* synthetic */ void getDisableAdId$annotations() {
    }

    public static /* synthetic */ void getEnableOT$annotations() {
    }

    public static /* synthetic */ void getEndpoints$annotations() {
    }

    public static /* synthetic */ void getFpdEnabled$annotations() {
    }

    public static /* synthetic */ void getLogMetricsSettings$annotations() {
    }

    public static /* synthetic */ void getPlacements$annotations() {
    }

    public static /* synthetic */ void getRtaDebugging$annotations() {
    }

    public static /* synthetic */ void getSessionTimeout$annotations() {
    }

    public static /* synthetic */ void getSignalSessionTimeout$annotations() {
    }

    public static /* synthetic */ void getSignalsDisabled$annotations() {
    }

    public static /* synthetic */ void getUserPrivacy$annotations() {
    }

    public static /* synthetic */ void getWaitForConnectivityForTPAT$annotations() {
    }

    public static /* synthetic */ void isReportIncentivizedEnabled$annotations() {
    }

    public static final void write$Self(g self, sm.d output, rm.f serialDesc) {
        s.h(self, "self");
        s.h(output, "output");
        s.h(serialDesc, "serialDesc");
        if (output.k(serialDesc, 0) || self.cleverCache != null) {
            output.w(serialDesc, 0, CleverCache.a.INSTANCE, self.cleverCache);
        }
        if (output.k(serialDesc, 1) || self.configSettings != null) {
            output.w(serialDesc, 1, ConfigSettings.a.INSTANCE, self.configSettings);
        }
        if (output.k(serialDesc, 2) || self.endpoints != null) {
            output.w(serialDesc, 2, Endpoints.a.INSTANCE, self.endpoints);
        }
        if (output.k(serialDesc, 3) || self.logMetricsSettings != null) {
            output.w(serialDesc, 3, LogMetricsSettings.a.INSTANCE, self.logMetricsSettings);
        }
        if (output.k(serialDesc, 4) || self.placements != null) {
            output.w(serialDesc, 4, new tm.f(Placement.a.INSTANCE), self.placements);
        }
        if (output.k(serialDesc, 5) || self.userPrivacy != null) {
            output.w(serialDesc, 5, UserPrivacy.a.INSTANCE, self.userPrivacy);
        }
        if (output.k(serialDesc, 6) || self.configExtension != null) {
            output.w(serialDesc, 6, v2.f53598a, self.configExtension);
        }
        if (output.k(serialDesc, 7) || !s.c(self.disableAdId, Boolean.TRUE)) {
            output.w(serialDesc, 7, tm.i.f53507a, self.disableAdId);
        }
        if (output.k(serialDesc, 8) || self.isReportIncentivizedEnabled != null) {
            output.w(serialDesc, 8, tm.i.f53507a, self.isReportIncentivizedEnabled);
        }
        if (output.k(serialDesc, 9) || self.sessionTimeout != null) {
            output.w(serialDesc, 9, u0.f53588a, self.sessionTimeout);
        }
        if (output.k(serialDesc, 10) || self.waitForConnectivityForTPAT != null) {
            output.w(serialDesc, 10, tm.i.f53507a, self.waitForConnectivityForTPAT);
        }
        if (output.k(serialDesc, 11) || self.signalSessionTimeout != null) {
            output.w(serialDesc, 11, u0.f53588a, self.signalSessionTimeout);
        }
        if (output.k(serialDesc, 12) || self.signalsDisabled != null) {
            output.w(serialDesc, 12, tm.i.f53507a, self.signalsDisabled);
        }
        if (output.k(serialDesc, 13) || self.fpdEnabled != null) {
            output.w(serialDesc, 13, tm.i.f53507a, self.fpdEnabled);
        }
        if (output.k(serialDesc, 14) || self.rtaDebugging != null) {
            output.w(serialDesc, 14, tm.i.f53507a, self.rtaDebugging);
        }
        if (output.k(serialDesc, 15) || self.configLastValidatedTimestamp != null) {
            output.w(serialDesc, 15, f1.f53474a, self.configLastValidatedTimestamp);
        }
        if (output.k(serialDesc, 16) || self.autoRedirect != null) {
            output.w(serialDesc, 16, AutoRedirect.a.INSTANCE, self.autoRedirect);
        }
        if (!output.k(serialDesc, 17) && self.enableOT == null) {
            return;
        }
        output.w(serialDesc, 17, tm.i.f53507a, self.enableOT);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CleverCache getCleverCache() {
        return this.cleverCache;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getWaitForConnectivityForTPAT() {
        return this.waitForConnectivityForTPAT;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getSignalSessionTimeout() {
        return this.signalSessionTimeout;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getSignalsDisabled() {
        return this.signalsDisabled;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getFpdEnabled() {
        return this.fpdEnabled;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getRtaDebugging() {
        return this.rtaDebugging;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Long getConfigLastValidatedTimestamp() {
        return this.configLastValidatedTimestamp;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final AutoRedirect getAutoRedirect() {
        return this.autoRedirect;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getEnableOT() {
        return this.enableOT;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConfigSettings getConfigSettings() {
        return this.configSettings;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Endpoints getEndpoints() {
        return this.endpoints;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LogMetricsSettings getLogMetricsSettings() {
        return this.logMetricsSettings;
    }

    public final List<Placement> component5() {
        return this.placements;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final UserPrivacy getUserPrivacy() {
        return this.userPrivacy;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getConfigExtension() {
        return this.configExtension;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getDisableAdId() {
        return this.disableAdId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsReportIncentivizedEnabled() {
        return this.isReportIncentivizedEnabled;
    }

    public final g copy(CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List<Placement> placements, UserPrivacy userPrivacy, String configExtension, Boolean disableAdId, Boolean isReportIncentivizedEnabled, Integer sessionTimeout, Boolean waitForConnectivityForTPAT, Integer signalSessionTimeout, Boolean signalsDisabled, Boolean fpdEnabled, Boolean rtaDebugging, Long configLastValidatedTimestamp, AutoRedirect autoRedirect, Boolean enableOT) {
        return new g(cleverCache, configSettings, endpoints, logMetricsSettings, placements, userPrivacy, configExtension, disableAdId, isReportIncentivizedEnabled, sessionTimeout, waitForConnectivityForTPAT, signalSessionTimeout, signalsDisabled, fpdEnabled, rtaDebugging, configLastValidatedTimestamp, autoRedirect, enableOT);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return s.c(this.cleverCache, gVar.cleverCache) && s.c(this.configSettings, gVar.configSettings) && s.c(this.endpoints, gVar.endpoints) && s.c(this.logMetricsSettings, gVar.logMetricsSettings) && s.c(this.placements, gVar.placements) && s.c(this.userPrivacy, gVar.userPrivacy) && s.c(this.configExtension, gVar.configExtension) && s.c(this.disableAdId, gVar.disableAdId) && s.c(this.isReportIncentivizedEnabled, gVar.isReportIncentivizedEnabled) && s.c(this.sessionTimeout, gVar.sessionTimeout) && s.c(this.waitForConnectivityForTPAT, gVar.waitForConnectivityForTPAT) && s.c(this.signalSessionTimeout, gVar.signalSessionTimeout) && s.c(this.signalsDisabled, gVar.signalsDisabled) && s.c(this.fpdEnabled, gVar.fpdEnabled) && s.c(this.rtaDebugging, gVar.rtaDebugging) && s.c(this.configLastValidatedTimestamp, gVar.configLastValidatedTimestamp) && s.c(this.autoRedirect, gVar.autoRedirect) && s.c(this.enableOT, gVar.enableOT);
    }

    public final AutoRedirect getAutoRedirect() {
        return this.autoRedirect;
    }

    public final CleverCache getCleverCache() {
        return this.cleverCache;
    }

    public final String getConfigExtension() {
        return this.configExtension;
    }

    public final Long getConfigLastValidatedTimestamp() {
        return this.configLastValidatedTimestamp;
    }

    public final ConfigSettings getConfigSettings() {
        return this.configSettings;
    }

    public final Boolean getDisableAdId() {
        return this.disableAdId;
    }

    public final Boolean getEnableOT() {
        return this.enableOT;
    }

    public final Endpoints getEndpoints() {
        return this.endpoints;
    }

    public final Boolean getFpdEnabled() {
        return this.fpdEnabled;
    }

    public final LogMetricsSettings getLogMetricsSettings() {
        return this.logMetricsSettings;
    }

    public final List<Placement> getPlacements() {
        return this.placements;
    }

    public final Boolean getRtaDebugging() {
        return this.rtaDebugging;
    }

    public final Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public final Integer getSignalSessionTimeout() {
        return this.signalSessionTimeout;
    }

    public final Boolean getSignalsDisabled() {
        return this.signalsDisabled;
    }

    public final UserPrivacy getUserPrivacy() {
        return this.userPrivacy;
    }

    public final Boolean getWaitForConnectivityForTPAT() {
        return this.waitForConnectivityForTPAT;
    }

    public int hashCode() {
        CleverCache cleverCache = this.cleverCache;
        int iHashCode = (cleverCache == null ? 0 : cleverCache.hashCode()) * 31;
        ConfigSettings configSettings = this.configSettings;
        int iHashCode2 = (iHashCode + (configSettings == null ? 0 : configSettings.hashCode())) * 31;
        Endpoints endpoints = this.endpoints;
        int iHashCode3 = (iHashCode2 + (endpoints == null ? 0 : endpoints.hashCode())) * 31;
        LogMetricsSettings logMetricsSettings = this.logMetricsSettings;
        int iHashCode4 = (iHashCode3 + (logMetricsSettings == null ? 0 : logMetricsSettings.hashCode())) * 31;
        List<Placement> list = this.placements;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        UserPrivacy userPrivacy = this.userPrivacy;
        int iHashCode6 = (iHashCode5 + (userPrivacy == null ? 0 : userPrivacy.hashCode())) * 31;
        String str = this.configExtension;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.disableAdId;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isReportIncentivizedEnabled;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.sessionTimeout;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.waitForConnectivityForTPAT;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.signalSessionTimeout;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.signalsDisabled;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.fpdEnabled;
        int iHashCode14 = (iHashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.rtaDebugging;
        int iHashCode15 = (iHashCode14 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Long l10 = this.configLastValidatedTimestamp;
        int iHashCode16 = (iHashCode15 + (l10 == null ? 0 : l10.hashCode())) * 31;
        AutoRedirect autoRedirect = this.autoRedirect;
        int iHashCode17 = (iHashCode16 + (autoRedirect == null ? 0 : autoRedirect.hashCode())) * 31;
        Boolean bool7 = this.enableOT;
        return iHashCode17 + (bool7 != null ? bool7.hashCode() : 0);
    }

    public final Boolean isReportIncentivizedEnabled() {
        return this.isReportIncentivizedEnabled;
    }

    public final void setAutoRedirect(AutoRedirect autoRedirect) {
        this.autoRedirect = autoRedirect;
    }

    public final void setConfigLastValidatedTimestamp(Long l10) {
        this.configLastValidatedTimestamp = l10;
    }

    public final void setEnableOT(Boolean bool) {
        this.enableOT = bool;
    }

    public /* synthetic */ g(int i10, CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List list, UserPrivacy userPrivacy, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l10, AutoRedirect autoRedirect, Boolean bool7, q2 q2Var) {
        if ((i10 & 1) == 0) {
            this.cleverCache = null;
        } else {
            this.cleverCache = cleverCache;
        }
        if ((i10 & 2) == 0) {
            this.configSettings = null;
        } else {
            this.configSettings = configSettings;
        }
        if ((i10 & 4) == 0) {
            this.endpoints = null;
        } else {
            this.endpoints = endpoints;
        }
        if ((i10 & 8) == 0) {
            this.logMetricsSettings = null;
        } else {
            this.logMetricsSettings = logMetricsSettings;
        }
        if ((i10 & 16) == 0) {
            this.placements = null;
        } else {
            this.placements = list;
        }
        if ((i10 & 32) == 0) {
            this.userPrivacy = null;
        } else {
            this.userPrivacy = userPrivacy;
        }
        if ((i10 & 64) == 0) {
            this.configExtension = null;
        } else {
            this.configExtension = str;
        }
        if ((i10 & 128) == 0) {
            this.disableAdId = Boolean.TRUE;
        } else {
            this.disableAdId = bool;
        }
        if ((i10 & 256) == 0) {
            this.isReportIncentivizedEnabled = null;
        } else {
            this.isReportIncentivizedEnabled = bool2;
        }
        if ((i10 & 512) == 0) {
            this.sessionTimeout = null;
        } else {
            this.sessionTimeout = num;
        }
        if ((i10 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
            this.waitForConnectivityForTPAT = null;
        } else {
            this.waitForConnectivityForTPAT = bool3;
        }
        if ((i10 & 2048) == 0) {
            this.signalSessionTimeout = null;
        } else {
            this.signalSessionTimeout = num2;
        }
        if ((i10 & 4096) == 0) {
            this.signalsDisabled = null;
        } else {
            this.signalsDisabled = bool4;
        }
        if ((i10 & 8192) == 0) {
            this.fpdEnabled = null;
        } else {
            this.fpdEnabled = bool5;
        }
        if ((i10 & 16384) == 0) {
            this.rtaDebugging = null;
        } else {
            this.rtaDebugging = bool6;
        }
        if ((32768 & i10) == 0) {
            this.configLastValidatedTimestamp = null;
        } else {
            this.configLastValidatedTimestamp = l10;
        }
        if ((65536 & i10) == 0) {
            this.autoRedirect = null;
        } else {
            this.autoRedirect = autoRedirect;
        }
        if ((i10 & 131072) == 0) {
            this.enableOT = null;
        } else {
            this.enableOT = bool7;
        }
    }

    public String toString() {
        return "ConfigPayload(cleverCache=" + this.cleverCache + ", configSettings=" + this.configSettings + ", endpoints=" + this.endpoints + ", logMetricsSettings=" + this.logMetricsSettings + ", placements=" + this.placements + ", userPrivacy=" + this.userPrivacy + ", configExtension=" + this.configExtension + ", disableAdId=" + this.disableAdId + NhHRaDJCHtCTJR.ykYDYGOAn + this.isReportIncentivizedEnabled + ", sessionTimeout=" + this.sessionTimeout + ", waitForConnectivityForTPAT=" + this.waitForConnectivityForTPAT + ", signalSessionTimeout=" + this.signalSessionTimeout + ", signalsDisabled=" + this.signalsDisabled + ", fpdEnabled=" + this.fpdEnabled + ", rtaDebugging=" + this.rtaDebugging + ", configLastValidatedTimestamp=" + this.configLastValidatedTimestamp + ", autoRedirect=" + this.autoRedirect + ", enableOT=" + this.enableOT + ')';
    }

    public g(CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List<Placement> list, UserPrivacy userPrivacy, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l10, AutoRedirect autoRedirect, Boolean bool7) {
        this.cleverCache = cleverCache;
        this.configSettings = configSettings;
        this.endpoints = endpoints;
        this.logMetricsSettings = logMetricsSettings;
        this.placements = list;
        this.userPrivacy = userPrivacy;
        this.configExtension = str;
        this.disableAdId = bool;
        this.isReportIncentivizedEnabled = bool2;
        this.sessionTimeout = num;
        this.waitForConnectivityForTPAT = bool3;
        this.signalSessionTimeout = num2;
        this.signalsDisabled = bool4;
        this.fpdEnabled = bool5;
        this.rtaDebugging = bool6;
        this.configLastValidatedTimestamp = l10;
        this.autoRedirect = autoRedirect;
        this.enableOT = bool7;
    }

    public /* synthetic */ g(CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List list, UserPrivacy userPrivacy, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l10, AutoRedirect autoRedirect, Boolean bool7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : cleverCache, (i10 & 2) != 0 ? null : configSettings, (i10 & 4) != 0 ? null : endpoints, (i10 & 8) != 0 ? null : logMetricsSettings, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? null : userPrivacy, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? Boolean.TRUE : bool, (i10 & 256) != 0 ? null : bool2, (i10 & 512) != 0 ? null : num, (i10 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : bool3, (i10 & 2048) != 0 ? null : num2, (i10 & 4096) != 0 ? null : bool4, (i10 & 8192) != 0 ? null : bool5, (i10 & 16384) != 0 ? null : bool6, (i10 & 32768) != 0 ? null : l10, (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : autoRedirect, (i10 & 131072) != 0 ? null : bool7);
    }
}
